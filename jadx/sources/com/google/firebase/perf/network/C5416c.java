package com.google.firebase.perf.network;

import android.os.Build;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Permission;
import java.util.Map;
import p134ja.C6763a;
import p147ka.C6851h;
import p173ma.C7147a;
import p173ma.C7148b;
import p173ma.C7152f;

/* renamed from: com.google.firebase.perf.network.c */
class C5416c {

    /* renamed from: f */
    private static final C6763a f17265f = C6763a.m26371e();

    /* renamed from: a */
    private final HttpURLConnection f17266a;

    /* renamed from: b */
    private final C6851h f17267b;

    /* renamed from: c */
    private long f17268c = -1;

    /* renamed from: d */
    private long f17269d = -1;

    /* renamed from: e */
    private final Timer f17270e;

    public C5416c(HttpURLConnection httpURLConnection, Timer timer, C6851h hVar) {
        this.f17266a = httpURLConnection;
        this.f17267b = hVar;
        this.f17270e = timer;
        hVar.mo20920w(httpURLConnection.getURL().toString());
    }

    /* renamed from: a0 */
    private void m21466a0() {
        if (this.f17268c == -1) {
            this.f17270e.mo18044h();
            long f = this.f17270e.mo18043f();
            this.f17268c = f;
            this.f17267b.mo20914q(f);
        }
        String F = mo17946F();
        if (F != null) {
            this.f17267b.mo20910k(F);
        } else if (mo17984o()) {
            this.f17267b.mo20910k("POST");
        } else {
            this.f17267b.mo20910k("GET");
        }
    }

    /* renamed from: A */
    public boolean mo17941A() {
        return this.f17266a.getInstanceFollowRedirects();
    }

    /* renamed from: B */
    public long mo17942B() {
        m21466a0();
        return this.f17266a.getLastModified();
    }

    /* renamed from: C */
    public OutputStream mo17943C() {
        try {
            OutputStream outputStream = this.f17266a.getOutputStream();
            if (outputStream != null) {
                return new C7148b(outputStream, this.f17267b, this.f17270e);
            }
            return outputStream;
        } catch (IOException e) {
            this.f17267b.mo20918u(this.f17270e.mo18040d());
            C7152f.m27527d(this.f17267b);
            throw e;
        }
    }

    /* renamed from: D */
    public Permission mo17944D() {
        try {
            return this.f17266a.getPermission();
        } catch (IOException e) {
            this.f17267b.mo20918u(this.f17270e.mo18040d());
            C7152f.m27527d(this.f17267b);
            throw e;
        }
    }

    /* renamed from: E */
    public int mo17945E() {
        return this.f17266a.getReadTimeout();
    }

    /* renamed from: F */
    public String mo17946F() {
        return this.f17266a.getRequestMethod();
    }

    /* renamed from: G */
    public Map mo17947G() {
        return this.f17266a.getRequestProperties();
    }

    /* renamed from: H */
    public String mo17948H(String str) {
        return this.f17266a.getRequestProperty(str);
    }

    /* renamed from: I */
    public int mo17949I() {
        m21466a0();
        if (this.f17269d == -1) {
            long d = this.f17270e.mo18040d();
            this.f17269d = d;
            this.f17267b.mo20919v(d);
        }
        try {
            int responseCode = this.f17266a.getResponseCode();
            this.f17267b.mo20911l(responseCode);
            return responseCode;
        } catch (IOException e) {
            this.f17267b.mo20918u(this.f17270e.mo18040d());
            C7152f.m27527d(this.f17267b);
            throw e;
        }
    }

    /* renamed from: J */
    public String mo17950J() {
        m21466a0();
        if (this.f17269d == -1) {
            long d = this.f17270e.mo18040d();
            this.f17269d = d;
            this.f17267b.mo20919v(d);
        }
        try {
            String responseMessage = this.f17266a.getResponseMessage();
            this.f17267b.mo20911l(this.f17266a.getResponseCode());
            return responseMessage;
        } catch (IOException e) {
            this.f17267b.mo20918u(this.f17270e.mo18040d());
            C7152f.m27527d(this.f17267b);
            throw e;
        }
    }

    /* renamed from: K */
    public URL mo17951K() {
        return this.f17266a.getURL();
    }

