package model;

import javax.persistence.*;

@Entity
@Table (name = "DataUsers")
public class DataUsers {
    @Id
    @Column (name = "id")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @Column (name = "mobile")
    private int mobile;
    @Column(name = "email")
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "DataUsers{" +
                "id=" + id +
                ", mobile=" + mobile +
                ", email='" + email + '\'' +
                '}';
    }
}
