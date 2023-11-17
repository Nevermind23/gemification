package p341ge.bog.mobilebank.cleanarch.becomesolo.presentation.viewmodel;

import android.content.Intent;
import androidx.annotation.Keep;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import g91.C32343x;
import h10.C24850a;
import hd1.C41204a;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41519a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.becomesolo.presentation.model.BecomeSoloApplicationDataUiModel;
import p341ge.bog.mobilebank.cleanarch.common.presentation.model.ServiceCenterUiModel;
import p341ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.p975ui.wizard.model.WizardObject;
import p735dr.C20049a;
import p797jq.C25480a;
import p807kq.C25748b;
import p807kq.C25751d;
import p817lq.C26056a;
import p847oq.C27056a;
import p847oq.C27057b;
import p847oq.C27058c;
import p857pq.C27603a;
import p867qq.C27852a;
import p871qu.C27865a;
import p877rq.C28062a;
import p942xq.C29823a;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.becomesolo.presentation.viewmodel.BecomeSoloApplicationViewModel */
public final class BecomeSoloApplicationViewModel extends C21481a {

    /* renamed from: p */
    public static final C20843a f56114p = new C20843a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C25748b f56115d;

    /* renamed from: e */
    private final C29823a f56116e;

    /* renamed from: f */
    private final C25751d f56117f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C27603a f56118g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C20049a f56119h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public BecomeSoloApplicationDataUiModel f56120i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C27057b f56121j = new C27057b((String) null, (String) null, (String) null, (LookupUiModel) null, (ServiceCenterUiModel) null, (ServiceCenterUiModel) null, (ServiceCenterUiModel) null, (LookupUiModel) null, (String) null, (Boolean) null, (Long) null, 2047, (DefaultConstructorMarker) null);

    /* renamed from: k */
    private final C1644x f56122k = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C1644x f56123l = new C1644x();

    /* renamed from: m */
    private final C1644x f56124m = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C1644x f56125n = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C1644x f56126o = new C1644x();

    /* renamed from: ge.bog.mobilebank.cleanarch.becomesolo.presentation.viewmodel.BecomeSoloApplicationViewModel$a */
    public static final class C20843a {
        private C20843a() {
        }

