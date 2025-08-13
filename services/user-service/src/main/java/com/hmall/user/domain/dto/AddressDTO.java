package com.hmall.user.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name ="收货地址实体")
public class AddressDTO {
    @Schema(title="id")
    private Long id;
    @Schema(title="省")
    private String province;
    @Schema(title="市")
    private String city;
    @Schema(title="县/区")
    private String town;
    @Schema(title="手机")
    private String mobile;
    @Schema(title="详细地址")
    private String street;
    @Schema(title="联系人")
    private String contact;
    @Schema(title="是否是默认 1默认 0否")
    private Integer isDefault;
    @Schema(title="备注")
    private String notes;
}
