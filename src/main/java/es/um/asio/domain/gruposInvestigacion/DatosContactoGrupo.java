package es.um.asio.domain.gruposInvestigacion;

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
public class DatosContactoGrupo extends DataSetDataBase {
    /**
     * Investigation Group ID
     */
    private String idGrupoInvestigacion;

    /**
     * número
     */
    private Long numero;

    /**
     * código del tipo de forma de contacto
     */
    private String codTipoFormaContacto;

    /**
     * valor
     */
    private String valor;
}
