package com.tao.sell.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * redis锁
 *
 * @author 赵汝涛
 * @date 2021/04/26 22:47
 */
@Service
public class RedisLock {

    public boolean lock(String key,String value)
    {
        return true;
    }
}
