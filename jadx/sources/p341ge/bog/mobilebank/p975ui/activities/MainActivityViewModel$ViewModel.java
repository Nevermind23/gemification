package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30524a5;
import a81.C30538b5;
import a81.C30552c5;
import a81.C30566d5;
import a81.C30580e5;
import a81.C30594f5;
import a81.C30608g5;
import a81.C30622h5;
import a81.C30636i5;
import a81.C30650j5;
import a81.C30663k5;
import a81.C30676l5;
import a81.C30689m5;
import a81.C30702n5;
import a81.C30715o5;
import a81.C30727p4;
import a81.C30728p5;
import a81.C30740q4;
import a81.C30741q5;
import a81.C30753r4;
import a81.C30754r5;
import a81.C30766s4;
import a81.C30767s5;
import a81.C30779t4;
import a81.C30792u4;
import a81.C30805v4;
import a81.C30818w4;
import a81.C30831x4;
import a81.C30844y4;
import a81.C30857z4;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.C1639v;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import bk0.C19394c;
import c41.C31270e;
import ck0.C19765b;
import com.google.android.gms.common.api.ApiException;
import ed1.C40734b;
import ed1.C40735b0;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import ee1.C40767b;
import g91.C32289b0;
import g91.C32319m;
import g91.C32343x;
import gd1.C40992a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41233s;
import he1.C41238w;
import hh0.C25006a;
import hh0.C25009d;
import hh0.C25020m;
import hh0.C25022n;
import hh0.C25027r;
import ih0.C25210c;
import ih0.C25211d;
import ih0.C25212e;
import j51.C36735g;
import j51.C36742n;
import j70.C25341c;
import j70.C25348h;
import j70.C25349i;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import k31.C36867a;
import k31.C36868b;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ky0.C37019f;
import l11.C37059a;
import l11.C37063e;
import l20.C25800a;
import l31.C37066a;
import m11.C37202b;
import m20.C26123a;
import m41.C37223a;
import m41.C37224b;
import m51.C37228a;
import md0.C26186e;
import ny0.C37500b;
import ny0.C37508i;
import o70.C26763b;
import o70.C26765d;
import o70.C26766e;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.toastnotification.ToastNotificationAppearance;
import p341ge.bog.designsystem.components.toastnotification.ToastNotificationArguments;
import p341ge.bog.designsystem.components.toastnotification.ToastNotificationIcon;
import p341ge.bog.mobilebank.cleanarch.mainactivity.model.ExpiringCardPopUpData;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.liabilityoverdue.liabilityinfo.LiabilityOverdueInfoUiModel;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.ToastNotificationArgumentsWrapper;
import p341ge.bog.mobilebank.model.payment.PaymentServiceConfig;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.rest.model.GooglePayState;
import p341ge.bog.mobilebank.shared2.environment.EnvironmentType;
import p341ge.bog.mobilebank.shared2.environment.TargetEnvironment;
import p366bk.C10320i;
import p380ck.C10464h;
import p70.C27239a;
import p709au.C19277a;
import p714az.C19288a;
import p714az.C19289b;
import p714az.C19290c;
import p738du.C20101a;
import p742dy.C20109b;
import p748eu.C20292b;
import p755fr.C20546a;
import p769gr.C24776a;
import p814kx.C25784a;
import p960yx.C30122a;
import q70.C27685a;
import q70.C27686b;
import r90.C27950a;
import rm0.C28055c;
import ru0.C38345b;
import su0.C38536a;
import ue1.C43075l;
import ue1.C43079p;
import wh0.C29397e;
import xh0.C29789f;

/* renamed from: ge.bog.mobilebank.ui.activities.MainActivityViewModel$ViewModel */
public final class MainActivityViewModel$ViewModel extends C21481a implements C30727p4, C30740q4 {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public final C25027r f84953A;

    /* renamed from: B */
    private final C37019f f84954B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public final C25020m f84955C;

    /* renamed from: D */
    private final C25006a f84956D;

    /* renamed from: E */
    private final TargetEnvironment f84957E;

    /* renamed from: F */
    public final C30727p4 f84958F = this;

    /* renamed from: G */
    public final C30740q4 f84959G = this;

    /* renamed from: H */
    private final C1644x f84960H = new C1644x();

    /* renamed from: I */
    private final C1644x f84961I = new C1644x();

    /* renamed from: J */
    private final C1639v f84962J = new C1639v();

    /* renamed from: K */
    private final C1644x f84963K = new C1644x(Boolean.FALSE);

    /* renamed from: L */
    private final C1644x f84964L = new C1644x();

    /* renamed from: M */
    private final C1644x f84965M = new C1644x();

    /* renamed from: N */
    private final C1644x f84966N = new C1644x();

    /* renamed from: O */
    private final C1644x f84967O = new C1644x();

    /* renamed from: P */
    private final C1644x f84968P = new C1644x();

    /* renamed from: Q */
    private final C1644x f84969Q = new C1644x();

    /* renamed from: R */
    private final C1644x f84970R = new C1644x();

    /* renamed from: S */
    private final C1644x f84971S = new C1644x();

    /* renamed from: T */
    private final C1644x f84972T = new C1644x();

    /* renamed from: U */
    private final C1644x f84973U = new C1644x();

    /* renamed from: V */
    private final C1644x f84974V = new C1644x();

    /* renamed from: W */
    private final C1644x f84975W = new C1644x();

    /* renamed from: X */
    private final C1644x f84976X = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public final C1644x f84977Y = new C1644x(m103934Ax());

    /* renamed from: Z */
    private final C1644x f84978Z = new C1644x();

    /* renamed from: a0 */
    private final C1644x f84979a0 = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public final C1644x f84980b0 = new C1644x();

    /* renamed from: c0 */
    private final C1644x f84981c0 = new C1644x();

    /* renamed from: d */
    private final Context f84982d;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public final C1644x f84983d0 = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C20109b f84984e;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public final C1644x f84985e0 = new C1644x();

    /* renamed from: f */
    private final C28055c f84986f;

    /* renamed from: f0 */
    private final C40767b f84987f0;

    /* renamed from: g */
    private final C25784a f84988g;

    /* renamed from: g0 */
    private final C40767b f84989g0;

    /* renamed from: h */
    private final C29397e f84990h;

    /* renamed from: h0 */
    private final C40767b f84991h0;

    /* renamed from: i */
    private final C25349i f84992i;

    /* renamed from: i0 */
    private final C40767b f84993i0;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final PreferencesApiManager f84994j;
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public final C40767b f84995j0;

    /* renamed from: k */
    private final C20292b f84996k;
    /* access modifiers changed from: private */

    /* renamed from: k0 */
    public final C40767b f84997k0;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C25341c f84998l;

    /* renamed from: l0 */
    private final C40767b f84999l0;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C38345b f85000m;

    /* renamed from: m0 */
    private final C40767b f85001m0;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C25348h f85002n;

    /* renamed from: o */
    private final C36735g f85003o;

    /* renamed from: p */
    private final C30122a f85004p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final C26123a f85005q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final C19394c f85006r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final Client f85007s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final C37059a f85008t;

    /* renamed from: u */
    private final C37063e f85009u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public final C20546a f85010v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public final C36867a f85011w;

    /* renamed from: x */
    private final C36868b f85012x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public final C25022n f85013y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public final C25009d f85014z;

    /* renamed from: ge.bog.mobilebank.ui.activities.MainActivityViewModel$ViewModel$a */
    static final class C35203a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MainActivityViewModel$ViewModel f85015d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35203a(MainActivityViewModel$ViewModel mainActivityViewModel$ViewModel) {
            super(1);
            this.f85015d = mainActivityViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo86196a(C37223a aVar) {
            this.f85015d.mo70967an().mo4826r(C32343x.m95466m(C30753r4.BOG_PRODUCTS));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo86196a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MainActivityViewModel$ViewModel$a0 */
    static final class C35204a0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MainActivityViewModel$ViewModel f85016d;

        /* renamed from: ge.bog.mobilebank.ui.activities.MainActivityViewModel$ViewModel$a0$a */
        static final class C35205a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ MainActivityViewModel$ViewModel f85017d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C35205a(MainActivityViewModel$ViewModel mainActivityViewModel$ViewModel) {
                super(1);
                this.f85017d = mainActivityViewModel$ViewModel;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Boolean) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Boolean bool) {
                C1644x dx = this.f85017d.f84985e0;
                C41536l.m120488h(bool, "it");
                C37224b.m109965d(dx, bool);
            }
        }

