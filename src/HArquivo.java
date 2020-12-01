/*
 * Curso: Desenvolvimento de sistemas
 *
 * Disciplina: Estrutura de dados 2
 *
 * Autora: Mishelle sousa silva
 */

import java.io.*;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;

public class HArquivo//class
{
	//classe criada para ler o arquivo

	 public static void LerArquivo(String arqEntrada, String arqSaida) throws Exception
	{
		//abrindo o arquivo
		FileInputStream arquivoFisico = new FileInputStream(arqEntrada);
		BufferedInputStream buffReader = new BufferedInputStream(arquivoFisico);
		DataInputStream data = new DataInputStream(buffReader);

		byte vetByte[];//vetor para guardar
		vetByte = new byte[arquivoFisico.available()];//meu vetor recebe o  arquivo que foi aberto
		data.read(vetByte);//ler os dados
	}
}