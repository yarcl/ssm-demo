package com.wbkit.util;

import com.wbkit.service.TaskStrategy;

/**
 * Created by Administrator on 2017/10/13.
 */
public class StrategyFactory {

    // 私有化一个策略对象
    private TaskStrategy taskStrategy;

    // 通过传入策略实现对象来实现策略
    public StrategyFactory(TaskStrategy taskStrategy) {
        this.taskStrategy = taskStrategy;
    }

    // 通过传入策略实现类名实现策略
    public StrategyFactory(String strategyName){
        if(null!=strategyName && !"".equals(strategyName)){
            strategyName = ReadProperties.strategyPath+"."+strategyName;
        } else {
            return;
        }
        TaskStrategy strategy = null;
        try {
            Class clazz = Class.forName(strategyName);
            Object obj = clazz.newInstance();
            strategy = (TaskStrategy)obj;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        this.taskStrategy = strategy;
    }

    // 通过taskId完成任务
    public int completeTaskById(int id) {
        return taskStrategy.completeTaskById(id);
    }

}
