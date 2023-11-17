package o31;

import android.view.View;
import kotlin.jvm.internal.C41536l;
import ue1.C43064a;

/* renamed from: o31.u */
public abstract class C37619u {
    /* renamed from: a */
    public static final void m110620a(View view, long j, C43064a aVar) {
        C41536l.m120489i(view, "<this>");
        C41536l.m120489i(aVar, "onClick");
        view.setOnClickListener(new C37617t(j, aVar));
    }

    /* renamed from: b */
    public static /* synthetic */ void m110621b(View view, long j, C43064a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 1000;
        }
        m110620a(view, j, aVar);
    }
}
