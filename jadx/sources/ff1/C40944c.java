package ff1;

import android.os.Handler;
import android.os.Looper;
import ef1.C40839n;
import ef1.C40859r1;
import ef1.C40867u0;
import he1.C41238w;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import me1.C41752f;
import ue1.C43075l;

/* renamed from: ff1.c */
public final class C40944c extends C40947d {
    private volatile C40944c _immediate;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Handler f96713f;

    /* renamed from: g */
    private final String f96714g;

    /* renamed from: h */
    private final boolean f96715h;

    /* renamed from: i */
    private final C40944c f96716i;

    /* renamed from: ff1.c$a */
    public static final class C40945a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C40839n f96717d;

        /* renamed from: e */
        final /* synthetic */ C40944c f96718e;

        public C40945a(C40839n nVar, C40944c cVar) {
            this.f96717d = nVar;
            this.f96718e = cVar;
        }

        public final void run() {
            this.f96717d.mo95189w(this.f96718e, C41238w.f97225a);
        }
    }

    /* renamed from: ff1.c$b */
    static final class C40946b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C40944c f96719d;

        /* renamed from: e */
        final /* synthetic */ Runnable f96720e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40946b(C40944c cVar, Runnable runnable) {
            super(1);
            this.f96719d = cVar;
            this.f96720e = runnable;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f96719d.f96713f.removeCallbacks(this.f96720e);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C40944c(Handler handler, String str, boolean z) {
        super((DefaultConstructorMarker) null);
        C40944c cVar = null;
        this.f96713f = handler;
        this.f96714g = str;
        this.f96715h = z;
        this._immediate = z ? this : cVar;
        C40944c cVar2 = this._immediate;
        if (cVar2 == null) {
            cVar2 = new C40944c(handler, str, true);
            this._immediate = cVar2;
        }
        this.f96716i = cVar2;
    }

    /* renamed from: h0 */
    private final void m118728h0(C41752f fVar, Runnable runnable) {
        C40859r1.m118440c(fVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C40867u0.m118468b().mo95148h(fVar, runnable);
    }

    /* renamed from: e */
    public void mo95161e(long j, C40839n nVar) {
        C40945a aVar = new C40945a(nVar, this);
        if (this.f96713f.postDelayed(aVar, C43429k.m124589h(j, 4611686018427387903L))) {
            nVar.mo95186i(new C40946b(this, aVar));
        } else {
            m118728h0(nVar.mo94380b(), aVar);
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C40944c) && ((C40944c) obj).f96713f == this.f96713f;
    }

    /* renamed from: h */
    public void mo95148h(C41752f fVar, Runnable runnable) {
        if (!this.f96713f.post(runnable)) {
            m118728h0(fVar, runnable);
        }
    }

    public int hashCode() {
        return System.identityHashCode(this.f96713f);
    }

    /* renamed from: i */
    public boolean mo95149i(C41752f fVar) {
        return !this.f96715h || !C41536l.m120484d(Looper.myLooper(), this.f96713f.getLooper());
    }

    /* renamed from: m0 */
    public C40944c mo95277Q() {
        return this.f96716i;
    }

    public String toString() {
        String e0 = mo95278e0();
        if (e0 != null) {
            return e0;
        }
        String str = this.f96714g;
        if (str == null) {
            str = this.f96713f.toString();
        }
        if (!this.f96715h) {
            return str;
        }
        return str + ".immediate";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C40944c(Handler handler, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(handler, (i & 2) != 0 ? null : str);
    }

    public C40944c(Handler handler, String str) {
        this(handler, str, false);
    }
}
