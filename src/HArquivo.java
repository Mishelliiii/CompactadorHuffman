/*
 * Curso: Desenvolvimento de sistemas
 *
 * Disciplina: Estrutura de dados 2
 *
 * Autora: Mishelle sousa silva
 */

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;


public class HArquivo//class
{
	//classe criada para ler o arquivo

		public byte vetByte[];
		private static List<Arvore> listaArv;

		public HArquivo(String arqEntrada) throws Exception//construtor da class
		{
			this.listaArv = new ArrayList();
		}

		public static List<Arvore> gerarTabelaDeOcorrencia(String arqEntrada) throws Exception
		{
			//abri arquivo, arquivoEntrado
			FileInputStream arquivoFisico = new FileInputStream(arqEntrada);
			BufferedInputStream buffReader = new BufferedInputStream(arquivoFisico);
			DataInputStream data = new DataInputStream(buffReader);

			//vetor para bytes
			byte vetByte[];
			vetByte = new byte[arquivoFisico.available()];
			data.read(vetByte);


			//vetor para inteiros
			int contaOcorrencia[] = new int[32000];

			//percorre para encontrar
			for (char o : new String(vetByte).toCharArray())
			{
				contaOcorrencia[o]++;
			}

			for (int i=0; i< contaOcorrencia.length; i++)
			{
				//verifica se o i é maior que 0
				if (contaOcorrencia[i]>0)
				{
					//instancio minha arvore
					Arvore arvorizinha = new Arvore();

					//inclui na arvore um char e uma ocorrencia
					arvorizinha.incluir(new No(((char)i), contaOcorrencia[i]));//add

					//adiciono lista na arvore
					listaArv.add(arvorizinha);
				}
		   }
		  return listaArv;//retorno a lista

	}
}