/*
 * Curso: Desenvolvimento de sistemas
 *
 * Disciplina: Estrutura de dados 2
 *
 * Autora: Mishelle sousa silva
 */


//essa class serve para trabalhar com NO
public class No
{
     private RegistroOcorrencia informacao;

     private No esquerda, direita;   // Arvore
     private No anterior, proximo;  // Lista Dupla

     public No(RegistroOcorrencia info)//construtor
     {
         this.informacao = info;

         this.esquerda = this.direita = null;
         this.anterior = this.proximo = null;
     }
     public No(char info, int oco)//construtor
	 {
		 this.informacao = new RegistroOcorrencia(info, oco);
	     this.esquerda = this.direita = null;
	     this.anterior = this.proximo = null;
     }
     public No(char info, String oco)//construtor
	 {
	 		 this.informacao = new RegistroOcorrencia(info, oco);
	 	     this.esquerda = this.direita = null;
	 	     this.anterior = this.proximo = null;
	 }


     public void setInformacao(RegistroOcorrencia informacao)//seta a informação
     {
		 this.informacao = informacao;
     }

     public void setDireita(No direita)//seta na direita
     {
		 this.direita = direita;
	 }
     public void setEsquerda(No esquerda)//seta  na esquerda
     {
		 this.esquerda = esquerda;
     }
     public void setAnterior(No anterior)//seta no anterior
     {
		 this.anterior = anterior;
     }
     public void setProximo(No proximo)//seta no proximo
     {
		 this.proximo = proximo;
     }

     public RegistroOcorrencia getInformacao()//retorna a info
     {
		 return this.informacao;
     }

     public No getDireita()
     {
		 return this.direita;
     }
     public No getEsquerda()
     {
		 return this.esquerda;
     }
     public No getAnterior()
     {
		 return this.anterior;
     }
     public No getProximo()
     {
		 return this.proximo;
     }

     public String toString()
     {
         return ""+ getInformacao();
     }

}
