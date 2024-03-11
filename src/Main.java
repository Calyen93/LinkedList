import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Fruit> fruits = new LinkedList<>();

        fruits.add(new Fruit("Apple"));
        fruits.add(new Fruit("Banana"));
        fruits.add(new Fruit("Kiwi"));
        fruits.add(new Fruit("Mango"));

        System.out.println("Collezione originale:");
        printLinkedList(fruits);

        fruits.addFirst(new Fruit("Lemon"));

        fruits.addLast(new Fruit("Cider"));

        System.out.println("\nNuova lista:");
        printLinkedList(fruits);

    }

    public static void printLinkedList(LinkedList<Fruit> fruits) {
        for (Fruit fruit : fruits) {
            System.out.println(fruit.getName());
        }
    }

}