        /* renamed from: ge.bog.mobilebank.ui.activities.MainActivityViewModel$ViewModel$a0$b */
        static final class C35206b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ MainActivityViewModel$ViewModel f85018d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C35206b(MainActivityViewModel$ViewModel mainActivityViewModel$ViewModel) {
                super(1);
                this.f85018d = mainActivityViewModel$ViewModel;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C37224b.m109965d(this.f85018d.f84985e0, Boolean.FALSE);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35204a0(MainActivityViewModel$ViewModel mainActivityViewModel$ViewModel) {
            super(1);
            this.f85016d = mainActivityViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final void m104101d(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final void m104102e(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* renamed from: c */
        public final C40754t invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            return this.f85016d.f84955C.mo63421e().mo95084m(new C35437l1(new C35205a(this.f85016d))).mo95082k(new C35443m1(new C35206b(this.f85016d))).mo95075O();
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MainActivityViewModel$ViewModel$b */
    static final class C35207b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MainActivityViewModel$ViewModel f85019d;

        /* renamed from: ge.bog.mobilebank.ui.activities.MainActivityViewModel$ViewModel$b$a */
        static final class C35208a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ MainActivityViewModel$ViewModel f85020d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C35208a(MainActivityViewModel$ViewModel mainActivityViewModel$ViewModel) {
                super(1);
                this.f85020d = mainActivityViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo86201a(List list) {
                C41536l.m120489i(list, PaymentServiceConfig.TYPE_GIFT_CARD);
                ArrayList arrayList = new ArrayList();
                for (Object next : list) {
                    if (!((C29789f) next).mo69973g()) {
                        arrayList.add(next);
                    }
                }
                C37224b.m109965d(this.f85020d.mo70980t9(), arrayList);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo86201a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.ui.activities.MainActivityViewModel$ViewModel$b$b */
        static final class C35209b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ MainActivityViewModel$ViewModel f85021d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C35209b(MainActivityViewModel$ViewModel mainActivityViewModel$ViewModel) {
                super(1);
                this.f85021d = mainActivityViewModel$ViewModel;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                C37224b.m109965d(this.f85021d.mo70980t9(), C41341q.m119907j());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35207b(MainActivityViewModel$ViewModel mainActivityViewModel$ViewModel) {
            super(1);
            this.f85019d = mainActivityViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo86200a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C35208a(this.f85019d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C35209b(this.f85019d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo86200a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MainActivityViewModel$ViewModel$c */
    static final class C35210c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MainActivityViewModel$ViewModel f85022d;

        /* renamed from: ge.bog.mobilebank.ui.activities.MainActivityViewModel$ViewModel$c$a */
        static final class C35211a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ MainActivityViewModel$ViewModel f85023d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C35211a(MainActivityViewModel$ViewModel mainActivityViewModel$ViewModel) {
                super(1);
                this.f85023d = mainActivityViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo86204a(boolean z) {
                C37224b.m109965d(this.f85023d.mo70975jm(), Boolean.valueOf(z));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo86204a(((Boolean) obj).booleanValue());
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.ui.activities.MainActivityViewModel$ViewModel$c$b */
        static final class C35212b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ MainActivityViewModel$ViewModel f85024d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C35212b(MainActivityViewModel$ViewModel mainActivityViewModel$ViewModel) {
                super(1);
                this.f85024d = mainActivityViewModel$ViewModel;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                C37224b.m109965d(this.f85024d.mo70975jm(), Boolean.FALSE);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35210c(MainActivityViewModel$ViewModel mainActivityViewModel$ViewModel) {
            super(1);
            this.f85022d = mainActivityViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo86203a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C35211a(this.f85022d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C35212b(this.f85022d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo86203a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MainActivityViewModel$ViewModel$d */
    static final class C35213d extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C35213d f85025d = new C35213d();

        C35213d() {
            super(1);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "productModels");
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C27686b) it.next()).mo67222a());
            }
            return arrayList;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MainActivityViewModel$ViewModel$e */
    static final class C35214e extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C35214e f85026d = new C35214e();

        C35214e() {
            super(1);
        }

        /* renamed from: a */
        public final List invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            return C41341q.m119907j();
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MainActivityViewModel$ViewModel$f */
    static final class C35215f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MainActivityViewModel$ViewModel f85027d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35215f(MainActivityViewModel$ViewModel mainActivityViewModel$ViewModel) {
            super(1);
            this.f85027d = mainActivityViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo86208a(List list) {
            if (list.contains(C27685a.GIFT_CARD_OWNER) && this.f85027d.mo70980t9().mo4814f() == null) {
                this.f85027d.m104002jx();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo86208a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MainActivityViewModel$ViewModel$g */
    static final class C35216g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MainActivityViewModel$ViewModel f85028d;

        /* renamed from: ge.bog.mobilebank.ui.activities.MainActivityViewModel$ViewModel$g$a */
        static final class C35217a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ MainActivityViewModel$ViewModel f85029d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C35217a(MainActivityViewModel$ViewModel mainActivityViewModel$ViewModel) {
                super(1);
                this.f85029d = mainActivityViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo86210a(C37508i iVar) {
                C41536l.m120489i(iVar, "it");
                long Uw = this.f85029d.m103955Jx();
                C1644x ax = this.f85029d.f84980b0;
                List d = iVar.mo90723d();
                MainActivityViewModel$ViewModel mainActivityViewModel$ViewModel = this.f85029d;
                boolean z = false;
                if (!(d instanceof Collection) || !d.isEmpty()) {
                    Iterator it = d.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (mainActivityViewModel$ViewModel.m103971Wx((C37500b) it.next(), Uw)) {
                                z = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                ax.mo4823o(Boolean.valueOf(z));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo86210a((C37508i) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35216g(MainActivityViewModel$ViewModel mainActivityViewModel$ViewModel) {
            super(1);
            this.f85028d = mainActivityViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo86209a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C35217a(this.f85028d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo86209a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MainActivityViewModel$ViewModel$h */
    /* synthetic */ class C35218h extends C41535k implements C43075l {
        C35218h(Object obj) {
            super(1, obj, C30122a.class, "transform", "transform(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C30122a) this.receiver).mo70409b(list);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MainActivityViewModel$ViewModel$i */
    static final class C35219i extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C35219i f85030d = new C35219i();

        C35219i() {
            super(1);
        }

        /* renamed from: a */
        public final List invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            return C41341q.m119907j();
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MainActivityViewModel$ViewModel$j */
    static final class C35220j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MainActivityViewModel$ViewModel f85031d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35220j(MainActivityViewModel$ViewModel mainActivityViewModel$ViewModel) {
            super(1);
            this.f85031d = mainActivityViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo86213a(List list) {
            C1644x Ix = this.f85031d.mo70960Bp();
            C41536l.m120488h(list, "it");
            C37224b.m109965d(Ix, list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo86213a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MainActivityViewModel$ViewModel$k */
    static final class C35221k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MainActivityViewModel$ViewModel f85032d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35221k(MainActivityViewModel$ViewModel mainActivityViewModel$ViewModel) {
            super(1);
            this.f85032d = mainActivityViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m104115c(MainActivityViewModel$ViewModel mainActivityViewModel$ViewModel, C37202b bVar) {
            String str;
            boolean z;
            String b;
            C41536l.m120489i(mainActivityViewModel$ViewModel, "this$0");
            boolean isAuthorized = mainActivityViewModel$ViewModel.f85007s.isAuthorized();
            C1644x bx = mainActivityViewModel$ViewModel.f84977Y;
            if (bVar == null || (b = bVar.mo90261b()) == null) {
                str = null;
            } else {
                str = C32289b0.m95091c(b);
            }
            if (bVar != null) {
                z = bVar.mo90262c();
            } else {
                z = false;
            }
            bx.mo4823o(new C19289b(str, z, isAuthorized));
        }

        /* renamed from: b */
        public final C40754t invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            return C40734b.m117918i().mo94900m(50, TimeUnit.MILLISECONDS).mo94902o(new C35345a1(this.f85032d, this.f85032d.f85008t.invoke())).mo94891K();
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MainActivityViewModel$ViewModel$l */
    static final class C35222l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MainActivityViewModel$ViewModel f85033d;

        /* renamed from: ge.bog.mobilebank.ui.activities.MainActivityViewModel$ViewModel$l$a */
        /* synthetic */ class C35223a extends C41535k implements C43075l {
            C35223a(Object obj) {
                super(1, obj, C20546a.class, "convert", "convert(Lge/bog/mobilebank/shared/domain/commonpopup/model/CommonPopup;)Lge/bog/mobilebank/cleanarch/commonpopup/presentation/model/CommonPopupUiModel;", 0);
            }

            /* renamed from: b */
            public final C24776a invoke(C37066a aVar) {
                C41536l.m120489i(aVar, "p0");
                return ((C20546a) this.receiver).mo49077a(aVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35222l(MainActivityViewModel$ViewModel mainActivityViewModel$ViewModel) {
            super(1);
            this.f85033d = mainActivityViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C24776a m104118c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C24776a) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C40762x A = this.f85033d.f85011w.invoke().mo95062A(new C35350b1(new C35223a(this.f85033d.f85010v)));
            C41536l.m120488h(A, "getCommonPopup()\n       …mmonPopupMapper::convert)");
            return C31270e.m92880i(A, -1);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MainActivityViewModel$ViewModel$m */
    static final class C35224m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MainActivityViewModel$ViewModel f85034d;

        /* renamed from: ge.bog.mobilebank.ui.activities.MainActivityViewModel$ViewModel$m$a */
        static final class C35225a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ MainActivityViewModel$ViewModel f85035d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C35225a(MainActivityViewModel$ViewModel mainActivityViewModel$ViewModel) {
                super(1);
                this.f85035d = mainActivityViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo86218a(C24776a aVar) {
                this.f85035d.mo70979sa().mo4826r(C32343x.m95466m(C41233s.m119492a(Boolean.TRUE, aVar)));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo86218a((C24776a) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.ui.activities.MainActivityViewModel$ViewModel$m$b */
        static final class C35226b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ MainActivityViewModel$ViewModel f85036d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C35226b(MainActivityViewModel$ViewModel mainActivityViewModel$ViewModel) {
                super(1);
                this.f85036d = mainActivityViewModel$ViewModel;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                this.f85036d.mo70979sa().mo4826r(C32343x.m95466m(C41233s.m119492a(Boolean.FALSE, (Object) null)));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35224m(MainActivityViewModel$ViewModel mainActivityViewModel$ViewModel) {
            super(1);
            this.f85034d = mainActivityViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo86217a(C31128a aVar) {
            C41536l.m120488h(aVar, "requestedResult");
            C31132b.m92648j(aVar, (int[]) null, new C35225a(this.f85034d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C35226b(this.f85034d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo86217a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MainActivityViewModel$ViewModel$n */
    static final class C35227n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MainActivityViewModel$ViewModel f85037d;

        /* renamed from: ge.bog.mobilebank.ui.activities.MainActivityViewModel$ViewModel$n$a */
        /* synthetic */ class C35228a extends C41535k implements C43075l {
            C35228a(Object obj) {
                super(1, obj, MainActivityViewModel$ViewModel.class, "extractPopupData", "extractPopupData(Lge/bog/mobilebank/cleanarch/shareddomain/model/cards/CardsAndDetailsModel;)Ljava/util/List;", 0);
            }

            /* renamed from: b */
            public final List invoke(C26766e eVar) {
                C41536l.m120489i(eVar, "p0");
                return ((MainActivityViewModel$ViewModel) this.receiver).m104048zx(eVar);
            }
        }

        /* renamed from: ge.bog.mobilebank.ui.activities.MainActivityViewModel$ViewModel$n$b */
        static final class C35229b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ MainActivityViewModel$ViewModel f85038d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C35229b(MainActivityViewModel$ViewModel mainActivityViewModel$ViewModel) {
                super(1);
                this.f85038d = mainActivityViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo86222a(List list) {
                C41536l.m120488h(list, "it");
                ExpiringCardPopUpData expiringCardPopUpData = (ExpiringCardPopUpData) C41358y.m120009Y(list);
                if (expiringCardPopUpData == null) {
                    expiringCardPopUpData = new ExpiringCardPopUpData(-1, "", -1, (String) null, false, 8, (DefaultConstructorMarker) null);
                }
                C37224b.m109965d(this.f85038d.mo70978rr(), expiringCardPopUpData);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo86222a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35227n(MainActivityViewModel$ViewModel mainActivityViewModel$ViewModel) {
            super(1);
            this.f85037d = mainActivityViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final List m104126e(Throwable th) {
            C41536l.m120489i(th, "it");
            return C41341q.m119907j();
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public static final void m104127f(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        public static final List invoke$lambda$0(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* renamed from: d */
        public final C40754t invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            return C26186e.m81990h(C25341c.C25342a.m80514a(this.f85037d.f84998l, false, 1, (Object) null)).mo95062A(new C35372c1(new C35228a(this.f85037d))).mo95065D(new C35377d1()).mo95084m(new C35382e1(new C35229b(this.f85037d))).mo95075O();
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MainActivityViewModel$ViewModel$o */
    static final class C35230o extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MainActivityViewModel$ViewModel f85039d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35230o(MainActivityViewModel$ViewModel mainActivityViewModel$ViewModel) {
            super(1);
            this.f85039d = mainActivityViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40735b0 invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            return this.f85039d.f85014z.mo63413b();
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MainActivityViewModel$ViewModel$p */
    static final class C35231p extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MainActivityViewModel$ViewModel f85040d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35231p(MainActivityViewModel$ViewModel mainActivityViewModel$ViewModel) {
            super(1);
            this.f85040d = mainActivityViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo86224a(C25210c cVar) {
            C25211d dVar;
            C1644x cx = this.f85040d.f84983d0;
            C41536l.m120488h(cVar, "data");
            if (this.f85040d.f85007s.isAuthorized()) {
                dVar = C25211d.NONE;
            } else {
                dVar = cVar.mo63722c();
            }
            C37224b.m109965d(cx, C25210c.m80265b(cVar, dVar, (String) null, 2, (Object) null));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo86224a((C25210c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MainActivityViewModel$ViewModel$q */
    static final class C35232q extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MainActivityViewModel$ViewModel f85041d;

        /* renamed from: ge.bog.mobilebank.ui.activities.MainActivityViewModel$ViewModel$q$a */
        static final class C35233a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ MainActivityViewModel$ViewModel f85042d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C35233a(MainActivityViewModel$ViewModel mainActivityViewModel$ViewModel) {
                super(1);
                this.f85042d = mainActivityViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo86226a(C25212e eVar) {
                MainActivityViewModel$ViewModel mainActivityViewModel$ViewModel = this.f85042d;
                C41205b E = C32343x.m95411Q0(mainActivityViewModel$ViewModel.f84953A.mo63426b()).mo94886E();
                C41536l.m120488h(E, "updateStoredGamification…             .subscribe()");
                mainActivityViewModel$ViewModel.bindToLifecycle(E);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo86226a((C25212e) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35232q(MainActivityViewModel$ViewModel mainActivityViewModel$ViewModel) {
            super(1);
            this.f85041d = mainActivityViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final void m104135d(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final C25212e m104136e(Throwable th) {
            C41536l.m120489i(th, "it");
            return new C25212e(false, false, false, 4, (DefaultConstructorMarker) null);
        }

        /* renamed from: c */
        public final C40754t invoke(Boolean bool) {
            C41536l.m120489i(bool, "authorized");
            if (!bool.booleanValue()) {
                return C40749p.m118043h0(new C25212e(false, false, false, 4, (DefaultConstructorMarker) null));
            }
            return this.f85041d.f85013y.invoke().mo95084m(new C35387f1(new C35233a(this.f85041d))).mo95065D(new C35411g1()).mo95075O();
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MainActivityViewModel$ViewModel$r */
    /* synthetic */ class C35234r extends C41535k implements C43075l {
        C35234r(Object obj) {
            super(1, obj, C1644x.class, "postValue", "postValue(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: b */
        public final void mo86227b(C25212e eVar) {
            ((C1644x) this.receiver).mo4823o(eVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo86227b((C25212e) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MainActivityViewModel$ViewModel$s */
    static final class C35235s extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MainActivityViewModel$ViewModel f85043d;

        /* renamed from: ge.bog.mobilebank.ui.activities.MainActivityViewModel$ViewModel$s$a */
        /* synthetic */ class C35236a extends C41535k implements C43075l {
            C35236a(Object obj) {
                super(1, obj, C26123a.class, "transform", "transform(Lge/bog/mobilebank/cleanarch/shareddomain/model/liabilityoverdue/LiabilityOverdueInfo;)Lge/bog/mobilebank/cleanarch/presentation/liabilityoverdue/liabilityinfo/LiabilityOverdueInfoUiModel;", 0);
            }

            /* renamed from: b */
            public final LiabilityOverdueInfoUiModel invoke(C27239a aVar) {
                C41536l.m120489i(aVar, "p0");
                return ((C26123a) this.receiver).mo65036a(aVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35235s(MainActivityViewModel$ViewModel mainActivityViewModel$ViewModel) {
            super(1);
            this.f85043d = mainActivityViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final LiabilityOverdueInfoUiModel m104141c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (LiabilityOverdueInfoUiModel) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C40762x A = this.f85043d.f85002n.invoke().mo95062A(new C35416h1(new C35236a(this.f85043d.f85005q)));
            C41536l.m120488h(A, "getLiabilityOverdueInfo(…OverdueMapper::transform)");
            return C31270e.m92880i(A, -1);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MainActivityViewModel$ViewModel$t */
    static final class C35237t extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MainActivityViewModel$ViewModel f85044d;

        /* renamed from: ge.bog.mobilebank.ui.activities.MainActivityViewModel$ViewModel$t$a */
        static final class C35238a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ MainActivityViewModel$ViewModel f85045d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C35238a(MainActivityViewModel$ViewModel mainActivityViewModel$ViewModel) {
                super(1);
                this.f85045d = mainActivityViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo86231a(LiabilityOverdueInfoUiModel liabilityOverdueInfoUiModel) {
                MainActivityViewModel$ViewModel mainActivityViewModel$ViewModel = this.f85045d;
                if (!(!liabilityOverdueInfoUiModel.mo54310b().isEmpty())) {
                    liabilityOverdueInfoUiModel = null;
                }
                mainActivityViewModel$ViewModel.m104049zy(liabilityOverdueInfoUiModel);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo86231a((LiabilityOverdueInfoUiModel) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.ui.activities.MainActivityViewModel$ViewModel$t$b */
        static final class C35239b extends C41537m implements C43079p {

            /* renamed from: d */
            final /* synthetic */ MainActivityViewModel$ViewModel f85046d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C35239b(MainActivityViewModel$ViewModel mainActivityViewModel$ViewModel) {
                super(2);
                this.f85046d = mainActivityViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo86232a(Throwable th, LiabilityOverdueInfoUiModel liabilityOverdueInfoUiModel) {
                C41536l.m120489i(th, "<anonymous parameter 0>");
                this.f85046d.m104049zy((LiabilityOverdueInfoUiModel) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                mo86232a((Throwable) obj, (LiabilityOverdueInfoUiModel) obj2);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35237t(MainActivityViewModel$ViewModel mainActivityViewModel$ViewModel) {
            super(1);
            this.f85044d = mainActivityViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo86230a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C35238a(this.f85044d), 1, (Object) null);
            C31132b.m92644f(aVar, (int[]) null, new C35239b(this.f85044d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo86230a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MainActivityViewModel$ViewModel$u */
    static final class C35240u extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MainActivityViewModel$ViewModel f85047d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35240u(MainActivityViewModel$ViewModel mainActivityViewModel$ViewModel) {
            super(1);
            this.f85047d = mainActivityViewModel$ViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            C41536l.m120488h(bool, "authorized");
            if (bool.booleanValue()) {
                this.f85047d.m104037vx();
                this.f85047d.mo86194px();
                C32343x.m95472o(this.f85047d.f84995j0);
            }
            this.f85047d.f84997k0.onNext(bool);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MainActivityViewModel$ViewModel$v */
    static final class C35241v extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MainActivityViewModel$ViewModel f85048d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35241v(MainActivityViewModel$ViewModel mainActivityViewModel$ViewModel) {
            super(1);
            this.f85048d = mainActivityViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40735b0 invoke(Boolean bool) {
            C41536l.m120489i(bool, "authorize");
            if (bool.booleanValue()) {
                return this.f85048d.f84984e.mo48540a();
            }
            C40762x z = C40762x.m118162z(Boolean.FALSE);
            C41536l.m120488h(z, "just(false)");
            return z;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MainActivityViewModel$ViewModel$w */
    static final class C35242w extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MainActivityViewModel$ViewModel f85049d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35242w(MainActivityViewModel$ViewModel mainActivityViewModel$ViewModel) {
            super(1);
            this.f85049d = mainActivityViewModel$ViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            this.f85049d.getHasKycLiveData().mo4823o(bool);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MainActivityViewModel$ViewModel$x */
    static final class C35243x extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MainActivityViewModel$ViewModel f85050d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35243x(MainActivityViewModel$ViewModel mainActivityViewModel$ViewModel) {
            super(1);
            this.f85050d = mainActivityViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            return C31270e.m92879h(C26186e.m81987e(C38345b.C38346a.m112650a(this.f85050d.f85000m, false, false, 3, (Object) null)), -1);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MainActivityViewModel$ViewModel$y */
    static final class C35244y extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MainActivityViewModel$ViewModel f85051d;

        /* renamed from: ge.bog.mobilebank.ui.activities.MainActivityViewModel$ViewModel$y$a */
        static final class C35245a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ MainActivityViewModel$ViewModel f85052d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C35245a(MainActivityViewModel$ViewModel mainActivityViewModel$ViewModel) {
                super(1);
                this.f85052d = mainActivityViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo86238a(List list) {
                C41536l.m120489i(list, "offers");
                C1644x Nx = this.f85052d.mo70964S3();
                boolean z = false;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (C41536l.m120484d(((C38536a) it.next()).mo92150y().mo92152a(), "COND_CNS")) {
                                z = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                C37224b.m109965d(Nx, Boolean.valueOf(z));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo86238a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.ui.activities.MainActivityViewModel$ViewModel$y$b */
        static final class C35246b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ MainActivityViewModel$ViewModel f85053d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C35246b(MainActivityViewModel$ViewModel mainActivityViewModel$ViewModel) {
                super(1);
                this.f85053d = mainActivityViewModel$ViewModel;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                C37224b.m109965d(this.f85053d.mo70964S3(), Boolean.FALSE);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35244y(MainActivityViewModel$ViewModel mainActivityViewModel$ViewModel) {
            super(1);
            this.f85051d = mainActivityViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo86237a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C35245a(this.f85051d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C35246b(this.f85051d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo86237a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MainActivityViewModel$ViewModel$z */
    static final class C35247z extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MainActivityViewModel$ViewModel f85054d;

        /* renamed from: ge.bog.mobilebank.ui.activities.MainActivityViewModel$ViewModel$z$a */
        static final class C35248a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ MainActivityViewModel$ViewModel f85055d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C35248a(MainActivityViewModel$ViewModel mainActivityViewModel$ViewModel) {
                super(1);
                this.f85055d = mainActivityViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo86241a(C41205b bVar) {
                this.f85055d.f84994j.setGooglePayState(GooglePayState.NOT_AVAILABLE);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo86241a((C41205b) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.ui.activities.MainActivityViewModel$ViewModel$z$b */
        static final class C35249b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ MainActivityViewModel$ViewModel f85056d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C35249b(MainActivityViewModel$ViewModel mainActivityViewModel$ViewModel) {
                super(1);
                this.f85056d = mainActivityViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo86242a(C19765b bVar) {
                PreferencesApiManager Vw = this.f85056d.f84994j;
                GooglePayState googlePayState = GooglePayState.ACTIVE;
                Vw.setGooglePayState(googlePayState);
                this.f85056d.m104014nx();
                C37224b.m109965d(this.f85056d.mo70961Do(), googlePayState);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo86242a((C19765b) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.ui.activities.MainActivityViewModel$ViewModel$z$c */
        static final class C35250c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ MainActivityViewModel$ViewModel f85057d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C35250c(MainActivityViewModel$ViewModel mainActivityViewModel$ViewModel) {
                super(1);
                this.f85057d = mainActivityViewModel$ViewModel;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                Integer num = null;
                ApiException apiException = th instanceof ApiException ? (ApiException) th : null;
                if (apiException != null) {
                    num = Integer.valueOf(apiException.mo11887b());
                }
                if (num != null && num.intValue() == 15002) {
                    PreferencesApiManager Vw = this.f85057d.f84994j;
                    GooglePayState googlePayState = GooglePayState.WALLET_NEEDS_CREATION;
                    Vw.setGooglePayState(googlePayState);
                    C37224b.m109965d(this.f85057d.mo70961Do(), googlePayState);
                } else {
                    PreferencesApiManager Vw2 = this.f85057d.f84994j;
                    GooglePayState googlePayState2 = GooglePayState.NOT_AVAILABLE;
                    Vw2.setGooglePayState(googlePayState2);
                    C37224b.m109965d(this.f85057d.mo70961Do(), googlePayState2);
                }
                this.f85057d.m103941Dy(num);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35247z(MainActivityViewModel$ViewModel mainActivityViewModel$ViewModel) {
            super(1);
            this.f85054d = mainActivityViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final void m104154e(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public static final void m104155f(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public static final void m104156g(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* renamed from: d */
        public final C40754t invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C40762x k = C32343x.m95465l1(this.f85054d.f85006r.invoke()).mo95083l(new C35421i1(new C35248a(this.f85054d))).mo95084m(new C35426j1(new C35249b(this.f85054d))).mo95082k(new C35431k1(new C35250c(this.f85054d)));
            C41536l.m120488h(k, "private fun observeWalle…ndToLifecycle()\n        }");
            return C31270e.m92880i(k, -1);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MainActivityViewModel$ViewModel(Context context, C36742n nVar, C20109b bVar, C28055c cVar, C25784a aVar, C29397e eVar, C25349i iVar, PreferencesApiManager preferencesApiManager, C20292b bVar2, C25341c cVar2, C38345b bVar3, C25348h hVar, C36735g gVar, C30122a aVar2, C26123a aVar3, C19394c cVar3, Client client, C37059a aVar4, C37063e eVar2, C20546a aVar5, C36867a aVar6, C36868b bVar4, C25022n nVar2, C25009d dVar, C25027r rVar, C37019f fVar, C25020m mVar, C25006a aVar7, TargetEnvironment targetEnvironment) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        Context context2 = context;
        C20109b bVar5 = bVar;
        C28055c cVar4 = cVar;
        C25784a aVar8 = aVar;
        C29397e eVar3 = eVar;
        C25349i iVar2 = iVar;
        PreferencesApiManager preferencesApiManager2 = preferencesApiManager;
        C20292b bVar6 = bVar2;
        C25341c cVar5 = cVar2;
        C38345b bVar7 = bVar3;
        C25348h hVar2 = hVar;
        C36735g gVar2 = gVar;
        C30122a aVar9 = aVar2;
        C19394c cVar6 = cVar3;
        C41536l.m120489i(context2, "context");
        C41536l.m120489i(nVar, "loginObservableUseCase");
        C41536l.m120489i(bVar5, "getKycStatusUseCase");
        C41536l.m120489i(cVar4, "getJuniorRequestData");
        C41536l.m120489i(aVar8, "checkIfHasAvailableCardsForGooglePay");
        C41536l.m120489i(eVar3, "getClientGiftCards");
        C41536l.m120489i(iVar2, "getProductTypes");
        C41536l.m120489i(preferencesApiManager2, "preferencesApiManager");
        C41536l.m120489i(bVar6, "getAppSettingByName");
        C41536l.m120489i(cVar5, "getCardsAndDetails");
        C41536l.m120489i(bVar7, "getNboOffers");
        C41536l.m120489i(hVar2, "getLiabilityOverdueInfo");
        C41536l.m120489i(gVar2, "getLoginInfo");
        C41536l.m120489i(aVar9, "juniorMapper");
        C41536l.m120489i(aVar3, "liabilityOverdueMapper");
        C41536l.m120489i(cVar3, "getWalletId");
        C41536l.m120489i(client, "client");
        C41536l.m120489i(aVar4, "getPreLoginBackground");
        C41536l.m120489i(eVar2, "updateGeneralPreLoginBackgroundUrl");
        C41536l.m120489i(aVar5, "commonPopupMapper");
        C41536l.m120489i(aVar6, "getCommonPopup");
        C41536l.m120489i(bVar4, "setLastShownCommonPopupUseCase");
        C41536l.m120489i(nVar2, "shouldShowGamificationShortcuts");
        C41536l.m120489i(dVar, "getGamificationPreLoginData");
        C41536l.m120489i(rVar, "updateStoredGamificationToken");
        C41536l.m120489i(fVar, "depositsAndBondsUseCase");
        C41536l.m120489i(mVar, "shouldShowGamificationPopup");
        C41536l.m120489i(aVar7, "dismissGamificationPopup");
        C41536l.m120489i(targetEnvironment, "environment");
        this.f84982d = context2;
        this.f84984e = bVar5;
        this.f84986f = cVar4;
        this.f84988g = aVar8;
        this.f84990h = eVar3;
        this.f84992i = iVar2;
        this.f84994j = preferencesApiManager2;
        this.f84996k = bVar6;
        this.f84998l = cVar5;
        this.f85000m = bVar7;
        this.f85002n = hVar2;
        this.f85003o = gVar2;
        this.f85004p = aVar9;
        this.f85005q = aVar3;
        this.f85006r = cVar3;
        this.f85007s = client;
        this.f85008t = aVar4;
        this.f85009u = eVar2;
        this.f85010v = aVar5;
        this.f85011w = aVar6;
        this.f85012x = bVar4;
        this.f85013y = nVar2;
        this.f85014z = dVar;
        this.f84953A = rVar;
        this.f84954B = fVar;
        this.f84955C = mVar;
        this.f84956D = aVar7;
        this.f84957E = targetEnvironment;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Unit>()");
        this.f84987f0 = h1;
        C40767b h12 = C40767b.m118210h1();
        C41536l.m120488h(h12, "create<Unit>()");
        this.f84989g0 = h12;
        C40767b h13 = C40767b.m118210h1();
        C41536l.m120488h(h13, "create<Unit>()");
        this.f84991h0 = h13;
        C40767b h14 = C40767b.m118210h1();
        C41536l.m120488h(h14, "create<Unit>()");
        this.f84993i0 = h14;
        C40767b h15 = C40767b.m118210h1();
        C41536l.m120488h(h15, "create<Unit>()");
        this.f84995j0 = h15;
        C40767b h16 = C40767b.m118210h1();
        C41536l.m120488h(h16, "create<Boolean>()");
        this.f84997k0 = h16;
        C40767b h17 = C40767b.m118210h1();
        C41536l.m120488h(h17, "create<Unit>()");
        this.f84999l0 = h17;
        C40767b h18 = C40767b.m118210h1();
        C41536l.m120488h(h18, "create<Unit>()");
        this.f85001m0 = h18;
        mo70967an().mo4956s(mo86180Cx(), new C35449n1(new C35203a(this)));
        m104023qy(nVar);
        m103988ey();
        m104015ny();
        m104044xy();
        m104035uy();
        m103979ay();
        m104006ky();
        m103975Yx();
        m103994gy();
        m103943Ey();
    }

    /* renamed from: Ax */
    private final C19289b m103934Ax() {
        String str;
        boolean z;
        String b;
        C37202b invoke = this.f85008t.invoke();
        if (invoke == null || (b = invoke.mo90261b()) == null) {
            str = null;
        } else {
            str = C32289b0.m95091c(b);
        }
        String str2 = str;
        if (invoke != null) {
            z = invoke.mo90262c();
        } else {
            z = false;
        }
        return new C19289b(str2, z, false, 4, (DefaultConstructorMarker) null);
    }

    /* renamed from: Bx */
    private final String m103936Bx(ClipboardManager clipboardManager) {
        CharSequence charSequence;
        ClipData.Item itemAt;
        if (!clipboardManager.hasPrimaryClip()) {
            return null;
        }
        ClipData primaryClip = clipboardManager.getPrimaryClip();
        if (primaryClip == null || (itemAt = primaryClip.getItemAt(0)) == null) {
            charSequence = null;
        } else {
            charSequence = itemAt.getText();
        }
        if (charSequence == null) {
            return null;
        }
        String B = C40439w.m117103B(charSequence.toString(), " ", "", false, 4, (Object) null);
        if (!Pattern.matches("^([A-Za-z]{2}[ \\-]?[0-9]{2})(?=(?:[ \\-]?[a-zA-Z0-9]){9,30}$)((?:[ \\-]?[a-zA-Z0-9]{3,5}){2,7})([ \\-]?[a-zA-Z0-9]{1,3})?$", B)) {
            return null;
        }
        return B;
    }

    /* renamed from: Cy */
    private final boolean m103938Cy(C26765d dVar) {
        boolean z;
        if (!dVar.mo66011P() || !dVar.mo65999D()) {
            return false;
        }
        long lastTimeExpiringCardPopupWasShown = this.f84994j.getLastTimeExpiringCardPopupWasShown(dVar.mo66030j());
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date(lastTimeExpiringCardPopupWasShown));
        Calendar instance2 = Calendar.getInstance();
        int i = instance2.get(5);
        int i2 = instance.get(5);
        Date time = instance.getTime();
        C41536l.m120488h(time, "lastDate.time");
        Date time2 = instance2.getTime();
        C41536l.m120488h(time2, "today.time");
        if (m103973Xx(time, time2)) {
            if (i2 + 1 > 22 || 22 > i) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: Dx */
    private final String m103940Dx(String str) {
        String format = new SimpleDateFormat("dd.MM.yyyy|HH").format(new Date(System.currentTimeMillis()));
        return str + "," + format;
    }

    /* access modifiers changed from: private */
    /* renamed from: Dy */
    public final void m103941Dy(Integer num) {
        if (num == null || num.intValue() != 15002) {
            if (num == null || num.intValue() != 15003) {
                if (num == null || num.intValue() != 15004) {
                    if (num == null || num.intValue() != 15005) {
                        if (num == null || num.intValue() != 15009) {
                            if (num == null || num.intValue() != 17) {
                                if (num == null || num.intValue() != 13) {
                                    if (num == null || num.intValue() != 14) {
                                        if (num == null || num.intValue() != 15) {
                                            if (num == null || num.intValue() != 16) {
                                                if (num == null || num.intValue() != 19) {
                                                    if ((num == null || num.intValue() != 20) && num != null) {
                                                        num.intValue();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: Ey */
    private final void m103943Ey() {
        C41205b E0 = this.f85001m0.mo94989L0(new C30728p5(new C35204a0(this))).mo94979E0();
        C41536l.m120488h(E0, "private fun subscribeToC…ndToLifecycle()\n        }");
        bindToLifecycle(E0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Fx */
    public static final List m103945Fx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Fy */
    public static final C40754t m103946Fy(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Gx */
    public static final List m103948Gx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Hx */
    public static final void m103950Hx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Hy */
    private final boolean m103951Hy() {
        if (Calendar.getInstance().getTimeInMillis() - this.f84994j.getLastShowLiabilityOverduePopupDate() < 86400000) {
            return true;
        }
        return false;
    }

    /* renamed from: Iy */
    private final boolean m103953Iy() {
        long j;
        int i = Calendar.getInstance().get(1);
        PreferencesApiManager preferencesApiManager = this.f84994j;
        C37228a a = this.f85003o.mo89562a();
        if (a != null) {
            j = a.mo90305b();
        } else {
            j = -1;
        }
        if (i != preferencesApiManager.getBirthdayPopupCloseYear(j)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: Jx */
    public final long m103955Jx() {
        Calendar instance = Calendar.getInstance();
        if (this.f84957E.getType() == EnvironmentType.TEST) {
            instance.setTime(new Date(1631192745000L));
        }
        instance.add(5, 10);
        return instance.getTimeInMillis();
    }

    /* renamed from: Ux */
    private final void m103967Ux(int i) {
        if (i == 0) {
            C37224b.m109962a(this.f84975W);
        } else {
            C37224b.m109962a(this.f84974V);
        }
    }

    /* renamed from: Vx */
    private final boolean m103969Vx() {
        Long l = this.f85007s.getUserInfo().getClient().birthDate;
        C41536l.m120488h(l, "client.userInfo.client.birthDate");
        return C41536l.m120484d(C32319m.m95310q(l.longValue()), C32319m.m95310q(Calendar.getInstance().getTimeInMillis()));
    }

    /* access modifiers changed from: private */
    /* renamed from: Wx */
    public final boolean m103971Wx(C37500b bVar, long j) {
        Long q = bVar.mo90683q();
        return q != null && j > q.longValue();
    }

    /* renamed from: Xx */
    private final boolean m103973Xx(Date date, Date date2) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        int i = instance.get(2);
        int i2 = instance.get(1);
        instance.setTime(date2);
        int i3 = instance.get(2);
        int i4 = instance.get(1);
        if (i == i3 && i2 == i4) {
            return true;
        }
        return false;
    }

    /* renamed from: Yx */
    private final void m103975Yx() {
        C41205b E0 = this.f84999l0.mo94989L0(new C30766s4(new C35221k(this))).mo94979E0();
        C41536l.m120488h(E0, "private fun observeBackg…ndToLifecycle()\n        }");
        bindToLifecycle(E0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Zx */
    public static final C40754t m103977Zx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: ay */
    private final void m103979ay() {
        C40749p L0 = this.f84995j0.mo94989L0(new C30767s5(new C35222l(this)));
        C41536l.m120488h(L0, "private fun observeCommo…ndToLifecycle()\n        }");
        C41205b F0 = C32343x.m95413R0(L0).mo94981F0(new C30779t4(new C35224m(this)));
        C41536l.m120488h(F0, "private fun observeCommo…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: cy */
    public static final C40754t m103982cy(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: dy */
    public static final void m103985dy(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: ey */
    private final void m103988ey() {
        C41205b E0 = this.f84987f0.mo94989L0(new C30622h5(new C35227n(this))).mo94979E0();
        C41536l.m120488h(E0, "private fun observeExpir…ndToLifecycle()\n        }");
        bindToLifecycle(E0);
    }

    /* access modifiers changed from: private */
    /* renamed from: fy */
    public static final C40754t m103991fy(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: gy */
    private final void m103994gy() {
        if (!this.f85007s.isAuthorized()) {
            C40762x r = C40762x.m118162z(C41238w.f97225a).mo95077f(50, TimeUnit.MILLISECONDS).mo95087r(new C30689m5(new C35230o(this)));
            C41536l.m120488h(r, "private fun observeGamif…ndToLifecycle()\n        }");
            C41205b H = C32343x.m95465l1(r).mo95065D(new C30702n5()).mo95069H(new C30715o5(new C35231p(this)));
            C41536l.m120488h(H, "private fun observeGamif…ndToLifecycle()\n        }");
            bindToLifecycle(H);
        }
    }

    /* renamed from: hx */
    private final void m103996hx() {
        boolean z;
        C1644x Mx = mo70970e9();
        if (!m103969Vx() || !m103953Iy()) {
            z = false;
        } else {
            z = true;
        }
        C37224b.m109965d(Mx, new C19288a(z, this.f85007s.getUserInfo().isRBClient()));
    }

    /* access modifiers changed from: private */
    /* renamed from: hy */
    public static final C40735b0 m103997hy(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40735b0) lVar.invoke(obj);
    }

    /* renamed from: ix */
    private final void m103999ix() {
        boolean z;
        PreferencesApiManager preferencesApiManager = this.f84994j;
        Long customerId = this.f85007s.getUserInfo().getClient().getCustomerId();
        C41536l.m120488h(customerId, "client.userInfo.client.customerId");
        if (TimeUnit.DAYS.convert(System.currentTimeMillis() - preferencesApiManager.getLastShowCalculateLimitsPopupDate(customerId.longValue()), TimeUnit.MILLISECONDS) > 14) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f84991h0.onNext(C41238w.f97225a);
        } else {
            C37224b.m109965d(mo70964S3(), Boolean.FALSE);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: iy */
    public static final C25210c m104000iy(Throwable th) {
        C41536l.m120489i(th, "it");
        return new C25210c((C25211d) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: jx */
    public final void m104002jx() {
        C29397e eVar = this.f84990h;
        String clientKey = this.f85007s.getUserInfo().getClient().getClientKey();
        C41536l.m120488h(clientKey, "client.userInfo.client.clientKey");
        C41205b F0 = C31270e.m92879h(C32343x.m95413R0(C29397e.m89485b(eVar, clientKey, false, 2, (Object) null)), -1).mo94981F0(new C30636i5(new C35207b(this)));
        C41536l.m120488h(F0, "private fun checkClientG…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: jy */
    public static final void m104003jy(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: kx */
    public static final void m104005kx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: ky */
    private final void m104006ky() {
        C41205b F0 = this.f84997k0.mo94989L0(new C30524a5(new C35232q(this))).mo94981F0(new C30538b5(new C35234r(this.f84981c0)));
        C41536l.m120488h(F0, "private fun observeGamif…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* renamed from: lx */
    private final void m104008lx() {
        this.f84987f0.onNext(C41238w.f97225a);
    }

    /* access modifiers changed from: private */
    /* renamed from: ly */
    public static final C40754t m104009ly(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: mx */
    private final void m104011mx() {
        C32343x.m95472o(this.f85001m0);
    }

    /* access modifiers changed from: private */
    /* renamed from: my */
    public static final void m104012my(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: nx */
    public final void m104014nx() {
        boolean z;
        C40762x xVar;
        Long googlePayPopupCloseDate = this.f84994j.getGooglePayPopupCloseDate(String.valueOf(this.f85007s.getUserInfo().getClient().getCustomerId()));
        C41536l.m120488h(googlePayPopupCloseDate, "preferencesApiManager.ge…nt.customerId.toString())");
        boolean z2 = true;
        if (TimeUnit.DAYS.convert(System.currentTimeMillis() - googlePayPopupCloseDate.longValue(), TimeUnit.MILLISECONDS) > 30) {
            z = true;
        } else {
            z = false;
        }
        if (!this.f84994j.deviceCanSupportGooglePay() || !z || !C20101a.f54724a.mo48497a(this.f84996k)) {
            z2 = false;
        }
        if (z2) {
            xVar = this.f84988g.invoke();
        } else {
            xVar = C40762x.m118162z(Boolean.FALSE);
            C41536l.m120488h(xVar, "just(false)");
        }
        C41205b F0 = C31270e.m92880i(C32343x.m95465l1(xVar), -1).mo94981F0(new C30650j5(new C35210c(this)));
        C41536l.m120488h(F0, "private fun checkGoogleP…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* renamed from: ny */
    private final void m104015ny() {
        C40749p L0 = this.f84989g0.mo94989L0(new C30566d5(new C35235s(this)));
        C41536l.m120488h(L0, "private fun observeLiabi…ndToLifecycle()\n        }");
        C41205b F0 = C32343x.m95462k1(L0).mo94981F0(new C30676l5(new C35237t(this)));
        C41536l.m120488h(F0, "private fun observeLiabi…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: ox */
    public static final void m104017ox(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: oy */
    public static final C40754t m104018oy(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: py */
    public static final void m104020py(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: qx */
    private final boolean m104022qx(String str) {
        boolean z;
        String lastShownIbanInfo = this.f84994j.getLastShownIbanInfo();
        C41536l.m120488h(lastShownIbanInfo, "preferencesApiManager.lastShownIbanInfo");
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && !C41536l.m120484d(m103940Dx(str), lastShownIbanInfo)) {
            return true;
        }
        return false;
    }

    /* renamed from: qy */
    private final void m104023qy(C36742n nVar) {
        C41205b F0 = nVar.mo89567a().mo94978E(new C30580e5(new C35240u(this))).mo95010W(new C30594f5(new C35241v(this))).mo95027o0(C40992a.m118827a()).mo94981F0(new C30608g5(new C35242w(this)));
        C41536l.m120488h(F0, "private fun observeLogin…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* renamed from: rx */
    private final void m104025rx() {
        if (this.f84996k.mo48774a("COL_PLM_MBANK_CLIENTS_POPUP") == null || m103951Hy()) {
            m104049zy((LiabilityOverdueInfoUiModel) null);
        } else {
            C32343x.m95472o(this.f84989g0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ry */
    public static final void m104026ry(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: sx */
    public static final List m104028sx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: sy */
    public static final C40735b0 m104029sy(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40735b0) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: tx */
    public static final List m104031tx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: ty */
    public static final void m104032ty(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: ux */
    public static final void m104034ux(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: uy */
    private final void m104035uy() {
        C40749p L0 = this.f84991h0.mo94989L0(new C30741q5(new C35243x(this)));
        C41536l.m120488h(L0, "private fun observeNboSu…ndToLifecycle()\n        }");
        C41205b F0 = C32343x.m95413R0(L0).mo94981F0(new C30754r5(new C35244y(this)));
        C41536l.m120488h(F0, "private fun observeNboSu…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: vx */
    public final void m104037vx() {
        C41205b F0 = C31270e.m92879h(C32343x.m95462k1(C26186e.m81987e(C37019f.m109528b(this.f84954B, false, 1, (Object) null))), -1).mo94981F0(new C30663k5(new C35216g(this)));
        C41536l.m120488h(F0, "private fun checkProlong…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: vy */
    public static final C40754t m104038vy(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: wx */
    public static final void m104040wx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: wy */
    public static final void m104041wy(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: xx */
    private final void m104043xx() {
        Object systemService = this.f84982d.getSystemService("clipboard");
        C41536l.m120487g(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        String Bx = m103936Bx((ClipboardManager) systemService);
        if (Bx == null || !m104022qx(Bx)) {
            C37224b.m109965d(this.f84972T, new ToastNotificationArgumentsWrapper((ToastNotificationArguments) null, (String) null, 2, (DefaultConstructorMarker) null));
            return;
        }
        C37224b.m109965d(this.f84972T, new ToastNotificationArgumentsWrapper(new ToastNotificationArguments(Bx, C27950a.m86287d("transfer.offer.dialog.notification", false, 2, (Object) null), C27950a.m86287d("transfer.offer.dialog.notification.button", false, 2, (Object) null), true, false, new ToastNotificationAppearance.Custom(new ToastNotificationIcon.Illustration(new Image.Resource(C10320i.illustration_copied_iban, (Boolean) null, 2, (DefaultConstructorMarker) null)), (Color) null, (Color) null, 6, (DefaultConstructorMarker) null), (Long) null, 80, 0, 60, 64, (DefaultConstructorMarker) null), Bx));
    }

    /* renamed from: xy */
    private final void m104044xy() {
        C41205b E0 = this.f84993i0.mo94989L0(new C30552c5(new C35247z(this))).mo94979E0();
        C41536l.m120488h(E0, "private fun observeWalle…ndToLifecycle()\n        }");
        bindToLifecycle(E0);
    }

    /* access modifiers changed from: private */
    /* renamed from: yy */
    public static final C40754t m104046yy(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: zx */
    public final List m104048zx(C26766e eVar) {
        String str;
        String c;
        List w = C41343r.m119927w(eVar.mo66048a().values());
        ArrayList<C26765d> arrayList = new ArrayList<>();
        for (Object next : w) {
            if (m103938Cy((C26765d) next)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(arrayList, 10));
        for (C26765d dVar : arrayList) {
            long j = dVar.mo66030j();
            String l = dVar.mo66032l();
            if (l == null) {
                l = C32343x.m95388F(dVar.mo65996A(), new Object[0]);
            }
            String str2 = l;
            int a = C19277a.m64731a(dVar.mo66001F(), C10320i.f28667K1);
            C26763b f = dVar.mo66025f();
            if (f == null || (c = f.mo65986c()) == null) {
                str = null;
            } else {
                str = C32289b0.m95091c(c);
            }
            arrayList2.add(new ExpiringCardPopUpData(j, str2, a, str, false, 16, (DefaultConstructorMarker) null));
        }
        return arrayList2;
    }

    /* access modifiers changed from: private */
    /* renamed from: zy */
    public final void m104049zy(LiabilityOverdueInfoUiModel liabilityOverdueInfoUiModel) {
        C37224b.m109965d(mo70968ck(), new C25800a(liabilityOverdueInfoUiModel));
    }

    /* renamed from: Ay */
    public void mo86178Ay(C30753r4 r4Var) {
        C41536l.m120489i(r4Var, "pageItem");
        mo70967an().mo4826r(C32343x.m95466m(r4Var));
    }

    /* renamed from: By */
    public void mo86179By(int i) {
        mo86184Kx().mo4823o(Integer.valueOf(i));
    }

    /* renamed from: Cx */
    public C1644x mo86180Cx() {
        return this.f84960H;
    }

    /* renamed from: Dt */
    public LiveData mo70962Dt() {
        return this.f84981c0;
    }

    /* renamed from: Ex */
    public void mo86181Ex() {
        C41205b F0 = C26186e.m81987e(this.f84986f.mo67598a(false)).mo95026k0(new C30792u4(new C35218h(this.f85004p))).mo95035t0(new C30805v4(C35219i.f85030d)).mo94981F0(new C30818w4(new C35220j(this)));
        C41536l.m120488h(F0, "override fun getJuniorPo…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* renamed from: Gy */
    public void mo86182Gy(C19290c cVar) {
        C41536l.m120489i(cVar, "fill");
        this.f84978Z.mo4823o(cVar);
    }

    /* renamed from: Hn */
    public void mo70945Hn(int i) {
        this.f84976X.mo4823o(Integer.valueOf(i));
        m103967Ux(i);
    }

    /* renamed from: Ix */
    public C1644x mo70960Bp() {
        return this.f84964L;
    }

    /* renamed from: Kq */
    public LiveData mo70963Kq() {
        return this.f84977Y;
    }

    /* renamed from: Kx */
    public C1644x mo86184Kx() {
        return this.f84961I;
    }

    /* renamed from: Lx */
    public C1639v mo70967an() {
        return this.f84962J;
    }

    /* renamed from: Mx */
    public C1644x mo70970e9() {
        return this.f84967O;
    }

    /* renamed from: Nx */
    public C1644x mo70964S3() {
        return this.f84971S;
    }

    /* renamed from: Ox */
    public C1644x mo70980t9() {
        return this.f84968P;
    }

    /* renamed from: Px */
    public C1644x mo70979sa() {
        return this.f84979a0;
    }

    /* renamed from: Qd */
    public void mo70946Qd() {
        C37228a a = this.f85003o.mo89562a();
        if (a != null) {
            this.f84994j.setBirthDayPopUpCloseYear(Calendar.getInstance().get(1), a.mo90305b());
        }
    }

    /* renamed from: Qx */
    public C1644x mo70978rr() {
        return this.f84966N;
    }

    /* renamed from: Rq */
    public void mo70947Rq() {
        C32343x.m95397J0(this, "c_state_popup_home", "", "Display_popup", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 16, (Object) null);
        PreferencesApiManager preferencesApiManager = this.f84994j;
        Long customerId = this.f85007s.getUserInfo().getClient().getCustomerId();
        C41536l.m120488h(customerId, "client.userInfo.client.customerId");
        preferencesApiManager.setLastShowCalculateLimitsPopupDate(customerId.longValue());
    }

    /* renamed from: Rx */
    public C1644x mo70975jm() {
        return this.f84965M;
    }

    /* renamed from: Sx */
    public C1644x mo70968ck() {
        return this.f84970R;
    }

    /* renamed from: Tx */
    public C1644x mo70961Do() {
        return this.f84969Q;
    }

    /* renamed from: U3 */
    public LiveData mo70965U3() {
        return this.f84975W;
    }

    /* renamed from: Wr */
    public LiveData mo70966Wr() {
        return this.f84980b0;
    }

    /* renamed from: cl */
    public LiveData mo70969cl() {
        return this.f84972T;
    }

    /* renamed from: el */
    public LiveData mo70971el() {
        return this.f84974V;
    }

    /* renamed from: er */
    public LiveData mo70972er() {
        return this.f84985e0;
    }

    /* renamed from: fs */
    public LiveData mo70973fs() {
        return this.f84978Z;
    }

    /* renamed from: pk */
    public LiveData mo70976pk() {
        return this.f84973U;
    }

    /* renamed from: pu */
    public void mo70948pu(String str) {
        C41536l.m120489i(str, "popupType");
        this.f85012x.mo89792a(str);
    }

    /* renamed from: px */
    public void mo86194px() {
        C32343x.m95472o(this.f84993i0);
    }

    /* renamed from: qh */
    public void mo70949qh() {
        mo86194px();
    }

    /* renamed from: ql */
    public LiveData mo70977ql() {
        return this.f84976X;
    }

    /* renamed from: r9 */
    public void mo70950r9() {
        C32343x.m95472o(this.f84999l0);
    }

    /* renamed from: tf */
    public void mo70951tf() {
        m104025rx();
        m103999ix();
        m104014nx();
        m104008lx();
        m103996hx();
        m104043xx();
        m104011mx();
        C41205b F0 = C32343x.m95413R0(C26186e.m81987e(C25349i.C25350a.m80521a(this.f84992i, false, 1, (Object) null))).mo95026k0(new C30831x4(C35213d.f85025d)).mo95035t0(new C30844y4(C35214e.f85026d)).mo94981F0(new C30857z4(new C35215f(this)));
        C41536l.m120488h(F0, "override fun checkPopups…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* renamed from: tj */
    public void mo70952tj() {
        this.f84956D.mo63411a();
    }

    /* renamed from: um */
    public void mo70953um() {
        C41205b E = C37063e.C37064a.m109589a(this.f85009u, false, 1, (Object) null).mo94886E();
        C41536l.m120488h(E, "updateGeneralPreLoginBackgroundUrl().subscribe()");
        bindToLifecycle(E);
        this.f84977Y.mo4823o(new C19289b((String) null, false, true, 3, (DefaultConstructorMarker) null));
        this.f84997k0.onNext(Boolean.TRUE);
    }

    /* renamed from: xi */
    public LiveData mo70981xi() {
        return this.f84983d0;
    }

    /* renamed from: yx */
    public void mo86195yx() {
        mo86180Cx().mo4823o(new C37223a(C41238w.f97225a));
    }

    public C1644x getHasKycLiveData() {
        return this.f84963K;
    }
}
