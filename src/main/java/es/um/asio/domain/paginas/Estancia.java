package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class Estancia.
 */
@Getter
@Setter
@ToString
public class Estancia extends DataSetDataBase {  
    
    /**
     * Mapping of field IDPERSONA.
     */
    private long idPersona;
    
    /**
     * Mapping of field CENTRO.
     */
    private String centro;
    
    /**
     * Mapping of field LOCALIDAD.
     */
    private String localidad;
    
    /**
     * Mapping of field PAIS.
     */
    private Long pais;
    
    /**
     * Mapping of field FECHA_INI.
     */
    private String fechaIni;
    
    /**
     * Mapping of field FECHA_FIN.
     */
    private String fechaFin;
    
    /**
     * Mapping of field TEMA.
     */
    private String tema;
    
    /**
     * Mapping of field CLAVE.
     */
    private String clave;
}