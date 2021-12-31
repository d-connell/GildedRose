package main.gildedrose;

public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {

            if (item.name.equals("Aged Brie")) {
                item.sellIn -= 1;
                item.quality += item.sellIn < 0 ? 2 : 1;
                item.quality = Math.min(50, item.quality);
                return;
            }

            if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                item.sellIn -= 1;
                if (item.sellIn < 0) {
                    item.quality = 0;
                } else {
                    item.quality += item.sellIn < 5 ? 3
                            : item.sellIn < 10 ? 2
                            : 1;
                    item.quality = Math.min(50, item.quality);
                }
                return;
            }

            if (item.quality > 0) {
                if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                    item.quality = item.quality - 1;
                }
            }

            if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                item.sellIn = item.sellIn - 1;
            }

            if (item.sellIn < 0) {
                if (item.quality > 0) {
                    if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                        item.quality = item.quality - 1;
                    }
                }
            }
        }
    }
}