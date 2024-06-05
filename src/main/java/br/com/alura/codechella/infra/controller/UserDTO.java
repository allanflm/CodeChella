package br.com.alura.codechella.infra.controller;

import java.time.LocalDate;

public record UserDTO(String name,
                      String cpf,
                      LocalDate birth, // Data de nascimento
                      String email) {
}
