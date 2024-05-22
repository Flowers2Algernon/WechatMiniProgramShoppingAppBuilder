package com.cskaoyan.market.db.mapper;

import com.cskaoyan.market.db.domain.MarketAftersale;
import com.cskaoyan.market.db.domain.MarketAftersaleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MarketAftersaleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_aftersale
     *
     * @mbg.generated
     */
    long countByExample(MarketAftersaleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_aftersale
     *
     * @mbg.generated
     */
    int deleteByExample(MarketAftersaleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_aftersale
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_aftersale
     *
     * @mbg.generated
     */
    int insert(MarketAftersale record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_aftersale
     *
     * @mbg.generated
     */
    int insertSelective(MarketAftersale record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_aftersale
     *
     * @mbg.generated
     */
    MarketAftersale selectOneByExample(MarketAftersaleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_aftersale
     *
     * @mbg.generated
     */
    MarketAftersale selectOneByExampleSelective(@Param("example") MarketAftersaleExample example, @Param("selective") MarketAftersale.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_aftersale
     *
     * @mbg.generated
     */
    List<MarketAftersale> selectByExampleSelective(@Param("example") MarketAftersaleExample example, @Param("selective") MarketAftersale.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_aftersale
     *
     * @mbg.generated
     */
    List<MarketAftersale> selectByExample(MarketAftersaleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_aftersale
     *
     * @mbg.generated
     */
    MarketAftersale selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") MarketAftersale.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_aftersale
     *
     * @mbg.generated
     */
    MarketAftersale selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_aftersale
     *
     * @mbg.generated
     */
    MarketAftersale selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_aftersale
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") MarketAftersale record, @Param("example") MarketAftersaleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_aftersale
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") MarketAftersale record, @Param("example") MarketAftersaleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_aftersale
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(MarketAftersale record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_aftersale
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MarketAftersale record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_aftersale
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") MarketAftersaleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_aftersale
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}