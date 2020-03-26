package es.um.asio.domain.goliat;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Timesheets.xml"
 */
@Getter
@Setter
@ToString
public class Timesheet extends DataSetDataBase {  
    
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
