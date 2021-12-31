package main.gildedrose;

public enum ItemType {

    HAND ("Sulfuras, Hand of Ragnaros") {
        public void updateQuality(Item item) {
            // This item never changes.
        }
    },
    PASS ("Backstage passes to a TAFKAL80ETC concert") {
        public void updateQuality(Item item) {
            if (item.sellIn < 0) {
                item.quality = 0;
            } else {
                item.quality += item.sellIn < 5 ? 3
                        : item.sellIn < 10 ? 2
                        : 1;
            }
        }
    },
    CHEESE("Aged Brie") {
        public void updateQuality(Item item) {
            item.quality += item.sellIn < 0 ? 2 : 1;
        }
    },
    NORMAL("Normal") {
        public void updateQuality(Item item) {
            item.quality += item.sellIn < 0 ? -2 : -1;
        }
    };

    public final String name;
    public abstract void updateQuality(Item item);

    ItemType (String name) {
        this.name = name;
    }
}
