package LousDinerJukebox.test;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> score = new HashMap<>();

        score.put("Goku", 100);
        score.put("Gohan", 89);
        score.put("Goten", 56);

        System.out.println(score);
        System.out.println(score.get("Goku")); // o metodo get pega uma chave e retorna o valor associado a ela
    }
}

/**
 * Ao exibirmos um Map, ela fornece os pares key=value, entre chaves {}
 * em vez de entre colchetes [] que vemos quando printamos lists e sets.
 * ex: {Gohan=89, Goku=100, Goten=56}
 */