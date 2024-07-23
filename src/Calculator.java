public class Calculator {
    int sum(int a, int b){
        return a+b;
    }

    int sum5Arguments(int a, int b, int c, int d, int e){
        return a+b+c+d+e;
    }

    int sumArray(int[] values){
        int sum = 0;
        for(int v : values){
            sum+=v;
        }
        return sum;
    }

    double avg(int[] values){
        return sumArray(values)/values.length;
    }
}
