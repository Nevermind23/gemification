package p166m3;

import android.content.Context;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import p192o3.C7430c;

/* renamed from: m3.f */
public class C7084f implements C7092l {

    /* renamed from: b */
    private final Collection f21043b;

    public C7084f(C7092l... lVarArr) {
        if (lVarArr.length != 0) {
            this.f21043b = Arrays.asList(lVarArr);
            return;
        }
        throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
    }

    /* renamed from: a */
    public C7430c mo8004a(Context context, C7430c cVar, int i, int i2) {
        C7430c cVar2 = cVar;
        for (C7092l a : this.f21043b) {
            C7430c a2 = a.mo8004a(context, cVar2, i, i2);
            if (cVar2 != null && !cVar2.equals(cVar) && !cVar2.equals(a2)) {
                cVar2.recycle();
            }
            cVar2 = a2;
        }
        return cVar2;
    }

    /* renamed from: b */
    public void mo7845b(MessageDigest messageDigest) {
        for (C7092l b : this.f21043b) {
            b.mo7845b(messageDigest);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C7084f) {
            return this.f21043b.equals(((C7084f) obj).f21043b);
        }
        return false;
    }

    public int hashCode() {
        return this.f21043b.hashCode();
    }
}
