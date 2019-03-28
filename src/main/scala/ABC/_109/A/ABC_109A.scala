package ABC._109.A

import scala.io.StdIn

object ABC_109A {
	def main(args: Array[String]): Unit ={
		val num = StdIn.readLine.split(" ").map(_.toInt)
		val A = num(0)
		val B = num(1)

		val result = if(A * B % 2 == 1) "Yes" else "No"
		println(result)
	}
}
