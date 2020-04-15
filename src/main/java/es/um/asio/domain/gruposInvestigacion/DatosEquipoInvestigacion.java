package es.um.asio.domain.gruposInvestigacion;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Datos equipo investigacion.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class DatosEquipoInvestigacion extends OperationableDataSetDataBase {  
    
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
