package p341ge.bog.designsystem.components.list;

import af1.C40303i;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.EmptyView;
import p352ak.C10040w3;
import p601sg.C17787l;
import p642vh.C18356f;
import p642vh.C18365j0;
import ue1.C43075l;

/* renamed from: ge.bog.designsystem.components.list.ListItem */
public class ListItem<Left extends View, Middle extends View, Right extends View, Bottom extends View> extends FrameLayout {

    /* renamed from: n */
    static final /* synthetic */ C40303i[] f39682n;

    /* renamed from: d */
    private final C10040w3 f39683d;

    /* renamed from: e */
    private final C18356f f39684e;

    /* renamed from: f */
    private final C18356f f39685f;

    /* renamed from: g */
    private final C18356f f39686g;

    /* renamed from: h */
    private final C18356f f39687h;

    /* renamed from: i */
    private final C18365j0 f39688i;

    /* renamed from: j */
    private final C18365j0 f39689j;

    /* renamed from: k */
    private final C18365j0 f39690k;

    /* renamed from: l */
    private final C18365j0 f39691l;

    /* renamed from: m */
    private boolean f39692m;

    static {
        Class<ListItem> cls = ListItem.class;
        f39682n = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "leftItemView", "getLeftItemView()Landroid/view/View;", 0)), C41520a0.m120439e(new C41539o(cls, "middleItemView", "getMiddleItemView()Landroid/view/View;", 0)), C41520a0.m120439e(new C41539o(cls, "rightItemView", "getRightItemView()Landroid/view/View;", 0)), C41520a0.m120439e(new C41539o(cls, "bottomItemView", "getBottomItemView()Landroid/view/View;", 0)), C41520a0.m120439e(new C41539o(cls, "isVisibleLeftItemView", "isVisibleLeftItemView()Z", 0)), C41520a0.m120439e(new C41539o(cls, "isVisibleMiddleItemView", "isVisibleMiddleItemView()Z", 0)), C41520a0.m120439e(new C41539o(cls, "isVisibleRightItemView", "isVisibleRightItemView()Z", 0)), C41520a0.m120439e(new C41539o(cls, "isVisibleBottomItemView", "isVisibleBottomItemView()Z", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ListItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!this.f39692m) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalArgumentException();
    }

    public final Bottom getBottomItemView() {
        return this.f39687h.getValue(this, f39682n[3]);
    }

    /* access modifiers changed from: protected */
    public final ViewGroup getHeaderContainer() {
        LinearLayout linearLayout = this.f39683d.f27694f;
        C41536l.m120488h(linearLayout, "binding.headerContainer");
        return linearLayout;
    }

    public final Left getLeftItemView() {
        return this.f39684e.getValue(this, f39682n[0]);
    }

    public final Middle getMiddleItemView() {
        return this.f39685f.getValue(this, f39682n[1]);
    }

    public final Right getRightItemView() {
        return this.f39686g.getValue(this, f39682n[2]);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        int childCount = getChildCount();
        for (int i = 1; i < childCount; i++) {
            View childAt = getChildAt(1);
            removeView(childAt);
            if (!(childAt instanceof EmptyView)) {
                if (i == 1) {
                    if (childAt == null) {
                        childAt = null;
                    }
                    setLeftItemView(childAt);
                } else if (i == 2) {
                    if (childAt == null) {
                        childAt = null;
                    }
                    setMiddleItemView(childAt);
                } else if (i == 3) {
                    if (childAt == null) {
                        childAt = null;
                    }
                    setRightItemView(childAt);
                } else if (i == 4) {
                    if (childAt == null) {
                        childAt = null;
                    }
                    setBottomItemView(childAt);
                } else {
                    throw new IllegalArgumentException();
                }
            }
        }
        this.f39692m = true;
    }

    public final void setBottomItemView(Bottom bottom) {
        this.f39687h.setValue(this, f39682n[3], bottom);
    }

    public final void setLeftItemView(Left left) {
        this.f39684e.setValue(this, f39682n[0], left);
    }

    public final void setMiddleItemView(Middle middle) {
        this.f39685f.setValue(this, f39682n[1], middle);
    }

    public final void setRightItemView(Right right) {
        this.f39686g.setValue(this, f39682n[2], right);
    }

    public final void setVisibleBottomItemView(boolean z) {
        this.f39691l.mo46151c(this, f39682n[7], z);
    }

    public final void setVisibleLeftItemView(boolean z) {
        this.f39688i.mo46151c(this, f39682n[4], z);
    }

    public final void setVisibleMiddleItemView(boolean z) {
        this.f39689j.mo46151c(this, f39682n[5], z);
    }

    public final void setVisibleRightItemView(boolean z) {
        this.f39690k.mo46151c(this, f39682n[6], z);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ListItem(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        C10040w3 d = C10040w3.m36825d(LayoutInflater.from(context), this, true);
        C41536l.m120488h(d, "inflate(\n        LayoutI…ontext), this, true\n    )");
        this.f39683d = d;
        FrameLayout frameLayout = d.f27695g;
        C41536l.m120488h(frameLayout, "binding.leftViewContainer");
        this.f39684e = new C18356f(frameLayout, false, false, 6, (DefaultConstructorMarker) null);
        FrameLayout frameLayout2 = d.f27696h;
        C41536l.m120488h(frameLayout2, "binding.middleViewContainer");
        this.f39685f = new C18356f(frameLayout2, false, false, 6, (DefaultConstructorMarker) null);
        FrameLayout frameLayout3 = d.f27697i;
        C41536l.m120488h(frameLayout3, "binding.rightViewContainer");
        this.f39686g = new C18356f(frameLayout3, false, false, 6, (DefaultConstructorMarker) null);
        FrameLayout frameLayout4 = d.f27693e;
        C41536l.m120488h(frameLayout4, "binding.bottomViewContainer");
        this.f39687h = new C18356f(frameLayout4, false, false, 6, (DefaultConstructorMarker) null);
        FrameLayout frameLayout5 = d.f27695g;
        C41536l.m120488h(frameLayout5, "binding.leftViewContainer");
        this.f39688i = new C18365j0(frameLayout5, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        FrameLayout frameLayout6 = d.f27696h;
        C41536l.m120488h(frameLayout6, "binding.middleViewContainer");
        this.f39689j = new C18365j0(frameLayout6, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        FrameLayout frameLayout7 = d.f27697i;
        C41536l.m120488h(frameLayout7, "binding.rightViewContainer");
        this.f39690k = new C18365j0(frameLayout7, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        FrameLayout frameLayout8 = d.f27693e;
        C41536l.m120488h(frameLayout8, "binding.bottomViewContainer");
        this.f39691l = new C18365j0(frameLayout8, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C17787l.f50382j7, 0, 0);
        try {
            int resourceId = obtainStyledAttributes.getResourceId(C17787l.f50414l7, 0);
            int resourceId2 = obtainStyledAttributes.getResourceId(C17787l.f50430m7, 0);
            int resourceId3 = obtainStyledAttributes.getResourceId(C17787l.f50446n7, 0);
            int resourceId4 = obtainStyledAttributes.getResourceId(C17787l.f50398k7, 0);
            obtainStyledAttributes.recycle();
            LayoutInflater from = LayoutInflater.from(context);
            View view = null;
            if (resourceId != 0) {
                View inflate = from.inflate(resourceId, d.f27695g, false);
                setLeftItemView(!(inflate instanceof View) ? null : inflate);
            }
            if (resourceId2 != 0) {
                View inflate2 = from.inflate(resourceId2, d.f27696h, false);
                setMiddleItemView(!(inflate2 instanceof View) ? null : inflate2);
            }
            if (resourceId3 != 0) {
                View inflate3 = from.inflate(resourceId3, d.f27697i, false);
                setRightItemView(!(inflate3 instanceof View) ? null : inflate3);
            }
            if (resourceId4 != 0) {
                View inflate4 = from.inflate(resourceId4, d.f27693e, false);
                setBottomItemView(inflate4 instanceof View ? inflate4 : view);
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
