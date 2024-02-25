package resource

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport._
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.Directives._
import model.Product
import service.ProductService
import spray.json.DefaultJsonProtocol._

import scala.concurrent.ExecutionContext.Implicits.global
import scala.util._

object ProdectServer extends App {

  implicit val system = ActorSystem("ProductServer")
  val productService = new ProductService()

  implicit val productFormat = jsonFormat3(Product)

  val route = path("products" / "heartbeat") {
    get {
      complete("Success!")
    }
  } ~ path("products" / "test") {
    get {
      complete("Verified!")
    }
  } ~ path("products") {
    get {
      onComplete(productService.getAllProducts()) {
        case Success(res) => complete(res)
        case Failure(exception) => complete(StatusCodes.InternalServerError)
      }
    } ~ post {
      entity(as[Product]) { product =>
        onComplete(productService.savedProduct(product)) {
          case Success(res) => complete(res)
          case Failure(exception) => complete(StatusCodes.InternalServerError)
        }
      }
    }
  }

  val server = Http().newServerAt("localhost", 9090).bind(route)
  server.map { _ =>
    println("Successfully started on localhost:9090")
  } recover { case ex =>
    println("Failed to start the server due to: " + ex.getMessage)
  }

}
