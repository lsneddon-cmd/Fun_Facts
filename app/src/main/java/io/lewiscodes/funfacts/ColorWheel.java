package io.lewiscodes.funfacts;

import android.graphics.Color;

public class ColorWheel {
    private final String[] colors = {
            "#39add1",
            "#3079ab",
            "#c25975",
            "#e15258",
            "#f9845b",
            "#838cc7",
            "#7d669e",
            "#53bbb4",
            "#51b46d",
            "#e0ab18",
            "#637a91",
            "#f092b0",
            "#b7c0c7"
    };

    public int getColor() {
        return Color.parseColor(colors[(int) Math.floor(Math.random() * colors.length)]);
    }
}
