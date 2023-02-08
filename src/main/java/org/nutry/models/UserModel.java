package org.nutry.models;
import java.util.Objects;

public class UserModel {
    private Integer id;
    private String Name;
    private String Surname;
    private String Email;

    public UserModel() {
    }

    public UserModel(Integer id, String name, String surname, String email) {
        this.id = id;
        Name = name;
        Surname = surname;
        Email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserModel userModel = (UserModel) o;
        return Objects.equals(id, userModel.id) && Objects.equals(Name, userModel.Name) && Objects.equals(Surname, userModel.Surname) && Objects.equals(Email, userModel.Email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, Name, Surname, Email);
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }
}
