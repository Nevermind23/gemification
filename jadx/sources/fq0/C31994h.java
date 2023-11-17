package fq0;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.TextAppearanceSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lq0.C37124a;
import np0.C37443i;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.provider.InsuranceInfoUiModel;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.insuranceprovider.InsuranceProviderData;
import sp0.C38502u;
import ue1.C43075l;

/* renamed from: fq0.h */
public final class C31994h extends FrameLayout {

    /* renamed from: d */
    private final C38502u f78778d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C31994h(Context context, InsuranceProviderData insuranceProviderData, boolean z, C37124a aVar, C43075l lVar, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, insuranceProviderData, z, aVar, lVar, (i2 & 32) != 0 ? null : attributeSet, (i2 & 64) != 0 ? 0 : i);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final void m94418b(C43075l lVar, InsuranceProviderData insuranceProviderData, View view) {
        C41536l.m120489i(lVar, "$onClick");
        C41536l.m120489i(insuranceProviderData, "$data");
        lVar.invoke(insuranceProviderData.mo73529a());
    }

    /* renamed from: c */
    private final SpannableStringBuilder m94419c(InsuranceInfoUiModel insuranceInfoUiModel, String str) {
        SpannableStringBuilder append = new SpannableStringBuilder().append(str);
        String a = insuranceInfoUiModel.mo73472a();
        return append.append(": " + a, new TextAppearanceSpan(getContext(), C37443i.InsuranceProviderCostAmount), 17);
    }

    /* renamed from: d */
    public final void mo72484d(boolean z) {
        this.f78778d.f92286e.setChecked(z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31994h(Context context, InsuranceProviderData insuranceProviderData, boolean z, C37124a aVar, C43075l lVar, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        C41536l.m120489i(insuranceProviderData, "data");
        C41536l.m120489i(aVar, C11769i.C11770a.f34151n);
        C41536l.m120489i(lVar, "onClick");
        C38502u d = C38502u.m113023d(LayoutInflater.from(context), this, true);
        C41536l.m120488h(d, "inflate(LayoutInflater.from(context), this, true)");
        this.f78778d = d;
        d.f92290i.setText(insuranceProviderData.mo73533e());
        InsuranceInfoUiModel b = insuranceProviderData.mo73530b();
        if (b != null) {
            d.f92288g.setText(m94419c(b, C32343x.m95388F(aVar.mo90096g0(), new Object[0])));
            TextView textView = d.f92288g;
            C41536l.m120488h(textView, "binding.lifeInsuranceTv");
            C32343x.m95447f1(textView);
        }
        InsuranceInfoUiModel d2 = insuranceProviderData.mo73531d();
        if (d2 != null) {
            d.f92291j.setText(m94419c(d2, C32343x.m95388F(aVar.mo90098h0(), new Object[0])));
            TextView textView2 = d.f92291j;
            C41536l.m120488h(textView2, "binding.paymentInsuranceTv");
            C32343x.m95447f1(textView2);
        }
        d.f92286e.setClickable(false);
        View view = d.f92287f;
        C41536l.m120488h(view, "binding.divider");
        C32343x.m95483r1(view, !z, false, 2, (Object) null);
        setTag(insuranceProviderData.mo73529a());
        setOnClickListener(new C31993g(lVar, insuranceProviderData));
    }
}
