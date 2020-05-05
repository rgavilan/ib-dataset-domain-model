package es.um.asio.domain;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;

import es.um.asio.abstractions.domain.Operation;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The class of representing generic data set data with operation
 */
@MappedSuperclass
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
public class OperationableDataSetDataBase extends DataSetDataBase {
    
    /**
     * The entity operation.
     */
    @Enumerated(EnumType.STRING)  
    private Operation operation = Operation.INSERT;
    
}
