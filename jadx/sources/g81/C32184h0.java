package g81;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import g91.C32343x;
import he1.C41238w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ue1.C43075l;
import ue1.C43079p;
import ue1.C43080q;

/* renamed from: g81.h0 */
public class C32184h0 extends RecyclerView.C1736h {

    /* renamed from: d */
    private final C43079p f79325d;

    /* renamed from: e */
    private final C43079p f79326e;

    /* renamed from: f */
    private final Integer f79327f;

    /* renamed from: g */
    private final C43080q f79328g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C43080q f79329h;

    /* renamed from: i */
    private List f79330i;

    /* renamed from: j */
    private final C43079p f79331j;

    /* renamed from: g81.h0$a */
    public static final class C32185a extends RecyclerView.C1734f0 {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32185a(View view) {
            super(view);
            C41536l.m120489i(view, "v");
        }
    }

    /* renamed from: g81.h0$b */
    static final class C32186b extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ C32184h0 f79332d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32186b(C32184h0 h0Var) {
            super(2);
            this.f79332d = h0Var;
        }

        /* renamed from: a */
        public final C41238w mo72713a(View view, int i) {
            Object Z = C41358y.m120010Z(this.f79332d.mo72707h(), i);
            if (view == null) {
                return C41238w.f97225a;
            }
            C43080q g = this.f79332d.f79329h;
            if (g == null) {
                return null;
            }
            g.invoke(Z, view, Integer.valueOf(i));
            return C41238w.f97225a;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return mo72713a((View) obj, ((Number) obj2).intValue());
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C32184h0(List list, C43079p pVar, C43079p pVar2, Integer num, C43080q qVar, C43080q qVar2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : pVar, (i & 4) != 0 ? null : pVar2, (i & 8) != 0 ? null : num, qVar, (i & 32) != 0 ? null : qVar2);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final void m94836l(C32184h0 h0Var, int i, View view) {
        C41536l.m120489i(h0Var, "this$0");
        h0Var.f79331j.invoke(view, Integer.valueOf(i));
    }

    public int getItemCount() {
        return this.f79330i.size();
    }

    public int getItemViewType(int i) {
        C43079p pVar = this.f79326e;
        return pVar != null ? ((Number) pVar.invoke(Integer.valueOf(i), this.f79330i.get(i))).intValue() : super.getItemViewType(i);
    }

    /* renamed from: h */
    public final List mo72707h() {
        return this.f79330i;
    }

    /* renamed from: i */
    public final boolean mo72708i(C43075l lVar) {
        Object obj;
        C41536l.m120489i(lVar, "predicate");
        Iterator it = this.f79330i.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Boolean) lVar.invoke(obj)).booleanValue()) {
                break;
            }
        }
        if (obj != null) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final boolean mo72709j() {
        return getItemCount() > 0;
    }

    /* renamed from: k */
    public void onBindViewHolder(C32185a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object Z = C41358y.m120010Z(this.f79330i, i);
        if (this.f79329h != null) {
            aVar.itemView.setOnClickListener(new C32174g0(this, i));
        }
        C43080q qVar = this.f79328g;
        Integer valueOf = Integer.valueOf(i);
        View view = aVar.itemView;
        C41536l.m120488h(view, "holder.itemView");
        qVar.invoke(Z, valueOf, view);
    }

    /* renamed from: m */
    public C32185a onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view;
        C41536l.m120489i(viewGroup, "parent");
        C43079p pVar = this.f79325d;
        if (pVar == null || (view = (View) pVar.invoke(Integer.valueOf(i), viewGroup)) == null) {
            Integer num = this.f79327f;
            C41536l.m120486f(num);
            view = C32343x.m95473o0(viewGroup, num.intValue(), false, 2, (Object) null);
        }
        return new C32185a(view);
    }

    /* renamed from: n */
    public final void mo72712n(List list) {
        C41536l.m120489i(list, C11755a.C11756a.f34100b);
        List list2 = this.f79330i;
        C41536l.m120487g(list2, "null cannot be cast to non-null type java.util.ArrayList<T of ge.bog.mobilebank.ui.adapters.SimpleListAdapter>");
        ArrayList arrayList = (ArrayList) list2;
        arrayList.clear();
        arrayList.addAll(list);
        notifyDataSetChanged();
    }

    public C32184h0(List list, C43079p pVar, C43079p pVar2, Integer num, C43080q qVar, C43080q qVar2) {
        C41536l.m120489i(qVar, "onBind");
        this.f79325d = pVar;
        this.f79326e = pVar2;
        this.f79327f = num;
        this.f79328g = qVar;
        this.f79329h = qVar2;
        this.f79330i = new ArrayList(list == null ? C41341q.m119907j() : list);
        this.f79331j = new C32186b(this);
    }
}
