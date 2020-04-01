package es.um.asio.domain.proyectos;

import javax.persistence.Entity;

import es.um.asio.domain.DataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Justificaciones previstas proyectos.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class JustificacionPrevistaProyecto  extends DataSetDataBase {
    
    /**
     * Mapping of field IDPROYECTO.
     */
    private Long idProyecto;
    
    /**
     * Mapping of field IDORIGENPROYECTO.
     */
    private String idOrigenProyecto;
    
    /**
     * Mapping of field NUMEROJUSTIFICACIONPREVISTA.
     */
    private Long numeroJustificacionPrevista;

    /**
     * Mapping of field CODTIPOORIGEN.
     */
    private String codTipoOrigen;

    /**
     * Mapping of field TIPOJUSTIFICACION.
     */
    private String tipoJustificacion;

    /**
     * Mapping of field CLASEJUSTIFICACION.
     */
    private String claseJustificacion;

    /**
     * Mapping of field FECHAINICIODEVENGO.
     */
    private String fechaInicioDevengo;

    /**
     * Mapping of field FECHAFINDEVENGO.
     */
    private String fechaFinDevengo;

    /**
     * Mapping of field FECHAINICIOCONTABILIZACION.
     */
    private String fechaInicioContabilizacion;

    /**
     * Mapping of field FECHAINICIOPAGO.
     */
    private String fechaInicioPago;
    
    /**
     * Mapping of field FECHAFINPAGO.
     */
    private String fechaFinPago;

    /**
     * Mapping of field FECHAPREVISTA.
     */
    private String fechaPrevista;

    /**
     * Mapping of field OBSERVACIONES.
     */
    private String observaciones;

}
