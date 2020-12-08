/*
 * Curso: Desenvolvimento de sistemas
 *
 * Disciplina: Estrutura de dados 2
 *
 * Autora: Mishelle sousa silva
 */


//Essa class serve para registrar a ocorrencia e caracteres
public class RegistroOcorrencia implements Comparable//class registroOcorrencia comparavel
{
	//atributos
    private char caracter;
    private int ocorrencia;
    private String ocor;

    public RegistroOcorrencia(char caracter, int ocorrencia)//construtor que recebe um char e um int como parametro
    {
		//inicio
        this.caracter = caracter;
        this.ocorrencia = ocorrencia;
    }
    public RegistroOcorrencia(int ocorrencia) throws Exception//construtor
    {
        this('\0', ocorrencia);   // "barra zero"
    }
    public RegistroOcorrencia(char caracter, String ocor)//construtor para trabalhar com o binario
	{
	       this.ocor = ocor;
	       this.caracter = caracter;
    }

     public String getOcor() //pegar ocor
	 {
	      return ocor;//retorna o ocor
	 }

	public void setOcor(String ocor)//seta o ocor
	{
	     this.ocor = ocor;//seta o ocor no registro
    }

    public char getCaracter() //pegar caracter
    {
        return caracter;//retorna o caracter
    }

    public void setCaracter(char caracter)//seta o caracter
    {
        this.caracter = caracter;//seta o caracter no registro
    }

    public int getOcorrencia()//pega a ocorrencia
    {
        return ocorrencia;//retorna a ocorrencia
    }

    public void setOcorrencia(int ocorrencia) //seta a ocorrencia no registro
    {
        this.ocorrencia = ocorrencia;
    }

	//toString
	public String toString()// "escreve" quantas ocorrencia e caracter
	{
		String ret = "";

		ret = "Quantos: " + this.ocorrencia + "   Caracter: " + this.caracter;

		return ret;
	}
	public int compareTo(Object obj)//metodo compareTo
	{
	     RegistroOcorrencia ocorrencia = (RegistroOcorrencia) obj;
	      if (this.getOcorrencia() < ocorrencia.getOcorrencia())//se a ocorrencia for menor
	           return -666;//retorna nagativo
	      if (this.getOcorrencia() > ocorrencia.getOcorrencia())//se a ocorrencia for maior
	           return 666;//retorna negativo

	      if (this.getOcorrencia() == ocorrencia.getOcorrencia() && this.getCaracter() == ocorrencia.getCaracter()) // se a ocorrencia é igual
	           return 0;//retorna 0

	        return 0;//retorna 0
    }
}
