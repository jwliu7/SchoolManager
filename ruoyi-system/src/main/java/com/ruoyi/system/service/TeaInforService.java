package com.ruoyi.system.service;

import com.ruoyi.system.domain.TeaInfor;
import java.util.List;

/**
 * 教师基本 服务层
 * 
 * @author ruoyi
 * @date 2018-11-01
 */
public interface TeaInforService
{
	/**
     * 查询教师基本信息
     * 
     * @param id 教师基本ID
     * @return 教师基本信息
     */
	public TeaInfor selectInforById(Integer id);

	/**
	 * 查询教师基本信息
	 * @param teaid 教师工号
	 * @return
	 */
	public TeaInfor selectInforByTeaId(Integer teaid);

	/**
     * 查询教师基本列表
     * 
     * @param infor 教师基本信息
     * @return 教师基本集合
     */
	public List<TeaInfor> selectInforList(TeaInfor infor);
	
	/**
     * 新增教师基本
     * 
     * @param infor 教师基本信息
     * @return 结果
     */
	public int insertInfor(TeaInfor infor);
	
	/**
     * 修改教师基本
     * 
     * @param infor 教师基本信息
     * @return 结果
     */
	public int updateInfor(TeaInfor infor);

	/**
	 * 修改教师基本
	 * @param infor 教师基本信息
	 * @return
	 */
	public int updateInforByTeaId(TeaInfor infor);

	/**
     * 删除教师基本信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteInforByIds(String ids);



}
