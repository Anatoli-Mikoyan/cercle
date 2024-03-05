class Animal {
    public void son () {
        System.out.println("L'animal fait un son");
    }
}

class Chien extends Animal {
    public void son () {
        System.out.println("Le chien dit: bow bow");
    }
}

class Chat extends Animal {
    public void son () {
        System.out.println("Le chat dit: meow meow");
    }
}

class Canard extends Animal {
    public void son () {
        System.out.println("Le canard dit: quack quack");
    }
}

public class PolymorphismeExemple {
    public static void main(String arg[]) {
        //Creation des objets
        Animal animal = new Animal(); //Objet animal
        Animal chien = new Chien (); //Objet chien
        Animal chat= new Chat (); //Objet chat
        Animal canard = new Canard (); //Objet Canard
        
        animal.son ();
        chien.son ();
        chat.son ();
        canard.son();
    }
}
 }

