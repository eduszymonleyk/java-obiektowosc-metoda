public class Main {

    public static void main(String[] args) {
        // zadanie 1
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

        // zadanie 2
        double powerInKwh = radiators[1].powerInKwh();
        if(powerInKwh >= 5) {
            System.out.println("High-power radiator.");
        } else {
            System.out.println("Low-power radiator");
        }

        System.out.println("---------------");
        // zadanie 3
        Calculator c = new Calculator();

        int sum = c.sum(4,5);
        System.out.println("4 + 5 = "+sum);

        sum = c.sum(100,54);
        System.out.println("100 + 54 = "+sum);

        System.out.println("-123 + 4 = "+c.sum(-123,4));

        System.out.println("5+1+5+1+5 = "+c.sum5Arguments(5,1,5,1,5));

        System.out.println("---------------");
        // zadanie 4
        int[] values = {2,5,234,234,2,41,23,12,31};
        sum = c.sumArray(values);
        System.out.println("Wynik dodania elementów tablicy [2,5,234,234,2,41,23,12,31] = "+sum);


        int[] values2 = {1,1};
        sum = c.sumArray(values2);
        System.out.println("Wynik dodania elementów tablicy [1,1] = "+sum);

        System.out.println("średnia tablicy [2,5,234,234,2,41,23,12,31] = "+c.avg(values));
        System.out.println("średnia tablicy [1,1] = "+c.avg(values2));
    }
}
