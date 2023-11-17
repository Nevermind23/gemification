package p341ge.bog.designsystem.components.creditcard.badge;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.core.content.C0767a;
import ie1.C41315d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.notificationbadges.BadgeRelativeLayout;
import p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView;
import p352ak.C10004r2;
import p601sg.C17777b;
import p601sg.C17778c;
import p601sg.C17787l;
import p642vh.C18368l;
import p669xh.C18763a;

/* renamed from: ge.bog.designsystem.components.creditcard.badge.CreditCardsBadgeView */
public final class CreditCardsBadgeView extends LinearLayout {

    /* renamed from: d */
    public static final C13276a f39246d = new C13276a((DefaultConstructorMarker) null);

    /* renamed from: ge.bog.designsystem.components.creditcard.badge.CreditCardsBadgeView$a */
    public static final class C13276a {
        private C13276a() {
        }

        public /* synthetic */ C13276a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final C18763a m49980b(String str) {
            for (C18763a aVar : C18763a.values()) {
                if (C40439w.m117115s(str, aVar.name(), true)) {
                    return aVar;
                }
            }
            return null;
        }
    }

    /* renamed from: ge.bog.designsystem.components.creditcard.badge.CreditCardsBadgeView$b */
    public static final class C13277b implements C41315d0 {

        /* renamed from: a */
        final /* synthetic */ Iterable f39247a;

        public C13277b(Iterable iterable) {
            this.f39247a = iterable;
        }

        /* renamed from: a */
        public Object mo35461a(Object obj) {
            return (C18763a) obj;
        }

        /* renamed from: b */
        public Iterator mo35462b() {
            return this.f39247a.iterator();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CreditCardsBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    public final void setCards(Map<C18763a, Integer> map) {
        C41536l.m120489i(map, "cards");
        removeAllViews();
        int size = map.size();
        LayoutInflater from = LayoutInflater.from(getContext());
        int i = 0;
        for (T next : map.entrySet()) {
            int i2 = i + 1;
            if (i < 0) {
                C41341q.m119917t();
            }
            Map.Entry entry = (Map.Entry) next;
            C18763a aVar = (C18763a) entry.getKey();
            int intValue = ((Number) entry.getValue()).intValue();
            C10004r2 d = C10004r2.m36693d(from, this, true);
            C41536l.m120488h(d, "inflate(inflater, this, true)");
            NotificationBadgeView badgeView = d.f27461e.getBadgeView();
            badgeView.setBadgeColor(Integer.valueOf(C0767a.m2893c(badgeView.getContext(), C17778c.color_support_first_solid_df_500)));
            Context context = badgeView.getContext();
            C41536l.m120488h(context, "context");
            badgeView.setBorderColor(Integer.valueOf(C18368l.m62755d(context, C17777b.f49595j)));
            badgeView.setBadge(new NotificationBadgeView.BadgeType.Number(intValue));
            boolean z = intValue > 1;
            if (!z) {
                d.f27461e.setBadgeHideFlag(8);
                if (i == size - 1) {
                    BadgeRelativeLayout badgeRelativeLayout = d.f27461e;
                    C41536l.m120488h(badgeRelativeLayout, "binding.badgeLayout");
                    badgeRelativeLayout.setPadding(badgeRelativeLayout.getPaddingLeft(), 0, 0, badgeRelativeLayout.getPaddingBottom());
                } else {
                    BadgeRelativeLayout badgeRelativeLayout2 = d.f27461e;
                    C41536l.m120488h(badgeRelativeLayout2, "binding.badgeLayout");
                    badgeRelativeLayout2.setPadding(badgeRelativeLayout2.getPaddingLeft(), 0, badgeRelativeLayout2.getPaddingRight(), badgeRelativeLayout2.getPaddingBottom());
                }
            }
            d.f27461e.setBadgeVisible(z);
            d.f27462f.setImageResource(aVar.mo46549b());
            i = i2;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CreditCardsBadgeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreditCardsBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        setOrientation(0);
        setGravity(80);
        int[] iArr = C17787l.f49934G3;
        C41536l.m120488h(iArr, "CreditCardsBadgeView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        String string = obtainStyledAttributes.getString(C17787l.f49949H3);
        if (string != null) {
            C41536l.m120488h(string, "cards");
            List<String> x0 = C40440x.m117182x0(string, new String[]{","}, false, 0, 6, (Object) null);
            ArrayList arrayList = new ArrayList();
            for (String P0 : x0) {
                C18763a a = f39246d.m49980b(C40440x.m117146P0(P0).toString());
                if (a != null) {
                    arrayList.add(a);
                }
            }
            setCards((List<? extends C18763a>) arrayList);
        }
        obtainStyledAttributes.recycle();
    }

    public final void setCards(List<? extends C18763a> list) {
        C41536l.m120489i(list, "cards");
        setCards((Map<C18763a, Integer>) C41319f0.m119699a(new C13277b(list)));
    }
}
