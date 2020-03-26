package es.um.asio.domain.gruposInvestigacion;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Datos equipo investigacion.xml"
 */
@Getter
@Setter
@ToString
public class DatosEquipoInvestigacion extends DataSetDataBase {  
    
    /**
     * Mapping of field IDGRUPOINVESTIGACION.
     */
    private String idGrupoInvestigacion;
    
    /**
     * Mapping of field NUMERO.
     */
    private long numero;
    
    /**
     * Mapping of field IDPERSONA.
     */
    private long idPersona;
    
    /**
     * Mapping of field CODTIPOPARTICIPACION.
     */
    private String codTipoParticipacion;
    
    /**
     * Mapping of field RESPONSABLE.
     */
    private String responsable;
    
    /**
     * Mapping of field EDP.
     */
    private Float edp;
    
    /**
     * Mapping of field FECHAINICIOPERIODO.
     */
    private String fechaInicioPeriodo;
    
    /**
     * Mapping of field FECHAFINPERIODO.
     */
    private String fechaFinPeriodo;
}
