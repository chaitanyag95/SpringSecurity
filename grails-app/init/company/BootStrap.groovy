package company

import com.company.Role
import com.company.User
import com.company.UserRole

class BootStrap {

    def init = { servletContext ->
        def admin =new User('admin', 'admin').save()
        def customer = new User('chaitanya', 'chaitu').save()
        def adminRole = new Role( 'ROLE_ADMIN').save()
        def custRole = new Role('ROLE_CUST').save()
        UserRole.create admin ,adminRole ,true
        UserRole.create customer,custRole,true
    }
    def destroy = {
    }
}
