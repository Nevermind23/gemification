package p341ge.bog.designsystem.components.accountcardclear;

import af1.C40303i;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.C1314o;
import java.math.BigDecimal;
import java.util.Map;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.infobadge.InfoBadgeView;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView;
import p352ak.C9980o0;
import p352ak.C9988p0;
import p561pi.C17367b;
import p601sg.C17779d;
import p601sg.C17780e;
import p601sg.C17786k;
import p601sg.C17787l;
import p615tg.C17961b;
import p642vh.C18355e0;
import p642vh.C18365j0;
import p642vh.C18374m;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.designsystem.components.accountcardclear.AccountCardClearView */
public final class AccountCardClearView extends LayerView {

    /* renamed from: i */
    static final /* synthetic */ C40303i[] f38663i;

    /* renamed from: d */
    private final C9988p0 f38664d;

    /* renamed from: e */
    private final C17367b f38665e;

    /* renamed from: f */
    private final C18374m f38666f;

    /* renamed from: g */
    private final C18355e0 f38667g;

    /* renamed from: h */
    private final C18365j0 f38668h;

    static {
        Class<AccountCardClearView> cls = AccountCardClearView.class;
        f38663i = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "amount", "getAmount()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "title", "getTitle()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "isBadgeVisible", "isBadgeVisible()Z", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AccountCardClearView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* renamed from: a */
    private final void m49443a(Map map) {
        this.f38664d.f27382f.removeAllViews();
        LayoutInflater from = LayoutInflater.from(getContext());
        for (Map.Entry entry : map.entrySet()) {
            boolean booleanValue = ((Boolean) entry.getValue()).booleanValue();
            C9980o0 d = C9980o0.m36604d(from, this.f38664d.f27382f, true);
            C41536l.m120488h(d, "inflate(\n               …       true\n            )");
            InfoBadgeView infoBadgeView = d.f27339e;
            C41536l.m120488h(infoBadgeView, "drawAmountBadges$lambda$3$lambda$2");
            InfoBadgeView.m50233e(infoBadgeView, (String) null, (String) null, (String) entry.getKey(), 3, (Object) null);
            infoBadgeView.setEnabled(booleanValue);
        }
    }

    private final CharSequence getAmount() {
        return this.f38666f.getValue(this, f38663i[0]);
    }

    private final void setAmount(CharSequence charSequence) {
        this.f38666f.setValue(this, f38663i[0], charSequence);
    }

    /* renamed from: b */
    public final void mo34642b(BigDecimal bigDecimal, String str) {
        C41536l.m120489i(bigDecimal, "amount");
        C41536l.m120489i(str, "currency");
        C17367b bVar = this.f38665e;
        String a = C17961b.f51154a.mo45631a(str);
        bVar.mo44801a(" " + a);
        String bigDecimal2 = bigDecimal.toString();
        C41536l.m120488h(bigDecimal2, "amount.toString()");
        setAmount(bigDecimal2);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C41536l.m120488h(drawableState, "states");
        if (C41333m.m119793r(drawableState, 16842919)) {
            setLayerStyle(C17786k.f49833r);
        } else {
            setLayerStyle(C17786k.f49834t);
        }
    }

    public final CharSequence getTitle() {
        return this.f38667g.getValue(this, f38663i[1]);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth(), getResources().getDimensionPixelSize(C17779d.account_card_clear_view_height));
    }

    public final void setAmountBadges(Map<String, Boolean> map) {
        C41536l.m120489i(map, "amountBadges");
        if (!map.isEmpty()) {
            this.f38664d.f27382f.setVisibility(0);
            m49443a(map);
            return;
        }
        this.f38664d.f27382f.setVisibility(8);
    }

    public final void setBadgeVisible(boolean z) {
        this.f38668h.mo46151c(this, f38663i[2], z);
    }

    public final void setTitle(CharSequence charSequence) {
        this.f38667g.setValue(this, f38663i[1], charSequence);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AccountCardClearView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountCardClearView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        C41536l.m120489i(context2, "context");
        C9988p0 d = C9988p0.m36633d(LayoutInflater.from(context), this, true);
        C41536l.m120488h(d, "inflate(\n        LayoutI…ontext), this, true\n    )");
        this.f38664d = d;
        C17367b bVar = new C17367b((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
        bVar.mo44810m("###,##0.00");
        this.f38665e = bVar;
        AppCompatTextView appCompatTextView = d.f27381e;
        C41536l.m120488h(appCompatTextView, "binding.amount");
        this.f38666f = new C18374m(appCompatTextView, bVar);
        TextView textView = d.f27384h;
        C41536l.m120488h(textView, "binding.title");
        this.f38667g = new C18355e0(textView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        NotificationBadgeView notificationBadgeView = d.f27383g;
        C41536l.m120488h(notificationBadgeView, "binding.badge");
        this.f38668h = new C18365j0(notificationBadgeView, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        setClickable(true);
        setBackgroundResource(C17780e.selector_account_card_clear);
        int[] iArr = C17787l.f50278d;
        C41536l.m120488h(iArr, "AccountCardClearView");
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        String string = obtainStyledAttributes.getString(C17787l.f50310f);
        setTitle(string == null ? "" : string);
        setBadgeVisible(obtainStyledAttributes.getBoolean(C17787l.f50294e, false));
        obtainStyledAttributes.recycle();
        C1314o.m4567i(d.f27381e, 1);
    }
}
