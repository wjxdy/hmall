package com.hmall.domain.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * <p>
 * 订单详情表
 * </p>
 *
 * @author 虎哥
 * @since 2023-05-05
 */
@Data
@Schema(description = "购物车VO实体")
public class CartVO {
    @Schema(title="购物车条目id ")
    private Long id;
    @Schema(title="sku商品id")
    private Long itemId;
    @Schema(title="购买数量")
    private Integer num;
    @Schema(title="商品标题")
    private String name;
    @Schema(title="商品动态属性键值集")
    private String spec;
    @Schema(title="价格,单位：分")
    private Integer price;
    @Schema(title="商品最新价格")
    private Integer newPrice;
    @Schema(title="商品最新状态")
    private Integer status = 1;
    @Schema(title="商品最新库存")
    private Integer stock = 10;
    @Schema(title="商品图片")
    private String image;
    @Schema(title="创建时间")
    private LocalDateTime createTime;

}
