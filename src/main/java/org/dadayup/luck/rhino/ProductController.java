package org.dadayup.luck.rhino;

import org.dadayup.luck.rhino.dao.ProductDao;
import org.dadayup.luck.rhino.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by cook on 2020/4/17
 */
@RestController
public class ProductController {

    @Autowired
    private ProductDao productDao;

    @PostMapping("/product/add")
    @ResponseBody
    public long hello(@RequestBody Product product) {
        productDao.insert(product);
        return product.getId();
    }

    @GetMapping("/product/{productId}")
    @ResponseBody
    public Product hello(@PathVariable Long productId) {
        return productDao.queryById(productId);
    }

}
