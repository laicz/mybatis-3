package org.apache.ibatis.plugin;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhoumb on 2019/4/10
 */
public class MyPluginTest {
    @Test
    public void test() {
        List<String> list = new ArrayList<>();
        List plugin = (List) new MyListPlugin().plugin(list);
        plugin.add("a");
        plugin.add("b");
        System.out.println(plugin);
    }
}
