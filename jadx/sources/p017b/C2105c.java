package p017b;

import android.content.Context;
import android.content.Intent;
import androidx.core.content.C0767a;
import kotlin.jvm.internal.C41536l;
import p017b.C2101a;

/* renamed from: b.c */
public final class C2105c extends C2101a {
    /* renamed from: d */
    public Intent mo4464a(Context context, String str) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(str, "input");
        return C2103b.f6260a.mo7002a(new String[]{str});
    }

    /* renamed from: e */
    public C2101a.C2102a mo6997b(Context context, String str) {
        boolean z;
        C41536l.m120489i(context, "context");
        C41536l.m120489i(str, "input");
        if (C0767a.m2891a(context, str) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new C2101a.C2102a(Boolean.TRUE);
        }
        return null;
    }

    /* renamed from: f */
    public Boolean mo4465c(int i, Intent intent) {
        boolean z;
        boolean z2;
        if (intent == null || i != -1) {
            return Boolean.FALSE;
        }
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        boolean z3 = false;
        if (intArrayExtra != null) {
            int length = intArrayExtra.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z = false;
                    break;
                }
                if (intArrayExtra[i2] == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    z = true;
                    break;
                }
                i2++;
            }
            if (z) {
                z3 = true;
            }
        }
        return Boolean.valueOf(z3);
    }
}
