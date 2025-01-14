package Xinyuiii.reecriture.BastionPools;

import com.seedfinding.mccore.util.pos.BPos;

import java.util.HashMap;

public class BastionStructureSize {
    public static final HashMap<String, BPos> STRUCTURE_SIZE = new HashMap() {{
            this.put("blocks/air", new BPos(1, 1, 1));
            this.put("blocks/gold_block", new BPos(1, 1, 1));

            this.put("mobs/crossbow_piglin", new BPos(1, 3, 1));
            this.put("mobs/empty", new BPos(1, 1, 1));
            this.put("mobs/hoglin", new BPos(2, 3, 2));
            this.put("mobs/melee_piglin", new BPos(1, 3, 1));
            this.put("mobs/melee_piglin_always", new BPos(1, 3, 1));
            this.put("mobs/sword_piglin", new BPos(1, 3, 1));

            this.put("units/center_pieces/center_0", new BPos(11, 7, 11));
            this.put("units/center_pieces/center_1", new BPos(11, 8, 11));
            this.put("units/center_pieces/center_2", new BPos(11, 8, 11));
            this.put("units/edges/edge_0", new BPos(12, 7, 8));
            this.put("units/fillers/stage_0", new BPos(12, 7, 8));
            this.put("units/pathways/pathway_0", new BPos(3, 2, 2));
            this.put("units/pathways/pathway_wall_0", new BPos(3, 2, 2));
            this.put("units/rampart_plates/plate_0", new BPos(5, 19, 16));
            this.put("units/ramparts/ramparts_0", new BPos(16, 32, 16));
            this.put("units/ramparts/ramparts_1", new BPos(16, 22, 16));
            this.put("units/ramparts/ramparts_2", new BPos(16, 12, 16));
            this.put("units/stages/rot/stage_1_0", new BPos(12, 7, 8));
            this.put("units/stages/stage_0_0", new BPos(12, 7, 8));
            this.put("units/stages/stage_0_1", new BPos(12, 7, 8));
            this.put("units/stages/stage_0_2", new BPos(12, 7, 8));
            this.put("units/stages/stage_0_3", new BPos(12, 7, 8));
            this.put("units/stages/stage_1_0", new BPos(12, 7, 8));
            this.put("units/stages/stage_1_1", new BPos(12, 7, 8));
            this.put("units/stages/stage_1_2", new BPos(12, 7, 8));
            this.put("units/stages/stage_1_3", new BPos(12, 7, 8));
            this.put("units/stages/stage_2_0", new BPos(12, 7, 8));
            this.put("units/stages/stage_2_1", new BPos(12, 7, 8));
            this.put("units/stages/stage_3_0", new BPos(12, 3, 8));
            this.put("units/stages/stage_3_1", new BPos(12, 3, 8));
            this.put("units/stages/stage_3_2", new BPos(12, 3, 8));
            this.put("units/stages/stage_3_3", new BPos(12, 3, 8));
            this.put("units/wall_units/edge_0_large", new BPos(12, 7, 9));
            this.put("units/wall_units/unit_0", new BPos(12, 7, 8));
            this.put("units/walls/connected_wall", new BPos(16, 24, 16));
            this.put("units/walls/wall_base", new BPos(16, 24, 16));
            this.put("units/air_base", new BPos(46, 24, 46));

            this.put("hoglin_stable/connectors/end_post_connector", new BPos(2, 2, 22));
            this.put("hoglin_stable/large_stables/inner_0", new BPos(14, 6, 8));
            this.put("hoglin_stable/large_stables/inner_1", new BPos(14, 6, 8));
            this.put("hoglin_stable/large_stables/inner_2", new BPos(14, 6, 8));
            this.put("hoglin_stable/large_stables/inner_3", new BPos(14, 6, 8));
            this.put("hoglin_stable/large_stables/inner_4", new BPos(14, 6, 8));
            this.put("hoglin_stable/large_stables/outer_0", new BPos(14, 6, 8));
            this.put("hoglin_stable/large_stables/outer_1", new BPos(14, 6, 8));
            this.put("hoglin_stable/large_stables/outer_2", new BPos(14, 6, 8));
            this.put("hoglin_stable/large_stables/outer_3", new BPos(14, 6, 8));
            this.put("hoglin_stable/large_stables/outer_4", new BPos(14, 6, 8));
            this.put("hoglin_stable/posts/end_post", new BPos(2, 24, 2));
            this.put("hoglin_stable/posts/stair_post", new BPos(2, 24, 10));
            this.put("hoglin_stable/rampart_plates/rampart_plate_1", new BPos(2, 19, 16));
            this.put("hoglin_stable/ramparts/ramparts_1", new BPos(16, 32, 16));
            this.put("hoglin_stable/ramparts/ramparts_2", new BPos(16, 21, 16));
            this.put("hoglin_stable/ramparts/ramparts_3", new BPos(16, 12, 16));
            this.put("hoglin_stable/small_stables/inner_0", new BPos(12, 6, 8));
            this.put("hoglin_stable/small_stables/inner_1", new BPos(12, 6, 8));
            this.put("hoglin_stable/small_stables/inner_2", new BPos(12, 6, 8));
            this.put("hoglin_stable/small_stables/inner_3", new BPos(12, 6, 8));
            this.put("hoglin_stable/small_stables/outer_0", new BPos(12, 6, 8));
            this.put("hoglin_stable/small_stables/outer_1", new BPos(12, 6, 8));
            this.put("hoglin_stable/small_stables/outer_2", new BPos(12, 6, 8));
            this.put("hoglin_stable/small_stables/outer_3", new BPos(12, 6, 8));
            this.put("hoglin_stable/stairs/stairs_1_0", new BPos(14, 6, 16));
            this.put("hoglin_stable/stairs/stairs_1_1", new BPos(14, 6, 16));
            this.put("hoglin_stable/stairs/stairs_1_2", new BPos(14, 6, 16));
            this.put("hoglin_stable/stairs/stairs_1_3", new BPos(14, 6, 16));
            this.put("hoglin_stable/stairs/stairs_1_4", new BPos(14, 6, 16));
            this.put("hoglin_stable/stairs/stairs_2_0", new BPos(14, 6, 16));
            this.put("hoglin_stable/stairs/stairs_2_1", new BPos(14, 6, 16));
            this.put("hoglin_stable/stairs/stairs_2_2", new BPos(14, 6, 16));
            this.put("hoglin_stable/stairs/stairs_2_3", new BPos(14, 6, 16));
            this.put("hoglin_stable/stairs/stairs_2_4", new BPos(14, 6, 16));
            this.put("hoglin_stable/stairs/stairs_3_0", new BPos(14, 6, 16));
            this.put("hoglin_stable/stairs/stairs_3_1", new BPos(14, 6, 16));
            this.put("hoglin_stable/stairs/stairs_3_2", new BPos(14, 6, 16));
            this.put("hoglin_stable/stairs/stairs_3_3", new BPos(14, 6, 16));
            this.put("hoglin_stable/stairs/stairs_3_4", new BPos(14, 6, 16));
            this.put("hoglin_stable/starting_pieces/stairs_0_mirrored", new BPos(15, 6, 16));
            this.put("hoglin_stable/starting_pieces/stairs_1_mirrored", new BPos(15, 6, 16));
            this.put("hoglin_stable/starting_pieces/stairs_2_mirrored", new BPos(15, 6, 16));
            this.put("hoglin_stable/starting_pieces/stairs_3_mirrored", new BPos(15, 6, 16));
            this.put("hoglin_stable/starting_pieces/stairs_4_mirrored", new BPos(15, 6, 16));
            this.put("hoglin_stable/starting_pieces/starting_stairs_0", new BPos(15, 6, 16));
            this.put("hoglin_stable/starting_pieces/starting_stairs_1", new BPos(15, 6, 16));
            this.put("hoglin_stable/starting_pieces/starting_stairs_2", new BPos(15, 6, 16));
            this.put("hoglin_stable/starting_pieces/starting_stairs_3", new BPos(15, 6, 16));
            this.put("hoglin_stable/starting_pieces/starting_stairs_4", new BPos(15, 6, 16));
            this.put("hoglin_stable/walls/side_wall_0", new BPos(16, 24, 16));
            this.put("hoglin_stable/walls/side_wall_1", new BPos(16, 24, 16));
            this.put("hoglin_stable/walls/wall_base", new BPos(16, 24, 16));
            this.put("hoglin_stable/air_base", new BPos(30, 24, 48));

            this.put("treasure/bases/centers/center_0", new BPos(7, 6, 8));
            this.put("treasure/bases/centers/center_1", new BPos(7, 6, 8));
            this.put("treasure/bases/centers/center_2", new BPos(7, 6, 8));
            this.put("treasure/bases/centers/center_3", new BPos(7, 6, 8));
            this.put("treasure/bases/lava_basin", new BPos(24, 11, 24));
            this.put("treasure/brains/center_brain", new BPos(2, 35, 2));
            this.put("treasure/connectors/center_to_wall_middle", new BPos(11, 1, 1));
            this.put("treasure/connectors/center_to_wall_top", new BPos(11, 1, 1));
            this.put("treasure/connectors/center_to_wall_top_entrance", new BPos(11, 1, 1));
            this.put("treasure/corners/bottom/corner_0", new BPos(5, 16, 5));
            this.put("treasure/corners/bottom/corner_1", new BPos(5, 16, 5));
            this.put("treasure/corners/edges/bottom", new BPos(2, 16, 2));
            this.put("treasure/corners/edges/middle", new BPos(2, 15, 2));
            this.put("treasure/corners/edges/top", new BPos(2, 17, 2));
            this.put("treasure/corners/middle/corner_0", new BPos(5, 15, 5));
            this.put("treasure/corners/middle/corner_1", new BPos(5, 15, 5));
            this.put("treasure/corners/top/corner_0", new BPos(5, 15, 5));
            this.put("treasure/corners/top/corner_1", new BPos(5, 15, 5));
            this.put("treasure/entrances/entrance_0", new BPos(19, 18, 20));
            this.put("treasure/extensions/empty", new BPos(1, 1, 1));
            this.put("treasure/extensions/fire_room", new BPos(10, 10, 10));
            this.put("treasure/extensions/house_0", new BPos(5, 12, 10));
            this.put("treasure/extensions/house_1", new BPos(5, 12, 10));
            this.put("treasure/extensions/large_bridge_0", new BPos(4, 2, 7));
            this.put("treasure/extensions/large_bridge_1", new BPos(4, 2, 5));
            this.put("treasure/extensions/large_bridge_2", new BPos(4, 2, 11));
            this.put("treasure/extensions/large_bridge_3", new BPos(4, 2, 16));
            this.put("treasure/extensions/roofed_bridge", new BPos(10, 6, 4));
            this.put("treasure/extensions/small_bridge_0", new BPos(3, 2, 4));
            this.put("treasure/extensions/small_bridge_1", new BPos(3, 2, 7));
            this.put("treasure/extensions/small_bridge_2", new BPos(3, 2, 5));
            this.put("treasure/extensions/small_bridge_3", new BPos(3, 2, 16));
            this.put("treasure/ramparts/bottom_wall_0", new BPos(16, 24, 14));
            this.put("treasure/ramparts/lava_basin_main", new BPos(19, 36, 14));
            this.put("treasure/ramparts/lava_basin_side", new BPos(19, 36, 14));
            this.put("treasure/ramparts/mid_wall_main", new BPos(17, 32, 14));
            this.put("treasure/ramparts/mid_wall_side", new BPos(17, 31, 14));
            this.put("treasure/ramparts/top_wall", new BPos(17, 18, 14));
            this.put("treasure/roofs/center_roof", new BPos(24, 2, 24));
            this.put("treasure/roofs/corner_roof", new BPos(5, 2, 5));
            this.put("treasure/roofs/wall_roof", new BPos(5, 2, 24));
            this.put("treasure/stairs/lower_stairs", new BPos(2, 5, 5));
            this.put("treasure/walls/bottom/wall_0", new BPos(5, 16, 24));
            this.put("treasure/walls/bottom/wall_1", new BPos(5, 16, 24));
            this.put("treasure/walls/bottom/wall_2", new BPos(5, 16, 24));
            this.put("treasure/walls/bottom/wall_3", new BPos(5, 16, 24));
            this.put("treasure/walls/mid/wall_0", new BPos(5, 15, 24));
            this.put("treasure/walls/mid/wall_1", new BPos(5, 15, 24));
            this.put("treasure/walls/mid/wall_2", new BPos(5, 15, 24));
            this.put("treasure/walls/outer/bottom_corner", new BPos(2, 16, 5));
            this.put("treasure/walls/outer/medium_outer_wall", new BPos(2, 16, 24));
            this.put("treasure/walls/outer/mid_corner", new BPos(5, 15, 2));
            this.put("treasure/walls/outer/outer_wall", new BPos(2, 15, 24));
            this.put("treasure/walls/outer/tall_outer_wall", new BPos(2, 17, 24));
            this.put("treasure/walls/outer/top_corner", new BPos(2, 17, 5));
            this.put("treasure/walls/top/main_entrance", new BPos(5, 15, 24));
            this.put("treasure/walls/top/wall_0", new BPos(5, 15, 24));
            this.put("treasure/walls/top/wall_1", new BPos(5, 15, 24));
            this.put("treasure/walls/entrance_wall", new BPos(2, 17, 24));
            this.put("treasure/walls/lava_wall", new BPos(2, 36, 14));
            this.put("treasure/big_air_full", new BPos(38, 48, 38));

            this.put("bridge/bridge_pieces/bridge", new BPos(31, 19, 16));
            this.put("bridge/connectors/back_bridge_bottom", new BPos(8, 8, 19));
            this.put("bridge/connectors/back_bridge_top", new BPos(8, 11, 19));
            this.put("bridge/legs/leg_0", new BPos(3, 22, 3));
            this.put("bridge/legs/leg_1", new BPos(3, 22, 3));
            this.put("bridge/ramparts_plates/plate_0", new BPos(2, 19, 16));
            this.put("bridge/ramparts/rampart_0", new BPos(16, 22, 16));
            this.put("bridge/ramparts/rampart_1", new BPos(16, 32, 16));
            this.put("bridge/starting_pieces/entrance", new BPos(17, 32, 32));
            this.put("bridge/starting_pieces/entrance_base", new BPos(16, 32, 32));
            this.put("bridge/starting_pieces/entrance_face", new BPos(5, 24, 32));
            this.put("bridge/walls/wall_base_0", new BPos(16, 24, 16));
            this.put("bridge/walls/wall_base_1", new BPos(16, 24, 16));

        }};
}