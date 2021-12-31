package main.gildedrose;

public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            ItemType itemType = ItemType.identifyItemType(item.name);
            itemType.updateSellIn(item);
            itemType.updateQuality(item);
        }
    }
}