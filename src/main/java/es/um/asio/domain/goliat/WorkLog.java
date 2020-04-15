package es.um.asio.domain.goliat;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Work logs.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class WorkLog extends OperationableDataSetDataBase {  
    
    /**
     * Mapping of field ID.
     */
    private long id;
    
    /**
     * Mapping of field ID_WORK_PACKAGE.
     */
    private Long idWorkPackage;
    
    /**
     * Mapping of field IDPERSONA.
     */
    private long idPersona;
    
    /**
     * Mapping of field FECHA.
     */
    private String fecha;
    
    /**
     * Mapping of field NUMERO_HORAS.
     */
    private float numeroHoras;
    
    /**
     * Mapping of field AUTO.
     */
    private String auto;
}
