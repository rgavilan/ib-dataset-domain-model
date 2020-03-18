package es.um.asio.domain.contratos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ImpuestoContratoProyecto extends DataSetDataBase {  
    private String idDocumento;
    private String tipoImpuesto;
    private Float importeBase;
    private Long tipoImpositivo;
    private Float importe;
}
