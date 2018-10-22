package application.controller;

import application.observer.Push;
import application.observer.PushService;
import application.observer.subscribe.Client;
import application.rpc.RPCFrameWork;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ShowPushController {

    @RequestMapping("/show")
    @ResponseBody
    public void show(){
        //开启订阅用户查询
        Client client = openService();
        Push push = new PushService();
        push.addClient(client);
        //发起通知
        push.updateDate();
    }

    private Client openService(){
        Client client = null;
        try {
            client = RPCFrameWork.refer(Client.class,"127.0.0.1",1111);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return client;
    }
}