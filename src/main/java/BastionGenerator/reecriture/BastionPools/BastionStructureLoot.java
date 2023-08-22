package BastionGenerator.reecriture.BastionPools;

import com.seedfinding.mccore.util.pos.BPos;
import com.seedfinding.mcfeature.loot.LootTable;
import com.seedfinding.mcfeature.loot.MCLootTables;

import java.util.HashMap;
import java.util.List;

public class BastionStructureLoot {

    public static final HashMap<String, List<LootTable>> STRUCTURE_LOOT = new HashMap<>() {
    	private static final long serialVersionUID = 2335512441609093531L;
	{
        this.put("blocks/air", List.of());
        this.put("blocks/gold", List.of());

        this.put("mobs/crossbow_piglin", List.of());
        this.put("mobs/empty", List.of());
        this.put("mobs/hoglin", List.of());
        this.put("mobs/melee_piglin", List.of());
        this.put("mobs/melee_piglin_always", List.of());
        this.put("mobs/sword_piglin", List.of());

        this.put("units/center_pieces/center_0", List.of(MCLootTables.BASTION_OTHER_CHEST.get()));
        this.put("units/center_pieces/center_1", List.of(MCLootTables.BASTION_OTHER_CHEST.get()));
        this.put("units/center_pieces/center_2", List.of(MCLootTables.BASTION_OTHER_CHEST.get()));
        this.put("units/edges/edge_0", List.of());
        this.put("units/fillers/stage_0", List.of());
        this.put("units/pathways/pathway_0", List.of());
        this.put("units/pathways/pathway_wall_0", List.of());
        this.put("units/rampart_plates/plate_0", List.of());
        this.put("units/ramparts/ramparts_0", List.of(MCLootTables.BASTION_OTHER_CHEST.get(), MCLootTables.BASTION_OTHER_CHEST.get(), MCLootTables.BASTION_OTHER_CHEST.get()));
        this.put("units/ramparts/ramparts_1", List.of(MCLootTables.BASTION_OTHER_CHEST.get()));
        this.put("units/ramparts/ramparts_2", List.of());
        this.put("units/stages/rot/stage_1_0", List.of());
        this.put("units/stages/stage_0_0", List.of());
        this.put("units/stages/stage_0_1", List.of());
        this.put("units/stages/stage_0_2", List.of(MCLootTables.BASTION_OTHER_CHEST.get()));
        this.put("units/stages/stage_0_3", List.of());
        this.put("units/stages/stage_1_0", List.of());
        this.put("units/stages/stage_1_1", List.of());
        this.put("units/stages/stage_1_2", List.of(MCLootTables.BASTION_OTHER_CHEST.get()));
        this.put("units/stages/stage_1_3", List.of());
        this.put("units/stages/stage_2_0", List.of());
        this.put("units/stages/stage_2_1", List.of());
        this.put("units/stages/stage_3_0", List.of());
        this.put("units/stages/stage_3_1", List.of());
        this.put("units/stages/stage_3_2", List.of());
        this.put("units/stages/stage_3_3", List.of());
        this.put("units/wall_units/edge_0_large", List.of());
        this.put("units/wall_units/unit_0", List.of());
        this.put("units/walls/connected_wall", List.of());
        this.put("units/walls/wall_base", List.of(MCLootTables.BASTION_OTHER_CHEST.get(), MCLootTables.BASTION_OTHER_CHEST.get()));
        this.put("units/air_base", List.of());

        this.put("hoglin_stable/connectors/end_post_connector", List.of());
        this.put("hoglin_stable/large_stables/inner_0", List.of());
        this.put("hoglin_stable/large_stables/inner_1", List.of());
        this.put("hoglin_stable/large_stables/inner_2", List.of());
        this.put("hoglin_stable/large_stables/inner_3", List.of(MCLootTables.BASTION_HOGLIN_STABLE_CHEST.get()));
        this.put("hoglin_stable/large_stables/inner_4", List.of());
        this.put("hoglin_stable/large_stables/outer_0", List.of());
        this.put("hoglin_stable/large_stables/outer_1", List.of());
        this.put("hoglin_stable/large_stables/outer_2", List.of());
        this.put("hoglin_stable/large_stables/outer_3", List.of());
        this.put("hoglin_stable/large_stables/outer_4", List.of());
        this.put("hoglin_stable/posts/end_post", List.of());
        this.put("hoglin_stable/posts/stair_post", List.of());
        this.put("hoglin_stable/rampart_plates/rampart_plate_1", List.of());
        this.put("hoglin_stable/ramparts/ramparts_1", List.of(MCLootTables.BASTION_OTHER_CHEST.get(), MCLootTables.BASTION_OTHER_CHEST.get(), MCLootTables.BASTION_OTHER_CHEST.get()));
        this.put("hoglin_stable/ramparts/ramparts_2", List.of(MCLootTables.BASTION_OTHER_CHEST.get(), MCLootTables.BASTION_OTHER_CHEST.get()));
        this.put("hoglin_stable/ramparts/ramparts_3", List.of(MCLootTables.BASTION_OTHER_CHEST.get()));
        this.put("hoglin_stable/small_stables/inner_0", List.of());
        this.put("hoglin_stable/small_stables/inner_1", List.of());
        this.put("hoglin_stable/small_stables/inner_2", List.of(MCLootTables.BASTION_HOGLIN_STABLE_CHEST.get()));
        this.put("hoglin_stable/small_stables/inner_3", List.of());
        this.put("hoglin_stable/small_stables/outer_0", List.of());
        this.put("hoglin_stable/small_stables/outer_1", List.of());
        this.put("hoglin_stable/small_stables/outer_2", List.of());
        this.put("hoglin_stable/small_stables/outer_3", List.of());
        this.put("hoglin_stable/stairs/stairs_1_0", List.of());
        this.put("hoglin_stable/stairs/stairs_1_1", List.of());
        this.put("hoglin_stable/stairs/stairs_1_2", List.of());
        this.put("hoglin_stable/stairs/stairs_1_3", List.of());
        this.put("hoglin_stable/stairs/stairs_1_4", List.of());
        this.put("hoglin_stable/stairs/stairs_2_0", List.of());
        this.put("hoglin_stable/stairs/stairs_2_1", List.of());
        this.put("hoglin_stable/stairs/stairs_2_2", List.of());
        this.put("hoglin_stable/stairs/stairs_2_3", List.of());
        this.put("hoglin_stable/stairs/stairs_2_4", List.of());
        this.put("hoglin_stable/stairs/stairs_3_0", List.of());
        this.put("hoglin_stable/stairs/stairs_3_1", List.of());
        this.put("hoglin_stable/stairs/stairs_3_2", List.of());
        this.put("hoglin_stable/stairs/stairs_3_3", List.of());
        this.put("hoglin_stable/stairs/stairs_3_4", List.of());
        this.put("hoglin_stable/starting_pieces/stairs_0_mirrored", List.of());
        this.put("hoglin_stable/starting_pieces/stairs_1_mirrored", List.of());
        this.put("hoglin_stable/starting_pieces/stairs_2_mirrored", List.of());
        this.put("hoglin_stable/starting_pieces/stairs_3_mirrored", List.of());
        this.put("hoglin_stable/starting_pieces/stairs_4_mirrored", List.of());
        this.put("hoglin_stable/starting_pieces/starting_stairs_0", List.of());
        this.put("hoglin_stable/starting_pieces/starting_stairs_1", List.of());
        this.put("hoglin_stable/starting_pieces/starting_stairs_2", List.of());
        this.put("hoglin_stable/starting_pieces/starting_stairs_3", List.of());
        this.put("hoglin_stable/starting_pieces/starting_stairs_4", List.of());
        this.put("hoglin_stable/walls/side_wall_0", List.of(MCLootTables.BASTION_OTHER_CHEST.get()));
        this.put("hoglin_stable/walls/side_wall_1", List.of());
        this.put("hoglin_stable/walls/wall_base", List.of(MCLootTables.BASTION_OTHER_CHEST.get()));
        this.put("hoglin_stable/air_base", List.of());

        this.put("treasure/bases/centers/center_0", List.of(MCLootTables.BASTION_TREASURE_CHEST.get()));
        this.put("treasure/bases/centers/center_1", List.of(MCLootTables.BASTION_TREASURE_CHEST.get(), MCLootTables.BASTION_TREASURE_CHEST.get()));
        this.put("treasure/bases/centers/center_2", List.of(MCLootTables.BASTION_TREASURE_CHEST.get()));
        this.put("treasure/bases/centers/center_3", List.of(MCLootTables.BASTION_TREASURE_CHEST.get()));
        this.put("treasure/bases/lava_basin", List.of());
        this.put("treasure/brains/center_brain", List.of());
        this.put("treasure/connectors/center_to_wall_middle", List.of());
        this.put("treasure/connectors/center_to_wall_top", List.of());
        this.put("treasure/connectors/center_to_wall_top_entrance", List.of());
        this.put("treasure/corners/bottom/corner_0", List.of());
        this.put("treasure/corners/bottom/corner_1", List.of());
        this.put("treasure/corners/edges/bottom", List.of());
        this.put("treasure/corners/edges/middle", List.of());
        this.put("treasure/corners/edges/top", List.of());
        this.put("treasure/corners/middle/corner_0", List.of());
        this.put("treasure/corners/middle/corner_1", List.of());
        this.put("treasure/corners/top/corner_0", List.of());
        this.put("treasure/corners/top/corner_1", List.of());
        this.put("treasure/entrances/entrance_0", List.of());
        this.put("treasure/extensions/empty", List.of());
        this.put("treasure/extensions/fire_room", List.of());
        this.put("treasure/extensions/house_0", List.of());
        this.put("treasure/extensions/house_1", List.of());
        this.put("treasure/extensions/large_bridge_0", List.of());
        this.put("treasure/extensions/large_bridge_1", List.of());
        this.put("treasure/extensions/large_bridge_2", List.of());
        this.put("treasure/extensions/large_bridge_3", List.of());
        this.put("treasure/extensions/roofed_bridge", List.of());
        this.put("treasure/extensions/small_bridge_0", List.of());
        this.put("treasure/extensions/small_bridge_1", List.of());
        this.put("treasure/extensions/small_bridge_2", List.of());
        this.put("treasure/extensions/small_bridge_3", List.of());
        this.put("treasure/ramparts/bottom_wall_0", List.of());
        this.put("treasure/ramparts/lava_basin_main", List.of());
        this.put("treasure/ramparts/lava_basin_side", List.of());
        this.put("treasure/ramparts/mid_wall_main", List.of(MCLootTables.BASTION_OTHER_CHEST.get(), MCLootTables.BASTION_OTHER_CHEST.get()));
        this.put("treasure/ramparts/mid_wall_side", List.of(MCLootTables.BASTION_OTHER_CHEST.get(), MCLootTables.BASTION_OTHER_CHEST.get()));
        this.put("treasure/ramparts/top_wall", List.of());
        this.put("treasure/roofs/center_roof", List.of());
        this.put("treasure/roofs/corner_roof", List.of());
        this.put("treasure/roofs/wall_roof", List.of());
        this.put("treasure/stairs/lower_stairs", List.of());
        this.put("treasure/walls/bottom/wall_0", List.of(MCLootTables.BASTION_OTHER_CHEST.get()));
        this.put("treasure/walls/bottom/wall_1", List.of());
        this.put("treasure/walls/bottom/wall_2", List.of());
        this.put("treasure/walls/bottom/wall_3", List.of());
        this.put("treasure/walls/mid/wall_0", List.of());
        this.put("treasure/walls/mid/wall_1", List.of());
        this.put("treasure/walls/mid/wall_2", List.of());
        this.put("treasure/walls/outer/bottom_corner", List.of());
        this.put("treasure/walls/outer/medium_outer_wall", List.of());
        this.put("treasure/walls/outer/mid_corner", List.of());
        this.put("treasure/walls/outer/outer_wall", List.of());
        this.put("treasure/walls/outer/tall_outer_wall", List.of());
        this.put("treasure/walls/outer/top_corner", List.of());
        this.put("treasure/walls/top/main_entrance", List.of());
        this.put("treasure/walls/top/wall_0", List.of());
        this.put("treasure/walls/top/wall_1", List.of());
        this.put("treasure/walls/entrance_wall", List.of());
        this.put("treasure/walls/lava_wall", List.of());
        this.put("treasure/big_air_full", List.of());

        this.put("bridge/bridge_pieces/bridge", List.of());
        this.put("bridge/connectors/back_bridge_bottom", List.of());
        this.put("bridge/connectors/back_bridge_top", List.of());
        this.put("bridge/legs/leg_0", List.of());
        this.put("bridge/legs/leg_1", List.of());
        this.put("bridge/rampart_plates/plate_0", List.of());
        this.put("bridge/ramparts/rampart_0", List.of(MCLootTables.BASTION_OTHER_CHEST.get()));
        this.put("bridge/ramparts/rampart_1", List.of(MCLootTables.BASTION_OTHER_CHEST.get(), MCLootTables.BASTION_OTHER_CHEST.get(), MCLootTables.BASTION_OTHER_CHEST.get()));
        this.put("bridge/starting_pieces/entrance", List.of(MCLootTables.BASTION_BRIDGE_CHEST.get()));
        this.put("bridge/starting_pieces/entrance_base", List.of());
        this.put("bridge/starting_pieces/entrance_face", List.of());
        this.put("bridge/walls/wall_base_0", List.of());
        this.put("bridge/walls/wall_base_1", List.of());

    }};

