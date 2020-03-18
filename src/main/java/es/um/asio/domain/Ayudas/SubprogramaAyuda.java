package es.um.asio.domain.Ayudas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SubprogramaAyuda extends DataSetDataBase {  
    private long idConvocatoriaAyuda;
    private long idSubprograma;
    private String descripcion;
    private String resumen;
    private String fechaResolucion;
    private String fechaAlegacion;
}
