package main.gildedrose;

public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {

            if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
                return;
            }

            item.sellIn = item.sellIn - 1;

            if (item.name.equals("Backstage passes to a TAFKAL80ETC concert") && item.sellIn < 0) {
                item.quality = 0;
                return;
            }

            int change;

            if (item.name.equals("Aged Brie")) {
                change= item.sellIn < 0 ? 2 : 1;
            } else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                change = item.sellIn < 5 ? 3
                        : item.sellIn < 10 ? 2
                        : 1;
            } else {
                change = item.sellIn < 0 ? -2 : -1;
            }

            int MINIMUM = 0;
            int MAXIMUM = 50;
            item.quality = Math.max(MINIMUM, item.quality + change);
            item.quality = Math.min(MAXIMUM, item.quality);
        }
    }
}