        public /* synthetic */ C20843a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.becomesolo.presentation.viewmodel.BecomeSoloApplicationViewModel$b */
    public /* synthetic */ class C20844b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f56127a;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|17) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                oq.a[] r0 = p847oq.C27056a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                oq.a r1 = p847oq.C27056a.CONTACT_NUMBER     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                oq.a r1 = p847oq.C27056a.EMAIL     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                oq.a r1 = p847oq.C27056a.WORK_PLACE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                oq.a r1 = p847oq.C27056a.MONTHLY_INCOME     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                oq.a r1 = p847oq.C27056a.SOLO_LOUNGE     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                oq.a r1 = p847oq.C27056a.PAYMENT_TYPE     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                oq.a r1 = p847oq.C27056a.DEPOSIT_PROMPT     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                f56127a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.becomesolo.presentation.viewmodel.BecomeSoloApplicationViewModel.C20844b.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.becomesolo.presentation.viewmodel.BecomeSoloApplicationViewModel$c */
    /* synthetic */ class C20845c extends C41519a implements C43064a {
        C20845c(Object obj) {
            super(0, obj, C21484c.class, "setLoading", "setLoading(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Object;)V", 1);
        }

        /* renamed from: b */
        public final void mo49628b() {
            C21484c.m69417i((C1644x) this.f97690d, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo49628b();
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.becomesolo.presentation.viewmodel.BecomeSoloApplicationViewModel$d */
    static final class C20846d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BecomeSoloApplicationViewModel f56128d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20846d(BecomeSoloApplicationViewModel becomeSoloApplicationViewModel) {
            super(1);
            this.f56128d = becomeSoloApplicationViewModel;
        }

        /* renamed from: a */
        public final void mo49629a(C27865a aVar) {
            C41536l.m120489i(aVar, "contract");
            C24850a a = this.f56128d.f56119h.mo48460a(aVar);
            this.f56128d.f56121j.mo66299o(a.mo63293a());
            C21484c.m69418j(this.f56128d.f56125n, a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49629a((C27865a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.becomesolo.presentation.viewmodel.BecomeSoloApplicationViewModel$e */
    /* synthetic */ class C20847e extends C41519a implements C43075l {
        C20847e(Object obj) {
            super(1, obj, C21484c.class, "setError", "setError(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Throwable;Ljava/lang/Object;)V", 1);
        }

        /* renamed from: b */
        public final void mo49630b(Throwable th) {
            C21484c.m69415g((C1644x) this.f97690d, th, (Object) null, 2, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49630b((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.becomesolo.presentation.viewmodel.BecomeSoloApplicationViewModel$f */
    static final class C20848f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ BecomeSoloApplicationViewModel f56129d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20848f(BecomeSoloApplicationViewModel becomeSoloApplicationViewModel) {
            super(0);
            this.f56129d = becomeSoloApplicationViewModel;
        }

        public final void invoke() {
            C21484c.m69417i(this.f56129d.f56123l, (Object) null, 1, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.becomesolo.presentation.viewmodel.BecomeSoloApplicationViewModel$g */
    static final class C20849g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BecomeSoloApplicationViewModel f56130d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20849g(BecomeSoloApplicationViewModel becomeSoloApplicationViewModel) {
            super(1);
            this.f56130d = becomeSoloApplicationViewModel;
        }

        /* renamed from: a */
        public final void mo49631a(C26056a aVar) {
            C27603a dw = this.f56130d.f56118g;
            C41536l.m120488h(aVar, "it");
            BecomeSoloApplicationDataUiModel a = dw.mo66973a(aVar);
            this.f56130d.f56120i = a;
            C27057b gw = this.f56130d.f56121j;
            gw.mo66298n(a.mo49594d());
            gw.mo66301q(a.mo49592a());
            C21484c.m69418j(this.f56130d.f56123l, a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49631a((C26056a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.becomesolo.presentation.viewmodel.BecomeSoloApplicationViewModel$h */
    static final class C20850h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BecomeSoloApplicationViewModel f56131d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20850h(BecomeSoloApplicationViewModel becomeSoloApplicationViewModel) {
            super(1);
            this.f56131d = becomeSoloApplicationViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            C21484c.m69415g(this.f56131d.f56123l, th, (Object) null, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.becomesolo.presentation.viewmodel.BecomeSoloApplicationViewModel$i */
    /* synthetic */ class C20851i extends C41519a implements C43064a {
        C20851i(Object obj) {
            super(0, obj, C21484c.class, "setLoading", "setLoading(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Object;)V", 1);
        }

        /* renamed from: b */
        public final void mo49633b() {
            C21484c.m69417i((C1644x) this.f97690d, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo49633b();
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.becomesolo.presentation.viewmodel.BecomeSoloApplicationViewModel$j */
    static final class C20852j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ BecomeSoloApplicationViewModel f56132d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20852j(BecomeSoloApplicationViewModel becomeSoloApplicationViewModel) {
            super(0);
            this.f56132d = becomeSoloApplicationViewModel;
        }

        public final void invoke() {
            this.f56132d.m67461ww();
            C21484c.m69418j(this.f56132d.f56126o, new Object());
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.becomesolo.presentation.viewmodel.BecomeSoloApplicationViewModel$k */
    /* synthetic */ class C20853k extends C41519a implements C43075l {
        C20853k(Object obj) {
            super(1, obj, C21484c.class, "setError", "setError(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Throwable;Ljava/lang/Object;)V", 1);
        }

        /* renamed from: b */
        public final void mo49634b(Throwable th) {
            C21484c.m69415g((C1644x) this.f97690d, th, (Object) null, 2, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49634b((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.becomesolo.presentation.viewmodel.BecomeSoloApplicationViewModel$l */
    static final class C20854l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BecomeSoloApplicationViewModel f56133d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20854l(BecomeSoloApplicationViewModel becomeSoloApplicationViewModel) {
            super(1);
            this.f56133d = becomeSoloApplicationViewModel;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: ge.bog.mobilebank.cleanarch.common.presentation.model.ServiceCenterUiModel} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: ge.bog.mobilebank.cleanarch.common.presentation.model.ServiceCenterUiModel} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: ge.bog.mobilebank.cleanarch.common.presentation.model.ServiceCenterUiModel} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: ge.bog.mobilebank.cleanarch.common.presentation.model.ServiceCenterUiModel} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: ge.bog.mobilebank.cleanarch.common.presentation.model.ServiceCenterUiModel} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo49635a(java.lang.String r9) {
            /*
                r8 = this;
                java.lang.String r0 = "cityId"
                kotlin.jvm.internal.C41536l.m120489i(r9, r0)
                ge.bog.mobilebank.cleanarch.becomesolo.presentation.viewmodel.BecomeSoloApplicationViewModel r0 = r8.f56133d
                oq.b r0 = r0.f56121j
                ge.bog.mobilebank.cleanarch.becomesolo.presentation.viewmodel.BecomeSoloApplicationViewModel r1 = r8.f56133d
                ge.bog.mobilebank.cleanarch.becomesolo.presentation.model.BecomeSoloApplicationDataUiModel r1 = r1.f56120i
                kotlin.jvm.internal.C41536l.m120486f(r1)
                ge.bog.mobilebank.cleanarch.common.presentation.model.ServiceCenterUiModel r1 = r1.mo49596e()
                java.util.List r1 = r1.mo49709f()
                r2 = 0
                if (r1 == 0) goto L_0x0044
                java.util.Iterator r1 = r1.iterator()
            L_0x0023:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L_0x0042
                java.lang.Object r3 = r1.next()
                r4 = r3
                ge.bog.mobilebank.cleanarch.common.presentation.model.ServiceCenterUiModel r4 = (p341ge.bog.mobilebank.cleanarch.common.presentation.model.ServiceCenterUiModel) r4
                long r4 = r4.mo49703a()
                long r6 = java.lang.Long.parseLong(r9)
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 != 0) goto L_0x003e
                r4 = 1
                goto L_0x003f
            L_0x003e:
                r4 = 0
            L_0x003f:
                if (r4 == 0) goto L_0x0023
                r2 = r3
            L_0x0042:
                ge.bog.mobilebank.cleanarch.common.presentation.model.ServiceCenterUiModel r2 = (p341ge.bog.mobilebank.cleanarch.common.presentation.model.ServiceCenterUiModel) r2
            L_0x0044:
                r0.mo66306v(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.becomesolo.presentation.viewmodel.BecomeSoloApplicationViewModel.C20854l.mo49635a(java.lang.String):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49635a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.becomesolo.presentation.viewmodel.BecomeSoloApplicationViewModel$m */
    static final class C20855m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BecomeSoloApplicationViewModel f56134d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20855m(BecomeSoloApplicationViewModel becomeSoloApplicationViewModel) {
            super(1);
            this.f56134d = becomeSoloApplicationViewModel;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: ge.bog.mobilebank.cleanarch.common.presentation.model.ServiceCenterUiModel} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: ge.bog.mobilebank.cleanarch.common.presentation.model.ServiceCenterUiModel} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: ge.bog.mobilebank.cleanarch.common.presentation.model.ServiceCenterUiModel} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: ge.bog.mobilebank.cleanarch.common.presentation.model.ServiceCenterUiModel} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: ge.bog.mobilebank.cleanarch.common.presentation.model.ServiceCenterUiModel} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo49636a(java.lang.String r9) {
            /*
                r8 = this;
                java.lang.String r0 = "regionId"
                kotlin.jvm.internal.C41536l.m120489i(r9, r0)
                ge.bog.mobilebank.cleanarch.becomesolo.presentation.viewmodel.BecomeSoloApplicationViewModel r0 = r8.f56134d
                oq.b r0 = r0.f56121j
                ge.bog.mobilebank.cleanarch.becomesolo.presentation.viewmodel.BecomeSoloApplicationViewModel r1 = r8.f56134d
                oq.b r1 = r1.f56121j
                ge.bog.mobilebank.cleanarch.common.presentation.model.ServiceCenterUiModel r1 = r1.mo66294j()
                r2 = 0
                if (r1 == 0) goto L_0x0043
                java.util.List r1 = r1.mo49709f()
                if (r1 == 0) goto L_0x0043
                java.util.Iterator r1 = r1.iterator()
            L_0x0022:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L_0x0041
                java.lang.Object r3 = r1.next()
                r4 = r3
                ge.bog.mobilebank.cleanarch.common.presentation.model.ServiceCenterUiModel r4 = (p341ge.bog.mobilebank.cleanarch.common.presentation.model.ServiceCenterUiModel) r4
                long r4 = r4.mo49703a()
                long r6 = java.lang.Long.parseLong(r9)
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 != 0) goto L_0x003d
                r4 = 1
                goto L_0x003e
            L_0x003d:
                r4 = 0
            L_0x003e:
                if (r4 == 0) goto L_0x0022
                r2 = r3
            L_0x0041:
                ge.bog.mobilebank.cleanarch.common.presentation.model.ServiceCenterUiModel r2 = (p341ge.bog.mobilebank.cleanarch.common.presentation.model.ServiceCenterUiModel) r2
            L_0x0043:
                r0.mo66307w(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.becomesolo.presentation.viewmodel.BecomeSoloApplicationViewModel.C20855m.mo49636a(java.lang.String):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49636a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.becomesolo.presentation.viewmodel.BecomeSoloApplicationViewModel$n */
    static final class C20856n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BecomeSoloApplicationViewModel f56135d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20856n(BecomeSoloApplicationViewModel becomeSoloApplicationViewModel) {
            super(1);
            this.f56135d = becomeSoloApplicationViewModel;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: ge.bog.mobilebank.cleanarch.common.presentation.model.ServiceCenterUiModel} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: ge.bog.mobilebank.cleanarch.common.presentation.model.ServiceCenterUiModel} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: ge.bog.mobilebank.cleanarch.common.presentation.model.ServiceCenterUiModel} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: ge.bog.mobilebank.cleanarch.common.presentation.model.ServiceCenterUiModel} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: ge.bog.mobilebank.cleanarch.common.presentation.model.ServiceCenterUiModel} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo49637a(java.lang.String r9) {
            /*
                r8 = this;
                java.lang.String r0 = "branchId"
                kotlin.jvm.internal.C41536l.m120489i(r9, r0)
                ge.bog.mobilebank.cleanarch.becomesolo.presentation.viewmodel.BecomeSoloApplicationViewModel r0 = r8.f56135d
                oq.b r0 = r0.f56121j
                ge.bog.mobilebank.cleanarch.becomesolo.presentation.viewmodel.BecomeSoloApplicationViewModel r1 = r8.f56135d
                oq.b r1 = r1.f56121j
                ge.bog.mobilebank.cleanarch.common.presentation.model.ServiceCenterUiModel r1 = r1.mo66295k()
                r2 = 0
                if (r1 == 0) goto L_0x0043
                java.util.List r1 = r1.mo49709f()
                if (r1 == 0) goto L_0x0043
                java.util.Iterator r1 = r1.iterator()
            L_0x0022:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L_0x0041
                java.lang.Object r3 = r1.next()
                r4 = r3
                ge.bog.mobilebank.cleanarch.common.presentation.model.ServiceCenterUiModel r4 = (p341ge.bog.mobilebank.cleanarch.common.presentation.model.ServiceCenterUiModel) r4
                long r4 = r4.mo49703a()
                long r6 = java.lang.Long.parseLong(r9)
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 != 0) goto L_0x003d
                r4 = 1
                goto L_0x003e
            L_0x003d:
                r4 = 0
            L_0x003e:
                if (r4 == 0) goto L_0x0022
                r2 = r3
            L_0x0041:
                ge.bog.mobilebank.cleanarch.common.presentation.model.ServiceCenterUiModel r2 = (p341ge.bog.mobilebank.cleanarch.common.presentation.model.ServiceCenterUiModel) r2
            L_0x0043:
                r0.mo66305u(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.becomesolo.presentation.viewmodel.BecomeSoloApplicationViewModel.C20856n.mo49637a(java.lang.String):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49637a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.becomesolo.presentation.viewmodel.BecomeSoloApplicationViewModel$o */
    static final class C20857o extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BecomeSoloApplicationViewModel f56136d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20857o(BecomeSoloApplicationViewModel becomeSoloApplicationViewModel) {
            super(1);
            this.f56136d = becomeSoloApplicationViewModel;
        }

        /* renamed from: a */
        public final void mo49638a(String str) {
            C41536l.m120489i(str, "contactNumber");
            this.f56136d.f56121j.mo66298n(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49638a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.becomesolo.presentation.viewmodel.BecomeSoloApplicationViewModel$p */
    static final class C20858p extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BecomeSoloApplicationViewModel f56137d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20858p(BecomeSoloApplicationViewModel becomeSoloApplicationViewModel) {
            super(1);
            this.f56137d = becomeSoloApplicationViewModel;
        }

        /* renamed from: a */
        public final void mo49639a(String str) {
            C41536l.m120489i(str, "email");
            this.f56137d.f56121j.mo66301q(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49639a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.becomesolo.presentation.viewmodel.BecomeSoloApplicationViewModel$q */
    static final class C20859q extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BecomeSoloApplicationViewModel f56138d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20859q(BecomeSoloApplicationViewModel becomeSoloApplicationViewModel) {
            super(1);
            this.f56138d = becomeSoloApplicationViewModel;
        }

        /* renamed from: a */
        public final void mo49640a(String str) {
            C41536l.m120489i(str, "workPlace");
            this.f56138d.f56121j.mo66308x(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49640a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.becomesolo.presentation.viewmodel.BecomeSoloApplicationViewModel$r */
    static final class C20860r extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BecomeSoloApplicationViewModel f56139d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20860r(BecomeSoloApplicationViewModel becomeSoloApplicationViewModel) {
            super(1);
            this.f56139d = becomeSoloApplicationViewModel;
        }

        /* renamed from: a */
        public final void mo49641a(String str) {
            C41536l.m120489i(str, "incomeOrderNumber");
            C27057b gw = this.f56139d.f56121j;
            BecomeSoloApplicationDataUiModel fw = this.f56139d.f56120i;
            C41536l.m120486f(fw);
            gw.mo66303s((LookupUiModel) C41358y.m120010Z(fw.mo49593b().mo49603b(), Integer.parseInt(str)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49641a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.becomesolo.presentation.viewmodel.BecomeSoloApplicationViewModel$s */
    static final class C20861s extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BecomeSoloApplicationViewModel f56140d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20861s(BecomeSoloApplicationViewModel becomeSoloApplicationViewModel) {
            super(1);
            this.f56140d = becomeSoloApplicationViewModel;
        }

        /* renamed from: a */
        public final void mo49642a(String str) {
            C41536l.m120489i(str, "paymentTypeOrderNumber");
            C27057b gw = this.f56140d.f56121j;
            BecomeSoloApplicationDataUiModel fw = this.f56140d.f56120i;
            C41536l.m120486f(fw);
            gw.mo66304t((LookupUiModel) C41358y.m120010Z(fw.mo49593b().mo49602a(), Integer.parseInt(str)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49642a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.becomesolo.presentation.viewmodel.BecomeSoloApplicationViewModel$t */
    static final class C20862t extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BecomeSoloApplicationViewModel f56141d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20862t(BecomeSoloApplicationViewModel becomeSoloApplicationViewModel) {
            super(1);
            this.f56141d = becomeSoloApplicationViewModel;
        }

        /* renamed from: a */
        public final void mo49643a(String str) {
            C41536l.m120489i(str, "depositAmount");
            this.f56141d.f56121j.mo66300p(C40438v.m117100l(str));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49643a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.becomesolo.presentation.viewmodel.BecomeSoloApplicationViewModel$u */
    static final class C20863u extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BecomeSoloApplicationViewModel f56142d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20863u(BecomeSoloApplicationViewModel becomeSoloApplicationViewModel) {
            super(1);
            this.f56142d = becomeSoloApplicationViewModel;
        }

        /* renamed from: a */
        public final void mo49644a(String str) {
            Boolean bool;
            boolean z;
            C41536l.m120489i(str, "depositPromptIndex");
            int parseInt = Integer.parseInt(str);
            C27057b gw = this.f56142d.f56121j;
            if (parseInt == -1) {
                bool = null;
            } else {
                if (parseInt == C25480a.f65145a.mo64043a().indexOf("offers.become.solo.appl.details.field.name.deposit.value1")) {
                    z = true;
                } else {
                    z = false;
                }
                bool = Boolean.valueOf(z);
            }
            gw.mo66302r(bool);
            if (!C41536l.m120484d(this.f56142d.f56121j.mo66289e(), Boolean.TRUE)) {
                this.f56142d.f56121j.mo66300p((Long) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49644a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BecomeSoloApplicationViewModel(C25748b bVar, C29823a aVar, C25751d dVar, C27603a aVar2, C20049a aVar3) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C25748b bVar2 = bVar;
        C29823a aVar4 = aVar;
        C25751d dVar2 = dVar;
        C27603a aVar5 = aVar2;
        C20049a aVar6 = aVar3;
        C41536l.m120489i(bVar2, "getBecomeSoloApplicationData");
        C41536l.m120489i(aVar4, "getContract");
        C41536l.m120489i(dVar2, "sendSoloApplication");
        C41536l.m120489i(aVar5, "becomeSoloApplicationDataUiMapper");
        C41536l.m120489i(aVar6, "contractUiMapper");
        this.f56115d = bVar2;
        this.f56116e = aVar4;
        this.f56117f = dVar2;
        this.f56118g = aVar5;
        this.f56119h = aVar6;
    }

    /* renamed from: Dw */
    private final void m67443Dw(Intent intent) {
        C32343x.m95461k0(intent, "SOLO_LOUNGE_CITY", new C20854l(this));
        C32343x.m95461k0(intent, "SOLO_LOUNGE_REGION", new C20855m(this));
        C32343x.m95461k0(intent, "SOLO_LOUNGE_BRANCH", new C20856n(this));
    }

    /* renamed from: Eo */
    private final void m67444Eo(Intent intent) {
        C32343x.m95461k0(intent, "CONTACT_NUMBER", new C20857o(this));
        C32343x.m95461k0(intent, "EMAIL", new C20858p(this));
        C32343x.m95461k0(intent, "WORK_PLACE", new C20859q(this));
        C32343x.m95461k0(intent, "MONTHLY_INCOME", new C20860r(this));
        C32343x.m95461k0(intent, "PAYMENT_TYPE", new C20861s(this));
        C32343x.m95461k0(intent, "DEPOSIT_AMOUNT", new C20862t(this));
        C32343x.m95461k0(intent, "DEPOSIT_PROMPT", new C20863u(this));
        m67443Dw(intent);
        this.f56124m.mo4826r(C32343x.m95466m(this.f56121j.mo66285a()));
    }

    /* renamed from: mw */
    private final int m67454mw() {
        ServiceCenterUiModel i;
        List<ServiceCenterUiModel> f;
        boolean z;
        ServiceCenterUiModel k = this.f56121j.mo66295k();
        if (k == null || (i = this.f56121j.mo66293i()) == null || (f = k.mo49709f()) == null) {
            return -1;
        }
        int i2 = 0;
        for (ServiceCenterUiModel a : f) {
            if (a.mo49703a() == i.mo49703a()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* renamed from: nw */
    private final int m67455nw(BecomeSoloApplicationDataUiModel becomeSoloApplicationDataUiModel) {
        List<ServiceCenterUiModel> f;
        boolean z;
        ServiceCenterUiModel j = this.f56121j.mo66294j();
        if (j == null || (f = becomeSoloApplicationDataUiModel.mo49596e().mo49709f()) == null) {
            return -1;
        }
        int i = 0;
        for (ServiceCenterUiModel a : f) {
            if (a.mo49703a() == j.mo49703a()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: ow */
    private final String m67456ow(Boolean bool) {
        int i;
        String str;
        if (bool == null) {
            i = -1;
        } else {
            List a = C25480a.f65145a.mo64043a();
            if (bool.booleanValue()) {
                str = "offers.become.solo.appl.details.field.name.deposit.value1";
            } else {
                str = "offers.become.solo.appl.details.field.name.deposit.value2";
            }
            i = a.indexOf(str);
        }
        return String.valueOf(i);
    }

    /* renamed from: pw */
    private final int m67457pw() {
        ServiceCenterUiModel k;
        List<ServiceCenterUiModel> f;
        boolean z;
        ServiceCenterUiModel j = this.f56121j.mo66294j();
        if (j == null || (k = this.f56121j.mo66295k()) == null || (f = j.mo49709f()) == null) {
            return -1;
        }
        int i = 0;
        for (ServiceCenterUiModel a : f) {
            if (a.mo49703a() == k.mo49703a()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: sw */
    private final List m67458sw(int i) {
        String l;
        BecomeSoloApplicationDataUiModel becomeSoloApplicationDataUiModel = this.f56120i;
        if (becomeSoloApplicationDataUiModel == null) {
            return C41341q.m119907j();
        }
        WizardObject[] wizardObjectArr = new WizardObject[10];
        C28062a aVar = C28062a.f71410a;
        String b = this.f56121j.mo66286b();
        String str = "";
        if (b == null) {
            b = str;
        }
        wizardObjectArr[0] = aVar.mo67606c(b);
        String d = this.f56121j.mo66288d();
        if (d == null) {
            d = str;
        }
        wizardObjectArr[1] = aVar.mo67609f(d);
        String l2 = this.f56121j.mo66296l();
        if (l2 == null) {
            l2 = str;
        }
        wizardObjectArr[2] = aVar.mo67613k(l2);
        wizardObjectArr[3] = aVar.mo67610g(becomeSoloApplicationDataUiModel, this.f56121j.mo66290f());
        wizardObjectArr[4] = aVar.mo67608e(m67456ow(this.f56121j.mo66289e()));
        Long c = this.f56121j.mo66287c();
        if (!(c == null || (l = c.toString()) == null)) {
            str = l;
        }
        wizardObjectArr[5] = aVar.mo67607d(str);
        wizardObjectArr[6] = aVar.mo67605b(becomeSoloApplicationDataUiModel, m67455nw(becomeSoloApplicationDataUiModel));
        wizardObjectArr[7] = aVar.mo67612j(m67457pw());
        wizardObjectArr[8] = aVar.mo67604a(m67454mw());
        wizardObjectArr[9] = aVar.mo67611i(becomeSoloApplicationDataUiModel, this.f56121j.mo66291g(), i);
        return C41341q.m119910m(wizardObjectArr);
    }

    /* renamed from: tw */
    private final int m67459tw(C27056a aVar) {
        switch (C20844b.f56127a[aVar.ordinal()]) {
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 6;
            case 6:
                return 9;
            case 7:
                return 4;
            default:
                return 0;
        }
    }

    /* renamed from: vw */
    private final void m67460vw(Intent intent) {
        m67444Eo(intent);
        this.f56124m.mo4826r(C32343x.m95466m(this.f56121j));
    }

    /* access modifiers changed from: private */
    /* renamed from: ww */
    public final void m67461ww() {
        C27852a.m86058a("become_solo_appl_approve_application;");
    }

    /* renamed from: Aw */
    public final void mo49613Aw() {
        String a;
        String d;
        C29823a aVar = this.f56116e;
        LookupUiModel g = this.f56121j.mo66291g();
        if (g != null && (a = g.mo52391a()) != null && (d = this.f56121j.mo66288d()) != null) {
            bindToLifecycle(C32343x.m95484s(aVar.mo70087b(C32343x.m95469n(new BecomeSoloContractParams(a, d, (String) null, 4, (DefaultConstructorMarker) null))), new C20845c(this.f56125n), new C20846d(this), new C20847e(this.f56125n)));
        }
    }

    /* renamed from: Bw */
    public final void mo49614Bw() {
        bindToLifecycle(C32343x.m95484s(this.f56115d.mo64334d(), new C20848f(this), new C20849g(this), new C20850h(this)));
    }

    /* renamed from: Cw */
    public final void mo49615Cw() {
        if (this.f56121j.mo66297m()) {
            bindToLifecycle(C32343x.m95478q(this.f56117f.mo64337a(this.f56121j.mo66309y()), new C20851i(this.f56126o), new C20852j(this), new C20853k(this.f56126o)));
        }
    }

    /* renamed from: Q1 */
    public final LiveData mo49616Q1() {
        return this.f56125n;
    }

    /* renamed from: X0 */
    public final LiveData mo49617X0() {
        return this.f56123l;
    }

    /* renamed from: f */
    public final LiveData mo49618f() {
        return this.f56124m;
    }

    /* renamed from: qw */
    public final LiveData mo49619qw() {
        return this.f56126o;
    }

    /* renamed from: rw */
    public final LiveData mo49620rw() {
        return this.f56122k;
    }

    /* renamed from: uw */
    public final void mo49621uw(C27056a aVar, int i) {
        C41536l.m120489i(aVar, "inputType");
        C1644x xVar = this.f56122k;
        int tw = m67459tw(aVar);
        List sw = m67458sw(i);
        BecomeSoloApplicationDataUiModel becomeSoloApplicationDataUiModel = this.f56120i;
        if (becomeSoloApplicationDataUiModel != null) {
            xVar.mo4826r(C32343x.m95466m(new C27058c(tw, sw, aVar, becomeSoloApplicationDataUiModel)));
        }
    }

    /* renamed from: xw */
    public final void mo49622xw() {
        C27852a.m86058a("become_solo_appl_close_precontract_without_sending;");
    }

    /* renamed from: yw */
    public final void mo49623yw() {
        C27852a.m86058a("become_solo_appl_redirect_precontract_page;");
    }

    /* renamed from: zw */
    public final void mo49624zw(int i, int i2, Intent intent) {
        if (i == 10001 && intent != null) {
            m67460vw(intent);
        }
    }

    @Keep
    /* renamed from: ge.bog.mobilebank.cleanarch.becomesolo.presentation.viewmodel.BecomeSoloApplicationViewModel$BecomeSoloContractParams */
    public static final class BecomeSoloContractParams {
        private final String commissionPaymentPeriod;
        private final String contractType;
        private final String email;

        public BecomeSoloContractParams(String str, String str2, String str3) {
            C41536l.m120489i(str, "commissionPaymentPeriod");
            C41536l.m120489i(str2, "email");
            C41536l.m120489i(str3, "contractType");
            this.commissionPaymentPeriod = str;
            this.email = str2;
            this.contractType = str3;
        }

        public final String getCommissionPaymentPeriod() {
            return this.commissionPaymentPeriod;
        }

        public final String getContractType() {
            return this.contractType;
        }

        public final String getEmail() {
            return this.email;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ BecomeSoloContractParams(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? "SOLO_PACKAGE_AND_MAIL_BANK" : str3);
        }
    }
}
