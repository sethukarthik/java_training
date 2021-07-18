package com.java_practice.bicycle_inherit;

public class Cat extends Animal{
	public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.testClassMethod();
        Animal myAnimal = myCat;
        Animal.testClassMethod();
        myAnimal.testInstanceMethod();
    }
}


// Methods that are already overridden by other candidates are ignored. This circumstance can arise when supertypes share a common ancestor.
//public interface Animal {
//    default public String identifyMyself() {
//        return "I am an animal.";
//    }
//}
//public interface EggLayer extends Animal {
//    default public String identifyMyself() {
//        return "I am able to lay eggs.";
//    }
//}
//public interface FireBreather extends Animal { }
//public class Dragon implements EggLayer, FireBreather {
//    public static void main (String... args) {
//        Dragon myApp = new Dragon();
//        System.out.println(myApp.identifyMyself());
//    }
//}