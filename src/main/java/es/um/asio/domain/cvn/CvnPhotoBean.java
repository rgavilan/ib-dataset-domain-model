package es.um.asio.domain.cvn;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class CvnPhotoBean.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CvnPhotoBean", propOrder = {
    "bytesInBase64",
    "mimeType"
})
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class CvnPhotoBean extends CvnBean
{
    
    /**
     * The bytes in base 64.
     */
    @XmlElement(name = "BytesInBase64")
    private String bytesInBase64;
    
    /**
     * The mime type.
     */
    @XmlElement(name = "MimeType")
    private String mimeType;
}
