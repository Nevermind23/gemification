package p624uc;

import com.identomat.fragments.liveness.LivenessFragment;

/* renamed from: uc.q */
public final /* synthetic */ class C18091q implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f51320d;

    /* renamed from: e */
    public final /* synthetic */ LivenessFragment f51321e;

    /* renamed from: f */
    public final /* synthetic */ int f51322f;

    public /* synthetic */ C18091q(String str, LivenessFragment livenessFragment, int i) {
        this.f51320d = str;
        this.f51321e = livenessFragment;
        this.f51322f = i;
    }

    public final void run() {
        LivenessFragment.m38381C2(this.f51320d, this.f51321e, this.f51322f);
    }
}
