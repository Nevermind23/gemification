package p341ge.bog.designsystem.components.notificationbadges;

import af1.C40303i;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41551a;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import p601sg.C17787l;
import p642vh.C18365j0;
import ue1.C43075l;

/* renamed from: ge.bog.designsystem.components.notificationbadges.BadgeRelativeLayout */
public class BadgeRelativeLayout extends RelativeLayout {

    /* renamed from: i */
    static final /* synthetic */ C40303i[] f39861i;

    /* renamed from: d */
    private final NotificationBadgeView f39862d;

    /* renamed from: e */
    private final C41555e f39863e;

    /* renamed from: f */
    private final C41555e f39864f;

    /* renamed from: g */
    private final C18365j0 f39865g;

    /* renamed from: h */
    private boolean f39866h;

    /* renamed from: ge.bog.designsystem.components.notificationbadges.BadgeRelativeLayout$a */
    public static final class C13396a extends C41553c {

        /* renamed from: a */
        final /* synthetic */ BadgeRelativeLayout f39867a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13396a(Object obj, BadgeRelativeLayout badgeRelativeLayout) {
            super(obj);
            this.f39867a = badgeRelativeLayout;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            int intValue = ((Number) obj2).intValue();
            if (((Number) obj).intValue() == intValue) {
                return;
            }
            if (this.f39867a.getInnerAlign()) {
                NotificationBadgeView badgeView = this.f39867a.getBadgeView();
                int verticalOffset = this.f39867a.getVerticalOffset();
                ViewGroup.LayoutParams layoutParams = badgeView.getLayoutParams();
                if (layoutParams != null) {
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                    layoutParams2.setMargins(0, verticalOffset, intValue, 0);
                    badgeView.setLayoutParams(layoutParams2);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            }
            NotificationBadgeView badgeView2 = this.f39867a.getBadgeView();
            int verticalOffset2 = this.f39867a.getVerticalOffset();
            ViewGroup.LayoutParams layoutParams3 = badgeView2.getLayoutParams();
            if (layoutParams3 != null) {
                RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
                layoutParams4.setMargins(intValue, 0, 0, verticalOffset2);
                badgeView2.setLayoutParams(layoutParams4);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
    }

    /* renamed from: ge.bog.designsystem.components.notificationbadges.BadgeRelativeLayout$b */
    public static final class C13397b extends C41553c {

        /* renamed from: a */
        final /* synthetic */ BadgeRelativeLayout f39868a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13397b(Object obj, BadgeRelativeLayout badgeRelativeLayout) {
            super(obj);
            this.f39868a = badgeRelativeLayout;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            int intValue = ((Number) obj2).intValue();
            if (((Number) obj).intValue() == intValue) {
                return;
            }
            if (this.f39868a.getInnerAlign()) {
                NotificationBadgeView badgeView = this.f39868a.getBadgeView();
                int horizontalOffset = this.f39868a.getHorizontalOffset();
                ViewGroup.LayoutParams layoutParams = badgeView.getLayoutParams();
                if (layoutParams != null) {
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                    layoutParams2.setMargins(0, intValue, horizontalOffset, 0);
                    badgeView.setLayoutParams(layoutParams2);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            }
            NotificationBadgeView badgeView2 = this.f39868a.getBadgeView();
            int horizontalOffset2 = this.f39868a.getHorizontalOffset();
            ViewGroup.LayoutParams layoutParams3 = badgeView2.getLayoutParams();
            if (layoutParams3 != null) {
                RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
                layoutParams4.setMargins(horizontalOffset2, 0, 0, intValue);
                badgeView2.setLayoutParams(layoutParams4);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
    }

    static {
        Class<BadgeRelativeLayout> cls = BadgeRelativeLayout.class;
        f39861i = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "horizontalOffset", "getHorizontalOffset()I", 0)), C41520a0.m120439e(new C41539o(cls, "verticalOffset", "getVerticalOffset()I", 0)), C41520a0.m120439e(new C41539o(cls, "isBadgeVisible", "isBadgeVisible()Z", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BadgeRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* renamed from: a */
    public final boolean mo36202a() {
        return this.f39865g.getValue(this, f39861i[2]).booleanValue();
    }

    public final NotificationBadgeView getBadgeView() {
        return this.f39862d;
    }

    public final int getHorizontalOffset() {
        return ((Number) this.f39863e.getValue(this, f39861i[0])).intValue();
    }

    /* access modifiers changed from: protected */
    public final boolean getInnerAlign() {
        return this.f39866h;
    }

    public final int getVerticalOffset() {
        return ((Number) this.f39864f.getValue(this, f39861i[1])).intValue();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        boolean z = true;
        if (getChildCount() != 1) {
            z = false;
        }
        if (z) {
            View childAt = getChildAt(0);
            if (childAt.getId() == -1) {
                childAt.setId(View.generateViewId());
            }
            ViewGroup.LayoutParams layoutParams = this.f39862d.getLayoutParams();
            C41536l.m120487g(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            if (this.f39866h) {
                layoutParams2.setMargins(0, getVerticalOffset(), getHorizontalOffset(), 0);
                layoutParams2.addRule(6, childAt.getId());
                layoutParams2.addRule(19, childAt.getId());
            } else {
                layoutParams2.setMargins(getHorizontalOffset(), 0, 0, getVerticalOffset());
                layoutParams2.addRule(2, childAt.getId());
                layoutParams2.addRule(17, childAt.getId());
            }
            addView(this.f39862d, layoutParams2);
            return;
        }
        throw new IllegalArgumentException("BadgeLayout must have one child".toString());
    }

    public final void setBadgeHideFlag(int i) {
        this.f39865g.mo46150b(i);
    }

    public final void setBadgeVisible(boolean z) {
        this.f39865g.mo46151c(this, f39861i[2], z);
    }

    public final void setHorizontalOffset(int i) {
        this.f39863e.setValue(this, f39861i[0], Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    public final void setInnerAlign(boolean z) {
        this.f39866h = z;
    }

    public final void setVerticalOffset(int i) {
        this.f39864f.setValue(this, f39861i[1], Integer.valueOf(i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BadgeRelativeLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BadgeRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        NotificationBadgeView notificationBadgeView = new NotificationBadgeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        notificationBadgeView.setLayoutParams(generateDefaultLayoutParams());
        this.f39862d = notificationBadgeView;
        C41551a aVar = C41551a.f97718a;
        this.f39863e = new C13396a(0, this);
        this.f39864f = new C13397b(0, this);
        this.f39865g = new C18365j0(notificationBadgeView, 4, (C43075l) null, 4, (DefaultConstructorMarker) null);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C17787l.f50611y0, 0, 0);
        try {
            this.f39866h = obtainStyledAttributes.getBoolean(C17787l.f49841A0, false);
            setBadgeVisible(obtainStyledAttributes.getBoolean(C17787l.f49856B0, true));
            setHorizontalOffset(obtainStyledAttributes.getDimensionPixelSize(C17787l.f50626z0, 0));
            setVerticalOffset(obtainStyledAttributes.getDimensionPixelSize(C17787l.f49871C0, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
