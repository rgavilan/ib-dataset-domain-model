package es.um.asio.domain.project;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Project data set POJO
 */
@Getter
@Setter
@ToString
public class FechaProyecto extends DataSetDataBase {
    /**
     * Project ID
     */
    private Long idProyecto;
    
    /**
     * Número
     */
    private Long numero;
    
    /**
     * Fecha de inicio de expediente
     */
    private String fechaInicioExpediente;

    /**
     * Fecha de inicio de proyecto
     */
    private String fechaInicioProyecto;

    /**
     * Fecha de fin de proyecto
     */
    private String fechaFinProyecto;

    /**
     * Código del tipo de motivo del cambio de fecha
     */
    private String codTipoMotivoCambioFecha;
    
    /**
     * Motivo del cambio de fecha
     */
    private String motivoCambioFecha;
}
