package com.hmall.domain.query;

import com.hmall.common.domain.PageQuery;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "商品分页查询条件")
public class ItemPageQuery extends PageQuery {
    @Schema(title="搜索关键字")
    private String key;
    @Schema(title="商品分类")
    private String category;
    @Schema(title="商品品牌")
    private String brand;
    @Schema(title="价格最小值")
    private Integer minPrice;
    @Schema(title="价格最大值")
    private Integer maxPrice;
}
