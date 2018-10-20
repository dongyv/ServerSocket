package application.rpc;

import application.receive.HelloService;
import application.receive.HelloServiceImpl;

//注册服务
public class RpcProvider {
	public static void main(String args[]) throws Exception{
		HelloService service = new HelloServiceImpl();
		RPCFrameWork.export(service, 1234);
	}
}
