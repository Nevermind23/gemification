package com.bumptech.glide.load.data;

import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.C2390g;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.data.C2415d;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import p089g4.C6210c;
import p089g4.C6218g;
import p166m3.C7079a;
import p244s3.C8175h;

/* renamed from: com.bumptech.glide.load.data.j */
public class C2425j implements C2415d {

    /* renamed from: j */
    static final C2427b f7658j = new C2426a();

    /* renamed from: d */
    private final C8175h f7659d;

    /* renamed from: e */
    private final int f7660e;

    /* renamed from: f */
    private final C2427b f7661f;

    /* renamed from: g */
    private HttpURLConnection f7662g;

    /* renamed from: h */
    private InputStream f7663h;

    /* renamed from: i */
    private volatile boolean f7664i;

    /* renamed from: com.bumptech.glide.load.data.j$a */
    private static class C2426a implements C2427b {
        C2426a() {
        }

        /* renamed from: a */
        public HttpURLConnection mo7811a(URL url) {
            return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        }
    }

    /* renamed from: com.bumptech.glide.load.data.j$b */
    interface C2427b {
        /* renamed from: a */
        HttpURLConnection mo7811a(URL url);
    }

    public C2425j(C8175h hVar, int i) {
        this(hVar, i, f7658j);
    }

    /* renamed from: c */
    private HttpURLConnection m9378c(URL url, Map map) {
        try {
            HttpURLConnection a = this.f7661f.mo7811a(url);
            for (Map.Entry entry : map.entrySet()) {
                a.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            a.setConnectTimeout(this.f7660e);
            a.setReadTimeout(this.f7660e);
            a.setUseCaches(false);
            a.setDoInput(true);
            a.setInstanceFollowRedirects(false);
            return a;
        } catch (IOException e) {
            throw new HttpException("URL.openConnection threw", 0, e);
        }
    }

    /* renamed from: f */
    private static int m9379f(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e);
            return -1;
        }
    }

    /* renamed from: g */
    private InputStream m9380g(HttpURLConnection httpURLConnection) {
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f7663h = C6210c.m24705c(httpURLConnection.getInputStream(), (long) httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
                }
                this.f7663h = httpURLConnection.getInputStream();
            }
            return this.f7663h;
        } catch (IOException e) {
            throw new HttpException("Failed to obtain InputStream", m9379f(httpURLConnection), e);
        }
    }

    /* renamed from: h */
    private static boolean m9381h(int i) {
        return i / 100 == 2;
    }

    /* renamed from: i */
    private static boolean m9382i(int i) {
        return i / 100 == 3;
    }

    /* renamed from: j */
    private InputStream m9383j(URL url, int i, URL url2, Map map) {
        if (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new HttpException("In re-direct loop", -1);
                    }
                } catch (URISyntaxException unused) {
                }
            }
            HttpURLConnection c = m9378c(url, map);
            this.f7662g = c;
            try {
                c.connect();
                this.f7663h = this.f7662g.getInputStream();
                if (this.f7664i) {
                    return null;
                }
                int f = m9379f(this.f7662g);
                if (m9381h(f)) {
                    return m9380g(this.f7662g);
                }
                if (m9382i(f)) {
                    String headerField = this.f7662g.getHeaderField("Location");
                    if (!TextUtils.isEmpty(headerField)) {
                        try {
                            URL url3 = new URL(url, headerField);
                            mo7786b();
                            return m9383j(url3, i + 1, url, map);
                        } catch (MalformedURLException e) {
                            throw new HttpException("Bad redirect url: " + headerField, f, e);
                        }
                    } else {
                        throw new HttpException("Received empty or null redirect url", f);
                    }
                } else if (f == -1) {
                    throw new HttpException(f);
                } else {
                    try {
                        throw new HttpException(this.f7662g.getResponseMessage(), f);
                    } catch (IOException e2) {
                        throw new HttpException("Failed to get a response message", f, e2);
                    }
                }
            } catch (IOException e3) {
                throw new HttpException("Failed to connect or obtain data", m9379f(this.f7662g), e3);
            }
        } else {
            throw new HttpException("Too many (> 5) redirects!", -1);
        }
    }

    /* renamed from: a */
    public Class mo7781a() {
        return InputStream.class;
    }

    /* renamed from: b */
    public void mo7786b() {
        InputStream inputStream = this.f7663h;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f7662g;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f7662g = null;
    }

    public void cancel() {
        this.f7664i = true;
    }

    /* renamed from: d */
    public C7079a mo7789d() {
        return C7079a.REMOTE;
    }

    /* renamed from: e */
    public void mo7790e(C2390g gVar, C2415d.C2416a aVar) {
        StringBuilder sb;
        long b = C6218g.m24714b();
        try {
            aVar.mo7798f(m9383j(this.f7659d.mo23368h(), 0, (URL) null, this.f7659d.mo23367e()));
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
                sb.append("Finished http url fetcher fetch in ");
                sb.append(C6218g.m24713a(b));
                Log.v("HttpUrlFetcher", sb.toString());
            }
        } catch (IOException e) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e);
            }
            aVar.mo7797c(e);
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + C6218g.m24713a(b));
            }
            throw th;
        }
    }

    C2425j(C8175h hVar, int i, C2427b bVar) {
        this.f7659d = hVar;
        this.f7660e = i;
        this.f7661f = bVar;
    }
}
