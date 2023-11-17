package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.C1572d0;
import androidx.lifecycle.C1593j;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.lifecycle.c0 */
public final class C1565c0 implements C1619q {

    /* renamed from: l */
    public static final C1567b f4566l = new C1567b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final C1565c0 f4567m = new C1565c0();

    /* renamed from: d */
    private int f4568d;

    /* renamed from: e */
    private int f4569e;

    /* renamed from: f */
    private boolean f4570f = true;

    /* renamed from: g */
    private boolean f4571g = true;

    /* renamed from: h */
    private Handler f4572h;

    /* renamed from: i */
    private final C1631s f4573i = new C1631s(this);

    /* renamed from: j */
    private final Runnable f4574j = new C1559a0(this);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C1572d0.C1573a f4575k = new C1570d(this);

    /* renamed from: androidx.lifecycle.c0$a */
    public static final class C1566a {

        /* renamed from: a */
        public static final C1566a f4576a = new C1566a();

        private C1566a() {
        }

        /* renamed from: a */
        public static final void m5577a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            C41536l.m120489i(activity, "activity");
            C41536l.m120489i(activityLifecycleCallbacks, "callback");
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    /* renamed from: androidx.lifecycle.c0$b */
    public static final class C1567b {
        private C1567b() {
        }

        public /* synthetic */ C1567b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C1619q mo4857a() {
            return C1565c0.f4567m;
        }

        /* renamed from: b */
        public final void mo4858b(Context context) {
            C41536l.m120489i(context, "context");
            C1565c0.f4567m.mo4854h(context);
        }
    }

    /* renamed from: androidx.lifecycle.c0$c */
    public static final class C1568c extends C1582g {
        final /* synthetic */ C1565c0 this$0;

        /* renamed from: androidx.lifecycle.c0$c$a */
        public static final class C1569a extends C1582g {
            final /* synthetic */ C1565c0 this$0;

            C1569a(C1565c0 c0Var) {
                this.this$0 = c0Var;
            }

            public void onActivityPostResumed(Activity activity) {
                C41536l.m120489i(activity, "activity");
                this.this$0.mo4851e();
            }

            public void onActivityPostStarted(Activity activity) {
                C41536l.m120489i(activity, "activity");
                this.this$0.mo4852f();
            }
        }

        C1568c(C1565c0 c0Var) {
            this.this$0 = c0Var;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            C41536l.m120489i(activity, "activity");
            if (Build.VERSION.SDK_INT < 29) {
                C1572d0.f4579e.mo4877b(activity).mo4869f(this.this$0.f4575k);
            }
        }

        public void onActivityPaused(Activity activity) {
            C41536l.m120489i(activity, "activity");
            this.this$0.mo4850d();
        }

        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            C41536l.m120489i(activity, "activity");
            C1566a.m5577a(activity, new C1569a(this.this$0));
        }

        public void onActivityStopped(Activity activity) {
            C41536l.m120489i(activity, "activity");
            this.this$0.mo4853g();
        }
    }

    /* renamed from: androidx.lifecycle.c0$d */
    public static final class C1570d implements C1572d0.C1573a {

        /* renamed from: a */
        final /* synthetic */ C1565c0 f4577a;

        C1570d(C1565c0 c0Var) {
            this.f4577a = c0Var;
        }

        /* renamed from: n */
        public void mo4865n() {
            this.f4577a.mo4851e();
        }

        /* renamed from: o */
        public void mo4866o() {
            this.f4577a.mo4852f();
        }

        public void onCreate() {
        }
    }

    private C1565c0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static final void m5568i(C1565c0 c0Var) {
        C41536l.m120489i(c0Var, "this$0");
        c0Var.mo4855j();
        c0Var.mo4856k();
    }

    /* renamed from: l */
    public static final C1619q m5569l() {
        return f4566l.mo4857a();
    }

    /* renamed from: d */
    public final void mo4850d() {
        int i = this.f4569e - 1;
        this.f4569e = i;
        if (i == 0) {
            Handler handler = this.f4572h;
            C41536l.m120486f(handler);
            handler.postDelayed(this.f4574j, 700);
        }
    }

    /* renamed from: e */
    public final void mo4851e() {
        int i = this.f4569e + 1;
        this.f4569e = i;
        if (i != 1) {
            return;
        }
        if (this.f4570f) {
            this.f4573i.mo4941i(C1593j.C1594a.ON_RESUME);
            this.f4570f = false;
            return;
        }
        Handler handler = this.f4572h;
        C41536l.m120486f(handler);
        handler.removeCallbacks(this.f4574j);
    }

    /* renamed from: f */
    public final void mo4852f() {
        int i = this.f4568d + 1;
        this.f4568d = i;
        if (i == 1 && this.f4571g) {
            this.f4573i.mo4941i(C1593j.C1594a.ON_START);
            this.f4571g = false;
        }
    }

    /* renamed from: g */
    public final void mo4853g() {
        this.f4568d--;
        mo4856k();
    }

    public C1593j getLifecycle() {
        return this.f4573i;
    }

    /* renamed from: h */
    public final void mo4854h(Context context) {
        C41536l.m120489i(context, "context");
        this.f4572h = new Handler();
        this.f4573i.mo4941i(C1593j.C1594a.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        C41536l.m120487g(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new C1568c(this));
    }

    /* renamed from: j */
    public final void mo4855j() {
        if (this.f4569e == 0) {
            this.f4570f = true;
            this.f4573i.mo4941i(C1593j.C1594a.ON_PAUSE);
        }
    }

    /* renamed from: k */
    public final void mo4856k() {
        if (this.f4568d == 0 && this.f4570f) {
            this.f4573i.mo4941i(C1593j.C1594a.ON_STOP);
            this.f4571g = true;
        }
    }
}
