package test.gildedrose;

import main.gildedrose.GildedRose;
import main.gildedrose.Item;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PassTest {

    @Test
    void ShouldPassToConfirmFirstPassValues() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20) };
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();
        assertEquals(14, items[0].sellIn);
        assertEquals(21, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(13, items[0].sellIn);
        assertEquals(22, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(12, items[0].sellIn);
        assertEquals(23, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(11, items[0].sellIn);
        assertEquals(24, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(10, items[0].sellIn);
        assertEquals(25, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(9, items[0].sellIn);
        assertEquals(27, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(8, items[0].sellIn);
        assertEquals(29, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(7, items[0].sellIn);
        assertEquals(31, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(6, items[0].sellIn);
        assertEquals(33, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(5, items[0].sellIn);
        assertEquals(35, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(4, items[0].sellIn);
        assertEquals(38, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(3, items[0].sellIn);
        assertEquals(41, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(2, items[0].sellIn);
        assertEquals(44, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(1, items[0].sellIn);
        assertEquals(47, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(0, items[0].sellIn);
        assertEquals(50, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-1, items[0].sellIn);
        assertEquals(0, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-2, items[0].sellIn);
        assertEquals(0, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-3, items[0].sellIn);
        assertEquals(0, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-4, items[0].sellIn);
        assertEquals(0, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-5, items[0].sellIn);
        assertEquals(0, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-6, items[0].sellIn);
        assertEquals(0, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-7, items[0].sellIn);
        assertEquals(0, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-8, items[0].sellIn);
        assertEquals(0, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-9, items[0].sellIn);
        assertEquals(0, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-10, items[0].sellIn);
        assertEquals(0, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-11, items[0].sellIn);
        assertEquals(0, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-12, items[0].sellIn);
        assertEquals(0, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-13, items[0].sellIn);
        assertEquals(0, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-14, items[0].sellIn);
        assertEquals(0, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-15, items[0].sellIn);
        assertEquals(0, items[0].quality);
    }

    @Test
    void ShouldPassToConfirmSecondPassValues() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49) };
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();
        assertEquals(9, items[0].sellIn);
        assertEquals(50, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(8, items[0].sellIn);
        assertEquals(50, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(7, items[0].sellIn);
        assertEquals(50, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(6, items[0].sellIn);
        assertEquals(50, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(5, items[0].sellIn);
        assertEquals(50, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(4, items[0].sellIn);
        assertEquals(50, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(3, items[0].sellIn);
        assertEquals(50, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(2, items[0].sellIn);
        assertEquals(50, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(1, items[0].sellIn);
        assertEquals(50, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(0, items[0].sellIn);
        assertEquals(50, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-1, items[0].sellIn);
        assertEquals(0, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-2, items[0].sellIn);
        assertEquals(0, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-3, items[0].sellIn);
        assertEquals(0, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-4, items[0].sellIn);
        assertEquals(0, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-5, items[0].sellIn);
        assertEquals(0, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-6, items[0].sellIn);
        assertEquals(0, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-7, items[0].sellIn);
        assertEquals(0, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-8, items[0].sellIn);
        assertEquals(0, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-9, items[0].sellIn);
        assertEquals(0, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-10, items[0].sellIn);
        assertEquals(0, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-11, items[0].sellIn);
        assertEquals(0, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-12, items[0].sellIn);
        assertEquals(0, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-13, items[0].sellIn);
        assertEquals(0, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-14, items[0].sellIn);
        assertEquals(0, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-15, items[0].sellIn);
        assertEquals(0, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-16, items[0].sellIn);
        assertEquals(0, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-17, items[0].sellIn);
        assertEquals(0, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-18, items[0].sellIn);
        assertEquals(0, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-19, items[0].sellIn);
        assertEquals(0, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-20, items[0].sellIn);
        assertEquals(0, items[0].quality);
    }

    @Test
    void ShouldPassToConfirmThirdPassValues() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49) };
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();
        assertEquals(4, items[0].sellIn);
        assertEquals(50, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(3, items[0].sellIn);
        assertEquals(50, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(2, items[0].sellIn);
        assertEquals(50, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(1, items[0].sellIn);
        assertEquals(50, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(0, items[0].sellIn);
        assertEquals(50, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-1, items[0].sellIn);
        assertEquals(0, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-2, items[0].sellIn);
        assertEquals(0, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-3, items[0].sellIn);
        assertEquals(0, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-4, items[0].sellIn);
        assertEquals(0, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-5, items[0].sellIn);
        assertEquals(0, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-6, items[0].sellIn);
        assertEquals(0, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-7, items[0].sellIn);
        assertEquals(0, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-8, items[0].sellIn);
        assertEquals(0, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-9, items[0].sellIn);
        assertEquals(0, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-10, items[0].sellIn);
        assertEquals(0, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-11, items[0].sellIn);
        assertEquals(0, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-12, items[0].sellIn);
        assertEquals(0, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-13, items[0].sellIn);
        assertEquals(0, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-14, items[0].sellIn);
        assertEquals(0, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-15, items[0].sellIn);
        assertEquals(0, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-16, items[0].sellIn);
        assertEquals(0, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-17, items[0].sellIn);
        assertEquals(0, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-18, items[0].sellIn);
        assertEquals(0, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-19, items[0].sellIn);
        assertEquals(0, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-20, items[0].sellIn);
        assertEquals(0, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-21, items[0].sellIn);
        assertEquals(0, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-22, items[0].sellIn);
        assertEquals(0, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-23, items[0].sellIn);
        assertEquals(0, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-24, items[0].sellIn);
        assertEquals(0, items[0].quality);

        gildedRose.updateQuality();
        assertEquals(-25, items[0].sellIn);
        assertEquals(0, items[0].quality);
    }
}
