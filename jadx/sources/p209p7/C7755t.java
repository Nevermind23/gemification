package p209p7;

import android.os.Bundle;
import android.os.Parcelable;
import p182n6.C7264i;

/* renamed from: p7.t */
public abstract class C7755t {
    /* renamed from: a */
    public static Parcelable m29408a(Bundle bundle, String str) {
        ClassLoader d = m29411d();
        bundle.setClassLoader(d);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(d);
        return bundle2.getParcelable(str);
    }

    /* renamed from: b */
    public static void m29409b(Bundle bundle, Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            Parcelable a = m29408a(bundle, "MapOptions");
            if (a != null) {
                m29410c(bundle2, "MapOptions", a);
            }
            Parcelable a2 = m29408a(bundle, "StreetViewPanoramaOptions");
            if (a2 != null) {
                m29410c(bundle2, "StreetViewPanoramaOptions", a2);
            }
            Parcelable a3 = m29408a(bundle, "camera");
            if (a3 != null) {
                m29410c(bundle2, "camera", a3);
            }
            if (bundle.containsKey("position")) {
                bundle2.putString("position", bundle.getString("position"));
            }
            if (bundle.containsKey("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT")) {
                bundle2.putBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
            }
        }
    }

    /* renamed from: c */
    public static void m29410c(Bundle bundle, String str, Parcelable parcelable) {
        ClassLoader d = m29411d();
        bundle.setClassLoader(d);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(d);
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle("map_state", bundle2);
    }

    /* renamed from: d */
    private static ClassLoader m29411d() {
        return (ClassLoader) C7264i.m27902k(C7755t.class.getClassLoader());
    }
}
