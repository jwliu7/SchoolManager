package com.ruoyi.common.file;

import org.apache.ibatis.annotations.SelectProvider;
import tk.mybatis.mapper.provider.base.BaseSelectProvider;

public interface SelectByPrimaryKeyMapper<T> {

    /**
     * 根据主键字段进行查询，方法参数必须包含完整的主键属性，查询条件使用等号
     *
     * @param key
     * @return
     */
    @SelectProvider(type = BaseSelectProvider.class, method = "dynamicSQL")
    T selectByPrimaryKey(Object key);
}
