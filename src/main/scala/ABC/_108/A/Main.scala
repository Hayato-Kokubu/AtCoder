package ABC._108.A

import scala.io.StdIn

object Main {
	def main(args: Array[String]): Unit ={
		val K = StdIn.readLine.toInt
		val result = (K /2) * (K - (K/2))
		println(result)
	}
}
