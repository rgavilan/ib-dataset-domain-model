package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class Convocatoria.
 */
@Getter
@Setter
@ToString
public class Convocatoria extends DataSetDataBase {  
    
    /**
     * Mapping of field PCON_ENTI_CODIGO.
     */
    private long pconEntiCodigo;
    
    /**
     * Mapping of field PCON_MODA_CODIGO.
     */
    private long pconModaCodigo;
    
    /**
     * Mapping of field PCON_FASE.
     */
    private long pconFase;
    
    /**
     * Mapping of field PCON_FECHARESO.
     */
    private String pconFechaReso;
    
    /**
     * Mapping of field PCON_DESCRIPCION.
     */
    private String pconDescripcion;
    
    /**
     * Mapping of field PCON_FECHA_INICIO.
     */
    private String pconFechaInicio;
    
    /**
     * Mapping of field PCON_FECHA_FIN.
     */
    private String pconFechaFin;
}
