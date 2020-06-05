package cn.tinytank.mmp.data;

import cn.tinytank.mmp.entity.MeteDatabase;
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
public class MeteDatabaseTest {

    @Autowired
    private MeteDatabaseData meteDatabaseData;


    @Test
    public void testSave () {
        MeteDatabase meteDatabase = new MeteDatabase();
        meteDatabase.setName("default");
        meteDatabase.setName("hdfs://hadoop000:8200/user/hive/db1");
        meteDatabaseData.save(meteDatabase);
    }

    @Test
    public void testQuery () {
        Iterable<MeteDatabase> meteDatabases = meteDatabaseData.query();
        for (MeteDatabase meteDatabase: meteDatabases) {
            System.out.println(meteDatabase.getId());
            System.out.println(meteDatabase.getName());
            System.out.println(meteDatabase.getLocation());
        }
    }

}

