package com.hmall.api.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name ="新增购物车商品表单实体")
public class CartFormDTO {
    @Schema(title="商品id")
    private Long itemId;
    @Schema(title="商品标题")
    private String name;
    @Schema(title="商品动态属性键值集")
    private String spec;
    @Schema(title="价格,单位：分")
    private Integer price;
    @Schema(title="商品图片")
    private String image;
}
