package pe.chambitape.document.repository.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import pe.chambitape.audit.Auditable;

@Entity
@Table(name = "CP_TYPE_DOCUMENT")
public class DocumentEntity extends Auditable<String> {

	@Id
	@Column(name="TYP_DOC_CODE")
	private String tipoDocumento;
	
	@Column(name="DESCRIPCION")
	private String descripcion;

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
