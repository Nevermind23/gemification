package p341ge.bog.designsystem.components.textselectorcard;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.core.content.C0767a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.notificationbadges.BadgeRelativeLayout;
import p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView;
import p352ak.C9898d6;
import p601sg.C17777b;
import p601sg.C17778c;
import p601sg.C17779d;
import p601sg.C17780e;
import p615tg.C17964e;
import p642vh.C18368l;

/* renamed from: ge.bog.designsystem.components.textselectorcard.TextSelectorCardView */
public final class TextSelectorCardView extends BadgeRelativeLayout {

    /* renamed from: j */
    private final C9898d6 f40459j;

    /* renamed from: k */
    private C13543a f40460k;

    /* renamed from: ge.bog.designsystem.components.textselectorcard.TextSelectorCardView$a */
    public interface C13543a {
        /* renamed from: a */
        void mo36946a(TextSelectorCardView textSelectorCardView, boolean z);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TextSelectorCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    public boolean performClick() {
        boolean performClick = super.performClick();
        setSelected(!isSelected());
        return performClick;
    }

    public final void setLine1(Object... objArr) {
        C41536l.m120489i(objArr, "data");
        this.f40459j.f26916e.setText(C17964e.m61890c(C41333m.m119788O(objArr)));
    }

    public final void setLine2(Object... objArr) {
        C41536l.m120489i(objArr, "data");
        this.f40459j.f26917f.setText(C17964e.m61890c(C41333m.m119788O(objArr)));
    }

    public final void setLine3Text1(Object... objArr) {
        C41536l.m120489i(objArr, "data");
        this.f40459j.f26918g.setText(C17964e.m61890c(C41333m.m119788O(objArr)));
    }

    public final void setLine3Text2(Object... objArr) {
        C41536l.m120489i(objArr, "data");
        this.f40459j.f26919h.setText(C17964e.m61890c(C41333m.m119788O(objArr)));
    }

    public final void setLine4(Object... objArr) {
        C41536l.m120489i(objArr, "data");
        this.f40459j.f26920i.setText(C17964e.m61890c(C41333m.m119788O(objArr)));
    }

    public final void setOnSelectionChangeListener(C13543a aVar) {
        this.f40460k = aVar;
    }

    public void setSelected(boolean z) {
        super.setSelected(z);
        setBadgeVisible(z);
        C13543a aVar = this.f40460k;
        if (aVar != null) {
            aVar.mo36946a(this, z);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextSelectorCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextSelectorCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        C9898d6 d = C9898d6.m36306d(LayoutInflater.from(context), this, true);
        C41536l.m120488h(d, "inflate(LayoutInflater.from(context), this, true)");
        this.f40459j = d;
        setInnerAlign(true);
        setClickable(true);
        Resources resources = getResources();
        int i2 = C17779d.spacing_2;
        setHorizontalOffset(-resources.getDimensionPixelSize(i2));
        setVerticalOffset(-getResources().getDimensionPixelSize(i2));
        setBadgeVisible(isSelected());
        NotificationBadgeView badgeView = getBadgeView();
        badgeView.setBadge(new NotificationBadgeView.BadgeType.Icon(C17780e.f49647B, 0, 0, 0, 14, (DefaultConstructorMarker) null));
        badgeView.setBadgeColor(Integer.valueOf(C0767a.m2893c(context, C17778c.f49617S)));
        badgeView.setBorderColor(Integer.valueOf(C18368l.m62755d(context, C17777b.f49595j)));
    }
}
