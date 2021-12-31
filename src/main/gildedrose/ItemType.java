package main.gildedrose;

public enum ItemType implements Expires {
    HAND ("Sulfuras, Hand of Ragnaros") {
        @Override
        public void updateSellIn(Item item) {
            // This item never changes.
        }
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
            applyQualityLimits(item);
        }
    },

    CHEESE("Aged Brie") {
        public void updateQuality(Item item) {
            item.quality += item.sellIn < 0 ? 2 : 1;
            applyQualityLimits(item);
        }
    },

    NORMAL("Normal") {
        public void updateQuality(Item item) {
            item.quality += item.sellIn < 0 ? -2 : -1;
            applyQualityLimits(item);
        }
    };

    public final String name;
    public abstract void updateQuality(Item item);

    ItemType (String name) {
        this.name = name;
    }

    private static void applyQualityLimits(Item item) {
        int MINIMUM = 0;
        int MAXIMUM = 50;
        item.quality = Math.max(MINIMUM, item.quality);
        item.quality = Math.min(MAXIMUM, item.quality);
    }
}
