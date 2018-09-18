package com.sorrowblue.ktcore.peripheral.coord

interface Relative : Coords {}

fun relativeOf(x: Int, y: Int, z: Int) = object : Relative {
	override val x = x
	override val y = y
	override val z = z
}

fun mutableRelativeOf(x: Int, y: Int, z: Int) = object : Relative {
	override var x = x
	override var y = y
	override var z = z
}
