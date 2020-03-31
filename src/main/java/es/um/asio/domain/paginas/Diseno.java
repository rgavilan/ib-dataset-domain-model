package es.um.asio.domain.paginas;

import javax.persistence.Entity;

import es.um.asio.domain.DataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Diseños.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class Diseno extends DataSetDataBase {  
    
    /**
     * Mapping of field DISE_CODIGO.
     */
    private long diseCodigo;
    
    /**
     * Mapping of field DISE_DESCRIPCION.
     */
    private String diseDescripcion;
    
    /**
     * Mapping of field DISE_FECHA.
     */
    private String diseFecha;
    
    /**
     * Mapping of field DISE_TDIS_CODIGO.
     */
    private long diseTdisCodigo;
    
    /**
     * Mapping of field DISE_CALIDADES.
     */
    private Long diseCalidades;
}