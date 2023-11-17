package p341ge.bog.mobilebank.payments.presentation.form.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import java.util.Observable;
import java.util.Observer;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.payments.presentation.form.base.C33702d;
import vx0.C39491a;

/* renamed from: ge.bog.mobilebank.payments.presentation.form.base.FormLayout */
public final class FormLayout extends NestedScrollView implements Observer {

    /* renamed from: f */
    public static final C33696a f82097f = new C33696a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final ViewGroup f82098d;

    /* renamed from: e */
    private C33697a f82099e;

    /* renamed from: ge.bog.mobilebank.payments.presentation.form.base.FormLayout$a */
    public static final class C33696a {
        private C33696a() {
        }

        public /* synthetic */ C33696a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final FrameLayout.LayoutParams m99016b() {
            return new FrameLayout.LayoutParams(-1, -2);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FormLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* renamed from: D */
    private final void m99013D() {
        int i;
        int d;
        m99014E().mo80298b();
        int childCount = this.f82098d.getChildCount();
        if (getHasHeader()) {
            childCount--;
            i = 1;
        } else {
            i = 0;
        }
        this.f82098d.removeViews(i, childCount);
        C33697a aVar = this.f82099e;
        if (aVar != null && (d = aVar.mo80300d()) > 0) {
            for (int i2 = 0; i2 < d; i2++) {
                C33702d.C33703a e = aVar.mo80301e(i2);
                C33702d c = aVar.mo80299c(i2);
                C39491a i3 = aVar.mo72305i(e, i2);
                if (i3 != null) {
                    View l = i3.mo93127l(this.f82098d, c);
                    if (!(l == null || l == getChildAt(i2))) {
                        this.f82098d.addView(l);
                    }
                    m99014E().mo80297a(e, c, i3);
                }
            }
        }
    }

    /* renamed from: E */
    private final C33697a m99014E() {
        C33697a aVar = this.f82099e;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalArgumentException("Must provide FormManager".toString());
    }

    private final boolean getHasHeader() {
        View childAt = this.f82098d.getChildAt(0);
        return C41536l.m120484d(childAt != null ? childAt.getTag() : null, "header");
    }

    public final C33697a getBaseFormManager() {
        return this.f82099e;
    }

    public final <T extends C33702d> void setFormManager(C33697a aVar) {
        C33697a aVar2 = this.f82099e;
        if (!C41536l.m120484d(aVar2, aVar)) {
            if (aVar2 != null) {
                aVar2.deleteObserver(this);
            }
            if (aVar != null) {
                aVar.addObserver(this);
            }
            this.f82099e = aVar;
            m99013D();
        }
    }

    public final void setHeader(View view) {
        if (getHasHeader()) {
            this.f82098d.removeViewAt(0);
        }
        if (view != null) {
            view.setTag("header");
            this.f82098d.addView(view, 0);
        }
    }

    public void update(Observable observable, Object obj) {
        C41536l.m120489i(observable, "o");
        m99013D();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FormLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FormLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView((View) linearLayout, (ViewGroup.LayoutParams) f82097f.m99016b());
        this.f82098d = linearLayout;
    }
}
