package p112i1;

import android.webkit.WebSettings;
import p125j1.C6636a;
import p125j1.C6649b0;
import p125j1.C6651c0;
import p125j1.C6654d0;
import p125j1.C6679x;

/* renamed from: i1.b */
public abstract class C6507b {
    /* renamed from: a */
    private static C6649b0 m25690a(WebSettings webSettings) {
        return C6654d0.m26074c().mo20671a(webSettings);
    }

    /* renamed from: b */
    public static void m25691b(WebSettings webSettings, boolean z) {
        if (C6651c0.f20166O.mo20666d()) {
            m25690a(webSettings).mo20667a(z);
            return;
        }
        throw C6651c0.m26067a();
    }

    /* renamed from: c */
    public static void m25692c(WebSettings webSettings, int i) {
        C6636a.C6644h hVar = C6651c0.f20170S;
        if (hVar.mo20665c()) {
            C6679x.m26113d(webSettings, i);
        } else if (hVar.mo20666d()) {
            m25690a(webSettings).mo20668b(i);
        } else {
            throw C6651c0.m26067a();
        }
    }
}
