package es.um.asio.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Generic input data
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class InputData<T extends DataSetData> {
    /**
     * Data set data.
     */
    private T data;
}
