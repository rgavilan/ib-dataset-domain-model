package es.um.asio.domain.goliat;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class DedicacionInvestigador extends DataSetDataBase {  
    private long id;
    private long idPersona;
    private Long idProyecto;
    private long ejercicio;
    private Float horasTotales;
    private Float porcentajeInvestigar;
    private String auto;
}
