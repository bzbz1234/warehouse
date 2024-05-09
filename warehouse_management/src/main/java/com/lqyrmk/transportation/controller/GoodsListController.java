package com.lqyrmk.transportation.controller;

import com.lqyrmk.transportation.entity.GoodsList;
import com.lqyrmk.transportation.service.GoodsListService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Slf4j
@Controller
public class GoodsListController {

    @Autowired
    private GoodsListService goodsListService;

    @GetMapping("/getGoodsListInfo")
    public String getGoodsListInfo(Model model) {
        // 获取清单中所有的货物信息
        List<GoodsList> allGoodsItem = goodsListService.getGoodsList();
        System.out.println(allGoodsItem);
        // 将所有的货物信息在请求域中共享
        model.addAttribute("allGoodsItem", allGoodsItem);
        // 跳转到货物列表页面
        return "goods_list/goods_list_info";
    }

    @GetMapping("/addToList")
    public String addToList(@RequestParam("goodsId") Integer goodsId) {
        // 将货物添加到运输清单中
        goodsListService.addGoodsToList(goodsId);
        return "redirect:/getGoodsInfo";
    }

    @GetMapping("/deleteGoodsList/{goodsId}")
    public String deleteGoodsList(@PathVariable("goodsId") Integer goodsId) {
        // 根据id删除订单
        goodsListService.deleteGoodsList(goodsId);
        return "redirect:/getGoodsListInfo";
    }

}
