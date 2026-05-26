/*
 * Copyright (C) 2015 Square, Inc.
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

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.core.*;
import retrofit2.*;
import retrofit2.HttpException;

/**
 * A {@linkplain retrofit2.CallAdapter.Factory call adapter} which uses RxJava 3 for creating observables.
 * <p>
 * Adding this class to {@link Retrofit} allows you to return an {@link Observable},
 * {@link Flowable}, {@link Single}, {@link Completable} or {@link Maybe} from service methods.
 * <pre><code>
 * interface MyService {
 *   &#64;GET("user/me")
 *   Observable&lt;User&gt; getUser()
 * }
 * </code></pre>
 * There are three configurations supported for the {@code Observable}, {@code Flowable},
 * {@code Single}, {@link Completable} and {@code Maybe} type parameter:
 * <ul>
 * <li>Direct body (e.g., {@code Observable<User>}) calls {@code onNext} with the deserialized body
 * for 2XX responses and calls {@code onError} with {@link HttpException} for non-2XX responses and
 * {@link IOException} for network errors.</li>
 * <li>Response wrapped body (e.g., {@code Observable<Response<User>>}) calls {@code onNext}
 * with a {@link Response} object for all HTTP responses and calls {@code onError} with
 * {@link IOException} for network errors</li>
 * <li>Result wrapped body (e.g., {@code Observable<Result<User>>}) calls {@code onNext} with a
 * {@link Result} object for all HTTP responses and errors.</li>
 * </ul>
 */
public final class RxJava3CallAdapterFactory extends CallAdapter.Factory {

    /**
     * Returns an instance which creates synchronous observables that do not operate on any scheduler
     * by default.
     * @return the new adapter instance
     */
    public static RxJava3CallAdapterFactory create() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns an instance which creates asynchronous observables. Applying
     * {@link Observable#subscribeOn} has no effect on stream types created by this factory.
     * @return the new adapter instance
     */
    public static RxJava3CallAdapterFactory createAsync() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns an instance which creates synchronous observables that
     * {@linkplain Observable#subscribeOn(Scheduler) subscribe on} {@code scheduler} by default.
     * @param scheduler the scheduler to run the network operations on
     * @return the new adapter instance
     */
    public static RxJava3CallAdapterFactory createWithScheduler(Scheduler scheduler) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nullable
    private final Scheduler scheduler;

    private final boolean isAsync;

    private RxJava3CallAdapterFactory(@Nullable Scheduler scheduler, boolean isAsync) {
        this.scheduler = scheduler;
        this.isAsync = isAsync;
    }

    @Override
    @Nullable
    public CallAdapter<?, ?> get(Type returnType, Annotation[] annotations, Retrofit retrofit) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
