package com.zebra.pojo;

public class Result {
    private Integer code; // 状态码：1成功，0失败
    private String msg;   // 提示信息
    private Object data;  // 响应数据

    public Result() {
    }

    public Result(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    // ----------------------------
    // ✅ 静态工厂方法，快速创建对象
    // ----------------------------

    public static Result success(Object data) {
        return new Result(1, "success", data);
    }

    public static Result success() {
        return new Result(1, "success", null);
    }

    public static Result error(String msg) {
        return new Result(0, msg, null);
    }

    // ----------------------------
    // ✅ Getter & Setter 方法
    // ----------------------------

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    // ----------------------------
    // ✅ 打印调试用 toString()
    // ----------------------------

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
