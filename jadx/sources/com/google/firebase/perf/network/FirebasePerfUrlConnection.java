package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import p147ka.C6851h;
import p173ma.C7152f;
import p199oa.C7506k;
import p212pa.C7796m;

public class FirebasePerfUrlConnection {
    /* renamed from: a */
    static Object m21463a(C7796m mVar, C7506k kVar, Timer timer) {
        timer.mo18044h();
        long f = timer.mo18043f();
        C6851h d = C6851h.m26596d(kVar);
        try {
            URLConnection a = mVar.mo22551a();
            if (a instanceof HttpsURLConnection) {
                return new C5415b((HttpsURLConnection) a, timer, d).getContent();
            }
            if (a instanceof HttpURLConnection) {
                return new C5414a((HttpURLConnection) a, timer, d).getContent();
            }
            return a.getContent();
        } catch (IOException e) {
            d.mo20914q(f);
            d.mo20918u(timer.mo18040d());
            d.mo20920w(mVar.toString());
            C7152f.m27527d(d);
            throw e;
        }
    }

    /* renamed from: b */
    static Object m21464b(C7796m mVar, Class[] clsArr, C7506k kVar, Timer timer) {
        timer.mo18044h();
        long f = timer.mo18043f();
        C6851h d = C6851h.m26596d(kVar);
        try {
            URLConnection a = mVar.mo22551a();
            if (a instanceof HttpsURLConnection) {
                return new C5415b((HttpsURLConnection) a, timer, d).getContent(clsArr);
            }
            if (a instanceof HttpURLConnection) {
                return new C5414a((HttpURLConnection) a, timer, d).getContent(clsArr);
            }
            return a.getContent(clsArr);
        } catch (IOException e) {
            d.mo20914q(f);
            d.mo20918u(timer.mo18040d());
            d.mo20920w(mVar.toString());
            C7152f.m27527d(d);
            throw e;
        }
    }

    /* renamed from: c */
    static InputStream m21465c(C7796m mVar, C7506k kVar, Timer timer) {
        timer.mo18044h();
        long f = timer.mo18043f();
        C6851h d = C6851h.m26596d(kVar);
        try {
            URLConnection a = mVar.mo22551a();
            if (a instanceof HttpsURLConnection) {
                return new C5415b((HttpsURLConnection) a, timer, d).getInputStream();
            }
            if (a instanceof HttpURLConnection) {
                return new C5414a((HttpURLConnection) a, timer, d).getInputStream();
            }
            return a.getInputStream();
        } catch (IOException e) {
            d.mo20914q(f);
            d.mo20918u(timer.mo18040d());
            d.mo20920w(mVar.toString());
            C7152f.m27527d(d);
            throw e;
        }
    }

    @Keep
    public static Object getContent(URL url) {
        return m21463a(new C7796m(url), C7506k.m28498k(), new Timer());
    }

    @Keep
    public static Object instrument(Object obj) {
        if (obj instanceof HttpsURLConnection) {
            return new C5415b((HttpsURLConnection) obj, new Timer(), C6851h.m26596d(C7506k.m28498k()));
        }
        if (obj instanceof HttpURLConnection) {
            return new C5414a((HttpURLConnection) obj, new Timer(), C6851h.m26596d(C7506k.m28498k()));
        }
        return obj;
    }

    @Keep
    public static InputStream openStream(URL url) {
        return m21465c(new C7796m(url), C7506k.m28498k(), new Timer());
    }

    @Keep
    public static Object getContent(URL url, Class[] clsArr) {
        return m21464b(new C7796m(url), clsArr, C7506k.m28498k(), new Timer());
    }
}
