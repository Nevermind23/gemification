package p341ge.bog.designsystem.components.emptywidget;

import af1.C40303i;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.C1314o;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.common.EmptyView;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView;
import p352ak.C9911f3;
import p601sg.C17778c;
import p601sg.C17779d;
import p601sg.C17786k;
import p601sg.C17787l;
import p642vh.C18351c0;
import p642vh.C18355e0;
import p642vh.C18356f;
import p642vh.C18365j0;
import p642vh.C18385v;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.designsystem.components.emptywidget.EmptyWidget */
public class EmptyWidget<Left extends View> extends LayerView {

    /* renamed from: p */
    static final /* synthetic */ C40303i[] f39486p;

    /* renamed from: d */
    private final C9911f3 f39487d;

    /* renamed from: e */
    private final C18355e0 f39488e;

    /* renamed from: f */
    private final C18355e0 f39489f;

    /* renamed from: g */
    private final C18356f f39490g;

    /* renamed from: h */
    private final C18385v f39491h;

    /* renamed from: i */
    private final C18351c0 f39492i;

    /* renamed from: j */
    private final C18351c0 f39493j;

    /* renamed from: k */
    private final C18365j0 f39494k;

    /* renamed from: l */
    private boolean f39495l;

    /* renamed from: m */
    private C13331a f39496m;

    /* renamed from: n */
    private boolean f39497n;

    /* renamed from: o */
    private boolean f39498o;

    /* renamed from: ge.bog.designsystem.components.emptywidget.EmptyWidget$a */
    public enum C13331a {
        BIG(0),
        SMALL(1);
        

        /* renamed from: e */
        public static final C13332a f39499e = null;

        /* renamed from: d */
        private final int f39503d;

        /* renamed from: ge.bog.designsystem.components.emptywidget.EmptyWidget$a$a */
        public static final class C13332a {
            private C13332a() {
            }

