package Productv4;

import ie.atu.productv2.Software;

public class MusicDB {

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
}
