package org.free.manage.utils;

import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.CollectionUtils;

import java.util.Collection;
import java.util.Map;

/**
 * 工具类
 */
@SuppressWarnings("{unchecked,rawtypes}")
public class CommonUtils {

    /**
     * 判断是否为空
     * @param o 要判断的对象
     * @return true 空 false不为空
     */
    public static boolean isEmpty(Object  o){
        if(o == null) return true;
        if(o instanceof String){
            return StringUtils.isEmpty((String)o);
        }
        if(o instanceof Collection){
            return CollectionUtils.isEmpty((Collection)o);
        }
        if(o.getClass().isArray()){
            return ArrayUtils.isEmpty((Object[])o);
        }
        if(o instanceof Map){
            return MapUtils.isEmpty((Map)o);
        }
        return true;
    }
    public static boolean isNotEmpty(Object  o){
        if(o == null) return true;
        if(o instanceof String){
            return StringUtils.isNotBlank((String)o);
        }
        if(o instanceof Collection){
            return !CollectionUtils.isEmpty((Collection)o);
        }
        if(o.getClass().isArray()){
            return ArrayUtils.isNotEmpty((Object[])o);
        }
        if(o instanceof Map){
            return MapUtils.isNotEmpty((Map)o);
        }
        return true;
    }

}
