package org.free.manage.framework.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.weekend.Weekend;

import java.util.List;

import static org.free.manage.utils.CommonUtils.isNotEmpty;

public abstract class BaseService<T> {

    @Autowired
    private BaseMapper<T> mapper;

    /**
     * 保存
     * @param record
     * @return
     */
    public int insertSelective(T record){
        return mapper.insertSelective(record);
    }

    /**
     * 通过主键查询
     * @param id
     * @return
     */
    public T findById(Object id){
        return mapper.selectByPrimaryKey(id);
    }

    /**
     * 通过主键修改
     * @param record
     * @return
     */
    public int updateByIdSelective(T record){
        return mapper.updateByPrimaryKeySelective(record);
    }

    /**
     * 查询
     * @param record
     * @return
     */
    public List<T> select(T record){
        return mapper.select(record);
    }

    public T selectOne(T record){
        List<T> list = select(record);
        if(isNotEmpty(list))
            return list.get(0);
        return null;
    }

    public int deleteById(Object id){
        return mapper.deleteByPrimaryKey(id);
    }
    public int delete(T record){
        return mapper.delete(record);
    }

    public int updateByExample(T record,Weekend<T> weekend){
        return mapper.updateByExampleSelective(record,weekend);
    }

    public List<T> selectByExample(Weekend<T> weekend){
        return mapper.selectByExample(weekend);
    }
}
