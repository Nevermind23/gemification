package a71;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.C0767a;
import g91.C32290b1;
import g91.C32335t0;
import java.util.ArrayList;
import java.util.List;
import l81.C37106c;
import l81.C37107d;
import p341ge.bog.mobilebank.model.foreigntransfer.ReportingCode;
import p366bk.C10318g;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: a71.e */
public class C30515e extends C37106c {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public List f76525d = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String f76526e;

    /* renamed from: f */
    private Drawable f76527f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C30516a f76528g;

    /* renamed from: a71.e$a */
    public interface C30516a {
        /* renamed from: T0 */
        void mo70874T0(ReportingCode reportingCode);
    }

    /* renamed from: a71.e$b */
    class C30517b extends C37107d implements View.OnClickListener {

        /* renamed from: f */
        TextView f76529f = ((TextView) mo90036h(C10322k.reporting_code));

        /* renamed from: g */
        TextView f76530g = ((TextView) mo90036h(C10322k.reporting_code_description));

        public C30517b(View view) {
            super(view);
            this.f89288e = mo90036h(C10322k.f28850jc);
            view.setOnClickListener(this);
        }

        public void onClick(View view) {
            ReportingCode reportingCode = (ReportingCode) C30515e.this.f76525d.get(getAdapterPosition());
            C30515e.this.f76526e = reportingCode.getReportingCode();
            C30515e.this.notifyDataSetChanged();
            if (C30515e.this.f76528g != null) {
                C30515e.this.f76528g.mo70874T0(reportingCode);
            }
        }
    }

    public C30515e(C30516a aVar) {
        this.f76528g = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo70863g() {
        return true;
    }

    public int getItemCount() {
        return this.f76525d.size();
    }

    /* renamed from: m */
    public void onBindViewHolder(C30517b bVar, int i) {
        boolean z;
        ReportingCode reportingCode = (ReportingCode) this.f76525d.get(i);
        bVar.f76529f.setText(reportingCode.getReportingCode());
        bVar.f76530g.setText(reportingCode.getDescription());
        if (reportingCode.getReportingCode() != null) {
            z = reportingCode.getReportingCode().equals(this.f76526e);
        } else {
            z = false;
        }
        if (z) {
            bVar.f76529f.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.f76527f, (Drawable) null);
            TextView textView = bVar.f76529f;
            textView.setTextColor(C32335t0.m95358c(textView.getContext()));
            return;
        }
        bVar.f76529f.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        TextView textView2 = bVar.f76529f;
        textView2.setTextColor(C0767a.m2893c(textView2.getContext(), C10318g.f28627N0));
    }

    /* renamed from: n */
    public C30517b onCreateViewHolder(ViewGroup viewGroup, int i) {
        View h = mo90035h(C10324m.foreign_transfer_reporting_code_list_item, viewGroup);
        if (this.f76527f == null) {
            this.f76527f = C0767a.m2895e(viewGroup.getContext(), C10320i.ic_tick);
            if (C32335t0.m95361f() != 0) {
                this.f76527f = C32290b1.m95122l(viewGroup.getContext(), this.f76527f, C32335t0.m95359d(viewGroup.getContext(), true));
            }
        }
        return new C30517b(h);
    }

    /* renamed from: o */
    public void mo70872o(List list) {
        this.f76525d.clear();
        this.f76525d.addAll(list);
    }

    /* renamed from: p */
    public void mo70873p(String str) {
        this.f76526e = str;
        notifyDataSetChanged();
    }
}
