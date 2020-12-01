/*
 * Curso: Desenvolvimento de sistemas
 *
 * Disciplina: Estrutura de dados 2
 *
 * Autora: Mishelle sousa silva
 */

public class AppHuff {

    public static void main(String[] args) throws Exception{

		System.out.println("Vamos compactar ou descompactar?");

		Huff huff = new Huff();

		Huff.Compactar("Texto/PoesiaCompactada.txt", "Texto/PoesiaDescompactada.txt");
        //Huff.descompactar("Poesia.huff","Poesia_des.txt");

    }

}
