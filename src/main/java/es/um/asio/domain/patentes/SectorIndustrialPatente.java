package es.um.asio.domain.patentes;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SectorIndustrialPatente extends DataSetDataBase {  
    private long idPatente;
    private long numero;
    private String codSectorIndustrial;
}
