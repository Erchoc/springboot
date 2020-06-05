package cn.tinytank.mmp.data;

import cn.tinytank.mmp.entity.MetaDatabase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author tinytank
 * @date 2020/6/5 10:07 下午
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MetaDatabaseTest {

    @Autowired
    private MetaDatabaseData metaDatabaseData;


    @Test
    public void testSave () {
        MetaDatabase metaDatabase = new MetaDatabase();
        metaDatabase.setName("default");
        metaDatabase.setName("hdfs://hadoop000:8200/user/hive/db1");
        metaDatabaseData.save(metaDatabase);
    }

    @Test
    public void testQuery () {
        Iterable<MetaDatabase> meteDatabases = metaDatabaseData.query();
        for (MetaDatabase metaDatabase : meteDatabases) {
            System.out.println(metaDatabase.getId());
            System.out.println(metaDatabase.getName());
            System.out.println(metaDatabase.getLocation());
        }
    }

}

