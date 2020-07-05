package com.github.rnlin430.surveyor

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender

import me.ryanhamshire.GriefPrevention.GriefPrevention
import org.bukkit.ChatColor
import org.bukkit.plugin.java.JavaPlugin
import java.io.File
import java.io.FileReader

class CommandListener(surveyorPlugin: SurveyorPlugin) : CommandExecutor {
    val plugin = surveyorPlugin

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {

        // search
        if (command.name.equals(plugin.commandList[0], true)) {
            var gp = plugin.server.pluginManager.getPlugin("GriefPrevention")
            if (gp !is GriefPrevention) return true
            val path = "${gp.dataFolder.absolutePath}Data/ClaimData"

            plugin.console.sendDebugMessage("path=$path")
//            plugin.pmsg.debugMessage(sender, "on search")

//            val path = System.getProperty("user.dir")
//            val dir = File("./plugins/GriefPreventionData/ClaimData/")
            val dir = File(path)
            val list: Array<File> = dir.listFiles()

            val number = args[0]

            for (i in list) {
                if (!i.isFile) continue
                if (!i.exists()) continue
                if (i.name == "$number.yml") {
                    val filereader = FileReader(i)
                    val culumList = filereader.readLines()
                    for (txt in culumList) {
                        sender.sendMessage(txt)
                    }
                }
//sender.sendMessage("${ChatColor.AQUA}File name=${i.name}")
            }
            return true
        }
        // surveyor
        else if (command.name.equals(plugin.commandList[1], true)) {

        }
        return true
    }
}

