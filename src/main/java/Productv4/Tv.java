package Productv4;

public class Tv extends Product{

    private String screenSize;
    private String manufacture;

    public Tv()
    {
        super();
        screenSize = " ";
        manufacture = " ";
        count++;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    @Override
    public String toString() {
        return super.toString() + " by " + manufacture + "\n" + "Screen Size is: \n" + screenSize;
    }
}
