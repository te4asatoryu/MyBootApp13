package jp.te4a.spring.boot.myapp11;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

public class TestValidator implements ConstraintValidator<TestValid,String>{
	String param;
	@Override
	public void initialize(TestValid nv){ param =  nv.param(); }
	@Override
	public boolean isValid(String in,ConstraintValidatorContext cxt){
		if(in == null){
			return false;
		}
		System.out.println(in.equals(param));
		return !in.equals(param);
    }


}
   



