/*
 * Curso: Desenvolvimento de sistemas
 *
 * Disciplina: Estrutura de dados 2
 *
 * Autora: Mishelle sousa silva
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.List;
import java.util.BitSet;



//Essa class serve para fazer o papel principal do projeto como, compactar e descompactar
public class Huff {

	private TabelaHuff getQtd;

    public static void compactar(String arqEntrada, String arqSaida) throws Exception
    {
		  //instancia do HArquivo
	      HArquivo arq = new HArquivo(arqEntrada);

		  //List de registro
	      List<RegistroOcorrencia> meuregistro = new ArrayList<>();

		  //criar lista de no
		  List<No> noregistro = Huff.ListaMeuNo(meuregistro);

		  //criar lista de arvore
		  List<Arvore> listaArvore = new ArrayList();

		  //gero minha tabela
		  listaArvore = arq.gerarTabelaDeOcorrencia(arqEntrada);

		  //organizo do menor para o maior
	      Collections.sort(listaArvore);

	      //organizo do maior para o menor
	      Collections.reverse(listaArvore);

	      //crio uma nova arvore
	      Arvore arvi = new Arvore();

		  //monto minha arvore
	      arvi = montaArvore(listaArvore);

		  //crio o meu binario
	      arvi.CriarBin();

	      System.out.println(arvi);

	}

    public static void descompactar(String arqEntrada, String arqSaida)
    {
		  //basta ler bit a bit do arquivo compactado e
		 //seguir a árvore montada até atingir uma folha, que será o caracter representado pela sequência de bits lida, e
		//assim seguir até atingir o final do arquivo.
		//RegistroOcorrencia oco;

		//for(int i = 0; i< arqSaida.size(); i++)
		//{
		//	if(arqEntrada.charAt(i) == '0')
		//		oco = oco.getEsquerda();

		//	if(arqEntrada.charAt(i) == '1')
		//		oco = oco.getDireita();

		//	if(oco.getEsquerda() == null && oco.getDireita())
		//		oco = oco.getCaracter();
		//}
		//return oco;



    }
    //private static TabelaBinaria gerarTabelaConversao(Arvore arvore)
    //{
	       //Integer arvore = new Integer(arvore);

	     //  int aux = Integer.parseInt(arvore);

	     //  Integer.toBinaryString(aux);

	      // return aux;

	//      return null;
    //}

  //  private static void gerarArquivoCompactado(String meuTexto, TabelaBinaria tabConversao,String arquivoSaida )
   // {

   // }
    public static List<No> ListaMeuNo (List<RegistroOcorrencia> oco)//recebo uma lista de registroOcorrencia
    {
		List<No> no = new ArrayList<>();//lista de NO

		for(RegistroOcorrencia ocoAuxiliar: oco)//percorro resgistro
		{
			no.add(new No(ocoAuxiliar));//adiciono
		}
		return no;//retorno no
	}

	public static boolean VerificaCaracterNaLista(char v, List<RegistroOcorrencia> verOco)//recebo um char e uma lista de registroOcorrencia
	{
		for(int i =0; i< verOco.size(); i++)//percorro essa lista
		{
			if(v == verOco.get(i).getCaracter())//verifico se está na lista
				return true;  //returno true
		}
		return false; //return false

	}
	public static int VerificaNaLista(char v, byte[] verByte)//recebo um char e vetor
    {
			int contador=0;//contador

			for(int i =0; i< verByte.length; i++)//percorro esse vetor
			{
				if(v == verByte[i])//verifico se é igual
					contador++;//volto novamente
			}
			return contador;//retorno o contador

	}

	 public static Arvore montaArvore(List<Arvore> listaArvore)//monta a minha ravore
	 {

	        while (listaArvore.size() > 1)//em quanto for maior que 1
	        {
	            Arvore ultimo = listaArvore.get(listaArvore.size()-1);//pego a ultimo
	            listaArvore.remove(listaArvore.size()-1);//removo

	            Arvore penultimo = listaArvore.get(listaArvore.size()-1);//pego a penultima
	            listaArvore.remove(listaArvore.size()-1);//removo

	            int soma = ultimo.getRaiz().getInformacao().getOcorrencia() + penultimo.getRaiz().getInformacao().getOcorrencia();//somo minhas ocorrencias

	            Arvore arv = new Arvore();//instancio

	            arv.incluir(new No(' ',soma));//incluo a soma

	            Huff.setDirecao(arv, ultimo, penultimo);//direciono

	            listaArvore.add(arv);//adiciono uma lista

	            Collections.sort(listaArvore);//organizo do maior para o menor

	            Collections.reverse(listaArvore);//organizo do menor ao maior
	           }

	         return listaArvore.get(0);
	    }

	    private static void setDirecao(Arvore f,Arvore ultimo,Arvore penultimo)//metodo usado para auxiliar na direção
	    {

	            if(ultimo.getRaiz().getInformacao().getCaracter() >= penultimo.getRaiz().getInformacao().getCaracter())
	            {
	                f.getRaiz().setDireita(ultimo.getRaiz());
	                f.getRaiz().setEsquerda(penultimo.getRaiz());

	            }
	            else
	            if(ultimo.getRaiz().getInformacao().getCaracter() <= penultimo.getRaiz().getInformacao().getCaracter())
	            {
	                f.getRaiz().setEsquerda(ultimo.getRaiz());
	                f.getRaiz().setDireita(penultimo.getRaiz());

	            }
	            else
	            if(ultimo.getRaiz().getInformacao().getOcorrencia() >= penultimo.getRaiz().getInformacao().getOcorrencia())
	            {
	                f.getRaiz().setDireita(ultimo.getRaiz());
	                f.getRaiz().setEsquerda(penultimo.getRaiz());
	            }
	            else
	            if(ultimo.getRaiz().getInformacao().getOcorrencia() <= penultimo.getRaiz().getInformacao().getOcorrencia())
	            {
	                f.getRaiz().setEsquerda(ultimo.getRaiz());
	                f.getRaiz().setDireita(penultimo.getRaiz());
	            }

    }


}
