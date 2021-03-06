package strategy.entity;

import strategy.BirdEating;
import strategy.BirdTraining;

/**
 * 鸟类
 * 抽象类Animal的实例化
 * 通过override实现了具体策略
 */
public class Bird extends Animal {
    @Override
    public void setEatingStrategy() {
        this.eatingStrategy = new BirdEating();
    }

    @Override
    public void setTrainingStrategy() {
        this.trainingStrategy = new BirdTraining();
    }
}
