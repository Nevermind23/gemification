package androidx.core.app;

import android.os.Bundle;
import androidx.core.app.C0750x;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: androidx.core.app.y0 */
abstract class C0764y0 {

    /* renamed from: a */
    private static final Object f3394a = new Object();

    /* renamed from: b */
    private static final Object f3395b = new Object();

    /* renamed from: a */
    static Bundle m2884a(C0750x.C0751a aVar) {
        int i;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        IconCompat d = aVar.mo3194d();
        if (d != null) {
            i = d.mo3301e();
        } else {
            i = 0;
        }
        bundle2.putInt("icon", i);
        bundle2.putCharSequence("title", aVar.mo3198h());
        bundle2.putParcelable("actionIntent", aVar.mo3191a());
        if (aVar.mo3193c() != null) {
            bundle = new Bundle(aVar.mo3193c());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.mo3192b());
        bundle2.putBundle("extras", bundle);
        bundle2.putParcelableArray("remoteInputs", m2886c(aVar.mo3195e()));
        bundle2.putBoolean("showsUserInterface", aVar.mo3197g());
        bundle2.putInt("semanticAction", aVar.mo3196f());
        return bundle2;
    }

    /* renamed from: b */
    private static Bundle m2885b(C0695f1 f1Var) {
        new Bundle();
        throw null;
    }

    /* renamed from: c */
    private static Bundle[] m2886c(C0695f1[] f1VarArr) {
        if (f1VarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[f1VarArr.length];
        for (int i = 0; i < f1VarArr.length; i++) {
            C0695f1 f1Var = f1VarArr[i];
            bundleArr[i] = m2885b((C0695f1) null);
        }
        return bundleArr;
    }
}
