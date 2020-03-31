package es.um.asio.domain.gruposInvestigacion;

import javax.persistence.Entity;

import es.um.asio.domain.DataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Tipo participacion grupo.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class TipoParticipacionGrupo extends DataSetDataBase {  
    
    /**
     * Mapping of field CODTIPOPARTICIPACIONGRUPO.
     */
    private String codTipoParticipacionGrupo;
    
    /**
     * Mapping of field DESCRIPCION.
     */
    private String descripcion;
}
