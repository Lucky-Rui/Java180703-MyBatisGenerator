package com.situ.ssm.mapper;

import com.situ.ssm.entity.BanjiCourseExample;
import com.situ.ssm.entity.BanjiCourseKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BanjiCourseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banji_course
     *
     * @mbggenerated
     */
    int countByExample(BanjiCourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banji_course
     *
     * @mbggenerated
     */
    int deleteByExample(BanjiCourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banji_course
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(BanjiCourseKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banji_course
     *
     * @mbggenerated
     */
    int insert(BanjiCourseKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banji_course
     *
     * @mbggenerated
     */
    int insertSelective(BanjiCourseKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banji_course
     *
     * @mbggenerated
     */
    List<BanjiCourseKey> selectByExample(BanjiCourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banji_course
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") BanjiCourseKey record, @Param("example") BanjiCourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banji_course
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") BanjiCourseKey record, @Param("example") BanjiCourseExample example);
}