package com.wbkit.service;

/**
 * Created by Administrator on 2017/10/13.
 */
public interface TaskStrategy {

    // 定义策略枚举类型
    /*public enum Strategy {

        strategy1{
            public String getName(){
                return "com.xqkj.strategy.OneStrategy";
            }
        },
        strategy2{
            public String getName(){
                return "com.xqkj.strategy.TowStrategy";
            }
        },
        strategy3{
            public String getName(){
                return "com.xqkj.strategy.ThreeStrategy";
            }
        },
        strategy4{
            public String getName(){
                return "com.xqkj.strategy.FourStrategy";
            }
        },
        strategy5{
            public String getName(){
                return "com.xqkj.strategy.FiveStrategy";
            }
        },
        strategy6{
            public String getName(){
                return "com.xqkj.strategy.SixStrategy";
            }
        } ;
    }*/


    // 供调用的完成接口
    public int completeTaskById(int id);

    // 完成特定功能
    public void finish();

    // 完成工作流任务
    public int finishWorkFlow(int id);


}
