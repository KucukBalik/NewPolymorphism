package Productv4;

public class TvDB {

    public static Tv getTv(String productCode) {

        Tv myTv = null;
        if (productCode.equalsIgnoreCase("PINK")) {
            myTv = new Tv();
            myTv.setCode(productCode);
            myTv.setDescription("Visual Studios");
            myTv.setPrice(57.50);
            myTv.setManufacture("Samsung");
            myTv.setScreenSize("43 Inch");
        } else if (productCode.equalsIgnoreCase("PARK")) {
            myTv = new Tv();
            myTv.setCode(productCode);
            myTv.setDescription("Visual Studios");
            myTv.setPrice(57.50);
            myTv.setManufacture("Toshiba");
            myTv.setScreenSize("55 Inch");
        } else if (productCode.equalsIgnoreCase("METAL")) {
            myTv = new Tv();
            myTv.setCode(productCode);
            myTv.setDescription("Visual Studios");
            myTv.setPrice(57.50);
            myTv.setManufacture("LG");
            myTv.setScreenSize("66 Inch");

        }

        return myTv;
    }

}
