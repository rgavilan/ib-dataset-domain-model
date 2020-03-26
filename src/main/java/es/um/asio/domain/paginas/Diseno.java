package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class Diseno.
 */
@Getter
@Setter
@ToString
public class Diseno extends DataSetDataBase {  
    
    /**
     * Mapping of field DISE_CODIGO.
     */
    private long diseCodigo;
    
    /**
     * Mapping of field DISE_DESCRIPCION.
     */
    private String diseDescripcion;
    
    /**
     * Mapping of field DISE_FECHA.
     */
    private String diseFecha;
    
    /**
     * Mapping of field DISE_TDIS_CODIGO.
     */
    private long diseTdisCodigo;
    
    /**
     * Mapping of field DISE_CALIDADES.
     */
    private Long diseCalidades;
}