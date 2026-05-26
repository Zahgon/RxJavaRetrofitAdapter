/*
 * Copyright (C) 2016 Jake Wharton
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package hu.akarnokd.rxjava3.retrofit;

import io.reactivex.rxjava3.core.*;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.*;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import retrofit2.*;

final class CallExecuteObservable<T> extends Observable<Response<T>> {

    private final Call<T> originalCall;

    CallExecuteObservable(Call<T> originalCall) {
        this.originalCall = originalCall;
    }

    @Override
    protected void subscribeActual(Observer<? super Response<T>> observer) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static final class CallDisposable implements Disposable {

        private final Call<?> call;

        private volatile boolean disposed;

        CallDisposable(Call<?> call) {
            this.call = call;
        }

        @Override
        public void dispose() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public boolean isDisposed() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
