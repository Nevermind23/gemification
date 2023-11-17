package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import of1.C41869b0;
import of1.C41880d0;
import of1.C41882e;
import of1.C41884e0;
import of1.C41888f;
import of1.C41931v;
import of1.C41937x;
import p147ka.C6851h;
import p173ma.C7152f;
import p199oa.C7506k;

public class FirebasePerfOkHttpClient {
    /* renamed from: a */
    static void m21462a(C41880d0 d0Var, C6851h hVar, long j, long j2) {
        C41869b0 e0 = d0Var.mo96742e0();
        if (e0 != null) {
            hVar.mo20920w(e0.mo96681j().mo96967v().toString());
            hVar.mo20910k(e0.mo96678g());
            if (e0.mo96672a() != null) {
                long a = e0.mo96672a().mo21298a();
                if (a != -1) {
                    hVar.mo20913p(a);
                }
            }
            C41884e0 a2 = d0Var.mo96739a();
            if (a2 != null) {
                long o = a2.mo21302o();
                if (o != -1) {
                    hVar.mo20916s(o);
                }
                C41937x q = a2.mo21303q();
                if (q != null) {
                    hVar.mo20915r(q.toString());
                }
            }
            hVar.mo20911l(d0Var.mo96747q());
            hVar.mo20914q(j);
            hVar.mo20918u(j2);
            hVar.mo20906b();
        }
    }

    @Keep
    public static void enqueue(C41882e eVar, C41888f fVar) {
        Timer timer = new Timer();
        C41888f fVar2 = fVar;
        eVar.mo96787f0(new C5417d(fVar2, C7506k.m28498k(), timer, timer.mo18043f()));
    }

    @Keep
    public static C41880d0 execute(C41882e eVar) {
        C6851h d = C6851h.m26596d(C7506k.m28498k());
        Timer timer = new Timer();
        long f = timer.mo18043f();
        try {
            C41880d0 v = eVar.mo96788v();
            m21462a(v, d, f, timer.mo18040d());
            return v;
        } catch (IOException e) {
            C41869b0 w = eVar.mo96789w();
            if (w != null) {
                C41931v j = w.mo96681j();
                if (j != null) {
                    d.mo20920w(j.mo96967v().toString());
                }
                if (w.mo96678g() != null) {
                    d.mo20910k(w.mo96678g());
                }
            }
            d.mo20914q(f);
            d.mo20918u(timer.mo18040d());
            C7152f.m27527d(d);
            throw e;
        }
    }
}
