package p267u0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C41536l;
import p267u0.C8479l;
import p267u0.C8482m;
import p267u0.C8488q;

/* renamed from: u0.t */
public final class C8497t {

    /* renamed from: a */
    private final String f24136a;

    /* renamed from: b */
    private final C8488q f24137b;

    /* renamed from: c */
    private final Executor f24138c;

    /* renamed from: d */
    private final Context f24139d;

    /* renamed from: e */
    private int f24140e;

    /* renamed from: f */
    public C8488q.C8492c f24141f;

    /* renamed from: g */
    private C8482m f24142g;

    /* renamed from: h */
    private final C8479l f24143h = new C8499b(this);

    /* renamed from: i */
    private final AtomicBoolean f24144i = new AtomicBoolean(false);

    /* renamed from: j */
    private final ServiceConnection f24145j;

    /* renamed from: k */
    private final Runnable f24146k;

    /* renamed from: l */
    private final Runnable f24147l;

    /* renamed from: u0.t$a */
    public static final class C8498a extends C8488q.C8492c {

        /* renamed from: b */
        final /* synthetic */ C8497t f24148b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8498a(C8497t tVar, String[] strArr) {
            super(strArr);
            this.f24148b = tVar;
        }

        /* renamed from: b */
        public boolean mo23779b() {
            return true;
        }

        /* renamed from: c */
        public void mo23780c(Set set) {
            C41536l.m120489i(set, "tables");
            if (!this.f24148b.mo23794j().get()) {
                try {
                    C8482m h = this.f24148b.mo23792h();
                    if (h != null) {
                        int c = this.f24148b.mo23787c();
                        Object[] array = set.toArray(new String[0]);
                        C41536l.m120487g(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        h.mo6105W0(c, (String[]) array);
                    }
                } catch (RemoteException e) {
                    Log.w("ROOM", "Cannot broadcast invalidation", e);
                }
            }
        }
    }

    /* renamed from: u0.t$b */
    public static final class C8499b extends C8479l.C8480a {

        /* renamed from: b */
        final /* synthetic */ C8497t f24149b;

        C8499b(C8497t tVar) {
            this.f24149b = tVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: y */
        public static final void m31829y(C8497t tVar, String[] strArr) {
            C41536l.m120489i(tVar, "this$0");
            C41536l.m120489i(strArr, "$tables");
            tVar.mo23789e().mo23765k((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        /* renamed from: P */
        public void mo23749P(String[] strArr) {
            C41536l.m120489i(strArr, "tables");
            this.f24149b.mo23788d().execute(new C8501u(this.f24149b, strArr));
        }
    }

    /* renamed from: u0.t$c */
    public static final class C8500c implements ServiceConnection {

        /* renamed from: a */
        final /* synthetic */ C8497t f24150a;

        C8500c(C8497t tVar) {
            this.f24150a = tVar;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C41536l.m120489i(componentName, "name");
            C41536l.m120489i(iBinder, "service");
            this.f24150a.mo23796m(C8482m.C8483a.m31774k(iBinder));
            this.f24150a.mo23788d().execute(this.f24150a.mo23793i());
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C41536l.m120489i(componentName, "name");
            this.f24150a.mo23788d().execute(this.f24150a.mo23791g());
            this.f24150a.mo23796m((C8482m) null);
        }
    }

    public C8497t(Context context, String str, Intent intent, C8488q qVar, Executor executor) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(str, "name");
        C41536l.m120489i(intent, "serviceIntent");
        C41536l.m120489i(qVar, "invalidationTracker");
        C41536l.m120489i(executor, "executor");
        this.f24136a = str;
        this.f24137b = qVar;
        this.f24138c = executor;
        Context applicationContext = context.getApplicationContext();
        this.f24139d = applicationContext;
        C8500c cVar = new C8500c(this);
        this.f24145j = cVar;
        this.f24146k = new C8495r(this);
        this.f24147l = new C8496s(this);
        Object[] array = qVar.mo23763i().keySet().toArray(new String[0]);
        C41536l.m120487g(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        mo23795l(new C8498a(this, (String[]) array));
        applicationContext.bindService(intent, cVar, 1);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final void m31814k(C8497t tVar) {
        C41536l.m120489i(tVar, "this$0");
        tVar.f24137b.mo23767n(tVar.mo23790f());
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static final void m31815n(C8497t tVar) {
        C41536l.m120489i(tVar, "this$0");
        try {
            C8482m mVar = tVar.f24142g;
            if (mVar != null) {
                tVar.f24140e = mVar.mo6106Z(tVar.f24143h, tVar.f24136a);
                tVar.f24137b.mo23757c(tVar.mo23790f());
            }
        } catch (RemoteException e) {
            Log.w("ROOM", "Cannot register multi-instance invalidation callback", e);
        }
    }

    /* renamed from: c */
    public final int mo23787c() {
        return this.f24140e;
    }

    /* renamed from: d */
    public final Executor mo23788d() {
        return this.f24138c;
    }

    /* renamed from: e */
    public final C8488q mo23789e() {
        return this.f24137b;
    }

    /* renamed from: f */
    public final C8488q.C8492c mo23790f() {
        C8488q.C8492c cVar = this.f24141f;
        if (cVar != null) {
            return cVar;
        }
        C41536l.m120506z("observer");
        return null;
    }

    /* renamed from: g */
    public final Runnable mo23791g() {
        return this.f24147l;
    }

    /* renamed from: h */
    public final C8482m mo23792h() {
        return this.f24142g;
    }

    /* renamed from: i */
    public final Runnable mo23793i() {
        return this.f24146k;
    }

    /* renamed from: j */
    public final AtomicBoolean mo23794j() {
        return this.f24144i;
    }

    /* renamed from: l */
    public final void mo23795l(C8488q.C8492c cVar) {
        C41536l.m120489i(cVar, "<set-?>");
        this.f24141f = cVar;
    }

    /* renamed from: m */
    public final void mo23796m(C8482m mVar) {
        this.f24142g = mVar;
    }
}
