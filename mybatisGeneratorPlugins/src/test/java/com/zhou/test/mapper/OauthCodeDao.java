package com.zhou.test.mapper;

import com.zhou.test.pojo.OauthCode;
import com.zhou.test.pojo.OauthCodeQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface OauthCodeDao {
    long countByExample(OauthCodeQuery example);

    int deleteByExample(OauthCodeQuery example);

    int insert(OauthCode record);

    int insertSelective(OauthCode record);

    List<OauthCode> selectByExampleWithBLOBsWithRowbounds(OauthCodeQuery example, RowBounds rowBounds);

    List<OauthCode> selectByExampleWithBLOBs(OauthCodeQuery example);

    List<OauthCode> selectByExampleWithRowbounds(OauthCodeQuery example, RowBounds rowBounds);

    List<OauthCode> selectByExample(OauthCodeQuery example);

    int updateByExampleSelective(@Param("record") OauthCode record, @Param("example") OauthCodeQuery example);

    int updateByExampleWithBLOBs(@Param("record") OauthCode record, @Param("example") OauthCodeQuery example);

    int updateByExample(@Param("record") OauthCode record, @Param("example") OauthCodeQuery example);
}