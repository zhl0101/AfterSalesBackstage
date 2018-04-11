package com.jinsong.mapper;

import com.jinsong.model.Repair;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.PathVariable;

@Mapper
public interface RepairMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repair
     *
     * @mbg.generated Fri Feb 09 11:45:50 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repair
     *
     * @mbg.generated Fri Feb 09 11:45:50 CST 2018
     */
    int insert(Repair record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repair
     *
     * @mbg.generated Fri Feb 09 11:45:50 CST 2018
     */
    Repair selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repair
     *
     * @mbg.generated Fri Feb 09 11:45:50 CST 2018
     */
    List<Repair> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repair
     *
     * @mbg.generated Fri Feb 09 11:45:50 CST 2018
     */
    int updateByPrimaryKey(Repair record);
    
    /**
     * 获得最近、最新的一条数据
     */
    Repair selectLastOne();
    
    /**
     * 
     */
    List<Repair> selectAllByOpenid(String openid);
    
    /**
     * 获得status=null也就是“未处理”的repair工单
     */
    List<Repair> selectByStautsNull();
    
    /**
     * 通过hospital_name或者engineer来搜索repair工单
     */
    List<Repair> selectBySearch(String searchInfo);
    
    /**
	 * 根据医生的微信昵称获取状态不等于“已完成”的订单
	 */
	List<Repair> selectUnfinishByOpenid(String openid);
	
	/**
     * 通过工程师account来搜索未完成的repair工单
     */
	List<Repair> selectUnfinishedRepairByEngineer(String account);
	
	/**
     * 通过工程师account来搜索已经完成的repair工单
     */
	List<Repair> selectFinishedRepairByEngineer(String account);
}