package es.um.asio.domain.patentes;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Patentes.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class Patente extends OperationableDataSetDataBase {  
    
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
