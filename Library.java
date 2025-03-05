package Library_System;

import java.time.LocalDate;
import java.util.*;

public class Library {
    public static void main(String[] args) {

        String title;
        String date;
        String autor = "Matheus";
        UUID authorId = UUID.randomUUID();
        LocalDate birthday = LocalDate.of(1999, 10, 31);
        Author author = new Author(autor, birthday, authorId);
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        List<Author> autores = new ArrayList<>();
        List<Livro> livros = new ArrayList<>();
        List<Emprestimo> emprestimos = new ArrayList<>();
        Boolean run = true;
        Integer choice;
        do {
            System.out.println("O que deseja fazer?\n" +
                    "1 - Adicionar livro\n" +
                    "2 - Listar todos os livros\n" +
                    "3 - Realizar emprestimo de um livro\n" +
                    "4 - Finalizar programa");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1: {
                    Emprestimo available = new Emprestimo(true);
                    LocalDate register = LocalDate.now();
                    UUID bookId = UUID.randomUUID();
                    System.out.println("Digite o nome do livro!");
                    title = scanner.nextLine();
                    Livro livro = new Livro(bookId, title, author, available, register);
                    livros.add(0, livro);
                    break;
                }
                case 2: {
                    for (Livro livro : livros) {
                        if (livro.available.available.equals(true)) {
                            System.out.println(livro);
                        }
                    }
                    break;
                }
                case 3: {
                    System.out.println("Digite o id do livro que deseja alugar");
                    String id = scanner.nextLine();
                    System.out.println("Digite seu nome!");
                    String name = scanner.nextLine();
                    UUID uuidString = UUID.fromString(id);
                    for (Livro livro : livros) {
                        if (livro.getId().equals(uuidString)) {
                            System.out.println("deu certo");
                            livro.available.available = false;
                            livro.available.setName(name);
                            livro.available.setBook(livro.getTitle());
                            System.out.println(livro.available);
                        }
                    }
                    break;
                }
                case 4: {
                    run = false;
                }
                default: {
                    break;
                }
            }
        }
        while (run);
        System.out.println(autores);
        System.out.println(livros);

    }
}
