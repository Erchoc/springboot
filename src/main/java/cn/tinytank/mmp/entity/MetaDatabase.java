package cn.tinytank.mmp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 元数据库
 * @author tinytank
 * @date 2020/6/5 9:59 下午
 */
@Entity
@Table
public class MetaDatabase {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String location;

    public MetaDatabase() {

    }

    public MetaDatabase(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
