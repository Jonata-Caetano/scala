import scala.io.Source
import java.io.PrintWriter
import scala.util.Using



class TransformData {

  def readAndTransformData(): Unit = {

    val inputFile = "input.csv"
    val outputFile = "output.csv"

    Using.resource(Source.fromFile(inputFile)) { source => {
      val lines = source.getLines.toList

      val outputHeader = "Nome, País"

      val transformedData = lines.tail
        .map(_.split(","))
        .filter(fields => fields.length >= 4 && fields(1).toInt >= 18)
        .map(fields => s"${fields(0)}, ${fields(3)}")

      new PrintWriter(outputFile) {
        write(outputHeader + "\n")
        transformedData.foreach(line => write(line + "\n"))
        close()
      }
    }
      println("Data transformation completed")
    }

  }
}

