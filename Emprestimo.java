package Library_System;

import java.util.UUID;

public class Emprestimo {
    UUID id = UUID.randomUUID();
    String name;
    String book;
    Boolean available;

    public void setName(String name) {
        this.name = name;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public Emprestimo(Boolean active){
        this.available = active;
    }

    public String toString() {
        return String.format("Livro: %s\nCliente: %s",book,name);
    }
}
