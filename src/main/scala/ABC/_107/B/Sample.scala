//package ABC._107.B

object Sample {
	def main(args: Array[String]): Unit ={
		val seqSeq = Seq(Seq(1,1,0,0), Seq(1,0,1,0), Seq(1,0,0,1), Seq(1,0,0,0))

		// Seq[Seq[Int]] => Seq[INt]
		// 途中演算
		// Seq(1,1,0,0) * Seq(1,0,1,0) => Seq(1*1. 1*0, 0*1, 0*0)

		val result = seqSeq.foldLeft(Seq(1,1,1,1)) { (rs, seq) =>
			println(s"rs = ${rs}")
			println(s"seq = ${seq}")
			val temp = rs.zip(seq).map { tuple =>
				println(tuple)
				tuple._1 * tuple._2
			}
			println(s"temp = ${temp}")
			temp
		}
		println(result)
	}
}
