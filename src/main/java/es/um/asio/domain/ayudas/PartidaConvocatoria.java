package es.um.asio.domain.ayudas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PartidaConvocatoria extends DataSetDataBase {  
    private long idConvocatoriaAyuda;
    private long idSubprograma;
    private long numero;
    private long idUnidadOrg;
    private String codEconomica;
    private String codFuncional;
    private String tipoAplicacionEco;
}
