package br.com.letscode.java.leituraArquivoCsv;

import br.com.letscode.java.leituraArquivoCsv.Filme;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Aula manipulação de arquivos usando try-with-resources

public class AplicacaoFilmeLeitura {


    public static void main(String[] args) throws IOException {

        //1 - ler um arquivo csv
        //2 - converter arquivo em objeto
        //3 - exibir lista de filmes no console


        try (Stream<String> stream = Files.lines(Paths.get(System.getProperty("user.home"),"filmes.csv"))) {
            List<String> linhas = stream.collect(Collectors.toList());
            List<Filme> filmes = converterEmPessoa(linhas);
            filmes.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //metodo
    private static List<Filme> converterEmPessoa(List<String> linhas) {
        List<Filme> resultado = new ArrayList<>();
        for(String linha : linhas){

            //1 - split para ler cada campo de linha, separados por vírgula
            //2 - instanciar um objeto filme
            //3 - adicionar na lista de retorno

            String[]campos = linha.split(",");
            Filme novoFilme = new Filme (campos[0],campos[1], Integer.parseInt(campos[2]), Double.parseDouble(campos[3]));
            resultado.add(novoFilme);
        }
        return resultado;
    }

}

