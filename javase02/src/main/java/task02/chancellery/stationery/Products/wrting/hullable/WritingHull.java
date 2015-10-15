package task02.chancellery.stationery.products.wrting.hullable;

import task02.chancellery.stationery.products.wrting.WritingColor;
import task02.chancellery.stationery.products.wrting.WritingItem;

/**
 * Created by Mao Shaco on 10/15/2015.
 */
public abstract class WritingHull extends WritingItem {
    private HullMaterial hullMaterial;

    public WritingHull(){
        super();
        this.hullMaterial = HullMaterial.Plastic;
    }
    public WritingHull(String producer, double cost, WritingColor color, HullMaterial hullMaterial) {
        super(producer, cost, color);
        this.hullMaterial = hullMaterial;
    }
}
