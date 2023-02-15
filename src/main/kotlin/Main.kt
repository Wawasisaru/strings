
fun main() {
  name("Nancy",21)
    word("akirachix")
    text("Incredible")
    myname("Nancy")
    }

fun name(name: String, age: Int){
    val sentence = " Hi, my name is $name and I am $age years old."
    println(sentence)
}
fun word(name: String){
    println(name[1])
    println(name[3])
    println(name[4])
}
fun text(word: String){
    println(word.length)

}
fun myname(name: String){
    if(name == "Nancy"){
        println("that's me")
    }else{
        println("I don't know who that is")
    }
}