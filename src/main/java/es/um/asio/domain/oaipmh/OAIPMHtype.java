package es.um.asio.domain.oaipmh;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/**
 * The Class OAIPMHtype.
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class OAIPMHtype extends OperationableDataSetDataBase {

	private static final long serialVersionUID = 4274646162035287392L;

	private ListIdentifiersType listIdentifiers;
    
    private GetRecordType getRecord;

}
