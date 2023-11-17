package p341ge.bog.designsystem.components.productheader;

import af1.C40303i;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.appcompat.widget.AppCompatTextView;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41551a;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import p341ge.bog.designsystem.components.Amount;
import p341ge.bog.designsystem.components.badgecontainer.BadgeContainer;
import p341ge.bog.designsystem.components.infobadge.InfoBadgeView;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p352ak.C9974n2;
import p394dj.C12137f;
import p561pi.C17365a;
import p561pi.C17367b;
import p601sg.C17777b;
import p601sg.C17786k;
import p601sg.C17787l;
import p615tg.C17961b;
import p642vh.C18368l;

/* renamed from: ge.bog.designsystem.components.productheader.ClearProductHeaderView */
public final class ClearProductHeaderView extends LayerView {

    /* renamed from: g */
    static final /* synthetic */ C40303i[] f40191g = {C41520a0.m120439e(new C41539o(ClearProductHeaderView.class, "data", "getData()Lge/bog/designsystem/components/productheader/ProductHeaderData;", 0))};
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C9974n2 f40192d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C17367b f40193e;

    /* renamed from: f */
    private final C41555e f40194f;

    /* renamed from: ge.bog.designsystem.components.productheader.ClearProductHeaderView$a */
    public static final class C13481a extends C41553c {

        /* renamed from: a */
        final /* synthetic */ ClearProductHeaderView f40195a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13481a(Object obj, ClearProductHeaderView clearProductHeaderView) {
            super(obj);
            this.f40195a = clearProductHeaderView;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            boolean z;
            C41536l.m120489i(iVar, "property");
            C12137f fVar = (C12137f) obj2;
            if (!C41536l.m120484d((C12137f) obj, fVar) && fVar != null) {
                this.f40195a.f40192d.f27308g.setText(fVar.mo32355b());
                AppCompatTextView appCompatTextView = this.f40195a.f40192d.f27306e;
                C17367b c = this.f40195a.f40193e;
                String bigDecimal = fVar.mo32356c().mo34590d().toString();
                C41536l.m120488h(bigDecimal, "headerData.totalAmount.amount.toString()");
                appCompatTextView.setText(C17365a.C17366a.m60762a(c, bigDecimal, (String) null, C17961b.f51154a.mo45631a(fVar.mo32356c().mo34592e()), 2, (Object) null));
                this.f40195a.f40192d.f27307f.removeAllViews();
                List a = fVar.mo32354a();
                if (a == null || a.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    this.f40195a.f40192d.f27307f.setVisibility(0);
                    for (Amount amount : fVar.mo32354a()) {
                        BigDecimal a2 = amount.mo34588a();
                        String b = amount.mo34589b();
                        BadgeContainer badgeContainer = this.f40195a.f40192d.f27307f;
                        ClearProductHeaderView clearProductHeaderView = this.f40195a;
                        String bigDecimal2 = a2.toString();
                        C41536l.m120488h(bigDecimal2, "amount.toString()");
                        badgeContainer.addView(clearProductHeaderView.m50596d(bigDecimal2, b));
                    }
                    return;
                }
                this.f40195a.f40192d.f27307f.setVisibility(8);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ClearProductHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final InfoBadgeView m50596d(String str, String str2) {
        Context context = this.f40192d.mo3946b().getContext();
        C41536l.m120488h(context, "binding.root.context");
        InfoBadgeView infoBadgeView = new InfoBadgeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        infoBadgeView.setType(InfoBadgeView.C13346b.INTERACTIVE_CURRENCY_BADGE_LARGE);
        InfoBadgeView.m50233e(infoBadgeView, (String) null, str, str2, 1, (Object) null);
        return infoBadgeView;
    }

    public final C12137f getData() {
        return (C12137f) this.f40194f.getValue(this, f40191g[0]);
    }

    public final void setData(C12137f fVar) {
        this.f40194f.setValue(this, f40191g[0], fVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ClearProductHeaderView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClearProductHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        C9974n2 d = C9974n2.m36584d(LayoutInflater.from(context), this, true);
        C41536l.m120488h(d, "inflate(LayoutInflater.from(context), this, true)");
        this.f40192d = d;
        C17367b bVar = new C17367b((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
        bVar.mo44810m("###,##0.00");
        this.f40193e = bVar;
        C41551a aVar = C41551a.f97718a;
        this.f40194f = new C13481a((Object) null, this);
        setLayerStyle(C17786k.f49821D);
        setBackgroundColor(C18368l.m62755d(context, C17777b.f49596k));
        int[] iArr = C17787l.f50203Y2;
        C41536l.m120488h(iArr, "ClearProductHeaderView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        AppCompatTextView appCompatTextView = d.f27308g;
        String string = obtainStyledAttributes.getString(C17787l.f50218Z2);
        appCompatTextView.setText(string == null ? "" : string);
        obtainStyledAttributes.recycle();
    }
}
