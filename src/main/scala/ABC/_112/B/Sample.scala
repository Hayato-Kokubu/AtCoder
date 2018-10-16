//package ABC._112.B

import scala.io.StdIn

object Sample {
	def main(args: Array[String]) ={
		val num = StdIn.readLine.split(" ").map(_.toInt)
		val N = num(0)
		val T = num(1)

		val emptySeq = Seq.empty[Int]
		val min = emptySeq.min
		// seq.emptyの場合に処理を変えたい

		println(min)
	}


}
