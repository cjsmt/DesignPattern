package multiton;

import multiton.RoomDistributor;
import multiton.entity.TrainingRoom;
import org.junit.Test;

/**
 * Multiton测试类
 */
public class MultitonTest {
    @Test
    public void MultitonTest(){
        System.out.println("---------------------");
        System.out.println("This is Multiton Test");
        System.out.println("---------------------");
        RoomDistributor roomDistributor = new RoomDistributor();
        TrainingRoom trainingRoom1 = roomDistributor.applyRoom();
        TrainingRoom trainingRoom2 = roomDistributor.applyRoom();
        TrainingRoom trainingRoom3 = roomDistributor.applyRoom();
        TrainingRoom trainingRoom4 = roomDistributor.applyRoom();
        trainingRoom1.showRoom();
        trainingRoom2.showRoom();
        trainingRoom3.showRoom();
        trainingRoom2.repayRoom();
        trainingRoom4 = roomDistributor.applyRoom();
        trainingRoom4.showRoom();
    }
}
