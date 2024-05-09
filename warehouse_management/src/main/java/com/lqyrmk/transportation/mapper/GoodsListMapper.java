package com.lqyrmk.transportation.mapper;

import com.lqyrmk.transportation.entity.Goods;
import com.lqyrmk.transportation.entity.GoodsList;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GoodsListMapper {

    List<GoodsList> getGoodsList();

    GoodsList getGoodsListByGoodsId(@Param("goodsId") Integer goodsId);

    void addGoodsToList(Goods goods);

    void updateGoodsNumber(@Param("goodsId") Integer goodsId);

    void clearGoodsList();

    void deleteGoodsList(@Param("goodsId") Integer goodsId);
}
