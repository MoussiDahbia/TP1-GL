private void updateAgedBrieQuality(Item item) {
    if (item.quality < 50) {
        item.quality++;
    }

    item.sellIn--;

    if (item.sellIn < 0 && item.quality < 50) {
        item.quality++;
    }
}
/*
package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            updateItemQuality(item);
        }
    }

    private void updateItemQuality(Item item) {
        if (!isLegendary(item)) {
            decrementSellIn(item);
            if (isNormalItem(item)) {
                decrementQuality(item);
            } else {
                incrementQuality(item);
                if (isBackstagePasses(item)) {
                    handleBackstagePasses(item);
                }
            }
        }
        if (item.sellIn < 0) {
            if (!isAgedBrie(item) && !isBackstagePasses(item)) {
                if (!isLegendary(item)) {
                    decrementQuality(item);
                }
            } else {
                incrementQuality(item);
            }
        }
    }

    private boolean isLegendary(Item item) {
        return item.name.equals("Sulfuras, Hand of Ragnaros");
    }

    private boolean isNormalItem(Item item) {
        return !isAgedBrie(item) && !isBackstagePasses(item);
    }

    private boolean isAgedBrie(Item item) {
        return item.name.equals("Aged Brie");
    }

    private boolean isBackstagePasses(Item item) {
        return item.name.equals("Backstage passes to a TAFKAL80ETC concert");
    }

    private void decrementSellIn(Item item) {
        if (!isLegendary(item)) {
            item.sellIn--;
        }
    }

    private void decrementQuality(Item item) {
        if (item.quality > 0) {
            item.quality--;
        }
    }

    private void incrementQuality(Item item) {
        if (item.quality < 50) {
            item.quality++;
        }
    }

    private void handleBackstagePasses(Item item) {
        if (item.sellIn < 11) {
            incrementQuality(item);
        }
        if (item.sellIn < 6) {
            incrementQuality(item);
        }
    }
}


*/ 