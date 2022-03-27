package com.bear.service.mapper;

import com.bear.service.model.po.CheckPo;
import com.bear.service.model.po.CheckPoExample;
import java.util.List;

public interface CheckPoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table check
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table check
     *
     * @mbg.generated
     */
    int insert(CheckPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table check
     *
     * @mbg.generated
     */
    int insertSelective(CheckPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table check
     *
     * @mbg.generated
     */
    List<CheckPo> selectByExample(CheckPoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table check
     *
     * @mbg.generated
     */
    CheckPo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table check
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CheckPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table check
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CheckPo record);
}