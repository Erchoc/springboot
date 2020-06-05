package cn.tinytank.mmp.base;

import cn.tinytank.mmp.data.MeteDatabaseData;
import cn.tinytank.mmp.entity.MeteDatabase;
import cn.tinytank.mmp.utils.Response;
import cn.tinytank.mmp.utils.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tinytank
 * @date 2020/6/5 9:59 下午
 */
@RestController
@RequestMapping("/meta/database")
public class MeteDatabaseBase {

    @Autowired
    private MeteDatabaseData meteDatabaseData;

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Response create (@ModelAttribute MeteDatabase meteDatabase) {
        meteDatabaseData.save(meteDatabase);
        return ResponseUtil.success();
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Response query () {
        return ResponseUtil.success(meteDatabaseData.query());
    }

}
