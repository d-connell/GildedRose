package main.gildedrose;

public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {

            if (item.name.equals(ItemType.HAND.name)) {
                ItemType.HAND.updateSellIn(item);
                ItemType.HAND.updateQuality(item);
            } else if (item.name.equals(ItemType.CHEESE.name)) {
                ItemType.CHEESE.updateSellIn(item);
                ItemType.CHEESE.updateQuality(item);
            } else if (item.name.equals(ItemType.PASS.name)) {
                ItemType.PASS.updateSellIn(item);
                ItemType.PASS.updateQuality(item);
            } else {
                ItemType.NORMAL.updateSellIn(item);
                ItemType.NORMAL.updateQuality(item);
            }
        }
    }
}