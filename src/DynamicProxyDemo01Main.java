import java.lang.reflect.Proxy;

public class DynamicProxyDemo01Main {

	public static void main(String[] args) {
		
		BuyHouseImp buyhouseImp=new BuyHouseImp();
		DynamicProxyHander handler=new DynamicProxyHander(buyhouseImp);
		BuyHouse proxy01 =(BuyHouse) Proxy.newProxyInstance(buyhouseImp.getClass().getClassLoader(), buyhouseImp.getClass().getInterfaces(), handler);
		proxy01.buyHouse();
		
		System.out.println("¡î¡î¡î¡î");
		System.out.println("¡î¡î¡î¡î");
		
		DynamicProxyFactory proxyFactory=new DynamicProxyFactory(buyhouseImp);
		BuyHouse proxy02 =(BuyHouse) proxyFactory.genearateDynamicProxy();
		proxy02.buyHouse();
	}
}
