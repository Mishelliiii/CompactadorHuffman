/*
 * Curso: Desenvolvimento de sistemas
 *
 * Disciplina: Estrutura de dados 2
 *
 * Autora: Mishelle sousa silva
 */

import java.util.ArrayList;
import java.util.List;

public class TabelaBinaria {

	private RegistroOcorrencia raiz;
	List<RegistroOcorrencia> listaNoBi = new ArrayList<RegistroOcorrencia>();

	public  TabelaBinaria()
	{
		this.raiz=null;//iniciada com null
	}

	public void Binario(RegistroOcorrencia raiz){ // esse metodo serve para procurar uma folha que está usando recursão e concatenando 0 ou 1
		if(raiz.getEsquerda() == null && raiz.getDireita() == null)//se minha esquerda e direita forem nulas
		{
			listaNoBi.add(new RegistroOcorrencia(raiz.getInformacao().getOcorrencia()));//adiciona uma nova ocorrencia no registro
			//fazer o resto
		}
		if(raiz.getEsquerda() != null)//se minha esquerda for diferente de null
		    Binario(raiz.getEsquerda() + "0");//add 0
		if(raiz.getDireita() != null)//se minha direita for diferente de null
			Binario(raiz.getDireita() + "1");//add 1
	}

	//metodos obrigatorios?
	public boolean equals(TabelaBinaria obj)
	{
		//fazer equals do info
		return false;
	}
	public int HashCode()
	{
		//fazer o hash do info
		return 1;
	}


}