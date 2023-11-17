package p198o9;

import android.net.Uri;
import com.google.firebase.dynamiclinks.internal.DynamicLinkData;
import p211p9.C7763a;
import p260t6.C8407i;

/* renamed from: o9.b */
public class C7494b {

    /* renamed from: a */
    private final C7763a f21813a;

    /* renamed from: b */
    private final DynamicLinkData f21814b;

    public C7494b(DynamicLinkData dynamicLinkData) {
        if (dynamicLinkData == null) {
            this.f21814b = null;
            this.f21813a = null;
            return;
        }
        if (dynamicLinkData.mo17455v() == 0) {
            dynamicLinkData.mo17454s0(C8407i.m31544d().mo23594a());
        }
        this.f21814b = dynamicLinkData;
        this.f21813a = new C7763a(dynamicLinkData);
    }

    /* renamed from: a */
    public Uri mo21929a() {
        String w;
        DynamicLinkData dynamicLinkData = this.f21814b;
        if (dynamicLinkData == null || (w = dynamicLinkData.mo17456w()) == null) {
            return null;
        }
        return Uri.parse(w);
    }
}
