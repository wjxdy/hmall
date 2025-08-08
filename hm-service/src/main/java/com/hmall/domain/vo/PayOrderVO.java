package com.hmall.domain.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * <p>
 * 支付订单
 * </p>
 */
@Data
@Schema(description = "支付单vo实体")
public class PayOrderVO {
    @Schema(title="id")
    private Long id;
    @Schema(title="业务订单号")
    private Long bizOrderNo;
    @Schema(title="支付单号")
    private Long payOrderNo;
    @Schema(title="支付用户id")
    private Long bizUserId;
    @Schema(title="支付渠道编码")
    private String payChannelCode;
    @Schema(title="支付金额，单位分")
    private Integer amount;
    @Schema(title="付类型，1：h5,2:小程序，3：公众号，4：扫码，5：余额支付")
    private Integer payType;
    @Schema(title="付状态，0：待提交，1:待支付，2：支付超时或取消，3：支付成功")
    private Integer status;
    @Schema(title="拓展字段，用于传递不同渠道单独处理的字段")
    private String expandJson;
    @Schema(title="第三方返回业务码")
    private String resultCode;
    @Schema(title="第三方返回提示信息")
    private String resultMsg;
    @Schema(title="支付成功时间")
    private LocalDateTime paySuccessTime;
    @Schema(title="支付超时时间")
    private LocalDateTime payOverTime;
    @Schema(title="支付二维码链接")
    private String qrCodeUrl;
    @Schema(title="创建时间")
    private LocalDateTime createTime;
    @Schema(title="更新时间")
    private LocalDateTime updateTime;
}
