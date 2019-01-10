package com.ruoyi.system.service.impl;

import java.util.List;

import com.ruoyi.system.domain.StuScore;
import com.ruoyi.system.mapper.StuScoreMapper;
import com.ruoyi.system.service.IStuScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.common.support.Convert;

/**
 * 学生成绩 服务层实现
 * 
 * @author ruoyi
 * @date 2018-11-01
 */
@Service
public class StuScoreServiceImpl implements IStuScoreService
{
	@Autowired
	private StuScoreMapper scoreMapper;

	/**
     * 查询学生成绩信息
     * 
     * @param id 学生成绩ID
     * @return 学生成绩信息
     */
    @Override
	public StuScore selectScoreById(Integer id)
	{
	    return scoreMapper.selectScoreById(id);
	}
	
	/**
     * 查询学生成绩列表
     * 
     * @param score 学生成绩信息
     * @return 学生成绩集合
     */
	@Override
	public List<StuScore> selectScoreList(StuScore score)
	{
	    return scoreMapper.selectScoreList(score);
	}
	
    /**
     * 新增学生成绩
     * 
     * @param score 学生成绩信息
     * @return 结果
     */
	@Override
	public int insertScore(StuScore score)
	{
	    return scoreMapper.insertScore(score);
	}
	
	/**
     * 修改学生成绩
     * 
     * @param score 学生成绩信息
     * @return 结果
     */
	@Override
	public int updateScore(StuScore score)
	{
	    return scoreMapper.updateScore(score);
	}

	/**
     * 删除学生成绩对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteScoreByIds(String ids)
	{
		return scoreMapper.deleteScoreByIds(Convert.toStrArray(ids));
	}
	
}
