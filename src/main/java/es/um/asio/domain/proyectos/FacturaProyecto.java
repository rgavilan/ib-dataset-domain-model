package es.um.asio.domain.proyectos;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Facturas proyectos.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class FacturaProyecto extends OperationableDataSetDataBase {  
    
    /**
     * Mapping of field IDPROYECTO.
     */
    private long idProyecto;
    
    /**
     * Mapping of field NUMERO.
     */
    private long numero;
    
    /**
     * Mapping of field NUMEROANUALIDAD.
     */
    private String numeroAnualidad;
    
    /**
     * Mapping of field IDFACTURAEMITIDA.
     */
    private String idFacturaEmitida;
    
    /**
     * Mapping of field NUMEROFACTURAPREVISTA.
     */
    private Long numeroFacturaPrevista;
}
