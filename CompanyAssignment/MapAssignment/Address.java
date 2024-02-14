package CompanyAssignment.MapAssignment;

public class Address{
    private String id;
    private String city;
    private String state;
    private String country;
    private String localAdd;
    public Address(String id, String city, String state, String country, String localAdd) {
        if(id==null || id.isEmpty() || city.isEmpty() || state.isEmpty() || country.isEmpty() || localAdd.isEmpty())
            throw new IllegalArgumentException("Please enter valid details");
        this.id = id;
        this.city = city;
        this.state = state;
        this.country = country;
        this.localAdd = localAdd;
    }
    public String getCity() {
        return city;
    }
    public String getState() {
        return state;
    }
    public String getCountry() {
        return country;
    }
    public String getLocalAddress() {
        return localAdd;
    }
    public String getAddress(){
        String address= country+" "+state+" "+city+" "+localAdd;
        return address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", localAdd='" + localAdd + '\'' +
                '}';
    }
}