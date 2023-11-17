package ta0;

import android.view.View;
import kotlin.jvm.internal.C41536l;
import ue1.C43064a;

/* renamed from: ta0.h */
public abstract class C28345h {
    /* renamed from: a */
    public static final void m86978a(View view, long j, C43064a aVar) {
        C41536l.m120489i(view, "<this>");
        C41536l.m120489i(aVar, "onClick");
        view.setOnClickListener(new C28343g(j, aVar));
    }

    /* renamed from: b */
    public static /* synthetic */ void m86979b(View view, long j, C43064a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 1000;
        }
        m86978a(view, j, aVar);
    }
}
