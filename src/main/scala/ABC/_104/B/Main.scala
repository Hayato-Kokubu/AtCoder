package ABC._104.B

import scala.io.StdIn

object Main {
	def main(args: Array[String]): Unit ={
		val S = StdIn.readLine

		val S_sub = S.substring(2, S.length - 1)
		val S_sub_WithoutC = S_sub.replace("C", "")

		val b1 = S.startsWith("A")
		val b2 = S.charAt(1).isLower
		val b3 = S_sub.contains("C") && S_sub_WithoutC.length == S_sub.length - 1
		val b4 = S_sub_WithoutC == S_sub_WithoutC.toLowerCase
		val b5 = S.charAt(S.length - 1).isLower

		val result = b1&& b2 && b3 && b4 && b5

		println(if(result) "AC" else "WA")
	}
}
