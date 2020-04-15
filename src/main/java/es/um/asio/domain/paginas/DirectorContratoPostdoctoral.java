package es.um.asio.domain.paginas;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Directores contratos postdoctorales.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class DirectorContratoPostdoctoral extends OperationableDataSetDataBase {  
    
    /**
     * Mapping of field DIBE_SOLB_NUMERO.
     */
    private long dibeSolbNumero;
    
    /**
     * Mapping of field IDPERSONA.
     */
    private long idPersona;
    
    /**
     * Mapping of field DIBE_PRINCIPAL.
     */
    private String dibePrincipal;
}
