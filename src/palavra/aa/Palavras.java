package palavra.aa;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Palavras {

    public static String[] palavraDividida;

    public void sortearPalavra() throws IOException {
        Random posicao = new Random();
        int numero = posicao.nextInt(3);
        lerTxt(numero);
    }
    public String[] lerTxt(int posicao){
        ArrayList<String> dados = new ArrayList<>();
        dados.add("lara");
        dados.add("nada");
        dados.add("mapa");
        dados.add("casa");

        System.out.println(posicao);
        String palavra = dados.get(posicao);
        palavraDividida = palavra.split("");
        return palavraDividida;
    }

//    public String[] lerTxt(int posicao) throws IOException {
//        Path caminho = Paths.get("palavras.txt");
//        ArrayList<String> dados = new ArrayList<>(Files.readAllLines(caminho));
//
//        String palavra = dados.get(posicao);
//        palavraDividida = palavra.split("");
//        System.out.println(Arrays.toString(palavraDividida));
//        return palavraDividida;
//    }
}
