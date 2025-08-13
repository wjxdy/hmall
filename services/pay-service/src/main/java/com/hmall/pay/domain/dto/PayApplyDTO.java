package com.hmall.pay.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;
@Data
@Builder
@Schema(name ="支付下单表单实体")
public class PayApplyDTO {
    @Schema(title="业务订单id不能为空")
    @NotNull(message = "业务订单id不能为空")
    private Long bizOrderNo;
    @Schema(title="支付金额必须为正数")
    @Min(value = 1, message = "支付金额必须为正数")
    private Integer amount;
    @Schema(title="支付渠道编码不能为空")
    @NotNull(message = "支付渠道编码不能为空")
    private String payChannelCode;
    @Schema(title="支付方式不能为空")
    @NotNull(message = "支付方式不能为空")
    private Integer payType;
    @Schema(title="订单中的商品信息不能为空")
    @NotNull(message = "订单中的商品信息不能为空")
    private String orderInfo;
}