//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
println("Hello Linet")
    dividenumber(6,2)
    addition(6,7,13,10)
    sentence("I enjoy reading articles adventuring around nature")

}
fun dividenumber(num1:Int, num2:Int):Int{
    var sum= num1/num2
    println(sum)
    return sum
}
fun addition(num4:Int, num5:Int, num6:Int, num7:Int) :Int{
    var sum = num4+num5+num6+num7
    println(sum)
    return sum

}
fun sentence(string: String) {
    println(string)
}