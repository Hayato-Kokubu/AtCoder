//package ABC._105.B

import scala.io.StdIn

object ABC_105B {
	def main(args: Array[String]): Unit ={
		val N = StdIn.readLine.toInt

		val result = (0 to N/7 ).exists{ n =>
			(N - 7 * n ) % 4 == 0
		}
		println( if (result) "Yes" else "No")
	}
}
