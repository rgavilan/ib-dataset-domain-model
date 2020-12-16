package es.um.asio.domain.cvn;

import javax.persistence.Entity;
import javax.persistence.Lob;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class CvnDuration.
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class CvnDuration extends CvnBean {

	/**
	 * The value.
	 */
	@Lob
	public String value;

}
