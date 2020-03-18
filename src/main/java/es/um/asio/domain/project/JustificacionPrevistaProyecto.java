package es.um.asio.domain.project;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Planned Justifications Projects data set POJO
 */
@Getter
@Setter
@ToString
public class JustificacionPrevistaProyecto  extends DataSetDataBase {
    /**
     * Project ID
     */
    private Long idProyecto;
    
    /**
     * Origin project ID
     */
    private String idOrigenProyecto;
    
    /**
     * El número de justificación prevista.
     */
    private Long numeroJustificacionPrevista;

    /**
     * Código de tipo de origen.
     */
    private String codTipoOrigen;

    /**
     * El tipo de justificación
     */
    private String tipoJustificacion;

    /**
     * La clase de justificación
     */
    private String claseJustificacion;

    /**
     * La fecha de inicio de devengo
     */
    private String fechaInicioDevengo;

    /**
     * La fecha de fin de devengo
     */
    private String fechaFinDevengo;

    /**
     * La fecha de inicio de contabilización
     */
    private String fechaInicioContabilizacion;

    /**
     * La fecha de inicio de pago
     */
    private String fechaInicioPago;
    
    /**
     * La fecha de fin de pago
     */
    private String fechaFinPago;

    /**
     * La fecha prevista
     */
    private String fechaPrevista;

    /**
     * Observaciones
     */
    private String observaciones;

}
