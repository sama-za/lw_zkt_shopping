package generate;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * FORMINFO
 * @author 
 */
@Data
public class Forminfo implements Serializable {
    private String id;

    private String selectitemid;

    private String objname;

    private String objdesc;

    private String objtablename;

    private BigDecimal objtype;

    private String col1;

    private String col2;

    private String col3;

    private BigDecimal isdelete;

    private String moduleid;

    private String createdatetime;

    private static final long serialVersionUID = 1L;
}