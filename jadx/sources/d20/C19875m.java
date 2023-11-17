package d20;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32303f;
import g91.C32314k;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import l50.C25831k;
import p366bk.C10316e;
import p366bk.C10322k;
import p366bk.C10324m;
import p642vh.C18368l;

/* renamed from: d20.m */
public final class C19875m extends RecyclerView.C1736h {

    /* renamed from: d */
    private ArrayList f54359d = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f54360e;

    /* renamed from: d20.m$a */
    public final class C19876a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final TextView f54361d;

        /* renamed from: e */
        final /* synthetic */ C19875m f54362e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19876a(C19875m mVar, View view) {
            super(view);
            C41536l.m120489i(view, "itemView");
            this.f54362e = mVar;
            this.f54361d = (TextView) view.findViewById(C10322k.amount_list_amount_text_view);
        }

        /* renamed from: h */
        private final int m65709h(BigDecimal bigDecimal) {
            if (m65712l(bigDecimal)) {
                return C10316e.f28611o;
            }
            return C10316e.f28610m;
        }

        /* renamed from: i */
        private final int m65710i(BigDecimal bigDecimal) {
            Context context = this.itemView.getContext();
            C41536l.m120488h(context, "itemView.context");
            return C18368l.m62755d(context, m65709h(bigDecimal));
        }

        /* renamed from: j */
        private final String m65711j(double d) {
            if (this.f54362e.f54360e) {
                return "";
            }
            String o = C32303f.m95204o(d);
            return o + " ";
        }

        /* renamed from: l */
        private final boolean m65712l(BigDecimal bigDecimal) {
            return bigDecimal.compareTo(BigDecimal.ZERO) > 0 || this.f54362e.f54360e;
        }

        /* renamed from: k */
        public final void mo48190k(C25831k kVar) {
            C41536l.m120489i(kVar, "data");
            TextView textView = this.f54361d;
            String j = m65711j(kVar.mo64517a().doubleValue());
            String a = C32314k.m95245a(kVar.mo64518b());
            textView.setText(j + a);
            this.f54361d.setTextColor(m65710i(kVar.mo64517a()));
        }
    }

    /* renamed from: g */
    public void onBindViewHolder(C19876a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object obj = this.f54359d.get(i);
        C41536l.m120488h(obj, "this.data[position]");
        aVar.mo48190k((C25831k) obj);
    }

    public int getItemCount() {
        return this.f54359d.size();
    }

    /* renamed from: h */
    public C19876a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.home_amount_list_item_layout, viewGroup, false);
        C41536l.m120488h(inflate, "from(parent.context)\n   …em_layout, parent, false)");
        return new C19876a(this, inflate);
    }

    /* renamed from: i */
    public final void mo48188i(List list, boolean z) {
        C41536l.m120489i(list, "data");
        this.f54359d.clear();
        this.f54360e = z;
        this.f54359d.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: j */
    public final void mo48189j(boolean z) {
        this.f54360e = z;
        notifyDataSetChanged();
    }
}
