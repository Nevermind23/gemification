package p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.details;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.LinearLayout;
import androidx.activity.ComponentActivity;
import androidx.core.content.C0767a;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32297d;
import g91.C32335t0;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import p163m0.C7047a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.details.viewmodel.MoneyRequestDetailsViewModel;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p366bk.C10318g;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p812kv.C25782e;
import p90.C27407r0;
import t20.C28299a;
import t20.C28300b;
import u20.C28547a;
import u20.C28548b;
import ue1.C43064a;
import ue1.C43075l;
import w20.C29192a;
import y20.C29889a;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.details.MoneyRequestDetailsActivity */
public final class MoneyRequestDetailsActivity extends C21844a {

    /* renamed from: M */
    public static final C21829a f58221M = new C21829a((DefaultConstructorMarker) null);

    /* renamed from: G */
    public PreferencesApiManager f58222G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public C28547a f58223H;

    /* renamed from: I */
    private final C41217g f58224I = new C1617p0(C41520a0.m120436b(MoneyRequestDetailsViewModel.class), new C21842m(this), new C21841l(this), new C21843n((C43064a) null, this));

    /* renamed from: J */
    private final C41217g f58225J = C41219i.m119470b(new C21830b(this));
    /* access modifiers changed from: private */

    /* renamed from: K */
    public final Handler f58226K = new Handler();
    /* access modifiers changed from: private */

    /* renamed from: L */
    public final Runnable f58227L = new C28299a(this);

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.details.MoneyRequestDetailsActivity$a */
    public static final class C21829a {
        private C21829a() {
        }

