package yf1;

import cf1.C40407d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import xf1.C43269c;
import xf1.C43286k;
import yf1.C43394l;

/* renamed from: yf1.h */
public class C43383h implements C43396m {

    /* renamed from: f */
    public static final C43384a f101225f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C43394l.C43395a f101226g;

    /* renamed from: a */
    private final Class f101227a;

    /* renamed from: b */
    private final Method f101228b;

    /* renamed from: c */
    private final Method f101229c;

    /* renamed from: d */
    private final Method f101230d;

    /* renamed from: e */
    private final Method f101231e;

    /* renamed from: yf1.h$a */
    public static final class C43384a {

        /* renamed from: yf1.h$a$a */
        public static final class C43385a implements C43394l.C43395a {

            /* renamed from: a */
            final /* synthetic */ String f101232a;

            C43385a(String str) {
                this.f101232a = str;
            }

            /* renamed from: b */
            public boolean mo102066b(SSLSocket sSLSocket) {
                C41536l.m120489i(sSLSocket, "sslSocket");
                String name = sSLSocket.getClass().getName();
                C41536l.m120488h(name, "sslSocket.javaClass.name");
                return C40439w.m117109H(name, C41536l.m120497q(this.f101232a, "."), false, 2, (Object) null);
            }

            /* renamed from: c */
            public C43396m mo102067c(SSLSocket sSLSocket) {
                C41536l.m120489i(sSLSocket, "sslSocket");
                return C43383h.f101225f.m124461b(sSLSocket.getClass());
            }
        }

        private C43384a() {
        }

        public /* synthetic */ C43384a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final C43383h m124461b(Class cls) {
            Class cls2 = cls;
            while (cls2 != null && !C41536l.m120484d(cls2.getSimpleName(), "OpenSSLSocketImpl")) {
                cls2 = cls2.getSuperclass();
                if (cls2 == null) {
                    throw new AssertionError(C41536l.m120497q("No OpenSSLSocketImpl superclass of socket of type ", cls));
                }
            }
            C41536l.m120486f(cls2);
            return new C43383h(cls2);
        }

        /* renamed from: c */
        public final C43394l.C43395a mo102064c(String str) {
            C41536l.m120489i(str, "packageName");
            return new C43385a(str);
        }

        /* renamed from: d */
        public final C43394l.C43395a mo102065d() {
            return C43383h.f101226g;
        }
    }

    static {
        C43384a aVar = new C43384a((DefaultConstructorMarker) null);
        f101225f = aVar;
        f101226g = aVar.mo102064c("com.google.android.gms.org.conscrypt");
    }

    public C43383h(Class cls) {
        C41536l.m120489i(cls, "sslSocketClass");
        this.f101227a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", new Class[]{Boolean.TYPE});
        C41536l.m120488h(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f101228b = declaredMethod;
        this.f101229c = cls.getMethod("setHostname", new Class[]{String.class});
        this.f101230d = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f101231e = cls.getMethod("setAlpnProtocols", new Class[]{byte[].class});
    }

    /* renamed from: a */
    public boolean mo102050a() {
        return C43269c.f101025f.mo101963b();
    }

    /* renamed from: b */
    public boolean mo102051b(SSLSocket sSLSocket) {
        C41536l.m120489i(sSLSocket, "sslSocket");
        return this.f101227a.isInstance(sSLSocket);
    }

    /* renamed from: c */
    public String mo102052c(SSLSocket sSLSocket) {
        C41536l.m120489i(sSLSocket, "sslSocket");
        if (!mo102051b(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f101230d.invoke(sSLSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            return new String(bArr, C40407d.f95989b);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if ((cause instanceof NullPointerException) && C41536l.m120484d(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e2);
        }
    }

    /* renamed from: d */
    public void mo102053d(SSLSocket sSLSocket, String str, List list) {
        C41536l.m120489i(sSLSocket, "sslSocket");
        C41536l.m120489i(list, "protocols");
        if (mo102051b(sSLSocket)) {
            try {
                this.f101228b.invoke(sSLSocket, new Object[]{Boolean.TRUE});
                if (str != null) {
                    this.f101229c.invoke(sSLSocket, new Object[]{str});
                }
                this.f101231e.invoke(sSLSocket, new Object[]{C43286k.f101052a.mo101987c(list)});
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }
}
