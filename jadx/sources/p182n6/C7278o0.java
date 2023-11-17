package p182n6;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

/* renamed from: n6.o0 */
public final class C7278o0 {

    /* renamed from: f */
    private static final Uri f21469f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a */
    private final String f21470a;

    /* renamed from: b */
    private final String f21471b;

    /* renamed from: c */
    private final ComponentName f21472c = null;

    /* renamed from: d */
    private final int f21473d = 4225;

    /* renamed from: e */
    private final boolean f21474e;

    public C7278o0(String str, String str2, int i, boolean z) {
        C7264i.m27898g(str);
        this.f21470a = str;
        C7264i.m27898g(str2);
        this.f21471b = str2;
        this.f21474e = z;
    }

    /* renamed from: a */
    public final ComponentName mo21652a() {
        return this.f21472c;
    }

    /* renamed from: b */
    public final Intent mo21653b(Context context) {
        Bundle bundle;
        if (this.f21470a == null) {
            return new Intent().setComponent(this.f21472c);
        }
        Intent intent = null;
        if (this.f21474e) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", this.f21470a);
            try {
                bundle = context.getContentResolver().call(f21469f, "serviceIntentCall", (String) null, bundle2);
            } catch (IllegalArgumentException e) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                bundle = null;
            }
            if (bundle != null) {
                intent = (Intent) bundle.getParcelable("serviceResponseIntentKey");
            }
            if (intent == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.f21470a)));
            }
        }
        if (intent == null) {
            return new Intent(this.f21470a).setPackage(this.f21471b);
        }
        return intent;
    }

    /* renamed from: c */
    public final String mo21654c() {
        return this.f21471b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7278o0)) {
            return false;
        }
        C7278o0 o0Var = (C7278o0) obj;
        if (!C7258g.m27880a(this.f21470a, o0Var.f21470a) || !C7258g.m27880a(this.f21471b, o0Var.f21471b) || !C7258g.m27880a(this.f21472c, o0Var.f21472c) || this.f21474e != o0Var.f21474e) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C7258g.m27881b(this.f21470a, this.f21471b, this.f21472c, 4225, Boolean.valueOf(this.f21474e));
    }

    public final String toString() {
        String str = this.f21470a;
        if (str != null) {
            return str;
        }
        C7264i.m27902k(this.f21472c);
        return this.f21472c.flattenToString();
    }
}
