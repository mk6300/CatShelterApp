package catshelter.catshelterapp.model.dto;


import jakarta.validation.constraints.NotNull;

public class AddCatDto {
@NotNull
    private String name;

    private String breed;
@NotNull
    private String color;
@NotNull
    private Integer age;
@NotNull
    private boolean isAdopted;
@NotNull
    private String description;

    public AddCatDto(String name, String breed, String color, Integer age, boolean isAdopted, String description) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.isAdopted = isAdopted;
        this.description = description;
    }

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
}
