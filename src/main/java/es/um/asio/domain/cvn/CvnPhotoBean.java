package es.um.asio.domain.cvn;

import javax.persistence.Entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/**
 * The Class CvnPhotoBean.
 */
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
    private String bytesInBase64;
    
    /**
     * The mime type.
     */
    private String mimeType;
}
