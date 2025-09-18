package com.paaram.icdNamaste.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "namasteicdrel")
@Data
public class Disease {

    @Id
    private String namaste_codes;  // Primary Key
    private String english_transliteration;
    private String ancient_term;
    private String icd_tm2_term;
    @Column(name = "english_translation")
    private String englishTranslation;
    private String icd_tm2_code;
    private Long icd_tm2_entity_id;
}
