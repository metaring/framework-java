/**
 *    Copyright 2019 MetaRing s.r.l.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.metaring.framework;

import static com.ea.async.Async.await;

import java.util.concurrent.CompletableFuture;

import com.metaring.framework.email.EmailFunctionalitiesManager;

class ReinitFunctionalityImpl extends ReinitFunctionality {

    @Override
    protected CompletableFuture<Void> preConditionCheck() throws Exception {
        return end;
    }

    @Override
    protected CompletableFuture<Void> call() throws Exception {
        Core.SYSKB.reinit();
        await(EmailFunctionalitiesManager.reinit());
        return end;
    }

    @Override
    protected CompletableFuture<Void> postConditionCheck() throws Exception {
        return end;
    }
}