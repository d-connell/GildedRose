package test.gildedrose;

import main.gildedrose.ItemType;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemTypeTest {

    @Test
    void ShouldIdentifyHand() {
        ItemType itemType = ItemType.identifyItemType("Sulfuras, Hand of Ragnaros");
        assertEquals(itemType, ItemType.HAND);
    }

    @Test
    void ShouldIdentifyPass() {
        ItemType itemType = ItemType.identifyItemType("Backstage passes to a TAFKAL80ETC concert");
        assertEquals(itemType, ItemType.PASS);
    }

    @Test
    void ShouldIdentifyCheese() {
        ItemType itemType = ItemType.identifyItemType("Aged Brie");
        assertEquals(itemType, ItemType.CHEESE);
    }

    @Test
    void ShouldIdentifyOther() {
        ItemType itemType = ItemType.identifyItemType("Elixir of the Mongoose");
        assertEquals(itemType, ItemType.NORMAL);
    }
}
