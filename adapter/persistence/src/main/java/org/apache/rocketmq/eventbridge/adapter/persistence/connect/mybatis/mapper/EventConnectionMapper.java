/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.rocketmq.eventbridge.adapter.persistence.connect.mybatis.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.rocketmq.eventbridge.adapter.persistence.connect.mybatis.dataobject.ConnectionDO;

import java.util.List;

public interface EventConnectionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event_connection
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 通过name进行删除
     *
     * @param name 名称
     * @return
     */
    int deleteByNameAndAccountId(@Param("accountId") String accountId, @Param("name") String name);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event_connection
     *
     * @mbggenerated
     */
    int insert(ConnectionDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event_connection
     *
     * @mbggenerated
     */
    int insertSelective(ConnectionDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event_connection
     *
     * @mbggenerated
     */
    ConnectionDO selectByPrimaryKey(Integer id);

    /**
     * 分页查询
     *
     * @param accountId
     * @param name
     * @param nextToken
     * @param maxResults
     * @return
     */
    List<ConnectionDO> listConnections(@Param("accountId") String accountId, @Param("name") String name,
                                       @Param("nextToken") int nextToken, @Param("maxResults") int maxResults);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event_connection
     *
     * @mbggenerated
     */
    ConnectionDO selectByNameAndAccountId(@Param("accountId") String accountId, @Param("name") String name);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event_connection
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ConnectionDO record);

    /**
     * 通过用户id和名称更新
     *
     * @param record
     * @return
     */
    int updateByAccountIdAndName(ConnectionDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event_connection
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(ConnectionDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event_connection
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ConnectionDO record);

    /**
     * 通过用户id和name获取总数
     *
     * @param accountId
     * @return
     */
    int getConnectionCount(@Param("accountId") String accountId);
}