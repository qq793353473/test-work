package com.test.work.api.model;

import cn.stylefeng.roses.core.reqres.request.RequestData;
import cn.stylefeng.roses.core.util.ToolUtil;
import lombok.Data;

@Data
public class IdReq extends RequestData {

    private Long id;

    @Override
    public String checkParam() {
        String checkResult = "";
        if (ToolUtil.isEmpty(id)) {
            checkResult += "【 ID不能为空 】";
        }
        return checkResult;
    }
}
