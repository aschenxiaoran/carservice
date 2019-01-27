package com.gofun.carservice.common.tools.validators;

import com.baidu.unbiz.fluentvalidator.GenericResult;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ValidatorResult extends GenericResult<String> {


    /*
    * 错误码
    * */
    private int errorCode;

    /*
    * 错误信息
    * */
    private String errorMsg;

    /*
    * 错误值
    * */
    private Object errorValue;


}
