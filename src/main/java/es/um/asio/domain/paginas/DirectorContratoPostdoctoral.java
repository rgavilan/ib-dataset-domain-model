package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Directores contratos postdoctorales.xml"
 */
@Getter
@Setter
@ToString
public class DirectorContratoPostdoctoral extends DataSetDataBase {  
    
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
