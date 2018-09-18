package com.sorrowblue.ktcore.peripheral.coord

interface Vec {
	val x: Double
	val y: Double
	val z: Double
}

fun vecOf(x: Double, y: Double, z: Double) = object : Vec {
	override val x = x
	override val y = y
	override val z = z
}

fun mutableVecOf(x: Double, y: Double, z: Double) = object : Vec {
	override var x = x
	override var y = y
	override var z = z
}
