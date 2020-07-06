package com.github.rnlin430.surveyor

/**
 * 矩形の領域の最小単位
 */
open class RectUnit(
        val address: String,
        val id:Int,
        val fromX: Int,
        val fromZ: Int,
        val toX: Int,
        val toZ: Int) : IAddress {

    override fun getCenterLocation(): List<Float> {
        val x: Float = (fromX + toX).toFloat() / 2
        val z = (fromZ + toZ).toFloat() / 2
        return listOf(x, z)
    }
}