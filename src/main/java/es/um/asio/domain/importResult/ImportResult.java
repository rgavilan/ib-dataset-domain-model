package es.um.asio.domain.importResult;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;

import es.um.asio.domain.DataSetDataBase;
import es.um.asio.domain.exitStatus.ExitStatus;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class ImportResult.
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class ImportResult extends DataSetDataBase {    
    
    /**
     * Instantiates a new {@link ImportResult}.
     *
     * @param exitStatus the exit status
     */
    public ImportResult(ExitStatus exitStatus) {
        this.exitStatus = exitStatus;
        this.setVersion(exitStatus.getVersion());
        this.date = System.currentTimeMillis();
    }
    
    /**
     * The date of result.
     */
    private Long date;
    
    /**
     * The exit status.
     */
    @OneToOne(cascade = CascadeType.ALL)
    private ExitStatus exitStatus;
}
