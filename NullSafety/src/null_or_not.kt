fun main() {
    var age: Int = 22
    println(age)

    var city: String? = "Kuwait City"
    println("City length: ${city?.length?:0}")

    city = null

    println("City length: ${city?.length?:0}")
}
