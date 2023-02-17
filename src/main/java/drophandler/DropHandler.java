package drophandler;

import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.entity.Player;


public class DropHandler implements Listener {
    @EventHandler
    public void onBlockBreakEvent(BlockBreakEvent event) {
        Block block = event.getBlock();
        Player p = event.getPlayer();
        if (!p.hasPermission("toggledrops.deny." + block.getType().name())) return;
        event.setDropItems(false);
    }
}




