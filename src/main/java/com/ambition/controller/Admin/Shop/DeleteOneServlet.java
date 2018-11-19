package com.ambition.controller.Admin.Shop;
/**
 * @Author: ambition
 * @Date: 2018/10/30 15:19
 * @Version 1.0
 */

import com.ambition.service.Shop.MaintainService;
import com.ambition.util.LogTools;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @program: MybatisDemo
 * @description: 删除单条用户数据
 * @author: ambition
 * @create: 2018-10-30 15:19
 **/
@WebServlet("/shopdelOne.ro")
public class DeleteOneServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        LogTools.show("DeleteOneShopServlet","doGet");

        //设置编码
        req.setCharacterEncoding("UTF-8");

        //接受页面的值
        String shopId=req.getParameter("shopId");

        //调用维护服务的删除单个用户方法
        MaintainService maintainService=new MaintainService();
        maintainService.deleteOne(shopId);
        LogTools.show("DeleteOneShopServlet",shopId);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
