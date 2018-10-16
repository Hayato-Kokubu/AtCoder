//package ABC._109.B

import scala.io.StdIn

object Main {
	def main(args: Array[String]): Unit ={
		val N = StdIn.readLine.toInt

		val wordList = (1 to N).foldLeft(Seq.empty[String]){ (list, num) =>
			val addStr = StdIn.readLine
			list :+ addStr
		}

		val distinctFlg = wordList.length == wordList.distinct.length
		lazy val result = wordList.foldLeft((true, wordList(0).head) ){ (tuple, str) =>
			( tuple._1 && tuple._2 == str.head, str.last )
		}
		println(if(distinctFlg && result._1 ) "Yes" else "No")
	}
}
