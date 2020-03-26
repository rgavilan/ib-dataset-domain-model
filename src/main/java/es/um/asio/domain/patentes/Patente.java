package es.um.asio.domain.patentes;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class Patente.
 */
@Getter
@Setter
@ToString
public class Patente extends DataSetDataBase {  
    
    /**
     * Mapping of field IDPATENTE.
     */
    private long idPatente;
    
    /**
     * Mapping of field TIPOPATENTE.
     */
    private String tipoPatente;
    
    /**
     * Mapping of field REFERENCIAPATENTE.
     */
    private String referenciaPatente;
    
    /**
     * Mapping of field TITULO.
     */
    private String titulo;
    
    /**
     * Mapping of field IDAGENTE.
     */
    private Long idAgente;
    
    /**
     * Mapping of field OBSERVACIONES.
     */
    private String observaciones;
    
    /**
     * Mapping of field CODPROVINCIA.
     */
    private Long codigoProvincia;
    
    /**
     * Mapping of field NUMEROSOLICITUD.
     */
    private Long numeroSolicitud;
    
    /**
     * Mapping of field ANIOSOLICITUD.
     */
    private Long anioSolicitud;
    
    /**
     * Mapping of field FECHASOLICITUD.
     */
    private String fechaSolicitud;
    
    /**
     * Mapping of field CODASIENTO.
     */
    private String codAsiento;
    
    /**
     * Mapping of field ANIOASIENTO.
     */
    private Long anioAsiento;
    
    /**
     * Mapping of field NUMEROASIENTO.
     */
    private Long numeroAsiento;
}
