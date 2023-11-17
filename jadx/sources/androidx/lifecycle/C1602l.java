package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C41536l;

/* renamed from: androidx.lifecycle.l */
public final class C1602l {

    /* renamed from: a */
    public static final C1602l f4615a = new C1602l();

    /* renamed from: b */
    private static final AtomicBoolean f4616b = new AtomicBoolean(false);

    /* renamed from: androidx.lifecycle.l$a */
    public static final class C1603a extends C1582g {
        public void onActivityCreated(Activity activity, Bundle bundle) {
            C41536l.m120489i(activity, "activity");
            C1572d0.f4579e.mo4878c(activity);
        }
    }

    private C1602l() {
    }

    /* renamed from: a */
    public static final void m5645a(Context context) {
        C41536l.m120489i(context, "context");
        if (!f4616b.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            C41536l.m120487g(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C1603a());
        }
    }
}
