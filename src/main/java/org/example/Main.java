package org.example;

public class Main {
    public static void main(String[] args) {

//        Car myCar = new Car();
//        myCar.honk();
//        myCar.display();

//        Bicycle bicycle = new Bicycle();
//        System.out.print("Bicycle says: ");bicycle.honk();
//        System.out.print("Bicycle says: ");bicycle.ringBell();

//        Circle circle = new Circle();
//        System.out.println(circle.display());
//        Rectangle rectangle = new Rectangle();
//        System.out.println(rectangle.display());

//        Dog dog = new Dog();
//        dog.breathe();
//        dog.makeSound();

//        Editor myEditor = new Editor();
//        CodeEditor myCodeEditor = new CodeEditor();
//        Editor polyEditor = new CodeEditor();
//        System.out.println("--- Regular Editor ---");
//        myEditor.openFile();
//        System.out.println("\n--- Code Editor ---");
//        myCodeEditor.openFile();
//        System.out.println("\n--- Polymorphic Editor ---");
//        polyEditor.openFile();

//        GameCharacter gameCharacter = new GameCharacter();
//        gameCharacter.takeDamage(100);
//        gameCharacter.display();
//        ArmoredCharacter armoredCharacter = new ArmoredCharacter();
//        armoredCharacter.takeDamage(100);
//        armoredCharacter.display();

        CheckingAccount checkingAccount = new CheckingAccount(100);
        checkingAccount.deducMonthlyFee();

    }
}