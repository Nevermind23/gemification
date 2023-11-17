package cc0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ec0.C20212d;
import g91.C32289b0;
import g91.C32343x;
import j31.C36725a;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.productheader.NewProductHeaderView;
import xb0.C29731s;

/* renamed from: cc0.f */
public final class C19699f extends RecyclerView.C1736h {

    /* renamed from: d */
    private final List f54040d = new ArrayList();

    /* renamed from: cc0.f$a */
    public static final class C19700a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C29731s f54041d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19700a(C29731s sVar) {
            super(sVar.mo3946b());
            C41536l.m120489i(sVar, "binding");
            this.f54041d = sVar;
        }

        /* renamed from: h */
        public final void mo47900h(C20212d dVar) {
            Boolean bool;
            NewProductHeaderView.C13482a aVar;
            String d;
            C41536l.m120489i(dVar, "item");
            NewProductHeaderView newProductHeaderView = this.f54041d.f75140e;
            C36725a a = dVar.mo48631a();
            String str = null;
            if (a != null) {
                bool = Boolean.valueOf(a.mo89542e());
            } else {
                bool = null;
            }
            boolean z = true;
            if (!C41536l.m120484d(bool, Boolean.TRUE) && bool != null) {
                z = false;
            }
            if (z) {
                aVar = NewProductHeaderView.C13482a.BLACK;
            } else if (C41536l.m120484d(bool, Boolean.FALSE)) {
                aVar = NewProductHeaderView.C13482a.WHITE;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            newProductHeaderView.setHeaderType(aVar);
            this.f54041d.f75140e.setData(dVar.mo48632b());
            NewProductHeaderView newProductHeaderView2 = this.f54041d.f75140e;
            C36725a a2 = dVar.mo48631a();
            if (!(a2 == null || (d = a2.mo89541d()) == null)) {
                str = C32289b0.m95091c(d);
            }
            if (str == null) {
                str = "";
            }
            newProductHeaderView2.setBackgroundImageUrl(str);
        }
    }

    /* renamed from: f */
    private final C20212d m65369f(int i) {
        return (C20212d) this.f54040d.get(i);
    }

    /* renamed from: g */
    public void onBindViewHolder(C19700a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        aVar.mo47900h(m65369f(i));
    }

    public int getItemCount() {
        return this.f54040d.size();
    }

    /* renamed from: h */
    public C19700a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C29731s d = C29731s.m90290d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(LayoutInflater.f….context), parent, false)");
        return new C19700a(d);
    }

    /* renamed from: i */
    public final void mo47899i(List list) {
        C41536l.m120489i(list, "list");
        C32343x.m95475p(this.f54040d, list);
        notifyDataSetChanged();
    }
}