    /* renamed from: L */
    public boolean mo17952L() {
        return this.f17266a.getUseCaches();
    }

    /* renamed from: M */
    public void mo17953M(boolean z) {
        this.f17266a.setAllowUserInteraction(z);
    }

    /* renamed from: N */
    public void mo17954N(int i) {
        this.f17266a.setChunkedStreamingMode(i);
    }

    /* renamed from: O */
    public void mo17955O(int i) {
        this.f17266a.setConnectTimeout(i);
    }

    /* renamed from: P */
    public void mo17956P(boolean z) {
        this.f17266a.setDefaultUseCaches(z);
    }

    /* renamed from: Q */
    public void mo17957Q(boolean z) {
        this.f17266a.setDoInput(z);
    }

    /* renamed from: R */
    public void mo17958R(boolean z) {
        this.f17266a.setDoOutput(z);
    }

    /* renamed from: S */
    public void mo17959S(int i) {
        this.f17266a.setFixedLengthStreamingMode(i);
    }

    /* renamed from: T */
    public void mo17960T(long j) {
        this.f17266a.setFixedLengthStreamingMode(j);
    }

    /* renamed from: U */
    public void mo17961U(long j) {
        this.f17266a.setIfModifiedSince(j);
    }

    /* renamed from: V */
    public void mo17962V(boolean z) {
        this.f17266a.setInstanceFollowRedirects(z);
    }

    /* renamed from: W */
    public void mo17963W(int i) {
        this.f17266a.setReadTimeout(i);
    }

    /* renamed from: X */
    public void mo17964X(String str) {
        this.f17266a.setRequestMethod(str);
    }

    /* renamed from: Y */
    public void mo17965Y(String str, String str2) {
        if ("User-Agent".equalsIgnoreCase(str)) {
            this.f17267b.mo20921x(str2);
        }
        this.f17266a.setRequestProperty(str, str2);
    }

    /* renamed from: Z */
    public void mo17966Z(boolean z) {
        this.f17266a.setUseCaches(z);
    }

    /* renamed from: a */
    public void mo17967a(String str, String str2) {
        this.f17266a.addRequestProperty(str, str2);
    }

    /* renamed from: b */
    public void mo17968b() {
        if (this.f17268c == -1) {
            this.f17270e.mo18044h();
            long f = this.f17270e.mo18043f();
            this.f17268c = f;
            this.f17267b.mo20914q(f);
        }
        try {
            this.f17266a.connect();
        } catch (IOException e) {
            this.f17267b.mo20918u(this.f17270e.mo18040d());
            C7152f.m27527d(this.f17267b);
            throw e;
        }
    }

    /* renamed from: b0 */
    public boolean mo17969b0() {
        return this.f17266a.usingProxy();
    }

    /* renamed from: c */
    public void mo17970c() {
        this.f17267b.mo20918u(this.f17270e.mo18040d());
        this.f17267b.mo20906b();
        this.f17266a.disconnect();
    }

    /* renamed from: d */
    public boolean mo17971d() {
        return this.f17266a.getAllowUserInteraction();
    }

    /* renamed from: e */
    public int mo17972e() {
        return this.f17266a.getConnectTimeout();
    }

    public boolean equals(Object obj) {
        return this.f17266a.equals(obj);
    }

    /* renamed from: f */
    public Object mo17974f() {
        m21466a0();
        this.f17267b.mo20911l(this.f17266a.getResponseCode());
        try {
            Object content = this.f17266a.getContent();
            if (content instanceof InputStream) {
                this.f17267b.mo20915r(this.f17266a.getContentType());
                return new C7147a((InputStream) content, this.f17267b, this.f17270e);
            }
            this.f17267b.mo20915r(this.f17266a.getContentType());
            this.f17267b.mo20916s((long) this.f17266a.getContentLength());
            this.f17267b.mo20918u(this.f17270e.mo18040d());
            this.f17267b.mo20906b();
            return content;
        } catch (IOException e) {
            this.f17267b.mo20918u(this.f17270e.mo18040d());
            C7152f.m27527d(this.f17267b);
            throw e;
        }
    }

