package p20;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l81.C37106c;
import p783hv.C25067a;
import p793iw.C25263b;
import p90.C27292e8;
import p90.C27465x4;
import q20.C27674a;
import q20.C27675b;
import q20.C27676c;

/* renamed from: p20.b */
public final class C27138b extends C37106c {

    /* renamed from: f */
    public static final C27139a f68130f = new C27139a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C27140b f68131d;

    /* renamed from: e */
    private final List f68132e = new ArrayList();

    /* renamed from: p20.b$a */
    public static final class C27139a {
        private C27139a() {
        }

        public /* synthetic */ C27139a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: p20.b$b */
    public interface C27140b {
        /* renamed from: a */
        void mo65902a(C25263b bVar);
    }

    public C27138b(C27140b bVar) {
        this.f68131d = bVar;
    }

    /* renamed from: k */
    private final void m84095k(C25067a aVar, C27676c cVar) {
        C25067a.C25069b bVar;
        if (aVar instanceof C25067a.C25069b) {
            bVar = (C25067a.C25069b) aVar;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            cVar.mo67212i((C25067a.C25069b) aVar);
            cVar.f89287d.setOnClickListener(new C27137a(this, aVar));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final void m84096l(C27138b bVar, C25067a aVar, View view) {
        C41536l.m120489i(bVar, "this$0");
        C41536l.m120489i(aVar, "$operation");
        C27140b bVar2 = bVar.f68131d;
        if (bVar2 != null) {
            bVar2.mo65902a(((C25067a.C25069b) aVar).mo63508a());
        }
    }

    /* renamed from: m */
    private final void m84097m(C25067a aVar, C27675b bVar) {
        C25067a.C25068a aVar2;
        if (aVar instanceof C25067a.C25068a) {
            aVar2 = (C25067a.C25068a) aVar;
        } else {
            aVar2 = null;
        }
        if (aVar2 != null) {
            bVar.mo67211i((C25067a.C25068a) aVar);
        }
    }

    /* renamed from: n */
    private final C25067a m84098n(int i) {
        return (C25067a) this.f68132e.get(i);
    }

    public int getItemCount() {
        return this.f68132e.size();
    }

    public int getItemViewType(int i) {
        if (m84098n(i) instanceof C25067a.C25069b) {
            return 5;
        }
        return 10;
    }

    /* renamed from: o */
    public void onBindViewHolder(C27674a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        if (aVar instanceof C27676c) {
            m84095k(m84098n(i), (C27676c) aVar);
        } else if (aVar instanceof C27675b) {
            m84097m(m84098n(i), (C27675b) aVar);
        }
    }

    /* renamed from: p */
    public C27674a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        if (i == 5) {
            C27465x4 d = C27465x4.m85169d(mo90034f(viewGroup), viewGroup, false);
            C41536l.m120488h(d, "inflate(\n               …      false\n            )");
            return new C27676c(d);
        }
        C27292e8 d2 = C27292e8.m84469d(mo90034f(viewGroup), viewGroup, false);
        C41536l.m120488h(d2, "inflate(\n               …      false\n            )");
        return new C27675b(d2);
    }

    /* renamed from: q */
    public final void mo66438q(List list) {
        C41536l.m120489i(list, "bSplitOperations");
        this.f68132e.clear();
        this.f68132e.addAll(list);
        notifyDataSetChanged();
    }
}
