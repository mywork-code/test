package com.xgh.domain.entity;

import java.util.Date;

/**
 * banner信息
 */
public class BannerInfoEntity {

    private Long id;
    
    private String bannerName;
    
    private String bannerImgUrl;

    private String bannerImgUrlNew;

    private String bannerCategory;
    
    private String bannerType;
    
    private Long bannerOrder;
    
    private String activityUrl;
    
    private String createUser;
    private Date createDate;
    private String updateUser;
    private Date updateDate;

    private String attr;
    private String attrVal;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBannerName() {
        return bannerName;
    }

    public void setBannerName(String bannerName) {
        this.bannerName = bannerName;
    }

    public String getBannerImgUrl() {
        return bannerImgUrl;
    }

    public void setBannerImgUrl(String bannerImgUrl) {
        this.bannerImgUrl = bannerImgUrl;
    }

    public String getBannerCategory() {
        return bannerCategory;
    }

    public void setBannerCategory(String bannerCategory) {
        this.bannerCategory = bannerCategory;
    }

    public String getBannerType() {
        return bannerType;
    }

    public void setBannerType(String bannerType) {
        this.bannerType = bannerType;
    }

    public Long getBannerOrder() {
		return bannerOrder;
	}

	public void setBannerOrder(Long bannerOrder) {
		this.bannerOrder = bannerOrder;
	}

	public String getActivityUrl() {
		return activityUrl;
	}

	public void setActivityUrl(String activityUrl) {
		this.activityUrl = activityUrl;
	}

	public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getAttr() {
        return attr;
    }

    public void setAttr(String attr) {
        this.attr = attr;
    }

    public String getAttrVal() {
        return attrVal;
    }

    public void setAttrVal(String attrVal) {
        this.attrVal = attrVal;
    }
    public String getBannerImgUrlNew() {
        return bannerImgUrlNew;
    }

    public void setBannerImgUrlNew(String bannerImgUrlNew) {
        this.bannerImgUrlNew = bannerImgUrlNew;
    }
}
