package catshelter.catshelterapp.service;

import catshelter.catshelterapp.model.dto.AddCatDto;
import catshelter.catshelterapp.model.entity.Cat;

public interface CatService {

    void addCat(AddCatDto addCatDto);

    Cat findCatByName(String name);


}
