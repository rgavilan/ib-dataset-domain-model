package es.um.asio.domain.actividades;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Actividades.xml"
 */
@Getter
@Setter
@ToString
public class Actividad extends DataSetDataBase {  
    
    /**
     * Mapping of field IDACTIVIDAD.
     */
    private long idActividad;
    
    /**
     * Mapping of field CODTIPOACTIVIDAD.
     */
    private String codTipoActividad;  
    
    /**
     * Mapping of field TITULO.
     */
    private String titulo;
    
    /**
     * Mapping of field IDTERCERO.
     */
    private long idTercero;
    
    /**
     * Mapping of field TERCEROCONFIDENCIAL.
     */
    private String terceroConfidencial;
    
    /**
     * Mapping of field CODTIPOMONEDA.
     */
    private String codTipoMoneda;
    
    /**
     * Mapping of field IMPORTEBASE.
     */
    private float importeBase;
    
    /**
     * Mapping of field TIPOIMPUESTO.
     */
    private String tipoImpuesto;
    
    /**
     * Mapping of field TIPOIMPOSITIVO.
     */
    private Float tipoImpositivo;
    
    /**
     * Mapping of field IMPORTEREPERCUTIDO.
     */
    private float importeRepercutido;
    
    /**
     * Mapping of field IMPORTETOTAL.
     */
    private float importeTotal;
    
    /**
     * Mapping of field FECHAINICIOACTIVIDAD.
     */
    private String fechaInicioActividad;
    
    /**
     * Mapping of field FECHAFINACTIVIDAD.
     */
    private String fechaFinActividad;    
}
