package com.example.demo;
// Enoncé et lien de l'algo :
//https://leetcode.com/problems/defanging-an-ip-address/
//Given a valid (IPv4) IP address, return a defanged version of that IP address.
//A defanged IP address replaces every period "." with "[.]".
//
//Example 1:
//Input: address = "1.1.1.1"
//Output: "1[.]1[.]1[.]1"
//
//Example 2:
//Input: address = "255.100.50.0"
//Output: "255[.]100[.]50[.]0"
//
//Constraints:
//The given address is a valid IPv4 address.

//Objectif algo :
// Remplacer tous les "." d'une string par [.]
public class DefangingAnIpAddress {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
