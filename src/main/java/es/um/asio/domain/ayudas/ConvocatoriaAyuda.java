package es.um.asio.domain.ayudas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ConvocatoriaAyuda extends DataSetDataBase {  
    private long idConvocatoriaAyuda;
    private String descripcion;
    private long idEmpresaFinanciadora;
    private Long idEmpresaGestora;
    private String referenciaConvocatoria;
    private String fechaConvocatoria;
    private String fechaResolucion;
    private String fechaAlegacion;
    private String Observaciones;
}
