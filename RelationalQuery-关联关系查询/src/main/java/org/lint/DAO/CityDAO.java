package org.lint.DAO;

import org.lint.Entity.City;

import java.util.List;


public interface CityDAO {
    //    多对一关联查询例子
    List<City> seleProvincebyID(int id);
    List<City> seleProvincebyID2(int id);
}
