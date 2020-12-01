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

public class Huff {

	private TabelaHuff getQtd;


    public static void compactar(String arqEntrada, String arqSaida) throws Exception {

		 // leitura dos dados do arquivo
        // String meuTexto = Arquivo.qualConteudo(arqEntrada);


		// gerara tabela de ocorrencias
		  TabelaHuff tabela = Huff.gerarTabela(meuTexto);
		  Arvore arvHuff = Huff.gerarArvore(tabela);

			 // gerar os códigos "BINARIO" para cada caracter em uma Lista
		 TabelaBinaria tabConversao = Huff.gerarTabelaConversao(arvHuff);

			   // releitura do texto convertendo pra codigo binário no BitSet
		 gerarArquivoCompactado(meuTexto, tabConversao, arqSaida );

		}
		catch(Exception erro)
		{}
    }

    public static void descompactar(String arquivoEntrada, String arquivoSaida){

		//basta ler bit a bit do arquivo compactado e
		//seguir a �rvore montada at� atingir uma folha, que ser� o caracter representado pela sequ�ncia de bits lida, e
		//assim seguir at� atingir o final do arquivo.



    }

    private static TabelaHuff gerarTabela(String texto) {
        return null;
    }

    private static Arvore gerarArvore(TabelaHuff tabela){

		//return tabela.geraArvore();
		return null;

    }

    private static TabelaBinaria gerarTabelaConversao(Arvore arvore) {
       return null;
    }

    private static void gerarArquivoCompactado(String meuTexto, TabelaBinaria tabConversao,String arquivoSaida ) {

    }
}
