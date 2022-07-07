package generate;

import generate.Formfield;

public interface FormfieldDao {
    int deleteByPrimaryKey(String id);

    int insert(Formfield record);

    int insertSelective(Formfield record);

    Formfield selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Formfield record);

    int updateByPrimaryKey(Formfield record);
}