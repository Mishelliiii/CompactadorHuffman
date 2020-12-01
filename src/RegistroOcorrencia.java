/*
 * Curso: Desenvolvimento de sistemas
 *
 * Disciplina: Estrutura de dados 2
 *
 * Autora: Mishelle sousa silva
 */

public class RegistroOcorrencia implements Comparable{
    private char caracter;
    private int ocorrencia;

    public RegistroOcorrencia(char caracter, int ocorrencia) {
        this.caracter = caracter;
        this.ocorrencia = ocorrencia;
    }
    public RegistroOcorrencia(int ocorrencia) throws Exception {
        this('\0', ocorrencia);   // "barra zero"
    }

    public char getCaracter() { //pegar caracter
        return caracter;//retorna o caracter
    }

    public void setCaracter(char caracter) { //seta o caracter
        this.caracter = caracter;//seta o caracter no registro
    }

    public int getOcorrencia() {//pega a ocorrencia
        return ocorrencia;//retorna a ocorrencia
    }

    public void setOcorrencia(int ocorrencia) {//seta a ocorrencia no registro
        this.ocorrencia = ocorrencia;
    }

	//toString
	public String toString()// "escreve" quantas ocorrencia e caracter
	{
		String ret = "";

		ret = "Quantos: " + this.ocorrencia + "   Caracter: " + this.caracter;

		return ret;
	}

	//qtdCaracter??

	//metodo para remover ocorrencia??

	//metodo para comparar??
	public int compareTo(Object obj)
	{
	     RegistroOcorrencia ocorrencia = (RegistroOcorrencia) obj;
	      if (this.getOcorrencia() < ocorrencia.getOcorrencia())//se a ocorrencia for menor
	           return -666;
	      if (this.getOcorrencia() > ocorrencia.getOcorrencia())//se a ocorrencia for maior
	           return 666;

	      if (this.getOcorrencia() == ocorrencia.getOcorrencia() && this.getCaracter() == ocorrencia.getCaracter()) // se a ocorrencia � igual
	           return 0;

	        return 0;
    }

    public void menorOcorrencia()
    {
		//pegar os dois n�s de menor ocorr�ncia e montar uma pequena �rvore onde eles ser�o as
		//folhas e a raiz ser� um novo n� cujo caracter n�o existir� e a ocorr�ncia ser� a soma das ocorr�ncias dos dois
		//n�s-filhos.
	}

}
