//package ABC._110.A

import scala.io.StdIn

object ABC_110A {
	def main(args: Array[String]): Unit = {
		val num = StdIn.readLine.split(" ").map(_.toInt).sortWith(_ > _)

		val result = num(0) * 10 + num(1) + num(2)
		println(result)
	}
}
