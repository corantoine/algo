package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class BuyTwoChocoTest {
    BuyTwoChocolates buyChocolates = new BuyTwoChocolates();

    @ParameterizedTest(name = "Test avec money={0}, prices={1}, moneyLeft={2}")
    @CsvSource({
            "3, '1,1,2', 1",
            "3, '3,2,3', 3",
            "3, '1,3,1', 1"
    })
    void buychocoTest(int money, String pricesStr, int moneyLeft) {
        // Conversion de la chaîne de caractères pricesStr en tableau d'entiers
        int[] prices = convertStringToInt(pricesStr);
        // Appel de la méthode buyChoco avec les paramètres prices et money
        int result = BuyTwoChocolates.buyChoco(prices, money);
        // Vérification que le résultat obtenu est égal au résultat attendu
        assertEquals(moneyLeft, result);
    }

    // Méthode pour convertir une chaîne de caractères en tableau d'entiers
    private int[] convertStringToInt(String str) {
        // Séparation de la chaîne en utilisant la virgule comme délimiteur
        String[] items = str.split(",");
        // Création d'un tableau d'entiers de la même longueur que le tableau de chaînes
        int[] result = new int[items.length];
        // Conversion de chaque élément de la chaîne en entier et stockage dans le tableau d'entiers
        for (int i = 0; i < items.length; i++) {
            result[i] = Integer.parseInt(items[i].trim());
        }
        // Retour du tableau d'entiers
        return result;
    }

}
