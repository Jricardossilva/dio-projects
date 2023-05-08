package br.dev.jeffersonricardo.sistemaponto.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

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
public class Usuario {
	@Id
	private Long id;
	@ManyToOne
	private CategoriaUsuario categoriaUsuario;
	private String nome;
	@ManyToOne
	private Empresa empresa;
	@ManyToOne
	private NivelAcesso nivelAcesso;
	@ManyToOne
	private JornadaTrabalho jornadaTrabalho;
	private BigDecimal tolerancia;
	private LocalDateTime inicioJornada;
	private LocalDateTime finalJornada;
}
