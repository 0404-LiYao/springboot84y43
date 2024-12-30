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


import com.dao.QiandaoxinxiDao;
import com.entity.QiandaoxinxiEntity;
import com.service.QiandaoxinxiService;
import com.entity.vo.QiandaoxinxiVO;
import com.entity.view.QiandaoxinxiView;

@Service("qiandaoxinxiService")
public class QiandaoxinxiServiceImpl extends ServiceImpl<QiandaoxinxiDao, QiandaoxinxiEntity> implements QiandaoxinxiService {
	
	/** 根据传入参数进行分页查询 */
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QiandaoxinxiEntity> page = this.selectPage(
                new Query<QiandaoxinxiEntity>(params).getPage(),
                new EntityWrapper<QiandaoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    /** 重载的querypage方法 */
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QiandaoxinxiEntity> wrapper) {
		  Page<QiandaoxinxiView> page =new Query<QiandaoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    /** 根据条件查询列表，返回qiandaoxinxiVO对象的列表 */
    @Override
	public List<QiandaoxinxiVO> selectListVO(Wrapper<QiandaoxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	/** 根据条件查询单个qiandaoxinxiVO对象 */
	@Override
	public QiandaoxinxiVO selectVO(Wrapper<QiandaoxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	/** 根据条件查询qiandaoxinxiview对象的列表 */
	@Override
	public List<QiandaoxinxiView> selectListView(Wrapper<QiandaoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}
	/** 根据条件查询单个qiandaoxinxiview对象 */
	@Override
	public QiandaoxinxiView selectView(Wrapper<QiandaoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
