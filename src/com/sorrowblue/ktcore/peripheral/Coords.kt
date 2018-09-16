package com.sorrowblue.ktcore.peripheral

interface Coords {
	val x: Int
	val y: Int
	val z: Int
	val relative: Relative?
	val vec: Vec?

	interface Relative {
		val x: Int
		val y: Int
		val z: Int
	}

	interface Vec {
		val x: Double
		val y: Double
		val z: Double
	}

}

interface SimpleCoords : Coords {
	override val relative: Coords.Relative? get() = null
	override val vec: Coords.Vec? get() = null
}



fun mutableCoordsOf(x: Int, y: Int, z: Int) = object : SimpleCoords {
	override var x = x
	override var y = y
	override var z = z
}

fun coordsOf(x: Int, y: Int, z: Int) = object : SimpleCoords {
	override val x = x
	override val y = y
	override val z = z
}
