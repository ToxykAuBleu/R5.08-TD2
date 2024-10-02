package com.toxykaubleu.arabicRomanNumerals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.*;

class ArabicRomanNumeralsTest {
    @ParameterizedTest()
    @CsvSource({
            "1, 'I'",
            "3, 'III'",
            "4, 'IV'",
            "10, 'X'",
            "39, 'XXXIX'",
            "40, 'XL'",
    })
    void convert_devrait_retourner_traduction_nombre_en_chiffre_romain(Integer param, String excepted) {
        // WHEN
        var result = ArabicRomanNumerals.convert(param);
        // THEN
        assertThat(result).isEqualTo(excepted);
    }
}