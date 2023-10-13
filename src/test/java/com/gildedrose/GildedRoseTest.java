package com.gildedrose;
import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class GildedRoseTest {

  @Test
  @DisplayName("Test that the name is unchanged")
  void testName() {
    Item element = new Item("foo", 0, 0);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertEquals("foo", element.name, "the name changed");
  }
 
 
 
 @Test
  @DisplayName("Test that the sellIn is changed")
  void testsellIn() {
  Item element = new Item("foo", 0, 0);
  GildedRose app = new GildedRose(new Item[] {element});
  app.updateQuality();
  assertEquals(element.sellIn , -1);
  }
 
  @Test
  @DisplayName("Test that the quality is changed")
  void testQuality() {
  Item element = new Item("foo", 0, 20);
  GildedRose app = new GildedRose(new Item[] {element});
  app.updateQuality();
  assertEquals(element.sellIn , -1);
  assertEquals(element.quality, 18);
  }
 
  @Test
  @DisplayName("Test ")
  void testQualityAndSellIn() {
  Item element = new Item("foo", 1, -20);
  GildedRose app = new GildedRose(new Item[] {element});
  app.updateQuality();
  assertEquals(element.sellIn, 0);
  assertEquals(element.quality, -20);
  }

  @Test
  @DisplayName("Test that the quality will be incremented an d sellIn decremented")
  void testQualityIncremented1() {
  Item element = new Item("Aged Brie", 1, 20);
  GildedRose app = new GildedRose(new Item[] {element});
  app.updateQuality();
  assertEquals(element.sellIn, 0);
  assertEquals(element.quality, 21);
  }
 
  @Test
  @DisplayName("Test that the quality > 50")
  void testQualityIncremented2() {
  Item element = new Item("Aged Brie", 1, 50);
  GildedRose app = new GildedRose(new Item[] {element});
  app.updateQuality();
  assertEquals(element.sellIn, 0);
  assertEquals(element.quality, 50);
  }
 
  @Test
  @DisplayName("Test that the sellIn < 0")
  void testQualityIncremented() {
  Item element = new Item("Aged Brie", 0, 40);
  GildedRose app = new GildedRose(new Item[] {element});
  app.updateQuality();
  assertEquals(element.sellIn, -1);
  assertEquals(element.quality, 42);
  }
  @Test
  @DisplayName("Test equality<50 sellIn>0")
  void testEquality3() {
  Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 1, 20);
  GildedRose app = new GildedRose(new Item[] {element});
  app.updateQuality();
  assertEquals(element.sellIn, 0);
  assertEquals(element.quality, 23);
  }
 
  @Test
  @DisplayName("Test sellin>11 et quality>50 ")
  void testEquality4() {
  Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 11, 50);
  GildedRose app = new GildedRose(new Item[] {element});
  app.updateQuality();
  assertEquals(element.sellIn, 10);
  assertEquals(element.quality, 50);
  }
 
  @Test
  @DisplayName("Test sellIn >11 quality<50")
  void testEquality5() {
  Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 11, 40);
  GildedRose app = new GildedRose(new Item[] {element});
  app.updateQuality();
  assertEquals(element.sellIn, 10);
  assertEquals(element.quality, 41);
  }
 
 
  @Test
  @DisplayName("Test sellIn >6 quality<50")
  void testEquality6() {
  Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 6, 40);
  GildedRose app = new GildedRose(new Item[] {element});
  app.updateQuality();
  assertEquals(element.sellIn, 5);
  assertEquals(element.quality, 42);
  }

  @Test
  @DisplayName("Test sellIn < 0 equality<50")
  void testEquality7() {
  Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 0, 40);
  GildedRose app = new GildedRose(new Item[] {element});
  app.updateQuality();
  assertEquals(element.sellIn, -1);
  assertEquals(element.quality, 0);
  }
 
  @Test
  @DisplayName("Test sellIn >6 quality<50")
  void testEquality8() {
  Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 6, 40);
  GildedRose app = new GildedRose(new Item[] {element});
  app.updateQuality();
  assertEquals(element.sellIn, 5);
  assertEquals(element.quality, 42);
  }
 
  @Test
  @DisplayName("Test name = sulfuras")
  void testEquality9() {
  Item element = new Item("Sulfuras, Hand of Ragnaros", 0, 0);
  GildedRose app = new GildedRose(new Item[] {element});
  app.updateQuality();
  assertEquals(element.sellIn, 0);
  assertEquals(element.quality, 0);
  }
 
  @Test
  @DisplayName("Test name = sulfuras sellIn<0")
  void testEquality10() {
  Item element = new Item("Sulfuras, Hand of Ragnaros", -1, 0);
  GildedRose app = new GildedRose(new Item[] {element});
  app.updateQuality();
  assertEquals(element.sellIn, -1);
  assertEquals(element.quality, 0);
  }
 
  @Test
  @DisplayName("Test name = sulfuras, quality>50")
  void testEqua11() {
  Item element = new Item("Sulfuras, Hand of Ragnaros", -1, 50);
  GildedRose app = new GildedRose(new Item[] {element});
  app.updateQuality();
  assertEquals(element.sellIn, -1);
  assertEquals(element.quality,50);
  }
  @Test
  @DisplayName("Test sellIn < 6 quality=50")
  void testEqualityandsellin() {
  Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 4, 50);
  GildedRose app = new GildedRose(new Item[] {element});
  app.updateQuality();
  assertEquals(element.sellIn, 3);
  assertEquals(element.quality, 50);
  }
 @Test
  @DisplayName("Test sellIn<6 quality<50")
  void testeqetsellin() {
  Item element = new Item("Aged Brie", 3, 34);
  GildedRose app = new GildedRose(new Item[] {element});
  app.updateQuality();
  assertEquals(element.sellIn, 2);
  assertEquals(element.quality, 35);
  }

      @Test
      @DisplayName("Test the updateQuality method for a normal item")
    public void testUpdateQualityNormalItemegale0() {
    Item element = new Item("Normal item", 9, 0);
    GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertEquals(0, element.quality);
        assertEquals(8, element.sellIn);
    }
  

      @Test
      @DisplayName("Test the updateQuality method for a normal item")
    public void test14() {
    Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 9, 49);
    GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertEquals(50, element.quality);
        assertEquals(8, element.sellIn);
    }
 
  

      @Test
      @DisplayName("Test the updateQuality method for a normal item")
    public void test15UpdateQuality() {
    Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 48);
    GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertEquals(50, element.quality);
        assertEquals(4, element.sellIn);
    }
   
      @Test
      @DisplayName("Test the updateQuality method")
    public void test16UpdateQualityNormalItemegale0() {
    Item element = new Item("passes to ", -5, 0);
    GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertEquals(0, element.quality);
        assertEquals(-6, element.sellIn);
    }
   
  
          @Test
      @DisplayName("Test the updateQuality method for a normal item")
    public void test17UpdateQuality() {
    Item element = new Item("Aged Brie", -5, 49);
    GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertEquals(50, element.quality);
        assertEquals(-6, element.sellIn);
    }
   
   
     @Test
  @DisplayName("Test toString method")
  void testToString() {
  
    Item item = new Item("TestItem", 5, 10);

    String expected = "TestItem, 5, 10";

 
    String result = item.toString();
 
    assertEquals(expected, result, "toString() result is not as expected");
  }
   
   }
