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
public class GrupoInvestigacion extends DataSetDataBase {
    /**
     * Investigation Group ID
     */
    private String idGrupoInvestigacion;

    /**
     * Description
     */
    private String descripcion;

    /**
     * Administration unit Code
     */
    private String codUnidadAdm;

    /**
     * Excelencia
     */
    private String excelencia;

    /**
     * Fecha creación
     */
    private String fechaCreacion;

    /**
     * Fecha de desaparición
     */
    private String fechaDesaparicion;
}
