package es.um.asio.domain.paginas;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Exposiciones.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class Exposicion extends OperationableDataSetDataBase {  
    
    /**
     * Mapping of field CODIGO.
     */
    private long codigo;
    
    /**
     * Mapping of field NOMBRE.
     */
    private String nombre;
    
    /**
     * Mapping of field FECHA.
     */
    private String fecha;
    
    /**
     * Mapping of field LUGAR.
     */
    private String lugar;
    
    /**
     * Mapping of field TIPO.
     */
    private String tipo;
    
    /**
     * Mapping of field CALIDADES.
     */
    private Long calidades;
    
    /**
     * Mapping of field INCORPORAR_A_CVN.
     */
    private String incorporarACvn;
}