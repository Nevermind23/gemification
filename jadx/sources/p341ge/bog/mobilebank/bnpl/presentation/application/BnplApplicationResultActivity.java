package p341ge.bog.mobilebank.bnpl.presentation.application;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import g91.C32288b;
import g91.C32343x;
import h00.C24846c;
import he1.C41212c;
import he1.C41217g;
import he1.C41233s;
import he1.C41238w;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import o31.C37588a0;
import o31.C37613p;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.mobilebank.bnpl.presentation.application.C13768b;
import p341ge.bog.mobilebank.bnpl.presentation.offers.list.BnplOffersActivity;
import p341ge.bog.mobilebank.cleanarch.offersandapplications.presentation.activity.OffersAndApplicationsActivity;
import p341ge.bog.mobilebank.p975ui.activities.MainActivity;
import p368bm.C10336a;
import p536nl.C17051d;
import p633ul.C18178a;
import p633ul.C18179b;
import p633ul.C18181d;
import p642vh.C18358g;
import p782hu.C25065a;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.bnpl.presentation.application.BnplApplicationResultActivity */
public final class BnplApplicationResultActivity extends C13772c {

    /* renamed from: J */
    public static final C13755a f40992J = new C13755a((DefaultConstructorMarker) null);

    /* renamed from: G */
    private final C41217g f40993G = C41219i.m119470b(new C13756b(this));

    /* renamed from: H */
    public C13768b.C13770b f40994H;

    /* renamed from: I */
    private final C41217g f40995I = new C1617p0(C41520a0.m120436b(C13768b.class), new C13763i(this), new C13765k(this), new C13764j((C43064a) null, this));

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.application.BnplApplicationResultActivity$a */
    public static final class C13755a {
        private C13755a() {
        }

