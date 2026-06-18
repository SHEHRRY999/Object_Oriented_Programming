import java.util.*;

class Box<T> {
    private ArrayList<T> items;

    public Box() {
        items = new ArrayList<>();
    }

    public void add(T item) {
        items.add(item);
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public T drawItem() {
        if (isEmpty()) {
            return null;
        }
        int index = (int) (Math.random() * items.size());
        return items.get(index);
    }
}

public class task3 {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.add("ali");
        stringBox.add("Bilal");
        stringBox.add("sk");

        System.out.println("Drawing from String Box: " + stringBox.drawItem());

        Box<Integer> intBox = new Box<>();
        intBox.add(1);
        intBox.add(2);
        intBox.add(3);

        System.out.println("Drawing from Integer Box: " + intBox.drawItem());

        Box<Double> doubleBox = new Box<>();
        doubleBox.add(1.5);
        doubleBox.add(2.5);
        doubleBox.add(3.5);

        System.out.println("Drawing from Double Box: " + doubleBox.drawItem());

        Box<String> emptyBox = new Box<>();
        System.out.println("Drawing from Empty Box: " + emptyBox.drawItem());
    }
}
