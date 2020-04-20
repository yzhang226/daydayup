package org.dadayup.luck.rhino.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * Created by cook on 2020/4/20
 */
@Getter
@Setter
public class Inventory {

    // SELECT create_time, update_time, id, product_id, amount
    private long id;

    private Long productId;

    private Long amount;

}
