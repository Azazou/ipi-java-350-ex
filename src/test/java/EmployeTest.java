package com.ipiecoles.java.java350.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.time.LocalDate;

class EmployeTest {

    void getNombreAnneeAncienneteWithDateEmbaucheNow(){
        //Given
        Employe employe = new Employe("Keanu", "Reeves", "T12345", null, 2500.0, 1 , 1.0);

        //when
        Integer nbAnnees = employe.getNombreAnneeAnciennete();

        //Then
        Assertions.assertThat(nbAnnees).isEqualTo(0);
    }

    @ParameterizedTest
    @CsvSource({
            "'M12345', 0, 1, 1.0, 1700.0"
    })
    void getPrimeAnnuelle(){
        //Given
        //Matricule, date embauche
        Employe employe = new Employe("Keanu", "Reeves", "T12345", LocalDate.now(), 2500.0, 1, 1.0);

        //when
        Double prime = employe.getPrimeAnnuelle();

        //then
        Assertions.assertThat(prime).isEqualTo(1700d);
    }
}
