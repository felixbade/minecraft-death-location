# minecraft-death-location
Download: https://www.spigotmc.org/resources/death-location.76247/

A very simple Bukkit/Spigot plugin that shows the player's location in the death message. No permissions, no configuration.

![Screenshot of a death situation](screenshot.png)

## Building/installation
- Get Maven (required only for building the jar file – not necessary on the Minecraft server)
- Run `mvn package` in the root of this project
- Maven creates a `target` folder. There you should find `DeathLocation.jar` file. Copy that to the `plugins` folder in your Bukkit/Spigot server
- Run the server and it should work
