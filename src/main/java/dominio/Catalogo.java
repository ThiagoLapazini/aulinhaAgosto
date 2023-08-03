package dominio;

import java.time.LocalDate;
import java.util.Objects;
import javax.persistence.*;

@Entity
@Table(name = "Pedro")
public class Catalogo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long id;
	@Column(name = "Titulo", length = 40, nullable = false)
	private String titulo;
	@Column(name = "Desenvolvedora", length = 20, nullable = false)
	private String desenvolvedora;
	@Column(name = "Distribuidora", length = 20, nullable = false)
	private String distribuidora;
	@Column(name = "idiomas", length = 40, nullable = false)
	private String idiomas;
	@Column(name = "Numero_de_Jogadores", length = 5, nullable = false)
	private int numeroDeJogadores;
	@Column(name = "Genero", length = 10, nullable = false)
	private generoEnum genero;
	@Column(name = "Data_de_Lançamento", length = 15, nullable = false)
	private LocalDate dataLancamento;
	@Column
	@Embedded
	private Requisitos requisitosSistema;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDesenvolvedora() {
		return desenvolvedora;
	}

	public void setDesenvolvedora(String desenvolvedora) {
		this.desenvolvedora = desenvolvedora;
	}

	public String getDistribuidora() {
		return distribuidora;
	}

	public void setDistribuidora(String distribuidora) {
		this.distribuidora = distribuidora;
	}

	public String getIdiomas() {
		return idiomas;
	}

	public void setIdiomas(String idiomas) {
		this.idiomas = idiomas;
	}

	public int getNumeroDeJogadores() {
		return numeroDeJogadores;
	}

	public void setNumeroDeJogadores(int numeroDeJogadores) {
		this.numeroDeJogadores = numeroDeJogadores;
	}

	public generoEnum getGenero() {
		return genero;
	}

	public void setGenero(generoEnum genero) {
		this.genero = genero;
	}

	public LocalDate getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(LocalDate dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public Catalogo(Long id, String titulo, String desenvolvedora, String distribuidora, String idiomas,
			int numeroDeJogadores, generoEnum genero, LocalDate dataLancamento, Requisitos requisitosSistema) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.desenvolvedora = desenvolvedora;
		this.distribuidora = distribuidora;
		this.idiomas = idiomas;
		this.numeroDeJogadores = numeroDeJogadores;
		this.genero = genero;
		this.dataLancamento = dataLancamento;
		this.requisitosSistema = requisitosSistema;
	}

	@Override
	public String toString() {
		return "Catalogo [id=" + id + ", titulo=" + titulo + ", desenvolvedora=" + desenvolvedora + ", distribuidora="
				+ distribuidora + ", idiomas=" + idiomas + ", numeroDeJogadores=" + numeroDeJogadores + ", genero="
				+ genero + ", dataLancamento=" + dataLancamento + ", requisitosSistema=" + requisitosSistema + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataLancamento, desenvolvedora, distribuidora, genero, id, idiomas, numeroDeJogadores,
				requisitosSistema, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Catalogo other = (Catalogo) obj;
		return Objects.equals(dataLancamento, other.dataLancamento)
				&& Objects.equals(desenvolvedora, other.desenvolvedora)
				&& Objects.equals(distribuidora, other.distribuidora) && genero == other.genero
				&& Objects.equals(id, other.id) && Objects.equals(idiomas, other.idiomas)
				&& numeroDeJogadores == other.numeroDeJogadores
				&& Objects.equals(requisitosSistema, other.requisitosSistema) && Objects.equals(titulo, other.titulo);
	}

	public Catalogo() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
