package p341ge.bog.mobilebank.bnpl.presentation.details;

import a41.C30483b;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;
import androidx.core.graphics.C0829d;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.recyclerview.widget.RecyclerView;
import b41.C31128a;
import b41.C31132b;
import com.google.android.material.appbar.AppBarLayout;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import g91.C32286a1;
import g91.C32303f;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41224m;
import he1.C41238w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.productheader.NewProductHeaderView;
import p341ge.bog.designsystem.components.toolbar.ToolbarView;
import p341ge.bog.mobilebank.bnpl.presentation.details.C13838d;
import p341ge.bog.mobilebank.bnpl.presentation.details.C13851f;
import p341ge.bog.mobilebank.model.RepaymentAccount;
import p341ge.bog.mobilebank.shared.products.presentation.LinearLayoutManagerAccurateOffset;
import p420fh.C12902d;
import p420fh.C12910e;
import p480jl.C16215f;
import p536nl.C17053f;
import p606sl.C17837c;
import p606sl.C17838d;
import p606sl.C17839e;
import p606sl.C17843i;
import p606sl.C17853s;
import p620tl.C17988c;
import p659wl.C18611a;
import p659wl.C18612b;
import p659wl.C18613c;
import p659wl.C18614d;
import q31.C38122f;
import q31.C38125h;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.bnpl.presentation.details.BnplDetailsActivity */
public final class BnplDetailsActivity extends C13874j {

    /* renamed from: L */
    public static final C13794a f41053L = new C13794a((DefaultConstructorMarker) null);

    /* renamed from: G */
    public C13851f.C13853b f41054G;

    /* renamed from: H */
    private final C41217g f41055H = new C1617p0(C41520a0.m120436b(C13851f.class), new C13816s(this), new C13818u(this), new C13817t((C43064a) null, this));

    /* renamed from: I */
    private final C41217g f41056I = C41219i.m119470b(new C13806m(this));
    /* access modifiers changed from: private */

    /* renamed from: J */
    public NewProductHeaderView.C13482a f41057J = NewProductHeaderView.C13482a.COLOR;

    /* renamed from: K */
    private final C41217g f41058K = C41219i.m119470b(new C13807n(this));

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.BnplDetailsActivity$a */
    public static final class C13794a {
        private C13794a() {
        }

