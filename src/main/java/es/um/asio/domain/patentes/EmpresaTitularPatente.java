package es.um.asio.domain.patentes;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class EmpresaTitularPatente.
 */
@Getter
@Setter
@ToString
public class EmpresaTitularPatente extends DataSetDataBase {  
    
    /**
     * Mapping of field IDPATENTE.
     */
    private long idPatente;
    
    /**
     * Mapping of field NUMERO.
     */
    private long numero;
    
    /**
     * Mapping of field IDTERCERO.
     */
    private long idTercero;    
    
    /**
     * Mapping of field PARTICIPACION.
     */
    private Float participacion; 
    
    /**
     * Mapping of field OBSERVACIONES.
     */
    private String observaciones;
    
    /**
     * Mapping of field FECHAINICIOPERIODO.
     */
    private String fechaInicioPeriodo;
    
    /**
     * Mapping of field FECHAFINPERIODO.
     */
    private String fechaFinPeriodo;
}
