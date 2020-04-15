package es.um.asio.domain.paginas;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Convocatorias.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class Convocatoria extends OperationableDataSetDataBase {  
    
    /**
     * Mapping of field PCON_ENTI_CODIGO.
     */
    private long pconEntiCodigo;
    
    /**
     * Mapping of field PCON_MODA_CODIGO.
     */
    private long pconModaCodigo;
    
    /**
     * Mapping of field PCON_FASE.
     */
    private long pconFase;
    
    /**
     * Mapping of field PCON_FECHARESO.
     */
    private String pconFechaReso;
    
    /**
     * Mapping of field PCON_DESCRIPCION.
     */
    private String pconDescripcion;
    
    /**
     * Mapping of field PCON_FECHA_INICIO.
     */
    private String pconFechaInicio;
    
    /**
     * Mapping of field PCON_FECHA_FIN.
     */
    private String pconFechaFin;
}
