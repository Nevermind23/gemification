package p341ge.bog.mobilebank.cleanarch.mycreditinfo.presentation.viewmodel;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import g91.C32343x;
import hd1.C41204a;
import he1.C41238w;
import j51.C36734f;
import java.util.Iterator;
import k51.C36874b;
import kotlin.jvm.internal.C41519a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p735dr.C20049a;
import p871qu.C27865a;
import p896sz.C28292a;
import p942xq.C29823a;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.mycreditinfo.presentation.viewmodel.MyCreditInfoDescriptionViewModel */
public final class MyCreditInfoDescriptionViewModel extends C21481a {

    /* renamed from: j */
    public static final C21351a f57175j = new C21351a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C29823a f57176d;

    /* renamed from: e */
    private final C28292a f57177e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C20049a f57178f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C36734f f57179g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C1644x f57180h = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C1644x f57181i = new C1644x();

    /* renamed from: ge.bog.mobilebank.cleanarch.mycreditinfo.presentation.viewmodel.MyCreditInfoDescriptionViewModel$a */
    public static final class C21351a {
        private C21351a() {
        }

        public /* synthetic */ C21351a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.mycreditinfo.presentation.viewmodel.MyCreditInfoDescriptionViewModel$b */
    /* synthetic */ class C21352b extends C41519a implements C43064a {
        C21352b(Object obj) {
            super(0, obj, C21484c.class, "setLoading", "setLoading(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Object;)V", 1);
        }

        /* renamed from: b */
        public final void mo53364b() {
            C21484c.m69417i((C1644x) this.f97690d, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo53364b();
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.mycreditinfo.presentation.viewmodel.MyCreditInfoDescriptionViewModel$c */
    static final class C21353c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ MyCreditInfoDescriptionViewModel f57182d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21353c(MyCreditInfoDescriptionViewModel myCreditInfoDescriptionViewModel) {
            super(0);
            this.f57182d = myCreditInfoDescriptionViewModel;
        }

        public final void invoke() {
            String str;
            Object obj;
            C1644x gw = this.f57182d.f57181i;
            Iterator it = this.f57182d.f57179g.mo89561a().iterator();
            while (true) {
                str = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C36874b) obj).mo89807b()) {
                    break;
                }
            }
            C36874b bVar = (C36874b) obj;
            if (bVar != null) {
                str = bVar.mo89806a();
            }
            if (str == null) {
                str = "";
            }
            C21484c.m69418j(gw, str);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.mycreditinfo.presentation.viewmodel.MyCreditInfoDescriptionViewModel$d */
    /* synthetic */ class C21354d extends C41519a implements C43075l {
        C21354d(Object obj) {
            super(1, obj, C21484c.class, "setError", "setError(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Throwable;Ljava/lang/Object;)V", 1);
        }

        /* renamed from: b */
        public final void mo53365b(Throwable th) {
            C21484c.m69415g((C1644x) this.f97690d, th, (Object) null, 2, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53365b((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.mycreditinfo.presentation.viewmodel.MyCreditInfoDescriptionViewModel$e */
    /* synthetic */ class C21355e extends C41519a implements C43064a {
        C21355e(Object obj) {
            super(0, obj, C21484c.class, "setLoading", "setLoading(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Object;)V", 1);
        }

        /* renamed from: b */
        public final void mo53366b() {
            C21484c.m69417i((C1644x) this.f97690d, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo53366b();
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.mycreditinfo.presentation.viewmodel.MyCreditInfoDescriptionViewModel$f */
    static final class C21356f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MyCreditInfoDescriptionViewModel f57183d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21356f(MyCreditInfoDescriptionViewModel myCreditInfoDescriptionViewModel) {
            super(1);
            this.f57183d = myCreditInfoDescriptionViewModel;
        }

        /* renamed from: a */
        public final void mo53367a(C27865a aVar) {
            C41536l.m120489i(aVar, "contract");
            C21484c.m69418j(this.f57183d.f57180h, this.f57183d.f57178f.mo48460a(aVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53367a((C27865a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.mycreditinfo.presentation.viewmodel.MyCreditInfoDescriptionViewModel$g */
    /* synthetic */ class C21357g extends C41519a implements C43075l {
        C21357g(Object obj) {
            super(1, obj, C21484c.class, "setError", "setError(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Throwable;Ljava/lang/Object;)V", 1);
        }

        /* renamed from: b */
        public final void mo53368b(Throwable th) {
            C21484c.m69415g((C1644x) this.f97690d, th, (Object) null, 2, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53368b((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MyCreditInfoDescriptionViewModel(C29823a aVar, C28292a aVar2, C20049a aVar3, C36734f fVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(aVar, "getContract");
        C41536l.m120489i(aVar2, "registerUser");
        C41536l.m120489i(aVar3, "contractUiMapper");
        C41536l.m120489i(fVar, "getClientPhones");
        this.f57176d = aVar;
        this.f57177e = aVar2;
        this.f57178f = aVar3;
        this.f57179g = fVar;
    }

    /* renamed from: Mn */
    public final void mo53360Mn() {
        bindToLifecycle(C32343x.m95484s(this.f57176d.mo70086a("MY_CRI_REGISTRATION"), new C21355e(this.f57180h), new C21356f(this), new C21357g(this.f57180h)));
    }

    /* renamed from: Q1 */
    public final LiveData mo53361Q1() {
        return this.f57180h;
    }

    /* renamed from: hw */
    public final void mo53362hw(long j, String str) {
        C41536l.m120489i(str, "mailAddress");
        bindToLifecycle(C32343x.m95478q(this.f57177e.mo67920a(j, str), new C21352b(this.f57181i), new C21353c(this), new C21354d(this.f57181i)));
    }

    /* renamed from: iw */
    public final LiveData mo53363iw() {
        return this.f57181i;
    }
}
