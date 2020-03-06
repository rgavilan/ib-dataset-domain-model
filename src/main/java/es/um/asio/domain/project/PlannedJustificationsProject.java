package es.um.asio.domain.project;

import es.um.asio.domain.DataSetData;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Planned Justifications Projects data set POJO
 */
@Getter
@Setter
@ToString
public class PlannedJustificationsProject implements DataSetData {
    /**
     * Project ID
     */
    private Long projectId;
    
    /**
     * Origin project ID
     */
    private String originProjectId;
    
    /**
     * El número de justificación prevista.
     */
    private Long expectedJustificationNumber;

    /**
     * Código de tipo de origen.
     */
    private String typeOriginCode;

    /**
     * El tipo de justificación
     */
    private String justificationType;

    /**
     * La clase de justificación
     */
    private String justificationClass;

    /**
     * La fecha de inicio de devengo
     */
    private String startDateIncome;

    /**
     * La fecha de fin de devengo
     */
    private String endDateIncome;

    /**
     * La fecha de inicio de contabilización
     */
    private String startDateAccounting;

    /**
     * La fecha de inicio de pago
     */
    private String startDatePayment;
    
    /**
     * La fecha de fin de pago
     */
    private String endDatePayment;

    /**
     * La fecha prevista
     */
    private String expectedDate;

    /**
     * Observaciones
     */
    private String remarks;

}
