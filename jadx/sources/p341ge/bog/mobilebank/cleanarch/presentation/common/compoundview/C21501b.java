package p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview;

import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;
import p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview.TooltipLayout;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.compoundview.b */
public final /* synthetic */ class C21501b implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ TooltipLayout f57486d;

    /* renamed from: e */
    public final /* synthetic */ PopupWindow f57487e;

    public /* synthetic */ C21501b(TooltipLayout tooltipLayout, PopupWindow popupWindow) {
        this.f57486d = tooltipLayout;
        this.f57487e = popupWindow;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return TooltipLayout.C21499a.m69505d(this.f57486d, this.f57487e, view, motionEvent);
    }
}
