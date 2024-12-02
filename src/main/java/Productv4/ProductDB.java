package Productv4;

public class ProductDB {

    //  public static Book or Software getProduct(String productCode) {
    public static Product getProduct(String productCode) {

        Product myProduct = null;

        if (productCode.equalsIgnoreCase("Sam")) {
            Tv myTv = new Tv();
            myTv.setCode(productCode);
            myTv.setDescription("Samsung TV 1");
            myTv.setPrice(57.50);
            myTv.setManufacture("Samsung");
            myTv.setScreenSize("43 Inch");
            myProduct = myTv;
        } else if (productCode.equalsIgnoreCase("Tos")) {
            Tv myTv = new Tv();
            myTv.setCode(productCode);
            myTv.setDescription("Toshiba TV 1");
            myTv.setPrice(60.50);
            myTv.setManufacture("Toshiba");
            myTv.setScreenSize("55 Inch");
            myProduct = myTv;
        } else if (productCode.equalsIgnoreCase("Lg")) {
            Tv myTv = new Tv();
            myTv.setCode(productCode);
            myTv.setDescription("LG TV 1");
            myTv.setPrice(77.50);
            myTv.setManufacture("LG");
            myTv.setScreenSize("66 Inch");
            myProduct = myTv;
        }

        else if (productCode.equalsIgnoreCase("PINK")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Visual Studios");
            myMusic.setPrice(47.50);
            myMusic.setArtist("Pink Floyd");
            myMusic.setLabel("Columbia Group");
            myProduct = myMusic;
        } else if (productCode.equalsIgnoreCase("PARK")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("One More Light");
            myMusic.setPrice(43.50);
            myMusic.setArtist("LinkinPark");
            myMusic.setLabel("Warner Records");
            myProduct = myMusic;
        } else if (productCode.equalsIgnoreCase("METAL")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("METALLICA ALBUM");
            myMusic.setPrice(39.50);
            myMusic.setArtist("Metallica");
            myMusic.setLabel("Metallica Labeler");
            myProduct = myMusic;
        }

        return myProduct;
    }

}

