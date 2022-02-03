data class Point(val x: Double, val y: Double) {
    operator fun plus(other: Point) = Point(x + other.x, y + other.y)
}