package es.um.asio.domain.recursosHumanos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SubprogramaRecursosHumanos extends DataSetDataBase {  
    private long idConvocatoriaRecursoHumano;
    private String idSubprograma;
    private String descripcion;
    private String resumen;
    private String fechaResolucion;
    private String fechaAlegacion;
}
