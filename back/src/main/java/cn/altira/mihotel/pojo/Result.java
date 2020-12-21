package cn.altira.mihotel.pojo;

public class Result {
    Integer Code;
    String  Msg;
    Object Data;

    public Result(Integer code, String msg, Object data) {
        Code = code;
        Msg = msg;
        Data = data;
    }

    public Result() {
    }

    public Integer getCode() {
        return Code;
    }

    public String getMsg() {
        return Msg;
    }

    public Object getData() {
        return Data;
    }

    public void setCode(Integer code) {
        Code = code;
    }

    public void setMsg(String msg) {
        Msg = msg;
    }

    public void setData(Object data) {
        Data = data;
    }
}
