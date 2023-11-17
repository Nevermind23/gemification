package com.facebook;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.net.HttpURLConnection;
import java.util.List;
import p297w4.C8769a0;
import p334z4.C9207a;

/* renamed from: com.facebook.f */
public class C2639f extends AsyncTask {

    /* renamed from: d */
    private static final String f8245d = "com.facebook.f";

    /* renamed from: a */
    private final HttpURLConnection f8246a;

    /* renamed from: b */
    private final C2640g f8247b;

    /* renamed from: c */
    private Exception f8248c;

    public C2639f(C2640g gVar) {
        this((HttpURLConnection) null, gVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public List mo8249a(Void... voidArr) {
        if (C9207a.m34024c(this)) {
            return null;
        }
        try {
            HttpURLConnection httpURLConnection = this.f8246a;
            if (httpURLConnection == null) {
                return this.f8247b.mo8265i();
            }
            return GraphRequest.m10041p(httpURLConnection, this.f8247b);
        } catch (Exception e) {
            this.f8248c = e;
            return null;
        } catch (Throwable th) {
            C9207a.m34023b(th, this);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo8250b(List list) {
        if (!C9207a.m34024c(this)) {
            try {
                super.onPostExecute(list);
                Exception exc = this.f8248c;
                if (exc != null) {
                    C8769a0.m32649V(f8245d, String.format("onPostExecute: exception encountered during request: %s", new Object[]{exc.getMessage()}));
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (C9207a.m34024c(this)) {
            return null;
        }
        try {
            return mo8249a((Void[]) objArr);
        } catch (Throwable th) {
            C9207a.m34023b(th, this);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        if (!C9207a.m34024c(this)) {
            try {
                mo8250b((List) obj);
            } catch (Throwable th) {
                C9207a.m34023b(th, this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onPreExecute() {
        Handler handler;
        if (!C9207a.m34024c(this)) {
            try {
                super.onPreExecute();
                if (C2626d.m10150u()) {
                    C8769a0.m32649V(f8245d, String.format("execute async task: %s", new Object[]{this}));
                }
                if (this.f8247b.mo8271r() == null) {
                    if (Thread.currentThread() instanceof HandlerThread) {
                        handler = new Handler();
                    } else {
                        handler = new Handler(Looper.getMainLooper());
                    }
                    this.f8247b.mo8257C(handler);
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, this);
            }
        }
    }

    public String toString() {
        return "{RequestAsyncTask: " + " connection: " + this.f8246a + ", requests: " + this.f8247b + "}";
    }

    public C2639f(HttpURLConnection httpURLConnection, C2640g gVar) {
        this.f8247b = gVar;
        this.f8246a = httpURLConnection;
    }
}
