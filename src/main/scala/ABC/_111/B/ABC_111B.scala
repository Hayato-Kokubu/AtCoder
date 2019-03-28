//package ABC._111.B

import scala.io.StdIn

object ABC_111B {
	def main(args: Array[String])={
		val N = StdIn.readInt

		println( ( ( N + 111  - 1 ) / 111 ) * 111)
	}

}
