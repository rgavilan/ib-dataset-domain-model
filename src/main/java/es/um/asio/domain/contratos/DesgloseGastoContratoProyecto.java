package es.um.asio.domain.contratos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Desglose gastos contratos proyectos.xml"
 */
@Getter
@Setter
@ToString
public class DesgloseGastoContratoProyecto extends DataSetDataBase {  
    
    /**
     * Mapping of field IDDOCUMENTO.
     */
    private String idDocumento;
    
    /**
     * Mapping of field CODTIPOGASTOGENERICO.
     */
    private Long codTipoGastoGenerico;
    
    /**
     * Mapping of field IMPORTE.
     */
    private Float importe;
}
