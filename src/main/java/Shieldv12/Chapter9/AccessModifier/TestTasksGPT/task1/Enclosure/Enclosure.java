package Shieldv12.Chapter9.AccessModifier.TestTasksGPT.task1.Enclosure;

import Shieldv12.Chapter9.AccessModifier.TestTasksGPT.task1.Zoo.Animal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Enclosure {
    private List<Animal> zooAnimals;
    public Enclosure(Animal... animals){
        {
            this.zooAnimals = new ArrayList<>(Arrays.asList(animals));
        }
    }
    public List<Animal> getZooAnimals(){
        return zooAnimals;
    }
}
