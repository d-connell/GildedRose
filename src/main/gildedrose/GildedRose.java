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
        }
    }
}