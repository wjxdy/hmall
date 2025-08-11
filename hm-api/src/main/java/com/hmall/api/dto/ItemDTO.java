package com.hmall.api.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name ="商品实体")
public class ItemDTO {
    @Schema(title="商品id")
    private Long id;
    @Schema(title="SKU名称")
    private String name;
    @Schema(title="价格（分）")
    private Integer price;
    @Schema(title="库存数量")
    private Integer stock;
    @Schema(title="商品图片")
    private String image;
    @Schema(title="类目名称")
    private String category;
    @Schema(title="品牌名称")
    private String brand;
    @Schema(title="规格")
    private String spec;
    @Schema(title="销量")
    private Integer sold;
    @Schema(title="评论数")
    private Integer commentCount;
    @Schema(title="是否是推广广告，true/false")
    private Boolean isAD;
    @Schema(title="商品状态 1-正常，2-下架，3-删除")
    private Integer status;
}
