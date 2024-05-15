package com.zack.zojcodesandbox;


import com.zack.zojcodesandbox.model.ExecuteCodeRequest;
import com.zack.zojcodesandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     *  执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
