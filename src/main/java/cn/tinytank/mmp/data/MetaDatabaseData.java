package cn.tinytank.mmp.data;

import cn.tinytank.mmp.entity.MetaDatabase;
import cn.tinytank.mmp.repository.MetaDatabaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author tinytank
 * @date 2020/6/5 9:59 下午
 */
@Service
public class MetaDatabaseData {

    @Autowired
    private MetaDatabaseRepository metaDatabaseRepository;

    @Transactional
    public void save (MetaDatabase metaDatabase) {
        metaDatabaseRepository.save(metaDatabase);
    }

    public Iterable<MetaDatabase> query() {
        return metaDatabaseRepository.findAll();
    }

}
