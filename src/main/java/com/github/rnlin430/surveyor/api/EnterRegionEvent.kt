package com.github.rnlin430.surveyor.api

import org.bukkit.entity.Player
import org.bukkit.event.Event
import org.bukkit.event.HandlerList

class EnterRegionEvent(player: Player, region: Region) : Event(){
    val player = player


    override fun getHandlers(): HandlerList {
        TODO("Not yet implemented")
    }

    fun getPreRegion() {

    }

    fun getRegion() {

    }

}