    /* renamed from: g */
    public Object mo17975g(Class[] clsArr) {
        m21466a0();
        this.f17267b.mo20911l(this.f17266a.getResponseCode());
        try {
            Object content = this.f17266a.getContent(clsArr);
            if (content instanceof InputStream) {
                this.f17267b.mo20915r(this.f17266a.getContentType());
                return new C7147a((InputStream) content, this.f17267b, this.f17270e);
            }
            this.f17267b.mo20915r(this.f17266a.getContentType());
            this.f17267b.mo20916s((long) this.f17266a.getContentLength());
            this.f17267b.mo20918u(this.f17270e.mo18040d());
            this.f17267b.mo20906b();
            return content;
        } catch (IOException e) {
            this.f17267b.mo20918u(this.f17270e.mo18040d());
            C7152f.m27527d(this.f17267b);
            throw e;
        }
    }

    /* renamed from: h */
    public String mo17976h() {
        m21466a0();
        return this.f17266a.getContentEncoding();
    }

    public int hashCode() {
        return this.f17266a.hashCode();
    }

    /* renamed from: i */
    public int mo17978i() {
        m21466a0();
        return this.f17266a.getContentLength();
    }

    /* renamed from: j */
    public long mo17979j() {
        m21466a0();
        if (Build.VERSION.SDK_INT >= 24) {
            return this.f17266a.getContentLengthLong();
        }
        return 0;
    }

    /* renamed from: k */
    public String mo17980k() {
        m21466a0();
        return this.f17266a.getContentType();
    }

    /* renamed from: l */
    public long mo17981l() {
        m21466a0();
        return this.f17266a.getDate();
    }

    /* renamed from: m */
    public boolean mo17982m() {
        return this.f17266a.getDefaultUseCaches();
    }

    /* renamed from: n */
    public boolean mo17983n() {
        return this.f17266a.getDoInput();
    }

    /* renamed from: o */
    public boolean mo17984o() {
        return this.f17266a.getDoOutput();
    }

    /* renamed from: p */
    public InputStream mo17985p() {
        m21466a0();
        try {
            this.f17267b.mo20911l(this.f17266a.getResponseCode());
        } catch (IOException unused) {
            f17265f.mo20804a("IOException thrown trying to obtain the response code");
        }
        InputStream errorStream = this.f17266a.getErrorStream();
        if (errorStream != null) {
            return new C7147a(errorStream, this.f17267b, this.f17270e);
        }
        return errorStream;
    }

    /* renamed from: q */
    public long mo17986q() {
        m21466a0();
        return this.f17266a.getExpiration();
    }

    /* renamed from: r */
    public String mo17987r(int i) {
        m21466a0();
        return this.f17266a.getHeaderField(i);
    }

    /* renamed from: s */
    public String mo17988s(String str) {
        m21466a0();
        return this.f17266a.getHeaderField(str);
    }

    /* renamed from: t */
    public long mo17989t(String str, long j) {
        m21466a0();
        return this.f17266a.getHeaderFieldDate(str, j);
    }

    public String toString() {
        return this.f17266a.toString();
    }

    /* renamed from: u */
    public int mo17991u(String str, int i) {
        m21466a0();
        return this.f17266a.getHeaderFieldInt(str, i);
    }

    /* renamed from: v */
    public String mo17992v(int i) {
        m21466a0();
        return this.f17266a.getHeaderFieldKey(i);
    }

    /* renamed from: w */
    public long mo17993w(String str, long j) {
        m21466a0();
        if (Build.VERSION.SDK_INT >= 24) {
            return this.f17266a.getHeaderFieldLong(str, j);
        }
        return 0;
    }

    /* renamed from: x */
    public Map mo17994x() {
        m21466a0();
        return this.f17266a.getHeaderFields();
    }

    /* renamed from: y */
    public long mo17995y() {
        return this.f17266a.getIfModifiedSince();
    }

    /* renamed from: z */
    public InputStream mo17996z() {
        m21466a0();
        this.f17267b.mo20911l(this.f17266a.getResponseCode());
        this.f17267b.mo20915r(this.f17266a.getContentType());
        try {
            InputStream inputStream = this.f17266a.getInputStream();
            if (inputStream != null) {
                return new C7147a(inputStream, this.f17267b, this.f17270e);
            }
            return inputStream;
        } catch (IOException e) {
            this.f17267b.mo20918u(this.f17270e.mo18040d());
            C7152f.m27527d(this.f17267b);
            throw e;
        }
    }
}
