package p341ge.bog.designsystem.components.amountbadge;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p352ak.C10023u0;
import p406eh.C12471a;
import p615tg.C17961b;

/* renamed from: ge.bog.designsystem.components.amountbadge.AmountSignBigBadgeView */
public final class AmountSignBigBadgeView extends LayerView {

    /* renamed from: d */
    private final C10023u0 f38772d;

    /* renamed from: e */
    private String f38773e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AmountSignBigBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final void m49565b(AmountSignBigBadgeView amountSignBigBadgeView, View view) {
        C41536l.m120489i(amountSignBigBadgeView, "this$0");
        amountSignBigBadgeView.callOnClick();
    }

    public final String getSign() {
        return this.f38773e;
    }

    public final void setSign(String str) {
        C41536l.m120489i(str, C11755a.C11756a.f34100b);
        this.f38773e = str;
        this.f38772d.f27604e.setText(C17961b.f51154a.mo45631a(str));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AmountSignBigBadgeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AmountSignBigBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        C10023u0 c = C10023u0.m36763c(LayoutInflater.from(context), this);
        C41536l.m120488h(c, "inflate(LayoutInflater.from(context), this)");
        this.f38772d = c;
        setDuplicateParentStateEnabled(false);
        c.f27606g.setOnClickListener(new C12471a(this));
        this.f38773e = "";
    }
}
