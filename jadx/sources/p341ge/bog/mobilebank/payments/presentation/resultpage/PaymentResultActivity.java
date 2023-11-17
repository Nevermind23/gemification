package p341ge.bog.mobilebank.payments.presentation.resultpage;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.activity.result.C0173b;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import com.bumptech.glide.C2394j;
import com.bumptech.glide.load.resource.bitmap.C2524n;
import fx0.C32023c;
import fy0.C32027a;
import fy0.C32028b;
import fy0.C32029c;
import fy0.C32030d;
import fy0.C32031e;
import fy0.C32032f;
import fy0.C32033g;
import g91.C32303f;
import g91.C32343x;
import gy0.C36088a;
import gy0.C36089b;
import gy0.C36090c;
import he1.C41212c;
import he1.C41217g;
import he1.C41224m;
import he1.C41238w;
import java.util.ArrayList;
import java.util.Map;
import jx0.C36817e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o31.C37588a0;
import ox0.C37833c;
import p035c4.C2256h;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.bannercard.BannerCard;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.pagestate.PageState;
import p341ge.bog.designsystem.components.pagestate.PageStateType;
import p341ge.bog.mobilebank.cleanarch.moremenu.presentation.PackageType;
import p341ge.bog.mobilebank.p975ui.activities.MainActivity;
import p341ge.bog.mobilebank.payment.activities.DDTransparentLoaderActivity;
import p341ge.bog.mobilebank.payment.activities.TemplateFormActivity;
import p341ge.bog.mobilebank.payment.model.C33624a;
import p341ge.bog.mobilebank.payments.data.model.CodeStatus;
import p341ge.bog.mobilebank.payments.presentation.resultpage.C33775c;
import p341ge.bog.mobilebank.payments.presentation.resultpage.model.PaymentResultObjectUiModel;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.model.RetrofitClient;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import p366bk.C10328q;
import p601sg.C17780e;
import p642vh.C18368l;
import q31.C38122f;
import q31.C38125h;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.payments.presentation.resultpage.PaymentResultActivity */
public final class PaymentResultActivity extends C33772a {

    /* renamed from: J */
    public static final C33757a f82239J = new C33757a((DefaultConstructorMarker) null);

    /* renamed from: G */
    private final C41217g f82240G = C41219i.m119470b(new C33759c(this));

    /* renamed from: H */
    public C33775c.C33776a f82241H;

    /* renamed from: I */
    private final C41217g f82242I = new C1617p0(C41520a0.m120436b(C33775c.class), new C33768l(this), new C33770n(this), new C33769m((C43064a) null, this));

    /* renamed from: ge.bog.mobilebank.payments.presentation.resultpage.PaymentResultActivity$a */
    public static final class C33757a {
        private C33757a() {
        }

