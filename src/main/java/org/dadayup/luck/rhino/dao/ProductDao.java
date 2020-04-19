package org.dadayup.luck.rhino.dao;

import org.apache.ibatis.annotations.*;
import org.dadayup.luck.rhino.entity.Product;

/**
 * Created by cook on 2020/4/20
 */
@Mapper
public interface ProductDao {

    @Insert("INSERT INTO product\n" +
            "(create_time, update_time, product_name, product_code, background_image, title, category_code)\n" +
            "VALUES(CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, #{productName}, #{productCode}, #{backgroundImage}, #{title}, #{categoryCode});\n")
    @Options(useGeneratedKeys=true, keyProperty="id")
    long insert(Product product);

    @Select("SELECT * FROM product WHERE id = #{id}")
    @Results({
            @Result(property = "productName",  column = "product_name"),
            @Result(property = "productCode", column = "product_code"),
            @Result(property = "backgroundImage", column = "background_image"),
            @Result(property = "categoryCode", column = "category_code")
    })
    Product queryById(Long id);



}
