package rn0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import en0.C12725k;
import g91.C32343x;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import o31.C37626z;
import ue1.C43075l;

/* renamed from: rn0.c */
public final class C17682c extends RecyclerView.C1736h {

    /* renamed from: d */
    private C43075l f49402d;

    /* renamed from: e */
    private final List f49403e = new ArrayList();

    /* renamed from: f */
    private final List f49404f = new ArrayList();

    /* renamed from: g */
    private String f49405g = "";

    /* renamed from: h */
    private String f49406h = "";

    /* renamed from: h */
    public static /* synthetic */ void m61336h(C17682c cVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cVar.f49405g;
        }
        cVar.mo45246g(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final void m61337k(C37626z zVar, C17682c cVar, View view) {
        C41536l.m120489i(zVar, "$holder");
        C41536l.m120489i(cVar, "this$0");
        int absoluteAdapterPosition = zVar.getAbsoluteAdapterPosition();
        cVar.m61338m(((C17680a) cVar.f49404f.get(absoluteAdapterPosition)).mo45240a(), absoluteAdapterPosition);
    }

    /* renamed from: m */
    private final void m61338m(String str, int i) {
        boolean z;
        int i2;
        if (!C41536l.m120484d(str, this.f49406h)) {
            boolean z2 = true;
            if (this.f49406h.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                notifyItemChanged(mo45247i());
            }
            this.f49406h = str;
            Integer valueOf = Integer.valueOf(i);
            if (valueOf.intValue() == -1) {
                z2 = false;
            }
            if (!z2) {
                valueOf = null;
            }
            if (valueOf != null) {
                i2 = valueOf.intValue();
            } else {
                i2 = mo45247i();
            }
            notifyItemChanged(i2);
            C43075l lVar = this.f49402d;
            if (lVar != null) {
                lVar.invoke(this.f49406h);
            }
        }
    }

    /* renamed from: g */
    public final void mo45246g(String str) {
        C41536l.m120489i(str, "query");
        this.f49404f.clear();
        List list = this.f49404f;
        List list2 = this.f49403e;
        ArrayList arrayList = new ArrayList();
        for (Object next : list2) {
            if (C40440x.m117135K(((C17680a) next).mo45241b(), str, true)) {
                arrayList.add(next);
            }
        }
        list.addAll(arrayList);
        this.f49405g = str;
        notifyDataSetChanged();
    }

    public int getItemCount() {
        return this.f49404f.size();
    }

    /* renamed from: i */
    public final int mo45247i() {
        int i = 0;
        for (C17680a a : this.f49404f) {
            if (C41536l.m120484d(a.mo45240a(), this.f49406h)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: j */
    public void onBindViewHolder(C37626z zVar, int i) {
        C41536l.m120489i(zVar, "holder");
        ImageView imageView = ((C12725k) zVar.mo90806h()).f37657e;
        C41536l.m120488h(imageView, "holder.binding.checkImage");
        C32343x.m95483r1(imageView, C41536l.m120484d(this.f49406h, ((C17680a) this.f49404f.get(i)).mo45240a()), false, 2, (Object) null);
        ((C12725k) zVar.mo90806h()).f37658f.setText(((C17680a) this.f49404f.get(i)).mo45241b());
        zVar.itemView.setOnClickListener(new C17681b(zVar, this));
    }

    /* renamed from: l */
    public C37626z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C12725k d = C12725k.m48294d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …      false\n            )");
        return new C37626z(d);
    }

    /* renamed from: n */
    public final void mo45250n(C43075l lVar) {
        this.f49402d = lVar;
    }

    /* renamed from: o */
    public final void mo45251o(List list, String str) {
        C41536l.m120489i(list, "options");
        C41536l.m120489i(str, "selectedId");
        this.f49406h = str;
        this.f49403e.clear();
        this.f49403e.addAll(list);
        m61336h(this, (String) null, 1, (Object) null);
    }
}
