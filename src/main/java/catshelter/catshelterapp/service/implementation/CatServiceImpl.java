package catshelter.catshelterapp.service.implementation;

import catshelter.catshelterapp.repository.CatRepository;
import catshelter.catshelterapp.service.CatService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class CatServiceImpl implements CatService {

    private final CatRepository catRepository;
    private final ModelMapper modelMapper;

    public CatServiceImpl(CatRepository catRepository, ModelMapper modelMapper) {
        this.catRepository = catRepository;
        this.modelMapper = modelMapper;
    }


    private void addCat() {
        //TODO
    }
}
