package es.um.asio.domain.ayudas;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Unidades gestoras unidades ayudas.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class UnidadGestoraUnidadAyuda extends OperationableDataSetDataBase {  
    
    /**
     * Mapping of field IDUNIDADAYUDA.
     */
    private long idUnidadAyuda;
    
    /**
     * Mapping of field NUMERO.
     */
    private long numero;
    
    /**
     * Mapping of field CODUNIDADADM.
     */
    private String codUnidadAdm;
}
