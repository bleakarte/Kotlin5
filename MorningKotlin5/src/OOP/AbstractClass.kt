package OOP

fun main(args: Array<String>) {
    var teacher1 = Mwalimu("King",100)
    println(teacher1.name)
    teacher1.read()
}

abstract class Mwanafunzi(open var name:String, open var age: Int){
    abstract fun read()
    abstract fun write()
}

class Mwalimu(override var name: String, override var age: Int):Mwanafunzi(name,age){
    override fun read() {
        println("I am a teacher and i can read")
    }

    override fun write() {
        println("I am a teacher and i can write")
    }
}