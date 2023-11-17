package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C4447v3;
import com.google.android.gms.internal.measurement.C4523ze;
import java.util.HashMap;

/* renamed from: com.google.android.gms.measurement.internal.c9 */
public final class C4607c9 extends C4861z8 {
    C4607c9(C4719m9 m9Var) {
        super(m9Var);
    }

    /* renamed from: j */
    private final String m17614j(String str) {
        String w = this.f15082b.mo14581a0().mo14637w(str);
        if (TextUtils.isEmpty(w)) {
            return (String) C4636f3.f14396s.mo14346a((Object) null);
        }
        Uri parse = Uri.parse((String) C4636f3.f14396s.mo14346a((Object) null));
        Uri.Builder buildUpon = parse.buildUpon();
        String authority = parse.getAuthority();
        buildUpon.authority(w + "." + authority);
        return buildUpon.build().toString();
    }

    /* renamed from: i */
    public final C4595b9 mo14325i(String str) {
        String str2;
        C4523ze.m17322c();
        C4595b9 b9Var = null;
        if (this.f14613a.mo14876z().mo14398B((String) null, C4636f3.f14397s0)) {
            this.f14613a.mo14551d().mo14679v().mo14615a("sgtm feature flag enabled.");
            C4748p5 R = this.f15082b.mo14577W().mo14497R(str);
            if (R == null) {
                return new C4595b9(m17614j(str));
            }
            if (R.mo14699O()) {
                this.f14613a.mo14551d().mo14679v().mo14615a("sgtm upload enabled in manifest.");
                C4447v3 t = this.f15082b.mo14581a0().mo14634t(R.mo14728i0());
                if (t != null) {
                    String J = t.mo13767J();
                    if (!TextUtils.isEmpty(J)) {
                        String I = t.mo13766I();
                        C4724n3 v = this.f14613a.mo14551d().mo14679v();
                        if (true != TextUtils.isEmpty(I)) {
                            str2 = "N";
                        } else {
                            str2 = "Y";
                        }
                        v.mo14617c("sgtm configured with upload_url, server_info", J, str2);
                        if (TextUtils.isEmpty(I)) {
                            this.f14613a.mo14549b();
                            b9Var = new C4595b9(J);
                        } else {
                            HashMap hashMap = new HashMap();
                            hashMap.put("x-google-sgtm-server-info", I);
                            b9Var = new C4595b9(J, hashMap);
                        }
                    }
                }
            }
            if (b9Var != null) {
                return b9Var;
            }
        }
        return new C4595b9(m17614j(str));
    }
}
