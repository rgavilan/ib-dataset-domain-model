package es.um.asio.domain.gruposInvestigacion;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class GrupoInvestigacion.
 */
@Getter
@Setter
@ToString
public class GrupoInvestigacion extends DataSetDataBase {
    
    /**
     * Mapping of field IDGRUPOINVESTIGACION.
     */
    private String idGrupoInvestigacion;

    /**
     * Mapping of field DESCRIPCION.
     */
    private String descripcion;

    /**
     * Mapping of field CODUNIDADADM.
     */
    private String codUnidadAdm;

    /**
     * Mapping of field EXCELENCIA.
     */
    private String excelencia;

    /**
     * Mapping of field FECHACREACION.
     */
    private String fechaCreacion;

    /**
     * Mapping of field FECHADESAPARICION.
     */
    private String fechaDesaparicion;
}
