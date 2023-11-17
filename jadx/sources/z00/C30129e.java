package z00;

import p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview.TooltipLayout;

/* renamed from: z00.e */
public final /* synthetic */ class C30129e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ TooltipLayout f75970d;

    /* renamed from: e */
    public final /* synthetic */ String f75971e;

    /* renamed from: f */
    public final /* synthetic */ long f75972f;

    public /* synthetic */ C30129e(TooltipLayout tooltipLayout, String str, long j) {
        this.f75970d = tooltipLayout;
        this.f75971e = str;
        this.f75972f = j;
    }

    public final void run() {
        TooltipLayout.m69500i(this.f75970d, this.f75971e, this.f75972f);
    }
}
