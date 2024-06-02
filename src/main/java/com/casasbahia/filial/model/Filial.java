package com.casasbahia.filial.model;

import lombok.Getter;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

@Getter
public class Filial {
    Long id = 1243L;
    String nome = "Casas Bahia";
    Long cnpj = 12345678000300L;
    String cidade = "Campinas";
    String uf = "SP";
    String tipo = "Rua";
    String ativo = "Ativa";
    LocalDate dataCadastro = LocalDate.parse("2024-05-31");
    String ultimaAtualizacao = "2024-06-02T22:11:20";
}
