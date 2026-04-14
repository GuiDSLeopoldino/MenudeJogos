package br.com.fiap.game.view;

import br.com.fiap.game.model.PersonagemMagico;
import br.com.fiap.game.model.PersonagemMagico;

public class Main {

    public static void main(String[] args) {

        //Criando um objeto do tipo Personagem Mágico
        PersonagemMagico mago = new PersonagemMagico("Gandalf", 100, "Magia");
        //Atribuindo valores aos atributos do objeto
        //mago.getNome() = "Gandalf";
        //mago.getNivelEnergia() = 100;
        //mago.getPoderMagico() = "Magia";

        //Exibindo valores dos atributos do objeto
        System.out.println(mago.getNome() + " Energia: " + mago.getNivelEnergia() + " Poder: " + mago.getPoderMagico());

        PersonagemMagico elfo = new PersonagemMagico("Legolas", 50, "Arqueira");
       // elfo.Nome() = "Legolas";
       // elfo.NivelEnergia() = 50;
       // elfo.PoderMagico() = "Arqueira";
        System.out.println(elfo.getNome() + " Energia: " + elfo.getNivelEnergia() + " Poder: " + elfo.getPoderMagico());
    }
}