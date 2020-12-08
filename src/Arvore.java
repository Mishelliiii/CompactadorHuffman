/*
 * Curso: Desenvolvimento de sistemas
 *
 * Disciplina: Estrutura de dados 2
 *
 * Autora: Mishelle sousa silva
 */

import java.util.ArrayList;
import java.util.List;


//Essa class serve para trabalhar com a Arvore
public class Arvore  implements Comparable<Arvore>
{
     private No raiz;
     private RegistroOcorrencia informacao;

     List<No> listaBinario = new ArrayList<No>();

     public RegistroOcorrencia getInformacao()
     {
		 return this.informacao;
	 }
     public No getRaiz()
     {
         return this.raiz;
     }

     public void incluir (char Car, int Qtos)
     {

         incluir(new No(new RegistroOcorrencia(Car,Qtos)));// inclui um caracter e quantos no meu registroOcorrencia
     }

     public void incluir (No novo)
     {
         if (novo==null) return;// se for null
         if (this.raiz == null)  // primeiro No  (incluir no Nivel ZERO)
              this.raiz = novo;
         else
             incluir(this.raiz, novo);
     }

     private void incluir (No Raiz, No Novo)
     {
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

     public int somaValores()
     {
           return somaTudo(this.raiz);
     }

     private int somaTudo(No Raiz)
     {
         if (Raiz==null) return 0;
         if ((Raiz.getEsquerda()==null) && (Raiz.getDireita()==null))  // Folha
             return Raiz.getInformacao().getOcorrencia();

         return
                somaTudo(Raiz.getEsquerda()) +
                somaTudo(Raiz.getDireita()) + Raiz.getInformacao().getOcorrencia();
     }

     public String toString()
     {
         return visita(this.raiz);
     }

     private String visita(No Raiz)
     {  // InOrdem

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

	private int qtasFolhas(No Raiz)//traz quantas folhas eu tenho
	{
	      if (Raiz == null)
	      		return 0;
	      if ( (Raiz.getDireita()==null) &&(Raiz.getEsquerda()==null)) // Folha
	         	return 1;

	         return qtasFolhas(Raiz.getDireita()) + qtasFolhas(Raiz.getEsquerda());

     }
	 private String cadeAsFolhas(No Raiz)
	 {
	      if (Raiz == null) return "";
	      if ( (Raiz.getDireita()==null) &&
	            (Raiz.getEsquerda()==null)) // Folha
	           return "["+Raiz+"] ";

	          return cadeAsFolhas(Raiz.getDireita()) + cadeAsFolhas(Raiz.getEsquerda());
     }
     public String quemSaoAsFolhas()
	 {
	      return cadeAsFolhas(this.raiz);
	 }

	 public int compareTo(Arvore ar) //compareTo para que seja possivel ordernar a lista de arvores (List<Arvore>)
	 {
	     	final int oc  = Integer.compare(this.raiz.getInformacao().getOcorrencia(), ar.getRaiz().getInformacao().getOcorrencia());

	     	if(oc != 0 )
	             return oc;

	     	return Integer.compare(this.getRaiz().getInformacao().getCaracter(), ar.getRaiz().getInformacao().getCaracter());
     }

	public List<No> CriarBin()//retorna os valores binarios
	{
	        Binario(this.raiz,"");

	        return listaBinario;
	}

	private void Binario(No raiz,String s)//
	{
	        if (raiz.getEsquerda()== null && raiz.getDireita() == null)
	        {
	                listaBinario.add(new No(raiz.getInformacao().getCaracter(),s));
	                	return;
	        }
			if(raiz.getEsquerda() != null)
	       		 Binario(raiz.getEsquerda(), s + "0");

	        if(raiz.getDireita() != null)
				Binario(raiz.getDireita(), s + "1");

   }
}
