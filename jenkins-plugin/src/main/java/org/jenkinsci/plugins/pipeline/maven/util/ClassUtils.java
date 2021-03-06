package org.jenkinsci.plugins.pipeline.maven.util;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.io.InputStream;

/**
 * @author <a href="mailto:cleclerc@cloudbees.com">Cyrille Le Clerc</a>
 */
public class ClassUtils {

    @Nullable
    public static InputStream getResourceAsStream(@Nonnull String resourcePath) {
        InputStream result = Thread.currentThread().getContextClassLoader().getResourceAsStream(resourcePath);
        if(result == null) {
             result = ClassUtils.class.getClassLoader().getResourceAsStream(resourcePath);
        }
         return result;
    }

}
