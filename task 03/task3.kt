abstract class Figure3D {
    abstract fun baseArea(): Double
    abstract fun volume(): Double
}

class Cylinder(val radius: Double, val height: Double) : Figure3D() {
    override fun baseArea(): Double {
        return radius * radius * Math.PI
    }
    override fun volume(): Double {
        return this.baseArea() * height
    }
}

class Cone(val radius: Double, val height: Double) : Figure3D() {
    override fun baseArea(): Double {
        return radius * radius * Math.PI
    }
    override fun volume(): Double {
        return this.baseArea() * height / 3
    }
}

class RectParallelepiped(val len: Double, val width: Double, val height: Double) : Figure3D() {
    override fun baseArea(): Double {
        return len * width
    }
    override fun volume(): Double {
        return this.baseArea() * height
    }
}

class Cube(val len: Double) : Figure3D() {
    override fun baseArea(): Double {
        return len * len
    }
    override fun volume(): Double {
        return len * len * len
    }
}

fun main() {
    println("Объем циллиндра: ${Cylinder(2.0, 4.0).volume()}")
    println("Площадь основания циллиндра: ${Cylinder(2.0, 4.0).baseArea()}")

    println("Объем конуса: ${Cone(2.0, 4.0).volume()}")
    println("Площадь основания конуса: ${Cone(2.0, 4.0).baseArea()}")

    println("Объем прямоугольного параллелепипеда: ${RectParallelepiped(2.0, 4.0, 5.0).volume()}")
    println("Площадь основания прямоугольного параллелепипеда: ${RectParallelepiped(2.0, 4.0, 5.0).baseArea()}")

    println("Объем куба: ${Cube(2.0).volume()}")
    println("Площадь основания куба: ${Cube(2.0).baseArea()}")
}