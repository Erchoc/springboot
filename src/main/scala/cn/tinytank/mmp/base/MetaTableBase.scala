package cn.tinytank.mmp.base

import cn.tinytank.mmp.data.MetaTableData
import cn.tinytank.mmp.entity.MetaTable
import cn.tinytank.mmp.utils.ResponseUtil
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{ModelAttribute, RequestMapping, RequestMethod, RestController}

@RestController
@RequestMapping(Array("/meta/table"))
class MetaTableBase @Autowired()(metaTableData: MetaTableData) {

  @RequestMapping(value = Array("/"), method = Array(RequestMethod.POST))
  def create (@ModelAttribute metaTable: MetaTable) = {
    metaTableData.save(metaTable)
    ResponseUtil.success() // Scala调用Java代码
  }

  @RequestMapping(value = Array("/"), method = Array(RequestMethod.GET))
  def query () = {
    ResponseUtil.success(metaTableData.query())
  }

}
