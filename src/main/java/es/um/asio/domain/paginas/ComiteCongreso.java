package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ComiteCongreso extends DataSetDataBase {  
    private long congNumero;
    private String congTitCongreso;
    private String congFecha;
    private String congLugar;
    private String congInternacional;
}
