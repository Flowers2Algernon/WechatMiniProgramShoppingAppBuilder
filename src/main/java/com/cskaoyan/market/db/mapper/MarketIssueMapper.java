package com.cskaoyan.market.db.mapper;

import com.cskaoyan.market.db.domain.MarketIssue;
import com.cskaoyan.market.db.domain.MarketIssueExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MarketIssueMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_issue
     *
     * @mbg.generated
     */
    long countByExample(MarketIssueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_issue
     *
     * @mbg.generated
     */
    int deleteByExample(MarketIssueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_issue
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_issue
     *
     * @mbg.generated
     */
    int insert(MarketIssue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_issue
     *
     * @mbg.generated
     */
    int insertSelective(MarketIssue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_issue
     *
     * @mbg.generated
     */
    MarketIssue selectOneByExample(MarketIssueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_issue
     *
     * @mbg.generated
     */
    MarketIssue selectOneByExampleSelective(@Param("example") MarketIssueExample example, @Param("selective") MarketIssue.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_issue
     *
     * @mbg.generated
     */
    List<MarketIssue> selectByExampleSelective(@Param("example") MarketIssueExample example, @Param("selective") MarketIssue.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_issue
     *
     * @mbg.generated
     */
    List<MarketIssue> selectByExample(MarketIssueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_issue
     *
     * @mbg.generated
     */
    MarketIssue selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") MarketIssue.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_issue
     *
     * @mbg.generated
     */
    MarketIssue selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_issue
     *
     * @mbg.generated
     */
    MarketIssue selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_issue
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") MarketIssue record, @Param("example") MarketIssueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_issue
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") MarketIssue record, @Param("example") MarketIssueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_issue
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(MarketIssue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_issue
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MarketIssue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_issue
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") MarketIssueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_issue
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}