package es.um.asio.domain.sgi.model.estancia;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = EstanciaSGI.TABLE)
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class EstanciaSGI extends OperationableDataSetDataBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3941812193709346407L;

	public static final String TABLE = "Estancia_sgi";

	protected String id;
	protected String titulo;
	protected String idparticipaOrganizacion;
	protected String idparticipaPersona;
	protected String localidad;
	protected String identificador;
	protected String descripcion;
	protected String ubicadoEn;
	protected String tieneMateria;
	protected String idseRelacionaGasto;
	protected String idseRelacionaRol;
	protected String palabraClave;
	protected String idlocalizadoEn;
	protected Date fechaInicio;
	protected Date fechaFin;
	protected String informacionDeContacto;
}
