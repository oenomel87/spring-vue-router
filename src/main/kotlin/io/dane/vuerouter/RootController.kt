package io.dane.vuerouter

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class RootController {

    @RequestMapping("", "/")
    fun index() : String {
        return "index"
    }

    @RequestMapping("/vue", "/vue/*")
    fun vue() : String {
        return "vue/index"
    }
}