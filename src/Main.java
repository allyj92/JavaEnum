enum Planet{
    MERCURY(1, 3.3011e23, 2439.7),
    VENUS(2, 4.8675e24, 6051.8),
    EARTH(3, 5.97237e24, 6371.0),
    MARS(4, 6.4171e23, 3389.5),
    JUPITER(5, 1.8982e27, 69911),
    SATURN(6, 5.6834e26, 58232),
    URANUS(7, 8.6810e25, 25362),
    NEPTUNE(8, 1.02413e26, 24622),
    PLUTO(9, 1.303e22, 1188.3);

    int number;
    double mass;
    double radius;

    Planet(int number, double mass, double radius) {
        this.number = number;
        this.mass = mass;
        this.radius = radius;
    }
}


public class Main {
    public static void main(String[] args) {
        Planet myPlanet = Planet.PLUTO;
        canILiveHere(myPlanet);
    }

    static void canILiveHere(Planet myPlanet){
        switch (myPlanet){
            case EARTH:
                System.out.println("You can live here  :)");
                System.out.println("This is planet #"+myPlanet.number);
                System.out.println("This is planet is "+myPlanet.mass+"kg");
                System.out.println("This is planet is "+myPlanet.radius+"km");
                break;
            default:
                System.out.println("You can't live here...yet");
                System.out.println("This is planet #"+myPlanet.number);
                System.out.println("This is planet is "+myPlanet.mass+"kg");
                System.out.println("This is planet is "+myPlanet.radius+"km");
                break;
        }
    }
}