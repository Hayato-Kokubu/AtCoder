//package ABC._112.B

import scala.io.StdIn

object ABC_112B {
	def main(args: Array[String]): Unit ={
		val num = StdIn.readLine.split(" ").map(_.toInt)
		val N = num(0)
		val T = num(1)

		val roots = (1 to N).foldLeft(Seq.empty[(Int, Int)]){ (seq, tuple) =>
			val num = StdIn.readLine.split(" ").map(_.toInt)
			val c = num(0)
			val t = num(1)
			seq :+ (c,t)
		}

		val rootsWithinT = roots.filter(_._2 <= T)
		val result = if (rootsWithinT.isEmpty) "TLE"
		             else rootsWithinT.map(_._1).min.toString

		println(result)
	}
}
