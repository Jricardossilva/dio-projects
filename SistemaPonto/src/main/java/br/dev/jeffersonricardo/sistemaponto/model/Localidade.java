package br.dev.jeffersonricardo.sistemaponto.model;

import org.hibernate.envers.Audited;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class Localidade {
	@Id
	private long id;
	@ManyToOne
	private NivelAcesso nivelAcesso;
	private String descricao;
}