    public static final HashMap<String, List<BPos>> STRUCTURE_LOOT_OFFSETS = new HashMap<>() {
    	private static final long serialVersionUID = 5187898898579028148L;
	{
        this.put("blocks/air", List.of());
        this.put("blokcs/gold", List.of());

        this.put("mobs/crossbow_piglin", List.of());
        this.put("mobs/empty", List.of());
        this.put("mobs/hoglin", List.of());
        this.put("mobs/melee_piglin", List.of());
        this.put("mobs/melee_piglin_always", List.of());
        this.put("mobs/sword_piglin", List.of());

        this.put("units/center_pieces/center_0", List.of(new BPos(8, 1, 3)));
        this.put("units/center_pieces/center_1", List.of(new BPos(6, 1, 9)));
        this.put("units/center_pieces/center_2", List.of(new BPos(1, 1, 7)));
        this.put("units/edges/edge_0", List.of());
        this.put("units/fillers/stage_0", List.of());
        this.put("units/pathways/pathway_0", List.of());
        this.put("units/pathways/pathway_wall_0", List.of());
        this.put("units/rampart_plates/plate_0", List.of());
        this.put("units/ramparts/ramparts_0", List.of(new BPos(7, 17, 7), new BPos(7, 17, 8), new BPos(7, 17, 12)));
        this.put("units/ramparts/ramparts_1", List.of(new BPos(3, 13, 6)));
        this.put("units/ramparts/ramparts_2", List.of());
        this.put("units/stages/rot/stage_1_0", List.of());
        this.put("units/stages/stage_0_0", List.of());
        this.put("units/stages/stage_0_1", List.of());
        this.put("units/stages/stage_0_2", List.of(new BPos(1, 4, 6)));
        this.put("units/stages/stage_0_3", List.of());
        this.put("units/stages/stage_1_0", List.of());
        this.put("units/stages/stage_1_1", List.of());
        this.put("units/stages/stage_1_2", List.of(new BPos(7, 1, 6)));
        this.put("units/stages/stage_1_3", List.of());
        this.put("units/stages/stage_2_0", List.of());
        this.put("units/stages/stage_2_1", List.of());
        this.put("units/stages/stage_3_0", List.of());
        this.put("units/stages/stage_3_1", List.of());
        this.put("units/stages/stage_3_2", List.of());
        this.put("units/stages/stage_3_3", List.of());
        this.put("units/wall_units/edge_0_large", List.of());
        this.put("units/wall_units/unit_0", List.of());
        this.put("units/walls/connected_wall", List.of());
        this.put("units/walls/wall_base", List.of(new BPos(2, 4, 5), new BPos(3, 4, 5)));
        this.put("units/air_base", List.of());

        this.put("hoglin_stable/connectors/end_post_connector", List.of());
        this.put("hoglin_stable/large_stables/inner_0", List.of());
        this.put("hoglin_stable/large_stables/inner_1", List.of());
        this.put("hoglin_stable/large_stables/inner_2", List.of());
        this.put("hoglin_stable/large_stables/inner_3", List.of(new BPos(1, 1, 5)));
        this.put("hoglin_stable/large_stables/inner_4", List.of());
        this.put("hoglin_stable/large_stables/outer_0", List.of());
        this.put("hoglin_stable/large_stables/outer_1", List.of());
        this.put("hoglin_stable/large_stables/outer_2", List.of());
        this.put("hoglin_stable/large_stables/outer_3", List.of());
        this.put("hoglin_stable/large_stables/outer_4", List.of());
        this.put("hoglin_stable/posts/end_post", List.of());
        this.put("hoglin_stable/posts/stair_post", List.of());
        this.put("hoglin_stable/rampart_plates/rampart_plate_1", List.of());
        this.put("hoglin_stable/ramparts/ramparts_1", List.of(new BPos(7, 17, 7), new BPos(7, 17, 8), new BPos(7, 17, 11)));
        this.put("hoglin_stable/ramparts/ramparts_2", List.of(new BPos(12, 3, 13), new BPos(3, 13, 9)));
        this.put("hoglin_stable/ramparts/ramparts_3", List.of(new BPos(6, 3, 4)));
        this.put("hoglin_stable/small_stables/inner_0", List.of());
        this.put("hoglin_stable/small_stables/inner_1", List.of());
        this.put("hoglin_stable/small_stables/inner_2", List.of(new BPos(3, 1, 6)));
        this.put("hoglin_stable/small_stables/inner_3", List.of());
        this.put("hoglin_stable/small_stables/outer_0", List.of());
        this.put("hoglin_stable/small_stables/outer_1", List.of());
        this.put("hoglin_stable/small_stables/outer_2", List.of());
        this.put("hoglin_stable/small_stables/outer_3", List.of());
        this.put("hoglin_stable/stairs/stairs_1_0", List.of());
        this.put("hoglin_stable/stairs/stairs_1_1", List.of());
        this.put("hoglin_stable/stairs/stairs_1_2", List.of());
        this.put("hoglin_stable/stairs/stairs_1_3", List.of());
        this.put("hoglin_stable/stairs/stairs_1_4", List.of());
        this.put("hoglin_stable/stairs/stairs_2_0", List.of());
        this.put("hoglin_stable/stairs/stairs_2_1", List.of());
        this.put("hoglin_stable/stairs/stairs_2_2", List.of());
        this.put("hoglin_stable/stairs/stairs_2_3", List.of());
        this.put("hoglin_stable/stairs/stairs_2_4", List.of());
        this.put("hoglin_stable/stairs/stairs_3_0", List.of());
        this.put("hoglin_stable/stairs/stairs_3_1", List.of());
        this.put("hoglin_stable/stairs/stairs_3_2", List.of());
        this.put("hoglin_stable/stairs/stairs_3_3", List.of());
        this.put("hoglin_stable/stairs/stairs_3_4", List.of());
        this.put("hoglin_stable/starting_pieces/stairs_0_mirrored", List.of());
        this.put("hoglin_stable/starting_pieces/stairs_1_mirrored", List.of());
        this.put("hoglin_stable/starting_pieces/stairs_2_mirrored", List.of());
        this.put("hoglin_stable/starting_pieces/stairs_3_mirrored", List.of());
        this.put("hoglin_stable/starting_pieces/stairs_4_mirrored", List.of());
        this.put("hoglin_stable/starting_pieces/starting_stairs_0", List.of());
        this.put("hoglin_stable/starting_pieces/starting_stairs_1", List.of());
        this.put("hoglin_stable/starting_pieces/starting_stairs_2", List.of());
        this.put("hoglin_stable/starting_pieces/starting_stairs_3", List.of());
        this.put("hoglin_stable/starting_pieces/starting_stairs_4", List.of());
        this.put("hoglin_stable/walls/side_wall_0", List.of(new BPos(9, 7, 9)));
        this.put("hoglin_stable/walls/side_wall_1", List.of());
        this.put("hoglin_stable/walls/wall_base", List.of(new BPos(12, 4, 13)));
        this.put("hoglin_stable/air_base", List.of());

        this.put("treasure/bases/centers/center_0", List.of(new BPos(4, 3, 6)));
        this.put("treasure/bases/centers/center_1", List.of(new BPos(2, 3, 6), new BPos(4, 3, 6)));
        this.put("treasure/bases/centers/center_2", List.of(new BPos(1, 2, 4)));
        this.put("treasure/bases/centers/center_3", List.of(new BPos(3, 3, 5)));
        this.put("treasure/bases/lava_basin", List.of());
        this.put("treasure/brains/center_brain", List.of());
        this.put("treasure/connectors/center_to_wall_middle", List.of());
        this.put("treasure/connectors/center_to_wall_top", List.of());
        this.put("treasure/connectors/center_to_wall_top_entrance", List.of());
        this.put("treasure/corners/bottom/corner_0", List.of());
        this.put("treasure/corners/bottom/corner_1", List.of());
        this.put("treasure/corners/edges/bottom", List.of());
        this.put("treasure/corners/edges/middle", List.of());
        this.put("treasure/corners/edges/top", List.of());
        this.put("treasure/corners/middle/corner_0", List.of());
        this.put("treasure/corners/middle/corner_1", List.of());
        this.put("treasure/corners/top/corner_0", List.of());
        this.put("treasure/corners/top/corner_1", List.of());
        this.put("treasure/entrances/entrance_0", List.of());
        this.put("treasure/extensions/empty", List.of());
        this.put("treasure/extensions/fire_room", List.of());
        this.put("treasure/extensions/house_0", List.of());
        this.put("treasure/extensions/house_1", List.of());
        this.put("treasure/extensions/large_bridge_0", List.of());
        this.put("treasure/extensions/large_bridge_1", List.of());
        this.put("treasure/extensions/large_bridge_2", List.of());
        this.put("treasure/extensions/large_bridge_3", List.of());
        this.put("treasure/extensions/roofed_bridge", List.of());
        this.put("treasure/extensions/small_bridge_0", List.of());
        this.put("treasure/extensions/small_bridge_1", List.of());
        this.put("treasure/extensions/small_bridge_2", List.of());
        this.put("treasure/extensions/small_bridge_3", List.of());
        this.put("treasure/ramparts/bottom_wall_0", List.of());
        this.put("treasure/ramparts/lava_basin_main", List.of());
        this.put("treasure/ramparts/lava_basin_side", List.of());
        this.put("treasure/ramparts/mid_wall_main", List.of(new BPos(11, 29, 6), new BPos(13, 29, 8)));
        this.put("treasure/ramparts/mid_wall_side", List.of(new BPos(11, 29, 6), new BPos(11, 29, 7)));
        this.put("treasure/ramparts/top_wall", List.of());
        this.put("treasure/roofs/center_roof", List.of());
        this.put("treasure/roofs/corner_roof", List.of());
        this.put("treasure/roofs/wall_roof", List.of());
        this.put("treasure/stairs/lower_stairs", List.of());
        this.put("treasure/walls/bottom/wall_0", List.of(new BPos(3, 6, 2)));
        this.put("treasure/walls/bottom/wall_1", List.of());
        this.put("treasure/walls/bottom/wall_2", List.of());
        this.put("treasure/walls/bottom/wall_3", List.of());
        this.put("treasure/walls/mid/wall_0", List.of());
        this.put("treasure/walls/mid/wall_1", List.of());
        this.put("treasure/walls/mid/wall_2", List.of());
        this.put("treasure/walls/outer/bottom_corner", List.of());
        this.put("treasure/walls/outer/medium_outer_wall", List.of());
        this.put("treasure/walls/outer/mid_corner", List.of());
        this.put("treasure/walls/outer/outer_wall", List.of());
        this.put("treasure/walls/outer/tall_outer_wall", List.of());
        this.put("treasure/walls/outer/top_corner", List.of());
        this.put("treasure/walls/top/main_entrance", List.of());
        this.put("treasure/walls/top/wall_0", List.of());
        this.put("treasure/walls/top/wall_1", List.of());
        this.put("treasure/walls/entrance_wall", List.of());
        this.put("treasure/walls/lava_wall", List.of());
        this.put("treasure/big_air_full", List.of());

        this.put("bridge/bridge_pieces/bridge", List.of());
        this.put("bridge/connectors/back_bridge_bottom", List.of());
        this.put("bridge/connectors/back_bridge_top", List.of());
        this.put("bridge/legs/leg_0", List.of());
        this.put("bridge/legs/leg_1", List.of());
        this.put("bridge/rampart_plates/plate_0", List.of());
        this.put("bridge/ramparts/rampart_0", List.of(new BPos(3, 13, 7)));
        this.put("bridge/ramparts/rampart_1", List.of(new BPos(7, 17, 7), new BPos(7, 17, 8), new BPos(7, 17, 12)));
        this.put("bridge/starting_pieces/entrance", List.of(new BPos(9, 16, 4)));
        this.put("bridge/starting_pieces/entrance_base", List.of());
        this.put("bridge/starting_pieces/entrance_face", List.of());
        this.put("bridge/walls/wall_base_0", List.of());
        this.put("bridge/walls/wall_base_1", List.of());

    }};
}
