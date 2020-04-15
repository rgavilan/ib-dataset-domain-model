package es.um.asio.domain.patentes;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Inventores patentes.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class InventorPatente extends OperationableDataSetDataBase {  
    
    /**
     * Mapping of field IDPATENTE.
     */
    private long idPatente;
    
    /**
     * Mapping of field NUMERO.
     */
    private long numero;
    
    /**
     * Mapping of field IDPERSONA.
     */
    private long idPersona;    
    
    /**
     * Mapping of field INVENTORPRINCIPAL.
     */
    private String inventorPrincipal;
    
    /**
     * Mapping of field PERSONALPROPIO.
     */
    private String personalPropio;
    
    /**
     * Mapping of field NUMEROORDEN.
     */
    private Long numeroOrden;    
    
    /**
     * Mapping of field PARTICIPACION.
     */
    private Float participacion;
}
