package com.paaram.icdNamaste.controllers;
import com.paaram.icdNamaste.entity.Disease;
import com.paaram.icdNamaste.service.DiseaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/disease")
public class DiseaseController {
    @Autowired
    private DiseaseService service;

    @GetMapping("/code/{code}")
    public Optional<Disease> getDiseaseByCode(@PathVariable String code) {
        return service.getDiseaseByCode(code);
    }

    @GetMapping("/name/{name}")
    public Optional<Disease> getDiseaseByEnglishName(@PathVariable String name) {
        return service.getDiseaseByEnglishName(name);
    }
}

