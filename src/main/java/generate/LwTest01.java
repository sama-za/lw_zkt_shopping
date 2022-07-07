package generate;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * LW_TEST_01
 * @author 
 */
@Data
public class LwTest01 implements Serializable {
    private BigDecimal id;

    private String col1;

    private String col2;

    private String col3;

    private static final long serialVersionUID = 1L;
}