fun main(){
    val a =1
    val b = 2
    val c = 4
    printStars (a,b,c)
}
private fun printStars (a: Int,b: Int, c: Int){
    var stars = ""
    val sym = "*"
    var starCount = a
    for (i in 0..2*b){
        stars += "${sym.repeat(starCount)}\n"
        starCount= if(i<b) (starCount+c) else (starCount-c)
    }
    print (stars)
}