package main.gildedrose;

public enum ItemType {

    HAND ("Sulfuras, Hand of Ragnaros"),
    PASS ("Backstage passes to a TAFKAL80ETC concert"),
    CHEESE("Aged Brie");

    public String name;

    ItemType (String name) {
        this.name = name;
    }
}
