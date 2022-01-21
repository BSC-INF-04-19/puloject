package gilbertkamoto.embi;

import javax.persistence.*;

@Entity
@Table
public class House {

    @Id
    @SequenceGenerator(
            name="house_sequence",
            sequenceName="house_sequence",
            allocationSize = 1

    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "house_sequence"
    )
    private Long id;
    private String name;
    private String email;
    private String adress;


    @Transient
    private Integer age;

    public House() {
    }

    public House(Long id, String name, String email, String adress,Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.adress = adress;
        this.age=age;
    }

    public House(String name, String email, String adress,Integer age) {
        this.name = name;
        this.email = email;
        this.adress = adress;
        this.age=age;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
    private Integer getAge(){
        return age;
    }
    public void setAge(Integer age){
        this.age=age;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }

    public void getname() {
    }

    public Object setname() {
        return null;
    }
}
