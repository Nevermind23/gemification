package p319y1;

import com.airbnb.lottie.C2315d0;
import com.airbnb.lottie.C2325h;
import p048d2.C5804f;
import p255t1.C8311c;
import p255t1.C8320l;
import p331z1.C9169b;

/* renamed from: y1.i */
public class C9018i implements C9011c {

    /* renamed from: a */
    private final String f25084a;

    /* renamed from: b */
    private final C9019a f25085b;

    /* renamed from: c */
    private final boolean f25086c;

    /* renamed from: y1.i$a */
    public enum C9019a {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        /* renamed from: b */
        public static C9019a m33380b(int i) {
            if (i == 1) {
                return MERGE;
            }
            if (i == 2) {
                return ADD;
            }
            if (i == 3) {
                return SUBTRACT;
            }
            if (i == 4) {
                return INTERSECT;
            }
            if (i != 5) {
                return MERGE;
            }
            return EXCLUDE_INTERSECTIONS;
        }
    }

    public C9018i(String str, C9019a aVar, boolean z) {
        this.f25084a = str;
        this.f25085b = aVar;
        this.f25086c = z;
    }

    /* renamed from: a */
    public C8311c mo24359a(C2315d0 d0Var, C2325h hVar, C9169b bVar) {
        if (d0Var.mo7451A()) {
            return new C8320l(this);
        }
        C5804f.m23334c("Animation contains merge paths but they are disabled.");
        return null;
    }

    /* renamed from: b */
    public C9019a mo24451b() {
        return this.f25085b;
    }

    /* renamed from: c */
    public String mo24452c() {
        return this.f25084a;
    }

    /* renamed from: d */
    public boolean mo24453d() {
        return this.f25086c;
    }

    public String toString() {
        return "MergePaths{mode=" + this.f25085b + '}';
    }
}
