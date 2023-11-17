package p449hi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p045d.C5769a;
import p341ge.bog.designsystem.components.buttons.Button;
import p601sg.C17782g;
import p601sg.C17783h;
import ue1.C43064a;

/* renamed from: hi.b */
public final class C15516b extends RecyclerView.C1736h {

    /* renamed from: d */
    private List f44024d = new ArrayList();

    /* renamed from: e */
    private int f44025e;

    /* renamed from: hi.b$a */
    public final class C15517a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final Button f44026d;

        /* renamed from: e */
        final /* synthetic */ C15516b f44027e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15517a(C15516b bVar, View view) {
            super(view);
            C41536l.m120489i(view, "itemView");
            this.f44027e = bVar;
            View findViewById = view.findViewById(C17782g.f49680D0);
            C41536l.m120488h(findViewById, "itemView.findViewById(R.id.button)");
            this.f44026d = (Button) findViewById;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m56094j(C15518c cVar, View view) {
            C41536l.m120489i(cVar, "$this_with");
            C43064a a = cVar.mo42633a();
            if (a != null) {
                a.invoke();
            }
        }

        /* renamed from: i */
        public final void mo42632i(C15518c cVar) {
            C41536l.m120489i(cVar, "headerButton");
            C15516b bVar = this.f44027e;
            this.itemView.setOnClickListener(new C15515a(cVar));
            this.f44026d.setButtonIcon(C5769a.m23210b(this.itemView.getContext(), cVar.mo42634b()));
            this.f44026d.setButtonText(cVar.mo42636d());
            if (bVar.getItemCount() > 1 && cVar.mo42635c() != null) {
                this.f44026d.setMaxLines(cVar.mo42635c().intValue());
            }
        }
    }

    /* renamed from: f */
    public void onBindViewHolder(C15517a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        aVar.mo42632i((C15518c) this.f44024d.get(i));
    }

    /* renamed from: g */
    public C15517a onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        C41536l.m120489i(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        int itemCount = getItemCount();
        boolean z = true;
        if (itemCount == 1) {
            i2 = C17783h.item_statement_header_single_button;
        } else {
            if (2 > itemCount || itemCount > this.f44025e) {
                z = false;
            }
            if (z) {
                i2 = C17783h.item_statement_header_multiple_buttons;
            } else {
                throw new IllegalStateException("Buttons count must be in range of 1.." + this.f44025e);
            }
        }
        View inflate = from.inflate(i2, viewGroup, false);
        C41536l.m120488h(inflate, "inflater.inflate(layout, parent, false)");
        return new C15517a(this, inflate);
    }

    public int getItemCount() {
        return this.f44024d.size();
    }

    /* renamed from: h */
    public final void mo42630h(List list) {
        C41536l.m120489i(list, "buttons");
        this.f44024d = list;
        notifyDataSetChanged();
    }

    /* renamed from: i */
    public final void mo42631i(int i) {
        this.f44025e = i;
    }
}
