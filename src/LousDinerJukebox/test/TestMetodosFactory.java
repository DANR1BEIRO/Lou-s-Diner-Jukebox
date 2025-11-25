package LousDinerJukebox.test;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestMetodosFactory {
    public static void main(String[] args) {
        /*
         * Metodos factory convenientes para colecoes:
         *
         * 1 - Colecoes resultantes não podem ser alteradas. Não é permitido
         * adicionar a elas ou alterar os valores; Nem mesmo ordenar os elementos.
         *
         * 2 - Coleções resultantes não são como as Collections padrão. Podemos
         * confiar nelas para se comportarem de acordo com suas interfaces: uma lista
         * sempre preservará a ordem em que os elementos foram inseridos; Uma Set nunca
         * terá valores duplicados. No entanto, não podemos confiar que sejam uma implementacão
         * específica de List, Set ou Map.
         *
         *
         */

        List<Book> listFacoryMethod = List.of(
                new Book("Caves of steel"),
                new Book("1984"),
                new Book("Clean Code"));

        Set<Book> treeFactoryMethod = Set.of(
                new Book("Caves of steel"),
                new Book("1984"),
                new Book("Clean Code"));

        /**
         * Map.of → rápido, direto, até 10 pares.
         * Map.ofEntries → sem limite, usa entry(...) para cada par.
         */
        Map<String, Book> mapFactoryMethod = Map.ofEntries(
                Map.entry("Asimov", new Book("Caves of steel")),
                Map.entry("Orwell", new Book("1984")),
                Map.entry("Andrew Hunt", new Book("The Pragmatic programmer")));

        /**
         * Quando tentamos chamar qualquer operação que altera a coleção:
         * A implementação interna dessa coleção imutável detecta a tentativa de modificação.
         * Ela lança a exceção UnsupportedOperationException.
         * A exceção surge em tempo de execução, porque a criação da coleção em si é válida;
         * o erro aparece somente no momento da tentativa de alteração.
         */
        System.out.println(treeFactoryMethod);

        /**
         * throw UnsupportedOperationException porque está tentando modificar uma coleção
         * resultante de um metodo factory:
         */

        treeFactoryMethod.add(new Book("Heads first: Java"));
        listFacoryMethod.add(new Book("Cosmos"));
        mapFactoryMethod.put("Sagan", new Book("Cosmos"));
    }
}
