package com.paaram.icdNamaste.repo;
import com.paaram.icdNamaste.entity.Disease;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DiseaseRepository extends JpaRepository<Disease, String> {
    Optional<Disease> findByEnglishTranslation(String englishTranslation);
}
