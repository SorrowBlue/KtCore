package com.sorrowblue.ktcore.peripheral.coord

interface Vec {
	override val x: Double = x
	override val y: Double = y
	override val z: Double = z
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
