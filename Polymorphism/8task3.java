abstract class Convert {
    protected double val1;
    protected double val2;

    public Convert(double val1) {
        this.val1 = val1;
    }

    public double getVal1() {
        return val1;
    }

    public double getVal2() {
        return val2;
    }

    public void setVal1(double val1) {
        this.val1 = val1;
    }

    public abstract void compute();
}

class LToG extends Convert {
    public LToG(double liters) {
        super(liters);
    }

    @Override
    public void compute() {
        val2 = val1 * 0.264172;
    }
}

class FToC extends Convert {
    public FToC(double fahrenheit) {
        super(fahrenheit);
    }

    @Override
    public void compute() {
        val2 = (val1 - 32) * 5.0 / 9.0;
    }
}

class FToM extends Convert {
    public FToM(double feet) {
        super(feet);
    }

    @Override
    public void compute() {
        val2 = val1 * 0.3048;
    }
}

public class task3 {
    public static void main(String[] args) {
        LToG lToG = new LToG(10);
        lToG.compute();
        System.out.println(lToG.getVal1() + " liters is " + lToG.getVal2() + " gallons.");

        FToC fToC = new FToC(100);
        fToC.compute();
        System.out.println(fToC.getVal1() + " degrees Fahrenheit is " + fToC.getVal2() + " degrees Celsius.");

        FToM fToM = new FToM(10);
        fToM.compute();
        System.out.println(fToM.getVal1() + " feet is " + fToM.getVal2() + " meters.");
    }
}