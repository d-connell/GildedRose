package test.gildedrose;

import main.gildedrose.GildedRose;
import main.gildedrose.Item;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BrieTest {

    @Test
    void ShouldPassToConfirmBrieValues() {
        Item[] items = new Item[] { new Item("Aged Brie", 2, 0) };
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();
        assertEquals(1, items[0].sellIn);
        assertEquals(1, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(0, items[0].sellIn);
        assertEquals(2, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-1, items[0].sellIn);
        assertEquals(4, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-2, items[0].sellIn);
        assertEquals(6, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-3, items[0].sellIn);
        assertEquals(8, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-4, items[0].sellIn);
        assertEquals(10, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-5, items[0].sellIn);
        assertEquals(12, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-6, items[0].sellIn);
        assertEquals(14, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-7, items[0].sellIn);
        assertEquals(16, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-8, items[0].sellIn);
        assertEquals(18, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-9, items[0].sellIn);
        assertEquals(20, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-10, items[0].sellIn);
        assertEquals(22, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-11, items[0].sellIn);
        assertEquals(24, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-12, items[0].sellIn);
        assertEquals(26, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-13, items[0].sellIn);
        assertEquals(28, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-14, items[0].sellIn);
        assertEquals(30, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-15, items[0].sellIn);
        assertEquals(32, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-16, items[0].sellIn);
        assertEquals(34, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-17, items[0].sellIn);
        assertEquals(36, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-18, items[0].sellIn);
        assertEquals(38, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-19, items[0].sellIn);
        assertEquals(40, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-20, items[0].sellIn);
        assertEquals(42, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-21, items[0].sellIn);
        assertEquals(44, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-22, items[0].sellIn);
        assertEquals(46, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-23, items[0].sellIn);
        assertEquals(48, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-24, items[0].sellIn);
        assertEquals(50, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-25, items[0].sellIn);
        assertEquals(50, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-26, items[0].sellIn);
        assertEquals(50, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-27, items[0].sellIn);
        assertEquals(50, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-28, items[0].sellIn);
        assertEquals(50, items[0].quality);
    }
}
