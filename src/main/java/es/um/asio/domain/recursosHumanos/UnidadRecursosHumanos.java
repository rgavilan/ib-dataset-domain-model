package es.um.asio.domain.recursosHumanos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Unidades recursos humanos.xml"
 */
@Getter
@Setter
@ToString
public class UnidadRecursosHumanos extends DataSetDataBase {  
    
    /**
     * Mapping of field IDUNIDADRECURSOHUMANO.
     */
    private long idUnidadRecursoHumano;
    
    /**
     * Mapping of field IDCONVOCATORIARECURSOHUMANO.
     */
    private long idConvocatoriaRecursoHumano;
    
    /**
     * Mapping of field IDSUBPROGRAMA.
     */
    private String idSubprograma;
    
    /**
     * Mapping of field CODTIPORECURSOHUMANO.
     */
    private String codTipoRecursoHumano;
    
    /**
     * Mapping of field IDEMPRESAGESTORA.
     */
    private Long idEmpresaGestora;
    
    /**
     * Mapping of field IDRESPONSABLEECONOMICO.
     */
    private Long idResponsableEconomico;
    
    /**
     * Mapping of field FECHAINICIOSOLICITUDES.
     */
    private String fechaInicioSolicitudes;
    
    /**
     * Mapping of field FECHAFINSOLICITUDES.
     */
    private String fechaFinSolicitudes;
    
    /**
     * Mapping of field FECHAALEGACION.
     */
    private String fechaAlegacion;
    
    /**
     * Mapping of field PLAZOPRESENTACIONINFORMES.
     */
    private String plazoPresentacionInformes;
    
    /**
     * Mapping of field DURACIONMAXIMA.
     */
    private String duracionMaxima;
    
    /**
     * Mapping of field NUMEROMAXIMORECURSOSHUMANOS.
     */
    private String numeroMaximoRecursosHumanos;
    
    /**
     * Mapping of field MOVILIDAD.
     */
    private String movilidad;
    
    /**
     * Mapping of field OBSERVACIONES.
     */
    private String observaciones;
}
