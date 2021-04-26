package com.tao.sell.repository;

import com.tao.sell.entity.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 商品表的jpa
 *
 * @author 赵汝涛
 * @date 2021/04/14 23:43
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {
}
