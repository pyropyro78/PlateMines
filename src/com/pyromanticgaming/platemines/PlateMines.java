package com.pyromanticgaming.platemines;

/*
*Copyright (c) <2016>, <pyropyro78>, <pyropyro78@gmail.com>
*All rights reserved.
*
*
*THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class PlateMines extends JavaPlugin implements Listener{
	
	public static String StonePlate, WoodenPlate, IronPlate, GoldPlate, TripWire;
	public static Float ExplodePower;
	@Override
	public void onEnable() {
		
		getLogger().info("PlateMines has been enabled.");

		getServer().getPluginManager().registerEvents(this, this);
		
		this.saveDefaultConfig();
		StonePlate = this.getConfig().getString("StonePlate").toUpperCase();
		ExplodePower = (float) this.getConfig().getDouble("ExplodePower");
		WoodenPlate = this.getConfig().getString("WoodenPlate").toUpperCase();
		IronPlate = this.getConfig().getString("IronPlate").toUpperCase();
		GoldPlate = this.getConfig().getString("GoldPlate").toUpperCase();
		TripWire = this.getConfig().getString("TripWire").toUpperCase();
	}
	
	@Override
	public void onDisable() {
		getLogger().info("PlateMines has been disabled.");
	}

	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent event) {
		if (!StonePlate.equals("OFF") && event.getClickedBlock().getType().name().equals("STONE_PLATE")) {
			if (StonePlate.equals("STOP")) {
				event.setCancelled(true);
			} 
			else if (StonePlate.equals("EXPLODE")) {
				event.setCancelled(true);
				event.getPlayer().getLocation().getWorld().createExplosion(event.getPlayer().getLocation(), ExplodePower);
				event.getPlayer().setHealth(0);
			}
			else if (StonePlate.equals("KILL")) {
				event.setCancelled(true);
				event.getPlayer().setHealth(0);
			}
		}
		if (!WoodenPlate.equals("OFF") && event.getClickedBlock().getType().name().equals("WOOD_PLATE")) {
			if (WoodenPlate.equals("STOP")) {
				event.setCancelled(true);
			} 
			else if (WoodenPlate.equals("EXPLODE")) {
				event.setCancelled(true);
				event.getPlayer().getLocation().getWorld().createExplosion(event.getPlayer().getLocation(), ExplodePower);
				event.getPlayer().setHealth(0);
			}
			else if (WoodenPlate.equals("KILL")) {
				event.setCancelled(true);
				event.getPlayer().setHealth(0);
			}
		}
		if (!IronPlate.equals("OFF") && event.getClickedBlock().getType().name().equals("IRON_PLATE")) {
			if (IronPlate.equals("STOP")) {
				event.setCancelled(true);
			} 
			else if (IronPlate.equals("EXPLODE")) {
				event.setCancelled(true);
				event.getPlayer().getLocation().getWorld().createExplosion(event.getPlayer().getLocation(), ExplodePower);
				event.getPlayer().setHealth(0);
			}
			else if (IronPlate.equals("KILL")) {
				event.setCancelled(true);
				event.getPlayer().setHealth(0);
			}
		}
		if (!GoldPlate.equals("OFF") && event.getClickedBlock().getType().name().equals("GOLD_PLATE")) {
			if (GoldPlate.equals("STOP")) {
				event.setCancelled(true);
			} 
			else if (GoldPlate.equals("EXPLODE")) {
				event.setCancelled(true);
				event.getPlayer().getLocation().getWorld().createExplosion(event.getPlayer().getLocation(), ExplodePower);
				event.getPlayer().setHealth(0);
			}
			else if (GoldPlate.equals("KILL")) {
				event.setCancelled(true);
				event.getPlayer().setHealth(0);
			}
		}
		if (!TripWire.equals("OFF") && event.getClickedBlock().getType().name().equals("TRIPWIRE")) {
			if (TripWire.equals("STOP")) {
				event.setCancelled(true);
			} 
			else if (TripWire.equals("EXPLODE")) {
				event.setCancelled(true);
				event.getPlayer().getLocation().getWorld().createExplosion(event.getPlayer().getLocation(), ExplodePower);
				event.getPlayer().setHealth(0);
			}
			else if (TripWire.equals("KILL")) {
				event.setCancelled(true);
				event.getPlayer().setHealth(0);
			}
		}
	}
}
