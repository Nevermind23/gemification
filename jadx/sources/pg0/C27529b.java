package pg0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.C0767a;
import androidx.core.widget.C1314o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32343x;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import tg0.C28384f;
import ue0.C28755u0;
import ue1.C43075l;

/* renamed from: pg0.b */
public final class C27529b extends RecyclerView.C1736h {

    /* renamed from: d */
    private List f70419d;

    /* renamed from: e */
    private final C43075l f70420e;

    /* renamed from: pg0.b$a */
    public static final class C27530a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C28755u0 f70421d;

        /* renamed from: e */
        private final C43075l f70422e;

        /* renamed from: pg0.b$a$a */
        public /* synthetic */ class C27531a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f70423a;

            /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            static {
                /*
                    tg0.g[] r0 = tg0.C28387g.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    tg0.g r1 = tg0.C28387g.ORDER_1_B     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    tg0.g r1 = tg0.C28387g.SPUR     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    tg0.g r1 = tg0.C28387g.ORDER_1_S     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    tg0.g r1 = tg0.C28387g.SSAL     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    f70423a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: pg0.C27529b.C27530a.C27531a.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27530a(C28755u0 u0Var, C43075l lVar) {
            super(u0Var.mo3946b());
            C41536l.m120489i(u0Var, "binding");
            this.f70421d = u0Var;
            this.f70422e = lVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m85337j(C27530a aVar, C28384f fVar, View view) {
            C41536l.m120489i(aVar, "this$0");
            C41536l.m120489i(fVar, "$transaction");
            C43075l lVar = aVar.f70422e;
            if (lVar != null) {
                lVar.invoke(fVar);
            }
        }

        /* renamed from: i */
        public final void mo66847i(C28384f fVar) {
            String str;
            boolean z;
            boolean z2;
            C41536l.m120489i(fVar, "transaction");
            this.f70421d.mo3946b().setOnClickListener(new C27528a(this, fVar));
            this.f70421d.f73479e.setImageResource(fVar.mo68004a().mo67999c());
            C28755u0 u0Var = this.f70421d;
            u0Var.f73479e.setColorFilter(C0767a.m2893c(u0Var.f73480f.getContext(), fVar.mo68004a().mo68000e()));
            LayerView layerView = this.f70421d.f73480f;
            layerView.setBackgroundColor(C0767a.m2893c(layerView.getContext(), fVar.mo68004a().mo67998b()));
            this.f70421d.f73486l.setText(fVar.mo68010f());
            this.f70421d.f73484j.setText(fVar.mo68005b());
            this.f70421d.f73485k.setText(fVar.mo68006c());
            this.f70421d.f73482h.setText(fVar.mo68008e());
            TextView textView = this.f70421d.f73481g;
            textView.getContext();
            int i = C27531a.f70423a[fVar.mo68012h().ordinal()];
            boolean z3 = true;
            if (i == 1 || i == 2) {
                str = String.valueOf(fVar.mo68007d());
            } else if (i == 3 || i == 4) {
                str = String.valueOf(fVar.mo68007d());
            } else {
                str = fVar.mo68007d();
            }
            textView.setText(str);
            C1314o.m4575q(this.f70421d.f73481g, fVar.mo68004a().mo68001f());
            TextView textView2 = this.f70421d.f73485k;
            C41536l.m120488h(textView2, "binding.tranShare");
            if (fVar.mo68006c() != null) {
                z = true;
            } else {
                z = false;
            }
            C32343x.m95483r1(textView2, z, false, 2, (Object) null);
            TextView textView3 = this.f70421d.f73481g;
            C41536l.m120488h(textView3, "binding.rightBottom");
            if (fVar.mo68007d() != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            C32343x.m95483r1(textView3, z2, false, 2, (Object) null);
            TextView textView4 = this.f70421d.f73482h;
            C41536l.m120488h(textView4, "binding.rightTop");
            if (fVar.mo68008e() == null) {
                z3 = false;
            }
            C32343x.m95483r1(textView4, z3, false, 2, (Object) null);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C27529b(List list, C43075l lVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C41341q.m119907j() : list, (i & 2) != 0 ? null : lVar);
    }

    /* renamed from: f */
    public void onBindViewHolder(C27530a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        aVar.mo66847i((C28384f) this.f70419d.get(i));
    }

    /* renamed from: g */
    public C27530a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C28755u0 d = C28755u0.m88151d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …      false\n            )");
        return new C27530a(d, this.f70420e);
    }

    public int getItemCount() {
        return this.f70419d.size();
    }

    /* renamed from: h */
    public final void mo66846h(List list) {
        C41536l.m120489i(list, "data");
        this.f70419d = list;
        notifyDataSetChanged();
    }

    public C27529b(List list, C43075l lVar) {
        C41536l.m120489i(list, "data");
        this.f70419d = list;
        this.f70420e = lVar;
    }
}
