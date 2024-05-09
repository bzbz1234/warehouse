package com.lqyrmk.transportation.service;

import com.lqyrmk.transportation.entity.Goods;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

public interface GoodsService {

    List<Goods> getAllGoods();

    List<Goods> getGoodsByInfo(Map<String, Object> infoMap);

    Goods getGoodsById(Integer goodsId);

    void saveGoods(Goods goods);

    void updateGoods(Goods goods);

    void deleteGoods(Integer goodsId);

}
