package catshelter.catshelterapp.service.implementation;

import catshelter.catshelterapp.model.dto.AddCatDto;
import catshelter.catshelterapp.model.entity.Cat;
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

    @Override
    public void addCat(AddCatDto addCatDto) {
        Cat cat = modelMapper.map(addCatDto, Cat.class);
        catRepository.save(cat);
    }

    @Override
    public Cat findCatByName(String name) {
        return catRepository.findByName(name).orElse(null);
    }

}
