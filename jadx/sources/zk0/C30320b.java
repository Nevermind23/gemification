package zk0;

import al0.C19262c;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C41536l;
import ok0.C27028d;
import p045d.C5769a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p615tg.C17963d;
import pk0.C27551a;
import sk0.C28240c;

/* renamed from: zk0.b */
public final class C30320b extends C1819o {

    /* renamed from: f */
    private C30321a f76228f;

    /* renamed from: zk0.b$a */
    public interface C30321a {
        /* renamed from: c */
        void mo62209c(C27551a aVar);
    }

    /* renamed from: zk0.b$b */
    public final class C30322b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C28240c f76229d;

        /* renamed from: e */
        private C30321a f76230e;

        /* renamed from: f */
        final /* synthetic */ C30320b f76231f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C30322b(C30320b bVar, C28240c cVar) {
            super(cVar.mo3946b());
            C41536l.m120489i(cVar, "binding");
            this.f76231f = bVar;
            this.f76229d = cVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m91436j(C30322b bVar, C27551a aVar, View view) {
            C41536l.m120489i(bVar, "this$0");
            C41536l.m120489i(aVar, "$bankingProductHub");
            C30321a aVar2 = bVar.f76230e;
            if (aVar2 != null) {
                aVar2.mo62209c(aVar);
            }
        }

        /* renamed from: k */
        private final CharSequence m91437k(C27551a aVar, Context context) {
            if (aVar instanceof C27551a.C27573e) {
                return C27551a.C27552a.C27561i.f70471h.mo66928g(C34646b.m101752f(aVar.mo66932d(), (Context) null, 1, (Object) null), context, C27028d.f67860H);
            }
            return C34646b.m101752f(aVar.mo66932d(), (Context) null, 1, (Object) null);
        }

        /* renamed from: i */
        public final void mo70645i(C27551a aVar) {
            boolean z;
            C41536l.m120489i(aVar, "bankingProductHub");
            C28240c cVar = this.f76229d;
            Color e = aVar.mo66926e();
            if (e != null) {
                Button button = cVar.f71649f;
                Context context = cVar.mo3946b().getContext();
                C41536l.m120488h(context, "root.context");
                button.setBackgroundSelector(C19262c.m64709a(e, context));
            }
            cVar.f71649f.setButtonIcon(C5769a.m23210b(cVar.mo3946b().getContext(), aVar.mo66931b()));
            ImageView imageView = cVar.f71648e;
            C41536l.m120488h(imageView, "badgeHub");
            int i = 0;
            if (aVar.mo66927f() != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                i = 8;
            }
            imageView.setVisibility(i);
            Integer f = aVar.mo66927f();
            if (f != null) {
                cVar.f71648e.setImageResource(f.intValue());
            }
            Color a = aVar.mo66930a();
            if (a != null) {
                Button button2 = cVar.f71649f;
                Context context2 = cVar.mo3946b().getContext();
                C41536l.m120488h(context2, "root.context");
                button2.setButtonIconTint(a.mo35261b(context2));
            }
            Button button3 = cVar.f71649f;
            Context context3 = cVar.mo3946b().getContext();
            C41536l.m120488h(context3, "root.context");
            button3.setButtonText(m91437k(aVar, context3));
            cVar.f71649f.setEnabled(aVar.mo66929h());
            cVar.f71649f.setOnClickListener(new C30323c(this, aVar));
        }

        /* renamed from: l */
        public final void mo70646l(C30321a aVar) {
            this.f76230e = aVar;
        }
    }

    public C30320b() {
        super(C17963d.f51158a.mo45633d());
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static final void m91430n(C30320b bVar, C27551a aVar) {
        C41536l.m120489i(bVar, "this$0");
        C41536l.m120489i(aVar, "bankingProduct");
        C30321a aVar2 = bVar.f76228f;
        if (aVar2 != null) {
            aVar2.mo62209c(aVar);
        }
    }

    /* renamed from: l */
    public void onBindViewHolder(C30322b bVar, int i) {
        C41536l.m120489i(bVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        bVar.mo70645i((C27551a) g);
    }

    /* renamed from: m */
    public C30322b onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C28240c d = C28240c.m86783d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n            Lay…          false\n        )");
        C30322b bVar = new C30322b(this, d);
        bVar.mo70646l(new C30319a(this));
        return bVar;
    }

    /* renamed from: o */
    public final void mo70644o(C30321a aVar) {
        this.f76228f = aVar;
    }
}
