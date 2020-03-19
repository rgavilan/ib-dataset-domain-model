package es.um.asio.domain.proyectos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Project data set POJO
 */
@Getter
@Setter
@ToString
public class OrigenProyecto extends DataSetDataBase {
    /**
     * Origin project ID
     */
    private String idOrigenProyecto;

    /**
     * Código de tipo de origen.
     */
    private String codTipoOrigen;
    
    /**
     * Descripción
     */
    private String descripcion;

}
