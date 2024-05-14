fun initArray(doubleElem : Int) : IntArray {
    val mass = (IntArray(100) {it + 1}) + doubleElem
    mass.shuffle()
    return mass
}

fun main() {
    val doubleElem = (1 .. 100).random()
    val exampleMas = initArray(doubleElem)

    val helperMas = BooleanArray(101) {false}
    for (elem in exampleMas)
        if (helperMas[elem - 1]) {
            println(if (elem == doubleElem) "Correct result, double elem $elem" else "Incorrect result")
            break
        } else
            helperMas[elem - 1] = true
}
