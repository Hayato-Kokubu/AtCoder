object Samples {
  /*
  * @param  n   : Int
  * @param  l   : l進数 (2 <= l <= 9)
  * @return     : List[Int]
  *               n のl進数表示
  *               n = 8  の場合は を使う
  *               n = 16 の場合は を使う
  * 例: l_adic(15,2) = List(1,1,1,1)
  *     l_adic(18,4) = List(1,0,2)
  * */
  def l_adic(n: Int, l: Int): List[Int] ={
    def loop(m: Int, acc: List[Int]): List[Int] ={
      m match {
        case 0 => acc
        case x => loop( x / l, (x % l) +: acc)
      }
    }
    loop(n,List.empty[Int])
  }
  // mkString

  // foldの逆 unfold なるメソッドがある
  // 1つの数値から、Listを作る

  /*
  * @param  a : Int a >= 1
  * @param  b : Int b >= 1
  *             a と b の大小関係は任意
  * @return   : Int
  *             a と b との最大公約数
  * gcm(12,18) = 6
  * gcm(4,9) = 1
  * */
  def gcd(a: Int, b: Int): Int ={
    (a,b) match{
      case (x,y) if y == 0 => x
      case (x,y) if x < y  => gcd(y, x)
      case (x,y)           => gcd(y, x % y)
    }
  }

  def comulativeSum(intVector: Vector[Int]): Vector[Int] ={
    intVector.foldLeft(Vector.empty[Int]){
      case (list, acc) =>
        if(list.isEmpty) Vector(acc)
        else list :+ (list.last + acc)
    }
  }

  def factorial(n: Int, mod: Int): Long ={ // 戻り値Int ではオーバーブローしてしまうので、Longで計算
    (1 to n).foldLeft(1L){(fact, k) =>
      fact * k % mod
    }
  }
}

// List(a,a,a,b,b,c, a,a) => List(List(a,a,a),List(b,b), List(c), List(a,a))
//