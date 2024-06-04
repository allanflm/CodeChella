package br.com.alura.codechella.domain.entities.user;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class UserTest {
    @Test       //naoDeveCadastrarUsuarioComCpfNoFormatoInvalido
    public void YouShouldNotRegisterAuserWithAnInvalidCPFFormat(){
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new User("Allan", "12345678921", LocalDate.parse("2003-09-09"),"email@email.com"));

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new User("Allan", "123456.789-21", LocalDate.parse("2003-09-09"),"email@email.com"));

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new User("Allan", "", LocalDate.parse("2003-09-09"),"email@email.com"));
    }
}
