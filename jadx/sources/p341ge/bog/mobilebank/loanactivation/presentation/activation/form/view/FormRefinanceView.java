package p341ge.bog.mobilebank.loanactivation.presentation.activation.form.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.Animation;
import androidx.recyclerview.widget.RecyclerView;
import iq0.C36485e;
import java.util.List;
import jq0.C36782h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kq0.C36932c;
import np0.C37435a;
import np0.C37443i;
import oq0.C37709c;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p642vh.C18368l;
import sp0.C38492k;
import sq0.C38508a;

/* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.view.FormRefinanceView */
public final class FormRefinanceView extends LayerView {

    /* renamed from: d */
    private final C38492k f79963d;

    /* renamed from: e */
    private C36485e f79964e;

    /* renamed from: f */
    private C36932c f79965f;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FormRefinanceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final void m95931b(FormRefinanceView formRefinanceView, C38508a.C38511c cVar) {
        C41536l.m120489i(formRefinanceView, "this$0");
        C41536l.m120489i(cVar, "item");
        C36932c cVar2 = formRefinanceView.f79965f;
        if (cVar2 != null) {
            cVar2.mo73181G2(cVar);
        }
    }

    /* renamed from: c */
    public final void mo73288c(C37709c cVar) {
        C41536l.m120489i(cVar, "refinanceInput");
        this.f79964e.mo6029i((List) cVar.mo90931c());
    }

    public final C36932c getListener() {
        return this.f79965f;
    }

    public final void setListener(C36932c cVar) {
        this.f79965f = cVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FormRefinanceView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FormRefinanceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        C38492k d = C38492k.m112983d(LayoutInflater.from(context), this, true);
        C41536l.m120488h(d, "inflate(LayoutInflater.from(context), this, true)");
        this.f79963d = d;
        setBackgroundColor(C18368l.m62755d(context, C37435a.f89964a));
        setLayerStyle(C37443i.f90018c);
        C36485e eVar = new C36485e(new C36782h(this));
        d.f92224e.setAdapter(eVar);
        d.f92224e.setAnimation((Animation) null);
        d.f92224e.setItemAnimator((RecyclerView.C1742m) null);
        this.f79964e = eVar;
    }
}
