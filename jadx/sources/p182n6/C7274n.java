package p182n6;

import android.os.Bundle;
import com.google.android.gms.common.api.C3847a;

/* renamed from: n6.n */
public class C7274n implements C3847a.C3851d, C3847a.C3851d.C3853b {

    /* renamed from: e */
    public static final C7274n f21466e = m27921a().mo21647a();

    /* renamed from: d */
    private final String f21467d;

    /* renamed from: n6.n$a */
    public static class C7275a {

        /* renamed from: a */
        private String f21468a;

        /* synthetic */ C7275a(C7281q qVar) {
        }

        /* renamed from: a */
        public C7274n mo21647a() {
            return new C7274n(this.f21468a, (C7283r) null);
        }
    }

    /* synthetic */ C7274n(String str, C7283r rVar) {
        this.f21467d = str;
    }

    /* renamed from: a */
    public static C7275a m27921a() {
        return new C7275a((C7281q) null);
    }

    /* renamed from: b */
    public final Bundle mo21644b() {
        Bundle bundle = new Bundle();
        String str = this.f21467d;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7274n)) {
            return false;
        }
        return C7258g.m27880a(this.f21467d, ((C7274n) obj).f21467d);
    }

    public final int hashCode() {
        return C7258g.m27881b(this.f21467d);
    }
}
