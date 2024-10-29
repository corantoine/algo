package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class DefangingAnIpAddressTest {

    private final DefangingAnIpAddress defangingAnIpAddress = new DefangingAnIpAddress();

    @Test
    void testDefangingAnIpAddress(){
        String address = "1.1.1.1";
        String result = "1[.]1[.]1[.]1";

        Assertions.assertEquals(result, defangingAnIpAddress.defangIPaddr(address));

        String address1 = "255.100.50.0";
        String result1 = "255[.]100[.]50[.]0";

        Assertions.assertEquals(result1, defangingAnIpAddress.defangIPaddr(address1));
    }

    @ParameterizedTest(name = "Remplacer les . de la String par des [.]")
    @CsvSource({
            "'1.1.1.1', '1[.]1[.]1[.]1'",
            "'255.100.50.0', '255[.]100[.]50[.]0'"
    })
    void parameterizedTestDefangingAnIpAddress(String address, String expected){
        // ARRANGE
        // Ne fait rien, pas besoin de traiter les données

        //ACT
        String result = defangingAnIpAddress.defangIPaddr(address);

        // ASSERT
        Assertions.assertEquals(result, expected);
    }
}
