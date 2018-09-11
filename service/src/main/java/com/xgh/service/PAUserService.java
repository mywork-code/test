package com.xgh.service;


import com.xgh.dao.PaUserMapper;
import com.xgh.domain.entity.PAUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by DELL on 2018/9/11.
 */
@Service
public class PAUserService {
    @Autowired
    private PaUserMapper paUserMapper;

    public String getTel(){
        PAUser p = paUserMapper.selectByPrimaryKey(19l);
        return p.getTelephone();
    }
}
