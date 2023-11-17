package xf1;

import com.salesforce.marketingcloud.messages.iam.C11651j;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: xf1.f */
public final class C43277f extends C43286k {

    /* renamed from: i */
    public static final C43279b f101038i = new C43279b((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final Method f101039d;

    /* renamed from: e */
    private final Method f101040e;

    /* renamed from: f */
    private final Method f101041f;

    /* renamed from: g */
    private final Class f101042g;

    /* renamed from: h */
    private final Class f101043h;

    /* renamed from: xf1.f$a */
    private static final class C43278a implements InvocationHandler {

        /* renamed from: a */
        private final List f101044a;

        /* renamed from: b */
        private boolean f101045b;

        /* renamed from: c */
        private String f101046c;

        public C43278a(List list) {
            C41536l.m120489i(list, "protocols");
            this.f101044a = list;
        }

        /* renamed from: a */
        public final String mo101976a() {
            return this.f101046c;
        }

        /* renamed from: b */
        public final boolean mo101977b() {
            return this.f101045b;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            boolean z;
            C41536l.m120489i(obj, "proxy");
            C41536l.m120489i(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (C41536l.m120484d(name, "supports") && C41536l.m120484d(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (!C41536l.m120484d(name, "unsupported") || !C41536l.m120484d(Void.TYPE, returnType)) {
                if (C41536l.m120484d(name, "protocols")) {
                    if (objArr.length == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        return this.f101044a;
                    }
                }
                if ((C41536l.m120484d(name, "selectProtocol") || C41536l.m120484d(name, "select")) && C41536l.m120484d(String.class, returnType) && objArr.length == 1) {
                    Object obj2 = objArr[0];
                    if (obj2 instanceof List) {
                        if (obj2 != null) {
                            List list = (List) obj2;
                            int size = list.size();
                            if (size >= 0) {
                                int i = 0;
                                while (true) {
                                    int i2 = i + 1;
                                    Object obj3 = list.get(i);
                                    if (obj3 != null) {
                                        String str = (String) obj3;
                                        if (this.f101044a.contains(str)) {
                                            this.f101046c = str;
                                            return str;
                                        } else if (i == size) {
                                            break;
                                        } else {
                                            i = i2;
                                        }
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                    }
                                }
                            }
                            String str2 = (String) this.f101044a.get(0);
                            this.f101046c = str2;
                            return str2;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
                    }
                }
                if ((!C41536l.m120484d(name, "protocolSelected") && !C41536l.m120484d(name, "selected")) || objArr.length != 1) {
                    return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
                }
                Object obj4 = objArr[0];
                if (obj4 != null) {
                    this.f101046c = (String) obj4;
                    return null;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            this.f101045b = true;
            return null;
        }
    }

    /* renamed from: xf1.f$b */
    public static final class C43279b {
        private C43279b() {
        }

        public /* synthetic */ C43279b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C43286k mo101979a() {
            Class<SSLSocket> cls = SSLSocket.class;
            String property = System.getProperty("java.specification.version", C11651j.f33767h);
            try {
                C41536l.m120488h(property, "jvmVersion");
                if (Integer.parseInt(property) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, (ClassLoader) null);
                Class<?> cls3 = Class.forName(C41536l.m120497q("org.eclipse.jetty.alpn.ALPN", "$Provider"), true, (ClassLoader) null);
                Class<?> cls4 = Class.forName(C41536l.m120497q("org.eclipse.jetty.alpn.ALPN", "$ClientProvider"), true, (ClassLoader) null);
                Class<?> cls5 = Class.forName(C41536l.m120497q("org.eclipse.jetty.alpn.ALPN", "$ServerProvider"), true, (ClassLoader) null);
                Method method = cls2.getMethod("put", new Class[]{cls, cls3});
                Method method2 = cls2.getMethod("get", new Class[]{cls});
                Method method3 = cls2.getMethod("remove", new Class[]{cls});
                C41536l.m120488h(method, "putMethod");
                C41536l.m120488h(method2, "getMethod");
                C41536l.m120488h(method3, "removeMethod");
                C41536l.m120488h(cls4, "clientProviderClass");
                C41536l.m120488h(cls5, "serverProviderClass");
                return new C43277f(method, method2, method3, cls4, cls5);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }
    }

    public C43277f(Method method, Method method2, Method method3, Class cls, Class cls2) {
        C41536l.m120489i(method, "putMethod");
        C41536l.m120489i(method2, "getMethod");
        C41536l.m120489i(method3, "removeMethod");
        C41536l.m120489i(cls, "clientProviderClass");
        C41536l.m120489i(cls2, "serverProviderClass");
        this.f101039d = method;
        this.f101040e = method2;
        this.f101041f = method3;
        this.f101042g = cls;
        this.f101043h = cls2;
    }

    /* renamed from: b */
    public void mo101975b(SSLSocket sSLSocket) {
        C41536l.m120489i(sSLSocket, "sslSocket");
        try {
            this.f101041f.invoke((Object) null, new Object[]{sSLSocket});
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to remove ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        }
    }

    /* renamed from: e */
    public void mo101953e(SSLSocket sSLSocket, String str, List list) {
        C41536l.m120489i(sSLSocket, "sslSocket");
        C41536l.m120489i(list, "protocols");
        List b = C43286k.f101052a.mo101986b(list);
        try {
            Object newProxyInstance = Proxy.newProxyInstance(C43286k.class.getClassLoader(), new Class[]{this.f101042g, this.f101043h}, new C43278a(b));
            this.f101039d.invoke((Object) null, new Object[]{sSLSocket, newProxyInstance});
        } catch (InvocationTargetException e) {
            throw new AssertionError("failed to set ALPN", e);
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        }
    }

    /* renamed from: g */
    public String mo101954g(SSLSocket sSLSocket) {
        C41536l.m120489i(sSLSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f101040e.invoke((Object) null, new Object[]{sSLSocket}));
            if (invocationHandler != null) {
                C43278a aVar = (C43278a) invocationHandler;
                if (!aVar.mo101977b() && aVar.mo101976a() == null) {
                    C43286k.m124296k(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, (Throwable) null, 6, (Object) null);
                    return null;
                } else if (aVar.mo101977b()) {
                    return null;
                } else {
                    return aVar.mo101976a();
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
        } catch (InvocationTargetException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }
}
