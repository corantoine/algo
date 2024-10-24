package com.example.demo;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ConvertTemperatureTest {
    // Création d'une instance de la classe ConvertTemperature pour appeler la méthode convertTemperature
    ConvertTemperature converter = new ConvertTemperature();

    @Test
    public void testConvertingCelsiusIntoFahrenheitAndKelvin(){
    // Ici on définit la valeur de celsius que l'on veut tester
    double celsius = 4;
    // Ici on définit les valeurs attendues en kelvin et fahrenheit pour 4°C
    double[] expected = {277.15 ,39.2};
    // Ici on appelle la méthode convertTemperature et on lui passe "celsius" en params
    double[] result = converter.convertTemperature(celsius);
    // assertArrayEquals compare le tableau expected et le tableau result qui doivent être égaux :
    assertArrayEquals(expected, result);
    }
}
