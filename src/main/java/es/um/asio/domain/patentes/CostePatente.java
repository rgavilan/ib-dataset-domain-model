package es.um.asio.domain.patentes;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Costes patentes.xml"
 */
@Getter
@Setter
@ToString
public class CostePatente extends DataSetDataBase {  
    
    /**
     * Mapping of field IDPATENTE.
     */
    private long idPatente;
    
    /**
     * Mapping of field NUMERO.
     */
    private long numero;
    
    /**
     * Mapping of field CODTIPOCOSTEPATENTE.
     */
    private String codTipoCostePatente;
    
    /**
     * Mapping of field IDPROYECTO.
     */
    private String idProyecto;
    
    /**
     * Mapping of field IDDOCUMENTO.
     */
    private String idDocumento;
    
    /**
     * Mapping of field IDTERCERO.
     */
    private String idTercero;
    
    /**
     * Mapping of field NOMBRE.
     */
    private String nombre;
    
    /**
     * Mapping of field CODTIPOMONEDA.
     */
    private String codTipoMoneda;
    
    /**
     * Mapping of field IMPORTE.
     */
    private Float importe;
    
    /**
     * Mapping of field FECHAPAGO.
     */
    private String fechaPago;
    
    /**
     * Mapping of field OBSERVACIONES.
     */
    private String observaciones;
}
