package cn.tinytank.mmp.data

import cn.tinytank.mmp.entity.MetaTable
import cn.tinytank.mmp.repository.MetaTableRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class MetaTableData @Autowired()(metaTableRepository: MetaTableRepository) {

  @Transactional
  def save (metaTable: MetaTable) = {
    metaTableRepository.save(metaTable)
  }


  def query () = {
    metaTableRepository.findAll()
  }

}
