package fi.felixbade.DeathLocation;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

  @Override
	public void onEnable() {
    Bukkit.getPluginManager().registerEvents(this, this);
  }

  @EventHandler
	public void onJoin(PlayerDeathEvent event) {
    Location deathLocation = event.getEntity().getLocation();

    int x = (int) deathLocation.getX();
    int y = (int) deathLocation.getY();
    int z = (int) deathLocation.getZ();
    String world = deathLocation.getWorld().getName();

    String deathMessage = event.getDeathMessage();
    deathMessage += " at " + x + " " + y + " " + z + " in " + world;
    event.setDeathMessage(deathMessage);
  }
}
