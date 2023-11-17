package com.facetec.sdk;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.facetec.sdk.lg */
public final class C3348lg implements C3272jw {

    /* renamed from: a */
    private final boolean f10988a;

    /* renamed from: b */
    private final C3268ju f10989b;

    /* renamed from: c */
    public volatile C3325kw f10990c;

    /* renamed from: d */
    public volatile boolean f10991d;

    /* renamed from: e */
    public Object f10992e;

    public C3348lg(C3268ju juVar, boolean z) {
        this.f10989b = juVar;
        this.f10988a = z;
    }

    /* renamed from: a */
    private C3237jd m13374a(C3274jx jxVar) {
        C3244jh jhVar;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        if (jxVar.mo9544c()) {
            sSLSocketFactory = this.f10989b.mo9515i();
            hostnameVerifier = this.f10989b.mo9514h();
            jhVar = this.f10989b.mo9513g();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            jhVar = null;
        }
        return new C3237jd(jxVar.mo9551h(), jxVar.mo9550g(), this.f10989b.mo9510d(), this.f10989b.mo9511e(), sSLSocketFactory, hostnameVerifier, jhVar, this.f10989b.mo9516j(), this.f10989b.mo9508b(), this.f10989b.mo9519m(), this.f10989b.mo9522r(), this.f10989b.mo9509c());
    }

