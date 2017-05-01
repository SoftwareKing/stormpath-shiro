/*
 * Copyright 2012 Stormpath, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.stormpath.shiro.stubs;


import com.stormpath.sdk.application.Application;
import com.stormpath.sdk.client.Client;
import com.stormpath.shiro.realm.ApplicationResolver;
import org.easymock.EasyMock;

import javax.servlet.ServletContext;

public class StubApplicationResolver implements ApplicationResolver {

    public void setServletContext(ServletContext context){}

    @Override
    public Application getApplication(Client client, String href) {

        Application application = EasyMock.createNiceMock(Application.class);
        EasyMock.replay(application);
        return application;
    }
}
