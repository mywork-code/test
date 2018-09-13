package com.xgh.dao;

import com.xgh.domain.entity.BannerInfoEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by DELL on 2018/9/13.
 */
@Mapper
public interface BannerInfoMapper extends GenericMapper<BannerInfoEntity,Long> {

    List<BannerInfoEntity> loadBanners();
}
