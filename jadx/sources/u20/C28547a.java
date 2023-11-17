package u20;

import a10.C19149b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1796h;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p366bk.C10324m;
import p90.C27412r5;
import p90.C27421s5;
import p90.C27430t5;
import p90.C27439u5;
import p90.C27457w5;
import ue1.C43075l;
import w20.C29192a;
import x20.C29626a;
import x20.C29627b;
import x20.C29628c;
import x20.C29629d;
import x20.C29630e;
import x20.C29633h;
import x20.C29641p;

/* renamed from: u20.a */
public final class C28547a extends RecyclerView.C1736h {

    /* renamed from: d */
    private final C43075l f72469d;

    /* renamed from: e */
    private final C43075l f72470e;

    /* renamed from: f */
    private List f72471f = C41341q.m119907j();

    public C28547a(C43075l lVar, C43075l lVar2) {
        this.f72469d = lVar;
        this.f72470e = lVar2;
    }

    /* renamed from: f */
    public void onBindViewHolder(C29627b bVar, int i) {
        C41536l.m120489i(bVar, "holder");
        bVar.mo69544h(this.f72471f.get(i));
    }

    /* renamed from: g */
    public void onBindViewHolder(C29627b bVar, int i, List list) {
        C29641p pVar;
        C41536l.m120489i(bVar, "holder");
        C41536l.m120489i(list, "payloads");
        if (list.isEmpty()) {
            onBindViewHolder(bVar, i);
            return;
        }
        Object obj = list.get(0);
        C41536l.m120487g(obj, "null cannot be cast to non-null type kotlin.Boolean");
        if (((Boolean) obj).booleanValue()) {
            if (bVar instanceof C29641p) {
                pVar = (C29641p) bVar;
            } else {
                pVar = null;
            }
            if (pVar != null) {
                pVar.mo69558q();
            }
        }
    }

    public int getItemCount() {
        return this.f72471f.size();
    }

    public int getItemViewType(int i) {
        return ((C29192a) this.f72471f.get(i)).mo69026b().mo69064b();
    }

    /* renamed from: h */
    public C29627b onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == C29192a.C29199g.PROGRESS.mo69064b()) {
            C27439u5 d = C27439u5.m85067d(from, viewGroup, false);
            C41536l.m120488h(d, "inflate(inflater, parent, false)");
            return new C29633h(d, this.f72470e);
        } else if (i == C29192a.C29199g.OPERATIONS_HORIZONTAL_LIST.mo69064b()) {
            C27430t5 d2 = C27430t5.m85030d(from, viewGroup, false);
            C41536l.m120488h(d2, "inflate(\n               …lse\n                    )");
            return new C29630e(d2);
        } else if (i == C29192a.C29199g.OPERATION.mo69064b()) {
            C27412r5 d3 = C27412r5.m84955d(from, viewGroup, false);
            C41536l.m120488h(d3, "inflate(\n               …lse\n                    )");
            return new C29629d(d3);
        } else if (i == C29192a.C29199g.HEADER.mo69064b()) {
            C27457w5 d4 = C27457w5.m85136d(from, viewGroup, false);
            C41536l.m120488h(d4, "inflate(inflater, parent, false)");
            return new C29628c(d4);
        } else if (i == C29192a.C29199g.RECEIVER.mo69064b()) {
            View inflate = from.inflate(C10324m.item_money_request_details_receiver_swipeable, viewGroup, false);
            C41536l.m120488h(inflate, "inflater.inflate(\n      …lse\n                    )");
            return new C29641p(inflate, this.f72469d);
        } else if (i == C29192a.C29199g.ENROLLMENT_ACCOUNT.mo69064b()) {
            C27421s5 d5 = C27421s5.m84995d(from, viewGroup, false);
            C41536l.m120488h(d5, "inflate(inflater, parent, false)");
            return new C29626a(d5);
        } else {
            throw new IllegalStateException(("Unknown view type: " + i).toString());
        }
    }

    /* renamed from: i */
    public final void mo68287i(List list) {
        C41536l.m120489i(list, "newItems");
        C1796h.C1801e b = C1796h.m6928b(new C19149b(this.f72471f, list));
        C41536l.m120488h(b, "calculateDiff(diffCallback)");
        this.f72471f = list;
        b.mo5975c(this);
    }
}
