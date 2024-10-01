package com.toxykaubleu.facteursPremiers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class FacteursPremiersTest {

    static Stream<Arguments> generateSource() {
        return Stream.of(
                arguments(1, List.of()),
                arguments(2, List.of(2)),
                arguments(3, List.of(3)),
                arguments(4, List.of(2, 2)),
                arguments(6, List.of(2, 3)),
                arguments(8, List.of(2, 2, 2)),
                arguments(9, List.of(3 ,3)),
                arguments(12, List.of(2, 2, 3)),
                arguments(220, List.of(2, 2, 5, 11))
        );
    }

    @ParameterizedTest()
    @MethodSource("generateSource")
    void generate_doit_retourner_un_ensemble_de_int_si_param_sup_0(Integer param, List<Integer> excepted) {
        // WHEN
        var result = FacteursPremiers.generate(param);
        // THEN
        assertThat(result).isEqualTo(excepted);
    }
}