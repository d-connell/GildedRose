package main.gildedrose;

public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {

            if (item.name.equals(ItemType.HAND.name)) {
                return;
            }

            item.sellIn = item.sellIn - 1;

            if (item.name.equals(ItemType.CHEESE.name)) {
                ItemType.CHEESE.updateQuality(item);
            } else if (item.name.equals(ItemType.PASS.name)) {
                ItemType.PASS.updateQuality(item);
            } else {
                ItemType.NORMAL.updateQuality(item);
            }

            int MINIMUM = 0;
            int MAXIMUM = 50;
            item.quality = Math.max(MINIMUM, item.quality);
            item.quality = Math.min(MAXIMUM, item.quality);
        }
    }
}