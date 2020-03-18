package es.um.asio.domain.investigationGroup;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Investigation Group data set POJO
 */
@Getter
@Setter
@ToString
public class InvestigationGroup extends DataSetDataBase {
    /**
     * Investigation Group ID
     */
    private String investigationGroupId;

    /**
     * Description
     */
    private String description;

    /**
     * Administration unit Code
     */
    private String administrationUnitCode;

    /**
     * Excelencia
     */
    private String excellency;

    /**
     * Fecha creación
     */
    private String creationDate;

    /**
     * Fecha de desaparición
     */
    private String extinctionDate;
}
