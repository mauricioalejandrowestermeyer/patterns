package org.custom.prototype;

public class MainPrototypeApplication {

    public static void main(String[] args) {

        String animalType = args[0];
        Mascot aberration;
        Mascot original;
        if (animalType.equalsIgnoreCase("Cat")) {
            original = new Cat();
            original.setAge(10);
            original.setName("Felix");
        }
        else if (animalType.equalsIgnoreCase("Dog")) {
            original = new Dog();
            original.setAge(5);
            original.setName("Simurdiera");
        }
        else {
            throw new UnsupportedOperationException();
        }
        aberration = original.aberration(original);
        System.out.println("Tenia "+aberration.getAge()+" años...");
        System.out.println("Su nombre era "+aberration.getName()+"...");
        System.out.println(aberration.isEvil()? "...y la ciencia lo ha traido de vuelta para destruirlo todo" : "...y quiere a Fry");
    }
}
