package com.pyromanticgaming.platemines;

/*
 *Copyright (c) <2016-2017>, <pyropyro78>, <pyropyro78@gmail.com>
 *All rights reserved.
 *
 *
 *THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityInteractEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

public final class PlateMines extends JavaPlugin implements Listener{

	public static String StonePlate, WoodenPlate, IronPlate, GoldPlate, TripWire;
	public static boolean removeblock, ForceDefuseTool, StonePlatePermission, WoodenPlatePermission, IronPlatePermission, GoldPlatePermission, TripWirePermission;
	public static Float ExplodePower;

	public static String StonePlateMob, WoodenPlateMob, IronPlateMob, GoldPlateMob, TripWireMob;
	public static Float ExplodePowerMob;

	@Override
	public void onEnable() {

		getLogger().info("PlateMines has been enabled.");

		getServer().getPluginManager().registerEvents(this, this);

		this.saveDefaultConfig();

		ForceDefuseTool = this.getConfig().getBoolean("ForceDefuseTool");
		removeblock = this.getConfig().getBoolean("RemoveBlock");

		StonePlateMob = this.getConfig().getString("StonePlateMob").toUpperCase();
		ExplodePowerMob = (float) this.getConfig().getDouble("ExplodePowerMob");
		WoodenPlateMob = this.getConfig().getString("WoodenPlateMob").toUpperCase();
		IronPlateMob = this.getConfig().getString("IronPlateMob").toUpperCase();
		GoldPlateMob = this.getConfig().getString("GoldPlateMob").toUpperCase();
		TripWireMob = this.getConfig().getString("TripWireMob").toUpperCase();

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
	public void onEntityInteract(EntityInteractEvent event) {
		if (!StonePlateMob.equals("OFF") && event.getBlock().getType().equals(Material.STONE_PLATE)) {
			if (StonePlateMob.equals("STOP")) {
				event.setCancelled(true);
			} 
			else if (StonePlateMob.equals("REMOVE")) {
				event.setCancelled(true);
				event.getEntity().remove();
			}
			else if (StonePlateMob.equals("EXPLODE")) {
				event.setCancelled(true);
				event.getEntity().getLocation().getWorld().createExplosion(event.getEntity().getLocation(), ExplodePowerMob);
				event.getEntity().remove();
			}
			else if (StonePlateMob.equals("KILL")) {
				event.setCancelled(true);
				event.getEntity().setFallDistance(255);
			}
		}
		if (!WoodenPlateMob.equals("OFF") && event.getBlock().getType().equals(Material.WOOD_PLATE)) {
			if (WoodenPlateMob.equals("STOP")) {
				event.setCancelled(true);
			} 
			else if (WoodenPlateMob.equals("REMOVE")) {
				event.setCancelled(true);
				event.getEntity().remove();
			}
			else if (WoodenPlateMob.equals("EXPLODE")) {
				event.setCancelled(true);
				event.getEntity().getLocation().getWorld().createExplosion(event.getEntity().getLocation(), ExplodePowerMob);
				event.getEntity().remove();
			}
			else if (WoodenPlateMob.equals("KILL")) {
				event.setCancelled(true);
				event.getEntity().setFallDistance(255);
			}
		}
		if (!IronPlateMob.equals("OFF") && event.getBlock().getType().equals(Material.IRON_PLATE)) {
			if (IronPlateMob.equals("STOP")) {
				event.setCancelled(true);
			} 
			else if (IronPlateMob.equals("REMOVE")) {
				event.setCancelled(true);
				event.getEntity().remove();
			}
			else if (IronPlateMob.equals("EXPLODE")) {
				event.setCancelled(true);
				event.getEntity().getLocation().getWorld().createExplosion(event.getEntity().getLocation(), ExplodePowerMob);
				event.getEntity().remove();
			}
			else if (IronPlateMob.equals("KILL")) {
				event.setCancelled(true);
				event.getEntity().setFallDistance(255);
			}
		}
		if (!GoldPlateMob.equals("OFF") && event.getBlock().getType().equals(Material.GOLD_PLATE)) {
			if (GoldPlateMob.equals("STOP")) {
				event.setCancelled(true);
			} 
			else if (GoldPlateMob.equals("REMOVE")) {
				event.setCancelled(true);
				event.getEntity().remove();
			}
			else if (GoldPlateMob.equals("EXPLODE")) {
				event.setCancelled(true);
				event.getEntity().getLocation().getWorld().createExplosion(event.getEntity().getLocation(), ExplodePowerMob);
				event.getEntity().remove();
			}
			else if (GoldPlateMob.equals("KILL")) {
				event.setCancelled(true);
				event.getEntity().setFallDistance(255);
			}
		}
		if (!TripWireMob.equals("OFF") && event.getBlock().getType().equals(Material.TRIPWIRE)) {
			if (TripWireMob.equals("STOP")) {
				event.setCancelled(true);
			} 
			else if (TripWireMob.equals("REMOVE")) {
				event.setCancelled(true);
				event.getEntity().remove();
			}
			else if (TripWireMob.equals("EXPLODE")) {
				event.setCancelled(true);
				event.getEntity().getLocation().getWorld().createExplosion(event.getEntity().getLocation(), ExplodePowerMob);
				event.getEntity().remove();
			}
			else if (TripWireMob.equals("KILL")) {
				event.setCancelled(true);
				event.getEntity().setFallDistance(255);
			}
		}
	}

	@EventHandler
	public void onBlockBreak(BlockBreakEvent event) {

		Player p = event.getPlayer();
		
		Boolean canBeStoneKilled = p.hasPermission("PlateMines.StonePlate.Kill") && !p.hasPermission("PlateMines.StonePlate.Kill.Ignore");
		Boolean canBeStoneExploded = p.hasPermission("PlateMines.StonePlate.Explode") && !p.hasPermission("PlateMines.StonePlate.Explode.Ignore");
		Boolean canBeIronKilled = p.hasPermission("PlateMines.IronPlate.Kill") && !p.hasPermission("PlateMines.IronPlate.Kill.Ignore");
		Boolean canBeIronExploded = p.hasPermission("PlateMines.IronPlate.Explode") && !p.hasPermission("PlateMines.IronPlate.Explode.Ignore");
		Boolean canBeWoodKilled = p.hasPermission("PlateMines.WoodPlate.Kill") && !p.hasPermission("PlateMines.WoodPlate.Kill.Ignore");
		Boolean canBeWoodExploded = p.hasPermission("PlateMines.WoodPlate.Explode") && !p.hasPermission("PlateMines.WoodPlate.Explode.Ignore");
		Boolean canBeGoldKilled = p.hasPermission("PlateMines.GoldPlate.Kill") && !p.hasPermission("PlateMines.GoldPlate.Kill.Ignore");
		Boolean canBeGoldExploded = p.hasPermission("PlateMines.GoldPlate.Explode") && !p.hasPermission("PlateMines.GoldPlate.Explode.Ignore");
		Boolean canBeTripWireKilled = p.hasPermission("PlateMines.TripWire.Kill") && !p.hasPermission("PlateMines.TripWire.Kill.Ignore");
		Boolean canBeTripWireExploded = p.hasPermission("PlateMines.TripWire.Explode") && !p.hasPermission("PlateMines.TripWire.Explode.Ignore");
		
		Double x = event.getBlock().getLocation().getX();
		Double y = event.getBlock().getLocation().getY();
		Double z = event.getBlock().getLocation().getZ();
		Location blockloc = new Location(event.getPlayer().getWorld(), x, (y + 1), z);
		Material blockmat = blockloc.getBlock().getType();

		if ((((blockmat.equals(Material.WOOD_PLATE) && WoodenPlate.equalsIgnoreCase("Kill") && canBeWoodKilled) || (blockmat.equals(Material.STONE_PLATE) && StonePlate.equalsIgnoreCase("Kill") && canBeStoneKilled) || (blockmat.equals(Material.IRON_PLATE) && IronPlate.equalsIgnoreCase("Kill") && canBeIronKilled) || (blockmat.equals(Material.GOLD_PLATE) && GoldPlate.equalsIgnoreCase("Kill") && canBeGoldKilled) || (blockmat.equals(Material.TRIPWIRE) && TripWire.equalsIgnoreCase("Kill") && canBeTripWireKilled)) || ((event.getBlock().getType().equals(Material.WOOD_PLATE) && WoodenPlate.equalsIgnoreCase("Kill") && canBeWoodKilled) || (event.getBlock().getType().equals(Material.STONE_PLATE) && StonePlate.equalsIgnoreCase("Kill") && canBeStoneKilled) || (event.getBlock().getType().equals(Material.IRON_PLATE) && IronPlate.equalsIgnoreCase("Kill") && canBeIronKilled) || (event.getBlock().getType().equals(Material.GOLD_PLATE) && GoldPlate.equalsIgnoreCase("Kill") && canBeGoldKilled) || (event.getBlock().getType().equals(Material.TRIPWIRE) && TripWire.equalsIgnoreCase("Kill") && canBeTripWireKilled)))) {
			KillPlayerBreakBlock(event, blockmat, blockloc);
		}

		if ((((blockmat.equals(Material.WOOD_PLATE) && WoodenPlate.equalsIgnoreCase("Explode") && canBeWoodExploded) || (blockmat.equals(Material.STONE_PLATE) && StonePlate.equalsIgnoreCase("Explode") && canBeStoneExploded) || (blockmat.equals(Material.IRON_PLATE) && IronPlate.equalsIgnoreCase("Explode") && canBeIronExploded) || (blockmat.equals(Material.GOLD_PLATE) && GoldPlate.equalsIgnoreCase("Explode") && canBeGoldExploded) || (blockmat.equals(Material.TRIPWIRE) && TripWire.equalsIgnoreCase("Explode") && canBeTripWireExploded)) || ((event.getBlock().getType().equals(Material.WOOD_PLATE) && WoodenPlate.equalsIgnoreCase("Explode") && canBeWoodExploded) || (event.getBlock().getType().equals(Material.STONE_PLATE) && StonePlate.equalsIgnoreCase("Explode") && canBeStoneExploded) || (event.getBlock().getType().equals(Material.IRON_PLATE) && IronPlate.equalsIgnoreCase("Explode") && canBeIronExploded) || (event.getBlock().getType().equals(Material.GOLD_PLATE) && GoldPlate.equalsIgnoreCase("Explode") && canBeGoldExploded) || (event.getBlock().getType().equals(Material.TRIPWIRE) && TripWire.equalsIgnoreCase("Explode") && canBeTripWireExploded)))) {
			ExplodePlayerBreakBlock(event, blockmat, blockloc);
		}
	}

	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent event) {
		Player p = event.getPlayer();
		if (!p.isDead()) {


			Boolean redstoneActivatedByPhysical = (event.getAction() == event.getAction().PHYSICAL);
			/*
			 * 
			 * Shears now drop the block stone plate
			 * 
			 * ToDo
			 * --------------
			 * Block break broken
			 * All wires state tool needed and allow breaking
			 * once activated items do despawn
			 * Block other methods of breaking redstone triggers
			 * Allow Custom defuse tool?
			 * Finish config to let server owners know that this is a global check regardless of player mines
			 * 
			 */
			if (event.getAction().equals(Action.RIGHT_CLICK_BLOCK) && ((event.getClickedBlock().getType().equals(Material.WOOD_PLATE) && !WoodenPlate.equalsIgnoreCase("OFF")) || (event.getClickedBlock().getType().equals(Material.STONE_PLATE) && !StonePlate.equalsIgnoreCase("OFF")) || (event.getClickedBlock().getType().equals(Material.IRON_PLATE) && !IronPlate.equalsIgnoreCase("OFF")) || (event.getClickedBlock().getType().equals(Material.GOLD_PLATE) && !GoldPlate.equalsIgnoreCase("OFF")) || (event.getClickedBlock().getType().equals(Material.TRIPWIRE) && !TripWire.equalsIgnoreCase("OFF"))) && p.getItemInHand().getType().equals(Material.SHEARS) && ForceDefuseTool) {
				Block block = event.getClickedBlock().getLocation().getBlock();
				Location blockloc = event.getClickedBlock().getLocation();
				Material blockmat = block.getState().getType();
				ItemStack blocktodrop = new ItemStack(blockmat);
				block.setType(Material.AIR);
				block.getWorld().dropItemNaturally(blockloc, blocktodrop);
			}

			if (event.getAction().equals(Action.LEFT_CLICK_BLOCK) && ((event.getClickedBlock().getType().equals(Material.WOOD_PLATE) && !WoodenPlate.equalsIgnoreCase("OFF")) || (event.getClickedBlock().getType().equals(Material.STONE_PLATE) && !StonePlate.equalsIgnoreCase("OFF")) || (event.getClickedBlock().getType().equals(Material.IRON_PLATE) && !IronPlate.equalsIgnoreCase("OFF")) || (event.getClickedBlock().getType().equals(Material.GOLD_PLATE) && !GoldPlate.equalsIgnoreCase("OFF")) || (event.getClickedBlock().getType().equals(Material.TRIPWIRE) && !TripWire.equalsIgnoreCase("OFF"))) && !p.getItemInHand().getType().equals(Material.SHEARS) && ForceDefuseTool) {
				p.sendMessage("You need a tool to defuse this.");
			}

			if (redstoneActivatedByPhysical) {
				if ((!StonePlate.equalsIgnoreCase("OFF") || StonePlatePermission) && event.getClickedBlock().getType().name().equals("STONE_PLATE")) {
					if (StonePlate.equalsIgnoreCase("STOP") || (p.hasPermission("PlateMines.StonePlate.Stop") && !p.hasPermission("PlateMines.StonePlate.Stop.Ignore"))) {
						event.setCancelled(true);
						return;
					} 
					else if (StonePlate.equalsIgnoreCase("Explode") || (p.hasPermission("PlateMines.StonePlate.Explode") && !p.hasPermission("PlateMines.StonePlate.Stop.Explode"))) {
						ExplodePlayerInteract(event);
					}
					else if (StonePlate.equalsIgnoreCase("KILL") || (p.hasPermission("PlateMines.StonePlate.Kill") && !p.hasPermission("PlateMines.StonePlate.Kill.Ignore"))) {
						KillPlayerInteract(event);
						return;
					}
				}
				if ((!WoodenPlate.equalsIgnoreCase("OFF") || WoodenPlatePermission) && event.getClickedBlock().getType().name().equals("WOOD_PLATE")) {
					if (WoodenPlate.equalsIgnoreCase("STOP") || (p.hasPermission("PlateMines.WoodenPlate.Stop") && !p.hasPermission("PlateMines.WoodenPlate.Stop.Ignore"))) {
						event.setCancelled(true);
						return;
					} 
					else if (WoodenPlate.equalsIgnoreCase("EXPLODE") || (p.hasPermission("PlateMines.WoodenPlate.Explode") && !p.hasPermission("PlateMines.WoodenPlate.Explode.Ignore"))) {
						ExplodePlayerInteract(event);
					}
					else if (WoodenPlate.equalsIgnoreCase("KILL") || (p.hasPermission("PlateMines.WoodenPlate.Kill") && !p.hasPermission("PlateMines.WoodenPlate.Kill.Ignore"))) {
						KillPlayerInteract(event);
					}
				}
				if ((!IronPlate.equalsIgnoreCase("OFF") || IronPlatePermission) && event.getClickedBlock().getType().name().equals("IRON_PLATE")) {
					if (IronPlate.equalsIgnoreCase("STOP") || (p.hasPermission("PlateMines.IronPlate.Stop") && !p.hasPermission("PlateMines.IronPlate.Stop.Ignore"))) {
						event.setCancelled(true);
						return;
					} 
					else if (IronPlate.equalsIgnoreCase("EXPLODE") || (p.hasPermission("PlateMines.IronPlate.Explode") && !p.hasPermission("PlateMines.IronPlate.Explode.Ignore"))) {
						ExplodePlayerInteract(event);
					}
					else if (IronPlate.equalsIgnoreCase("KILL") || (p.hasPermission("PlateMines.IronPlate.Kill") && !p.hasPermission("PlateMines.IronPlate.Kill.Ignore"))) {
						KillPlayerInteract(event);
					}
				}
				if ((!GoldPlate.equals("OFF") || GoldPlatePermission) && event.getClickedBlock().getType().name().equals("GOLD_PLATE")) {
					if (GoldPlate.equalsIgnoreCase("STOP") || (p.hasPermission("PlateMines.GoldPlate.Stop") && !p.hasPermission("PlateMines.GoldPlate.Stop.Ignore"))) {
						event.setCancelled(true);
						return;
					} 
					else if (GoldPlate.equalsIgnoreCase("EXPLODE") || (p.hasPermission("PlateMines.GoldPlate.Explode") && !p.hasPermission("PlateMines.GoldPlate.Explode.Ignore"))) {
						ExplodePlayerInteract(event);
					}
					else if (GoldPlate.equalsIgnoreCase("KILL") || (p.hasPermission("PlateMines.GoldPlate.Kill") && !p.hasPermission("PlateMines.GoldPlate.Kill.Ignore"))) {
						KillPlayerInteract(event);
					}
				}
				if ((!TripWire.equals("OFF") || TripWirePermission) && event.getClickedBlock().getType().name().equals("TRIPWIRE")) {
					if (TripWire.equalsIgnoreCase("STOP") || (p.hasPermission("PlateMines.TripWire.Stop") && !p.hasPermission("PlateMines.TripWire.Stop.Ignore"))) {
						event.setCancelled(true);
						return;
					} 
					else if (TripWire.equalsIgnoreCase("EXPLODE") || (p.hasPermission("PlateMines.TripWire.Explode") && !p.hasPermission("PlateMines.TripWire.Explode.Ignore"))) {
						ExplodePlayerInteract(event);
					}
					else if (TripWire.equalsIgnoreCase("KILL") || (p.hasPermission("PlateMines.TripWire.Kill") && !p.hasPermission("PlateMines.TripWire.Kill.Ignore"))) {
						KillPlayerInteract(event);
					}
				}
			}
		}
	}

	void KillPlayerInteract(PlayerInteractEvent event) {
		event.setCancelled(true);
		if (removeblock) {
			Block block = event.getClickedBlock().getLocation().getBlock();
			block.setType(Material.AIR);
		}
		event.getPlayer().setHealth(0);
		return;
	}

	void ExplodePlayerInteract(PlayerInteractEvent event) {
		event.setCancelled(true);
		if (removeblock) {
			Block block = event.getClickedBlock().getLocation().getBlock();
			block.setType(Material.AIR);
		}
		event.getPlayer().getLocation().getWorld().createExplosion(event.getPlayer().getLocation(), ExplodePower);
		event.getPlayer().setHealth(0);
		return;
	}

	void KillPlayerBreakBlock(BlockBreakEvent event, Material blocktype, Location blockloc) {
		event.setCancelled(true);
		if (removeblock) {
			Block block = event.getBlock().getLocation().getBlock();
			block.setType(Material.AIR);
		}
		event.getPlayer().setHealth(0);
		return;
	}

	void ExplodePlayerBreakBlock(BlockBreakEvent event, Material blockmat, Location blockloc) {
		event.setCancelled(true);
		if (removeblock) {
			Block blockmain = event.getBlock().getLocation().getBlock();
			Block blockabove = blockloc.getBlock();
			if (blockmain.getType().equals(Material.WOOD_PLATE) || blockmain.getType().equals(Material.STONE_PLATE) || blockmain.getType().equals(Material.IRON_PLATE) || blockmain.getType().equals(Material.GOLD_PLATE) || blockmain.getType().equals(Material.TRIPWIRE)) {
				blockmain.setType(Material.AIR);
			}else
				if (blockmat.equals(Material.WOOD_PLATE) || blockmat.equals(Material.STONE_PLATE) || blockmat.equals(Material.IRON_PLATE) || blockmat.equals(Material.GOLD_PLATE) || blockmat.equals(Material.TRIPWIRE)) {
					blockabove.setType(Material.AIR);
				}
		}
		event.getPlayer().getLocation().getWorld().createExplosion(event.getPlayer().getLocation(), ExplodePower);
		event.getPlayer().setHealth(0);
		return;
	}

}
