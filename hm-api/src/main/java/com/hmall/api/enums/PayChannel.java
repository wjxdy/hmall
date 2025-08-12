package com.hmall.api.enums;


import com.github.xiaoymin.knife4j.core.util.StrUtil;
import lombok.Getter;

@Getter
public enum PayChannel {
    wxPay("微信支付"),
    aliPay("支付宝支付"),
    balance("余额支付"),
    ;

    private final String desc;

    PayChannel(String desc) {
        this.desc = desc;
    }

    public static String desc(String value){
        if (StrUtil.isBlank(value)) {
            return "";
        }
        return PayChannel.valueOf(value).getDesc();
    }
}
