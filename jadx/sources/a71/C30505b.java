package a71;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32335t0;
import java.util.List;
import p341ge.bog.mobilebank.model.foreigntransfer.ForeignBank;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10318g;
import p366bk.C10320i;
import p366bk.C10328q;
import p90.C27485z6;
import u81.C39040a;

/* renamed from: a71.b */
public abstract class C30505b extends C39040a {

    /* renamed from: k */
    private String f76509k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C30507b f76510l;

    /* renamed from: a71.b$a */
    class C30506a extends RecyclerView.C1734f0 implements View.OnClickListener {

        /* renamed from: d */
        C27485z6 f76511d;

        public void onClick(View view) {
            if (C30505b.this.f76510l != null) {
                C30505b.this.f76510l.mo70854j((ForeignBank) C30505b.this.mo92726k(getAdapterPosition()));
            }
        }

        private C30506a(C27485z6 z6Var) {
            super(z6Var.mo3946b());
            this.itemView.setOnClickListener(this);
            this.f76511d = z6Var;
        }
    }

    /* renamed from: a71.b$b */
    public interface C30507b {
        /* renamed from: j */
        void mo70854j(ForeignBank foreignBank);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void mo70851v(C30506a aVar, int i) {
        int i2;
        Context context = aVar.f76511d.f70360f.getContext();
        ForeignBank foreignBank = (ForeignBank) mo92726k(i);
        aVar.f76511d.f70360f.setText(foreignBank.getBankName());
        BogTextView bogTextView = aVar.f76511d.f70361g;
        int i3 = 8;
        if (foreignBank.getSwift() != null) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        bogTextView.setVisibility(i2);
        BogTextView bogTextView2 = aVar.f76511d.f70359e;
        if (foreignBank.getAddress() != null) {
            i3 = 0;
        }
        bogTextView2.setVisibility(i3);
        aVar.f76511d.f70361g.setText(context.getString(C10328q.bank_swift_code, new Object[]{foreignBank.getSwift()}));
        aVar.f76511d.f70359e.setText(context.getString(C10328q.bank_address, new Object[]{foreignBank.getAddress()}));
        if (TextUtils.isEmpty(this.f76509k) || !this.f76509k.equals(foreignBank.getSwift())) {
            aVar.f76511d.f70362h.setImageResource(0);
            BogTextView bogTextView3 = aVar.f76511d.f70360f;
            int i4 = C10318g.f28630R0;
            bogTextView3.setTextColor(C0767a.m2893c(context, i4));
            aVar.f76511d.f70361g.setTextColor(C0767a.m2893c(context, i4));
            aVar.f76511d.f70359e.setTextColor(C0767a.m2893c(context, i4));
            return;
        }
        aVar.f76511d.f70362h.setImageResource(C10320i.ic_tick);
        aVar.f76511d.f70360f.setTextColor(C32335t0.m95358c(context));
        aVar.f76511d.f70361g.setTextColor(C32335t0.m95358c(context));
        aVar.f76511d.f70359e.setTextColor(C32335t0.m95358c(context));
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public C30506a mo70852x(ViewGroup viewGroup, int i) {
        return new C30506a(C27485z6.m85247d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
    }

    /* renamed from: G */
    public void mo70848G(List list) {
        mo92732z(list);
    }

    /* renamed from: H */
    public void mo70849H(String str) {
        this.f76509k = str;
        notifyDataSetChanged();
    }

    /* renamed from: I */
    public void mo70850I(C30507b bVar) {
        this.f76510l = bVar;
    }
}
