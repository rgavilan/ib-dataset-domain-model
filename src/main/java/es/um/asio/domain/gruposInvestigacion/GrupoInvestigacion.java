package es.um.asio.domain.gruposInvestigacion;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Grupos de investigacion.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class GrupoInvestigacion extends OperationableDataSetDataBase {
    
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
