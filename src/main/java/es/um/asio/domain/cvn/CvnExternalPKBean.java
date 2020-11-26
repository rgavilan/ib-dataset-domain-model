package es.um.asio.domain.cvn;

import javax.persistence.Entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class CvnExternalPKBean.
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class CvnExternalPKBean extends CvnBean {

	/**
	 * The type.
	 */
	public String type;

	/**
	 * The value.
	 */
	public String value;

	/**
	 * The others.
	 */
	public String others;
}
