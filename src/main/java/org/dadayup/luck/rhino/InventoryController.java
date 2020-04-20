package org.dadayup.luck.rhino;

import org.dadayup.luck.rhino.dao.InventoryDao;
import org.dadayup.luck.rhino.entity.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by cook on 2020/4/17
 */
@RestController
public class InventoryController {

    @Autowired
    private InventoryDao inventoryDao;

    @PostMapping("/inventory/add")
    @ResponseBody
    public long addInventory(@RequestBody Inventory inventory) {
        inventoryDao.save(inventory);
        return inventory.getId();
    }

    @GetMapping("/inventory/{inventoryId}")
    @ResponseBody
    public Inventory hello(@PathVariable Long inventoryId) {
        Inventory criteria = new Inventory();
        criteria.setId(inventoryId);
        List<Inventory> ret = inventoryDao.query(criteria);
        return CollectionUtils.isEmpty(ret) ? null : ret.get(0);
    }

}