    /* renamed from: c */
    private static boolean m13376c(C3295kc kcVar, C3274jx jxVar) {
        C3274jx a = kcVar.mo9609d().mo9588a();
        if (!a.mo9551h().equals(jxVar.mo9551h()) || a.mo9550g() != jxVar.mo9550g() || !a.mo9547e().equals(jxVar.mo9547e())) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final boolean mo9703d() {
        return this.f10991d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0114, code lost:
        if (r4.equals("HEAD") == false) goto L_0x01ab;
     */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x01ae A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0134 A[Catch:{ IOException -> 0x023b }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0139 A[Catch:{ IOException -> 0x023b }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0168 A[Catch:{ IOException -> 0x023b }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x019c A[Catch:{ IOException -> 0x023b }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01b2  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.facetec.sdk.C3295kc mo9536e(com.facetec.sdk.C3272jw.C3273a r15) {
        /*
            r14 = this;
            com.facetec.sdk.kb r0 = r15.mo9537a()
            com.facetec.sdk.la r15 = (com.facetec.sdk.C3341la) r15
            com.facetec.sdk.ji r7 = r15.mo9692f()
            com.facetec.sdk.jt r8 = r15.mo9693i()
            com.facetec.sdk.kw r9 = new com.facetec.sdk.kw
            com.facetec.sdk.ju r1 = r14.f10989b
            com.facetec.sdk.jk r2 = r1.mo9512f()
            com.facetec.sdk.jx r1 = r0.mo9588a()
            com.facetec.sdk.jd r3 = r14.m13374a(r1)
            java.lang.Object r6 = r14.f10992e
            r1 = r9
            r4 = r7
            r5 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r14.f10990c = r9
            r10 = 0
            r11 = 0
            r2 = r10
            r1 = r11
        L_0x002c:
            boolean r3 = r14.f10991d
            if (r3 != 0) goto L_0x0268
            com.facetec.sdk.kc r0 = r15.mo9690b(r0, r9, r11, r11)     // Catch:{ kt -> 0x0253, IOException -> 0x0242 }
            if (r1 == 0) goto L_0x0059
            com.facetec.sdk.kc$d r0 = r0.mo9612f()
            com.facetec.sdk.kc$d r1 = r1.mo9612f()
            com.facetec.sdk.kc$d r1 = r1.mo9625d((com.facetec.sdk.C3291ka) r11)
            com.facetec.sdk.kc r1 = r1.mo9621a()
            com.facetec.sdk.ka r3 = r1.f10802g
            if (r3 != 0) goto L_0x0051
            r0.f10818j = r1
            com.facetec.sdk.kc r0 = r0.mo9621a()
            goto L_0x0059
        L_0x0051:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "priorResponse.body != null"
            r15.<init>(r0)
            throw r15
        L_0x0059:
            com.facetec.sdk.kh r1 = r9.f10938e     // Catch:{ IOException -> 0x023b }
            if (r0 == 0) goto L_0x0235
            int r3 = r0.mo9606b()     // Catch:{ IOException -> 0x023b }
            com.facetec.sdk.kb r4 = r0.mo9609d()     // Catch:{ IOException -> 0x023b }
            java.lang.String r4 = r4.mo9589b()     // Catch:{ IOException -> 0x023b }
            r5 = 307(0x133, float:4.3E-43)
            java.lang.String r6 = "GET"
            if (r3 == r5) goto L_0x0108
            r5 = 308(0x134, float:4.32E-43)
            if (r3 == r5) goto L_0x0108
            r5 = 401(0x191, float:5.62E-43)
            if (r3 == r5) goto L_0x00fd
            r5 = 503(0x1f7, float:7.05E-43)
            if (r3 == r5) goto L_0x00df
            r5 = 407(0x197, float:5.7E-43)
            if (r3 == r5) goto L_0x00b7
            r1 = 408(0x198, float:5.72E-43)
            if (r3 == r1) goto L_0x0088
            switch(r3) {
                case 300: goto L_0x0116;
                case 301: goto L_0x0116;
                case 302: goto L_0x0116;
                case 303: goto L_0x0116;
                default: goto L_0x0086;
            }
        L_0x0086:
            goto L_0x01ab
        L_0x0088:
            com.facetec.sdk.ju r3 = r14.f10989b     // Catch:{ IOException -> 0x023b }
            boolean r3 = r3.mo9521o()     // Catch:{ IOException -> 0x023b }
            if (r3 == 0) goto L_0x01ab
            com.facetec.sdk.kb r3 = r0.mo9609d()     // Catch:{ IOException -> 0x023b }
            com.facetec.sdk.kd r3 = r3.mo9592d()     // Catch:{ IOException -> 0x023b }
            boolean r3 = r3 instanceof com.facetec.sdk.C3349lh     // Catch:{ IOException -> 0x023b }
            if (r3 != 0) goto L_0x01ab
            com.facetec.sdk.kc r3 = r0.mo9614h()     // Catch:{ IOException -> 0x023b }
            if (r3 == 0) goto L_0x00ac
            com.facetec.sdk.kc r3 = r0.mo9614h()     // Catch:{ IOException -> 0x023b }
            int r3 = r3.mo9606b()     // Catch:{ IOException -> 0x023b }
            if (r3 == r1) goto L_0x01ab
        L_0x00ac:
            int r1 = m13373a(r0, r10)     // Catch:{ IOException -> 0x023b }
            if (r1 > 0) goto L_0x01ab
            com.facetec.sdk.kb r1 = r0.mo9609d()     // Catch:{ IOException -> 0x023b }
            goto L_0x0105
        L_0x00b7:
            if (r1 == 0) goto L_0x00be
            java.net.Proxy r1 = r1.mo9634d()     // Catch:{ IOException -> 0x023b }
            goto L_0x00c4
        L_0x00be:
            com.facetec.sdk.ju r1 = r14.f10989b     // Catch:{ IOException -> 0x023b }
            java.net.Proxy r1 = r1.mo9508b()     // Catch:{ IOException -> 0x023b }
        L_0x00c4:
            java.net.Proxy$Type r1 = r1.type()     // Catch:{ IOException -> 0x023b }
            java.net.Proxy$Type r3 = java.net.Proxy.Type.HTTP     // Catch:{ IOException -> 0x023b }
            if (r1 != r3) goto L_0x00d7
            com.facetec.sdk.ju r1 = r14.f10989b     // Catch:{ IOException -> 0x023b }
            com.facetec.sdk.je r1 = r1.mo9516j()     // Catch:{ IOException -> 0x023b }
            com.facetec.sdk.kb r1 = r1.mo9439b()     // Catch:{ IOException -> 0x023b }
            goto L_0x0105
        L_0x00d7:
            java.net.ProtocolException r15 = new java.net.ProtocolException     // Catch:{ IOException -> 0x023b }
            java.lang.String r0 = "Received HTTP_PROXY_AUTH (407) code while not using proxy"
            r15.<init>(r0)     // Catch:{ IOException -> 0x023b }
            throw r15     // Catch:{ IOException -> 0x023b }
        L_0x00df:
            com.facetec.sdk.kc r1 = r0.mo9614h()     // Catch:{ IOException -> 0x023b }
            if (r1 == 0) goto L_0x00ef
            com.facetec.sdk.kc r1 = r0.mo9614h()     // Catch:{ IOException -> 0x023b }
            int r1 = r1.mo9606b()     // Catch:{ IOException -> 0x023b }
            if (r1 == r5) goto L_0x01ab
        L_0x00ef:
            r1 = 2147483647(0x7fffffff, float:NaN)
            int r1 = m13373a(r0, r1)     // Catch:{ IOException -> 0x023b }
            if (r1 != 0) goto L_0x01ab
            com.facetec.sdk.kb r1 = r0.mo9609d()     // Catch:{ IOException -> 0x023b }
            goto L_0x0105
        L_0x00fd:
            com.facetec.sdk.ju r1 = r14.f10989b     // Catch:{ IOException -> 0x023b }
            com.facetec.sdk.je r1 = r1.f10677j     // Catch:{ IOException -> 0x023b }
            com.facetec.sdk.kb r1 = r1.mo9439b()     // Catch:{ IOException -> 0x023b }
        L_0x0105:
            r12 = r1
            goto L_0x01ac
        L_0x0108:
            boolean r1 = r4.equals(r6)     // Catch:{ IOException -> 0x023b }
            if (r1 != 0) goto L_0x0116
            java.lang.String r1 = "HEAD"
            boolean r1 = r4.equals(r1)     // Catch:{ IOException -> 0x023b }
            if (r1 == 0) goto L_0x01ab
        L_0x0116:
            com.facetec.sdk.ju r1 = r14.f10989b     // Catch:{ IOException -> 0x023b }
            boolean r1 = r1.mo9517k()     // Catch:{ IOException -> 0x023b }
            if (r1 == 0) goto L_0x01ab
            java.lang.String r1 = "Location"
            java.lang.String r1 = r0.mo9611e(r1)     // Catch:{ IOException -> 0x023b }
            if (r1 == 0) goto L_0x01ab
            com.facetec.sdk.kb r3 = r0.mo9609d()     // Catch:{ IOException -> 0x023b }
            com.facetec.sdk.jx r3 = r3.mo9588a()     // Catch:{ IOException -> 0x023b }
            com.facetec.sdk.jx$c r1 = r3.mo9545d(r1)     // Catch:{ IOException -> 0x023b }
            if (r1 == 0) goto L_0x0139
            com.facetec.sdk.jx r1 = r1.mo9556a()     // Catch:{ IOException -> 0x023b }
            goto L_0x013a
        L_0x0139:
            r1 = r11
        L_0x013a:
            if (r1 == 0) goto L_0x01ab
            java.lang.String r3 = r1.mo9547e()     // Catch:{ IOException -> 0x023b }
            com.facetec.sdk.kb r5 = r0.mo9609d()     // Catch:{ IOException -> 0x023b }
            com.facetec.sdk.jx r5 = r5.mo9588a()     // Catch:{ IOException -> 0x023b }
            java.lang.String r5 = r5.mo9547e()     // Catch:{ IOException -> 0x023b }
            boolean r3 = r3.equals(r5)     // Catch:{ IOException -> 0x023b }
            if (r3 != 0) goto L_0x015a
            com.facetec.sdk.ju r3 = r14.f10989b     // Catch:{ IOException -> 0x023b }
            boolean r3 = r3.mo9520n()     // Catch:{ IOException -> 0x023b }
            if (r3 == 0) goto L_0x01ab
        L_0x015a:
            com.facetec.sdk.kb r3 = r0.mo9609d()     // Catch:{ IOException -> 0x023b }
            com.facetec.sdk.kb$e r3 = r3.mo9593e()     // Catch:{ IOException -> 0x023b }
            boolean r5 = com.facetec.sdk.C3329kz.m13343d(r4)     // Catch:{ IOException -> 0x023b }
            if (r5 == 0) goto L_0x0196
            boolean r5 = com.facetec.sdk.C3329kz.m13340a(r4)     // Catch:{ IOException -> 0x023b }
            boolean r12 = com.facetec.sdk.C3329kz.m13342c(r4)     // Catch:{ IOException -> 0x023b }
            if (r12 == 0) goto L_0x0176
            r3.mo9601c(r6, r11)     // Catch:{ IOException -> 0x023b }
            goto L_0x0185
        L_0x0176:
            if (r5 == 0) goto L_0x0181
            com.facetec.sdk.kb r6 = r0.mo9609d()     // Catch:{ IOException -> 0x023b }
            com.facetec.sdk.kd r6 = r6.mo9592d()     // Catch:{ IOException -> 0x023b }
            goto L_0x0182
        L_0x0181:
            r6 = r11
        L_0x0182:
            r3.mo9601c(r4, r6)     // Catch:{ IOException -> 0x023b }
        L_0x0185:
            if (r5 != 0) goto L_0x0196
            java.lang.String r4 = "Transfer-Encoding"
            r3.mo9600c(r4)     // Catch:{ IOException -> 0x023b }
            java.lang.String r4 = "Content-Length"
            r3.mo9600c(r4)     // Catch:{ IOException -> 0x023b }
            java.lang.String r4 = "Content-Type"
            r3.mo9600c(r4)     // Catch:{ IOException -> 0x023b }
        L_0x0196:
            boolean r4 = m13376c(r0, r1)     // Catch:{ IOException -> 0x023b }
            if (r4 != 0) goto L_0x01a1
            java.lang.String r4 = "Authorization"
            r3.mo9600c(r4)     // Catch:{ IOException -> 0x023b }
        L_0x01a1:
            com.facetec.sdk.kb$e r1 = r3.mo9603e((com.facetec.sdk.C3274jx) r1)     // Catch:{ IOException -> 0x023b }
            com.facetec.sdk.kb r1 = r1.mo9599b()     // Catch:{ IOException -> 0x023b }
            goto L_0x0105
        L_0x01ab:
            r12 = r11
        L_0x01ac:
            if (r12 != 0) goto L_0x01b2
            r9.mo9673b()
            return r0
        L_0x01b2:
            com.facetec.sdk.ka r1 = r0.mo9607c()
            com.facetec.sdk.C3303ki.m13255b((java.io.Closeable) r1)
            int r13 = r2 + 1
            r1 = 20
            if (r13 > r1) goto L_0x0222
            com.facetec.sdk.kd r1 = r12.mo9592d()
            boolean r1 = r1 instanceof com.facetec.sdk.C3349lh
            if (r1 != 0) goto L_0x0213
            com.facetec.sdk.jx r1 = r12.mo9588a()
            boolean r1 = m13376c(r0, r1)
            if (r1 != 0) goto L_0x01ef
            r9.mo9673b()
            com.facetec.sdk.kw r9 = new com.facetec.sdk.kw
            com.facetec.sdk.ju r1 = r14.f10989b
            com.facetec.sdk.jk r2 = r1.mo9512f()
            com.facetec.sdk.jx r1 = r12.mo9588a()
            com.facetec.sdk.jd r3 = r14.m13374a(r1)
            java.lang.Object r6 = r14.f10992e
            r1 = r9
            r4 = r7
            r5 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r14.f10990c = r9
            goto L_0x01f5
        L_0x01ef:
            com.facetec.sdk.lc r1 = r9.mo9672a()
            if (r1 != 0) goto L_0x01fa
        L_0x01f5:
            r1 = r0
            r0 = r12
            r2 = r13
            goto L_0x002c
        L_0x01fa:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Closing the body of "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = " didn't close its backing stream. Bad interceptor?"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r15.<init>(r0)
            throw r15
        L_0x0213:
            r9.mo9673b()
            java.net.HttpRetryException r15 = new java.net.HttpRetryException
            java.lang.String r1 = "Cannot retry streamed HTTP body"
            int r0 = r0.mo9606b()
            r15.<init>(r1, r0)
            throw r15
        L_0x0222:
            r9.mo9673b()
            java.net.ProtocolException r15 = new java.net.ProtocolException
            java.lang.String r0 = "Too many follow-up requests: "
            java.lang.String r1 = java.lang.String.valueOf(r13)
            java.lang.String r0 = r0.concat(r1)
            r15.<init>(r0)
            throw r15
        L_0x0235:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x023b }
            r15.<init>()     // Catch:{ IOException -> 0x023b }
            throw r15     // Catch:{ IOException -> 0x023b }
        L_0x023b:
            r15 = move-exception
            r9.mo9673b()
            throw r15
        L_0x0240:
            r15 = move-exception
            goto L_0x0261
        L_0x0242:
            r3 = move-exception
            boolean r4 = r3 instanceof com.facetec.sdk.C3350li     // Catch:{ all -> 0x0240 }
            if (r4 != 0) goto L_0x0249
            r4 = 1
            goto L_0x024a
        L_0x0249:
            r4 = r10
        L_0x024a:
            boolean r4 = r14.m13375a(r3, r9, r4, r0)     // Catch:{ all -> 0x0240 }
            if (r4 == 0) goto L_0x0252
            goto L_0x002c
        L_0x0252:
            throw r3     // Catch:{ all -> 0x0240 }
        L_0x0253:
            r3 = move-exception
            java.io.IOException r4 = r3.f10920e     // Catch:{ all -> 0x0240 }
            boolean r4 = r14.m13375a(r4, r9, r10, r0)     // Catch:{ all -> 0x0240 }
            if (r4 == 0) goto L_0x025e
            goto L_0x002c
        L_0x025e:
            java.io.IOException r15 = r3.f10919d     // Catch:{ all -> 0x0240 }
            throw r15     // Catch:{ all -> 0x0240 }
        L_0x0261:
            r9.mo9681e(r11)
            r9.mo9673b()
            throw r15
        L_0x0268:
            r9.mo9673b()
            java.io.IOException r15 = new java.io.IOException
            java.lang.String r0 = "Canceled"
            r15.<init>(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3348lg.mo9536e(com.facetec.sdk.jw$a):com.facetec.sdk.kc");
    }

    /* renamed from: d */
    private static boolean m13377d(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || z) {
                return false;
            }
            return true;
        } else if ((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    private boolean m13375a(IOException iOException, C3325kw kwVar, boolean z, C3293kb kbVar) {
        kwVar.mo9681e(iOException);
        if (!this.f10989b.mo9521o()) {
            return false;
        }
        if ((!z || !(kbVar.mo9592d() instanceof C3349lh)) && m13377d(iOException, z) && kwVar.mo9676c()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static int m13373a(C3295kc kcVar, int i) {
        String e = kcVar.mo9611e("Retry-After");
        if (e == null) {
            return i;
        }
        if (e.matches("\\d+")) {
            return Integer.valueOf(e).intValue();
        }
        return Integer.MAX_VALUE;
    }
}
