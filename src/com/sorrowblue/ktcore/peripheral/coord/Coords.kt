package com.sorrowblue.ktcore.peripheral.coord

interface Coords {
	val x: Int
	val y: Int
	val z: Int
}

fun coordsOf(x: Int, y: Int, z: Int) = object : Coords {
	override val x = x
	override val y = y
	override val z = z
}

fun mutableCoordsOf(x: Int, y: Int, z: Int) = object : Coords {
	override var x = x
	override var y = y
	override var z = z
}
