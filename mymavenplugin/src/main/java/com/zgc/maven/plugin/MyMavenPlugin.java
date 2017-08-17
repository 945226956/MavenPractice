package com.zgc.maven.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * my test maven plugin
 *
 * @goal testg
 */
@Mojo(name = "testg11", defaultPhase = LifecyclePhase.VALIDATE)
public class MyMavenPlugin extends AbstractMojo {
    @Parameter
    private String[] includes;
    @Parameter(required = true/*如果没有该参数则报错*/,
            readonly = true/*通常表示不希望对其配置*/,
            alias = "aliasppp"/*别名*/,
            defaultValue = "${expp}" /*代码配置的参数aliasppp的优先级大于命令行的expp表达书的值*/)
    private String ppp;

    public void execute() {
        getLog().info("ppp------------------" + ppp);
        for (String include : includes) {
            getLog().info("include--------------" + include);
        }
    }
}