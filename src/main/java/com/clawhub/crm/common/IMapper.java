package com.clawhub.crm.common;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * The interface Mapper.
 *
 * @param <T> the type parameter
 */
public interface IMapper<T> extends Mapper<T>, MySqlMapper<T> {

}

