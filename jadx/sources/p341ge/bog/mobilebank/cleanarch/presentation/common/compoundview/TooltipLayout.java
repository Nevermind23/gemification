package p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.view.C1152f3;
import he1.C41217g;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10330s;
import ue1.C43064a;
import z00.C30129e;
import z00.C30130f;
import z00.C30131g;

@SuppressLint({"InflateParams"})
/* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.compoundview.TooltipLayout */
public final class TooltipLayout extends LinearLayout {

    /* renamed from: d */
    private String f57478d;

    /* renamed from: e */
    private boolean f57479e;

    /* renamed from: f */
    private long f57480f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final ImageView f57481g;

    /* renamed from: h */
    private final C41217g f57482h;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.compoundview.TooltipLayout$a */
    static final class C21499a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Context f57483d;

        /* renamed from: e */
        final /* synthetic */ TooltipLayout f57484e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21499a(Context context, TooltipLayout tooltipLayout) {
            super(0);
            this.f57483d = context;
            this.f57484e = tooltipLayout;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final boolean m69505d(TooltipLayout tooltipLayout, PopupWindow popupWindow, View view, MotionEvent motionEvent) {
            C41536l.m120489i(tooltipLayout, "this$0");
            C41536l.m120489i(popupWindow, "$this_apply");
            tooltipLayout.performClick();
            popupWindow.dismiss();
            return false;
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final void m69506e(TooltipLayout tooltipLayout) {
            C41536l.m120489i(tooltipLayout, "this$0");
            tooltipLayout.f57481g.setVisibility(8);
        }

        /* renamed from: c */
        public final PopupWindow invoke() {
            View inflate = LayoutInflater.from(this.f57483d).inflate(C10324m.layout_tooltip_popup, (ViewGroup) null);
            TooltipLayout tooltipLayout = this.f57484e;
            PopupWindow popupWindow = new PopupWindow(inflate, -2, -2);
            popupWindow.setOutsideTouchable(true);
            popupWindow.setTouchInterceptor(new C21501b(tooltipLayout, popupWindow));
            popupWindow.setOnDismissListener(new C21502c(tooltipLayout));
            return popupWindow;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TooltipLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final void m69497e(TooltipLayout tooltipLayout, View view) {
        C41536l.m120489i(tooltipLayout, "this$0");
        m69499h(tooltipLayout, (String) null, 0, 3, (Object) null);
    }

    /* renamed from: f */
    private final void m69498f(PopupWindow popupWindow, String str) {
        TextView textView = (TextView) popupWindow.getContentView().findViewById(C10322k.f28792Tf);
        if (textView != null) {
            textView.setText(str);
        }
    }

    private final PopupWindow getPopup() {
        return (PopupWindow) this.f57482h.getValue();
    }

    /* renamed from: h */
    public static /* synthetic */ boolean m69499h(TooltipLayout tooltipLayout, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tooltipLayout.f57478d;
        }
        if ((i & 2) != 0) {
            j = tooltipLayout.f57480f;
        }
        return tooltipLayout.mo53695g(str, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static final void m69500i(TooltipLayout tooltipLayout, String str, long j) {
        C41536l.m120489i(tooltipLayout, "this$0");
        tooltipLayout.m69498f(tooltipLayout.getPopup(), str);
        tooltipLayout.getPopup().showAsDropDown(tooltipLayout.f57481g, 0, 0, 1);
        tooltipLayout.f57481g.setVisibility(0);
        if (j > 0) {
            tooltipLayout.postDelayed(new C30131g(tooltipLayout), j);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final void m69501j(TooltipLayout tooltipLayout) {
        C41536l.m120489i(tooltipLayout, "this$0");
        tooltipLayout.getPopup().dismiss();
    }

    /* renamed from: g */
    public final boolean mo53695g(String str, long j) {
        return post(new C30129e(this, str, j));
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        boolean z = true;
        if (getChildCount() != 1) {
            z = false;
        }
        if (z) {
            if (this.f57479e) {
                C1152f3.m4214a(this, 0).setOnClickListener(new C30130f(this));
            }
            addView(this.f57481g);
            return;
        }
        throw new IllegalArgumentException("ToolTipAnchorLayout must have one child".toString());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TooltipLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TooltipLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        this.f57480f = -1;
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        imageView.setImageResource(C10320i.hint_top_arrow);
        imageView.setVisibility(8);
        this.f57481g = imageView;
        this.f57482h = C41219i.m119470b(new C21499a(context, this));
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        setOrientation(1);
        setGravity(1);
        int[] iArr = C10330s.f29027E8;
        C41536l.m120488h(iArr, "TooltipLayout");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        this.f57478d = obtainStyledAttributes.getString(C10330s.f29057H8);
        this.f57479e = obtainStyledAttributes.getBoolean(C10330s.f29037F8, false);
        int i2 = obtainStyledAttributes.getInt(C10330s.f29047G8, -1);
        if (i2 > 0) {
            this.f57480f = ((long) i2) * 1000;
        }
        obtainStyledAttributes.recycle();
    }
}
