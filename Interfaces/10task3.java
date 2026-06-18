interface compare {
    boolean compareObjects(Object o);
}

class InventoryItem {
    private String name;
    private int uniqueitemID;

    public InventoryItem(String name, int uniqueitemID) {
        this.name = name;
        this.uniqueitemID = uniqueitemID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUniqueitemID() {
        return uniqueitemID;
    }

    public void setUniqueitemID(int uniqueitemID) {
        this.uniqueitemID = uniqueitemID;
    }

    public boolean compareObjects(Object o) {
        if (o instanceof InventoryItem) {
            InventoryItem other = (InventoryItem) o;
            return this.uniqueitemID == other.uniqueitemID;
        }
        return false;
    }
}

public class task3 {
    public static void main(String[] args) {
        InventoryItem item1 = new InventoryItem("Item1",
                101);
        InventoryItem item2 = new InventoryItem("Item2",
                102);
        InventoryItem item3 = new InventoryItem("Item3",
                101);

        System.out.println("Comparing item1 and item2: " +
                item1.compareObjects(item2));
        System.out.println("Comparing item1 and item3: " +
                item1.compareObjects(item3));
    }
}