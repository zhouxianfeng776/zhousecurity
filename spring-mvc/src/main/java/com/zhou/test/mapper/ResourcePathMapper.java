package com.zhou.test.mapper;

import com.zhou.test.pojo.ResourcePath;
import com.zhou.test.pojo.ResourcePathExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ResourcePathMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resource_path
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    long countByExample(ResourcePathExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resource_path
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    int deleteByExample(ResourcePathExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resource_path
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    int deleteByPrimaryKey(String resourceId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resource_path
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    int insert(ResourcePath record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resource_path
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    int insertSelective(ResourcePath record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resource_path
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    List<ResourcePath> selectByExampleWithRowbounds(ResourcePathExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resource_path
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    List<ResourcePath> selectByExample(ResourcePathExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resource_path
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    ResourcePath selectByPrimaryKey(String resourceId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resource_path
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    int updateByExampleSelective(@Param("record") ResourcePath record, @Param("example") ResourcePathExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resource_path
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    int updateByExample(@Param("record") ResourcePath record, @Param("example") ResourcePathExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resource_path
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    int updateByPrimaryKeySelective(ResourcePath record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resource_path
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    int updateByPrimaryKey(ResourcePath record);
}