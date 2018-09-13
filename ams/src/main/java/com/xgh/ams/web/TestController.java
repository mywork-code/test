package com.xgh.ams.web;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xgh.ams.utils.HttpWebUtils;
import com.xgh.common.BaseConstants;
import com.xgh.common.page.Page;
import com.xgh.common.page.ResponsePageBody;
import com.xgh.domain.entity.BannerInfoEntity;
import com.xgh.service.PAUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by DELL on 2018/9/11.
 */
@Controller
public class TestController {

    @Autowired
    private PAUserService paUserService;

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return paUserService.getTel();
    }

    @RequestMapping("/test1")
    public String test1(){
        return "main";
    }

    /**
     * 查询banner信息
     */
    @RequestMapping("/test/banner/page")
    public String bannerPage(){
        return "/banner/page";
    }
    @RequestMapping("/test/banner/query")
    @ResponseBody
    public ResponsePageBody<BannerInfoEntity> pageList(HttpServletRequest request){
        Integer pageNo = Integer.valueOf(HttpWebUtils.getValue(request, "page"));
        Integer pageSize = Integer.valueOf(HttpWebUtils.getValue(request, "rows"));
        PageHelper.startPage(pageNo, pageSize,true);
        List<BannerInfoEntity> bannerInfoEntityList = paUserService.loadBanners();
        PageInfo<BannerInfoEntity> pageInfo = new PageInfo<>(bannerInfoEntityList);
        ResponsePageBody<BannerInfoEntity> respBody = new ResponsePageBody<BannerInfoEntity>();
        respBody.setTotal(pageInfo.getTotal());
        respBody.setRows(pageInfo.getList());
        respBody.setStatus(BaseConstants.CommonCode.SUCCESS_CODE);
        return respBody;
    }

}
