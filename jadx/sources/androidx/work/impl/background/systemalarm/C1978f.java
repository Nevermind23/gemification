package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.C2073m;
import androidx.work.impl.C2060v;
import androidx.work.impl.background.systemalarm.C1979g;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p151l1.C6863c;
import p151l1.C6865e;
import p177n1.C7215o;
import p190o1.C7386m;
import p190o1.C7399v;
import p190o1.C7417y;
import p203p1.C7639e0;
import p203p1.C7662y;

/* renamed from: androidx.work.impl.background.systemalarm.f */
public class C1978f implements C6863c, C7639e0.C7640a {

    /* renamed from: p */
    private static final String f5984p = C2073m.m8073i("DelayMetCommandHandler");

    /* renamed from: d */
    private final Context f5985d;

    /* renamed from: e */
    private final int f5986e;

    /* renamed from: f */
    private final C7386m f5987f;

    /* renamed from: g */
    private final C1979g f5988g;

    /* renamed from: h */
    private final C6865e f5989h;

    /* renamed from: i */
    private final Object f5990i = new Object();

    /* renamed from: j */
    private int f5991j = 0;

    /* renamed from: k */
    private final Executor f5992k;

    /* renamed from: l */
    private final Executor f5993l;

    /* renamed from: m */
    private PowerManager.WakeLock f5994m;

    /* renamed from: n */
    private boolean f5995n = false;

    /* renamed from: o */
    private final C2060v f5996o;

    C1978f(Context context, int i, C1979g gVar, C2060v vVar) {
        this.f5985d = context;
        this.f5986e = i;
        this.f5988g = gVar;
        this.f5987f = vVar.mo6911a();
        this.f5996o = vVar;
        C7215o r = gVar.mo6791g().mo6827r();
        this.f5992k = gVar.mo6790f().mo22738b();
        this.f5993l = gVar.mo6790f().mo22737a();
        this.f5989h = new C6865e(r, (C6863c) this);
    }

    /* renamed from: e */
    private void m7797e() {
        synchronized (this.f5990i) {
            this.f5989h.mo20941a();
            this.f5988g.mo6792h().mo22348b(this.f5987f);
            PowerManager.WakeLock wakeLock = this.f5994m;
            if (wakeLock != null && wakeLock.isHeld()) {
                C2073m e = C2073m.m8071e();
                String str = f5984p;
                e.mo6959a(str, "Releasing wakelock " + this.f5994m + "for WorkSpec " + this.f5987f);
                this.f5994m.release();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m7798i() {
        if (this.f5991j == 0) {
            this.f5991j = 1;
            C2073m e = C2073m.m8071e();
            String str = f5984p;
            e.mo6959a(str, "onAllConstraintsMet for " + this.f5987f);
            if (this.f5988g.mo6789e().mo6874p(this.f5996o)) {
                this.f5988g.mo6792h().mo22347a(this.f5987f, 600000, this);
            } else {
                m7797e();
            }
        } else {
            C2073m e2 = C2073m.m8071e();
            String str2 = f5984p;
            e2.mo6959a(str2, "Already started work for " + this.f5987f);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m7799j() {
        String b = this.f5987f.mo21770b();
        if (this.f5991j < 2) {
            this.f5991j = 2;
            C2073m e = C2073m.m8071e();
            String str = f5984p;
            e.mo6959a(str, "Stopping work for WorkSpec " + b);
            this.f5993l.execute(new C1979g.C1981b(this.f5988g, C1974b.m7781f(this.f5985d, this.f5987f), this.f5986e));
            if (this.f5988g.mo6789e().mo6872k(this.f5987f.mo21770b())) {
                C2073m e2 = C2073m.m8071e();
                e2.mo6959a(str, "WorkSpec " + b + " needs to be rescheduled");
                this.f5993l.execute(new C1979g.C1981b(this.f5988g, C1974b.m7780e(this.f5985d, this.f5987f), this.f5986e));
                return;
            }
            C2073m e3 = C2073m.m8071e();
            e3.mo6959a(str, "Processor does not have WorkSpec " + b + ". No need to reschedule");
            return;
        }
        C2073m e4 = C2073m.m8071e();
        String str2 = f5984p;
        e4.mo6959a(str2, "Already stopped work for " + b);
    }

    /* renamed from: a */
    public void mo6782a(C7386m mVar) {
        C2073m e = C2073m.m8071e();
        String str = f5984p;
        e.mo6959a(str, "Exceeded time limits on execution for " + mVar);
        this.f5992k.execute(new C1976d(this));
    }

    /* renamed from: b */
    public void mo6783b(List list) {
        this.f5992k.execute(new C1976d(this));
    }

    /* renamed from: f */
    public void mo6784f(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (C7417y.m28225a((C7399v) it.next()).equals(this.f5987f)) {
                this.f5992k.execute(new C1977e(this));
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo6785g() {
        String b = this.f5987f.mo21770b();
        Context context = this.f5985d;
        this.f5994m = C7662y.m29106b(context, b + " (" + this.f5986e + ")");
        C2073m e = C2073m.m8071e();
        String str = f5984p;
        e.mo6959a(str, "Acquiring wakelock " + this.f5994m + "for WorkSpec " + b);
        this.f5994m.acquire();
        C7399v i = this.f5988g.mo6791g().mo6828s().mo6751N().mo21808i(b);
        if (i == null) {
            this.f5992k.execute(new C1976d(this));
            return;
        }
        boolean h = i.mo21790h();
        this.f5995n = h;
        if (!h) {
            C2073m e2 = C2073m.m8071e();
            e2.mo6959a(str, "No constraints for " + b);
            mo6784f(Collections.singletonList(i));
            return;
        }
        this.f5989h.mo20942b(Collections.singletonList(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo6786h(boolean z) {
        C2073m e = C2073m.m8071e();
        String str = f5984p;
        e.mo6959a(str, "onExecuted " + this.f5987f + ", " + z);
        m7797e();
        if (z) {
            this.f5993l.execute(new C1979g.C1981b(this.f5988g, C1974b.m7780e(this.f5985d, this.f5987f), this.f5986e));
        }
        if (this.f5995n) {
            this.f5993l.execute(new C1979g.C1981b(this.f5988g, C1974b.m7777a(this.f5985d), this.f5986e));
        }
    }
}
