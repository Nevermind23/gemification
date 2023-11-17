package com.facetec.sdk;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: com.facetec.sdk.lz */
final class C3400lz extends C3422mg {

    /* renamed from: a */
    private Method f11204a;

    /* renamed from: e */
    private Method f11205e;

    private C3400lz(Method method, Method method2) {
        this.f11204a = method;
        this.f11205e = method2;
    }

    /* renamed from: b */
    public final String mo9781b(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f11205e.invoke(sSLSocket, new Object[0]);
            if (str == null || str.equals("")) {
                return null;
            }
            return str;
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C3303ki.m13250b("unable to get selected protocols", (Exception) e);
        }
    }

    /* renamed from: d */
    public final void mo9782d(SSLSocket sSLSocket, String str, List<C3271jv> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List<String> c = C3422mg.m13613c(list);
            this.f11204a.invoke(sSLParameters, new Object[]{c.toArray(new String[c.size()])});
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C3303ki.m13250b("unable to set ssl parameters", (Exception) e);
        }
    }

    /* renamed from: e */
    public final X509TrustManager mo9784e(SSLSocketFactory sSLSocketFactory) {
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on JDK 9+");
    }

    /* renamed from: b */
    public static C3400lz m13547b() {
        try {
            return new C3400lz(SSLParameters.class.getMethod("setApplicationProtocols", new Class[]{String[].class}), SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }
}
