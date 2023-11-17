package a50;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32343x;
import he1.C41232r;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.buttons.Button;
import p90.C27359l6;

/* renamed from: a50.b */
public final class C19170b extends RecyclerView.C1736h {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C19172b f53373d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C19171a f53374e;

    /* renamed from: f */
    private List f53375f = new ArrayList();

    /* renamed from: a50.b$a */
    public interface C19171a {
        /* renamed from: a */
        void mo47409a(String str);
    }

    /* renamed from: a50.b$b */
    public interface C19172b {
        /* renamed from: a */
        void mo47410a(String str);
    }

    /* renamed from: a50.b$c */
    public final class C19173c extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C27359l6 f53376d;

        /* renamed from: e */
        final /* synthetic */ C19170b f53377e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19173c(C19170b bVar, C27359l6 l6Var) {
            super(l6Var.mo3946b());
            C41536l.m120489i(l6Var, "binding");
            this.f53377e = bVar;
            this.f53376d = l6Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public static final void m64594k(C19170b bVar, String str, View view) {
            C41536l.m120489i(bVar, "this$0");
            C41536l.m120489i(str, "$secondText");
            C19172b g = bVar.f53373d;
            if (g != null) {
                g.mo47410a(str);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public static final boolean m64595l(C19170b bVar, String str, View view) {
            C41536l.m120489i(bVar, "this$0");
            C41536l.m120489i(str, "$secondText");
            C19171a f = bVar.f53374e;
            if (f == null) {
                return true;
            }
            f.mo47409a(str);
            return true;
        }

        /* renamed from: j */
        public final void mo47411j(C41232r rVar) {
            C41536l.m120489i(rVar, "item");
            String str = (String) rVar.mo95692e();
            C27359l6 l6Var = this.f53376d;
            C19170b bVar = this.f53377e;
            l6Var.f69252f.setTitle((CharSequence) rVar.mo95691d());
            l6Var.f69252f.setText(str);
            if (rVar.mo95694f() == C19176e.ACCOUNT_NUMBER) {
                Button button = l6Var.f69251e;
                C41536l.m120488h(button, "shareButton");
                C32343x.m95447f1(button);
                l6Var.f69251e.setOnClickListener(new C19174c(bVar, str));
                l6Var.f69252f.setOnLongClickListener(new C19175d(bVar, str));
                return;
            }
            Button button2 = l6Var.f69251e;
            C41536l.m120488h(button2, "shareButton");
            C32343x.m95455i0(button2);
        }
    }

    public int getItemCount() {
        return this.f53375f.size();
    }

    /* renamed from: h */
    public final void mo47402h(String str, String str2) {
        C41536l.m120489i(str, "title");
        C41536l.m120489i(str2, "text");
        mo47403i(str, str2, C19176e.COMMON);
    }

    /* renamed from: i */
    public final void mo47403i(String str, String str2, C19176e eVar) {
        C41536l.m120489i(str, "title");
        C41536l.m120489i(str2, "text");
        C41536l.m120489i(eVar, "type");
        this.f53375f.add(new C41232r(str, str2, eVar));
        notifyDataSetChanged();
    }

    /* renamed from: j */
    public void onBindViewHolder(C19173c cVar, int i) {
        C41536l.m120489i(cVar, "holder");
        cVar.mo47411j((C41232r) this.f53375f.get(i));
    }

    /* renamed from: k */
    public C19173c onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C27359l6 d = C27359l6.m84746d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …      false\n            )");
        return new C19173c(this, d);
    }

    /* renamed from: l */
    public final void mo47406l() {
        this.f53375f.clear();
        notifyDataSetChanged();
    }

    /* renamed from: m */
    public final void mo47407m(C19171a aVar) {
        this.f53374e = aVar;
    }

    /* renamed from: n */
    public final void mo47408n(C19172b bVar) {
        this.f53373d = bVar;
    }
}
