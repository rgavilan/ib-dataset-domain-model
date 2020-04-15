package es.um.asio.domain.gruposInvestigacion;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Conceptos investigadores.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class ConceptoInvestigador extends OperationableDataSetDataBase {  
    
    /**
     * Mapping of field IDPERSONA.
     */
    private long idPersona;
    
    /**
     * Mapping of field NUMERO.
     */
    private long numero;
    
    /**
     * Mapping of field CODTIPOCONCEPTO.
     */
    private String codTipoConcepto;
    
    /**
     * Mapping of field TEXTO.
     */
    private String texto;
}
