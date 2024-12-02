package Productv4;

public class ProductDB {

    //  public static Book or Software getProduct(String productCode) {
    public static Product getProduct(String productCode) {

        Tv myTv = null;
        if (productCode.equalsIgnoreCase("Sam")) {
            myTv = new Tv();
            myTv.setCode(productCode);
            myTv.setDescription("Visual Studios");
            myTv.setPrice(57.50);
            myTv.setManufacture("Samsung");
            myTv.setScreenSize("43 Inch");
        } else if (productCode.equalsIgnoreCase("Tos")) {
            myTv = new Tv();
            myTv.setCode(productCode);
            myTv.setDescription("Visual Studios");
            myTv.setPrice(57.50);
            myTv.setManufacture("Toshiba");
            myTv.setScreenSize("55 Inch");
        } else if (productCode.equalsIgnoreCase("Lg")) {
            myTv = new Tv();
            myTv.setCode(productCode);
            myTv.setDescription("Visual Studios");
            myTv.setPrice(57.50);
            myTv.setManufacture("LG");
            myTv.setScreenSize("66 Inch");

        }

        return myTv;
    }


    public static Music getMusic(String productCode) {

        Music myMusic = null;
        if (productCode.equalsIgnoreCase("PINK")) {
            myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Visual Studios");
            myMusic.setPrice(57.50);
            myMusic.setArtist("Pink Floyd");
            myMusic.setLabel("Columbia Group");
        } else if (productCode.equalsIgnoreCase("PARK")) {
            myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Build Java apps");
            myMusic.setPrice(57.50);
            myMusic.setArtist("LinkinPark");
            myMusic.setLabel("Warner Records");
        } else if (productCode.equalsIgnoreCase("METAL")) {
            myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Latest MySQL");
            myMusic.setPrice(54.50);
            myMusic.setArtist("Metallica");
            myMusic.setLabel("Metallica Labeler");

        }

        return myMusic;
    }
    // In a more realistic application, this code would get the data for the product from a file or database
    // For now, this code just uses if/else statements to return the correct product data

    //We need all the book and software objects, but what kind of object do we return?
    //}
}

