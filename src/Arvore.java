/*
 * Curso: Desenvolvimento de sistemas
 *
 * Disciplina: Estrutura de dados 2
 *
 * Autora: Mishelle sousa silva
 */

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

public class Arvore implements Comparable<Arvore> {

     private No raiz;

     public Arvore(No Raiz){
		Raiz = null;
	 }

     public No getRaiz(){
         return this.raiz;
     }

     public void incluir (char Car, int Qtos){

         incluir(new No(new RegistroOcorrencia(Car,Qtos)));// inclui um caracter e quantos no meu registroOcorrencia
     }

     public void incluir (No novo){
         if (novo==null) return;// se for null
         if (this.raiz == null)  // primeiro No  (incluir no Nivel ZERO)
              this.raiz = novo;
         else
             incluir(this.raiz, novo);
     }

     private void incluir (No Raiz, No Novo){
         if (Novo.getInformacao().getCaracter() > Raiz.getInformacao().getCaracter()){ // direita
             if (Raiz.getDireita()==null)
                 Raiz.setDireita(Novo);
             else
                 incluir (Raiz.getDireita(), Novo);
         }
         else{ // esquerda
             if (Raiz.getEsquerda() == null)
                 Raiz.setEsquerda(Novo);
             else
                 incluir(Raiz.getEsquerda(), Novo);
         }
     }

     public int somaValores(){
           return somaTudo(this.raiz);
     }

     private int somaTudo(No Raiz){
         if (Raiz==null) return 0;
         if ((Raiz.getEsquerda()==null) && (Raiz.getDireita()==null))  // Folha
             return Raiz.getInformacao().getOcorrencia();

         return
                somaTudo(Raiz.getEsquerda()) +
                somaTudo(Raiz.getDireita()) + Raiz.getInformacao().getOcorrencia();
     }

     public String toString(){
         return visita(this.raiz);
     }

     private String visita(No Raiz){  // InOrdem

          if (Raiz == null) return "";

          return visita(Raiz.getEsquerda()) + " " +
                 Raiz.getInformacao() + " " +     // IN-ORDEM
                 visita(Raiz.getDireita());
     }

     public boolean equals(Arvore arv)
     {
		 if(arv == null)
		 	return false;

			return true;
	 }
	 public int compareTo(Arvore outra){

	     final int frequencia  = Integer.compare(RegistroOcorrencia.getOcorrencia(), outra.getRaiz().getOcorrencia());
	     if(frequencia != 0 )
	             return frequencia;
	     return Integer.compare(this.getRaiz().getCaracter(), outra.getRaiz().getCaracter());

    }
    //fazer metodo de arvores como remover e add??


}
