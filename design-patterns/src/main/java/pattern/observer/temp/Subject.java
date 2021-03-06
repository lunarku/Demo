package pattern.observer.temp;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象, 它知道观察它的观察者, 并提供注册(添加)和删除观察者的接口
 */
public class Subject {

    // 用来保存观察者对象
    private List<Observer> observers = new ArrayList<>();

    // attach detach notifyObservers

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void detach(Observer observer){
        observers.remove(observer);
    }

    // 通知所有注册了的观察者
    protected void notifyObservers(){
        for(Observer observer : observers){
            observer.update(this);
        }
    }
}
