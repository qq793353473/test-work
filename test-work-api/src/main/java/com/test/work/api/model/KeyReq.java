package com.test.work.api.model;

import cn.stylefeng.roses.core.reqres.request.RequestData;
import cn.stylefeng.roses.core.util.ToolUtil;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "key对象")
public class KeyReq extends RequestData {
    @ApiModelProperty(value = "key", example = "ID")
    private String key;

    @Override
    public String checkParam() {
        String checkResult = "";

        if (ToolUtil.isEmpty(key)) {
            checkResult += "【Key不能为空】";
        }

        return checkResult;
    }

}
