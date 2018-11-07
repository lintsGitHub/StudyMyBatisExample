package org.lint.DAO;


import org.lint.Entity.Province;

public interface ProvinceDAO {
    //    一对多关联查询例子
    Province seleProvincebyID(int id);
    Province seleProvincebyID2(int id);


}
