package com.toxykaubleu.arabicRomanNumerals;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ArabicRomanNumeralsTest {
    @Test()
    void convert_devrait_retourner_traduction_nombre_en_chiffre_romain() {
        // GIVEN
        Integer param = 3;
        // WHEN
        var result = ArabicRomanNumerals.convert(param);
        // THEN
        assertThat(result).isEqualTo("III");
    }
}