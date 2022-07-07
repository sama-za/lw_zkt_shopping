package generate;

import generate.Forminfo;

public interface ForminfoDao {
    int deleteByPrimaryKey(String id);

    int insert(Forminfo record);

    int insertSelective(Forminfo record);

    Forminfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Forminfo record);

    int updateByPrimaryKey(Forminfo record);
}