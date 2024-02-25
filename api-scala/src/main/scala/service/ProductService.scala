package service

import model.Product
import scala.concurrent.Future

class ProductService {

  val products: List[Product] = List(Product(1, "Samsung Galaxy", 500.50), Product(2, "Apple iPhone 13", 600.50), Product(3, "Motorola G84", 450.50))

  def getAllProducts(): Future[List[Product]] = Future.successful(products)

  def savedProduct(product: Product): Future[Product] = {
    Future.successful(product)
  }

}
