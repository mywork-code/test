package com.xgh.service;


import com.xgh.dao.BannerInfoMapper;
import com.xgh.dao.PaUserMapper;
import com.xgh.domain.entity.BannerInfoEntity;
import com.xgh.domain.entity.PAUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by DELL on 2018/9/11.
 */
@Service
public class PAUserService {
    @Autowired
    private PaUserMapper paUserMapper;

    @Autowired
    private BannerInfoMapper bannerInfoMapper;

    public String getTel(){
        PAUser p = paUserMapper.selectByPrimaryKey(19l);
        return p.getTelephone();
    }

    public List<BannerInfoEntity> loadBanners(){
        return bannerInfoMapper.loadBanners();
    }
}
