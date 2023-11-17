package com.facetec.sdk;

import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: com.facetec.sdk.ma */
final class C3413ma extends C3422mg {

    /* renamed from: a */
    private final C3418mc<Socket> f11218a;

    /* renamed from: b */
    private final C3418mc<Socket> f11219b;

    /* renamed from: c */
    private final C3418mc<Socket> f11220c;

    /* renamed from: d */
    private final C3418mc<Socket> f11221d;

    /* renamed from: e */
    private final Class<?> f11222e;

    /* renamed from: g */
    private final C3415c f11223g = C3415c.m13586d();

    /* renamed from: com.facetec.sdk.ma$a */
    static final class C3414a extends C3430ml {

        /* renamed from: b */
        private final Object f11224b;

        /* renamed from: c */
        private final Method f11225c;

        C3414a(Object obj, Method method) {
            this.f11224b = obj;
            this.f11225c = method;
        }

        /* renamed from: c */
        public final List<Certificate> mo9806c(List<Certificate> list, String str) {
            try {
                return (List) this.f11225c.invoke(this.f11224b, new Object[]{(X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str});
            } catch (InvocationTargetException e) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
                sSLPeerUnverifiedException.initCause(e);
                throw sSLPeerUnverifiedException;
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        public final boolean equals(Object obj) {
            return obj instanceof C3414a;
        }

        public final int hashCode() {
            return 0;
        }
    }

    /* renamed from: com.facetec.sdk.ma$c */
    static final class C3415c {

        /* renamed from: c */
        private final Method f11226c;

        /* renamed from: d */
        private final Method f11227d;

        /* renamed from: e */
        private final Method f11228e;

        private C3415c(Method method, Method method2, Method method3) {
            this.f11227d = method;
            this.f11226c = method2;
            this.f11228e = method3;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final boolean mo9809d(Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                this.f11228e.invoke(obj, new Object[0]);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public final Object mo9810e(String str) {
            Method method = this.f11227d;
            if (method != null) {
                try {
                    Object invoke = method.invoke((Object) null, new Object[0]);
                    this.f11226c.invoke(invoke, new Object[]{str});
                    return invoke;
                } catch (Exception unused) {
                }
            }
            return null;
        }

        /* renamed from: d */
        static C3415c m13586d() {
            Method method;
            Method method2;
            Method method3;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                method2 = cls.getMethod("get", new Class[0]);
                method = cls.getMethod("open", new Class[]{String.class});
                method3 = cls.getMethod("warnIfOpen", new Class[0]);
            } catch (Exception unused) {
                method2 = null;
                method3 = null;
                method = null;
            }
            return new C3415c(method2, method, method3);
        }
    }

    /* renamed from: com.facetec.sdk.ma$e */
    static final class C3416e implements C3424mi {

        /* renamed from: b */
        private final X509TrustManager f11229b;

        /* renamed from: c */
        private final Method f11230c;

        C3416e(X509TrustManager x509TrustManager, Method method) {
            this.f11230c = method;
            this.f11229b = x509TrustManager;
        }

        /* renamed from: a */
        public final X509Certificate mo9811a(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.f11230c.invoke(this.f11229b, new Object[]{x509Certificate});
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
            } catch (IllegalAccessException e) {
                throw C3303ki.m13250b("unable to get issues and signature", (Exception) e);
            } catch (InvocationTargetException unused) {
            }
            return null;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C3416e)) {
                return false;
            }
            C3416e eVar = (C3416e) obj;
            if (!this.f11229b.equals(eVar.f11229b) || !this.f11230c.equals(eVar.f11230c)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return this.f11229b.hashCode() + (this.f11230c.hashCode() * 31);
        }
    }

    private C3413ma(Class<?> cls, C3418mc<Socket> mcVar, C3418mc<Socket> mcVar2, C3418mc<Socket> mcVar3, C3418mc<Socket> mcVar4) {
        this.f11222e = cls;
        this.f11220c = mcVar;
        this.f11218a = mcVar2;
        this.f11221d = mcVar3;
        this.f11219b = mcVar4;
    }

    /* renamed from: a */
    public final void mo9801a(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e) {
            if (C3303ki.m13260c(e)) {
                throw new IOException(e);
            }
            throw e;
        } catch (SecurityException e2) {
            IOException iOException = new IOException("Exception in connect");
            iOException.initCause(e2);
            throw iOException;
        } catch (ClassCastException e3) {
            if (Build.VERSION.SDK_INT == 26) {
                IOException iOException2 = new IOException("Exception in connect");
                iOException2.initCause(e3);
                throw iOException2;
            }
            throw e3;
        }
    }

    /* renamed from: b */
    public final String mo9781b(SSLSocket sSLSocket) {
        byte[] bArr;
        C3418mc<Socket> mcVar = this.f11221d;
        if (mcVar == null || !mcVar.mo9816c(sSLSocket) || (bArr = (byte[]) this.f11221d.mo9815a(sSLSocket, new Object[0])) == null) {
            return null;
        }
        return new String(bArr, C3303ki.f10843e);
    }

