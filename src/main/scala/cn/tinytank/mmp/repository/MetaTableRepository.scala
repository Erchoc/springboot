package cn.tinytank.mmp.repository

import cn.tinytank.mmp.entity.MetaTable
import org.springframework.data.repository.CrudRepository

trait MetaTableRepository extends CrudRepository[MetaTable, Integer] {

}
