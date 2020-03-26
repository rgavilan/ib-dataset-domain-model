package es.um.asio.domain.proyectos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Tipos fuentes financiacion.xml"
 */
@Getter
@Setter
@ToString
public class TipoFuenteFinanciacion extends DataSetDataBase {  
    
    /**
     * Mapping of field CODTIPOFUENTE.
     */
    private String codTipoFuente;
    
    /**
     * Mapping of field DESCRIPCION.
     */
    private String descripcion;
    
    /**
     * Mapping of field FONDOESTRUCTURAL.
     */
    private String fondoEstructural;
}
