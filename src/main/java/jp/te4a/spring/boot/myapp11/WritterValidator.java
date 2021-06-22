package jp.te4a.spring.boot.myapp11;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;



public class WritterValidator implements ConstraintValidator<WritterValid,String>{
	String ok;
	@Override
	public void initialize (WritterValid nv1){ok = nv1.ok();}
	@Override
	public boolean isValid(String in,ConstraintValidatorContext cxt){
		if(in == null){
			return false;
		}
		System.out.println(in.equals(ok));
		return in.equals(ok);
    }

}