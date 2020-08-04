package es.um.asio.domain.oaipmh;

import java.util.List;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
public class ListIdentifiersType {

    private List<HeaderType> header;
}
