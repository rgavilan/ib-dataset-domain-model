package es.um.asio.domain.oaipmh;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
public class RecordType extends OperationableDataSetDataBase{

	private static final long serialVersionUID = 2210658339814725505L;

	protected MetadataType metadata;
	
}
