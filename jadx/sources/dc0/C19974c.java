package dc0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.mobilebank.deposits.presentation.model.depositbreak.DepositBreakOption;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p615tg.C17963d;
import xb0.C29728p;
import xb0.C29730r;

/* renamed from: dc0.c */
public final class C19974c extends C1819o {

    /* renamed from: f */
    private final C19980e f54569f;

    /* renamed from: dc0.c$a */
    public static abstract class C19975a extends RecyclerView.C1734f0 {

        /* renamed from: dc0.c$a$a */
        public static final class C19976a extends C19975a {

            /* renamed from: d */
            private final C29728p f54570d;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public C19976a(xb0.C29728p r3) {
                /*
                    r2 = this;
                    java.lang.String r0 = "binding"
                    kotlin.jvm.internal.C41536l.m120489i(r3, r0)
                    ge.bog.designsystem.components.list.ListItem r0 = r3.mo3946b()
                    java.lang.String r1 = "binding.root"
                    kotlin.jvm.internal.C41536l.m120488h(r0, r1)
                    r1 = 0
                    r2.<init>(r0, r1)
                    r2.f54570d = r3
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: dc0.C19974c.C19975a.C19976a.<init>(xb0.p):void");
            }

            /* access modifiers changed from: private */
            /* renamed from: j */
            public static final void m65877j(C19980e eVar, DepositBreakOption.DepositBreakActionOption depositBreakActionOption, View view) {
                C41536l.m120489i(eVar, "$listener");
                C41536l.m120489i(depositBreakActionOption, "$item");
                eVar.mo48346a(depositBreakActionOption);
            }

            /* renamed from: i */
            public final void mo48344i(DepositBreakOption.DepositBreakActionOption depositBreakActionOption, C19980e eVar) {
                C41536l.m120489i(depositBreakActionOption, "item");
                C41536l.m120489i(eVar, "listener");
                Context context = this.f54570d.mo3946b().getContext();
                this.f54570d.mo3946b().setOnClickListener(new C19973b(eVar, depositBreakActionOption));
                LayerView layerView = this.f54570d.f75132g;
                Color b = depositBreakActionOption.mo58100b();
                C41536l.m120488h(context, "context");
                layerView.setBackgroundTintList(ColorStateList.valueOf(b.mo35260a(context)));
                this.f54570d.f75131f.setImageTintList(ColorStateList.valueOf(depositBreakActionOption.mo58102e().mo35260a(context)));
                this.f54570d.f75131f.setImageResource(depositBreakActionOption.mo58101d());
                this.f54570d.f75130e.setText(C34646b.m101752f(depositBreakActionOption.mo58087a(), (Context) null, 1, (Object) null));
            }
        }

        /* renamed from: dc0.c$a$b */
        public static final class C19977b extends C19975a {

            /* renamed from: d */
            private final C19980e f54571d;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public C19977b(xb0.C29730r r4, dc0.C19980e r5) {
                /*
                    r3 = this;
                    java.lang.String r0 = "binding"
                    kotlin.jvm.internal.C41536l.m120489i(r4, r0)
                    java.lang.String r0 = "listener"
                    kotlin.jvm.internal.C41536l.m120489i(r5, r0)
                    ge.bog.designsystem.components.buttons.Button r0 = r4.mo3946b()
                    java.lang.String r1 = "binding.root"
                    kotlin.jvm.internal.C41536l.m120488h(r0, r1)
                    r1 = 0
                    r3.<init>(r0, r1)
                    r3.f54571d = r5
                    ge.bog.designsystem.components.buttons.Button r5 = r4.mo3946b()
                    ge.bog.mobilebank.deposits.presentation.model.depositbreak.DepositBreakOption$NoOptions r0 = p341ge.bog.mobilebank.deposits.presentation.model.depositbreak.DepositBreakOption.NoOptions.f60819e
                    ge.bog.mobilebank.shared.helper.StringSource r0 = r0.mo58087a()
                    r2 = 1
                    java.lang.String r0 = p341ge.bog.mobilebank.shared.helper.C34646b.m101752f(r0, r1, r2, r1)
                    r5.setButtonText(r0)
                    ge.bog.designsystem.components.buttons.Button r4 = r4.mo3946b()
                    dc0.d r5 = new dc0.d
                    r5.<init>(r3)
                    r4.setOnClickListener(r5)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: dc0.C19974c.C19975a.C19977b.<init>(xb0.r, dc0.e):void");
            }

            /* access modifiers changed from: private */
            /* renamed from: i */
            public static final void m65880i(C19977b bVar, View view) {
                C41536l.m120489i(bVar, "this$0");
                bVar.f54571d.mo48346a(DepositBreakOption.NoOptions.f60819e);
            }
        }

        public /* synthetic */ C19975a(View view, DefaultConstructorMarker defaultConstructorMarker) {
            this(view);
        }

        private C19975a(View view) {
            super(view);
        }
    }

    /* renamed from: dc0.c$b */
    private enum C19978b {
        ACTION_ITEM,
        DISMISS_ITEM
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19974c(C19980e eVar) {
        super(C17963d.f51158a.mo45633d());
        C41536l.m120489i(eVar, "listener");
        this.f54569f = eVar;
    }

    public int getItemViewType(int i) {
        C19978b bVar;
        DepositBreakOption depositBreakOption = (DepositBreakOption) mo6027g(i);
        if (depositBreakOption instanceof DepositBreakOption.DepositBreakActionOption) {
            bVar = C19978b.ACTION_ITEM;
        } else if (depositBreakOption instanceof DepositBreakOption.NoOptions) {
            bVar = C19978b.DISMISS_ITEM;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return bVar.ordinal();
    }

    /* renamed from: k */
    public void onBindViewHolder(C19975a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        DepositBreakOption depositBreakOption = (DepositBreakOption) mo6027g(i);
        if ((depositBreakOption instanceof DepositBreakOption.DepositBreakActionOption) && (aVar instanceof C19975a.C19976a)) {
            ((C19975a.C19976a) aVar).mo48344i((DepositBreakOption.DepositBreakActionOption) depositBreakOption, this.f54569f);
        }
    }

    /* renamed from: l */
    public C19975a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        if (i == C19978b.ACTION_ITEM.ordinal()) {
            C29728p d = C29728p.m90278d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d, "inflate(LayoutInflater.f…                   false)");
            return new C19975a.C19976a(d);
        } else if (i == C19978b.DISMISS_ITEM.ordinal()) {
            C29730r d2 = C29730r.m90286d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d2, "inflate(LayoutInflater.f…                   false)");
            return new C19975a.C19977b(d2, this.f54569f);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
