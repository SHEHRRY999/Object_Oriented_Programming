interface Enumeration {
    public boolean hasNext(int index);

    public Object getNext(int index);
}

class NameCollection implements Enumeration {
    String[] names = new String[100];

    public NameCollection(String[] names) {
        this.names = names;
    }

    public boolean hasNext(int index) {
        return index < names.length && names[index] != null;
    }

    public Object getNext(int index) {
        return names[index];
    }
}

public class task4 {
    public static void main(String[] args) {
        String[] sampleNames = { "SK", "Bilal", "Rafay", "Ali" };
        NameCollection nameCollection = new NameCollection(sampleNames);
        int index = 0;
        while (nameCollection.hasNext(index)) {
            System.out.println(nameCollection.getNext(index));
            index++;
        }
    }
}
