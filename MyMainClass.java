// Classe abstraite
abstract class Animal {
    // méthode abstraite (n'a pas de corps)
    public abstract void son();
    
    // méthode standard
    public void sleep() {
       System.out.println("Zzz");
    }
}

// Sous-classe (hérite de Animal)
class Cochon extends Animal {
    // Le corps de son() est fourni ici
    public void son() {
        System.out.println("Le cochon dit: wee wee");
        System.out.println("Le chat dit: miaou miaou");
    }
}

class Chat extends Animal {
    // Le corps de son() est fourni ici
    public void son() {
        System.out.println("Le chat dit: miaou miaou");
    }
}

public class MyMainClass {
    public static void main(String[] args) {
        Cochon monCochon = new Cochon(); // crée un objet Cochon
        monCochon.son();
        monCochon.sleep();
        Chat monChat = new Chat(); // crée un objet Cochon
        monChat.son();
        monChat.sleep();
    }

}
