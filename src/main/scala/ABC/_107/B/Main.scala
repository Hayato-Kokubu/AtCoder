//package ABC._107.B

import scala.io.{Source, StdIn}

object Main {
	def main(args: Array[String]): Unit = {
		val num =  StdIn.readLine.split(" ").map(_.toInt)
		val H = num(0)
		val W = num(1)

//		val grid = Source.stdin.getLines()
		val grid = Source.stdin.mkString
		println(grid)
	}

}
