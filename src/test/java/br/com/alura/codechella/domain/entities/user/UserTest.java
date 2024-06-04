package br.com.alura.codechella.domain.entities.user;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class UserTest {
    @Test       //naoDeveCadastrarUsuarioComCpfNoFormatoInvalido
    public void YouShouldNotRegisterAuserWithAnInvalidCPFFormat() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new User("Allan", "12345678921", LocalDate.parse("2003-09-09"), "email@email.com"));

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new User("Allan", "123456.789-21", LocalDate.parse("2003-09-09"), "email@email.com"));

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new User("Allan", "", LocalDate.parse("2003-09-09"), "email@email.com"));
    }

    @Test       //deveCriarUsuarioUsandoFabricaDeUsuario
    public void mustCreateUserUsingUserFactory() {
        UserFactory factory = new UserFactory();
        User user = factory.withNameCpfBirth("Allan", "123.456.789-21",
                LocalDate.parse("2003-09-09"));

        Assertions.assertEquals(user.getName(), "Allan");

        user = factory.includedAddress("89300-000", 0, "apt");
        Assertions.assertEquals("apt", user.getAddress().getComplement());
    }

    @Test       //naoDeveCadastrarUsuarioComMenosDe18anos
    public void noMustRegisterUserUnder18years() {
        LocalDate birthDate = LocalDate.now().minusYears(17);

        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new User("Allan", "123.456.789-23", birthDate, "email@example.com");
        });

        Assertions.assertEquals("User must be at least 18 years of age!", exception.getMessage());
    }

}
