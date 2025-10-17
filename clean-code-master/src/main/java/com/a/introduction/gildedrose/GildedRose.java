package com.a.introduction.gildedrose;

import java.util.Arrays;

class GildedRose {

    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public static void main(String[] args) {

        Item[] items = new Item[]{
                new NormalItem("Default Item", 10, 20)
        };

        GildedRose app = new GildedRose(items);

        app.updateQuality();

        System.out.println(app);

    }

    public void updateQuality() {
        for (Item item : items) {
            item.update();
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }

}
