package br.dev.jeffersonricardo.sistemaponto.model;

import org.hibernate.envers.Audited;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class Empresa {
	@Id
	private long id;
	private String descricao;
	private String cnpj;
	private String endereco;
	private String bairro;
	private String cidade;
	private String estado;
	private String telefone;
	
}
