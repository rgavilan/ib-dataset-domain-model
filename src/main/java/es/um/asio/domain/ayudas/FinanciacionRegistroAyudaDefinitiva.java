package es.um.asio.domain.ayudas;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Financiacion registros ayudas definitivas.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class FinanciacionRegistroAyudaDefinitiva extends OperationableDataSetDataBase {  
    
    /**
     * Mapping of field IDINTERNO.
     */
    private Long idInterno;
    
    /**
     * Mapping of field CODORGANIZACIONEMISOR.
     */
    private String codOrganizacionEmisor;
    
    /**
     * Mapping of field IDDOCUMENTO.
     */
    private String idDocumento;
    
    /**
     * Mapping of field NUMERO.
     */
    private Long numero;
    
    /**
     * Mapping of field CODIGOTIPOFINANCIACION.
     */
    private String codigoTipoFinanciacion;
    
    /**
     * Mapping of field DESCRIPCIONTIPOFINANCIACION.
     */
    private String descripcionTipoFinanciacion;
    
    /**
     * Mapping of field CODIGOTIPOFUENTE.
     */
    private String codigoTipoFuente;
    
    /**
     * Mapping of field DESCRIPCIONTIPOFUENTE.
     */
    private String descripcionTipoFuente;
    
    /**
     * Mapping of field IMPORTE.
     */
    private Float importe;
}
