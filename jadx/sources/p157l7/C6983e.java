package p157l7;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.C3847a;
import com.google.android.gms.common.api.C3857b;
import com.google.android.gms.common.api.internal.C3892h;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.google.android.gms.tapandpay.issuer.ViewTokenRequest;
import p313x7.C8972a;
import p313x7.C8973b;
import p313x7.C8974c;
import p337z7.Task;

/* renamed from: l7.e */
public final class C6983e extends C3857b implements C8973b {
    public C6983e(Activity activity) {
        super(activity, C8972a.f24981c, (C3847a.C3851d) C3847a.C3851d.f12268T2, C3857b.C3858a.f12279c);
    }

    /* renamed from: a */
    public final Task mo21124a() {
        return mo11936l(C3892h.m14753a().mo12078b(new C6990h0(this)).mo12080d(C8974c.f25004w).mo12081e(2163).mo12077a());
    }

    /* renamed from: c */
    public final void mo21125c(Activity activity, int i) {
        mo11936l(C3892h.m14753a().mo12078b(new C6986f0(activity, i)).mo12081e(2112).mo12077a());
    }

    /* renamed from: d */
    public final void mo21126d(Activity activity, PushTokenizeRequest pushTokenizeRequest, int i) {
        mo11936l(C3892h.m14753a().mo12078b(new C6994j0(pushTokenizeRequest, activity, i)).mo12081e(2106).mo12077a());
    }

    /* renamed from: e */
    public final void mo21127e(Activity activity, String str, int i, String str2, int i2, int i3) {
        mo11936l(C3892h.m14753a().mo12078b(new C6996k0(i, str, str2, i2, activity, i3)).mo12081e(2101).mo12077a());
    }

    /* renamed from: f */
    public final Task mo21128f() {
        return mo11936l(C3892h.m14753a().mo12078b(new C6998l0(this)).mo12081e(2103).mo12077a());
    }

    /* renamed from: g */
    public final Task mo21129g() {
        return mo11936l(C3892h.m14753a().mo12078b(new C6992i0(this)).mo12081e(2109).mo12077a());
    }

    /* renamed from: h */
    public final Task mo21130h(ViewTokenRequest viewTokenRequest) {
        return mo11936l(C3892h.m14753a().mo12078b(new C6988g0(this, viewTokenRequest)).mo12081e(2160).mo12080d(C8974c.f24991j).mo12077a());
    }

    public C6983e(Context context) {
        super(context, C8972a.f24981c, (C3847a.C3851d) C3847a.C3851d.f12268T2, C3857b.C3858a.f12279c);
    }
}
