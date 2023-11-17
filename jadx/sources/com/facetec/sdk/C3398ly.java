package com.facetec.sdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* renamed from: com.facetec.sdk.ly */
final class C3398ly extends C3422mg {

    /* renamed from: a */
    private final Method f11196a;

    /* renamed from: b */
    private final Class<?> f11197b;

    /* renamed from: c */
    private final Method f11198c;

    /* renamed from: d */
    private final Class<?> f11199d;

    /* renamed from: e */
    private final Method f11200e;

    /* renamed from: com.facetec.sdk.ly$a */
    static class C3399a implements InvocationHandler {

        /* renamed from: b */
        String f11201b;

        /* renamed from: c */
        private final List<String> f11202c;

        /* renamed from: e */
        boolean f11203e;

        C3399a(List<String> list) {
            this.f11202c = list;
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = C3303ki.f10841c;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f11203e = true;
                return null;
            } else if (name.equals("protocols") && objArr.length == 0) {
                return this.f11202c;
            } else {
                if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
                    Object obj2 = objArr[0];
                    if (obj2 instanceof List) {
                        List list = (List) obj2;
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            if (this.f11202c.contains(list.get(i))) {
                                String str = (String) list.get(i);
                                this.f11201b = str;
                                return str;
                            }
                        }
                        String str2 = this.f11202c.get(0);
                        this.f11201b = str2;
                        return str2;
                    }
                }
                if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                    return method.invoke(this, objArr);
                }
                this.f11201b = (String) objArr[0];
                return null;
            }
        }
    }

    private C3398ly(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f11196a = method;
        this.f11198c = method2;
        this.f11200e = method3;
        this.f11197b = cls;
        this.f11199d = cls2;
    }

    /* renamed from: a */
    public final void mo9780a(SSLSocket sSLSocket) {
        try {
            this.f11200e.invoke((Object) null, new Object[]{sSLSocket});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C3303ki.m13250b("unable to remove alpn", (Exception) e);
        }
    }

    /* renamed from: b */
    public final String mo9781b(SSLSocket sSLSocket) {
        try {
            C3399a aVar = (C3399a) Proxy.getInvocationHandler(this.f11198c.invoke((Object) null, new Object[]{sSLSocket}));
            boolean z = aVar.f11203e;
            if (!z && aVar.f11201b == null) {
                C3422mg.m13612c().mo9804d(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
                return null;
            } else if (z) {
                return null;
            } else {
                return aVar.f11201b;
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C3303ki.m13250b("unable to get selected protocol", (Exception) e);
        }
    }

    /* renamed from: d */
    public final void mo9782d(SSLSocket sSLSocket, String str, List<C3271jv> list) {
        List<String> c = C3422mg.m13613c(list);
        try {
            Object newProxyInstance = Proxy.newProxyInstance(C3422mg.class.getClassLoader(), new Class[]{this.f11197b, this.f11199d}, new C3399a(c));
            this.f11196a.invoke((Object) null, new Object[]{sSLSocket, newProxyInstance});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C3303ki.m13250b("unable to set alpn", (Exception) e);
        }
    }

    /* renamed from: d */
    public static C3422mg m13543d() {
        Class<SSLSocket> cls = SSLSocket.class;
        try {
            Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
            StringBuilder sb = new StringBuilder();
            sb.append("org.eclipse.jetty.alpn.ALPN");
            sb.append("$Provider");
            Class<?> cls3 = Class.forName(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("org.eclipse.jetty.alpn.ALPN");
            sb2.append("$ClientProvider");
            Class<?> cls4 = Class.forName(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("org.eclipse.jetty.alpn.ALPN");
            sb3.append("$ServerProvider");
            Class<?> cls5 = Class.forName(sb3.toString());
            Method method = cls2.getMethod("put", new Class[]{cls, cls3});
            return new C3398ly(method, cls2.getMethod("get", new Class[]{cls}), cls2.getMethod("remove", new Class[]{cls}), cls4, cls5);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        }
    }
}
