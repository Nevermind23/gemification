package p341ge.bog.designsystem.components.navigation.navigationmenu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.notificationbadges.BadgeRelativeLayout;

/* renamed from: ge.bog.designsystem.components.navigation.navigationmenu.NavigationMenuItemLayout */
public final class NavigationMenuItemLayout extends BadgeRelativeLayout implements Checkable {

    /* renamed from: k */
    public static final C13392a f39844k = new C13392a((DefaultConstructorMarker) null);

    /* renamed from: l */
    private static final int[] f39845l = {16843518, 16842912};

    /* renamed from: j */
    private boolean f39846j;

    /* renamed from: ge.bog.designsystem.components.navigation.navigationmenu.NavigationMenuItemLayout$a */
    public static final class C13392a {
        private C13392a() {
        }

        public /* synthetic */ C13392a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NavigationMenuItemLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    public boolean isChecked() {
        return this.f39846j;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (this.f39846j) {
            View.mergeDrawableStates(onCreateDrawableState, f39845l);
        }
        C41536l.m120488h(onCreateDrawableState, "drawableState");
        return onCreateDrawableState;
    }

    public void setChecked(boolean z) {
        if (this.f39846j != z) {
            this.f39846j = z;
            invalidate();
            refreshDrawableState();
        }
    }

    public void toggle() {
        setChecked(!this.f39846j);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NavigationMenuItemLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavigationMenuItemLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
    }
}
