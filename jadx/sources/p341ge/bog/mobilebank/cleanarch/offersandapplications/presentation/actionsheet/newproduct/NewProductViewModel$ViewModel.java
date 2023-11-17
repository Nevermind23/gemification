package p341ge.bog.mobilebank.cleanarch.offersandapplications.presentation.actionsheet.newproduct;

import android.os.Bundle;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import c00.C19433d;
import c00.C19434e;
import c00.C19435f;
import c00.C19436g;
import c00.C19437h;
import c00.C19438i;
import c00.C19439j;
import e00.C20119a;
import e00.C20120b;
import g91.C32343x;
import gd1.C40992a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p380ck.C10464h;
import p930wp.C29557b;
import p941xp.C29822b;
import p951xz.C29879c;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.offersandapplications.presentation.actionsheet.newproduct.NewProductViewModel$ViewModel */
public final class NewProductViewModel$ViewModel extends C21481a implements C19433d, C19434e {

    /* renamed from: d */
    private final C29879c f57184d;

    /* renamed from: e */
    private final C19434e f57185e = this;

    /* renamed from: f */
    private final C19433d f57186f = this;

    /* renamed from: g */
    private final C1644x f57187g = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C1644x f57188h = new C1644x();

    /* renamed from: ge.bog.mobilebank.cleanarch.offersandapplications.presentation.actionsheet.newproduct.NewProductViewModel$ViewModel$a */
    static final class C21358a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ NewProductViewModel$ViewModel f57189d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21358a(NewProductViewModel$ViewModel newProductViewModel$ViewModel) {
            super(1);
            this.f57189d = newProductViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo53378a(List list) {
            C1644x nw = this.f57189d.mo47660t3();
            NewProductViewModel$ViewModel newProductViewModel$ViewModel = this.f57189d;
            C41536l.m120488h(list, "appTypes");
            nw.mo4826r(newProductViewModel$ViewModel.m69048lw(list));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53378a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.offersandapplications.presentation.actionsheet.newproduct.NewProductViewModel$ViewModel$b */
    static final class C21359b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ NewProductViewModel$ViewModel f57190d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21359b(NewProductViewModel$ViewModel newProductViewModel$ViewModel) {
            super(1);
            this.f57190d = newProductViewModel$ViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f57190d.mo47660t3().mo4826r((Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.offersandapplications.presentation.actionsheet.newproduct.NewProductViewModel$ViewModel$c */
    public /* synthetic */ class C21360c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f57191a;

        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|19) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                xp.a[] r0 = p941xp.C29821a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                xp.a r1 = p941xp.C29821a.DEBIT_CARD     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                xp.a r1 = p941xp.C29821a.DEPOSIT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                xp.a r1 = p941xp.C29821a.CREDIT_APPLICATION     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                xp.a r1 = p941xp.C29821a.DEP_LOAN     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                xp.a r1 = p941xp.C29821a.GT     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                xp.a r1 = p941xp.C29821a.CAS_CLIENT_SERVICE     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                xp.a r1 = p941xp.C29821a.INSURANCE     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                xp.a r1 = p941xp.C29821a.BNPL_APPLICATION     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                f57191a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.offersandapplications.presentation.actionsheet.newproduct.NewProductViewModel$ViewModel.C21360c.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.offersandapplications.presentation.actionsheet.newproduct.NewProductViewModel$ViewModel$d */
    static final class C21361d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ NewProductViewModel$ViewModel f57192d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21361d(NewProductViewModel$ViewModel newProductViewModel$ViewModel) {
            super(1);
            this.f57192d = newProductViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo53380a(C41205b bVar) {
            C21484c.m69417i(this.f57192d.f57188h, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53380a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.offersandapplications.presentation.actionsheet.newproduct.NewProductViewModel$ViewModel$e */
    static final class C21362e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ NewProductViewModel$ViewModel f57193d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21362e(NewProductViewModel$ViewModel newProductViewModel$ViewModel) {
            super(1);
            this.f57193d = newProductViewModel$ViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            C1644x kw = this.f57193d.f57188h;
            C41536l.m120488h(bool, "isAllowed");
            C21484c.m69418j(kw, bool);
            C32343x.m95397J0(this.f57193d, "applications_cl", "cla_first_page_from_new_products", "open_cl_app_page_1", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 16, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.offersandapplications.presentation.actionsheet.newproduct.NewProductViewModel$ViewModel$f */
    static final class C21363f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ NewProductViewModel$ViewModel f57194d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21363f(NewProductViewModel$ViewModel newProductViewModel$ViewModel) {
            super(1);
            this.f57194d = newProductViewModel$ViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f57194d.f57188h, th, (Object) null, 2, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewProductViewModel$ViewModel(C29557b bVar, C29879c cVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(bVar, "getApplicationTypesUseCase");
        C41536l.m120489i(cVar, "isCreditLoanAllowedUseCase");
        this.f57184d = cVar;
        C41205b G0 = bVar.mo69402b().mo95027o0(C40992a.m118827a()).mo94983G0(new C19438i(new C21358a(this)), new C19439j(new C21359b(this)));
        C41536l.m120488h(G0, "getApplicationTypesUseCa…= null\n                })");
        bindToLifecycle(G0);
    }

    /* access modifiers changed from: private */
    public static final void _init_$lambda$0(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: iw */
    public static final void m69045iw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: lw */
    public final List m69048lw(List list) {
        C20119a aVar;
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C29822b bVar = (C29822b) it.next();
            String F = C32343x.m95388F(bVar.mo70082b(), new Object[0]);
            switch (C21360c.f57191a[bVar.mo70081a().ordinal()]) {
                case 1:
                    aVar = C20119a.DEBIT_CARD;
                    break;
                case 2:
                    aVar = C20119a.DEPOSIT;
                    break;
                case 3:
                    aVar = C20119a.CREDIT_APPLICATION;
                    break;
                case 4:
                    aVar = C20119a.DEP_LOAN;
                    break;
                case 5:
                    aVar = C20119a.GT;
                    break;
                case 6:
                    aVar = C20119a.CAS_CLIENT_SERVICE;
                    break;
                case 7:
                    aVar = C20119a.INSURANCE;
                    break;
                case 8:
                    aVar = C20119a.BNPL_APPLICATION;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList.add(new C20120b(F, aVar));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: pw */
    public static final void m69049pw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: qw */
    public static final void m69050qw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: rw */
    public static final void m69051rw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: mw */
    public final C19434e mo53375mw() {
        return this.f57185e;
    }

    /* renamed from: nw */
    public C1644x mo47660t3() {
        return this.f57187g;
    }

    /* renamed from: ow */
    public void mo53377ow() {
        C41205b I = this.f57184d.mo70151a().mo95063B(C40992a.m118827a()).mo95083l(new C19435f(new C21361d(this))).mo95070I(new C19436g(new C21362e(this)), new C19437h(new C21363f(this)));
        C41536l.m120488h(I, "override fun handleNewLo…dToLifecycle()\n\n        }");
        bindToLifecycle(I);
    }

    /* renamed from: v */
    public LiveData mo47661v() {
        return this.f57188h;
    }
}
