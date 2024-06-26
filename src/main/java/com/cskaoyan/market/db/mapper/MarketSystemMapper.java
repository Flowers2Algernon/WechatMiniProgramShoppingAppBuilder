package com.cskaoyan.market.db.mapper;

import com.cskaoyan.market.db.domain.MarketSystem;
import com.cskaoyan.market.db.domain.MarketSystemExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MarketSystemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_system
     *
     * @mbg.generated
     */
    long countByExample(MarketSystemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_system
     *
     * @mbg.generated
     */
    int deleteByExample(MarketSystemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_system
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_system
     *
     * @mbg.generated
     */
    int insert(MarketSystem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_system
     *
     * @mbg.generated
     */
    int insertSelective(MarketSystem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_system
     *
     * @mbg.generated
     */
    MarketSystem selectOneByExample(MarketSystemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_system
     *
     * @mbg.generated
     */
    MarketSystem selectOneByExampleSelective(@Param("example") MarketSystemExample example, @Param("selective") MarketSystem.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_system
     *
     * @mbg.generated
     */
    List<MarketSystem> selectByExampleSelective(@Param("example") MarketSystemExample example, @Param("selective") MarketSystem.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_system
     *
     * @mbg.generated
     */
    List<MarketSystem> selectByExample(MarketSystemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_system
     *
     * @mbg.generated
     */
    MarketSystem selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") MarketSystem.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_system
     *
     * @mbg.generated
     */
    MarketSystem selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_system
     *
     * @mbg.generated
     */
    MarketSystem selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_system
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") MarketSystem record, @Param("example") MarketSystemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_system
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") MarketSystem record, @Param("example") MarketSystemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_system
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(MarketSystem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_system
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MarketSystem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_system
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") MarketSystemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_system
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}