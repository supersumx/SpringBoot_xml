package com.huaqi.demo.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @Author kwhua
 * @Date 2020/10/26 14:49
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult {
    private int code;

    private String msg;

    private Object data;

    public static com.huaqi.demo.utils.CommonResult succ(Object data) {
        return succ(200, "操作成功", data);
    }

    public static com.huaqi.demo.utils.CommonResult succ(int cpde, String msg, Object data) {
        com.huaqi.demo.utils.CommonResult result = new com.huaqi.demo.utils.CommonResult();
        result.setCode(200);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }

    public static com.huaqi.demo.utils.CommonResult fail(String msg) {
        return fail(400, msg, null);
    }

    public static com.huaqi.demo.utils.CommonResult fail(String msg, Object data) {

        return fail(400, msg, data);
    }

    public static com.huaqi.demo.utils.CommonResult fail(int code, String msg, Object data) {
        com.huaqi.demo.utils.CommonResult result = new com.huaqi.demo.utils.CommonResult();
        result.setCode(400);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }
}
