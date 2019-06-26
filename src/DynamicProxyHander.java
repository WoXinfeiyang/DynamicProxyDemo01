import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**动态代理处理器类*/
public class DynamicProxyHander implements InvocationHandler {
	
	/**被代理对象*/
	private Object object;
	
	public DynamicProxyHander(Object object) {
		this.object = object;
	}


	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("买房前准备……");
		Object result=method.invoke(object, args);
		System.out.println("买房后装修……");
		return result;
	}

}
