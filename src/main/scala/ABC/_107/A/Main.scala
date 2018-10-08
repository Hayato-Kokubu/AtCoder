//package ABC._107.A

import scala.io.StdIn

object Main {
	def main(args: Array[String]): Unit ={
		val argArray = StdIn.readLine.split(" ").map(_.toInt)
		val N = argArray(0)
		val i = argArray(1)

		println( N - i + 1)
	}
}
