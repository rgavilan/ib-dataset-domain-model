package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class EmpresaExplotacionPatente.
 */
@Getter
@Setter
@ToString
public class EmpresaExplotacionPatente extends DataSetDataBase {  
    
    /**
     * Mapping of field EPAT_PATE_NUMERO.
     */
    private long epatPateNumero;
    
    /**
     * Mapping of field EPAT_ENTI_CODIGO.
     */
    private long epatEntiCodigo;
    
    /**
     * Mapping of field EPAT_OBSERVACIONES.
     */
    private String epatObservaciones;
}