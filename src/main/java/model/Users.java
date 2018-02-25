package model;

import javax.persistence.*;

@Entity
@Table (name = "Users")
public class Users {
    @Id
    @Column (name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "lastName")
    private String lastName;

    @OneToOne
    private DataUsers dataUsers;

    public DataUsers getDataUsers() {
        return dataUsers;
    }

    public void setDataUsers(DataUsers dataUsers) {
        this.dataUsers = dataUsers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
