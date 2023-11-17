package x11;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import androidx.core.view.C1060a1;
import androidx.core.view.WindowInsetsCompat;
import kotlin.jvm.internal.C41536l;
import p060e1.C5905g;
import p060e1.C5958l0;

/* renamed from: x11.h */
public final class C39775h implements C1060a1 {

    /* renamed from: d */
    private WindowInsetsCompat f94484d;

    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        ViewParent viewParent;
        C41536l.m120489i(view, "v");
        C41536l.m120489i(windowInsetsCompat, "windowInsets");
        View findViewById = view.findViewById(16908290);
        ViewGroup viewGroup = null;
        if (findViewById != null) {
            viewParent = findViewById.getParent();
        } else {
            viewParent = null;
        }
        if (viewParent instanceof ViewGroup) {
            viewGroup = (ViewGroup) viewParent;
        }
        if (!C41536l.m120484d(this.f94484d, windowInsetsCompat) && viewGroup != null) {
            C5905g gVar = new C5905g();
            gVar.mo19350p0(400);
            gVar.mo19355t0(new DecelerateInterpolator());
            C5958l0.m23911b(viewGroup, gVar);
        }
        this.f94484d = windowInsetsCompat;
        return windowInsetsCompat;
    }
}
