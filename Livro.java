package Desafio;

import java.time.LocalDate;
import java.util.UUID;

public class Livro {
    private UUID id;
    private String title;
    private Author author;
    Emprestimo available;
    private LocalDate registered;
    private LocalDate dateUpdate;


    public Livro(UUID id, String title, Author author, Emprestimo available, LocalDate registered) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.available = available;
        this.registered = registered;
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        return String.format("Id: %s\nLivro: %s\nAutor: %s\nAvailable: %s\nRegister: %s\n",id, title, author.name,available.available,registered);
    }
}
