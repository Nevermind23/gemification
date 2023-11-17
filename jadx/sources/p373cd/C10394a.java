package p373cd;

import android.util.Log;
import kotlin.jvm.internal.C41536l;

/* renamed from: cd.a */
public abstract class C10394a {
    /* renamed from: a */
    public static final void m37797a(String str, String str2) {
        C41536l.m120489i(str, "tag");
        C41536l.m120489i(str2, "message");
        Log.i(str, str2);
    }

    /* renamed from: b */
    public static /* synthetic */ void m37798b(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "Session End";
        }
        m37797a(str, str2);
    }
}
