/*
 * Curso: Desenvolvimento de sistemas
 *
 * Disciplina: Estrutura de dados 2
 *
 * Autora: Mishelle sousa silva
 */


//Esse � o programa principal do projeto, onde ser� chamada as funcionalidades do projeto
public class AppHuff {

    public static void main(String[] args) throws Exception{

		System.out.println("Vamos compactar ou descompactar?");

		//Huff huff = new Huff();

		Huff.compactar("D:/Huffman/Texto/PoesiaCompactada.txt", "D:/Huffman/Texto/PoesiaDescompactada.txt");
        //Huff.descompactar("Poesia.huff","Poesia_des.txt");

    }

}
