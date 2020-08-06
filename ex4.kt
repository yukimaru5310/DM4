import java.util.concurrent.ThreadLocalRandom

fun main(args: Array<String>) {
     var heads = 0
     var tails = 0
     //名前を聞くパート
     println("who are you?")
     val name = readLine()
     println("hello ${ name }!")

     println("Tossing coin...")

     for (i in 1..3) {
          val random: Int = ThreadLocalRandom.current().nextInt(0, 2)
          if(random == 1) {

               println("Round${i}: head")
               heads += 1
          }else{
               println("Round${i}: tail")
               tails += 1
          }
     }
     println("Heads: ${heads}, Tails: ${tails}")
     if(tails < heads) println("${name} won!")
     else println("${name} lose")
}
