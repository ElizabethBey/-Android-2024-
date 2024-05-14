fun main() {
    val exampleMas = (IntArray(15) {(1 .. 10).random()})
    println(exampleMas.contentToString())
    val helper = mutableMapOf<Int, Int>()
    exampleMas.forEach{elem ->
        helper[elem] = 0
    }
    exampleMas.forEach{elem ->
        helper[elem] = helper.getOrDefault(elem, 0) + 1
    }
    helper.forEach{elem ->
        println("Элемент: ${elem.key}, количество вхождений: ${elem.value}")
    }
}