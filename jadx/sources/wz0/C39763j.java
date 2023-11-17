package wz0;

import a41.C30482a;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import g91.C32343x;
import hy0.C36268b;
import iy0.C36627q0;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.model.account.AccountOperation;

/* renamed from: wz0.j */
public final class C39763j extends RecyclerView.C1734f0 {

    /* renamed from: d */
    private final C36627q0 f94460d;

    /* renamed from: e */
    private final C30482a f94461e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39763j(C36627q0 q0Var, C30482a aVar) {
        super(q0Var.mo3946b());
        C41536l.m120489i(q0Var, "binding");
        C41536l.m120489i(aVar, "viewModel");
        this.f94460d = q0Var;
        this.f94461e = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final void m115540j(C39763j jVar, AccountOperation accountOperation, View view) {
        C41536l.m120489i(jVar, "this$0");
        C41536l.m120489i(accountOperation, "$accountOperation");
        jVar.f94461e.mo38230N7(accountOperation);
    }

    /* renamed from: i */
    public final void mo93504i(AccountOperation accountOperation, String str, String str2, double d, String str3, String str4, String str5, boolean z) {
        boolean z2;
        float f;
        AccountOperation accountOperation2 = accountOperation;
        String str6 = str;
        String str7 = str2;
        String str8 = str4;
        C41536l.m120489i(accountOperation, "accountOperation");
        C41536l.m120489i(str6, "operationTitle");
        C41536l.m120489i(str7, "secondaryText");
        C41536l.m120489i(str3, "ccy");
        C41536l.m120489i(str8, "bonusInfo");
        C41536l.m120489i(str5, "imageUrl");
        this.f94460d.mo3946b().setOnClickListener(new C39762i(this, accountOperation));
        this.f94460d.f88394j.setText(str6);
        boolean z3 = true;
        if (str2.length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            this.f94460d.f88392h.setText(C32343x.m95388F(str7, new Object[0]));
            this.f94460d.f88392h.setVisibility(0);
        } else {
            this.f94460d.f88392h.setVisibility(8);
        }
        this.f94460d.f88389e.setText(C32343x.m95410Q(((double) -1) * d, str3, false, 2, (Object) null));
        if (d > Utils.DOUBLE_EPSILON) {
            TextView textView = this.f94460d.f88389e;
            textView.setTextColor(C0767a.m2893c(textView.getContext(), C36268b.f87453e));
        } else {
            TextView textView2 = this.f94460d.f88389e;
            textView2.setTextColor(C0767a.m2893c(textView2.getContext(), C36268b.f87457i));
        }
        if (str4.length() <= 0) {
            z3 = false;
        }
        if (z3) {
            this.f94460d.f88391g.setText(str8);
            this.f94460d.f88391g.setVisibility(0);
        } else {
            this.f94460d.f88391g.setVisibility(8);
        }
        this.f94460d.f88393i.setIconUrls(C41339p.m119900e(str5));
        ConstraintLayout c = this.f94460d.mo3946b();
        if (z) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        c.setAlpha(f);
    }
}
