package com.github.tenglovemeng.myfirstplugin.services

import com.github.tenglovemeng.myfirstplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