        public /* synthetic */ C21829a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo54420a(Context context, long j) {
            C41536l.m120489i(context, "context");
            Intent intent = new Intent(context, MoneyRequestDetailsActivity.class);
            intent.putExtra("REQUEST_ID_PARAM", j);
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.details.MoneyRequestDetailsActivity$b */
    static final class C21830b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ MoneyRequestDetailsActivity f58228d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21830b(MoneyRequestDetailsActivity moneyRequestDetailsActivity) {
            super(0);
            this.f58228d = moneyRequestDetailsActivity;
        }

        /* renamed from: b */
        public final C27407r0 invoke() {
            C27407r0 a = C27407r0.m84931a(this.f58228d.findViewById(C10322k.money_request_details_content_layout));
            C41536l.m120488h(a, "bind(findViewById(R.id.m…_details_content_layout))");
            return a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.details.MoneyRequestDetailsActivity$c */
    static final class C21831c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyRequestDetailsActivity f58229d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21831c(MoneyRequestDetailsActivity moneyRequestDetailsActivity) {
            super(1);
            this.f58229d = moneyRequestDetailsActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m70744c(MoneyRequestDetailsActivity moneyRequestDetailsActivity, C29192a.C29198f fVar, View view) {
            C41536l.m120489i(moneyRequestDetailsActivity, "this$0");
            C41536l.m120489i(fVar, "$receiver");
            moneyRequestDetailsActivity.m70734P2().mo54436Bw(fVar);
        }

        /* renamed from: b */
        public final void mo54422b(C29192a.C29198f fVar) {
            C41536l.m120489i(fVar, "receiver");
            MoneyRequestDetailsActivity moneyRequestDetailsActivity = this.f58229d;
            moneyRequestDetailsActivity.m70736R2(C10328q.money_request_details_mark_as_received_dialog_title, C10328q.money_request_details_mark_as_received_dialog_text, new C21846b(moneyRequestDetailsActivity, fVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54422b((C29192a.C29198f) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.details.MoneyRequestDetailsActivity$d */
    static final class C21832d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyRequestDetailsActivity f58230d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21832d(MoneyRequestDetailsActivity moneyRequestDetailsActivity) {
            super(1);
            this.f58230d = moneyRequestDetailsActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m70747c(MoneyRequestDetailsActivity moneyRequestDetailsActivity, View view) {
            C41536l.m120489i(moneyRequestDetailsActivity, "this$0");
            moneyRequestDetailsActivity.m70734P2().mo54439rw();
        }

        /* renamed from: b */
        public final void mo54423b(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            MoneyRequestDetailsActivity moneyRequestDetailsActivity = this.f58230d;
            moneyRequestDetailsActivity.m70736R2(C10328q.money_request_details_dialog_title_cancel_request, C10328q.money_request_details_msg_info_cancel_request, new C21847c(moneyRequestDetailsActivity));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54423b((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.details.MoneyRequestDetailsActivity$e */
    static final class C21833e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyRequestDetailsActivity f58231d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21833e(MoneyRequestDetailsActivity moneyRequestDetailsActivity) {
            super(1);
            this.f58231d = moneyRequestDetailsActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m70750c(MoneyRequestDetailsActivity moneyRequestDetailsActivity, int i) {
            C41536l.m120489i(moneyRequestDetailsActivity, "this$0");
            moneyRequestDetailsActivity.m70733N2().f69643j.mo5425x1(i);
            C28547a G2 = moneyRequestDetailsActivity.f58223H;
            if (G2 == null) {
                C41536l.m120506z("adapter");
                G2 = null;
            }
            G2.notifyItemChanged(i, Boolean.TRUE);
        }

        /* renamed from: b */
        public final void mo54424b(List list) {
            C28547a G2 = this.f58231d.f58223H;
            if (G2 == null) {
                C41536l.m120506z("adapter");
                G2 = null;
            }
            C41536l.m120488h(list, "it");
            G2.mo68287i(list);
            if (!this.f58231d.mo54419O2().isMoneyRequestReceiverItemSwiped()) {
                Iterator it = list.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    } else if (((C29192a) it.next()) instanceof C29192a.C29198f) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i != -1) {
                    this.f58231d.m70733N2().f69643j.post(new C21848d(this.f58231d, i));
                }
                this.f58231d.mo54419O2().setMoneyRequestReceiverItemSwiped();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54424b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.details.MoneyRequestDetailsActivity$f */
    static final class C21834f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyRequestDetailsActivity f58232d;

        /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.details.MoneyRequestDetailsActivity$f$a */
        public /* synthetic */ class C21835a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f58233a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    kv.e[] r0 = p812kv.C25782e.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    kv.e r1 = p812kv.C25782e.DONE_SUCCESSFULLY     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    kv.e r1 = p812kv.C25782e.DONE_FAILED     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f58233a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.details.MoneyRequestDetailsActivity.C21834f.C21835a.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21834f(MoneyRequestDetailsActivity moneyRequestDetailsActivity) {
            super(1);
            this.f58232d = moneyRequestDetailsActivity;
        }

        /* renamed from: a */
        public final void mo54425a(C29889a aVar) {
            int i;
            int i2;
            LinearLayout linearLayout = this.f58232d.m70733N2().f69639f;
            C41536l.m120488h(linearLayout, "binding.buttonLayout");
            C32343x.m95483r1(linearLayout, aVar.mo70169f(), false, 2, (Object) null);
            C25782e d = aVar.mo70166d();
            if (d == null) {
                i = -1;
            } else {
                i = C21835a.f58233a[d.ordinal()];
            }
            if (i == 1) {
                i2 = C0767a.m2893c(this.f58232d, C10318g.money_request_complete_button_green);
            } else if (i != 2) {
                i2 = C32335t0.m95358c(this.f58232d);
            } else {
                i2 = C0767a.m2893c(this.f58232d, C10318g.money_request_complete_button_red);
            }
            this.f58232d.m70733N2().f69640g.setBackgroundTintList(ColorStateList.valueOf(i2));
            this.f58232d.m70733N2().f69638e.setText(aVar.mo70165c());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54425a((C29889a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.details.MoneyRequestDetailsActivity$g */
    static final class C21836g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyRequestDetailsActivity f58234d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21836g(MoneyRequestDetailsActivity moneyRequestDetailsActivity) {
            super(1);
            this.f58234d = moneyRequestDetailsActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m70754c(C21503d dVar, MoneyRequestDetailsActivity moneyRequestDetailsActivity) {
            C41536l.m120489i(dVar, "$result");
            C41536l.m120489i(moneyRequestDetailsActivity, "this$0");
            if (C41536l.m120484d(dVar.mo53701a(), Boolean.TRUE)) {
                moneyRequestDetailsActivity.finish();
            }
        }

        /* renamed from: b */
        public final void mo54426b(C37223a aVar) {
            C21503d dVar = (C21503d) aVar.mo90296a();
            if (dVar != null) {
                MoneyRequestDetailsActivity moneyRequestDetailsActivity = this.f58234d;
                if (dVar instanceof C21503d.C21506c) {
                    C32297d.m95161i(moneyRequestDetailsActivity, moneyRequestDetailsActivity.getString(C10328q.f28956f2), C32297d.f79706b, new C21849e(dVar, moneyRequestDetailsActivity));
                } else if (dVar instanceof C21503d.C21504a) {
                    moneyRequestDetailsActivity.mo52674G1((C21503d.C21504a) dVar);
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54426b((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.details.MoneyRequestDetailsActivity$h */
    static final class C21837h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyRequestDetailsActivity f58235d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21837h(MoneyRequestDetailsActivity moneyRequestDetailsActivity) {
            super(1);
            this.f58235d = moneyRequestDetailsActivity;
        }

        /* renamed from: a */
        public final void mo54427a(boolean z) {
            if (!z) {
                this.f58235d.finish();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54427a(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.details.MoneyRequestDetailsActivity$i */
    static final class C21838i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyRequestDetailsActivity f58236d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21838i(MoneyRequestDetailsActivity moneyRequestDetailsActivity) {
            super(1);
            this.f58236d = moneyRequestDetailsActivity;
        }

        /* renamed from: a */
        public final void mo54428a(boolean z) {
            LinearLayout c = this.f58236d.m70733N2().f69642i.mo3946b();
            C41536l.m120488h(c, "binding.progressBar.root");
            C32343x.m95483r1(c, z, false, 2, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54428a(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.details.MoneyRequestDetailsActivity$j */
    static final class C21839j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyRequestDetailsActivity f58237d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21839j(MoneyRequestDetailsActivity moneyRequestDetailsActivity) {
            super(1);
            this.f58237d = moneyRequestDetailsActivity;
        }

        /* renamed from: a */
        public final void mo54429a(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "it");
            this.f58237d.mo52674G1(aVar);
            this.f58237d.f58226K.postDelayed(this.f58237d.f58227L, 2000);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54429a((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.details.MoneyRequestDetailsActivity$k */
    static final class C21840k implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f58238a;

        C21840k(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f58238a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f58238a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f58238a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.details.MoneyRequestDetailsActivity$l */
    public static final class C21841l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f58239d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21841l(ComponentActivity componentActivity) {
            super(0);
            this.f58239d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f58239d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.details.MoneyRequestDetailsActivity$m */
    public static final class C21842m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f58240d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21842m(ComponentActivity componentActivity) {
            super(0);
            this.f58240d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f58240d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.details.MoneyRequestDetailsActivity$n */
    public static final class C21843n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f58241d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f58242e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21843n(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f58241d = aVar;
            this.f58242e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f58241d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f58242e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: M2 */
    public static final void m70732M2(MoneyRequestDetailsActivity moneyRequestDetailsActivity) {
        C41536l.m120489i(moneyRequestDetailsActivity, "this$0");
        moneyRequestDetailsActivity.finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: N2 */
    public final C27407r0 m70733N2() {
        return (C27407r0) this.f58225J.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: P2 */
    public final MoneyRequestDetailsViewModel m70734P2() {
        return (MoneyRequestDetailsViewModel) this.f58224I.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: Q2 */
    public static final void m70735Q2(MoneyRequestDetailsActivity moneyRequestDetailsActivity, View view) {
        C41536l.m120489i(moneyRequestDetailsActivity, "this$0");
        moneyRequestDetailsActivity.m70734P2().mo54440sw();
    }

    /* access modifiers changed from: private */
    /* renamed from: R2 */
    public final void m70736R2(int i, int i2, View.OnClickListener onClickListener) {
        C35388f2.m105072l2(this, getString(i), getString(i2), getString(C10328q.f28966r2), getString(C10328q.f28951b2), onClickListener, (View.OnClickListener) null, false, true, (String) null, (View.OnClickListener) null, 768, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_money_request_details;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        this.f58223H = new C28547a(new C21831c(this), new C21832d(this));
        RecyclerView recyclerView = m70733N2().f69643j;
        C28547a aVar = this.f58223H;
        if (aVar == null) {
            C41536l.m120506z("adapter");
            aVar = null;
        }
        recyclerView.setAdapter(aVar);
        m70733N2().f69643j.mo5351j(new C28548b(this));
        m70733N2().f69640g.setOnClickListener(new C28300b(this));
        m70734P2().mo54437Fw(getIntent().getLongExtra("REQUEST_ID_PARAM", -1));
        m70734P2().mo54438n3().mo4819k(this, new C21840k(new C21833e(this)));
        m70734P2().mo54441tw().mo4819k(this, new C21840k(new C21834f(this)));
        m70734P2().mo54443vw().mo4819k(this, new C21840k(new C21836g(this)));
        C21484c.m69411c(m70734P2().mo54442uw(), this, new C21837h(this), new C21838i(this), new C21839j(this));
    }

    /* renamed from: O2 */
    public final PreferencesApiManager mo54419O2() {
        PreferencesApiManager preferencesApiManager = this.f58222G;
        if (preferencesApiManager != null) {
            return preferencesApiManager;
        }
        C41536l.m120506z("preferencesApiManager");
        return null;
    }

    public void onBackPressed() {
        super.onBackPressed();
        this.f58226K.removeCallbacks(this.f58227L);
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        String string = getString(C10328q.title_money_request);
        C41536l.m120488h(string, "getString(R.string.title_money_request)");
        return string;
    }
}
