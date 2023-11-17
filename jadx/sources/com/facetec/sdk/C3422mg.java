package com.facetec.sdk;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: com.facetec.sdk.mg */
public class C3422mg {

    /* renamed from: d */
    private static final Logger f11245d = Logger.getLogger(C3268ju.class.getName());

    /* renamed from: e */
    private static final C3422mg f11246e;

    static {
        C3422mg e = C3413ma.m13572e();
        if (e == null && ((!m13611b() || (e = C3417mb.m13590d()) == null) && (e = C3400lz.m13547b()) == null && (e = C3398ly.m13543d()) == null)) {
            e = new C3422mg();
        }
        f11246e = e;
    }

    /* renamed from: c */
    public static C3422mg m13612c() {
        return f11246e;
    }

    /* renamed from: a */
    public void mo9780a(SSLSocket sSLSocket) {
    }

    /* renamed from: b */
    public String mo9781b(SSLSocket sSLSocket) {
        return null;
    }

    /* renamed from: d */
    public void mo9782d(SSLSocket sSLSocket, String str, List<C3271jv> list) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public X509TrustManager mo9784e(SSLSocketFactory sSLSocketFactory) {
        try {
            Object d = m13614d((Object) sSLSocketFactory, Class.forName("sun.security.ssl.SSLContextImpl"), "context");
            if (d == null) {
                return null;
            }
            return (X509TrustManager) m13614d((Object) d, X509TrustManager.class, "trustManager");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    /* renamed from: c */
    public static List<String> m13613c(List<C3271jv> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C3271jv jvVar = list.get(i);
            if (jvVar != C3271jv.HTTP_1_0) {
                arrayList.add(jvVar.toString());
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo9801a(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        socket.connect(inetSocketAddress, i);
    }

    /* renamed from: b */
    public boolean mo9802b(String str) {
        return true;
    }

    /* renamed from: d */
    public void mo9814d(SSLSocketFactory sSLSocketFactory) {
    }

    /* renamed from: b */
    private static boolean m13611b() {
        if ("conscrypt".equals(System.getProperty("okhttp.platform"))) {
            return true;
        }
        return "Conscrypt".equals(Security.getProviders()[0].getName());
    }

    /* renamed from: a */
    public Object mo9798a(String str) {
        if (f11245d.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    /* renamed from: d */
    public void mo9804d(int i, String str, Throwable th) {
        f11245d.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    /* renamed from: e */
    public C3424mi mo9805e(X509TrustManager x509TrustManager) {
        return new C3423mh(x509TrustManager.getAcceptedIssuers());
    }

    /* renamed from: d */
    static byte[] m13615d(List<C3271jv> list) {
        C3431mm mmVar = new C3431mm();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C3271jv jvVar = list.get(i);
            if (jvVar != C3271jv.HTTP_1_0) {
                mmVar.mo9870g(jvVar.toString().length());
                mmVar.mo9860e(jvVar.toString());
            }
        }
        return mmVar.mo9881k();
    }

    /* renamed from: a */
    public void mo9800a(String str, Object obj) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
            str = sb.toString();
        }
        mo9804d(5, str, (Throwable) obj);
    }

    /* renamed from: a */
    public final C3430ml mo9823a(SSLSocketFactory sSLSocketFactory) {
        X509TrustManager e = mo9784e(sSLSocketFactory);
        if (e != null) {
            return mo9803c(e);
        }
        StringBuilder sb = new StringBuilder("Unable to extract the trust manager on ");
        sb.append(m13612c());
        sb.append(", sslSocketFactory is ");
        sb.append(sSLSocketFactory.getClass());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: c */
    public C3430ml mo9803c(X509TrustManager x509TrustManager) {
        return new C3421mf(mo9805e(x509TrustManager));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        if (r6.equals("delegate") != false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
        r4 = m13614d(r4, r2, "delegate");
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> T m13614d(java.lang.Object r4, java.lang.Class<T> r5, java.lang.String r6) {
        /*
        L_0x0000:
            java.lang.Class r0 = r4.getClass()
        L_0x0004:
            r1 = 0
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            if (r0 == r2) goto L_0x002f
            java.lang.reflect.Field r2 = r0.getDeclaredField(r6)     // Catch:{ NoSuchFieldException -> 0x002a, IllegalAccessException -> 0x0024 }
            r3 = 1
            r2.setAccessible(r3)     // Catch:{ NoSuchFieldException -> 0x002a, IllegalAccessException -> 0x0024 }
            java.lang.Object r2 = r2.get(r4)     // Catch:{ NoSuchFieldException -> 0x002a, IllegalAccessException -> 0x0024 }
            if (r2 == 0) goto L_0x0023
            boolean r3 = r5.isInstance(r2)     // Catch:{ NoSuchFieldException -> 0x002a, IllegalAccessException -> 0x0024 }
            if (r3 != 0) goto L_0x001e
            goto L_0x0023
        L_0x001e:
            java.lang.Object r4 = r5.cast(r2)     // Catch:{ NoSuchFieldException -> 0x002a, IllegalAccessException -> 0x0024 }
            return r4
        L_0x0023:
            return r1
        L_0x0024:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>()
            throw r4
        L_0x002a:
            java.lang.Class r0 = r0.getSuperclass()
            goto L_0x0004
        L_0x002f:
            java.lang.String r0 = "delegate"
            boolean r3 = r6.equals(r0)
            if (r3 != 0) goto L_0x003e
            java.lang.Object r4 = m13614d((java.lang.Object) r4, r2, (java.lang.String) r0)
            if (r4 == 0) goto L_0x003e
            goto L_0x0000
        L_0x003e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3422mg.m13614d(java.lang.Object, java.lang.Class, java.lang.String):java.lang.Object");
    }

    /* renamed from: a */
    public SSLContext mo9799a() {
        if ("1.7".equals(System.getProperty("java.specification.version"))) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }
}
