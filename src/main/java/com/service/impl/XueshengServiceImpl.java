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


import com.dao.XueshengDao;
import com.entity.XueshengEntity;
import com.service.XueshengService;
import com.entity.vo.XueshengVO;
import com.entity.view.XueshengView;

@Service("xueshengService")
public class XueshengServiceImpl extends ServiceImpl<XueshengDao, XueshengEntity> implements XueshengService {
	
	/** 根据传入的参数进行分页查询 */
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshengEntity> page = this.selectPage(
                new Query<XueshengEntity>(params).getPage(),
                new EntityWrapper<XueshengEntity>()
        );
        return new PageUtils(page);
    }
    /** 重载的querypage方法，支持额外的查询条件 */
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengEntity> wrapper) {
		  Page<XueshengView> page =new Query<XueshengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    /** 根据条件查询列表，返回xueshengVO对象的列表 */
    @Override
	public List<XueshengVO> selectListVO(Wrapper<XueshengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	/** 根据条件查询单个xueshengVO对象 */
	@Override
	public XueshengVO selectVO(Wrapper<XueshengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	/** 根据条件查询xueshengview对象的列表 */
	@Override
	public List<XueshengView> selectListView(Wrapper<XueshengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}
	/** 根据条件查询xueshengview对象的列表 */
	@Override
	public XueshengView selectView(Wrapper<XueshengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
