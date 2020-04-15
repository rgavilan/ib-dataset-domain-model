package es.um.asio.domain.goliat;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Timesheets.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class Timesheet extends OperationableDataSetDataBase {  
    
    /**
     * Mapping of field ID.
     */
    private long id;
    
    /**
     * Mapping of field IDPERSONA.
     */
    private long idPersona;
    
    /**
     * Mapping of field INICIO.
     */
    private String inicio;
    
    /**
     * Mapping of field FIN.
     */
    private String fin;
    
    /**
     * Mapping of field FECHA.
     */
    private String fecha;
    
    /**
     * Mapping of field FIRMADO.
     */
    private String firmado;
    
    /**
     * Mapping of field UUID.
     */
    private String uuid;
    
    /**
     * Mapping of field BINARIO.
     */
    private String binario;
}
