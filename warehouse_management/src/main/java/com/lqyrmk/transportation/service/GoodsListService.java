package com.lqyrmk.transportation.service;

import com.lqyrmk.transportation.entity.Goods;
import com.lqyrmk.transportation.entity.GoodsList;

import java.util.List;

public interface GoodsListService {

    List<GoodsList> getGoodsList();

    void addGoodsToList(Integer goodsId);

    void deleteGoodsList(Integer goodsId);
}
