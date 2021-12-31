package test.gildedrose;

import main.gildedrose.ItemType;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemTypeTest {

    @Test
    void ShouldIdentifyHand() {
        ItemType itemType = ItemType.identifyItemType("Sulfuras, Hand of Ragnaros");
        assertEquals(itemType, ItemType.LEGENDARY);
    }

    @Test
    void ShouldIdentifyPass() {
        ItemType itemType = ItemType.identifyItemType("Backstage passes to a TAFKAL80ETC concert");
        assertEquals(itemType, ItemType.EVENT_PASS);
    }

    @Test
    void ShouldIdentifyCheese() {
        ItemType itemType = ItemType.identifyItemType("Aged Brie");
        assertEquals(itemType, ItemType.CHEESE);
    }

    @Test
    void ShouldIdentifyConjured() {
        ItemType itemType = ItemType.identifyItemType("Turkish Delight");
        assertEquals(itemType, ItemType.CONJURED);
    }

    @Test
    void ShouldIdentifyOther() {
        ItemType itemType = ItemType.identifyItemType("Elixir of the Mongoose");
        assertEquals(itemType, ItemType.NORMAL);
    }
}
