package org.dadayup.luck.rhino.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.dadayup.luck.rhino.entity.Inventory;

import java.util.List;

/**
 * Created by cook on 2020/4/20
 */
@Mapper
public interface InventoryDao {

    Inventory getById(Long id);

    int save(Inventory bean);

    int update(Inventory bean);

    // (
    List<Inventory> query(@Param("criteria") Inventory criteria);

}
