package cn.tinytank.mmp.data;

import cn.tinytank.mmp.entity.MeteDatabase;
import cn.tinytank.mmp.repository.MeteDatabaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author tinytank
 * @date 2020/6/5 9:59 下午
 */
@Service
public class MeteDatabaseData {

    @Autowired
    private MeteDatabaseRepository meteDatabaseRepository;

    @Transactional
    public void save (MeteDatabase meteDatabase) {
        meteDatabaseRepository.save(meteDatabase);
    }

    public Iterable<MeteDatabase> query() {
        return meteDatabaseRepository.findAll();
    }

}
