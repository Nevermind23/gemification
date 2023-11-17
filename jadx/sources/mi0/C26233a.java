package mi0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import he1.C41238w;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mi0.C26234b;
import mj0.C26238b;
import mj0.C26241e;
import pi0.C27534a;

/* renamed from: mi0.a */
public final class C26233a extends C1819o {

    /* renamed from: f */
    private final List f66424f;

    /* renamed from: g */
    private final C26234b f66425g;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C26233a(List list, C26234b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? C26234b.C26235a.f66426a : bVar);
    }

    public int getItemViewType(int i) {
        Object obj;
        Iterator it = this.f66424f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Object g = mo6027g(i);
            C41536l.m120488h(g, "getItem(position)");
            if (((C26241e) obj).mo47490d((C27534a) g)) {
                break;
            }
        }
        C26241e eVar = (C26241e) obj;
        if (eVar != null) {
            return eVar.mo47487a();
        }
        Object g2 = mo6027g(i);
        throw new IllegalStateException(("View type not found: " + g2).toString());
    }

    /* renamed from: k */
    public void onBindViewHolder(C26238b bVar, int i) {
        C41536l.m120489i(bVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        bVar.mo48397j((C27534a) g);
    }

    /* renamed from: l */
    public void onBindViewHolder(C26238b bVar, int i, List list) {
        List list2;
        C41536l.m120489i(bVar, "holder");
        C41536l.m120489i(list, "payloads");
        C41238w wVar = null;
        if (!list.isEmpty()) {
            list2 = list;
        } else {
            list2 = null;
        }
        if (list2 != null) {
            Object g = mo6027g(i);
            C41536l.m120488h(g, "getItem(position)");
            bVar.mo65243k((C27534a) g, list);
            wVar = C41238w.f97225a;
        }
        if (wVar == null) {
            super.onBindViewHolder(bVar, i, list);
        }
    }

    /* renamed from: m */
    public C26238b onCreateViewHolder(ViewGroup viewGroup, int i) {
        Object obj;
        boolean z;
        C41536l.m120489i(viewGroup, "parent");
        Iterator it = this.f66424f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C26241e) obj).mo47487a() == i) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        C26241e eVar = (C26241e) obj;
        if (eVar != null) {
            LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
            C41536l.m120488h(from, "from(parent.context)");
            C26238b b = eVar.mo47488b(from, viewGroup, this.f66425g);
            if (b != null) {
                return b;
            }
        }
        throw new IllegalStateException(("View type not found: " + i).toString());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26233a(List list, C26234b bVar) {
        super(new C26236c(list));
        C41536l.m120489i(list, "items");
        C41536l.m120489i(bVar, "eventHandler");
        this.f66424f = list;
        this.f66425g = bVar;
    }
}
