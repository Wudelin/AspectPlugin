package com.aop.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

public class AopPlugin implements Plugin<Project> {

    void apply(Project project) {
        System.out.println("========================")
        System.out.println("Wdl gradle plugin!")
        System.out.println("========================")
    }
}