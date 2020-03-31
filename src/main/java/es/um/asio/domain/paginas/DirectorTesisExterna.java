package es.um.asio.domain.paginas;

import javax.persistence.Entity;

import es.um.asio.domain.DataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Directores tesis externas.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class DirectorTesisExterna extends DataSetDataBase {  
    
    /**
     * Mapping of field DIRE_TESI_CODIGO.
     */
    private long direTesiCodigo;
    
    /**
     * Mapping of field IDPERSONA.
     */
    private long idPersona;
}
