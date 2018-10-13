package ABC._111.A

import scala.io.StdIn

object Main {
	def main(args: Array[String]){
		val num = StdIn.readLine.toCharArray
		val hundred = num(0)
		val ten = num(1)
		val one = num(2)

		val result =   convert(hundred).toString + convert(ten).toString + convert(one).toString
		println(result)
	}

	def convert(charNum: Char): Char ={
		if(charNum == '9') '1' else '9'
	}

}
