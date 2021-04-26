package com.tao.sell.controller;

import com.tao.sell.entity.ProductInfo;
import com.tao.sell.repository.ProductInfoRepository;
import com.tao.sell.service.imp.ProductInfoServerImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 商品表controller
 *
 * @author 赵汝涛
 * @date 2021/04/14 23:51
 */
@RestController
public class ProductInfoController {
    @Autowired
    private ProductInfoServerImp productInfoServerImp;

    @Autowired
    private ProductInfoRepository productInfoRepository;


    @GetMapping(value = "/select")
    public List<ProductInfo> select(){
        List<ProductInfo> productInfos= productInfoRepository.findAll();
        return productInfoRepository.findAll();
    }

}
