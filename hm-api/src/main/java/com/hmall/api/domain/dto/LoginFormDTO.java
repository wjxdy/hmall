package com.hmall.api.domain.dto;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
@Data
@Schema(name ="登录表单实体")
public class LoginFormDTO {
    @Schema(title = "用户名", required = true)
    @NotNull(message = "用户名不能为空")
    private String username;
    @NotNull(message = "密码不能为空")
    @Schema(title = "用户名", required = true)
    private String password;
    @Schema(title = "是否记住我", required = false)
    private Boolean rememberMe = false;
}
