package Human;

import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Puppy", "Branco", 60, 5.5, "nada");
        Gato gato1 = new Gato("Morgana","Preto",16, 4.0,"Feliz");
        Passaro passaro1 = new Passaro("Zeca", "azul",2,0.1,"Neutro");

        cachorro1.soar();
        gato1.soar();
        passaro1.soar();
    }
}