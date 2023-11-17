package com.google.firebase.perf.network;

import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import of1.C41869b0;
import of1.C41880d0;
import of1.C41882e;
import of1.C41888f;
import of1.C41931v;
import p147ka.C6851h;
import p173ma.C7152f;
import p199oa.C7506k;

/* renamed from: com.google.firebase.perf.network.d */
public class C5417d implements C41888f {

    /* renamed from: a */
    private final C41888f f17271a;

    /* renamed from: b */
    private final C6851h f17272b;

    /* renamed from: c */
    private final Timer f17273c;

    /* renamed from: d */
    private final long f17274d;

    public C5417d(C41888f fVar, C7506k kVar, Timer timer, long j) {
        this.f17271a = fVar;
        this.f17272b = C6851h.m26596d(kVar);
        this.f17274d = j;
        this.f17273c = timer;
    }

    /* renamed from: a */
    public void mo7189a(C41882e eVar, IOException iOException) {
        C41869b0 w = eVar.mo96789w();
        if (w != null) {
            C41931v j = w.mo96681j();
            if (j != null) {
                this.f17272b.mo20920w(j.mo96967v().toString());
            }
            if (w.mo96678g() != null) {
                this.f17272b.mo20910k(w.mo96678g());
            }
        }
        this.f17272b.mo20914q(this.f17274d);
        this.f17272b.mo20918u(this.f17273c.mo18040d());
        C7152f.m27527d(this.f17272b);
        this.f17271a.mo7189a(eVar, iOException);
    }

    /* renamed from: b */
    public void mo7190b(C41882e eVar, C41880d0 d0Var) {
        C41880d0 d0Var2 = d0Var;
        FirebasePerfOkHttpClient.m21462a(d0Var2, this.f17272b, this.f17274d, this.f17273c.mo18040d());
        this.f17271a.mo7190b(eVar, d0Var);
    }
}
