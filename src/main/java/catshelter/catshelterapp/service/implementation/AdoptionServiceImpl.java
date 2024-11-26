package catshelter.catshelterapp.service.implementation;

import catshelter.catshelterapp.model.entity.Adoption;
import catshelter.catshelterapp.model.entity.Cat;
import catshelter.catshelterapp.model.entity.User;
import catshelter.catshelterapp.repository.AdoptionRepository;
import catshelter.catshelterapp.service.AdoptionService;
import catshelter.catshelterapp.service.CatService;
import catshelter.catshelterapp.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class AdoptionServiceImpl implements AdoptionService {

    private final AdoptionRepository adoptionRepository;
    private final ModelMapper modelMapper;

    private final CatService catService;
    private final UserService userService;

    public AdoptionServiceImpl(AdoptionRepository adoptionRepository, ModelMapper modelMapper, CatService catService, UserService userService) {
        this.adoptionRepository = adoptionRepository;
        this.modelMapper = modelMapper;
        this.catService = catService;
        this.userService = userService;
    }


    @Override
    public void adoptCat(String catName, String username) {

        Cat cat = catService.findCatByName(catName);
        if (cat != null) {
            cat.setAdopted(true);
            User user = userService.findUserByUsername(username);
            Adoption adoption = new Adoption();
            adoption.setAdoptedCat(cat);
            adoption.setOwner(user);
            adoption.setDate(LocalDate.now());
            adoptionRepository.save(adoption);
        }
    }
}
