package com.wbkit.service.impl;

import com.wbkit.service.TaskStrategy;

/**
 * Created by Administrator on 2017/10/13.
 */
public class TaskStrategy2Impl implements TaskStrategy {
    public int completeTaskById(int id) {
        // 完成特定功能
        this.finish();
        // 完成工作流功能实现
        int num = this.finishWorkFlow(id);
        return num;
    }

    // 完成strategy2特定的功能
    public void finish() {

    }

    // 完成工作流功能
    public int finishWorkFlow(int id){
        int result = 2;
        //System.out.println("strategy2 is finished");
        return result;
    }
}
