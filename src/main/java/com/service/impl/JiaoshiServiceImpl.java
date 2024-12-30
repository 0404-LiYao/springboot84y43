package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JiaoshiDao;
import com.entity.JiaoshiEntity;
import com.service.JiaoshiService;
import com.entity.vo.JiaoshiVO;
import com.entity.view.JiaoshiView;

@Service("jiaoshiService")
public class JiaoshiServiceImpl extends ServiceImpl<JiaoshiDao, JiaoshiEntity> implements JiaoshiService {
	
	/** 根据传入的参数进行分页查询 */
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaoshiEntity> page = this.selectPage(
                new Query<JiaoshiEntity>(params).getPage(),
                new EntityWrapper<JiaoshiEntity>()
        );
        return new PageUtils(page);
    }
    /** 根据传入的参数获取符合条件的记录 */
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaoshiEntity> wrapper) {
		  Page<JiaoshiView> page =new Query<JiaoshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    /** 根据条件查询列表，返回jiaoshivO对象的列表 */
    @Override
	public List<JiaoshiVO> selectListVO(Wrapper<JiaoshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	/** 利用条件查询单个jiaoshiVO对象 */
	@Override
	public JiaoshiVO selectVO(Wrapper<JiaoshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	/** 根据条件查询jiaoshiView对象的列表 */
	@Override
	public List<JiaoshiView> selectListView(Wrapper<JiaoshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}
	/** 根据条件查询单个jiaoshiView对象 */
	@Override
	public JiaoshiView selectView(Wrapper<JiaoshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
