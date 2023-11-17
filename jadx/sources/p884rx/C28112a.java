package p884rx;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import kotlin.jvm.internal.C41536l;
import p90.C27420s4;

/* renamed from: rx.a */
public final class C28112a {
    /* renamed from: a */
    private final void m86566a(C27420s4 s4Var, String str, String str2) {
        s4Var.f69792e.setText(str);
        s4Var.f69793f.setText(str2);
    }

    /* renamed from: b */
    public final View mo67647b(Context context, String str, String str2) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(str, "leftText");
        C41536l.m120489i(str2, "rightText");
        C27420s4 d = C27420s4.m84991d(LayoutInflater.from(context), new FrameLayout(context), false);
        C41536l.m120488h(d, "inflate(\n            Lay…          false\n        )");
        m86566a(d, str, str2);
        LinearLayout c = d.mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }
}
