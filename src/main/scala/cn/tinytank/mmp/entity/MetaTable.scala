package cn.tinytank.mmp.entity

import javax.persistence.{Entity, GeneratedValue, Id, Table}

import scala.beans.BeanProperty

@Entity
@Table
class MetaTable {

  @Id
  @GeneratedValue
  @BeanProperty
  var id: Int =  _

  @BeanProperty
  var name: String = _

  @BeanProperty
  var tableType: String = _

  @BeanProperty
  var dbId: Int = _

}
