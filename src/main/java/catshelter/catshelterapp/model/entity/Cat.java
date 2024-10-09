package catshelter.catshelterapp.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "cats")
public class Cat extends BaseEntity {

    @Column(nullable = false)
    private String name;
    @Column
    private String breed;
    @Column
    private String color;
    @Column
    private Integer age;

    @Column (name = "is_adopted", nullable = false)
    private boolean isAdopted;
    @Column
    private String description;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User owner;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isAdopted() {
        return isAdopted;
    }

    public void setAdopted(boolean adopted) {
        isAdopted = adopted;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return owner;
    }

    public void setUser(User owner) {
        this.owner = owner;
    }
}
