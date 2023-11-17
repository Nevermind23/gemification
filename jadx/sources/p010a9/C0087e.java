package p010a9;

import android.os.Bundle;
import java.util.Locale;
import p027b9.C2184f;
import p040c9.C2281b;
import p301w8.C8878a;

/* renamed from: a9.e */
class C0087e implements C8878a.C8880b {

    /* renamed from: a */
    private C2281b f899a;

    /* renamed from: b */
    private C2281b f900b;

    C0087e() {
    }

    /* renamed from: b */
    private static void m227b(C2281b bVar, String str, Bundle bundle) {
        if (bVar != null) {
            bVar.mo7325b(str, bundle);
        }
    }

    /* renamed from: c */
    private void m228c(String str, Bundle bundle) {
        C2281b bVar;
        if ("clx".equals(bundle.getString("_o"))) {
            bVar = this.f899a;
        } else {
            bVar = this.f900b;
        }
        m227b(bVar, str, bundle);
    }

    /* renamed from: a */
    public void mo126a(int i, Bundle bundle) {
        String string;
        C2184f.m8346f().mo7095i(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", new Object[]{Integer.valueOf(i), bundle}));
        if (bundle != null && (string = bundle.getString("name")) != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            m228c(string, bundle2);
        }
    }

    /* renamed from: d */
    public void mo127d(C2281b bVar) {
        this.f900b = bVar;
    }

    /* renamed from: e */
    public void mo128e(C2281b bVar) {
        this.f899a = bVar;
    }
}
