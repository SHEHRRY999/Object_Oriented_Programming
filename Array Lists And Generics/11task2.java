import java.util.ArrayList;

class MyMathClass<T extends Number> {
    public double standardDeviation(ArrayList<T> numbers) {
        double mean = 0.0;
        for (T number : numbers) {
            mean += number.doubleValue();
        }
        mean /= numbers.size();

        double variance = 0.0;
        for (T number : numbers) {
            variance += Math.pow(number.doubleValue() - mean, 2);
        }
        variance /= numbers.size();

        return Math.sqrt(variance);
    }
}

public class task2 {
    public static void main(String[] args) {
        MyMathClass<Integer> mathClass = new MyMathClass<>();
        ArrayList<Integer> intNumbers = new ArrayList<>();
        intNumbers.add(10);
        intNumbers.add(20);
        intNumbers.add(30);
        System.out.println("Standard Deviation of Integer List: " +
                mathClass.standardDeviation(intNumbers));

        MyMathClass<Double> mathClassDouble = new MyMathClass<>();
        ArrayList<Double> doubleNumbers = new ArrayList<>();
        doubleNumbers.add(10.5);
        doubleNumbers.add(20.5);
        doubleNumbers.add(30.5);
        System.out.println("Standard Deviation of Double List: " +
                mathClassDouble.standardDeviation(doubleNumbers));
        MyMathClass<String> mathClassString = new MyMathClass<>();
    }
}
