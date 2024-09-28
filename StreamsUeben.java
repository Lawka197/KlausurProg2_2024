package org.example.aufgabe2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsUeben {

    // TODO nutzen Sie die Stream API um die folgenden Methoden zu implementieren
    //  alle Tests sollen grün werden.

    // TODO diese Methode soll eine Liste mit Namen filtern. Alle Namen die mit der übergebenen
    //  Buchstaben beginnen sollen ausgefiltert werden.
    public List<String> filterNamesStartingWith(List<String> names, char startingChar) {
        return names.stream().filter(name -> name.charAt(0) != startingChar).collect(Collectors.toList());
    }

    // TODO erhöhe alle Werte der übergebenen Liste um die number
    public List<Integer> addNumberToEach(List<Integer> input, int number) {
        return input.stream().map(n -> n + number).collect(Collectors.toList());
    }

    // TODO filter Sie alle negativen Zahlen aus der Liste
    public List<Integer> filterNegativeZahlen(List<Integer> numbersWithNegativ) {
        return numbersWithNegativ.stream().filter(n -> n >= 0).collect(Collectors.toList());
    }

}
