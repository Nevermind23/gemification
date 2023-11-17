package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.C1593j;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.lifecycle.d0 */
public class C1572d0 extends Fragment {

    /* renamed from: e */
    public static final C1574b f4579e = new C1574b((DefaultConstructorMarker) null);

    /* renamed from: d */
    private C1573a f4580d;

    /* renamed from: androidx.lifecycle.d0$a */
    public interface C1573a {
        /* renamed from: n */
        void mo4865n();

        /* renamed from: o */
        void mo4866o();

        void onCreate();
    }

    /* renamed from: androidx.lifecycle.d0$b */
    public static final class C1574b {
        private C1574b() {
        }

        public /* synthetic */ C1574b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo4876a(Activity activity, C1593j.C1594a aVar) {
            C41536l.m120489i(activity, "activity");
            C41536l.m120489i(aVar, "event");
            if (activity instanceof C1619q) {
                C1593j lifecycle = ((C1619q) activity).getLifecycle();
                if (lifecycle instanceof C1631s) {
                    ((C1631s) lifecycle).mo4941i(aVar);
                }
            }
        }

        /* renamed from: b */
        public final C1572d0 mo4877b(Activity activity) {
            C41536l.m120489i(activity, "<this>");
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            C41536l.m120487g(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            return (C1572d0) findFragmentByTag;
        }

        /* renamed from: c */
        public final void mo4878c(Activity activity) {
            C41536l.m120489i(activity, "activity");
            if (Build.VERSION.SDK_INT >= 29) {
                C1575c.Companion.mo4892a(activity);
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
                fragmentManager.beginTransaction().add(new C1572d0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
                fragmentManager.executePendingTransactions();
            }
        }
    }

    /* renamed from: androidx.lifecycle.d0$c */
    public static final class C1575c implements Application.ActivityLifecycleCallbacks {
        public static final C1576a Companion = new C1576a((DefaultConstructorMarker) null);

        /* renamed from: androidx.lifecycle.d0$c$a */
        public static final class C1576a {
            private C1576a() {
            }

            public /* synthetic */ C1576a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final void mo4892a(Activity activity) {
                C41536l.m120489i(activity, "activity");
                activity.registerActivityLifecycleCallbacks(new C1575c());
            }
        }

        public static final void registerIn(Activity activity) {
            Companion.mo4892a(activity);
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            C41536l.m120489i(activity, "activity");
        }

        public void onActivityDestroyed(Activity activity) {
            C41536l.m120489i(activity, "activity");
        }

        public void onActivityPaused(Activity activity) {
            C41536l.m120489i(activity, "activity");
        }

        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            C41536l.m120489i(activity, "activity");
            C1572d0.f4579e.mo4876a(activity, C1593j.C1594a.ON_CREATE);
        }

        public void onActivityPostResumed(Activity activity) {
            C41536l.m120489i(activity, "activity");
            C1572d0.f4579e.mo4876a(activity, C1593j.C1594a.ON_RESUME);
        }

        public void onActivityPostStarted(Activity activity) {
            C41536l.m120489i(activity, "activity");
            C1572d0.f4579e.mo4876a(activity, C1593j.C1594a.ON_START);
        }

        public void onActivityPreDestroyed(Activity activity) {
            C41536l.m120489i(activity, "activity");
            C1572d0.f4579e.mo4876a(activity, C1593j.C1594a.ON_DESTROY);
        }

        public void onActivityPrePaused(Activity activity) {
            C41536l.m120489i(activity, "activity");
            C1572d0.f4579e.mo4876a(activity, C1593j.C1594a.ON_PAUSE);
        }

        public void onActivityPreStopped(Activity activity) {
            C41536l.m120489i(activity, "activity");
            C1572d0.f4579e.mo4876a(activity, C1593j.C1594a.ON_STOP);
        }

        public void onActivityResumed(Activity activity) {
            C41536l.m120489i(activity, "activity");
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C41536l.m120489i(activity, "activity");
            C41536l.m120489i(bundle, "bundle");
        }

        public void onActivityStarted(Activity activity) {
            C41536l.m120489i(activity, "activity");
        }

        public void onActivityStopped(Activity activity) {
            C41536l.m120489i(activity, "activity");
        }
    }

    /* renamed from: a */
    private final void m5583a(C1593j.C1594a aVar) {
        if (Build.VERSION.SDK_INT < 29) {
            C1574b bVar = f4579e;
            Activity activity = getActivity();
            C41536l.m120488h(activity, "activity");
            bVar.mo4876a(activity, aVar);
        }
    }

    /* renamed from: b */
    private final void m5584b(C1573a aVar) {
        if (aVar != null) {
            aVar.onCreate();
        }
    }

    /* renamed from: c */
    private final void m5585c(C1573a aVar) {
        if (aVar != null) {
            aVar.mo4865n();
        }
    }

    /* renamed from: d */
    private final void m5586d(C1573a aVar) {
        if (aVar != null) {
            aVar.mo4866o();
        }
    }

    /* renamed from: e */
    public static final void m5587e(Activity activity) {
        f4579e.mo4878c(activity);
    }

    /* renamed from: f */
    public final void mo4869f(C1573a aVar) {
        this.f4580d = aVar;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m5584b(this.f4580d);
        m5583a(C1593j.C1594a.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        m5583a(C1593j.C1594a.ON_DESTROY);
        this.f4580d = null;
    }

    public void onPause() {
        super.onPause();
        m5583a(C1593j.C1594a.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        m5585c(this.f4580d);
        m5583a(C1593j.C1594a.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        m5586d(this.f4580d);
        m5583a(C1593j.C1594a.ON_START);
    }

    public void onStop() {
        super.onStop();
        m5583a(C1593j.C1594a.ON_STOP);
    }
}
