import java.util.Scanner

object Main {
  val sc = new Scanner(System.in)
  def main (args: Array[String]): Unit={
    val s  = sc.next
    val ss = s.split("(?<=.)")

    val resl = List("A", "B", "C", "D", "E", "F").map{c => ss.count(_ == c)}

    // 末尾のスペースが余分
    resl.foreach{res => print(s"$res")}
    println
  }
}