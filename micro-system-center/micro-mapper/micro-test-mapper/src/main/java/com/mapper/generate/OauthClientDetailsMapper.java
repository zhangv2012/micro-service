package com.mapper.generate;

import com.entity.OauthClientDetails;
import com.entity.OauthClientDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OauthClientDetailsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth_client_details
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    int countByExample(OauthClientDetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth_client_details
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    int deleteByExample(OauthClientDetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth_client_details
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth_client_details
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    int insert(OauthClientDetails record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth_client_details
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    int insertSelective(OauthClientDetails record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth_client_details
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    List<OauthClientDetails> selectByExampleWithBLOBs(OauthClientDetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth_client_details
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    List<OauthClientDetails> selectByExample(OauthClientDetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth_client_details
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    OauthClientDetails selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth_client_details
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    int updateByExampleSelective(@Param("record") OauthClientDetails record, @Param("example") OauthClientDetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth_client_details
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    int updateByExampleWithBLOBs(@Param("record") OauthClientDetails record, @Param("example") OauthClientDetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth_client_details
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    int updateByExample(@Param("record") OauthClientDetails record, @Param("example") OauthClientDetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth_client_details
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    int updateByPrimaryKeySelective(OauthClientDetails record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth_client_details
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    int updateByPrimaryKeyWithBLOBs(OauthClientDetails record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth_client_details
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    int updateByPrimaryKey(OauthClientDetails record);
}