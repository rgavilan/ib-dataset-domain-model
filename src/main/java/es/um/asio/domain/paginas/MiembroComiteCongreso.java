package es.um.asio.domain.paginas;

import javax.persistence.Entity;

import es.um.asio.domain.DataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Miembros comite congresos.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class MiembroComiteCongreso extends DataSetDataBase {  
    
    /**
     * Mapping of field AUCO_CONG_NUMERO.
     */
    private long aucoCongNumero;
    
    /**
     * Mapping of field IDPERSONA.
     */
    private long idPersona;
    
    /**
     * Mapping of field AUCO_ORDEN.
     */
    private long aucoOrden;
}