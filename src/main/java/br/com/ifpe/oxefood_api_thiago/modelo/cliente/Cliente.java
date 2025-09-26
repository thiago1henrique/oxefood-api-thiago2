package br.com.ifpe.oxefood_api_thiago.modelo.cliente;

import java.time.LocalDate;

import br.com.ifpe.oxefood_api_thiago.util.entity.EntidadeAuditavel;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.SQLRestriction;

@Entity
@Table(name = "Cliente")
@SQLRestriction("habilitado = true")

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente extends EntidadeAuditavel  {

    private String nome;

    private LocalDate dataNascimento;

    private String cpf;

    private String foneCelular;

    private String foneFixo;

}