            public /* synthetic */ C13332a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C13331a mo35744a(int i) {
                C13331a aVar;
                boolean z;
                C13331a[] values = C13331a.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        aVar = null;
                        break;
                    }
                    aVar = values[i2];
                    if (aVar.mo35743b() == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        break;
                    }
                    i2++;
                }
                if (aVar == null) {
                    return C13331a.BIG;
                }
                return aVar;
            }
        }

        static {
            f39499e = new C13332a((DefaultConstructorMarker) null);
        }

        private C13331a(int i) {
            this.f39503d = i;
        }

        /* renamed from: b */
        public final int mo35743b() {
            return this.f39503d;
        }
    }

    static {
        Class<EmptyWidget> cls = EmptyWidget.class;
        f39486p = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "title", "getTitle()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "text", "getText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "leftItemView", "getLeftItemView()Landroid/view/View;", 0)), C41520a0.m120439e(new C41539o(cls, "rightItemView", "getRightItemView()Ljava/util/List;", 0)), C41520a0.m120439e(new C41539o(cls, "titleTextColor", "getTitleTextColor()Lge/bog/designsystem/components/common/Color;", 0)), C41520a0.m120439e(new C41539o(cls, "descriptionTextColor", "getDescriptionTextColor()Lge/bog/designsystem/components/common/Color;", 0)), C41520a0.m120439e(new C41539o(cls, "isVisibleNotificationBadge", "isVisibleNotificationBadge()Z", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EmptyWidget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!this.f39498o) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalArgumentException();
    }

    public final Color getDescriptionTextColor() {
        return this.f39493j.getValue(this, f39486p[5]);
    }

    public final boolean getEnableMultiLineSubtitle() {
        return this.f39497n;
    }

    public final boolean getEnableTwoLineText() {
        return this.f39495l;
    }

    public final Left getLeftItemView() {
        return this.f39490g.getValue(this, f39486p[2]);
    }

    public final NotificationBadgeView getNotificationBadge() {
        NotificationBadgeView notificationBadgeView = this.f39487d.f26987j;
        C41536l.m120488h(notificationBadgeView, "binding.notificationBadge");
        return notificationBadgeView;
    }

    public final List<View> getRightItemView() {
        return this.f39491h.getValue(this, f39486p[3]);
    }

    public final C13331a getState() {
        return this.f39496m;
    }

    public final CharSequence getText() {
        return this.f39489f.getValue(this, f39486p[1]);
    }

    public final CharSequence getTitle() {
        return this.f39488e.getValue(this, f39486p[0]);
    }

    public final Color getTitleTextColor() {
        return this.f39492i.getValue(this, f39486p[4]);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super.onFinishInflate();
        int childCount = getChildCount();
        ArrayList arrayList = new ArrayList();
        int i = 1;
        while (true) {
            View view = null;
            int i2 = 0;
            if (i < childCount) {
                View childAt = getChildAt(1);
                removeView(childAt);
                if (!(childAt instanceof EmptyView)) {
                    if (i == 1) {
                        if (childAt != null) {
                            view = childAt;
                        }
                        setLeftItemView(view);
                    } else {
                        if (i <= 6 && 2 <= i) {
                            i2 = 1;
                        }
                        if (i2 != 0) {
                            C41536l.m120488h(childAt, "child");
                            arrayList.add(childAt);
                        } else {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                i++;
            } else {
                int dimensionPixelSize = getResources().getDimensionPixelSize(C17779d.f49645S1);
                for (Object next : arrayList) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        C41341q.m119917t();
                    }
                    View view2 = (View) next;
                    if (i2 < arrayList.size() - 1) {
                        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        } else {
                            marginLayoutParams = null;
                        }
                        if (marginLayoutParams != null) {
                            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, dimensionPixelSize, marginLayoutParams.bottomMargin);
                        }
                    }
                    i2 = i3;
                }
                setRightItemView(arrayList);
                this.f39498o = true;
                return;
            }
        }
    }

    public final void setDescriptionTextColor(Color color) {
        C41536l.m120489i(color, "<set-?>");
        this.f39493j.setValue(this, f39486p[5], color);
    }

    public final void setEnableMultiLineSubtitle(boolean z) {
        this.f39497n = z;
        if (z) {
            this.f39487d.f26983f.setMaxLines(2);
        } else {
            this.f39487d.f26983f.setMaxLines(1);
        }
    }

    public final void setEnableTwoLineText(boolean z) {
        this.f39495l = z;
        if (z) {
            this.f39487d.f26983f.setVisibility(0);
        } else {
            this.f39487d.f26983f.setVisibility(8);
        }
        requestLayout();
    }

    public final void setLeftItemView(Left left) {
        this.f39490g.setValue(this, f39486p[2], left);
    }

    public final void setRightItemView(List<? extends View> list) {
        this.f39491h.setValue(this, f39486p[3], list);
    }

    public final void setState(C13331a aVar) {
        int i;
        C41536l.m120489i(aVar, C11755a.C11756a.f34100b);
        this.f39496m = aVar;
        AppCompatTextView appCompatTextView = this.f39487d.f26989l;
        if (aVar == C13331a.SMALL) {
            i = C17786k.TextTitle2;
        } else {
            i = C17786k.f49832p1;
        }
        C1314o.m4575q(appCompatTextView, i);
    }

    public final void setText(CharSequence charSequence) {
        this.f39489f.setValue(this, f39486p[1], charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        this.f39488e.setValue(this, f39486p[0], charSequence);
    }

    public final void setTitleTextColor(Color color) {
        C41536l.m120489i(color, "<set-?>");
        this.f39492i.setValue(this, f39486p[4], color);
    }

    public final void setVisibleNotificationBadge(boolean z) {
        this.f39494k.mo46151c(this, f39486p[6], z);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EmptyWidget(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmptyWidget(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        C41536l.m120489i(context2, "context");
        C9911f3 c = C9911f3.m36356c(LayoutInflater.from(context), this);
        C41536l.m120488h(c, "inflate(\n        LayoutI…from(context), this\n    )");
        this.f39487d = c;
        AppCompatTextView appCompatTextView = c.f26989l;
        C41536l.m120488h(appCompatTextView, "binding.titleText");
        this.f39488e = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        AppCompatTextView appCompatTextView2 = c.f26983f;
        C41536l.m120488h(appCompatTextView2, "binding.descriptionText");
        this.f39489f = new C18355e0(appCompatTextView2, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        FrameLayout frameLayout = c.f26984g;
        C41536l.m120488h(frameLayout, "binding.leftViewContainer");
        this.f39490g = new C18356f(frameLayout, false, false, 6, (DefaultConstructorMarker) null);
        LinearLayout linearLayout = c.f26988k;
        C41536l.m120488h(linearLayout, "binding.rightViewContainer");
        this.f39491h = new C18385v(linearLayout, false, false, 6, (DefaultConstructorMarker) null);
        AppCompatTextView appCompatTextView3 = c.f26989l;
        C41536l.m120488h(appCompatTextView3, "binding.titleText");
        this.f39492i = new C18351c0(appCompatTextView3);
        AppCompatTextView appCompatTextView4 = c.f26983f;
        C41536l.m120488h(appCompatTextView4, "binding.descriptionText");
        this.f39493j = new C18351c0(appCompatTextView4);
        NotificationBadgeView notificationBadgeView = c.f26987j;
        C41536l.m120488h(notificationBadgeView, "binding.notificationBadge");
        this.f39494k = new C18365j0(notificationBadgeView, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        this.f39496m = C13331a.BIG;
        setDuplicateParentStateEnabled(true);
        int[] iArr = C17787l.f49935G4;
        C41536l.m120488h(iArr, "EmptyWidget");
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        setTitle(obtainStyledAttributes.getString(C17787l.f50040N4));
        setText(obtainStyledAttributes.getString(C17787l.f49950H4));
        setState(C13331a.f39499e.mo35744a(obtainStyledAttributes.getInt(C17787l.f50025M4, -1)));
        setVisibleNotificationBadge(obtainStyledAttributes.getBoolean(C17787l.f50010L4, false));
        setEnableTwoLineText(obtainStyledAttributes.getBoolean(C17787l.f49995K4, false));
        setEnableMultiLineSubtitle(obtainStyledAttributes.getBoolean(C17787l.f49980J4, false));
        setTitleTextColor(new Color.Resource(obtainStyledAttributes.getResourceId(C17787l.f50055O4, C17778c.f49634s)));
        setDescriptionTextColor(new Color.Resource(obtainStyledAttributes.getResourceId(C17787l.f49965I4, C17778c.f49635t)));
        obtainStyledAttributes.recycle();
    }
}
