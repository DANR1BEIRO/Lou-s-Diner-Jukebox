package LousDinerJukebox.test;

import java.util.List;

public class TestGenerics {
    public static void main(String[] args) {
        new TestGenerics().go();


    }

    public void go() {
        List<Animal> animals = List.of(new Dog(), new Cat(), new Dog());
        takeAnimal(animals);

        List<Dog> dogs = List.of(new Dog(), new Dog());
        takeAnimal(dogs);

        List<Cat> cats = List.of(new Cat(), new Cat(), new Cat());
        takeAnimal(cats);
    }


    /**
     * Regra essencial de covariância (? extends):
     * Quando usamos ? extends Animal, temos permissão para ler elementos como Animal,
     * mas não podemos adicionar nenhum elemento.
     * Porque o compilador não sabe exatamente qual é o subtipo que a lista realmente contém.
     *
     * lógica:
     * O parâmetro é List<? extends Animal>.
     * Isso significa: “uma lista de algum subtipo desconhecido de Animal”.
     * O tipo exato pode ser:
     *
     * List<Animal>
     * List<Dog>
     * List<Cat>
     * List<Hamster>
     *
     * qualquer coisa que estenda Animal.
     * O compilador não tem garantia de que é seguro inserir um Dog,
     * porque se a lista for na verdade uma List<Cat>, adicionar um Dog violaria o tipo da lista.
     *
     * Portanto:
     * Ler é seguro → todo elemento pode ser tratado como Animal.
     * Escrever é proibido → seria inseguro.
     */
    public static void takeAnimal(List<? extends Animal> animalList) {
        for (Animal animal : animalList) {
            animal.makeSound();
        }
        // animalList.add(new Dog()); <- erro de compilação
    }
}

abstract class Animal {

    void makeSound() {
        System.out.println("Generic animal make sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("bark");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("meow");
    }
}
