package es.um.asio.domain.paginas;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Requisitos contratos postdoctorales.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class RequisitoContratoPostdoctoral extends OperationableDataSetDataBase {  
    
    /**
     * Mapping of field RESOP_NUMERO.
     */
    private Long resopNumero;
    
    /**
     * Mapping of field RESOP_REQCODIGO.
     */
    private String resopReqCodigo;
    
    /**
     * Mapping of field RESOP_CUMPLEREQ.
     */
    private String resopCumpleReq;
}