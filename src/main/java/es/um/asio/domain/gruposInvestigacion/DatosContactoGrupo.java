package es.um.asio.domain.gruposInvestigacion;

import javax.persistence.Entity;

import es.um.asio.domain.DataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Datos contacto grupos.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class DatosContactoGrupo extends DataSetDataBase {
    
    /**
     * Mapping of field IDGRUPOINVESTIGACION.
     */
    private String idGrupoInvestigacion;

    /**
     * Mapping of field NUMERO.
     */
    private Long numero;

    /**
     * Mapping of field CODTIPOFORMACONTACTO.
     */
    private String codTipoFormaContacto;

    /**
     * Mapping of field VALOR.
     */
    private String valor;
}
