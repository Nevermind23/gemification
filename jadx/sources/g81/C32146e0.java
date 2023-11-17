package g81;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32319m;
import g91.C32359z0;
import java.util.ArrayList;
import java.util.List;
import p341ge.bog.mobilebank.model.bonus.ScoolCardStatementItem;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: g81.e0 */
public class C32146e0 extends C32148f {

    /* renamed from: h */
    private List f79173h = new ArrayList();

    /* renamed from: g81.e0$a */
    static class C32147a extends RecyclerView.C1734f0 {
        /* access modifiers changed from: private */

        /* renamed from: d */
        public TextView f79174d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public TextView f79175e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public TextView f79176f;

        public C32147a(View view) {
            super(view);
            this.f79174d = (TextView) view.findViewById(C10322k.f28826da);
            this.f79175e = (TextView) view.findViewById(C10322k.f28823c8);
            this.f79176f = (TextView) view.findViewById(C10322k.bonus_points);
        }
    }

    /* renamed from: g */
    public int mo72656g() {
        return this.f79173h.size();
    }

    /* renamed from: h */
    public int mo72657h(int i) {
        return 0;
    }

    /* renamed from: p */
    public void mo72660p(List list) {
        this.f79173h.clear();
        this.f79173h.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: q */
    public void mo72658k(C32147a aVar, int i) {
        String str;
        ScoolCardStatementItem scoolCardStatementItem = (ScoolCardStatementItem) this.f79173h.get(i);
        aVar.f79174d.setText(C32319m.m95297d(scoolCardStatementItem.getAddDate(), "dd.MM.yyyy"));
        aVar.f79175e.setText(scoolCardStatementItem.getComment());
        TextView i2 = aVar.f79176f;
        StringBuilder sb = new StringBuilder();
        if (scoolCardStatementItem.getAddBonus() >= 0) {
            str = "+";
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(C32359z0.m95530A((long) scoolCardStatementItem.getAddBonus()));
        i2.setText(sb.toString());
    }

    /* renamed from: r */
    public C32147a mo72659l(ViewGroup viewGroup, int i) {
        return new C32147a(LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.scool_last_operation_item, viewGroup, false));
    }
}
