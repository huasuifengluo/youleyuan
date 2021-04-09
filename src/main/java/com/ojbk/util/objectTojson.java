package com.ojbk.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ojbk.vo.XiangmuRenshu;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class objectTojson {

    public static String tojson(Object o) throws JsonProcessingException {
        /*XiangmuRenshu xiangmuRenshu = new XiangmuRenshu();
        xiangmuRenshu.setId(1);
        xiangmuRenshu.setName("过山车");
        xiangmuRenshu.setCurrNumber("10");
        xiangmuRenshu.setCreateTime(new Date());
        xiangmuRenshu.setUpdateTime(new Date());*/

        /**
         * ObjectMapper是JSON操作的核心，Jackson的所有JSON操作都是在ObjectMapper中实现。
         * ObjectMapper有多个JSON序列化的方法，可以把JSON字符串保存File、OutputStream等不同的介质中。
         * writeValue(File arg0, Object arg1)把arg1转成json序列，并保存到arg0文件中。
         * writeValue(OutputStream arg0, Object arg1)把arg1转成json序列，并保存到arg0输出流中。
         * writeValueAsBytes(Object arg0)把arg0转成json序列，并把结果输出成字节数组。
         * writeValueAsString(Object arg0)把arg0转成json序列，并把结果输出成字符串。
         */
        ObjectMapper mapper = new ObjectMapper();

        //User类转JSON
        //输出结果：{"name":"小民","age":20,"birthday":844099200000,"email":"xiaomin@sina.com"}
        String json = mapper.writeValueAsString(o);
        System.out.println(json);

        //Java集合转JSON
        //输出结果：[{"name":"小民","age":20,"birthday":844099200000,"email":"xiaomin@sina.com"}]
        List<Object> users = new ArrayList<Object>();
        users.add(o);
        String jsonlist = mapper.writeValueAsString(users);
        //System.out.println(jsonlist);


        return json;
    }
}
