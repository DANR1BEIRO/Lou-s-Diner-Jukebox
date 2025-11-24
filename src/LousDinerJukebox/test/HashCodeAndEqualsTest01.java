package LousDinerJukebox.test;

public class HashCodeAndEqualsTest01 {
    public static void main(String[] args) {
        String name1 = new String("goku");
        String name2 = name1;
        System.out.println(System.identityHashCode(name1));
        System.out.println(System.identityHashCode(name2));
        System.out.println("Tem o mesmo conteúdo (valor): " + name1.equals(name2));
        System.out.print("Referenciam o mesmo objeto na memória: ");
        System.out.println(true ? name1 == name2 : false);

        String name3 = new String("goku");
        String name4 = "goku";
        System.out.println(System.identityHashCode(name3));
        System.out.println(System.identityHashCode(name4));
        System.out.println("Tem o mesmo conteúdo (valor): " + name3.equals(name4));
        System.out.print("Referenciam o mesmo objeto na memória: ");
        System.out.println(true ? name3 == name4 : false);
    }
}

