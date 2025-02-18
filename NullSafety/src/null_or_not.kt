fun main() {
    var age: Int = 22
    println(age)

    var city: String? = "Kuwait City"
    println("City length: ${city?.length}")

    city = null

    println("City length: ${city?.length}")
}
