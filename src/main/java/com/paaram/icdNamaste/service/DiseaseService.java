package com.paaram.icdNamaste.service;
import com.paaram.icdNamaste.entity.Disease;
import com.paaram.icdNamaste.repo.DiseaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DiseaseService {

    @Autowired
    private DiseaseRepository repository;

    public Optional<Disease> getDiseaseByCode(String code) {
        return repository.findById(code);
    }

    public Optional<Disease> getDiseaseByEnglishName(String name) {
        return repository.findByEnglishTranslation(name);
    }
}
