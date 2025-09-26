package br.com.ifpe.oxefood_api_thiago.modelo.entregador;

import br.com.ifpe.oxefood_api_thiago.util.entity.EntidadeAuditavel;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.SQLRestriction;

import java.time.LocalDate;

@Entity
@Table(name = "Entregador")
@SQLRestriction("habilitado = true")

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Entregador extends EntidadeAuditavel  {

    private String nome;

    private String cpf;

    private String rg;

    private LocalDate dataNascimento;

    private String foneCelular;

    private String foneFixo;

    private int qtdEntregasRealizadas;

    private double valorFrete;

    private String enderecoRua;

    private String enderecoComplemento;

    private String enderecoNumero;

    private String enderecoBairro;

    private String enderecoCidade;

    private String enderecoCep;

    private String enderecoUf;

    private boolean ativo;

}
