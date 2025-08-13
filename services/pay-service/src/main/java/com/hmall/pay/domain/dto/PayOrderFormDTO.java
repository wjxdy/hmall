package com.hmall.pay.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;
@Data
@Builder
@Schema(name ="支付确认表单实体")
public class PayOrderFormDTO {
    @Schema(title="支付订单id不能为空")
    @NotNull(message = "支付订单id不能为空")
    private Long id;
    @Schema(title="支付密码")
    @NotNull(message = "支付密码")
    private String pw;
}