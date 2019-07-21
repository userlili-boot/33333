package org.free.manage.framework;

import static org.free.manage.utils.CommonUtils.isEmpty;

/**
 * @author maheng
 */
public class Assert {

    public static void notNull(String o,String code,String message){
        if(isEmpty(0)){
            throw new MessageException(code,message);
        }
    }

}
