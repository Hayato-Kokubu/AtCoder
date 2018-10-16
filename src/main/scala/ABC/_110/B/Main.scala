//package ABC._110.B

import scala.io.StdIn

object Main {
	def main(args: Array[String])={
		val num = StdIn.readLine.split(" ").map(_.toInt)
		val N = num(0)
		val M = num(1)
		val X = num(2)
		val Y = num(3)

		val xSeq = StdIn.readLine.split(" ").map(_.toInt).toSeq
		val ySeq = StdIn.readLine.split(" ").map(_.toInt).toSeq

		val zRange = ( xSeq.max + 1 to  ySeq.min).intersect( X + 1 to Y )

		println(if(zRange.isEmpty) "War" else "No War" )
	}
}