package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RequisitoContratoPostdoctoral extends DataSetDataBase {  
    private Long resopNumero;
    private String resopReqCodigo;
    private String resopCumpleReq;
}