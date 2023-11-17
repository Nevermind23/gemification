package p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview;

import android.widget.PopupWindow;
import p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview.TooltipLayout;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.compoundview.c */
public final /* synthetic */ class C21502c implements PopupWindow.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ TooltipLayout f57488d;

    public /* synthetic */ C21502c(TooltipLayout tooltipLayout) {
        this.f57488d = tooltipLayout;
    }

    public final void onDismiss() {
        TooltipLayout.C21499a.m69506e(this.f57488d);
    }
}
