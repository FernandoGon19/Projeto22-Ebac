package Exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class APP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome das pessoas (Ex: Fernando-Masculino):");

        String input = scanner.nextLine();
        String[] pessoasArray = input.split(",");
        List<Pessoas> lista = new ArrayList<>();

        for (String pessoa : pessoasArray) {
            String[] data = pessoa.split("-");
            if (data.length == 2) {
                String nome = data[0].trim();
                String genero = data[1].trim();
                lista.add(new Pessoas(nome, genero));
            } else {
                System.out.println("Entrada inválida: " + pessoa);
            }
        }

        System.out.println("Total de pessoas:");
        lista.forEach(System.out::println);

        System.out.println("********");
        System.out.println("Mulheres: ");

        List<Pessoas> listaMulheres = lista.stream()
                .filter(funcionarios -> funcionarios.getSexo().equalsIgnoreCase("Feminino"))
                .collect(Collectors.toList());

        listaMulheres.forEach(System.out::println);
    }
}