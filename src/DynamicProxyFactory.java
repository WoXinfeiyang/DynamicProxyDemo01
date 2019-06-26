import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxyFactory {

	private Object target;
	

	
	public DynamicProxyFactory(Object target) {
		this.target = target;
	}



	public Object genearateDynamicProxy() {
		return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(), 
				new InvocationHandler() {

					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("**start**");
						Object result=method.invoke(target, args);
						System.out.println("**end**");
						return result;
					}
			
		});
	}
	
}
