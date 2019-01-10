package org.llsonginfo.shanyigou.util;

/**
 * Ajax请求响应对象的类
 */
public class AjaxResult {

    private Boolean success = true;
    private String message = "success";

    //返回到前台的对象
    private Object resultObj;

    public Object getResultObj() {
        return resultObj;
    }

    public AjaxResult setResultObj(Object resultObj) {
        this.resultObj = resultObj;
        return this;
    }

    public Boolean getSuccess() {
        return success;
    }

    public AjaxResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public AjaxResult setMessage(String message) {
        this.message = message;
        return this;
    }

    public static AjaxResult me(){
        return new AjaxResult();
    }
}
