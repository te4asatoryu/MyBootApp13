package jp.te4a.spring.boot.myapp13.security;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

import antlr.collections.List;
import jp.te4a.spring.boot.myapp13.bean.UserBean;
import lombok.Data;
@Data
public class LoginUserDetails extends User {
    private final UserBean user;
    public LoginUserDetails(UserBean userBean) {
    //     List<GrantedAuthority> authList = null;
    //     if(管理者の条件) {
    //         authList = AuthorityUtils.createAuthorityList("ROLE_ADMIN", "ROLE_USER", "ROLE_OTHER");
    //     } else if(一般ユーザの条件) {
    //         authList = AuthorityUtils.createAuthorityList("ROLE_USER", "ROLE_OTHER");
    //     } else {
    //        authList = AuthorityUtils.createAuthorityList("ROLE_OTHER");
    //     }
    //     super(userBean.getUsername(), userBean.getPassword(), authList));
    //     this.user = userBean;
    // }
        
        super(userBean.getUsername(), userBean.getPassword(),
        		AuthorityUtils.createAuthorityList("ROLE_USER","ROLE_ADMIN"));
        this.user = userBean;
    }

}
