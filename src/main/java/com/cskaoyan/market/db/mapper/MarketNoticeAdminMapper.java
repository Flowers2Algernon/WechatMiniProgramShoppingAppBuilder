package com.cskaoyan.market.db.mapper;

import com.cskaoyan.market.db.domain.MarketNoticeAdmin;
import com.cskaoyan.market.db.domain.MarketNoticeAdminExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MarketNoticeAdminMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_notice_admin
     *
     * @mbg.generated
     */
    long countByExample(MarketNoticeAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_notice_admin
     *
     * @mbg.generated
     */
    int deleteByExample(MarketNoticeAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_notice_admin
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_notice_admin
     *
     * @mbg.generated
     */
    int insert(MarketNoticeAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_notice_admin
     *
     * @mbg.generated
     */
    int insertSelective(MarketNoticeAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_notice_admin
     *
     * @mbg.generated
     */
    MarketNoticeAdmin selectOneByExample(MarketNoticeAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_notice_admin
     *
     * @mbg.generated
     */
    MarketNoticeAdmin selectOneByExampleSelective(@Param("example") MarketNoticeAdminExample example, @Param("selective") MarketNoticeAdmin.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_notice_admin
     *
     * @mbg.generated
     */
    List<MarketNoticeAdmin> selectByExampleSelective(@Param("example") MarketNoticeAdminExample example, @Param("selective") MarketNoticeAdmin.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_notice_admin
     *
     * @mbg.generated
     */
    List<MarketNoticeAdmin> selectByExample(MarketNoticeAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_notice_admin
     *
     * @mbg.generated
     */
    MarketNoticeAdmin selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") MarketNoticeAdmin.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_notice_admin
     *
     * @mbg.generated
     */
    MarketNoticeAdmin selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_notice_admin
     *
     * @mbg.generated
     */
    MarketNoticeAdmin selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_notice_admin
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") MarketNoticeAdmin record, @Param("example") MarketNoticeAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_notice_admin
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") MarketNoticeAdmin record, @Param("example") MarketNoticeAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_notice_admin
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(MarketNoticeAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_notice_admin
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MarketNoticeAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_notice_admin
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") MarketNoticeAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_notice_admin
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}