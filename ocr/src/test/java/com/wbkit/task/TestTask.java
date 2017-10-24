package com.wbkit.task;

import com.wbkit.util.thread.Task;
import com.wbkit.util.thread.ThreadDistribute;
import com.wbkit.util.thread.WorkThread;
import com.wbkit.util.ReadProperties;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/10/13.
 */
public class TestTask {

    /*public static void main(String[] args){
        // 模拟获取的下一个任务的assign
        String strategyName = "TaskStrategy2Impl";

        // 根据assign创建task完成策略对象
        StrategyFactory taskStrategy = new StrategyFactory(strategyName);

        // 通过策略对象完成功能实现和工作流跳转
        int result = taskStrategy.completeTaskById(5);

        System.out.println(result);
    }*/

    public static void main(String args[]){


        TestTask tt = new TestTask();

        // 第一个任务的策略
        List taskStrategy = new ArrayList();
        taskStrategy.add("TaskStrategy1Impl");
        taskStrategy.add("TaskStrategy2Impl");
        taskStrategy.add("TaskStrategy1Impl");
        taskStrategy.add("TaskStrategy1Impl");

        // 第二个任务的策略
        /*List taskStrategy1 = new ArrayList();
        taskStrategy.add("TaskStrategy2Impl");
        taskStrategy.add("TaskStrategy2Impl");
        taskStrategy.add("TaskStrategy1Impl");
        taskStrategy.add("TaskStrategy1Impl");

        // 第三个任务的策略
        List taskStrategy2 = new ArrayList();
        taskStrategy.add("TaskStrategy1Impl");
        taskStrategy.add("TaskStrategy2Impl");
        taskStrategy.add("TaskStrategy2Impl");
        taskStrategy.add("TaskStrategy1Impl");

        // 第四个任务的策略
        List taskStrategy3 = new ArrayList();
        taskStrategy.add("TaskStrategy2Impl");
        taskStrategy.add("TaskStrategy2Impl");
        taskStrategy.add("TaskStrategy1Impl");
        taskStrategy.add("TaskStrategy2Impl");*/
        // 初始化要执行的任务列表
        List taskList = new ArrayList();
        for (int i = 0; i < 1; i++) {
            /*switch (i){
                case 0:
                    taskList.add(new Task(i, "thread"+i, taskStrategy));
                    break;
                case 1:
                    taskList.add(new Task(i, "thread"+i, taskStrategy1));
                    break;
                case 2:
                    taskList.add(new Task(i, "thread"+i, taskStrategy2));
                    break;
                case 3:
                    taskList.add(new Task(i, "thread"+i, taskStrategy3));
                    break;

            }*/
            taskList.add(new Task(i, "thread"+i, taskStrategy));
        }

        tt.executeThread(taskList);


    }


    private void executeThread(List<Task> taskList){
        // 设定要启动的工作线程数为 2 个
        int threadCount = ReadProperties.threadSize;
        List[] taskListPerThread = ThreadDistribute.distributeTasks(taskList, threadCount);
        System.out.println("实际要启动的工作线程数：" + taskListPerThread.length);

        // 线程开启工作
        for (int i = 0; i < taskListPerThread.length; i++) {
            Thread workThread = new WorkThread(taskListPerThread[i], i);
            workThread.start();
        }
    }

}
