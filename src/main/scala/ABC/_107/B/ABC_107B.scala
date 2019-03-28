//package ABC._107.B

import scala.io.StdIn

object ABC_107B {
	def main(args: Array[String]): Unit = {
		val num = StdIn.readLine.split(" ").map(_.toInt)
		val H = num(0)
		val W = num(1)

		val whiteLine = "....................................................................................................".substring(0, W)

		val gridRows = (1 to H).foldLeft(Seq.empty[String]) { (seq, n) =>
			seq :+ StdIn.readLine
		}

		val grsReducedRows = gridRows.filter(_ != whiteLine)
		// 数字を使ってないが、うまくかけるのか？

		val whiteColomns = grsReducedRows.foldLeft(whiteLine.toCharArray) { (res, str) =>
			res.zip(str.toCharArray).map { tuple =>
				if (tuple._1 == '.' && tuple._2 == '.') '.' else '#'
			}
		}

		grsReducedRows.foreach { str =>
			val resultRow = str.zip(whiteColomns).filter(_._2 == '#').map(_._1).foldLeft("")(_ + _)
			println(resultRow)
		}
	}
}
