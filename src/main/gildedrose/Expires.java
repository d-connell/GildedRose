package main.gildedrose;

public interface Expires {

    default void updateSellIn(Item item) {
        item.sellIn -= 1;
    }
}
