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
public class DateProjects extends DataSetDataBase {
    /**
     * Project ID
     */
    private Long projectId;
    
    /**
     * Número
     */
    private Long number;
    
    /**
     * Fecha de inicio de expediente
     */
    private String recordStartDate;

    /**
     * Fecha de inicio de proyecto
     */
    private String projectStartDate;

    /**
     * Fecha de fin de proyecto
     */
    private String projectEndDate;

    /**
     * Código del tipo de motivo del cambio de fecha
     */
    private String dateChangeReasonTypeCode;
    
    /**
     * Motivo del cambio de fecha
     */
    private String dateChangeReason;
}
