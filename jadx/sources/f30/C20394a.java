package f30;

import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.C0767a;
import com.github.mikephil.charting.utils.Utils;
import d30.C19878a;
import g60.C20742c;
import g91.C32343x;
import he1.C41224m;
import he1.C41233s;
import kotlin.jvm.internal.C41536l;
import p086g1.C6201a;
import p366bk.C10318g;
import p366bk.C10328q;
import p90.C27438u4;

/* renamed from: f30.a */
public final class C20394a extends C20742c {

    /* renamed from: d */
    private final C27438u4 f55328d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20394a(C27438u4 u4Var) {
        super((C6201a) u4Var);
        C41536l.m120489i(u4Var, "binding");
        this.f55328d = u4Var;
    }

    /* renamed from: h */
    public void onBind(C19878a aVar) {
        C41224m mVar;
        C41536l.m120489i(aVar, "data");
        C19878a.C19879a aVar2 = (C19878a.C19879a) aVar;
        this.f55328d.f69967j.setText(C32343x.m95410Q(aVar2.mo48195e(), "GEL", false, 2, (Object) null));
        TextView textView = this.f55328d.f69962e;
        String Q = C32343x.m95410Q(aVar2.mo48193c(), "GEL", false, 2, (Object) null);
        textView.setText(" / " + Q);
        TextView textView2 = this.f55328d.f69962e;
        C41536l.m120488h(textView2, "binding.operationsAmountText");
        C32343x.m95483r1(textView2, aVar2.mo48194d(), false, 2, (Object) null);
        if (aVar2.mo48192b() > Utils.DOUBLE_EPSILON) {
            mVar = C41233s.m119492a(Integer.valueOf(C10328q.bill_split_transaction_amount_less), Integer.valueOf(C10318g.color_invert_component_tr_300));
        } else if (aVar2.mo48192b() < Utils.DOUBLE_EPSILON) {
            mVar = C41233s.m119492a(Integer.valueOf(C10328q.bill_split_transaction_amount_more), Integer.valueOf(C10318g.f28634V0));
        } else {
            mVar = C41233s.m119492a(Integer.valueOf(C10328q.bill_split_leftover), Integer.valueOf(C10318g.f28641c1));
        }
        int intValue = ((Number) mVar.mo95675a()).intValue();
        int intValue2 = ((Number) mVar.mo95676b()).intValue();
        this.f55328d.f69964g.setText(intValue);
        this.f55328d.f69965h.setTextColor(C0767a.m2893c(this.itemView.getContext(), intValue2));
        this.f55328d.f69965h.setText(C32343x.m95410Q(Math.abs(aVar2.mo48192b()), "GEL", false, 2, (Object) null));
        Group group = this.f55328d.f69963f;
        C41536l.m120488h(group, "binding.remainingAmountGroup");
        C32343x.m95483r1(group, aVar2.mo48194d(), false, 2, (Object) null);
    }
}
