package com.goujia;

import org.apache.commons.lang3.StringUtils;

public enum Status {
    A_CODE(400,"Gmail"),
    B_CODE(500,"FoxMail")
    ;
    public int code;
    public String msg;

    Status() {
    }

    Status(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Status getStatus(Status externalStatus){
        if(null==externalStatus){
            return null;
        }
        for(Status status:values()){
            if(StringUtils.equals(externalStatus.getMsg(),status.getMsg())&&externalStatus.code==status.code){
                return status;
            }
        }
        return null;
    }

}
