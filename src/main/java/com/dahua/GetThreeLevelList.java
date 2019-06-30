package com.dahua;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPathException;
import com.dahua.bean.Info;
import com.dahua.bean.ScoreInfoBean;
import com.dahua.bean.ThemeBean;
import com.dahua.bean.StudentsInfo;
import org.apache.commons.lang.StringUtils;


import java.util.List;

public class GetThreeLevelList {
    public static void main(String[] args) {


        getList();
    }

    public static List<ThemeBean> getThreeLevelList(String responesStr){
        responesStr = "{\n" +
                "\t\"ResponseStatus\":\"123\",\n" +
                "\t\"Data\":{\n" +
                "\t\t\"ThemeList\":[{\n" +
                "\t\t\t\"Key\":\"String\",\n" +
                "\t\t\t\"Value\":\"String\",\n" +
                "\t\t\t\"PoiId\":\"String\",\n" +
                "\t\t\t\"IsJump\":false\n" +
                "\t\t}]\t\t\n" +
                "\t}\n" +
                "}";
        if(StringUtils.isEmpty(responesStr)){
          return null;
        }
        JSONObject object = JSON.parseObject(responesStr);
        JSONObject data =(JSONObject) object.get("Data");
        JSONArray jsonArr = data.getJSONArray("ThemeList");
        List<ThemeBean> result =JSON.parseArray(jsonArr.toString(),ThemeBean.class);
        return result;
    }


    /**
     * 转换第二层list,为java对象
     * @return
     */
    public static  List<StudentsInfo> getList(){
        String json = "{\n" +
                "\t\"className\": \"520\",\n" +
                "\t\"studensInfo\": [{\n" +
                "\t\t\"id\":123,\"name\":\"小虎\",\"isPass\":false,\"scoreInfo\":[{\"chinese\":90,\"math\":80},{\"chinese\":97,\"math\":89}]\n" +
                "\t},\n" +
                "\t]\n" +
                "}\n";
        /*JSONObject obj = JSON.parseObject(json);
        JSONArray list = obj.getJSONArray("studensInfo");
        List<StudentsInfo> studentsInfos = JSON.parseArray(list.toString(),StudentsInfo.class);
        for(StudentsInfo s:studentsInfos){
            System.out.println(s);
            for(ScoreInfoBean b:s.getScoreInfo()){
                System.out.println(b.toString());
            }
        }*/
        Info info = JSON.parseObject(json,Info.class);
        System.out.println(info.getClassName());
        List<StudentsInfo>  studentsInfos =  info.getStudensInfo();
        for(StudentsInfo s:studentsInfos){
            System.out.println(s);
            for(ScoreInfoBean b:s.getScoreInfo()){
                System.out.println(b.getMath());
            }
        }
        System.out.println(JSON.toJSON(info));
        return null;
    }

}
