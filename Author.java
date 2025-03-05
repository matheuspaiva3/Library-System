package Library_System;

import java.time.LocalDate;
import java.util.UUID;

public class Author {

    String name;
    LocalDate birthDate;
    UUID id;

    public Author(String name, LocalDate birthDate, UUID id){
        this.name = name;
        this.birthDate = birthDate;
        this.id = id;
    }
    public String toString(){
        return String.format("Autor: %s \nAniversario: %s \nID: %s",name,birthDate,id);
    }
}
