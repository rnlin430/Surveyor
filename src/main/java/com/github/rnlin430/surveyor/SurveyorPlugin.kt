package com.github.rnlin430.surveyor

import com.github.rnlin430.rnlibrary.ConsoleLog
import org.bukkit.command.PluginCommand
import org.bukkit.plugin.java.JavaPlugin

class SurveyorPlugin : JavaPlugin() {

    val commandList: MutableList<String> = mutableListOf();
    val console: ConsoleLog = ConsoleLog(this)

    companion object {
        lateinit var instance: SurveyorPlugin
    }

    override fun onEnable() {
        registerCommands()
        instance = this
    }
    override fun onDisable() {}

    private fun registerCommands() {
        val commands = this.description.commands
        val clObj = CommandListener(this);
        lateinit var com: PluginCommand
        for (c in commands) {
            com = getCommand(c.key)!!
            if (com == null) {
                console.warnInfo(arrayOf("\u001B[31mコマンド ${c.key} が登録されませんでした。\u001B[0m"))
                continue
            }
            com.setExecutor(clObj)
            commandList.add(c.key)
        }
        return
    }
}