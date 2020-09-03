package guru.springframework.services;

import guru.springframework.domain.UnitOfMeasure;
import guru.springframework.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnitOfMeasureService {

    private UnitOfMeasureRepository unitOfMeasureRepository;

    public UnitOfMeasureService(UnitOfMeasureRepository unitOfMeasureRepository) {
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    public List<UnitOfMeasure> getAll(){
       return unitOfMeasureRepository.findAllByDescription("description");
    }
}
//    public List<Doctor> getAll() {
//        return doctorRepository.findAll();
//    }