package application.observer;

import application.observer.subscribe.Client;

/**
 * 发布类，将会通知订阅用户
 */
public interface Push {
    /**
     * 添加观察者
     */
    void addClient(Client client);
    /**
     * 删除观察者
     */
    boolean deleteClient(Client client);
    /**
     * 通知
     */
    void notifyClients(String...interfacees);
    /**
     * 主题内容更新
     */
    void updateDate();
}
