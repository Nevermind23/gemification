package com.tinder.scarlet.lifecycle.android;

import androidx.lifecycle.C1593j;
import androidx.lifecycle.C1616p;
import androidx.lifecycle.C1646z;
import p375cf.C10415c;
import p652we.C18532c;
import p652we.C18549h;

public abstract class LifecycleOwnerResumedLifecycle implements C18532c {

    private final class ALifecycleObserver implements C1616p {
        @C1646z(C1593j.C1594a.ON_DESTROY)
        public final void onDestroy() {
            LifecycleOwnerResumedLifecycle.m44155b((LifecycleOwnerResumedLifecycle) null).onComplete();
        }

        @C1646z(C1593j.C1594a.ON_PAUSE)
        public final void onPause() {
            LifecycleOwnerResumedLifecycle.m44155b((LifecycleOwnerResumedLifecycle) null).onNext(new C18532c.C18533a.C18536c.C18538b(new C18549h(1000, "Paused")));
        }

        @C1646z(C1593j.C1594a.ON_RESUME)
        public final void onResume() {
            LifecycleOwnerResumedLifecycle.m44155b((LifecycleOwnerResumedLifecycle) null).onNext(C18532c.C18533a.C18535b.f52030a);
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ C10415c m44155b(LifecycleOwnerResumedLifecycle lifecycleOwnerResumedLifecycle) {
        throw null;
    }
}
