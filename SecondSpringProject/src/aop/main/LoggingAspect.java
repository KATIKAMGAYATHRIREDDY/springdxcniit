package aop.main;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	//@Before("execution(public String aop.model.Triangle.getName())")
	
	//@Before("execution(* com.aop..*.*(..))")
	//@Before("execution(public * aop.model.*.getName())")
	//@Before("execution(public * aop.model.*.getName())")

	//@Before("execution(* aop..*.*(..))")//for aop and its subpackages
	
	/*@Before("execution(* aop.model.*.get())")

	public void loggingAdvice() {
		System.out.println("writing log before method is executed");
	}
	@Before("execution(* aop.model.*.get())")

	public void secondAdviceforAllGetters() {
		System.out.println("second log before method is executed");
	}
	
	@Before("execution(* aop.model.*.get())")

	public void thirdAdviceforAllGetters() {
		System.out.println("third log before method is executed");
	} */
	
	@Pointcut("execution(* aop..*.get*())")
	public void allGetters() {}
}
