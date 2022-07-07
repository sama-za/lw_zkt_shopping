package generate;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * FORMFIELD
 * @author 
 */
@Data
public class Formfield implements Serializable {
    private String id;

    private String formid;

    private String fieldname;

    private BigDecimal htmltype;

    private String fieldtype;

    private String fieldattr;

    private String fieldcheck;

    private String labelid;

    private String labelname;

    private BigDecimal isdelete;

    private String col1;

    private String col2;

    private String col3;

    private BigDecimal isonly;

    private BigDecimal needlog;

    private String isprompt;

    private BigDecimal isexcel;

    private BigDecimal isdefault;

    private BigDecimal ismoney;

    private String docdir;

    private BigDecimal ordernum;

    private BigDecimal isencryption;

    private BigDecimal excelordernum;

    private static final long serialVersionUID = 1L;
}