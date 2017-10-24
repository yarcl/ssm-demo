package com.wbkit.service.impl;

import com.wbkit.service.TaskStrategy;

/**
 * Created by Administrator on 2017/10/13.
 */
public class TaskStrategy1Impl implements TaskStrategy {
    public int completeTaskById(int id) {

        // 完成特定功能
        this.finish();
        // 完成工作流功能实现
        int num = this.finishWorkFlow(id);
        return num;
    }

    // 完成strategy1特定的功能
    public void finish(){

    }

    // 完成工作流功能
    public int finishWorkFlow(int id){
        int result = 1;
        //System.out.println("strategy1 is finished");
        return result;
    }
}
