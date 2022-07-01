package cn.edu.seu.sky.hot;

import cn.edu.seu.sky.BaseTest;
import org.junit.Assert;

import java.util.List;

/**
 * @author xiaotian on 2022/7/1
 */
public class Hot49_GroupAnagrams_Test extends BaseTest {

    @Override
    public void test() {
        Hot49_GroupAnagrams func = new Hot49_GroupAnagrams();
        List<List<String>> list = func.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        Assert.assertEquals("[[eat, tea, ate], [bat], [tan, nat]]", list.toString());
    }
}
