public class Radiator {
    char[] color;
    double weight;
    int power;

    Radiator(char[] color, double weight, int power){
        this.color = color;
        this.weight = weight;
        this.power = power;
    }

    void diplay(){
        System.out.println("----------------");
        System.out.print("Color: ");
        for(char c : color){
            System.out.print(c);
        }
        System.out.println();
        System.out.println("Weight: "+weight);
        System.out.println("Power: "+power+"W");
    }

    double powerInKwh(){
        return (double)power/1000;
    }
}
