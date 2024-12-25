fun main(args: Array<String>) {
    dis1()
    println(dis2())
    dis3("Raja",19)
    dis3(age= 20,name= "Sandeep")
    dis3("Sai")

}
fun dis1(){
    println("This is a Function")
}
fun dis2():String{
    return "My name is Reddy"
}
fun dis3(name: String,age: Int = 18){
    println("My name is $name and I am $age years old")
}