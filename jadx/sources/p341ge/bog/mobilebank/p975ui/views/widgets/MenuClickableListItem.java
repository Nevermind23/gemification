package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import g91.C32335t0;
import g91.C32343x;
import g91.C32355x0;
import he1.C41217g;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.textbadge.TextBadgeView;
import p366bk.C10316e;
import p366bk.C10318g;
import p642vh.C18368l;
import p90.C27414r7;
import ue1.C43064a;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.MenuClickableListItem */
public final class MenuClickableListItem extends FrameLayout {
    private final C41217g binding$delegate;
    private final int defaultTextColorId;

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.MenuClickableListItem$a */
    static final class C35747a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Context f86381d;

        /* renamed from: e */
        final /* synthetic */ MenuClickableListItem f86382e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35747a(Context context, MenuClickableListItem menuClickableListItem) {
            super(0);
            this.f86381d = context;
            this.f86382e = menuClickableListItem;
        }

        /* renamed from: b */
        public final C27414r7 invoke() {
            return C27414r7.m84963d(LayoutInflater.from(this.f86381d), this.f86382e, true);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MenuClickableListItem(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    private final C27414r7 getBinding() {
        return (C27414r7) this.binding$delegate.getValue();
    }

    public static /* synthetic */ void setUpItem$default(MenuClickableListItem menuClickableListItem, String str, int i, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        if ((i2 & 8) != 0) {
            z2 = false;
        }
        menuClickableListItem.setUpItem(str, i, z, z2);
    }

    public final void setUpItem(String str, int i) {
        setUpItem$default(this, str, i, false, false, 12, (Object) null);
    }

    public final void showDivider(boolean z) {
        View view = getBinding().f69696e;
        C41536l.m120488h(view, "binding.bottomDivider");
        C32343x.m95483r1(view, z, false, 2, (Object) null);
    }

    public final void showNewBadge(boolean z) {
        TextBadgeView textBadgeView = getBinding().f69699h;
        C41536l.m120488h(textBadgeView, "binding.newBadge");
        C32343x.m95483r1(textBadgeView, z, false, 2, (Object) null);
    }

    public final void showNotification(boolean z, int i) {
        boolean z2;
        AppCompatTextView appCompatTextView = getBinding().f69700i;
        C41536l.m120488h(appCompatTextView, "binding.tabImageNotification");
        if (!z || i <= 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        C32343x.m95483r1(appCompatTextView, z2, false, 2, (Object) null);
        String valueOf = String.valueOf(i);
        if (valueOf.length() >= 3) {
            valueOf = "99+";
        }
        getBinding().f69700i.setText(valueOf);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MenuClickableListItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    public final void setUpItem(String str, int i, boolean z) {
        setUpItem$default(this, str, i, z, false, 8, (Object) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MenuClickableListItem(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final void setUpItem(String str, int i, boolean z, boolean z2) {
        ColorStateList colorStateList;
        getBinding().f69698g.setText(str);
        getBinding().f69697f.setImageResource(i);
        AppCompatImageView appCompatImageView = getBinding().f69697f;
        if (z2 || (C32335t0.m95361f() == 0 && !z)) {
            colorStateList = null;
        } else {
            Context context = getContext();
            C41536l.m120488h(context, "context");
            colorStateList = ColorStateList.valueOf(C18368l.m62755d(context, C10316e.f28613r));
        }
        appCompatImageView.setImageTintList(colorStateList);
        getBinding().f69698g.setTextColor(C32355x0.m95514e(this.defaultTextColorId, getContext()));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MenuClickableListItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        this.binding$delegate = C41219i.m119470b(new C35747a(context, this));
        this.defaultTextColorId = C10318g.color_invert_component_tr_300;
    }
}
