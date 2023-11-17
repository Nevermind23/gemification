package p337z7;

import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p156l6.C6942g;

/* renamed from: z7.g0 */
final class C9228g0 extends LifecycleCallback {

    /* renamed from: e */
    private final List f25652e = new ArrayList();

    private C9228g0(C6942g gVar) {
        super(gVar);
        this.f12316d.mo21087i("TaskOnStopCallback", this);
    }

    /* renamed from: l */
    public static C9228g0 m34075l(Activity activity) {
        C6942g c = LifecycleCallback.m14577c(activity);
        C9228g0 g0Var = (C9228g0) c.mo21086H("TaskOnStopCallback", C9228g0.class);
        if (g0Var == null) {
            return new C9228g0(c);
        }
        return g0Var;
    }

    /* renamed from: k */
    public final void mo11990k() {
        synchronized (this.f25652e) {
            for (WeakReference weakReference : this.f25652e) {
                C9220c0 c0Var = (C9220c0) weakReference.get();
                if (c0Var != null) {
                    c0Var.mo24878s();
                }
            }
            this.f25652e.clear();
        }
    }

    /* renamed from: m */
    public final void mo24888m(C9220c0 c0Var) {
        synchronized (this.f25652e) {
            this.f25652e.add(new WeakReference(c0Var));
        }
    }
}
