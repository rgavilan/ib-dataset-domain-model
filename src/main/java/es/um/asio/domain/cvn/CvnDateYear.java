package es.um.asio.domain.cvn;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/**
 * The Class CvnDateYear.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CvnDateYear", propOrder = {
    "value"
})
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class CvnDateYear extends CvnBean
{
    
    /**
     * The value.
     */
    @XmlElement(name = "Value")
    @XmlSchemaType(name = "dateTime")
    @Transient
    private XMLGregorianCalendar value;
    
    /**
     * The date.
     */
    @Transient
    private Date date;
    
    @Column(name = "date")
    @Access(AccessType.PROPERTY)
    public Date getDate() {
        return value.toGregorianCalendar().getTime();
    }
}
