package es.um.asio.domain.paginas;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Investigadores proyectos cooperacion internacional.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class InvestigadorProyectoCooperacionInternacional extends OperationableDataSetDataBase {  
    
    /**
     * Mapping of field PROYECTO.
     */
    private long proyecto;
    
    /**
     * Mapping of field IDPERSONA.
     */
    private long idPersona;
}