package winlyps.noCommandFeedback

import org.bukkit.plugin.java.JavaPlugin

class NoCommandFeedback : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        server.worlds.forEach { world ->
            world.setGameRuleValue("sendCommandFeedback", "false")
        }
        logger.info("NoCommandFeedback plugin has been enabled.")
    }

    override fun onDisable() {
        // Plugin shutdown logic
        server.worlds.forEach { world ->
            world.setGameRuleValue("sendCommandFeedback", "true")
            logger.info("NoCommandFeedback plugin has been disabled.")
        }
    }
}