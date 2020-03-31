package es.um.asio.domain.paginas;

import javax.persistence.Entity;

import es.um.asio.domain.DataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Ayudas postdoctorales.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class AyudaPostdoctoral extends DataSetDataBase {  
    
    /**
     * Mapping of field SOLAY_NUMERO.
     */
    private long solayNumero;
    
    /**
     * Mapping of field IDPERSONA.
     */
    private Long idPersona;
    
    /**
     * Mapping of field IDPERSONADIRECTOR.
     */
    private Long idPersonaDirector;
    
    /**
     * Mapping of field SOLAY_CODIGO_TESIS_SIVA.
     */
    private Long solayCodigoTesisSiva;
    
    /**
     * Mapping of field TINA_FECHA.
     */
    private String tinaFecha;
    
    /**
     * Mapping of field TINA_CALIFICACION.
     */
    private String tinaCalificacion;
    
    /**
     * Mapping of field TINA_TITULO.
     */
    private String tinaTitulo;
    
    /**
     * Mapping of field SOLAY_FECINI_PREDOC.
     */
    private String solayFecIniPreDoc;
    
    /**
     * Mapping of field SOLAY_FECFIN_PREDOC.
     */
    private String solayFecFinPreDoc;
    
    /**
     * Mapping of field SOLAY_SOLB_NPOSTDOC.
     */
    private Long solaySolbNPostDoc;
    
    /**
     * Mapping of field SOLAY_FECCONV_POSTDOC.
     */
    private String solayFecConvPostDoc;
    
    /**
     * Mapping of field SOLAY_ENTIDAD_CONV_POSTDOC.
     */
    private String solayEntidadConvPostDoc;
    
    /**
     * Mapping of field SOLAY_ESTADO.
     */
    private String solayEstado;
}
