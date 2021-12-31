package test.gildedrose;

import main.gildedrose.GildedRose;
import main.gildedrose.Item;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HandTest {

    @Test
    void ShouldPassToConfirmFirstHandValues() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 0, 80) };
        GildedRose gildedRose = new GildedRose(items);

        int days = 30;

        for (int i = 0; i < days; i++) {
            gildedRose.updateQuality();
            assertEquals(0, items[0].sellIn);
            assertEquals(80, items[0].quality);
        }
    }
    @Test
    void ShouldPassToConfirmSecondHandValues() {
        Item[] items = new Item[]{new Item("Sulfuras, Hand of Ragnaros", -1, 80)};
        GildedRose gildedRose = new GildedRose(items);

        int days = 30;

        for (int i = 0; i < days; i++) {
            gildedRose.updateQuality();
            assertEquals(-1, items[0].sellIn);
            assertEquals(80, items[0].quality);
        }
    }
}
