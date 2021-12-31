package main.gildedrose;

import java.util.Arrays;
import java.util.EnumSet;

public enum ItemType implements Expires {
    LEGENDARY(new String[]{
            "Sulfuras, Hand of Ragnaros"
    }) {
        @Override
        public void updateSellIn(Item item) {
            // This item never changes.
        }
        public void updateQuality(Item item) {
            // This item never changes.
        }
    },

    EVENT_PASS (new String[]{
            "Backstage passes to a TAFKAL80ETC concert"
    }) {
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

    CHEESE(new String[]{
            "Aged Brie"
    }) {
        public void updateQuality(Item item) {
            item.quality += item.sellIn < 0 ? 2 : 1;
            applyQualityLimits(item);
        }
    },

    CONJURED(new String[]{
            "Turkish Delight"
    }) {
        public void updateQuality(Item item) {
            item.quality += item.sellIn < 0 ? -4 : -2;
            applyQualityLimits(item);
        }
    },

    NORMAL(new String[]{}) {
        public void updateQuality(Item item) {
            item.quality += item.sellIn < 0 ? -2 : -1;
            applyQualityLimits(item);
        }
    };

    public final String[] names;
    public abstract void updateQuality(Item item);

    ItemType (String[] names) {
        this.names = names;
    }

    public static ItemType identifyItemType(String name) {
        return EnumSet.allOf(ItemType.class)
                .stream()
                .filter(itemType -> Arrays.asList(itemType.names).contains(name))
                .reduce(NORMAL, (acc, element) -> element);
    }

    private static void applyQualityLimits(Item item) {
        int MINIMUM = 0;
        int MAXIMUM = 50;
        item.quality = Math.max(MINIMUM, item.quality);
        item.quality = Math.min(MAXIMUM, item.quality);
    }
}
