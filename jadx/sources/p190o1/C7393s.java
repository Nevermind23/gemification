package p190o1;

import androidx.work.C1959e;
import java.util.Collections;
import java.util.List;
import p267u0.C8463e0;
import p267u0.C8478k;
import p267u0.C8503w;
import p318y0.C9008m;

/* renamed from: o1.s */
public final class C7393s implements C7392r {

    /* renamed from: a */
    private final C8503w f21620a;

    /* renamed from: b */
    private final C8478k f21621b;

    /* renamed from: c */
    private final C8463e0 f21622c;

    /* renamed from: d */
    private final C8463e0 f21623d;

    /* renamed from: o1.s$a */
    class C7394a extends C8478k {
        C7394a(C8503w wVar) {
            super(wVar);
        }

        /* renamed from: e */
        public String mo21745e() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        /* renamed from: l */
        public void mo21746i(C9008m mVar, C7391q qVar) {
            if (qVar.mo21780b() == null) {
                mVar.mo23624j1(1);
            } else {
                mVar.mo23623j(1, qVar.mo21780b());
            }
            byte[] l = C1959e.m7701l(qVar.mo21779a());
            if (l == null) {
                mVar.mo23624j1(2);
            } else {
                mVar.mo23618X0(2, l);
            }
        }
    }

    /* renamed from: o1.s$b */
    class C7395b extends C8463e0 {
        C7395b(C8503w wVar) {
            super(wVar);
        }

        /* renamed from: e */
        public String mo21745e() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* renamed from: o1.s$c */
    class C7396c extends C8463e0 {
        C7396c(C8503w wVar) {
            super(wVar);
        }

        /* renamed from: e */
        public String mo21745e() {
            return "DELETE FROM WorkProgress";
        }
    }

    public C7393s(C8503w wVar) {
        this.f21620a = wVar;
        this.f21621b = new C7394a(wVar);
        this.f21622c = new C7395b(wVar);
        this.f21623d = new C7396c(wVar);
    }

    /* renamed from: d */
    public static List m28139d() {
        return Collections.emptyList();
    }

    /* renamed from: a */
    public void mo21781a(String str) {
        this.f21620a.mo23806d();
        C9008m b = this.f21622c.mo23725b();
        if (str == null) {
            b.mo23624j1(1);
        } else {
            b.mo23623j(1, str);
        }
        this.f21620a.mo23807e();
        try {
            b.mo23676O();
            this.f21620a.mo23804F();
        } finally {
            this.f21620a.mo23809i();
            this.f21622c.mo23727h(b);
        }
    }

    /* renamed from: b */
    public void mo21782b() {
        this.f21620a.mo23806d();
        C9008m b = this.f21623d.mo23725b();
        this.f21620a.mo23807e();
        try {
            b.mo23676O();
            this.f21620a.mo23804F();
        } finally {
            this.f21620a.mo23809i();
            this.f21623d.mo23727h(b);
        }
    }

    /* renamed from: c */
    public void mo21783c(C7391q qVar) {
        this.f21620a.mo23806d();
        this.f21620a.mo23807e();
        try {
            this.f21621b.mo23748k(qVar);
            this.f21620a.mo23804F();
        } finally {
            this.f21620a.mo23809i();
        }
    }
}
