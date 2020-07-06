package com.github.rnlin430.surveyor

import com.github.rnlin430.rnlibrary.Region
import org.bukkit.World

/**
 * 矩形の領域の最小単位
 */
open class RectUnit(
        override val addressName: String,
        override val id: Int,
        override val fromX: Int,
        override val fromZ: Int,
        override val toX: Int,
        override val toZ: Int,
        override val world: World) : IAddress {

    override val fromY = 0
    override val toY = 0
    override val centerLocation: List<Double>
        get() {
            val x: Double = (fromX + toX).toDouble() / 2
            val z: Double = (fromZ + toZ).toDouble() / 2
            return listOf(x, z)
        }
    val region: Region = Region(
            fromX.toDouble(),fromY.toDouble(), fromZ.toDouble(), toX.toDouble(), toY.toDouble(), toZ.toDouble(), world)

}