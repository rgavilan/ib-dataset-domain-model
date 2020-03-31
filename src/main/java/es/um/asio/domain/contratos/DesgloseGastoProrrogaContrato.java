package es.um.asio.domain.contratos;

import javax.persistence.Entity;

import es.um.asio.domain.DataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Desglose gastos prorrogas contratos.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class DesgloseGastoProrrogaContrato extends DataSetDataBase {  
    
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
