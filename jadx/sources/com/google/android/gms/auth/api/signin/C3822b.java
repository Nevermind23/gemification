package com.google.android.gms.auth.api.signin;

import android.content.Context;
import com.google.android.gms.common.C3846a;
import com.google.android.gms.common.C3943d;
import com.google.android.gms.common.api.C3847a;
import com.google.android.gms.common.api.C3857b;
import com.google.android.gms.common.api.C3860c;
import com.google.android.gms.dynamite.DynamiteModule;
import p007a6.C0054a;
import p078f6.C6163d;
import p091g6.C6240m;
import p156l6.C6929a;
import p182n6.C7261h;
import p337z7.Task;

/* renamed from: com.google.android.gms.auth.api.signin.b */
public class C3822b extends C3857b {

    /* renamed from: k */
    private static final C3826f f12189k = new C3826f((C6163d) null);

    /* renamed from: l */
    static int f12190l = 1;

    C3822b(Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, C0054a.f95c, (C3847a.C3851d) googleSignInOptions, new C3857b.C3858a.C3859a().mo11950b(new C6929a()).mo11949a());
    }

    /* renamed from: C */
    private final synchronized int m14420C() {
        int i;
        i = f12190l;
        if (i == 1) {
            Context s = mo11943s();
            C3846a q = C3846a.m14468q();
            int j = q.mo11873j(s, C3943d.f12557a);
            if (j == 0) {
                i = 4;
                f12190l = 4;
            } else if (q.mo11869d(s, j, (String) null) != null || DynamiteModule.m15256a(s, "com.google.android.gms.auth.api.fallback") == 0) {
                i = 2;
                f12190l = 2;
            } else {
                i = 3;
                f12190l = 3;
            }
        }
        return i;
    }

    /* renamed from: A */
    public Task mo11795A() {
        boolean z;
        C3860c i = mo11933i();
        Context s = mo11943s();
        if (m14420C() == 3) {
            z = true;
        } else {
            z = false;
        }
        return C7261h.m27889b(C6240m.m24798b(i, s, z));
    }

    /* renamed from: B */
    public Task mo11796B() {
        boolean z;
        C3860c i = mo11933i();
        Context s = mo11943s();
        if (m14420C() == 3) {
            z = true;
        } else {
            z = false;
        }
        return C7261h.m27889b(C6240m.m24799c(i, s, z));
    }
}
