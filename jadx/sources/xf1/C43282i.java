package xf1;

import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: xf1.i */
public class C43282i extends C43286k {

    /* renamed from: d */
    public static final C43283a f101047d = new C43283a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final boolean f101048e;

    /* renamed from: xf1.i$a */
    public static final class C43283a {
        private C43283a() {
        }

        public /* synthetic */ C43283a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C43282i mo101980a() {
            if (mo101981b()) {
                return new C43282i();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean mo101981b() {
            return C43282i.f101048e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001f, code lost:
        if (r1.intValue() >= 9) goto L_0x002d;
     */
    static {
        /*
            xf1.i$a r0 = new xf1.i$a
            r1 = 0
            r0.<init>(r1)
            f101047d = r0
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 != 0) goto L_0x0011
            goto L_0x0015
        L_0x0011:
            java.lang.Integer r1 = cf1.C40438v.m117098j(r0)
        L_0x0015:
            r0 = 1
            r2 = 0
            if (r1 == 0) goto L_0x0024
            int r1 = r1.intValue()
            r3 = 9
            if (r1 < r3) goto L_0x0022
            goto L_0x002d
        L_0x0022:
            r0 = r2
            goto L_0x002d
        L_0x0024:
            java.lang.Class<javax.net.ssl.SSLSocket> r1 = javax.net.ssl.SSLSocket.class
            java.lang.String r3 = "getApplicationProtocol"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0022 }
            r1.getMethod(r3, r4)     // Catch:{ NoSuchMethodException -> 0x0022 }
        L_0x002d:
            f101048e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xf1.C43282i.<clinit>():void");
    }

    /* renamed from: e */
    public void mo101953e(SSLSocket sSLSocket, String str, List list) {
        C41536l.m120489i(sSLSocket, "sslSocket");
        C41536l.m120489i(list, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        Object[] array = C43286k.f101052a.mo101986b(list).toArray(new String[0]);
        if (array != null) {
            sSLParameters.setApplicationProtocols((String[]) array);
            sSLSocket.setSSLParameters(sSLParameters);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    /* renamed from: g */
    public String mo101954g(SSLSocket sSLSocket) {
        boolean z;
        C41536l.m120489i(sSLSocket, "sslSocket");
        try {
            String a = sSLSocket.getApplicationProtocol();
            if (a == null) {
                z = true;
            } else {
                z = C41536l.m120484d(a, "");
            }
            if (z) {
                return null;
            }
            return a;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
