package p299w6;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: w6.i */
final class C8867i implements C8871m {

    /* renamed from: a */
    final /* synthetic */ FrameLayout f24840a;

    /* renamed from: b */
    final /* synthetic */ LayoutInflater f24841b;

    /* renamed from: c */
    final /* synthetic */ ViewGroup f24842c;

    /* renamed from: d */
    final /* synthetic */ Bundle f24843d;

    /* renamed from: e */
    final /* synthetic */ C8858a f24844e;

    C8867i(C8858a aVar, FrameLayout frameLayout, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f24844e = aVar;
        this.f24840a = frameLayout;
        this.f24841b = layoutInflater;
        this.f24842c = viewGroup;
        this.f24843d = bundle;
    }

    /* renamed from: a */
    public final int mo24293a() {
        return 2;
    }

    /* renamed from: b */
    public final void mo24294b(C8861c cVar) {
        this.f24840a.removeAllViews();
        this.f24840a.addView(this.f24844e.f24828a.mo14071b(this.f24841b, this.f24842c, this.f24843d));
    }
}
