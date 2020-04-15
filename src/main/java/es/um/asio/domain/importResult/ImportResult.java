package es.um.asio.domain.importResult;

import java.util.Date;

import javax.persistence.Entity;
import es.um.asio.domain.DataSetDataBase;
import lombok.AllArgsConstructor;
import lombok.Builder;
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
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ImportResult extends DataSetDataBase {
    
    /**
     * The start date of import.
     */
    private Date startTime;
    
    /**
     * The end date of import.
     */
    private Date endTime;
    
    /**
     * The exit status code.
     */    
    private ExitStatusCode exitStatusCode;
    
    /**
     * The job type.
     */
    private JobType jobType;
}
