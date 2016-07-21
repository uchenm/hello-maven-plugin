package com.cffex.maven.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * Created by Ming on 2016/7/20.
 */
@Mojo( name = "sayhi")
public class GreetingMojo extends AbstractMojo
{

    /**
     * The greeting to display.
     */
    @Parameter( property = "sayhi.greeting", defaultValue = "Hello World!" )
    private String greeting;

    public void execute() throws MojoExecutionException
    {
        getLog().info( greeting);
    }
}