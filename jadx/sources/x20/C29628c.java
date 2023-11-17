package x20;

import android.widget.TextView;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import p90.C27457w5;
import w20.C29192a;

/* renamed from: x20.c */
public final class C29628c extends C29627b {

    /* renamed from: d */
    private final C27457w5 f74791d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C29628c(p90.C27457w5 r3) {
        /*
            r2 = this;
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.C41536l.m120489i(r3, r0)
            android.widget.LinearLayout r0 = r3.mo3946b()
            java.lang.String r1 = "binding.root"
            kotlin.jvm.internal.C41536l.m120488h(r0, r1)
            r2.<init>(r0)
            r2.f74791d = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x20.C29628c.<init>(p90.w5):void");
    }

    /* renamed from: i */
    public void mo69544h(C29192a.C29197e eVar) {
        C41536l.m120489i(eVar, "item");
        TextView textView = this.f74791d.f70177e;
        C41536l.m120488h(textView, "binding.countText");
        boolean z = true;
        if (eVar.mo69048c() <= 1) {
            z = false;
        }
        C32343x.m95483r1(textView, z, false, 2, (Object) null);
        this.f74791d.f70177e.setText(String.valueOf(eVar.mo69048c()));
    }
}
