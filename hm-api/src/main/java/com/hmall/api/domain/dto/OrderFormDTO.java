package com.hmall.api.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
@Schema(name ="交易下单表单实体")
public class OrderFormDTO {
    @Schema(title="收货地址id")
    private Long addressId;
    @Schema(title="支付类型")
    private Integer paymentType;
    @Schema(title="下单商品列表")
    private List<OrderDetailDTO> details;
}
