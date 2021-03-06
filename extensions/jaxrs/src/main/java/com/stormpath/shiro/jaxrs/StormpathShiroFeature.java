package com.stormpath.shiro.jaxrs;

import org.apache.shiro.web.jaxrs.ShiroAnnotationFilterFeature;
import org.apache.shiro.web.jaxrs.SubjectPrincipalRequestFilter;

import javax.ws.rs.core.Feature;
import javax.ws.rs.core.FeatureContext;
import javax.ws.rs.ext.Provider;

/**
 * JAX-RS feature which configures Apache Shiro annotations, Shiro backed SecurityContext, and exception handling.
 *
 * @since 0.8.0
 */
@Provider // NOTE: Apache CXF requires this annotation on this feature (jersey and resteasy do not)
public class StormpathShiroFeature implements Feature {

    @Override
    public boolean configure(FeatureContext context) {

        context.register(StormpathShiroExceptionMapper.class);
        context.register(SubjectPrincipalRequestFilter.class);
        context.register(ShiroAnnotationFilterFeature.class);

        return true;
    }
}