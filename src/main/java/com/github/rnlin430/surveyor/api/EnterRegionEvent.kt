package com.github.rnlin430.surveyor.api

import com.github.rnlin430.surveyor.WorldSection
import org.bukkit.entity.Player
import org.bukkit.event.Event
import org.bukkit.event.HandlerList

/**
 * WorldSectionにプレイヤーが入るときのイベント
 */
class EnterRegionEvent(player: Player, worldSection: WorldSection) : Event() {
    val player = player
    val worldSection: WorldSection = worldSection


    override fun getHandlers(): HandlerList {
        TODO("Not yet implemented")
    }

    fun getPreRegion() {

    }
}
