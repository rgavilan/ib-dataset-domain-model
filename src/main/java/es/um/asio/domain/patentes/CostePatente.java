package es.um.asio.domain.patentes;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CostePatente extends DataSetDataBase {  
    private long idPatente;
    private long numero;
    private String codTipoCostePatente;
    private String idProyecto;
    private String idDocumento;
    private String idTercero;
    private String nombre;
    private String codTipoMoneda;
    private Float importe;
    private String fechaPago;
    private String observaciones;
}
