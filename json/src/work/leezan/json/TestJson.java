package work.leezan.json;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.junit.Test;
import work.leezan.pojo.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestJson {
    @Test
    public void test1(){
        // JavaBean和json的互转
        Person person = new Person(1,"lee");
        // 创建一个Gson对象
        Gson gson = new Gson();
        // toJson()方法可以将java对象转换成为json字符串
        String personToJson = gson.toJson(person);

        System.out.println(personToJson);

        // fromJson把json字符串转化成为Java对象
        // 第一个参数是json字符串
        // 第二个参数是转化回去的Java对象类型
        Person person1 = gson.fromJson(personToJson, Person.class);
        System.out.println(person1);


    }
    @Test
    public void test2() {
        // list和json的互转
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1,"lee"));
        personList.add(new Person(2,"zan"));
        // 创建一个gson的实例
        Gson gson = new Gson();
        // 将list集合转换成为String字符串
        String personListJsonString = gson.toJson(personList);
        System.out.println(personListJsonString);

        List<Person> list =  gson.fromJson(personListJsonString, new PersonListType().getType());
        System.out.println(list);

        Person person = list.get(0);
        System.out.println(person);
    }

    @Test
    public void test3() {
        // map和json的互转
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person(1,"lee"));
        map.put(2, new Person(2,"zan"));

        Gson gson = new Gson();
        String mapParseToString = gson.toJson(map);
        System.out.println(mapParseToString);

        Map<Integer, Person> map1 = gson.fromJson(mapParseToString, new TypeToken<HashMap<Integer, Person>>(){}.getType());
        System.out.println(map1.get(1));

    }
}
