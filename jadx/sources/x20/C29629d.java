package x20;

import a30.C19151a;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.core.content.C0767a;
import g91.C32289b0;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import p366bk.C10320i;
import p90.C27412r5;
import w20.C29192a;

/* renamed from: x20.d */
public final class C29629d extends C29627b {

    /* renamed from: d */
    private final C27412r5 f74792d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C29629d(p90.C27412r5 r3) {
        /*
            r2 = this;
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.C41536l.m120489i(r3, r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r3.mo3946b()
            java.lang.String r1 = "binding.root"
            kotlin.jvm.internal.C41536l.m120488h(r0, r1)
            r2.<init>(r0)
            r2.f74792d = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x20.C29629d.<init>(p90.r5):void");
    }

    /* renamed from: i */
    public void mo69544h(C29192a.C29195c cVar) {
        C41536l.m120489i(cVar, "item");
        C19151a c = cVar.mo69040c();
        this.f74792d.f69690e.setText(C32343x.m95410Q(c.mo47355a(), "GEL", false, 2, (Object) null));
        this.f74792d.f69691f.setText(c.mo47357c());
        if (c.mo47361f()) {
            this.f74792d.f69692g.setBackground((Drawable) null);
            this.f74792d.f69692g.setImageDrawable(C0767a.m2895e(this.itemView.getContext(), C10320i.ic_cash_opeation_full));
            return;
        }
        this.f74792d.f69692g.setBackground(C0767a.m2895e(this.itemView.getContext(), C10320i.bg_circle_bill_split_operation));
        ImageView imageView = this.f74792d.f69692g;
        String d = c.mo47358d();
        int i = C10320i.f28688dc;
        C32289b0.m95107s(imageView, d, Integer.valueOf(i), Integer.valueOf(i), true, c.mo47356b());
    }
}
