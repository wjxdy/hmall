package com.hmall.api.domain.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Schema(name ="订单页面VO")
public class OrderVO {
    @Schema(title="订单id")
    private Long id;
    @Schema(title="总金额，单位为分")
    private Integer totalFee;
    @Schema(title="支付类型，1、支付宝，2、微信，3、扣减余额")
    private Integer paymentType;
    @Schema(title="用户id")
    private Long userId;
    @Schema(title="订单的状态，1、未付款 2、已付款,未发货 3、已发货,未确认 4、确认收货，交易成功 5、交易取消，订单关闭 6、交易结束，已评价")
    private Integer status;
    @Schema(title="创建时间")
    private LocalDateTime createTime;
    @Schema(title="支付时间")
    private LocalDateTime payTime;
    @Schema(title="发货时间")
    private LocalDateTime consignTime;
    @Schema(title="交易完成时间")
    private LocalDateTime endTime;
    @Schema(title="交易关闭时间")
    private LocalDateTime closeTime;
    @Schema(title="评价时间")
    private LocalDateTime commentTime;
}
