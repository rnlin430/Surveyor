package com.github.rnlin430.surveyor

import com.github.rnlin430.surveyor.api.EnterRegionEvent
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerLoginEvent

class EventListener : Listener {
    val plugin: SurveyorPlugin = SurveyorPlugin.getInstance()
    init { plugin.server.pluginManager.registerEvents(this, plugin) }

    @EventHandler
    fun onEnterRegionPlayer(e: EnterRegionEvent) {

    }

    @EventHandler
    fun onLoginPlayer(e: PlayerLoginEvent) {
        val player = e.player
        val name = player.name
        plugin.pmsg.broadcast("onLoginPlayer name=${name}")
    }
}