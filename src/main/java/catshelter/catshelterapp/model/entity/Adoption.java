package catshelter.catshelterapp.model.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "adoptions")
public class Adoption extends BaseEntity {

    @Column(nullable = false)
    private LocalDate date;

    @OneToOne
    @Column(nullable = false)
    private Cat adoptedCat;
    @ManyToOne
    @Column(nullable = false)
    private User user;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Cat getAdoptedCat() {
        return adoptedCat;
    }

    public void setAdoptedCat(Cat adoptedCat) {
        this.adoptedCat = adoptedCat;
    }

    public User getOwner() {
        return user;
    }

    public void setOwner(User user) {
        this.user = user;
    }
}
