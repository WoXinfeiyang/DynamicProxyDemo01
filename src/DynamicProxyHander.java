import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**��̬����������*/
public class DynamicProxyHander implements InvocationHandler {
	
	/**���������*/
	private Object object;
	
	public DynamicProxyHander(Object object) {
		this.object = object;
	}


	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("��ǰ׼������");
		Object result=method.invoke(object, args);
		System.out.println("�򷿺�װ�ޡ���");
		return result;
	}

}
