import java.util.Scanner

object Main {
  val sc = new Scanner(System.in)
  def main (args: Array[String]): Unit={
    val s  = sc.next
    val ss = s.split("(?<=.)")

    val na = s.count(_ == "A")
    val nb = s.count(_ == "B")
    val nc = s.count(_ == "C")
    val nd = s.count(_ == "D")
    val ne = s.count(_ == "E")
    val nf = s.count(_ == "F")

    println(s"$na, $nb, $nc, $nd, $ne, $nf")
  }
}