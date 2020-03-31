package es.um.asio.domain.ayudas;

import javax.persistence.Entity;

import es.um.asio.domain.DataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Tipos ayudas.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class TipoAyuda extends DataSetDataBase {  
    
    /**
     * Mapping of field CODTIPOAYUDA.
     */
    private String codTipoAyuda;
    
    /**
     * Mapping of field DESCRIPCION.
     */
    private String descripcion;
}