        public /* synthetic */ C13755a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo38121a(C24846c cVar, Context context) {
            C41536l.m120489i(cVar, "status");
            C41536l.m120489i(context, "context");
            context.startActivity(C37613p.m110614a(new Intent(context, BnplApplicationResultActivity.class), C41233s.m119492a("APPLICATION_STATUS", cVar.mo63280b())));
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.application.BnplApplicationResultActivity$b */
    static final class C13756b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ BnplApplicationResultActivity f40996d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13756b(BnplApplicationResultActivity bnplApplicationResultActivity) {
            super(0);
            this.f40996d = bnplApplicationResultActivity;
        }

        /* renamed from: b */
        public final C17051d invoke() {
            return C17051d.m59905d(this.f40996d.getLayoutInflater());
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.application.BnplApplicationResultActivity$c */
    static final class C13757c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BnplApplicationResultActivity f40997d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13757c(BnplApplicationResultActivity bnplApplicationResultActivity) {
            super(1);
            this.f40997d = bnplApplicationResultActivity;
        }

        /* renamed from: a */
        public final void mo38123a(C31128a aVar) {
            BnplApplicationResultActivity bnplApplicationResultActivity = this.f40997d;
            C41536l.m120488h(aVar, "offerLimitResult");
            bnplApplicationResultActivity.m51398R2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo38123a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.application.BnplApplicationResultActivity$d */
    static final class C13758d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BnplApplicationResultActivity f40998d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13758d(BnplApplicationResultActivity bnplApplicationResultActivity) {
            super(1);
            this.f40998d = bnplApplicationResultActivity;
        }

        /* renamed from: a */
        public final void mo38124a(C18181d dVar) {
            BnplApplicationResultActivity bnplApplicationResultActivity = this.f40998d;
            C41536l.m120488h(dVar, "result");
            bnplApplicationResultActivity.m51397Q2(dVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo38124a((C18181d) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.application.BnplApplicationResultActivity$e */
    static final class C13759e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BnplApplicationResultActivity f40999d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13759e(BnplApplicationResultActivity bnplApplicationResultActivity) {
            super(1);
            this.f40999d = bnplApplicationResultActivity;
        }

        /* renamed from: a */
        public final void mo38125a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f40999d.mo86424F1(MainActivity.class, C32288b.OpenHomeOnMainActivity);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo38125a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.application.BnplApplicationResultActivity$f */
    static final class C13760f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BnplApplicationResultActivity f41000d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13760f(BnplApplicationResultActivity bnplApplicationResultActivity) {
            super(1);
            this.f41000d = bnplApplicationResultActivity;
        }

        /* renamed from: a */
        public final void mo38126a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            OffersAndApplicationsActivity.C21371b.m69137b(OffersAndApplicationsActivity.f57206M, this.f41000d, false, 2, (Object) null);
            this.f41000d.finish();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo38126a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.application.BnplApplicationResultActivity$g */
    static final class C13761g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BnplApplicationResultActivity f41001d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13761g(BnplApplicationResultActivity bnplApplicationResultActivity) {
            super(1);
            this.f41001d = bnplApplicationResultActivity;
        }

        /* renamed from: a */
        public final void mo38127a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            BnplOffersActivity.f41243K.mo38321a(this.f41001d);
            this.f41001d.finish();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo38127a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.application.BnplApplicationResultActivity$h */
    static final class C13762h implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f41002a;

        C13762h(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f41002a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f41002a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f41002a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.application.BnplApplicationResultActivity$i */
    public static final class C13763i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f41003d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13763i(ComponentActivity componentActivity) {
            super(0);
            this.f41003d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f41003d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.application.BnplApplicationResultActivity$j */
    public static final class C13764j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f41004d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f41005e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13764j(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f41004d = aVar;
            this.f41005e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f41004d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f41005e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.application.BnplApplicationResultActivity$k */
    static final class C13765k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ BnplApplicationResultActivity f41006d;

        /* renamed from: ge.bog.mobilebank.bnpl.presentation.application.BnplApplicationResultActivity$k$a */
        static final class C13766a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ BnplApplicationResultActivity f41007d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C13766a(BnplApplicationResultActivity bnplApplicationResultActivity) {
                super(0);
                this.f41007d = bnplApplicationResultActivity;
            }

            /* renamed from: b */
            public final C13768b invoke() {
                C13768b.C13770b N2 = this.f41007d.mo38119N2();
                C24846c.C24847a aVar = C24846c.f63808e;
                String stringExtra = this.f41007d.getIntent().getStringExtra("APPLICATION_STATUS");
                if (stringExtra == null) {
                    stringExtra = "";
                }
                return N2.mo32570a(aVar.mo63281a(stringExtra));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13765k(BnplApplicationResultActivity bnplApplicationResultActivity) {
            super(0);
            this.f41006d = bnplApplicationResultActivity;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C13766a(this.f41006d));
        }
    }

    /* renamed from: J2 */
    private final void m51391J2() {
        C17051d M2 = m51394M2();
        M2.f47570h.setOnClickListener(new C18178a(this));
        M2.f47584v.setOnClickListener(new C18179b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: K2 */
    public static final void m51392K2(BnplApplicationResultActivity bnplApplicationResultActivity, View view) {
        C41536l.m120489i(bnplApplicationResultActivity, "this$0");
        bnplApplicationResultActivity.m51395O2().mo38136hw().mo38131Ns();
    }

    /* access modifiers changed from: private */
    /* renamed from: L2 */
    public static final void m51393L2(BnplApplicationResultActivity bnplApplicationResultActivity, View view) {
        C41536l.m120489i(bnplApplicationResultActivity, "this$0");
        C10336a.m37613a(bnplApplicationResultActivity);
        bnplApplicationResultActivity.finish();
    }

    /* renamed from: M2 */
    private final C17051d m51394M2() {
        return (C17051d) this.f40993G.getValue();
    }

    /* renamed from: O2 */
    private final C13768b m51395O2() {
        return (C13768b) this.f40995I.getValue();
    }

    /* renamed from: P2 */
    private final void m51396P2() {
        m51395O2().mo38142mw().mo38144zn().mo4819k(this, new C13762h(new C13757c(this)));
        m51395O2().mo38142mw().mo38143ri().mo4819k(this, new C13762h(new C13758d(this)));
        C37224b.m109963b(m51395O2().mo38142mw().mo38132bq(), this, new C13759e(this));
        C37224b.m109963b(m51395O2().mo38142mw().mo38133bw(), this, new C13760f(this));
        C37224b.m109963b(m51395O2().mo38142mw().mo38138jr(), this, new C13761g(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: Q2 */
    public final void m51397Q2(C18181d dVar) {
        ConstraintLayout constraintLayout = m51394M2().f47583u;
        C41536l.m120488h(constraintLayout, "binding.positiveStatus");
        C32343x.m95455i0(constraintLayout);
        m51394M2().f47570h.setButtonText(dVar.mo45842a());
        PageDescriptionView pageDescriptionView = m51394M2().f47582t;
        C41536l.m120488h(pageDescriptionView, "onAppStatusResult$lambda$5");
        C32343x.m95447f1(pageDescriptionView);
        pageDescriptionView.setTitle(dVar.mo45846e());
        pageDescriptionView.setText(dVar.mo45843b());
        pageDescriptionView.setImage(new Image.Resource(dVar.mo45844c(), (Boolean) null, 2, (DefaultConstructorMarker) null));
        pageDescriptionView.setDrawableTint(C18358g.m62729c(dVar.mo45845d()));
    }

    /* access modifiers changed from: private */
    /* renamed from: R2 */
    public final void m51398R2(C31128a aVar) {
        ConstraintLayout constraintLayout = m51394M2().f47583u;
        C41536l.m120488h(constraintLayout, "binding.positiveStatus");
        C32343x.m95447f1(constraintLayout);
        PageDescriptionView pageDescriptionView = m51394M2().f47582t;
        C41536l.m120488h(pageDescriptionView, "binding.pageRejectedDescription");
        C32343x.m95455i0(pageDescriptionView);
        if (aVar instanceof C31128a.C31130b) {
            m51394M2().f47586x.mo53597e();
        } else if (aVar instanceof C31128a.C31129a) {
            m51394M2().f47586x.mo53596d();
            mo74709H1(((C31128a.C31129a) aVar).mo71342c());
        } else if (aVar instanceof C31128a.C31131c) {
            m51394M2().f47586x.mo53595c();
            C31128a.C31131c cVar = (C31128a.C31131c) aVar;
            m51394M2().f47576n.setText(C32343x.m95410Q(((C25065a) cVar.mo71340a()).mo63498a(), ((C25065a) cVar.mo71340a()).mo63500c(), false, 2, (Object) null));
        }
    }

    /* renamed from: S2 */
    private final void m51399S2() {
        C17051d M2 = m51394M2();
        M2.f47581s.setText(C32343x.m95388F("BNPL.available.amount", new Object[0]));
        M2.f47573k.setText(C32343x.m95388F("BNPL.explanatory.partner.merchants", new Object[0]));
        M2.f47574l.setText(C32343x.m95388F("BNPL.explanatory.online", new Object[0]));
        M2.f47570h.setButtonText(C32343x.m95388F("BNPL.button.label.catalog", new Object[0]));
    }

    /* renamed from: N2 */
    public final C13768b.C13770b mo38119N2() {
        C13768b.C13770b bVar = this.f40994H;
        if (bVar != null) {
            return bVar;
        }
        C41536l.m120506z("factory");
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        setContentView((View) m51394M2().mo3946b());
        super.mo37451O1(bundle);
        m51399S2();
        m51391J2();
        m51396P2();
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return C32343x.m95388F("text.bnpl.name", new Object[0]);
    }
}
