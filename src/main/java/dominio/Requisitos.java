package dominio;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Requisitos implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Column (name = "Sistema", length = 40 , nullable = false)
	private String sistemaOperacional;
	@Column (name = "Processador", length = 20 , nullable = false)
	private String processador;
	@Column (name = "Memoria", length = 10 , nullable = false)
	private String memoria;
	@Column (name = "Placa_de_video", length = 40 , nullable = false)
	private String placaDeVideo;
	@Column (name = "Armazenamento", length = 10 , nullable = false)
	private String armazenamento;
	
	
	public String getSistemaOperacional() {
		return sistemaOperacional;
	}
	public void setSistemaOperacional(String sistemaOperacional) {
		this.sistemaOperacional = sistemaOperacional;
	}
	public String getProcessador() {
		return processador;
	}
	public void setProcessador(String processador) {
		this.processador = processador;
	}
	public String getMemoria() {
		return memoria;
	}
	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}
	public String getPlacaDeVideo() {
		return placaDeVideo;
	}
	public void setPlacaDeVideo(String placaDeVideo) {
		this.placaDeVideo = placaDeVideo;
	}
	public String getArmazenamento() {
		return armazenamento;
	}
	public void setArmazenamento(String armazenamento) {
		this.armazenamento = armazenamento;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		return Objects.hash(armazenamento, memoria, placaDeVideo, processador, sistemaOperacional);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Requisitos other = (Requisitos) obj;
		return Objects.equals(armazenamento, other.armazenamento) && Objects.equals(memoria, other.memoria)
				&& Objects.equals(placaDeVideo, other.placaDeVideo) && Objects.equals(processador, other.processador)
				&& Objects.equals(sistemaOperacional, other.sistemaOperacional);
	}
	@Override
	public String toString() {
		return "Requisitos [sistemaOperacional=" + sistemaOperacional + ", processador=" + processador + ", memoria="
				+ memoria + ", placaDeVideo=" + placaDeVideo + ", armazenamento=" + armazenamento + "]";
	}
	public Requisitos(String sistemaOperacional, String processador, String memoria, String placaDeVideo,
			String armazenamento) {
		super();
		this.sistemaOperacional = sistemaOperacional;
		this.processador = processador;
		this.memoria = memoria;
		this.placaDeVideo = placaDeVideo;
		this.armazenamento = armazenamento;
	}
	public Requisitos() {
		
	}
	
	

}
