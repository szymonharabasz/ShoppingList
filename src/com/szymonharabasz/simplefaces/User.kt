package com.szymonharabasz.simplefaces

import javax.enterprise.context.RequestScoped
import javax.inject.Named

@Named
@RequestScoped
open class User(var firstName: String = "", var lastName: String = "", var email: String = "")