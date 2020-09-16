package es.um.asio.domain.oaipmh;

import java.util.List;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
public class ListIdentifiersType extends OperationableDataSetDataBase{

	private static final long serialVersionUID = 3442274800948046070L;
	
	private List<HeaderType> header;
}
