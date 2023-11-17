package q20;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0767a;
import g91.C32289b0;
import g91.C32343x;
import h50.C24882b;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p366bk.C10318g;
import p366bk.C10320i;
import p783hv.C25067a;
import p793iw.C25263b;
import p90.C27465x4;

/* renamed from: q20.c */
public final class C27676c extends C27674a {

    /* renamed from: f */
    private final C27465x4 f70769f;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C27676c(p90.C27465x4 r3) {
        /*
            r2 = this;
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.C41536l.m120489i(r3, r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r3.mo3946b()
            java.lang.String r1 = "binding.root"
            kotlin.jvm.internal.C41536l.m120488h(r0, r1)
            r2.<init>(r0)
            r2.f70769f = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q20.C27676c.<init>(p90.x4):void");
    }

    /* renamed from: j */
    private final int m85680j(Context context, boolean z) {
        if (z) {
            return C0767a.m2893c(context, C10318g.color_invert_background_popup);
        }
        return C0767a.m2893c(context, C10318g.f28625J0);
    }

    /* renamed from: i */
    public final void mo67212i(C25067a.C25069b bVar) {
        String str;
        BigDecimal negate;
        C41536l.m120489i(bVar, "data");
        C25263b a = bVar.mo63508a();
        Context context = this.f89287d.getContext();
        ImageView imageView = this.f70769f.f70227h;
        String e = C32289b0.m95093e(C24882b.m79535c(a));
        int i = C10320i.f28688dc;
        C32289b0.m95107s(imageView, e, Integer.valueOf(i), Integer.valueOf(i), true, C24882b.m79534b(a));
        this.f70769f.f70226g.setText(a.mo63840w());
        this.f70769f.f70225f.setText(C24882b.m79533a(a));
        TextView textView = this.f70769f.f70224e;
        BigDecimal c = a.mo63817c();
        if (c == null || (negate = c.negate()) == null) {
            str = null;
        } else {
            String k = a.mo63827k();
            if (k == null) {
                k = "";
            }
            str = C32343x.m95408P(negate, k);
        }
        textView.setText(str);
        this.f70769f.f70228i.setChecked(bVar.mo63509b());
        View view = this.f89287d;
        C41536l.m120488h(context, "context");
        view.setBackgroundColor(m85680j(context, bVar.mo63509b()));
    }
}
