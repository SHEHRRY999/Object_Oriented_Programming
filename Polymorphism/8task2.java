class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOutstanding() {
        return false;
    }
}

class Student extends Person {
    private double CGPA;

    public Student(String name, double CGPA) {
        super(name);
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    @Override
    public boolean isOutstanding() {
        return CGPA > 3.5;
    }
}

class Professor extends Person {
    private int numberOfPublications;

    public Professor(String name, int numberOfPublications) {
        super(name);
        this.numberOfPublications = numberOfPublications;
    }

    public int getNumberOfPublications() {
        return numberOfPublications;
    }

    public void setNumberOfPublications(int numberOfPublications) {
        this.numberOfPublications = numberOfPublications;
    }

    @Override
    public boolean isOutstanding() {
        return numberOfPublications > 50;
    }
}

public class task2 {
    public static void main(String[] args) {
        Person[] people = {
                new Student("SK", 3.96),
                new Professor("Dr. Afraz", 100)
        };
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].getName() + " is outstanding: " + people[i].isOutstanding());
        }
    }
}
