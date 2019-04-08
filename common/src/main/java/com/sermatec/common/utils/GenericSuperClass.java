package com.sermatec.common.utils;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;

/**
 * Created by DongChenchen on 2018/5/16 0016
 */
public class GenericSuperClass {

        public static Class getSuperClassGenricType(Class clazz) {
            return getSuperClassGenricType(clazz, 0);
        }

        public static Class getSuperClassGenricType(Class clazz, int index) throws IndexOutOfBoundsException {

            Type genType = clazz.getGenericSuperclass();

            if (!(genType instanceof ParameterizedType)) {
                return Object.class;
            }

            Type[] params = ((ParameterizedType) genType).getActualTypeArguments();

            if (index >= params.length || index < 0) {
                return Object.class;
            }
            if (!(params[index] instanceof Class)) {
                return Object.class;
            }
            return (Class) params[index];
        }

    /**
     * 通过反射，用属性名称获得属性值
     * @param thisClass 需要获取属性值的类
     * @param fieldName 该类的属性名称
     * @return
     */
    public static Object getFieldValue(Object thisClass, String fieldName)
    {
        Object value = new Object();
        Method method = null;
        try {
            String methodName = "get"+fieldName.substring(0, 1).toUpperCase()+ fieldName.substring(1);
            method = thisClass.getClass().getMethod(methodName);
            value = method.invoke(thisClass);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //时间格式转换
        if(value instanceof java.util.Date){
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            return sdf.format(value);
        }
        return value;
    }

}
