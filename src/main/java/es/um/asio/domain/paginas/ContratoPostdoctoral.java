package es.um.asio.domain.paginas;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Contratos postdoctorales.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class ContratoPostdoctoral extends OperationableDataSetDataBase {  
    
    /**
     * Mapping of field SOLB_NUMERO.
     */
    private long solbNumero;
    
    /**
     * Mapping of field IDPERSONABECARIO.
     */
    private long idPersonaBecario;
    
    /**
     * Mapping of field SOLB_TITUPROYECTO.
     */
    private String solbTituProyecto;
    
    /**
     * Mapping of field SOLB_OBJETIVOS.
     */
    private String solbObjetivos;
    
    /**
     * Mapping of field SOLB_OBSERVACIONES.
     */
    private String solbObservaciones;
    
    /**
     * Mapping of field SOLB_ESTADO.
     */
    private String solbEstado;
}
