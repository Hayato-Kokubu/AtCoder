package ABC._112.A

import scala.io.StdIn

object Main {
	def main(args: Array[String]): Unit ={
		val N = StdIn.readLine.toInt
		val result =
			if(N == 1){ "Hello World"}
			else {
				val A = StdIn.readInt
				val B = StdIn.readInt
				(A + B).toString
		}
		println(result)
	}

}
