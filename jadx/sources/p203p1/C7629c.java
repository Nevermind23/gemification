package p203p1;

import androidx.work.C2079p;
import androidx.work.C2093w;
import androidx.work.impl.C2007e0;
import androidx.work.impl.C2039o;
import androidx.work.impl.C2045t;
import androidx.work.impl.C2046u;
import androidx.work.impl.WorkDatabase;
import java.util.LinkedList;
import java.util.UUID;
import p190o1.C7364b;
import p190o1.C7402w;

/* renamed from: p1.c */
public abstract class C7629c implements Runnable {

    /* renamed from: d */
    private final C2039o f22226d = new C2039o();

    /* renamed from: p1.c$a */
    class C7630a extends C7629c {

        /* renamed from: e */
        final /* synthetic */ C2007e0 f22227e;

        /* renamed from: f */
        final /* synthetic */ UUID f22228f;

        C7630a(C2007e0 e0Var, UUID uuid) {
            this.f22227e = e0Var;
            this.f22228f = uuid;
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo22339h() {
            WorkDatabase s = this.f22227e.mo6828s();
            s.mo23807e();
            try {
                mo22336a(this.f22227e, this.f22228f.toString());
                s.mo23804F();
                s.mo23809i();
                mo22338g(this.f22227e);
            } catch (Throwable th) {
                s.mo23809i();
                throw th;
            }
        }
    }

    /* renamed from: p1.c$b */
    class C7631b extends C7629c {

        /* renamed from: e */
        final /* synthetic */ C2007e0 f22229e;

        /* renamed from: f */
        final /* synthetic */ String f22230f;

        C7631b(C2007e0 e0Var, String str) {
            this.f22229e = e0Var;
            this.f22230f = str;
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo22339h() {
            WorkDatabase s = this.f22229e.mo6828s();
            s.mo23807e();
            try {
                for (String a : s.mo6751N().mo21810k(this.f22230f)) {
                    mo22336a(this.f22229e, a);
                }
                s.mo23804F();
                s.mo23809i();
                mo22338g(this.f22229e);
            } catch (Throwable th) {
                s.mo23809i();
                throw th;
            }
        }
    }

    /* renamed from: p1.c$c */
    class C7632c extends C7629c {

        /* renamed from: e */
        final /* synthetic */ C2007e0 f22231e;

        /* renamed from: f */
        final /* synthetic */ String f22232f;

        /* renamed from: g */
        final /* synthetic */ boolean f22233g;

        C7632c(C2007e0 e0Var, String str, boolean z) {
            this.f22231e = e0Var;
            this.f22232f = str;
            this.f22233g = z;
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo22339h() {
            WorkDatabase s = this.f22231e.mo6828s();
            s.mo23807e();
            try {
                for (String a : s.mo6751N().mo21806g(this.f22232f)) {
                    mo22336a(this.f22231e, a);
                }
                s.mo23804F();
                s.mo23809i();
                if (this.f22233g) {
                    mo22338g(this.f22231e);
                }
            } catch (Throwable th) {
                s.mo23809i();
                throw th;
            }
        }
    }

    /* renamed from: b */
    public static C7629c m29050b(UUID uuid, C2007e0 e0Var) {
        return new C7630a(e0Var, uuid);
    }

    /* renamed from: c */
    public static C7629c m29051c(String str, C2007e0 e0Var, boolean z) {
        return new C7632c(e0Var, str, z);
    }

    /* renamed from: d */
    public static C7629c m29052d(String str, C2007e0 e0Var) {
        return new C7631b(e0Var, str);
    }

    /* renamed from: f */
    private void m29053f(WorkDatabase workDatabase, String str) {
        C7402w N = workDatabase.mo6751N();
        C7364b I = workDatabase.mo6746I();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            C2093w h = N.mo21807h(str2);
            if (!(h == C2093w.SUCCEEDED || h == C2093w.FAILED)) {
                N.mo21817r(C2093w.CANCELLED, str2);
            }
            linkedList.addAll(I.mo21741a(str2));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo22336a(C2007e0 e0Var, String str) {
        m29053f(e0Var.mo6828s(), str);
        e0Var.mo6825p().mo6876r(str);
        for (C2045t c : e0Var.mo6826q()) {
            c.mo6804c(str);
        }
    }

    /* renamed from: e */
    public C2079p mo22337e() {
        return this.f22226d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo22338g(C2007e0 e0Var) {
        C2046u.m7981b(e0Var.mo6823l(), e0Var.mo6828s(), e0Var.mo6826q());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract void mo22339h();

    public void run() {
        try {
            mo22339h();
            this.f22226d.mo6866a(C2079p.f6230a);
        } catch (Throwable th) {
            this.f22226d.mo6866a(new C2079p.C2081b.C2082a(th));
        }
    }
}
