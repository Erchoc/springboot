package cn.tinytank.mmp.utils;

/**
 * @author tinytank
 * @date 2020/6/5 11:07 下午
 */
public class ResponseUtil {

    public static Response success (Object object) {
        Response response = new Response();
        response.setData(object);
        response.setCode(200);
        response.setMsg("成功");
        return response;
    }

    public static Response success () {
        return success(null);
    }

    public static Response failed(Integer code, String msg) {
        Response response = new Response();
        response.setCode(code);
        response.setMsg(msg);
        return response;
    }
}
