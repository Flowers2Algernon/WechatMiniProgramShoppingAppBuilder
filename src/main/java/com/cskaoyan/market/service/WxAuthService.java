package com.cskaoyan.market.service;

import com.cskaoyan.market.db.domain.MarketUser;

/**
 * @Author 远志 zhangsong@cskaoyan.onaliyun.com
 * @Date 2024/5/18 9:52
 * @Version 1.0
 */
public interface WxAuthService {
    MarketUser login(String username, String password);

    MarketUser getByUsername(String username);
}
