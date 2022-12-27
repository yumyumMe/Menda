package com.app.menda.Request;

import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "User Request")
public class UserRequest {
    
    @ApiModelProperty(value = "id", example = "1")
    @NotNull
    private Integer id;

}
