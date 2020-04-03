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
 * The Class CvnLanguage.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CvnLanguageBean", propOrder = {
    "languageName",
    "languageCode"
})
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class CvnLanguage extends CvnBean
{
    
    /**
     * The language name.
     */
    @XmlElement(name = "LanguageName")
    private String languageName;
    
    /**
     * The language code.
     */
    @XmlElement(name = "LanguageCode")
    private String languageCode;
}
