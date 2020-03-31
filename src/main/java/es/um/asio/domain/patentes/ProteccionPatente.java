package es.um.asio.domain.patentes;

import javax.persistence.Entity;

import es.um.asio.domain.DataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Protecciones patentes.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class ProteccionPatente extends DataSetDataBase {  
    
    /**
     * Mapping of field IDPATENTE.
     */
    private long idPatente;
    
    /**
     * Mapping of field NUMERO.
     */
    private long numero;
    
    /**
     * Mapping of field CODTIPOVIAPROTECCION.
     */
    private String codTipoViaProteccion;
    
    /**
     * Mapping of field NUMEROSOLICITUD.
     */
    private String numeroSolicitud;
    
    /**
     * Mapping of field FECHASOLICITUD.
     */
    private String fechaSolicitud;
    
    /**
     * Mapping of field NUMEROPUBLICACION.
     */
    private String numeroPublicacion;
    
    /**
     * Mapping of field FECHAPUBLICACION.
     */
    private String fechaPublicacion;
    
    /**
     * Mapping of field FECHAPRIORIDAD.
     */
    private String fechaPrioridad;
    
    /**
     * Mapping of field FECHAFINPLAZOPRIORIDAD.
     */
    private String fechaFinPlazoPrioridad;
    
    /**
     * Mapping of field FECHACONCESION.
     */
    private String fechaConcesion;
    
    /**
     * Mapping of field FECHAABANDONO.
     */
    private String fechaAbandono;
    
    /**
     * Mapping of field REFERENCIA.
     */
    private String referencia;
    
    /**
     * Mapping of field MOTIVOCAMBIOFECHA.
     */
    private String motivoCambioFecha;
}
