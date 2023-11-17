package hb1;

import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p217q2.C7830c;
import p217q2.C7843j;
import p341ge.bog.sso_client.network.ApiException;
import p341ge.bog.sso_client.network.ConnectionFailedException;

/* renamed from: hb1.b */
public abstract class C36165b {
    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final void m107567c(C7843j jVar) {
        List c;
        C7830c cVar;
        Map map;
        Object obj;
        Number number;
        Integer num;
        Object obj2;
        String str;
        Object obj3;
        if (jVar.mo22786d() && (c = jVar.mo22785c()) != null && (cVar = (C7830c) c.get(0)) != null) {
            Object obj4 = cVar.mo22755a().get("extensions");
            String str2 = null;
            if (obj4 instanceof Map) {
                map = (Map) obj4;
            } else {
                map = null;
            }
            if (map != null) {
                obj = map.get("errorCode");
            } else {
                obj = null;
            }
            if (obj instanceof Number) {
                number = (Number) obj;
            } else {
                number = null;
            }
            if (number != null) {
                num = Integer.valueOf(number.intValue());
            } else {
                num = null;
            }
            if (map != null) {
                obj2 = map.get("errorMessage");
            } else {
                obj2 = null;
            }
            if (obj2 instanceof String) {
                str = (String) obj2;
            } else {
                str = null;
            }
            if (map != null) {
                obj3 = map.get("errorKey");
            } else {
                obj3 = null;
            }
            if (obj3 instanceof String) {
                str2 = (String) obj3;
            }
            throw new ApiException(num, str, str2, (String) null, 8, (DefaultConstructorMarker) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final void m107568d(Throwable th) {
        boolean z;
        Throwable cause = th.getCause();
        boolean z2 = true;
        if (cause instanceof UnknownHostException) {
            z = true;
        } else {
            z = cause instanceof ConnectException;
        }
        if (!z) {
            z2 = cause instanceof SocketTimeoutException;
        }
        if (z2) {
            throw new ConnectionFailedException(th.getMessage());
        }
        throw th;
    }
}
