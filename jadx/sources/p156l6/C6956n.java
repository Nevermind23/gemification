package p156l6;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import p337z7.C9227g;

/* renamed from: l6.n */
public abstract class C6956n {
    /* renamed from: a */
    public static void m26961a(Status status, Object obj, C9227g gVar) {
        if (status.mo11905q0()) {
            gVar.mo24885c(obj);
        } else {
            gVar.mo24884b(new ApiException(status));
        }
    }

    /* renamed from: b */
    public static void m26962b(Status status, C9227g gVar) {
        m26961a(status, (Object) null, gVar);
    }

    /* renamed from: c */
    public static boolean m26963c(Status status, Object obj, C9227g gVar) {
        if (status.mo11905q0()) {
            return gVar.mo24887e(obj);
        }
        return gVar.mo24886d(new ApiException(status));
    }
}
