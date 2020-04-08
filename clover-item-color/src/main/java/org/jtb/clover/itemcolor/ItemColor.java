package org.jtb.clover.itemcolor;

import android.content.Context;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ItemColor {
    public static final List<Integer> colors = new ArrayList<>(Arrays.asList(
            R.color.main_blue,
            R.color.main_green,
            R.color.main_orange,
            R.color.main_red,
            R.color.main_purple,
            R.color.main_yellow,
            R.color.main_salmon,
            R.color.main_light_orange,
            R.color.main_light_green,
            R.color.main_teal,
            R.color.main_violet,
            R.color.main_magenta,
            R.color.main_blue_85,
            R.color.main_green_85,
            R.color.main_orange_85,
            R.color.main_red_85,
            R.color.main_purple_85,
            R.color.main_yellow_85,
            R.color.main_light_green_85,
            R.color.main_teal_85,
            R.color.main_violet_85,
            R.color.main_magenta_85,
            R.color.main_blue_70,
            R.color.main_green_70,
            R.color.main_orange_70,
            R.color.main_red_70,
            R.color.main_purple_70,
            R.color.main_yellow_70));

    private static Random RANDOM = new Random();

    public static int colorInt(Context context, String id) {
        RANDOM.setSeed(id.hashCode());
        return context.getResources().getColor(colors.get(RANDOM.nextInt(colors.size())));
    }
}
