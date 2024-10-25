package catshelter.catshelterapp.service.implementation;

import catshelter.catshelterapp.repository.AdoptionRepository;
import catshelter.catshelterapp.service.AdoptionService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class AdoptionServiceImpl implements AdoptionService {

    private final AdoptionRepository adoptionRepository;
    private final ModelMapper modelMapper;

    public AdoptionServiceImpl(AdoptionRepository adoptionRepository, ModelMapper modelMapper) {
        this.adoptionRepository = adoptionRepository;
        this.modelMapper = modelMapper;
    }


    private void adopt() {
        //TODO
    }
}
