package com.github.rnlin430.surveyor

import org.bukkit.World

interface IAddress {
    val fromX: Int
    val fromY: Int
    val fromZ: Int
    val toX: Int
    val toY: Int
    val toZ: Int
    val world: World
    val addressName: String
    val id: Int
    val centerLocation: List<Double>
}
