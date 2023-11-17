package p341ge.bog.mobilebank.loanactivation.presentation.activation.form.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import g91.C32343x;
import he1.C41238w;
import jq0.C36775a;
import jq0.C36776b;
import jq0.C36777c;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kq0.C36930a;
import lq0.C37124a;
import np0.C37435a;
import np0.C37443i;
import oq0.C37708b;
import oq0.C37710d;
import oq0.C37711e;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.provider.InsuranceInfoUiModel;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.provider.ProviderInfoUiModel;
import p642vh.C18368l;
import sp0.C38490i;
import wq0.C39640a;

/* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.view.FormInsuranceProviderView */
public final class FormInsuranceProviderView extends LayerView {

    /* renamed from: d */
    private final C38490i f79957d;

    /* renamed from: e */
    private C36930a f79958e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FormInsuranceProviderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final void m95916d(FormInsuranceProviderView formInsuranceProviderView, View view) {
        C41536l.m120489i(formInsuranceProviderView, "this$0");
        C36930a aVar = formInsuranceProviderView.f79958e;
        if (aVar != null) {
            aVar.mo73188e3();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final void m95917e(FormInsuranceProviderView formInsuranceProviderView, CompoundButton compoundButton, boolean z) {
        C41536l.m120489i(formInsuranceProviderView, "this$0");
        C36930a aVar = formInsuranceProviderView.f79958e;
        if (aVar != null) {
            aVar.mo73183O0(z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final void m95918f(FormInsuranceProviderView formInsuranceProviderView, CompoundButton compoundButton, boolean z) {
        C41536l.m120489i(formInsuranceProviderView, "this$0");
        C36930a aVar = formInsuranceProviderView.f79958e;
        if (aVar != null) {
            aVar.mo73184Q2(z);
        }
    }

    /* renamed from: g */
    public final void mo73277g(C37710d dVar, C37711e eVar, C37711e eVar2, C37708b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6;
        C41238w wVar;
        String str;
        String str2;
        C41536l.m120489i(dVar, "insuranceProvider");
        C41536l.m120489i(eVar, "lifeInsurance");
        C41536l.m120489i(eVar2, "paymentInsurance");
        C41536l.m120489i(bVar, "chosenInsuranceInfo");
        Input input = this.f79957d.f92202h;
        C41536l.m120488h(input, "updateState$lambda$3");
        int i7 = 8;
        if (dVar.mo90943h()) {
            i = 0;
        } else {
            i = 8;
        }
        input.setVisibility(i);
        input.setEnabled(dVar.mo90942g());
        ConstraintLayout constraintLayout = this.f79957d.f92204j;
        C41536l.m120488h(constraintLayout, "binding.lifeInsurance");
        if (eVar.mo90950e()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        constraintLayout.setVisibility(i2);
        this.f79957d.f92210p.setChecked(eVar.mo90948c().booleanValue());
        this.f79957d.f92210p.setEnabled(eVar.mo90949d());
        TextView textView = this.f79957d.f92206l;
        C41536l.m120488h(textView, "binding.lifeInsuranceDesc");
        boolean z2 = true;
        if (!eVar.mo90949d()) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        textView.setVisibility(i3);
        ConstraintLayout constraintLayout2 = this.f79957d.f92211q;
        C41536l.m120488h(constraintLayout2, "binding.paymentInsurance");
        if (eVar2.mo90950e()) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        constraintLayout2.setVisibility(i4);
        this.f79957d.f92217w.setChecked(eVar2.mo90948c().booleanValue());
        this.f79957d.f92217w.setEnabled(eVar2.mo90949d());
        TextView textView2 = this.f79957d.f92213s;
        C41536l.m120488h(textView2, "binding.paymentInsuranceDesc");
        if (!eVar2.mo90949d()) {
            i5 = 0;
        } else {
            i5 = 8;
        }
        textView2.setVisibility(i5);
        View view = this.f79957d.f92199e;
        C41536l.m120488h(view, "binding.insuranceDivider");
        if (!eVar2.mo90950e() || !eVar.mo90950e()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            i6 = 0;
        } else {
            i6 = 8;
        }
        view.setVisibility(i6);
        InlineFeedback inlineFeedback = this.f79957d.f92200f;
        C41536l.m120488h(inlineFeedback, "binding.insuranceFeedback");
        if (eVar2.mo90950e()) {
            i7 = 0;
        }
        inlineFeedback.setVisibility(i7);
        ProviderInfoUiModel providerInfoUiModel = (ProviderInfoUiModel) dVar.mo90941f();
        if (providerInfoUiModel != null) {
            this.f79957d.f92202h.setInputText(providerInfoUiModel.mo73486e());
            TextView textView3 = this.f79957d.f92205k;
            InsuranceInfoUiModel a = providerInfoUiModel.mo73482a();
            if (a != null) {
                str = a.mo73472a();
            } else {
                str = null;
            }
            textView3.setText(str);
            TextView textView4 = this.f79957d.f92212r;
            InsuranceInfoUiModel b = providerInfoUiModel.mo73483b();
            if (b != null) {
                str2 = b.mo73472a();
            } else {
                str2 = null;
            }
            textView4.setText(str2);
            wVar = C41238w.f97225a;
        } else {
            wVar = null;
        }
        if (wVar == null) {
            this.f79957d.f92202h.setInputText("");
        }
        ConstraintLayout constraintLayout3 = this.f79957d.f92207m;
        C41536l.m120488h(constraintLayout3, "binding.lifeInsuranceInfo");
        C32343x.m95483r1(constraintLayout3, bVar.mo90925b(), false, 2, (Object) null);
        ConstraintLayout constraintLayout4 = this.f79957d.f92214t;
        C41536l.m120488h(constraintLayout4, "binding.paymentInsuranceInfo");
        C32343x.m95483r1(constraintLayout4, bVar.mo90926c(), false, 2, (Object) null);
        View view2 = this.f79957d.f92201g;
        C41536l.m120488h(view2, "binding.insuranceInfoDivider");
        if (!bVar.mo90925b() || !bVar.mo90926c()) {
            z2 = false;
        }
        C32343x.m95483r1(view2, z2, false, 2, (Object) null);
        Input input2 = this.f79957d.f92202h;
        C41536l.m120488h(input2, "binding.insuranceProviderInput");
        C39640a.m115206b(input2, dVar.mo90938d());
    }

    public final C36930a getListener() {
        return this.f79958e;
    }

    public final void setListener(C36930a aVar) {
        this.f79958e = aVar;
    }

    public final void setUpViews(C37124a aVar) {
        C41536l.m120489i(aVar, C11769i.C11770a.f34151n);
        this.f79957d.f92203i.setTitle(C32343x.m95388F(aVar.mo90070L(), new Object[0]));
        this.f79957d.f92209o.setText(C32343x.m95388F(aVar.mo90072N(), new Object[0]));
        this.f79957d.f92206l.setText(C32343x.m95388F(aVar.mo90078T(), new Object[0]));
        this.f79957d.f92216v.setText(C32343x.m95388F(aVar.mo90074P(), new Object[0]));
        this.f79957d.f92213s.setText(C32343x.m95388F(aVar.mo90078T(), new Object[0]));
        this.f79957d.f92202h.setHintText((CharSequence) C32343x.m95388F(aVar.mo90071M(), new Object[0]));
        this.f79957d.f92200f.setTitleText(C32343x.m95388F(aVar.mo90075Q(), new Object[0]));
        this.f79957d.f92208n.setText(C32343x.m95388F(aVar.mo90096g0(), new Object[0]));
        this.f79957d.f92215u.setText(C32343x.m95388F(aVar.mo90098h0(), new Object[0]));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FormInsuranceProviderView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FormInsuranceProviderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        C38490i d = C38490i.m112975d(LayoutInflater.from(context), this, true);
        C41536l.m120488h(d, "inflate(LayoutInflater.from(context), this, true)");
        this.f79957d = d;
        setBackgroundColor(C18368l.m62755d(context, C37435a.f89964a));
        setLayerStyle(C37443i.f90019d);
        d.f92202h.setOnClickListener(new C36775a(this));
        d.f92210p.setOnCheckedChangeListener(new C36776b(this));
        d.f92217w.setOnCheckedChangeListener(new C36777c(this));
    }
}
