package mentor;

public class Box {
    public double height;

    public double width ;

    public double length ;

    public Box() {
        double length = 110;
        double width = 50.5;
        double height = 22.5;

        double volume = height * width * length;
        System.out.println("volume is " + volume + " cm3");

    }
    public Box(double height) {
        this.height = height;
        double length = 90;
        double width = 55;
        double volume = height * width * length;
        System.out.println("volume is " + volume + " cm3");

    }

    public Box(double height, double width) {
        this.height = height;
        this.width = width;
        double length = 150;
        double volume = height * width * length;
        System.out.println("volume is " + volume + " cm3");
    }


    public Box(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
        double volume = height * width * length;
        System.out.println("volume is " + volume + " cm3");
    }
}


