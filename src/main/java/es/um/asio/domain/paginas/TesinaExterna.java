package es.um.asio.domain.paginas;

import javax.persistence.Entity;

import es.um.asio.domain.DataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Tesinas externas.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class TesinaExterna extends DataSetDataBase {  
    
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
     * Mapping of field TINA_LECTURAUMU.
     */
    private String tinaLecturaUmu;
    
    /**
     * Mapping of field TINA_FECHA.
     */
    private String tinaFecha;
    
    /**
     * Mapping of field TINA_CENT_CODIGO.
     */
    private String tinaCentCodigo;
    
    /**
     * Mapping of field TINA_UNIV_NOMBRE.
     */
    private String tinaUnivNombre;
}