package ca1;

import android.os.Bundle;

/* renamed from: ca1.a */
public interface C10379a {

    /* renamed from: ca1.a$a */
    public static final class C10380a {
        /* renamed from: a */
        public static /* synthetic */ void m37703a(C10379a aVar, String str, String str2, String str3, Bundle bundle, C10381b bVar, int i, Object obj) {
            String str4;
            String str5;
            Bundle bundle2;
            if (obj == null) {
                if ((i & 2) != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if ((i & 4) != 0) {
                    str5 = null;
                } else {
                    str5 = str3;
                }
                if ((i & 8) != 0) {
                    bundle2 = null;
                } else {
                    bundle2 = bundle;
                }
                if ((i & 16) != 0) {
                    bVar = C10381b.FIREBASE;
                }
                aVar.mo27002a(str, str4, str5, bundle2, bVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: send");
        }
    }

    /* renamed from: ca1.a$b */
    public enum C10381b {
        FACEBOOK,
        FIREBASE,
        FACEBOOK_AND_FIREBASE
    }

    /* renamed from: a */
    void mo27002a(String str, String str2, String str3, Bundle bundle, C10381b bVar);
}
