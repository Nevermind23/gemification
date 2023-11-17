package uf1;

import com.salesforce.marketingcloud.sfmcsdk.components.http.Request;
import kotlin.jvm.internal.C41536l;

/* renamed from: uf1.f */
public final class C43093f {

    /* renamed from: a */
    public static final C43093f f100524a = new C43093f();

    private C43093f() {
    }

    /* renamed from: a */
    public static final boolean m123647a(String str) {
        C41536l.m120489i(str, "method");
        if (C41536l.m120484d(str, "GET") || C41536l.m120484d(str, "HEAD")) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static final boolean m123648d(String str) {
        C41536l.m120489i(str, "method");
        if (C41536l.m120484d(str, "POST") || C41536l.m120484d(str, Request.PUT) || C41536l.m120484d(str, "PATCH") || C41536l.m120484d(str, "PROPPATCH") || C41536l.m120484d(str, "REPORT")) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo101661b(String str) {
        C41536l.m120489i(str, "method");
        return !C41536l.m120484d(str, "PROPFIND");
    }

    /* renamed from: c */
    public final boolean mo101662c(String str) {
        C41536l.m120489i(str, "method");
        return C41536l.m120484d(str, "PROPFIND");
    }
}
