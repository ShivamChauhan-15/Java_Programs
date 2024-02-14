import java.util.Objects;

class Emp{
    int id;
    String name;
    Emp(int id,String name){
        this.id=id;
        this.name=name;
    }
    void setId(int id){
        this.id=id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return id == emp.id && Objects.equals(name, emp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
public class HashValueMapExample
{

}
