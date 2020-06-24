package com.github.rnlin430.surveyor

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender

class CommandListener(surveyorPlugin: SurveyorPlugin) : CommandExecutor {
    val plugin = surveyorPlugin

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {

        // search
        if (command.name.equals(plugin.CommandList[0], true)) {

        }
        // surveyor
        else if (command.name.equals(plugin.CommandList[1], true)) {

        }
        TODO("Not yet implemented")
    }

}
