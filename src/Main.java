public class Main {

    public static void main(String[] args) {
        char[] red = {'r','e','d'};
        char[] blue = {'b','l','u','e'};
        Radiator r1 = new Radiator(red, 55, 1025);
        Radiator r2 = new Radiator(blue, 120, 5105);
        Radiator r3 = new Radiator(red, 15, 500);

        Radiator[] radiators = new Radiator[3];
        radiators[0] = r1;
        radiators[1] = r2;
        radiators[2] = r3;

        for (Radiator r : radiators) {
            r.diplay();
        }

        radiators[1].weight = 119;
        radiators[1].diplay();

        // wyświetl w kWh
        double powerInKwh = radiators[1].powerInKwh();
        if(powerInKwh >= 5) {
            System.out.println("High-power radiator.");
        } else {
            System.out.println("Low-power radiator");
        }
    }
}
