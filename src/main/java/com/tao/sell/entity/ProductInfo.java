package com.tao.sell.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * 商品表实体类
 *
 * @author 赵汝涛
 * @date 2021/04/14 23:23
 */
@Entity
@Data
public class ProductInfo {
    @Id
    private String productId;

    private String productName;

    private BigDecimal productPrice;

    private int productStock;

    private String productComment;

    private String productIcon;

    private int productType;
}
