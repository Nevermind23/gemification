package x20;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C41536l;
import p20.C27143e;
import p90.C27430t5;
import w20.C29192a;

/* renamed from: x20.e */
public final class C29630e extends C29627b {

    /* renamed from: d */
    private final C27430t5 f74793d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C29630e(p90.C27430t5 r3) {
        /*
            r2 = this;
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.C41536l.m120489i(r3, r0)
            android.widget.FrameLayout r0 = r3.mo3946b()
            java.lang.String r1 = "binding.root"
            kotlin.jvm.internal.C41536l.m120488h(r0, r1)
            r2.<init>(r0)
            r2.f74793d = r3
            androidx.recyclerview.widget.RecyclerView r3 = r3.f69849e
            p20.e r0 = new p20.e
            r1 = 1
            r0.<init>(r1)
            r3.setAdapter(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x20.C29630e.<init>(p90.t5):void");
    }

    /* renamed from: i */
    public void mo69544h(C29192a.C29196d dVar) {
        C41536l.m120489i(dVar, "item");
        RecyclerView.C1736h adapter = this.f74793d.f69849e.getAdapter();
        C41536l.m120487g(adapter, "null cannot be cast to non-null type ge.bog.mobilebank.cleanarch.presentation.moneyrequest.adapter.BillSplitOperationsHorizontalAdapter");
        ((C27143e) adapter).mo6029i(dVar.mo69044c());
    }
}
