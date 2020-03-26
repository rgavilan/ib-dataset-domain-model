package es.um.asio.domain.ayudas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class UnidadAyuda.
 */
@Getter
@Setter
@ToString
public class UnidadAyuda extends DataSetDataBase {  
    
    /**
     * Mapping of field IDUNIDADAYUDA.
     */
    private long idUnidadAyuda;
    
    /**
     * Mapping of field IDCONVOCATORIAAYUDA.
     */
    private long idConvocatoriaAyuda;
    
    /**
     * Mapping of field IDSUBPROGRAMA.
     */
    private long idSubprograma;
    
    /**
     * Mapping of field CODTIPOAYUDA.
     */
    private String codTipoAyuda;
    
    /**
     * Mapping of field CODTIPOCATEGORIA.
     */
    private String codTipoCategoria;
    
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
     * Mapping of field FECHARESOLUCION.
     */
    private String fechaResolucion;
    
    /**
     * Mapping of field FECHAALEGACION_1.
     */
    private String fechaAlegacion1;
    
    /**
     * Mapping of field FECHAFASE1.
     */
    private String fechaFase1;
    
    /**
     * Mapping of field FECHAFASE2.
     */
    private String fechaFase2;
    
    /**
     * Mapping of field CODTIPOMONEDA.
     */
    private String codTipoMoneda;
    
    /**
     * Mapping of field IMPORTEMINIMO.
     */
    private String importeMinimo;
    
    /**
     * Mapping of field IMPORTEMAXIMO.
     */
    private String importeMaximo;
    
    /**
     * Mapping of field INTERESMINIMO.
     */
    private String interesMinimo;
    
    /**
     * Mapping of field INTERESMAXIMO.
     */
    private String interesMaximo;
    
    /**
     * Mapping of field ANUALIDADES.
     */
    private String anualidades;
    
    /**
     * Mapping of field CONTROLANUALIDADES.
     */
    private String controlAnualidades;
    
    /**
     * Mapping of field OBSERVACIONES.
     */
    private String observaciones;
}
