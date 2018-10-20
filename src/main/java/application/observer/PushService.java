package application.observer;

import application.observer.subscribe.Client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author xiachenhang
 */
public class PushService implements Push {
    private List<Client> clients = new ArrayList<>();

    @Override
    public void addClient(Client client) {
        clients.add(client);
    }

    @Override
    public boolean deleteClient(Client client) {
        return clients.remove(client);
    }

    @Override
    public void notifyClients() {
        Iterator<Client> iterator = clients.iterator();
        while(iterator.hasNext()){
            iterator.next().receiveNotify();
        }
    }

    /**
     * 更新时候的规则可以改变，也可根据实际情况进行更新，但是需要把这个类定义为abstract
     * 对需要更新的方法进行对应处理
     */
    @Override
    public void updateWeather() {

    }
}
