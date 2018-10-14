//package ABC._108.B

import scala.io.StdIn

object Main {
	def main(args: Array[String]): Unit ={
		val num = StdIn.readLine.split(" ").map(_.toInt)

		val x1 = num(0)
		val y1 = num(1)
		val x2 = num(2)
		val y2 = num(3)

		val dx = x2 - x1
		val dy = y2 - y1

		val x4 = x1 - dy
		val y4 = y1 - dx
		val x3 = x1 + dx
		val y3 = y1 + dy

		println(s"$x3 $y3 $x4 $y4")
		// string interpolation 時の{}必要・不要

	}


}
