fun main(args: Array<String>) {
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("sumAll= ${sumAll(1,5,20)}")
    println("sumAll= ${sumAll()}")
    println("sumAll= ${sumAll(2,3,4,5,6,7)}")

    println(createOutputString("Alice"))
    println(createOutputString("Bob",23))
    println (createOutputString(isStudent = true,name="Carol",age = 19))
    println(createOutputString("Daniel",32,isStudent=null))
    //println ( multiplyBy(null,4))
    //println (multiplyBy(3,4))
}



fun sumAll (vararg numbers: Int)= if (numbers.size > 0){numbers.sum()} else {0}
fun createOutputString (name: String, age:Int = 18,isStudent :Boolean? = false)=
    "name $ name age $age isStudent $isStudent"
