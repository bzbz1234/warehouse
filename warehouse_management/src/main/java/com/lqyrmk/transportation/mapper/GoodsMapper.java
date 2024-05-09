package com.lqyrmk.transportation.mapper;

import com.lqyrmk.transportation.entity.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface GoodsMapper {

    List<Goods> getAllGoods();

    List<Goods> getAllGoodsByInfo(Map<String, Object> infoMap);

    Goods getGoodsById(@Param("goodsId") Integer goodsId);

    void insertGoods(Goods goods);

    void updateGoods(Goods goods);

    void deleteGoods(@Param("goodsId") Integer goodsId);

    void updateGoodsStock(@Param("goodsId") Integer goodsId);
}
