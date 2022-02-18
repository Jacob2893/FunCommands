package sgmaffija.funcommands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;

/**
 * =====================================================================
 * Class Commands inside sgmaffija.funcommands
 * Created by Jakub Ćwik on 18.02.2022
 * For FunCommands
 * =====================================================================
 */

public class Commands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player player = (Player)sender;
            if(command.getName().equalsIgnoreCase("launch")){
                switch(args.length){
                    case 0:
                        player.setVelocity(new Vector(0,2,0));
                        break;
                    case 1:
                        Bukkit.getPlayer(args[0]).setVelocity(new Vector(0,2,0));
                        break;
                }
            }
            if(command.getName().equalsIgnoreCase("nick")){
                switch (args.length) {
                    case 0:
                        player.sendMessage(ChatColor.RED + "Nie podano argumentu");
                        break;
                    case 1:
                        if (args[0].equalsIgnoreCase("remove")) {
                            player.setPlayerListName(player.getName());
                        } else {
                            player.setPlayerListName(ChatColor.translateAlternateColorCodes('&', args[0]));
                        }
                        break;
                    case 2:
                        if (args[0].equalsIgnoreCase("remove")) {
                            Bukkit.getPlayer(args[1]).setPlayerListName(Bukkit.getPlayer(args[1]).getName());
                        } else {
                            Bukkit.getPlayer(args[0]).setPlayerListName(ChatColor.translateAlternateColorCodes('&', args[1]));
                        }
                        break;
                }
            }
            if(command.getName().equalsIgnoreCase("smite")){
                switch(args.length){
                    case 0:
                        player.sendMessage(ChatColor.RED + "Nie podano argumentu");
                        break;
                    case 1:
                        Bukkit.getPlayer(args[0]).getWorld().strikeLightning(Bukkit.getPlayer(args[0]).getLocation());
                        break;
                }
            }
            if(command.getName().equalsIgnoreCase("boom")){
                switch(args.length){
                    case 0:
                        player.sendMessage(ChatColor.RED + "Nie podano argumentu");
                        break;
                    case 1:
                        Bukkit.getPlayer(args[0]).sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lBOOM!"));
                        Bukkit.getPlayer(args[0]).getWorld().createExplosion(Bukkit.getPlayer(args[0]).getLocation(), 3);
                        break;
                }
            }
            if(command.getName().equalsIgnoreCase("superman")){
                switch(args.length){
                    case 0:
                        player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 1200, 9, false, true, true));
                        player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 1200, 9, false, true, true));
                        player.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, 1200, 9, false, true, true));
                        player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 1200, 9, false, true, true));
                        player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 1200, 9, false, true, true));
                        player.addPotionEffect(new PotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE, 1200, 9, false, true, true));
                        player.addPotionEffect(new PotionEffect(PotionEffectType.GLOWING, 1200, 9, false, true, true));
                        player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1200, 9, false, true, true));
                        player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 1200, 9, false, true, true));
                        player.addPotionEffect(new PotionEffect(PotionEffectType.LUCK, 1200, 9, false, true, true));
                        player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 1200, 9, false, true, true));
                        player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 1200, 9, false, true, true));
                        player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 1200, 9, false, true, true));
                        player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 1200, 9, false, true, true));
                        break;
                    case 1:
                        Bukkit.getPlayer(args[0]).addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 1200, 9, false, true, true));
                        Bukkit.getPlayer(args[0]).addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 1200, 9, false, true, true));
                        Bukkit.getPlayer(args[0]).addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, 1200, 9, false, true, true));
                        Bukkit.getPlayer(args[0]).addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 1200, 9, false, true, true));
                        Bukkit.getPlayer(args[0]).addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 1200, 9, false, true, true));
                        Bukkit.getPlayer(args[0]).addPotionEffect(new PotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE, 1200, 9, false, true, true));
                        Bukkit.getPlayer(args[0]).addPotionEffect(new PotionEffect(PotionEffectType.GLOWING, 1200, 9, false, true, true));
                        Bukkit.getPlayer(args[0]).addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1200, 9, false, true, true));
                        Bukkit.getPlayer(args[0]).addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 1200, 9, false, true, true));
                        Bukkit.getPlayer(args[0]).addPotionEffect(new PotionEffect(PotionEffectType.LUCK, 1200, 9, false, true, true));
                        Bukkit.getPlayer(args[0]).addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 1200, 9, false, true, true));
                        Bukkit.getPlayer(args[0]).addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 1200, 9, false, true, true));
                        Bukkit.getPlayer(args[0]).addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 1200, 9, false, true, true));
                        Bukkit.getPlayer(args[0]).addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 1200, 9, false, true, true));
                        break;
                }
            }
        }
        return false;
    }
}

/*
 * +-------------------------------+
 * | §0    black                   |
 * | §1    dark_blue               |
 * | §2    dark_green              |
 * | §3    dark_aqua               |
 * | §4    dark_red                |
 * | §5    dark_purple             |
 * | §6    gold                    |
 * | §7    gray                    |
 * | §8    dark_gray               |
 * | §9    blue                    |
 * | §a    green                   |
 * | §b    aqua                    |
 * | §c    red                     |
 * | §d    light_purple            |
 * | §e    yellow                  |
 * | §f    white                   |
 * |                               |
 * | §k    Obfuscated (MAGIC)      |
 * | §l    Bold                    |
 * | §m    Strikethrough           |
 * | §n    Underline               |
 * | §o    Italic                  |
 * | §r    Reset                   |
 * +-------------------------------+
 */