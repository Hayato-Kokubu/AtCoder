package ABC._105.A

object Main{
	def main(args: Array[String]): Unit = {

		val seq = Seq(1, 2, 3, 4, 5)
		val range = 1 to 9

		//　foreach
		// Seq[Int] => Unit
		/*
		seq.foreach{ num =>
			println(num)
		}
*/

		// fold (= foldLeft)
		// Seq[Int] => Int (和を求める)

		//		val sum = seq.foldLeft(0){ (result, num)  =>
		//			result + num
		//		}

		// 1 - 105 で、割り切れた回数を知る
		// 2 - sqrt(105)までで、割れた回数を記録
		//

		val N = 105
		var Nvar = N

		val inclusive = 2 to (Math.sqrt(N).toInt + 1)


//		val (result_i, NVal) = log(N)(Nvar)
//		(result_i, NVal)
//		ではエラー Nvalがみつからないと怒られる
//類似例: http://xawa99.blogspot.com/2012/09/Scala-MatchBasic.html

		val resultList = inclusive.map{ num =>
			val result_i = log(num)(Nvar)
			Nvar = Nvar / Math.pow(num.toDouble, result_i.toDouble).toInt
			result_i
		}

		val resultListFilterd = resultList.filter( _ > 0)

		val result = resultListFilterd.foldLeft(1){ (rs, num) =>
//			println((rs, num))
			rs * (num + 1)
		}

//Scala に置けるthis って何者？　self　もいたな

//		println(inclusive.toVector)
//		println(resultList)
//		println(resultListFilterd)
		println(result)



	}

//    IntelliJ からのオススメ　いい感じにかく
//		List(1, 2, 3).foldLeft(1){(x,y) => x * y}
//		List(1, 2, 3).fold(0)(_ + _)
//		List(1, 2, 3).reduce(_ + _)
//		List(1, 2, 3).reduceLeft(_ min _)
//		List(1, 2, 3).reduce((x, y) => math.max(x, y))
//		After:
//			List(1, 2, 3).product
//		List(1, 2, 3).sum
//		List(1, 2, 3).sum
//		List(1, 2, 3).min
//		List(1, 2, 3).max

	//foldと仲良くなる

	def log(base: Int)(trueVal: Int): Int = {
		var i = 0
		var trueVar = trueVal

		while( trueVar % base == 0 ) {
			i = i + 1
			trueVar = trueVar / base
		}
		i
	}
}