        public /* synthetic */ C13794a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo38165a(Context context, long j) {
            C41536l.m120489i(context, "context");
            context.startActivity(new Intent(context, BnplDetailsActivity.class).putExtra("PRODUCT_ARG", j));
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.BnplDetailsActivity$b */
    static final class C13795b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BnplDetailsActivity f41059d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13795b(BnplDetailsActivity bnplDetailsActivity) {
            super(1);
            this.f41059d = bnplDetailsActivity;
        }

        /* renamed from: a */
        public final void mo38166a(String str) {
            C41536l.m120489i(str, C11769i.C11770a.f34149l);
            this.f41059d.m51501X2(str, "გრაფიკი-schedule.pdf");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo38166a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.BnplDetailsActivity$c */
    static final class C13796c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BnplDetailsActivity f41060d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13796c(BnplDetailsActivity bnplDetailsActivity) {
            super(1);
            this.f41060d = bnplDetailsActivity;
        }

        /* renamed from: a */
        public final void mo38167a(C31128a aVar) {
            BnplDetailsActivity bnplDetailsActivity = this.f41060d;
            C41536l.m120488h(aVar, "it");
            bnplDetailsActivity.m51508f3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo38167a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.BnplDetailsActivity$d */
    static final class C13797d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BnplDetailsActivity f41061d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13797d(BnplDetailsActivity bnplDetailsActivity) {
            super(1);
            this.f41061d = bnplDetailsActivity;
        }

        /* renamed from: a */
        public final void mo38168a(List list) {
            BnplDetailsActivity bnplDetailsActivity = this.f41061d;
            C41536l.m120488h(list, "list");
            bnplDetailsActivity.m51509g3(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo38168a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.BnplDetailsActivity$e */
    static final class C13798e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BnplDetailsActivity f41062d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13798e(BnplDetailsActivity bnplDetailsActivity) {
            super(1);
            this.f41062d = bnplDetailsActivity;
        }

        /* renamed from: a */
        public final void mo38169a(C17843i iVar) {
            C41536l.m120489i(iVar, "bnplItem");
            this.f41062d.m51513k3(iVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo38169a((C17843i) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.BnplDetailsActivity$f */
    static final class C13799f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BnplDetailsActivity f41063d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13799f(BnplDetailsActivity bnplDetailsActivity) {
            super(1);
            this.f41063d = bnplDetailsActivity;
        }

        /* renamed from: a */
        public final void mo38170a(C41224m mVar) {
            C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
            this.f41063d.m51517n3((C17843i) mVar.mo95675a(), (C17838d) mVar.mo95676b());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo38170a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.BnplDetailsActivity$g */
    static final class C13800g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BnplDetailsActivity f41064d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13800g(BnplDetailsActivity bnplDetailsActivity) {
            super(1);
            this.f41064d = bnplDetailsActivity;
        }

        /* renamed from: a */
        public final void mo38171a(C41224m mVar) {
            C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
            this.f41064d.m51517n3((C17843i) mVar.mo95675a(), (C17838d) mVar.mo95676b());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo38171a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.BnplDetailsActivity$h */
    static final class C13801h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BnplDetailsActivity f41065d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13801h(BnplDetailsActivity bnplDetailsActivity) {
            super(1);
            this.f41065d = bnplDetailsActivity;
        }

        /* renamed from: a */
        public final void mo38172a(C17838d dVar) {
            C41536l.m120489i(dVar, "details");
            this.f41065d.m51516m3(dVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo38172a((C17838d) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.BnplDetailsActivity$i */
    static final class C13802i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BnplDetailsActivity f41066d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13802i(BnplDetailsActivity bnplDetailsActivity) {
            super(1);
            this.f41066d = bnplDetailsActivity;
        }

        /* renamed from: a */
        public final void mo38173a(String str) {
            this.f41066d.m51515l3(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo38173a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.BnplDetailsActivity$j */
    static final class C13803j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BnplDetailsActivity f41067d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13803j(BnplDetailsActivity bnplDetailsActivity) {
            super(1);
            this.f41067d = bnplDetailsActivity;
        }

        /* renamed from: a */
        public final void mo38174a(C31128a aVar) {
            BnplDetailsActivity bnplDetailsActivity = this.f41067d;
            C41536l.m120488h(aVar, "res");
            bnplDetailsActivity.m51505c3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo38174a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.BnplDetailsActivity$k */
    static final class C13804k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BnplDetailsActivity f41068d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13804k(BnplDetailsActivity bnplDetailsActivity) {
            super(1);
            this.f41068d = bnplDetailsActivity;
        }

        /* renamed from: a */
        public final void mo38175a(String str) {
            C41536l.m120489i(str, C11769i.C11770a.f34149l);
            this.f41068d.m51501X2(str, "ხელშეკრულება-terms.pdf");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo38175a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.BnplDetailsActivity$l */
    static final class C13805l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BnplDetailsActivity f41069d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13805l(BnplDetailsActivity bnplDetailsActivity) {
            super(1);
            this.f41069d = bnplDetailsActivity;
        }

        /* renamed from: a */
        public final void mo38176a(String str) {
            C41536l.m120489i(str, C11769i.C11770a.f34149l);
            this.f41069d.m51501X2(str, "ისტორია-history.pdf");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo38176a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.BnplDetailsActivity$m */
    static final class C13806m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ BnplDetailsActivity f41070d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13806m(BnplDetailsActivity bnplDetailsActivity) {
            super(0);
            this.f41070d = bnplDetailsActivity;
        }

        /* renamed from: b */
        public final C17053f invoke() {
            return C17053f.m59915d(this.f41070d.getLayoutInflater());
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.BnplDetailsActivity$n */
    static final class C13807n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ BnplDetailsActivity f41071d;

        /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.BnplDetailsActivity$n$a */
        static final class C13808a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ BnplDetailsActivity f41072d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C13808a(BnplDetailsActivity bnplDetailsActivity) {
                super(1);
                this.f41072d = bnplDetailsActivity;
            }

            /* renamed from: a */
            public final void mo38179a(NewProductHeaderView.C13482a aVar) {
                C41536l.m120489i(aVar, "it");
                this.f41072d.f41057J = aVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo38179a((NewProductHeaderView.C13482a) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.BnplDetailsActivity$n$b */
        static final class C13809b extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ BnplDetailsActivity f41073d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C13809b(BnplDetailsActivity bnplDetailsActivity) {
                super(0);
                this.f41073d = bnplDetailsActivity;
            }

            public final void invoke() {
                this.f41073d.m51504a3().mo38220Dw().mo38237Y7();
            }
        }

        /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.BnplDetailsActivity$n$c */
        static final class C13810c extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ BnplDetailsActivity f41074d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C13810c(BnplDetailsActivity bnplDetailsActivity) {
                super(0);
                this.f41074d = bnplDetailsActivity;
            }

            public final void invoke() {
                this.f41074d.m51504a3().mo38220Dw().mo38242hi();
            }
        }

        /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.BnplDetailsActivity$n$d */
        static final class C13811d extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ BnplDetailsActivity f41075d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C13811d(BnplDetailsActivity bnplDetailsActivity) {
                super(0);
                this.f41075d = bnplDetailsActivity;
            }

            public final void invoke() {
                this.f41075d.m51512j3();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13807n(BnplDetailsActivity bnplDetailsActivity) {
            super(0);
            this.f41071d = bnplDetailsActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m51536c(BnplDetailsActivity bnplDetailsActivity) {
            C41536l.m120489i(bnplDetailsActivity, "this$0");
            bnplDetailsActivity.m51504a3().mo38220Dw().mo38238Zj();
        }

        /* renamed from: b */
        public final C13822c invoke() {
            C13822c cVar = new C13822c(this.f41071d.m51504a3().mo38220Dw(), new C13808a(this.f41071d), new C13820a(this.f41071d));
            BnplDetailsActivity bnplDetailsActivity = this.f41071d;
            cVar.mo38187l(new C13809b(bnplDetailsActivity));
            cVar.mo38189n(new C13810c(bnplDetailsActivity));
            cVar.mo38188m(new C13811d(bnplDetailsActivity));
            return cVar;
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.BnplDetailsActivity$o */
    static final class C13812o extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BnplDetailsActivity f41076d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13812o(BnplDetailsActivity bnplDetailsActivity) {
            super(1);
            this.f41076d = bnplDetailsActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f41076d.mo74709H1(th);
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.BnplDetailsActivity$p */
    static final class C13813p extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BnplDetailsActivity f41077d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13813p(BnplDetailsActivity bnplDetailsActivity) {
            super(1);
            this.f41077d = bnplDetailsActivity;
        }

        /* renamed from: a */
        public final void mo38181a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            BnplDetailsActivity bnplDetailsActivity = this.f41077d;
            String string = bnplDetailsActivity.getString(C16215f.f45765a);
            C41536l.m120488h(string, "getString(R.string.opera…n_fulfilled_successfully)");
            C12910e.m48797o(bnplDetailsActivity, string, (C12902d.C12905b) null, false, 6, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo38181a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.BnplDetailsActivity$q */
    static final class C13814q implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f41078a;

        C13814q(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f41078a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f41078a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f41078a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.BnplDetailsActivity$r */
    public static final class C13815r extends RecyclerView.C1756u {

        /* renamed from: a */
        final /* synthetic */ BnplDetailsActivity f41079a;

        C13815r(BnplDetailsActivity bnplDetailsActivity) {
            this.f41079a = bnplDetailsActivity;
        }

        /* renamed from: e */
        public void mo5740e(RecyclerView recyclerView, int i, int i2) {
            C41536l.m120489i(recyclerView, "recyclerView");
            super.mo5740e(recyclerView, i, i2);
            this.f41079a.m51518o3();
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.BnplDetailsActivity$s */
    public static final class C13816s extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f41080d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13816s(ComponentActivity componentActivity) {
            super(0);
            this.f41080d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f41080d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.BnplDetailsActivity$t */
    public static final class C13817t extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f41081d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f41082e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13817t(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f41081d = aVar;
            this.f41082e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f41081d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f41082e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.BnplDetailsActivity$u */
    static final class C13818u extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ BnplDetailsActivity f41083d;

        /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.BnplDetailsActivity$u$a */
        static final class C13819a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ BnplDetailsActivity f41084d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C13819a(BnplDetailsActivity bnplDetailsActivity) {
                super(0);
                this.f41084d = bnplDetailsActivity;
            }

            /* renamed from: b */
            public final C13851f invoke() {
                return this.f41084d.mo38164b3().mo32543a(this.f41084d.getIntent().getLongExtra("PRODUCT_ARG", -1));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13818u(BnplDetailsActivity bnplDetailsActivity) {
            super(0);
            this.f41083d = bnplDetailsActivity;
        }

        public final C1620q0.C1624b invoke() {
            return C32286a1.f79687a.mo72809a(new C13819a(this.f41083d));
        }
    }

    /* renamed from: U2 */
    private final void m51498U2() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.mo4367F1("REQUEST_KEY_NEW_NAME", this, new C18611a(this));
        supportFragmentManager.mo4367F1("REQUEST_KEY_PDF_TYPE", this, new C18612b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: V2 */
    public static final void m51499V2(BnplDetailsActivity bnplDetailsActivity, String str, Bundle bundle) {
        boolean z;
        C41536l.m120489i(bnplDetailsActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        String string = bundle.getString("RESULT_KEY_NAME");
        boolean z2 = false;
        if (string != null) {
            if (string.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                z2 = true;
            }
        }
        if (z2) {
            bnplDetailsActivity.m51504a3().mo38220Dw().mo38229Mq(string);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: W2 */
    public static final void m51500W2(BnplDetailsActivity bnplDetailsActivity, String str, Bundle bundle) {
        C41536l.m120489i(bnplDetailsActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        boolean z = bundle.getBoolean("REQUEST_KEY_PDF_HISTORY");
        boolean z2 = bundle.getBoolean("REQUEST_KEY_PDF_SCHEDULE");
        if (z) {
            bnplDetailsActivity.m51504a3().mo38220Dw().mo38236X6();
        } else if (z2) {
            bnplDetailsActivity.m51504a3().mo38220Dw().mo38240fp();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: X2 */
    public final void m51501X2(String str, String str2) {
        C32303f.m95195f(str, this, str2, "application/pdf");
    }

    /* renamed from: Y2 */
    private final C17053f m51502Y2() {
        return (C17053f) this.f41056I.getValue();
    }

    /* renamed from: Z2 */
    private final C13822c m51503Z2() {
        return (C13822c) this.f41058K.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: a3 */
    public final C13851f m51504a3() {
        return (C13851f) this.f41055H.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: c3 */
    public final void m51505c3(C31128a aVar) {
        C31132b.m92643e(aVar, (int[]) null, new C13812o(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C13813p(this), 1, (Object) null);
    }

    /* renamed from: d3 */
    private final void m51506d3() {
        getWindow().setStatusBarColor(0);
        C32343x.m95429Z0(this);
        ViewCompat.m3550F0(m51502Y2().mo3946b(), new C18613c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: e3 */
    public static final WindowInsetsCompat m51507e3(BnplDetailsActivity bnplDetailsActivity, View view, WindowInsetsCompat windowInsetsCompat) {
        C41536l.m120489i(bnplDetailsActivity, "this$0");
        C41536l.m120489i(view, "view");
        C41536l.m120489i(windowInsetsCompat, "windowInsets");
        C0829d f = windowInsetsCompat.mo3489f(WindowInsetsCompat.C1048m.m3910e());
        C41536l.m120488h(f, "windowInsets.getInsets(W…Compat.Type.systemBars())");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.leftMargin = f.f3465a;
                layoutParams2.bottomMargin = f.f3468d;
                layoutParams2.rightMargin = f.f3467c;
            }
            view.setLayoutParams(layoutParams);
            AppBarLayout appBarLayout = bnplDetailsActivity.m51502Y2().f47596e;
            C41536l.m120488h(appBarLayout, "binding.appBarLayout");
            appBarLayout.setPadding(appBarLayout.getPaddingLeft(), f.f3466b, appBarLayout.getPaddingRight(), appBarLayout.getPaddingBottom());
            return WindowInsetsCompat.f3676b;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    /* access modifiers changed from: private */
    /* renamed from: f3 */
    public final void m51508f3(C31128a aVar) {
        if (aVar instanceof C31128a.C31130b) {
            FrameLayout frameLayout = m51502Y2().f47597f;
            C41536l.m120488h(frameLayout, "binding.fullProgressBar");
            C32343x.m95447f1(frameLayout);
        } else if (aVar instanceof C31128a.C31131c) {
            FrameLayout frameLayout2 = m51502Y2().f47597f;
            C41536l.m120488h(frameLayout2, "binding.fullProgressBar");
            C32343x.m95455i0(frameLayout2);
        } else if (aVar instanceof C31128a.C31129a) {
            FrameLayout frameLayout3 = m51502Y2().f47597f;
            C41536l.m120488h(frameLayout3, "binding.fullProgressBar");
            C32343x.m95455i0(frameLayout3);
            mo74709H1(((C31128a.C31129a) aVar).mo71342c());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g3 */
    public final void m51509g3(List list) {
        C13838d.C13842d dVar;
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            dVar = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C13838d) obj) instanceof C13838d.C13842d) {
                break;
            }
        }
        if (obj instanceof C13838d.C13842d) {
            dVar = (C13838d.C13842d) obj;
        }
        if (dVar != null) {
            m51503Z2().mo6030j(list, new C18614d(this));
            this.f41057J = ((C30483b) dVar.mo38205a().get(dVar.mo38206b())).mo70822c();
            m51518o3();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h3 */
    public static final void m51510h3(BnplDetailsActivity bnplDetailsActivity) {
        C41536l.m120489i(bnplDetailsActivity, "this$0");
        bnplDetailsActivity.m51502Y2().f47598g.mo5257E0();
    }

    /* renamed from: i3 */
    private final void m51511i3() {
        RecyclerView recyclerView = m51502Y2().f47598g;
        recyclerView.setAdapter(m51503Z2());
        recyclerView.setLayoutManager(new LinearLayoutManagerAccurateOffset(this));
        recyclerView.setItemAnimator((RecyclerView.C1742m) null);
        recyclerView.mo5363n(new C13815r(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: j3 */
    public final void m51512j3() {
        C17988c.f51202I.mo45674a().mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: k3 */
    public final void m51513k3(C17843i iVar) {
        C38122f c = C38125h.m112238c(this);
        long c2 = iVar.mo45476c();
        String e = iVar.mo45478e();
        if (e != null) {
            String d = iVar.mo45477d();
            if (d == null) {
                d = C32343x.m95388F(iVar.mo45480f(), new Object[0]);
            }
            c.mo91635v0(c2, e, d).mo4576A1(getSupportFragmentManager(), (String) null);
        }
    }

    /* renamed from: l1 */
    private final void m51514l1() {
        m51504a3().mo38221Ew().mo38243j().mo4819k(this, new C13814q(new C13797d(this)));
        C37224b.m109963b(m51504a3().mo38221Ew().mo38223Gn(), this, new C13798e(this));
        C37224b.m109963b(m51504a3().mo38221Ew().mo38231Nu(), this, new C13799f(this));
        C37224b.m109963b(m51504a3().mo38221Ew().mo38246nj(), this, new C13800g(this));
        C37224b.m109963b(m51504a3().mo38221Ew().mo38244m5(), this, new C13801h(this));
        C37224b.m109963b(m51504a3().mo38221Ew().mo38234Wj(), this, new C13802i(this));
        m51504a3().mo38221Ew().mo38235X4().mo4819k(this, new C13814q(new C13803j(this)));
        C37224b.m109963b(m51504a3().mo38221Ew().mo38225Kg(), this, new C13804k(this));
        C37224b.m109963b(m51504a3().mo38221Ew().mo38241hd(), this, new C13805l(this));
        C37224b.m109963b(m51504a3().mo38221Ew().mo38247o7(), this, new C13795b(this));
        m51504a3().mo38221Ew().mo38228Lt().mo4819k(this, new C13814q(new C13796c(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: l3 */
    public final void m51515l3(String str) {
        C13870i.f41184M.mo38265a(str).mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: m3 */
    public final void m51516m3(C17838d dVar) {
        long j;
        String str;
        Long c;
        C38122f c2 = C38125h.m112238c(this);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        C17837c a = dVar.mo45445a();
        if (a == null || (c = a.mo45439c()) == null) {
            j = 0;
        } else {
            j = c.longValue();
        }
        C17837c a2 = dVar.mo45445a();
        if (a2 == null || (str = a2.mo45440d()) == null) {
            str = "";
        }
        C38122f.C38123a.m112213i(c2, supportFragmentManager, (String) null, j, false, (Long) null, (Long) null, false, false, false, str, 250, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: n3 */
    public final void m51517n3(C17843i iVar, C17838d dVar) {
        String str;
        String str2;
        Collection collection;
        List d;
        C17837c a;
        C17853s e;
        String b;
        C38122f c = C38125h.m112238c(this);
        String d2 = iVar.mo45477d();
        if (d2 == null) {
            d2 = C32343x.m95388F(iVar.mo45480f(), new Object[0]);
        }
        String str3 = d2;
        long c2 = iVar.mo45476c();
        String b2 = iVar.mo45475b();
        String e2 = iVar.mo45478e();
        if (e2 == null) {
            str = "";
        } else {
            str = e2;
        }
        if (dVar == null || (a = dVar.mo45445a()) == null || (e = a.mo45441e()) == null || (b = e.mo45545b()) == null) {
            str2 = "";
        } else {
            str2 = b;
        }
        if (dVar == null || (d = dVar.mo45448d()) == null) {
            collection = C41341q.m119907j();
        } else {
            collection = new ArrayList(C41343r.m119925u(d, 10));
            Iterator it = d.iterator();
            while (it.hasNext()) {
                C17839e eVar = (C17839e) it.next();
                Iterator it2 = it;
                RepaymentAccount repaymentAccount = r10;
                RepaymentAccount repaymentAccount2 = new RepaymentAccount(eVar.mo45453a(), eVar.mo45455c(), eVar.mo45454b(), eVar.mo45457e(), eVar.mo45456d(), eVar.mo45459f(), eVar.mo45460g());
                collection.add(repaymentAccount);
                it = it2;
            }
        }
        c.mo91556J(this, str3, c2, b2, str, str2, new ArrayList(collection), true);
    }

    /* access modifiers changed from: private */
    /* renamed from: o3 */
    public final void m51518o3() {
        boolean z;
        boolean z2;
        boolean canScrollVertically = m51502Y2().f47598g.canScrollVertically(-1);
        boolean z3 = true;
        if (this.f41057J == NewProductHeaderView.C13482a.BLACK) {
            z = true;
        } else {
            z = false;
        }
        ToolbarView toolbarView = m51502Y2().f47599h;
        if (canScrollVertically || (C32343x.m95476p0(this) ^ z)) {
            z2 = true;
        } else {
            z2 = false;
        }
        toolbarView.mo37106h0(canScrollVertically, z2);
        if (canScrollVertically) {
            z3 = C32343x.m95476p0(this);
        } else if (z) {
            z3 = false;
        }
        C32343x.m95444e1(this, z3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        setContentView((View) m51502Y2().mo3946b());
        super.mo37451O1(bundle);
        m51506d3();
        m51511i3();
        m51498U2();
        m51514l1();
    }

    /* renamed from: b3 */
    public final C13851f.C13853b mo38164b3() {
        C13851f.C13853b bVar = this.f41054G;
        if (bVar != null) {
            return bVar;
        }
        C41536l.m120506z("viewModelAssistedFactory");
        return null;
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return C32343x.m95388F("text.bnpl.name", new Object[0]);
    }
}
