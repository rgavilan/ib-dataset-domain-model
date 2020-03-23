package es.um.asio.domain.proyectos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ImporteProyecto extends DataSetDataBase {  
    private long idProyecto;
    private long numero;
    private String codTipoMoneda;
    private Float importeSolicitado;
    private Float importeConcedido;
    private Float importeInfraestructuraSoli;
    private Float importeInfraestructuraConce;
    private Float importeGlobal;
    private Float importe;
}