    /* renamed from: c */
    public final C3430ml mo9803c(X509TrustManager x509TrustManager) {
        Class<String> cls = String.class;
        try {
            Class<?> cls2 = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new C3414a(cls2.getConstructor(new Class[]{X509TrustManager.class}).newInstance(new Object[]{x509TrustManager}), cls2.getMethod("checkServerTrusted", new Class[]{X509Certificate[].class, cls, cls}));
        } catch (Exception unused) {
            return super.mo9803c(x509TrustManager);
        }
    }

    /* renamed from: d */
    public final void mo9782d(SSLSocket sSLSocket, String str, List<C3271jv> list) {
        if (str != null) {
            this.f11220c.mo9817e(sSLSocket, Boolean.TRUE);
            this.f11218a.mo9817e(sSLSocket, str);
        }
        C3418mc<Socket> mcVar = this.f11219b;
        if (mcVar != null && mcVar.mo9816c(sSLSocket)) {
            this.f11219b.mo9815a(sSLSocket, C3422mg.m13615d(list));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final X509TrustManager mo9784e(SSLSocketFactory sSLSocketFactory) {
        Object d = C3422mg.m13614d((Object) sSLSocketFactory, this.f11222e, "sslParameters");
        if (d == null) {
            try {
                d = C3422mg.m13614d((Object) sSLSocketFactory, Class.forName("com.google.android.gms.org.conscrypt.SSLParametersImpl", false, sSLSocketFactory.getClass().getClassLoader()), "sslParameters");
            } catch (ClassNotFoundException unused) {
                return super.mo9784e(sSLSocketFactory);
            }
        }
        Class cls = X509TrustManager.class;
        X509TrustManager x509TrustManager = (X509TrustManager) C3422mg.m13614d((Object) d, cls, "x509TrustManager");
        if (x509TrustManager != null) {
            return x509TrustManager;
        }
        return (X509TrustManager) C3422mg.m13614d((Object) d, cls, "trustManager");
    }

    /* renamed from: b */
    public final boolean mo9802b(String str) {
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return m13570a(str, cls, cls.getMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return super.mo9802b(str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            throw C3303ki.m13250b("unable to determine cleartext support", e);
        }
    }

    /* renamed from: d */
    public final void mo9804d(int i, String str, Throwable th) {
        int min;
        int i2 = 5;
        if (i != 5) {
            i2 = 3;
        }
        if (th != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(10);
            sb.append(Log.getStackTraceString(th));
            str = sb.toString();
        }
        int length = str.length();
        int i3 = 0;
        while (i3 < length) {
            int indexOf = str.indexOf(10, i3);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i3 + 4000);
                Log.println(i2, "OkHttp", str.substring(i3, min));
                if (min >= indexOf) {
                    break;
                }
                i3 = min;
            }
            i3 = min + 1;
        }
    }

    /* renamed from: e */
    private boolean m13573e(String str, Class<?> cls, Object obj) {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(obj, new Object[0])).booleanValue();
        } catch (NoSuchMethodException unused) {
            return super.mo9802b(str);
        }
    }

    /* renamed from: b */
    private static boolean m13571b() {
        if (Security.getProvider("GMSCore_OpenSSL") != null) {
            return true;
        }
        try {
            Class.forName("android.net.Network");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: e */
    public static C3422mg m13572e() {
        Class<?> cls;
        C3418mc mcVar;
        C3418mc mcVar2;
        Class<byte[]> cls2 = byte[].class;
        try {
            cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
        } catch (ClassNotFoundException unused) {
            try {
                cls = Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
            } catch (ClassNotFoundException unused2) {
                return null;
            }
        }
        Class<?> cls3 = cls;
        C3418mc mcVar3 = new C3418mc((Class<?>) null, "setUseSessionTickets", Boolean.TYPE);
        C3418mc mcVar4 = new C3418mc((Class<?>) null, "setHostname", String.class);
        if (m13571b()) {
            C3418mc mcVar5 = new C3418mc(cls2, "getAlpnSelectedProtocol", new Class[0]);
            mcVar = new C3418mc((Class<?>) null, "setAlpnProtocols", cls2);
            mcVar2 = mcVar5;
        } else {
            mcVar2 = null;
            mcVar = null;
        }
        return new C3413ma(cls3, mcVar3, mcVar4, mcVar2, mcVar);
    }

    /* renamed from: a */
    public final Object mo9798a(String str) {
        return this.f11223g.mo9810e(str);
    }

    /* renamed from: a */
    public final void mo9800a(String str, Object obj) {
        if (!this.f11223g.mo9809d(obj)) {
            mo9804d(5, str, (Throwable) null);
        }
    }

    /* renamed from: a */
    private boolean m13570a(String str, Class<?> cls, Object obj) {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[]{String.class}).invoke(obj, new Object[]{str})).booleanValue();
        } catch (NoSuchMethodException unused) {
            return m13573e(str, cls, obj);
        }
    }

    /* renamed from: a */
    public final SSLContext mo9799a() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    /* renamed from: e */
    public final C3424mi mo9805e(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            declaredMethod.setAccessible(true);
            return new C3416e(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.mo9805e(x509TrustManager);
        }
    }
}
