package com.pyromanticgaming.platemines;

import org.bukkit.entity.Player;

/*
*Copyright (c) <2016>, <pyropyro78>, <pyropyro78@gmail.com>
*All rights reserved.
*
*
*THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class PlateMines extends JavaPlugin implements Listener{
	
	public static String StonePlate, WoodenPlate, IronPlate, GoldPlate, TripWire;
	public static boolean StonePlatePermission, WoodenPlatePermission, IronPlatePermission, GoldPlatePermission, TripWirePermission;
	public static Float ExplodePower;
	@Override
	public void onEnable() {
		
		getLogger().info("PlateMines has been enabled.");

		getServer().getPluginManager().registerEvents(this, this);
		
		this.saveDefaultConfig();
		StonePlate = this.getConfig().getString("StonePlate").toUpperCase();
		StonePlatePermission = this.getConfig().getBoolean("StonePlatePermission");
		ExplodePower = (float) this.getConfig().getDouble("ExplodePower");
		WoodenPlate = this.getConfig().getString("WoodenPlate").toUpperCase();
		WoodenPlatePermission = this.getConfig().getBoolean("WoodenPlatePermission");
		IronPlate = this.getConfig().getString("IronPlate").toUpperCase();
		IronPlatePermission = this.getConfig().getBoolean("IronPlatePermission");
		GoldPlate = this.getConfig().getString("GoldPlate").toUpperCase();
		GoldPlatePermission = this.getConfig().getBoolean("GoldPlatePermission");
		TripWire = this.getConfig().getString("TripWire").toUpperCase();
		TripWirePermission = this.getConfig().getBoolean("TripWirePermission");
	}
	
	@Override
	public void onDisable() {
		getLogger().info("PlateMines has been disabled.");
	}

	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent event) {
		Player p = event.getPlayer();
		if ((!StonePlate.equalsIgnoreCase("OFF") || StonePlatePermission) && event.getClickedBlock().getType().name().equals("STONE_PLATE") && (event.getAction() == event.getAction().PHYSICAL)) {
			if (StonePlate.equalsIgnoreCase("STOP") || (p.hasPermission("PlateMines.StonePlate.Stop") && !p.hasPermission("PlateMines.StonePlate.Stop.Ignore"))) {
				event.setCancelled(true);
				return;
			} 
			else if (StonePlate.equalsIgnoreCase("Explode") || (p.hasPermission("PlateMines.StonePlate.Explode") && !p.hasPermission("PlateMines.StonePlate.Stop.Explode"))) {
				event.setCancelled(true);
				event.getPlayer().getLocation().getWorld().createExplosion(event.getPlayer().getLocation(), ExplodePower);
				event.getPlayer().setHealth(0);
				return;
			}
			else if (StonePlate.equalsIgnoreCase("KILL") || (p.hasPermission("PlateMines.StonePlate.Kill") && !p.hasPermission("PlateMines.StonePlate.Kill.Ignore"))) {
				event.setCancelled(true);
				event.getPlayer().setHealth(0);
				return;
			}
		}
		if ((!WoodenPlate.equalsIgnoreCase("OFF") || WoodenPlatePermission) && event.getClickedBlock().getType().name().equals("WOOD_PLATE") && (event.getAction() == event.getAction().PHYSICAL)) {
			if (WoodenPlate.equalsIgnoreCase("STOP") || (p.hasPermission("PlateMines.WoodenPlate.Stop") && !p.hasPermission("PlateMines.WoodenPlate.Stop.Ignore"))) {
				event.setCancelled(true);
				return;
			} 
			else if (WoodenPlate.equalsIgnoreCase("EXPLODE") || (p.hasPermission("PlateMines.WoodenPlate.Explode") && !p.hasPermission("PlateMines.WoodenPlate.Explode.Ignore"))) {
				event.setCancelled(true);
				event.getPlayer().getLocation().getWorld().createExplosion(event.getPlayer().getLocation(), ExplodePower);
				event.getPlayer().setHealth(0);
				return;
			}
			else if (WoodenPlate.equalsIgnoreCase("KILL") || (p.hasPermission("PlateMines.WoodenPlate.Kill") && !p.hasPermission("PlateMines.WoodenPlate.Kill.Ignore"))) {
				event.setCancelled(true);
				event.getPlayer().setHealth(0);
				return;
			}
		}
		if ((!IronPlate.equalsIgnoreCase("OFF") || IronPlatePermission) && event.getClickedBlock().getType().name().equals("IRON_PLATE") && (event.getAction() == Action.PHYSICAL)) {
			if (IronPlate.equalsIgnoreCase("STOP") || (p.hasPermission("PlateMines.IronPlate.Stop") && !p.hasPermission("PlateMines.IronPlate.Stop.Ignore"))) {
				event.setCancelled(true);
				return;
			} 
			else if (IronPlate.equalsIgnoreCase("EXPLODE") || (p.hasPermission("PlateMines.IronPlate.Explode") && !p.hasPermission("PlateMines.IronPlate.Explode.Ignore"))) {
				event.setCancelled(true);
				event.getPlayer().getLocation().getWorld().createExplosion(event.getPlayer().getLocation(), ExplodePower);
				event.getPlayer().setHealth(0);
				return;
			}
			else if (IronPlate.equalsIgnoreCase("KILL") || (p.hasPermission("PlateMines.IronPlate.Kill") && !p.hasPermission("PlateMines.IronPlate.Kill.Ignore"))) {
				event.setCancelled(true);
				event.getPlayer().setHealth(0);
				return;
			}
		}
		if ((!GoldPlate.equals("OFF") || GoldPlatePermission) && event.getClickedBlock().getType().name().equals("GOLD_PLATE") && (event.getAction() == event.getAction().PHYSICAL)) {
			if (GoldPlate.equalsIgnoreCase("STOP") || (p.hasPermission("PlateMines.GoldPlate.Stop") && !p.hasPermission("PlateMines.GoldPlate.Stop.Ignore"))) {
				event.setCancelled(true);
				return;
			} 
			else if (GoldPlate.equalsIgnoreCase("EXPLODE") || (p.hasPermission("PlateMines.GoldPlate.Explode") && !p.hasPermission("PlateMines.GoldPlate.Explode.Ignore"))) {
				event.setCancelled(true);
				event.getPlayer().getLocation().getWorld().createExplosion(event.getPlayer().getLocation(), ExplodePower);
				event.getPlayer().setHealth(0);
				return;
			}
			else if (GoldPlate.equalsIgnoreCase("KILL") || (p.hasPermission("PlateMines.GoldPlate.Kill") && !p.hasPermission("PlateMines.GoldPlate.Kill.Ignore"))) {
				event.setCancelled(true);
				event.getPlayer().setHealth(0);
				return;
			}
		}
		if ((!TripWire.equals("OFF") || TripWirePermission) && event.getClickedBlock().getType().name().equals("TRIPWIRE") && (event.getAction() == event.getAction().PHYSICAL)) {
			if (TripWire.equalsIgnoreCase("STOP") || (p.hasPermission("PlateMines.TripWire.Stop") && !p.hasPermission("PlateMines.TripWire.Stop.Ignore"))) {
				event.setCancelled(true);
				return;
			} 
			else if (TripWire.equalsIgnoreCase("EXPLODE") || (p.hasPermission("PlateMines.TripWire.Explode") && !p.hasPermission("PlateMines.TripWire.Explode.Ignore"))) {
				event.setCancelled(true);
				event.getPlayer().getLocation().getWorld().createExplosion(event.getPlayer().getLocation(), ExplodePower);
				event.getPlayer().setHealth(0);
				return;
			}
			else if (TripWire.equalsIgnoreCase("KILL") || (p.hasPermission("PlateMines.TripWire.Kill") && !p.hasPermission("PlateMines.TripWire.Kill.Ignore"))) {
				event.setCancelled(true);
				event.getPlayer().setHealth(0);
				return;
			}
		}
	}
}
