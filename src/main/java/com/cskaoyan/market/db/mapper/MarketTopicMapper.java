package com.cskaoyan.market.db.mapper;

import com.cskaoyan.market.db.domain.MarketTopic;
import com.cskaoyan.market.db.domain.MarketTopicExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MarketTopicMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_topic
     *
     * @mbg.generated
     */
    long countByExample(MarketTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_topic
     *
     * @mbg.generated
     */
    int deleteByExample(MarketTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_topic
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_topic
     *
     * @mbg.generated
     */
    int insert(MarketTopic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_topic
     *
     * @mbg.generated
     */
    int insertSelective(MarketTopic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_topic
     *
     * @mbg.generated
     */
    MarketTopic selectOneByExample(MarketTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_topic
     *
     * @mbg.generated
     */
    MarketTopic selectOneByExampleSelective(@Param("example") MarketTopicExample example, @Param("selective") MarketTopic.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_topic
     *
     * @mbg.generated
     */
    MarketTopic selectOneByExampleWithBLOBs(MarketTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_topic
     *
     * @mbg.generated
     */
    List<MarketTopic> selectByExampleSelective(@Param("example") MarketTopicExample example, @Param("selective") MarketTopic.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_topic
     *
     * @mbg.generated
     */
    List<MarketTopic> selectByExampleWithBLOBs(MarketTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_topic
     *
     * @mbg.generated
     */
    List<MarketTopic> selectByExample(MarketTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_topic
     *
     * @mbg.generated
     */
    MarketTopic selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") MarketTopic.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_topic
     *
     * @mbg.generated
     */
    MarketTopic selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_topic
     *
     * @mbg.generated
     */
    MarketTopic selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_topic
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") MarketTopic record, @Param("example") MarketTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_topic
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") MarketTopic record, @Param("example") MarketTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_topic
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") MarketTopic record, @Param("example") MarketTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_topic
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(MarketTopic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_topic
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(MarketTopic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_topic
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MarketTopic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_topic
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") MarketTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_topic
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}