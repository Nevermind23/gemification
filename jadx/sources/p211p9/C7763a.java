package p211p9;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.firebase.dynamiclinks.internal.DynamicLinkData;

/* renamed from: p9.a */
public class C7763a {

    /* renamed from: a */
    private final DynamicLinkData f22464a;

    /* renamed from: b */
    private final Bundle f22465b;

    public C7763a(DynamicLinkData dynamicLinkData) {
        this.f22464a = dynamicLinkData;
        this.f22465b = m29456b(dynamicLinkData);
    }

    /* renamed from: a */
    private static void m29455a(String str, String str2, Bundle bundle, Bundle bundle2) {
        String string = bundle.getString(str);
        if (!TextUtils.isEmpty(string)) {
            bundle2.putString(str2, string);
        }
    }

    /* renamed from: b */
    private static Bundle m29456b(DynamicLinkData dynamicLinkData) {
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = new Bundle();
        if (dynamicLinkData == null || dynamicLinkData.mo17451R() == null || (bundle = dynamicLinkData.mo17451R().getBundle("scionData")) == null || (bundle2 = bundle.getBundle("_cmp")) == null) {
            return bundle3;
        }
        m29455a("medium", "utm_medium", bundle2, bundle3);
        m29455a("source", "utm_source", bundle2, bundle3);
        m29455a("campaign", "utm_campaign", bundle2, bundle3);
        return bundle3;
    }
}
