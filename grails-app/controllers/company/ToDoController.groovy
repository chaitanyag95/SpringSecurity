package company

import com.company.Role
import com.company.User
import grails.plugin.springsecurity.annotation.Secured
@Secured(['ROLE_ADMIN','ROLE_CUST'])
class ToDoController {
    def springSecurityService

    def index() {

        User user= springSecurityService.currentUser
        Set<Role> roles =user.getAuthorities()
       boolean  flag =roles*.authority.contains('ROLE_ADMIN')
        if(flag)
        {
            render(view: 'adminhome')
        }
        else{
            render(view: 'custhome')
        }

    }
}
