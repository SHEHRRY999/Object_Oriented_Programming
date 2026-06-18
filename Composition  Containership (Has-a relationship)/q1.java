class Address
{
    private int streetNo;
    private int houseNo;
    private String city;
    private String code;

    public void setStreetNo(int streetNo) {
        this.streetNo = streetNo;
    }

    public int getStreetNo() {
        return streetNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public int getHouseNo() {
        return houseNo;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
class Person{
    private String name;
    private Address address;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}
public class q1{
    public static void main(String [] args){
        Address address = new Address();
        address.setStreetNo(10);
        address.setHouseNo(5);
        address.setCity("Taxila");
        address.setCode("47060");

        Person person = new Person();
        person.setName("Shehryar");
        person.setAddress(address);

        System.out.println("Name: " + person.getName());
        System.out.println("Street No: " + person.getAddress().getStreetNo());
        System.out.println("House No: " + person.getAddress().getHouseNo());
        System.out.println("City: " + person.getAddress().getCity());
        System.out.println("Code: " + person.getAddress().getCode());
    }

}

