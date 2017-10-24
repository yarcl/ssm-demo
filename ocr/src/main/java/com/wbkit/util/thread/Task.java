package com.wbkit.util.thread;

import com.wbkit.util.StrategyFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/10/16.
 */
public /**
 * 要执行的任务，可在执行时改变它的某个状态或调用它的某个操作 例如任务有三个状态，就绪，运行，完成，默认为就绪态 要进一步完善，可为 Task
 * 加上状态变迁的监听器，因之决定UI的显示
 */
class Task {
    public static final int READY = 0;
    public static final int RUNNING = 1;
    public static final int FINISHED = 2;
    @SuppressWarnings("unused")
    private int status;
    // 声明一个任务的自有业务含义的变量，用于标识任务
    private int taskId;

    private String taskName;

    private List<String> taskStrategies = new ArrayList();

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    // 任务的初始化方法
    public Task(int taskId, String taskName, List<String> taskStrategies) {
        this.status = READY;
        this.taskId = taskId;
        this.taskName = taskName;

        this.taskStrategies = taskStrategies;
    }

    /**
     * 执行任务
     */
    public void execute() {
        // 设置状态为运行中
        setStatus(Task.RUNNING);
        /*System.out.println("当前线程 ID 是：" + Thread.currentThread().getName()
                + " | 任务 ID 是：" + this.taskId);*/

        // 做图像的处理
        for(String strategyName : taskStrategies){
            // 根据assign创建task完成策略对象
            StrategyFactory taskStrategy = new StrategyFactory(strategyName);
            // 通过策略对象完成功能实现和工作流跳转
            int result = taskStrategy.completeTaskById(5);

            System.out.println(Thread.currentThread().getName()+":"+taskName);
            /*try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
        /*System.out.println("hello everyone:"+taskName+":currentThread:"+Thread.currentThread().getName());
        System.out.println("============================");*/

        // 附加一个延时
        /*try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        // 执行完成，改状态为完成
        setStatus(FINISHED);
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getTaskId() {
        return taskId;
    }
}
