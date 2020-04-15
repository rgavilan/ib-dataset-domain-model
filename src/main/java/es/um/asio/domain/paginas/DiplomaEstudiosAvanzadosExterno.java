package es.um.asio.domain.paginas;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Diploma estudios avanzados externo.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class DiplomaEstudiosAvanzadosExterno extends OperationableDataSetDataBase {  
    
    /**
     * Mapping of field TINA_CODIGO.
     */
    private long tinaCodigo;
    
    /**
     * Mapping of field IDPERSONA.
     */
    private long idPersona;
    
    /**
     * Mapping of field TINA_TITULO.
     */
    private String tinaTitulo;
    
    /**
     * Mapping of field TINA_FECHA.
     */
    private String tinaFecha;
    
    /**
     * Mapping of field TINA_UNIV_NOMBRE.
     */
    private String tinaUnivNombre;
    
    /**
     * Mapping of field TINA_UNI_CODIGO.
     */
    private Long tinaUniCodigo;
}
