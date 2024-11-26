package catshelter.catshelterapp.service.implementation;

import catshelter.catshelterapp.model.dto.AddPartnerDTO;
import catshelter.catshelterapp.model.entity.Partner;
import catshelter.catshelterapp.repository.PartnerRepository;
import catshelter.catshelterapp.service.PartnerService;
import org.modelmapper.ModelMapper;

public class PartnerServiceImpl implements PartnerService {

    private final PartnerRepository partnerRepository;

    private final ModelMapper modelMapper;

    public PartnerServiceImpl(PartnerRepository partnerRepository, ModelMapper modelMapper) {
        this.partnerRepository = partnerRepository;
        this.modelMapper = modelMapper;
    }


    @Override
    public void addPartner(AddPartnerDTO addPartnerDTO) {
        Partner partner = this.modelMapper.map(addPartnerDTO, Partner.class);
        if (this.partnerRepository.findByName(partner.getName()).isEmpty()) {
            this.partnerRepository.save(partner);
        }

    }
}
