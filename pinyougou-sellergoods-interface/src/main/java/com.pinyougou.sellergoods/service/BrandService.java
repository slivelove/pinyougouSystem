package com.pinyougou.sellergoods.service;
/**
 * 品牌服务层接口
 * @author Administrator
 *
 */

import java.util.List;
import java.util.Map;

import com.pinyougou.pojo.TbBrand;

import entity.PageResult;

public interface BrandService {
	List<TbBrand> findAll();
	
	/**
	 * 返回分页列表
	 */
	PageResult findPage(int pageNum, int pageSize);
	
	void add(TbBrand brand);
	
	TbBrand findOne(long id);
	
	void update(TbBrand brand);
	
	void delete(Long[] ids);
	
	PageResult findPage(TbBrand brand, int pageNum, int pageSize);
	
	public List<Map> selectOptionList();
}
