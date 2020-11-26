package es.um.asio.domain.cvn;

import javax.persistence.Entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class CvnPhoneBean.
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class CvnPhoneBean extends CvnBean {

	/**
	 * The extension.
	 */
	public String extension;

	/**
	 * The international code.
	 */
	public String internationalCode;

	/**
	 * The number.
	 */
	public String number;

	/**
	 * The type.
	 */
	public String type;
}
