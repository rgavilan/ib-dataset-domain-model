package es.um.asio.domain.Contratos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ImpuestoProrrogaContrato extends DataSetDataBase {  
    private String idDocumento;
    private String tipoImpuesto;
    private Float importeBase;
    private Long tipoImpositivo;
    private Float importe;
}