        public /* synthetic */ C33757a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo80430a(PaymentResultObjectUiModel paymentResultObjectUiModel, Context context) {
            C41536l.m120489i(paymentResultObjectUiModel, "paymentResultObjectUiModel");
            C41536l.m120489i(context, "context");
            Intent intent = new Intent(context, PaymentResultActivity.class);
            intent.putExtra("ARGS_PAYMENT_RESULT_OBJECT", paymentResultObjectUiModel);
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.resultpage.PaymentResultActivity$b */
    public /* synthetic */ class C33758b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f82243a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                ge.bog.mobilebank.payments.data.model.CodeStatus[] r0 = p341ge.bog.mobilebank.payments.data.model.CodeStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ge.bog.mobilebank.payments.data.model.CodeStatus r1 = p341ge.bog.mobilebank.payments.data.model.CodeStatus.SUCCESS     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ge.bog.mobilebank.payments.data.model.CodeStatus r1 = p341ge.bog.mobilebank.payments.data.model.CodeStatus.PENDING     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                ge.bog.mobilebank.payments.data.model.CodeStatus r1 = p341ge.bog.mobilebank.payments.data.model.CodeStatus.REJECTED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f82243a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.payments.presentation.resultpage.PaymentResultActivity.C33758b.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.resultpage.PaymentResultActivity$c */
    static final class C33759c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ PaymentResultActivity f82244d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33759c(PaymentResultActivity paymentResultActivity) {
            super(0);
            this.f82244d = paymentResultActivity;
        }

        /* renamed from: b */
        public final C36817e invoke() {
            return C36817e.m109083d(this.f82244d.getLayoutInflater());
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.resultpage.PaymentResultActivity$d */
    /* synthetic */ class C33760d extends C41535k implements C43075l {
        C33760d(Object obj) {
            super(1, obj, PaymentResultActivity.class, "onPaymentStatus", "onPaymentStatus(Lkotlin/Pair;)V", 0);
        }

        /* renamed from: b */
        public final void mo80432b(C41224m mVar) {
            C41536l.m120489i(mVar, "p0");
            ((PaymentResultActivity) this.receiver).m99299a3(mVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo80432b((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.resultpage.PaymentResultActivity$e */
    /* synthetic */ class C33761e extends C41535k implements C43075l {
        C33761e(Object obj) {
            super(1, obj, PaymentResultActivity.class, "onBannerData", "onBannerData(Lge/bog/mobilebank/payments/presentation/resultpage/model/PaymentBannerUiModel;)V", 0);
        }

        /* renamed from: b */
        public final void mo80433b(C36088a aVar) {
            ((PaymentResultActivity) this.receiver).m99295W2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo80433b((C36088a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.resultpage.PaymentResultActivity$f */
    /* synthetic */ class C33762f extends C41535k implements C43075l {
        C33762f(Object obj) {
            super(1, obj, PaymentResultActivity.class, "onServiceData", "onServiceData(Lge/bog/mobilebank/payments/presentation/resultpage/model/PaymentServiceUiModel;)V", 0);
        }

        /* renamed from: b */
        public final void mo80434b(C36090c cVar) {
            C41536l.m120489i(cVar, "p0");
            ((PaymentResultActivity) this.receiver).m99300b3(cVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo80434b((C36090c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.resultpage.PaymentResultActivity$g */
    /* synthetic */ class C33763g extends C41535k implements C43075l {
        C33763g(Object obj) {
            super(1, obj, PaymentResultActivity.class, "onPaymentDetails", "onPaymentDetails(Lge/bog/mobilebank/payments/presentation/resultpage/model/PaymentDetailsUiModel;)V", 0);
        }

        /* renamed from: b */
        public final void mo80435b(C36089b bVar) {
            C41536l.m120489i(bVar, "p0");
            ((PaymentResultActivity) this.receiver).m99298Z2(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo80435b((C36089b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.resultpage.PaymentResultActivity$h */
    static final class C33764h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PaymentResultActivity f82245d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33764h(PaymentResultActivity paymentResultActivity) {
            super(1);
            this.f82245d = paymentResultActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            Button button = this.f82245d.m99290Q2().f88831j;
            C41536l.m120488h(button, "binding.buttonAddTemplate");
            C41536l.m120488h(bool, "it");
            C32343x.m95483r1(button, bool.booleanValue(), false, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.resultpage.PaymentResultActivity$i */
    static final class C33765i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PaymentResultActivity f82246d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33765i(PaymentResultActivity paymentResultActivity) {
            super(1);
            this.f82246d = paymentResultActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            Button button = this.f82246d.m99290Q2().f88830i;
            C41536l.m120488h(button, "binding.buttonAddDd");
            C41536l.m120488h(bool, "it");
            C32343x.m95483r1(button, bool.booleanValue(), false, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.resultpage.PaymentResultActivity$j */
    static final class C33766j extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C33766j f82247d = new C33766j();

        C33766j() {
            super(1);
        }

        /* renamed from: a */
        public final C2394j invoke(C2394j jVar) {
            C41536l.m120489i(jVar, "$this$setImage");
            C2394j A0 = jVar.mo7215a(new C2256h().mo7252u0(new C2524n()));
            C41536l.m120488h(A0, "apply(RequestOptions().transform(CircleCrop()))");
            return A0;
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.resultpage.PaymentResultActivity$k */
    static final class C33767k implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f82248a;

        C33767k(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f82248a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f82248a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f82248a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.resultpage.PaymentResultActivity$l */
    public static final class C33768l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f82249d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33768l(ComponentActivity componentActivity) {
            super(0);
            this.f82249d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f82249d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.resultpage.PaymentResultActivity$m */
    public static final class C33769m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f82250d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f82251e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33769m(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f82250d = aVar;
            this.f82251e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f82250d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f82251e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.resultpage.PaymentResultActivity$n */
    static final class C33770n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ PaymentResultActivity f82252d;

        /* renamed from: ge.bog.mobilebank.payments.presentation.resultpage.PaymentResultActivity$n$a */
        static final class C33771a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ PaymentResultActivity f82253d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33771a(PaymentResultActivity paymentResultActivity) {
                super(0);
                this.f82253d = paymentResultActivity;
            }

            /* renamed from: b */
            public final C33775c invoke() {
                C33775c.C33776a S2 = this.f82253d.mo80429S2();
                Parcelable parcelableExtra = this.f82253d.getIntent().getParcelableExtra("ARGS_PAYMENT_RESULT_OBJECT");
                C41536l.m120486f(parcelableExtra);
                return S2.mo32539a((PaymentResultObjectUiModel) parcelableExtra);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33770n(PaymentResultActivity paymentResultActivity) {
            super(0);
            this.f82252d = paymentResultActivity;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C33771a(this.f82252d));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Q2 */
    public final C36817e m99290Q2() {
        return (C36817e) this.f82240G.getValue();
    }

    /* renamed from: R2 */
    private final C33775c m99291R2() {
        return (C33775c) this.f82242I.getValue();
    }

    /* renamed from: T2 */
    private final void m99292T2() {
        C33775c sw = m99291R2().mo80447sw();
        sw.mo80449uw().mo4819k(this, new C33767k(new C33760d(this)));
        sw.mo80445mw().mo4819k(this, new C33767k(new C33761e(this)));
        sw.mo80451ww().mo4819k(this, new C33767k(new C33762f(this)));
        sw.mo80448tw().mo4819k(this, new C33767k(new C33763g(this)));
        sw.mo80444kw().mo4819k(this, new C33767k(new C33764h(this)));
        sw.mo80443jw().mo4819k(this, new C33767k(new C33765i(this)));
    }

    /* renamed from: U2 */
    private final void m99293U2() {
        C33624a.C33625a s = C33624a.m98713a(this).mo79806f(DDTransparentLoaderActivity.class).mo79819s(m99291R2().mo80446rw().mo80442C5());
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(m99291R2().mo80446rw().mo80453yw());
        s.mo79813m(arrayList).mo79825y();
        C32343x.m95497x0(this, "payment_form", "success_button", "click", "dd");
    }

    /* renamed from: V2 */
    private final void m99294V2() {
        C33624a.C33625a s = C33624a.m98713a(this).mo79806f(TemplateFormActivity.class).mo79819s(m99291R2().mo80446rw().mo80442C5());
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(m99291R2().mo80446rw().mo80453yw());
        s.mo79813m(arrayList).mo79803c(true).mo79825y();
        C32343x.m95497x0(this, "payment_form", "success_button", "click", "template");
    }

    /* access modifiers changed from: private */
    /* renamed from: W2 */
    public final void m99295W2(C36088a aVar) {
        BannerCard bannerCard = m99290Q2().f88828g;
        C41238w wVar = null;
        if (aVar != null) {
            C41536l.m120488h(bannerCard, "onBannerData$lambda$13$lambda$11");
            C32343x.m95483r1(bannerCard, aVar.mo88831d(), false, 2, (Object) null);
            bannerCard.setInfoText(aVar.mo88830c());
            bannerCard.setShowMoreText(aVar.mo88829b());
            bannerCard.setBannerImage(new Image.Url(aVar.mo88828a(), (Image.Placeholder) null, (Image.Placeholder) null, (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 126, (DefaultConstructorMarker) null));
            wVar = C41238w.f97225a;
        }
        if (wVar == null) {
            C41536l.m120488h(bannerCard, "onBannerData$lambda$13$lambda$12");
            C32343x.m95455i0(bannerCard);
        }
    }

    /* renamed from: X2 */
    private final void m99296X2() {
        BannerCard bannerCard = m99290Q2().f88828g;
        C41536l.m120488h(bannerCard, "binding.banner");
        C32343x.m95455i0(bannerCard);
        m99291R2().mo80446rw().mo80454zw();
    }

    /* renamed from: Y2 */
    private final void m99297Y2() {
        C38122f.C38123a.m112223s(C38125h.m112238c(this), (PackageType) null, false, (String) null, this, (C0173b) null, 23, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: Z2 */
    public final void m99298Z2(C36089b bVar) {
        C36817e Q2 = m99290Q2();
        Q2.f88839r.setText(bVar.mo88835a());
        Q2.f88842u.setText(bVar.mo88838d());
        Q2.f88843v.setText(bVar.mo88839e());
        Q2.f88840s.setText(bVar.mo88837c());
        ImageView imageView = Q2.f88841t;
        C41536l.m120488h(imageView, "paymentDetailsCardImage");
        C18368l.m62746A(imageView, new Image.Url(bVar.mo88836b(), new Image.Resource(C17780e.f49661j1, (Boolean) null, 2, (DefaultConstructorMarker) null), (Image.Placeholder) null, (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 124, (DefaultConstructorMarker) null), (C43075l) null, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a3 */
    public final void m99299a3(C41224m mVar) {
        String str;
        C36817e Q2 = m99290Q2();
        int[] iArr = C33758b.f82243a;
        int i = iArr[((CodeStatus) mVar.mo95678e()).ordinal()];
        if (i == 1) {
            Q2.f88837p.setPageStateType(new PageStateType.Success((Image) null, 0, (Color) null, (Color) null, 15, (DefaultConstructorMarker) null));
            Q2.f88837p.setTitleText(C34646b.m101752f(C37833c.f90838a.mo91131Q(), (Context) null, 1, (Object) null));
            Button button = Q2.f88823A;
            C41536l.m120488h(button, "singleButtonHomePage");
            C32343x.m95455i0(button);
            HorizontalScrollView horizontalScrollView = Q2.f88826e;
            C41536l.m120488h(horizontalScrollView, "actionButtonsContainer");
            C32343x.m95447f1(horizontalScrollView);
        } else if (i == 2) {
            Q2.f88837p.setPageStateType(new PageStateType.Warning((Image) null, 0, (Color) null, (Color) null, 15, (DefaultConstructorMarker) null));
            Q2.f88837p.setTitleText(C34646b.m101752f(C37833c.f90838a.mo91129O(), (Context) null, 1, (Object) null));
            Button button2 = Q2.f88823A;
            C41536l.m120488h(button2, "singleButtonHomePage");
            C32343x.m95447f1(button2);
            HorizontalScrollView horizontalScrollView2 = Q2.f88826e;
            C41536l.m120488h(horizontalScrollView2, "actionButtonsContainer");
            C32343x.m95455i0(horizontalScrollView2);
        } else if (i == 3) {
            PageState pageState = Q2.f88837p;
            PageStateType.Error error = r9;
            PageStateType.Error error2 = new PageStateType.Error((Image) null, 0, (Color) null, (Color) null, 15, (DefaultConstructorMarker) null);
            pageState.setPageStateType(error);
            Q2.f88837p.setTitleText(C34646b.m101752f((StringSource) mVar.mo95680f(), (Context) null, 1, (Object) null));
            Button button3 = Q2.f88823A;
            C41536l.m120488h(button3, "singleButtonHomePage");
            C32343x.m95447f1(button3);
            HorizontalScrollView horizontalScrollView3 = Q2.f88826e;
            C41536l.m120488h(horizontalScrollView3, "actionButtonsContainer");
            C32343x.m95455i0(horizontalScrollView3);
        }
        int i2 = iArr[((CodeStatus) mVar.mo95678e()).ordinal()];
        if (i2 == 1) {
            str = "success_page";
        } else if (i2 == 2) {
            str = "pending";
        } else if (i2 == 3) {
            str = "failed";
        } else {
            throw new NoWhenBranchMatchedException();
        }
        C32343x.m95497x0(this, "payment_form", str, "view", m99291R2().mo80447sw().mo80452xw());
    }

    /* access modifiers changed from: private */
    /* renamed from: b3 */
    public final void m99300b3(C36090c cVar) {
        C36817e Q2 = m99290Q2();
        ImageView imageView = Q2.f88844w;
        C41536l.m120488h(imageView, "providerImage");
        C18368l.m62777z(imageView, new Image.Url(cVar.mo88845c(), new Image.Resource(C32023c.f78830c, (Boolean) null, 2, (DefaultConstructorMarker) null), (Image.Placeholder) null, (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 124, (DefaultConstructorMarker) null), C33766j.f82247d);
        Q2.f88845x.setText(cVar.mo88846d());
        Q2.f88834m.setText(cVar.mo88844b());
        Q2.f88838q.setText(cVar.mo88843a());
    }

    /* renamed from: c3 */
    private final void m99301c3() {
        String urlWithExtras = RetrofitClient.getUrlWithExtras(BankApi.PAYMENTS_GET_PAYMENT_HISTORY_PDF, m99291R2().mo80446rw().mo80450vw());
        String string = getString(C10328q.f28968x1);
        C32303f.m95195f(urlWithExtras, this, string + ".pdf", "application/pdf");
        C32343x.m95497x0(this, "payment_form", "success_button", "click", "receipt");
    }

    /* renamed from: d3 */
    private final void m99302d3() {
        C32343x.m95497x0(this, "payment_form", "success_button", "click", "home");
        startActivity(new Intent(this, MainActivity.class).setFlags(872415232));
        finish();
    }

    /* renamed from: e3 */
    private final void m99303e3() {
        C36817e Q2 = m99290Q2();
        Q2.f88833l.setOnClickListener(new C32027a(this));
        Q2.f88831j.setOnClickListener(new C32028b(this));
        Q2.f88830i.setOnClickListener(new C32029c(this));
        Q2.f88832k.setOnClickListener(new C32030d(this));
        Q2.f88823A.setOnClickListener(new C32031e(this));
        Q2.f88828g.setCloseButtonClickListener(new C32032f(this));
        Q2.f88828g.setShowMoreClickListener(new C32033g(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: f3 */
    public static final void m99304f3(PaymentResultActivity paymentResultActivity, View view) {
        C41536l.m120489i(paymentResultActivity, "this$0");
        paymentResultActivity.m99301c3();
    }

    /* access modifiers changed from: private */
    /* renamed from: g3 */
    public static final void m99305g3(PaymentResultActivity paymentResultActivity, View view) {
        C41536l.m120489i(paymentResultActivity, "this$0");
        paymentResultActivity.m99294V2();
    }

    /* access modifiers changed from: private */
    /* renamed from: h3 */
    public static final void m99306h3(PaymentResultActivity paymentResultActivity, View view) {
        C41536l.m120489i(paymentResultActivity, "this$0");
        paymentResultActivity.m99293U2();
    }

    /* access modifiers changed from: private */
    /* renamed from: i3 */
    public static final void m99307i3(PaymentResultActivity paymentResultActivity, View view) {
        C41536l.m120489i(paymentResultActivity, "this$0");
        paymentResultActivity.m99302d3();
    }

    /* access modifiers changed from: private */
    /* renamed from: j3 */
    public static final void m99308j3(PaymentResultActivity paymentResultActivity, View view) {
        C41536l.m120489i(paymentResultActivity, "this$0");
        paymentResultActivity.m99302d3();
    }

    /* access modifiers changed from: private */
    /* renamed from: k3 */
    public static final void m99309k3(PaymentResultActivity paymentResultActivity, View view) {
        C41536l.m120489i(paymentResultActivity, "this$0");
        paymentResultActivity.m99296X2();
    }

    /* access modifiers changed from: private */
    /* renamed from: l3 */
    public static final void m99310l3(PaymentResultActivity paymentResultActivity, View view) {
        C41536l.m120489i(paymentResultActivity, "this$0");
        paymentResultActivity.m99297Y2();
    }

    /* renamed from: m3 */
    private final void m99311m3() {
        C36817e Q2 = m99290Q2();
        TextView textView = Q2.f88847z;
        C37833c cVar = C37833c.f90838a;
        textView.setText(C34646b.m101752f(cVar.mo91126L(), (Context) null, 1, (Object) null));
        Q2.f88846y.setText(C34646b.m101752f(cVar.mo91120F(), (Context) null, 1, (Object) null));
        Q2.f88823A.setButtonText(C34646b.m101752f(cVar.mo91125K(), (Context) null, 1, (Object) null));
        Q2.f88832k.setButtonText(C34646b.m101752f(cVar.mo91125K(), (Context) null, 1, (Object) null));
        Q2.f88831j.setButtonText(C34646b.m101752f(cVar.mo91119E(), (Context) null, 1, (Object) null));
        Q2.f88830i.setButtonText(C34646b.m101752f(cVar.mo91118D(), (Context) null, 1, (Object) null));
        Q2.f88833l.setButtonText(C34646b.m101752f(cVar.mo91127M(), (Context) null, 1, (Object) null));
        Q2.f88839r.setTitle(C34646b.m101752f(cVar.mo91121G(), (Context) null, 1, (Object) null));
        Q2.f88842u.setTitle(C34646b.m101752f(cVar.mo91123I(), (Context) null, 1, (Object) null));
        Q2.f88843v.setTitle(C34646b.m101752f(cVar.mo91124J(), (Context) null, 1, (Object) null));
        Q2.f88840s.setTitle(C34646b.m101752f(cVar.mo91122H(), (Context) null, 1, (Object) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        setContentView((View) m99290Q2().mo3946b());
        super.mo37451O1(bundle);
        m99311m3();
        m99303e3();
        m99292T2();
    }

    /* renamed from: S2 */
    public final C33775c.C33776a mo80429S2() {
        C33775c.C33776a aVar = this.f82241H;
        if (aVar != null) {
            return aVar;
        }
        C41536l.m120506z("viewModelFactory");
        return null;
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return C34646b.m101752f(C37833c.f90838a.mo91128N(), (Context) null, 1, (Object) null);
    }
}
