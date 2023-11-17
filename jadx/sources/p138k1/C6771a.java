package p138k1;

import androidx.work.C2073m;
import androidx.work.C2091u;
import java.util.HashMap;
import java.util.Map;
import p190o1.C7399v;

/* renamed from: k1.a */
public class C6771a {

    /* renamed from: d */
    static final String f20343d = C2073m.m8073i("DelayedWorkTracker");

    /* renamed from: a */
    final C6773b f20344a;

    /* renamed from: b */
    private final C2091u f20345b;

    /* renamed from: c */
    private final Map f20346c = new HashMap();

    /* renamed from: k1.a$a */
    class C6772a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C7399v f20347d;

        C6772a(C7399v vVar) {
            this.f20347d = vVar;
        }

        public void run() {
            C2073m e = C2073m.m8071e();
            String str = C6771a.f20343d;
            e.mo6959a(str, "Scheduling work " + this.f20347d.f21630a);
            C6771a.this.f20344a.mo6803a(this.f20347d);
        }
    }

    public C6771a(C6773b bVar, C2091u uVar) {
        this.f20344a = bVar;
        this.f20345b = uVar;
    }

    /* renamed from: a */
    public void mo20819a(C7399v vVar) {
        Runnable runnable = (Runnable) this.f20346c.remove(vVar.f21630a);
        if (runnable != null) {
            this.f20345b.mo6810a(runnable);
        }
        C6772a aVar = new C6772a(vVar);
        this.f20346c.put(vVar.f21630a, aVar);
        long currentTimeMillis = System.currentTimeMillis();
        this.f20345b.mo6811b(vVar.mo21785c() - currentTimeMillis, aVar);
    }

    /* renamed from: b */
    public void mo20820b(String str) {
        Runnable runnable = (Runnable) this.f20346c.remove(str);
        if (runnable != null) {
            this.f20345b.mo6810a(runnable);
        }
    }
}
