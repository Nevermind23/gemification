package p341ge.bog.mobilebank.cleanarch.presentation.pfm.transactions.filter;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import g50.C20724a;
import g50.C20725b;
import g50.C20727d;
import g91.C32343x;
import he1.C41238w;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import p366bk.C10322k;
import p366bk.C10324m;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.transactions.filter.AmountFilterView */
public final class AmountFilterView extends C20727d {

    /* renamed from: l */
    private final EditText f59078l;

    /* renamed from: m */
    private final EditText f59079m;

    /* renamed from: n */
    private final View f59080n;

    /* renamed from: o */
    private final View f59081o;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.transactions.filter.AmountFilterView$a */
    /* synthetic */ class C22260a extends C41535k implements C43075l {
        C22260a(Object obj) {
            super(1, obj, AmountFilterView.class, "afterTextChanged", "afterTextChanged(Ljava/lang/String;)V", 0);
        }

        /* renamed from: b */
        public final void mo55134b(String str) {
            C41536l.m120489i(str, "p0");
            ((AmountFilterView) this.receiver).m72129n(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55134b((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.transactions.filter.AmountFilterView$b */
    /* synthetic */ class C22261b extends C41535k implements C43075l {
        C22261b(Object obj) {
            super(1, obj, AmountFilterView.class, "afterTextChanged", "afterTextChanged(Ljava/lang/String;)V", 0);
        }

        /* renamed from: b */
        public final void mo55135b(String str) {
            C41536l.m120489i(str, "p0");
            ((AmountFilterView) this.receiver).m72129n(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55135b((String) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AmountFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C41536l.m120489i(context, "context");
        C41536l.m120489i(attributeSet, "attributeSet");
        View inflate = View.inflate(context, C10324m.filter_amount_range_layout, getContentLayout());
        View findViewById = inflate.findViewById(C10322k.clear_max_amount_filter);
        C41536l.m120488h(findViewById, "v.findViewById(R.id.clear_max_amount_filter)");
        this.f59080n = findViewById;
        View findViewById2 = inflate.findViewById(C10322k.clear_min_amount_filter);
        C41536l.m120488h(findViewById2, "v.findViewById(R.id.clear_min_amount_filter)");
        this.f59081o = findViewById2;
        View findViewById3 = inflate.findViewById(C10322k.min_amount_et);
        C41536l.m120488h(findViewById3, "v.findViewById(R.id.min_amount_et)");
        EditText editText = (EditText) findViewById3;
        this.f59078l = editText;
        View findViewById4 = inflate.findViewById(C10322k.max_amount_et);
        C41536l.m120488h(findViewById4, "v.findViewById(R.id.max_amount_et)");
        EditText editText2 = (EditText) findViewById4;
        this.f59079m = editText2;
        C32343x.m95457j(editText, new C22260a(this));
        C32343x.m95457j(editText2, new C22261b(this));
        findViewById.setOnClickListener(new C20724a(this));
        findViewById2.setOnClickListener(new C20725b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final void m72126k(AmountFilterView amountFilterView, View view) {
        C41536l.m120489i(amountFilterView, "this$0");
        amountFilterView.f59079m.setText("");
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final void m72127l(AmountFilterView amountFilterView, View view) {
        C41536l.m120489i(amountFilterView, "this$0");
        amountFilterView.f59078l.setText("");
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public final void m72129n(String str) {
        int v0 = C32343x.m95493v0(this.f59079m.getText().toString());
        if (C32343x.m95493v0(this.f59078l.getText().toString())) {
            v0++;
        }
        mo49261h(v0);
        m72130o(this.f59081o, this.f59078l);
        m72130o(this.f59080n, this.f59079m);
    }

    /* renamed from: o */
    private final void m72130o(View view, EditText editText) {
        Editable text = editText.getText();
        C41536l.m120488h(text, "amountEditText.text");
        int i = 0;
        if (text.length() == 0) {
            i = 8;
        }
        view.setVisibility(i);
    }

    public final BigDecimal getMaxAmount() {
        return C40437u.m117095g(this.f59079m.getText().toString());
    }

    public final BigDecimal getMinAmount() {
        return C40437u.m117095g(this.f59078l.getText().toString());
    }

    public final void setMaxAmount(BigDecimal bigDecimal) {
        this.f59079m.setText(bigDecimal != null ? C32343x.m95408P(bigDecimal, "") : null);
    }

    public final void setMinAmount(BigDecimal bigDecimal) {
        this.f59078l.setText(bigDecimal != null ? C32343x.m95408P(bigDecimal, "") : null);
    }
}
