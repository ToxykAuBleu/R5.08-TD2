package com.toxykaubleu.jeuAction;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PersonnageTest {
    private Personnage monPersonnage;

    @BeforeEach()
    void setUp() {
        this.monPersonnage = new Personnage(Personnage.Orientation.NORD);
    }

    @Test()
    void touner_devrait_retourner_bonne_rotation_si_param_sup_0() {
        // GIVEN
        Integer param = 2;
        // WHEN
        var result = this.monPersonnage.tourner(param);
        // THEN
        assertThat(result).isEqualTo(Personnage.Orientation.SUD);
    }
}