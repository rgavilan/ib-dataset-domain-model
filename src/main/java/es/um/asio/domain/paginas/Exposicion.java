package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class Exposicion.
 */
@Getter
@Setter
@ToString
public class Exposicion extends DataSetDataBase {  
    
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