package sgmaffija.funcommands;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class FunCommands extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        registerCommands();

        getServer().getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&a[FunCommands] ON &r"));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&c[FunCommands] OFF &r"));
    }

    public void registerCommands(){
        this.getCommand("launch").setExecutor(new Commands());
        this.getCommand("nick").setExecutor(new Commands());
        this.getCommand("smite").setExecutor(new Commands());
        this.getCommand("boom").setExecutor(new Commands());
        this.getCommand("superman").setExecutor(new Commands());
    }
}
