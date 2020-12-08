/*
 * Curso: Desenvolvimento de sistemas
 *
 * Disciplina: Estrutura de dados 2
 *
 * Autora: Mishelle sousa silva
 */

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;

//Essa class serve para trabalhar com a tabela Huff
public class TabelaHuff
{
	//metodos de lista. Mas uso List java
	//quais metodos usar aqui?

	private No alfa;

	public TabelaHuff()
	{
		List<Arvore> listaArvore = new ArrayList<>();
	}

	public boolean equals(Object obj)
	{
	    if (this == obj)
	    	return true;

	    if (obj == null || getClass() != obj.getClass())
	    	return false;

		//continuar
		return false;
	}
	public int hashCode()
	{
	   return 1;
	}

	public String toString()
	{
	     return "inicio=" + alfa;
    }

}
