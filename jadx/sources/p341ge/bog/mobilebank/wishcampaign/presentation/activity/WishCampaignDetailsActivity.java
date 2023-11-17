package p341ge.bog.mobilebank.wishcampaign.presentation.activity;

import a81.C30772sa;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.graphics.C0829d;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.recyclerview.widget.RecyclerView;
import b41.C31128a;
import b41.C31132b;
import com.google.android.material.appbar.AppBarLayout;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l91.C37115b;
import l91.C37118e;
import m41.C37224b;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.bannercard.BannerCard;
import p341ge.bog.designsystem.components.common.CropImageView;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.mobilebank.wishcampaign.presentation.viewmodel.WishCampaignViewModel$ViewModel;
import p420fh.C12902d;
import p420fh.C12910e;
import p642vh.C18368l;
import p91.C37930a;
import p91.C37933d;
import q31.C38125h;
import u91.C39045a;
import u91.C39046b;
import u91.C39047c;
import u91.C39048d;
import u91.C39049e;
import ue1.C43064a;
import ue1.C43075l;
import v91.C39261b;
import w91.C39618a;
import y91.C40036a;
import y91.C40037b;
import y91.C40038c;
import y91.C40039d;
import y91.C40040e;
import y91.C40041f;
import z91.C40212a;
import z91.C40213b;

/* renamed from: ge.bog.mobilebank.wishcampaign.presentation.activity.WishCampaignDetailsActivity */
public final class WishCampaignDetailsActivity extends C30772sa {

    /* renamed from: I */
    public static final C35897a f86845I = new C35897a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private final C41217g f86846F = C41219i.m119470b(new C35906i(this));

    /* renamed from: G */
    private final C41217g f86847G = new C1617p0(C41520a0.m120436b(WishCampaignViewModel$ViewModel.class), new C35915r(this), new C35914q(this), new C35916s((C43064a) null, this));

    /* renamed from: H */
    private final C41217g f86848H = C41219i.m119470b(new C35904h(this));

    /* renamed from: ge.bog.mobilebank.wishcampaign.presentation.activity.WishCampaignDetailsActivity$a */
    public static final class C35897a {
        private C35897a() {
        }

        public /* synthetic */ C35897a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.wishcampaign.presentation.activity.WishCampaignDetailsActivity$b */
    /* synthetic */ class C35898b extends C41535k implements C43075l {
        C35898b(Object obj) {
            super(1, obj, WishCampaignDetailsActivity.class, "updateToolbar", "updateToolbar(Lge/bog/mobilebank/wishcampaign/presentation/model/ToolbarState;)V", 0);
        }

        /* renamed from: b */
        public final void mo88183b(C40036a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((WishCampaignDetailsActivity) this.receiver).m106845o3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo88183b((C40036a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.wishcampaign.presentation.activity.WishCampaignDetailsActivity$c */
    /* synthetic */ class C35899c extends C41535k implements C43075l {
        C35899c(Object obj) {
            super(1, obj, WishCampaignDetailsActivity.class, "onPageDataResult", "onPageDataResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo88184b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((WishCampaignDetailsActivity) this.receiver).m106834e3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo88184b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.wishcampaign.presentation.activity.WishCampaignDetailsActivity$d */
    static final class C35900d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ WishCampaignDetailsActivity f86849d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35900d(WishCampaignDetailsActivity wishCampaignDetailsActivity) {
            super(1);
            this.f86849d = wishCampaignDetailsActivity;
        }

        /* renamed from: a */
        public final void mo88185a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f86849d.m106831b3();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo88185a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.wishcampaign.presentation.activity.WishCampaignDetailsActivity$e */
    /* synthetic */ class C35901e extends C41535k implements C43075l {
        C35901e(Object obj) {
            super(1, obj, WishCampaignDetailsActivity.class, "openDepositSubmissionPage", "openDepositSubmissionPage(Lge/bog/mobilebank/wishcampaign/presentation/model/WishCampaignDepositBannerUiModel;)V", 0);
        }

        /* renamed from: b */
        public final void mo88186b(C40040e eVar) {
            C41536l.m120489i(eVar, "p0");
            ((WishCampaignDetailsActivity) this.receiver).m106837h3(eVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo88186b((C40040e) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.wishcampaign.presentation.activity.WishCampaignDetailsActivity$f */
    /* synthetic */ class C35902f extends C41535k implements C43075l {
        C35902f(Object obj) {
            super(1, obj, WishCampaignDetailsActivity.class, "updateBackgroundsSection", "updateBackgroundsSection(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo88187b(List list) {
            C41536l.m120489i(list, "p0");
            ((WishCampaignDetailsActivity) this.receiver).m106844n3(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo88187b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.wishcampaign.presentation.activity.WishCampaignDetailsActivity$g */
    /* synthetic */ class C35903g extends C41535k implements C43075l {
        C35903g(Object obj) {
            super(1, obj, WishCampaignDetailsActivity.class, "onPreLoginBackgroundResult", "onPreLoginBackgroundResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo88188b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((WishCampaignDetailsActivity) this.receiver).m106835f3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo88188b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.wishcampaign.presentation.activity.WishCampaignDetailsActivity$h */
    static final class C35904h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ WishCampaignDetailsActivity f86850d;

        /* renamed from: ge.bog.mobilebank.wishcampaign.presentation.activity.WishCampaignDetailsActivity$h$a */
        /* synthetic */ class C35905a implements C39618a, C41532h {

            /* renamed from: a */
            final /* synthetic */ C40212a f86851a;

            C35905a(C40212a aVar) {
                this.f86851a = aVar;
            }

            /* renamed from: a */
            public final void mo88190a(C40037b bVar) {
                C41536l.m120489i(bVar, "p0");
                this.f86851a.mo88206gd(bVar);
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof C39618a) || !(obj instanceof C41532h)) {
                    return false;
                }
                return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
            }

            public final C41212c getFunctionDelegate() {
                return new C41535k(1, this.f86851a, C40212a.class, "onBackgroundClicked", "onBackgroundClicked(Lge/bog/mobilebank/wishcampaign/presentation/model/WishCampaignBackgroundUiModel;)V", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35904h(WishCampaignDetailsActivity wishCampaignDetailsActivity) {
            super(0);
            this.f86850d = wishCampaignDetailsActivity;
        }

        /* renamed from: b */
        public final C39261b invoke() {
            return new C39261b(new C35905a(this.f86850d.m106830a3().mo88210ow()));
        }
    }

    /* renamed from: ge.bog.mobilebank.wishcampaign.presentation.activity.WishCampaignDetailsActivity$i */
    static final class C35906i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ WishCampaignDetailsActivity f86852d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35906i(WishCampaignDetailsActivity wishCampaignDetailsActivity) {
            super(0);
            this.f86852d = wishCampaignDetailsActivity;
        }

        /* renamed from: b */
        public final C37930a invoke() {
            return C37930a.m111476d(this.f86852d.getLayoutInflater());
        }
    }

    /* renamed from: ge.bog.mobilebank.wishcampaign.presentation.activity.WishCampaignDetailsActivity$j */
    static final class C35907j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ WishCampaignDetailsActivity f86853d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35907j(WishCampaignDetailsActivity wishCampaignDetailsActivity) {
            super(1);
            this.f86853d = wishCampaignDetailsActivity;
        }

        /* renamed from: a */
        public final void mo88194a(C40039d dVar) {
            this.f86853d.m106829Z2().f91037j.mo53597e();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo88194a((C40039d) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.wishcampaign.presentation.activity.WishCampaignDetailsActivity$k */
    static final class C35908k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ WishCampaignDetailsActivity f86854d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35908k(WishCampaignDetailsActivity wishCampaignDetailsActivity) {
            super(1);
            this.f86854d = wishCampaignDetailsActivity;
        }

        /* renamed from: a */
        public final void mo88195a(C40039d dVar) {
            C41536l.m120489i(dVar, "data");
            this.f86854d.m106829Z2().f91037j.mo53595c();
            this.f86854d.m106839j3(dVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo88195a((C40039d) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.wishcampaign.presentation.activity.WishCampaignDetailsActivity$l */
    static final class C35909l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ WishCampaignDetailsActivity f86855d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35909l(WishCampaignDetailsActivity wishCampaignDetailsActivity) {
            super(1);
            this.f86855d = wishCampaignDetailsActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f86855d.m106829Z2().f91037j.mo53596d();
            this.f86855d.m106829Z2().f91043p.setTitleText(C32343x.m95428Z(th, C32343x.m95452h0(C37118e.f89324a, new Object[0])));
        }
    }

    /* renamed from: ge.bog.mobilebank.wishcampaign.presentation.activity.WishCampaignDetailsActivity$m */
    static final class C35910m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ WishCampaignDetailsActivity f86856d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35910m(WishCampaignDetailsActivity wishCampaignDetailsActivity) {
            super(1);
            this.f86856d = wishCampaignDetailsActivity;
        }

        /* renamed from: a */
        public final void mo88197a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            WishCampaignDetailsActivity.m106836g3(this.f86856d, false);
            C12910e.m48797o(this.f86856d, C32343x.m95388F("wishes.page.change.prelogin.illustration.success.message", new Object[0]), (C12902d.C12905b) null, false, 6, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo88197a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.wishcampaign.presentation.activity.WishCampaignDetailsActivity$n */
    static final class C35911n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ WishCampaignDetailsActivity f86857d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35911n(WishCampaignDetailsActivity wishCampaignDetailsActivity) {
            super(1);
            this.f86857d = wishCampaignDetailsActivity;
        }

        /* renamed from: a */
        public final void mo88198a(C41238w wVar) {
            WishCampaignDetailsActivity.m106836g3(this.f86857d, true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo88198a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.wishcampaign.presentation.activity.WishCampaignDetailsActivity$o */
    static final class C35912o extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ WishCampaignDetailsActivity f86858d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35912o(WishCampaignDetailsActivity wishCampaignDetailsActivity) {
            super(1);
            this.f86858d = wishCampaignDetailsActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            WishCampaignDetailsActivity.m106836g3(this.f86858d, false);
            this.f86858d.mo74709H1(th);
        }
    }

    /* renamed from: ge.bog.mobilebank.wishcampaign.presentation.activity.WishCampaignDetailsActivity$p */
    static final class C35913p implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f86859a;

        C35913p(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f86859a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f86859a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f86859a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.wishcampaign.presentation.activity.WishCampaignDetailsActivity$q */
    public static final class C35914q extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f86860d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35914q(ComponentActivity componentActivity) {
            super(0);
            this.f86860d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f86860d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.wishcampaign.presentation.activity.WishCampaignDetailsActivity$r */
    public static final class C35915r extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f86861d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35915r(ComponentActivity componentActivity) {
            super(0);
            this.f86861d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f86861d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.wishcampaign.presentation.activity.WishCampaignDetailsActivity$s */
    public static final class C35916s extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f86862d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f86863e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35916s(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f86862d = aVar;
            this.f86863e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f86862d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f86863e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: T2 */
    private final void m106823T2() {
        m106829Z2().f91038k.getViewTreeObserver().addOnScrollChangedListener(new C39046b(this));
        m106829Z2().f91039l.setOnClickListener(new C39047c(this));
        m106829Z2().f91033f.setOnClickListener(new C39048d(this));
        m106829Z2().f91040m.f91066g.setOnClickListener(new C39049e(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: U2 */
    public static final void m106824U2(WishCampaignDetailsActivity wishCampaignDetailsActivity) {
        C41536l.m120489i(wishCampaignDetailsActivity, "this$0");
        wishCampaignDetailsActivity.m106830a3().mo88210ow().mo88207j2();
    }

    /* access modifiers changed from: private */
    /* renamed from: V2 */
    public static final void m106825V2(WishCampaignDetailsActivity wishCampaignDetailsActivity, View view) {
        C41536l.m120489i(wishCampaignDetailsActivity, "this$0");
        wishCampaignDetailsActivity.m106830a3().mo88210ow().mo88203E9();
    }

    /* access modifiers changed from: private */
    /* renamed from: W2 */
    public static final void m106826W2(WishCampaignDetailsActivity wishCampaignDetailsActivity, View view) {
        C41536l.m120489i(wishCampaignDetailsActivity, "this$0");
        wishCampaignDetailsActivity.m106830a3().mo88210ow().mo88204Ip();
    }

    /* access modifiers changed from: private */
    /* renamed from: X2 */
    public static final void m106827X2(WishCampaignDetailsActivity wishCampaignDetailsActivity, View view) {
        C41536l.m120489i(wishCampaignDetailsActivity, "this$0");
        wishCampaignDetailsActivity.m106830a3().mo88210ow().mo88202A8();
    }

    /* renamed from: Y2 */
    private final C39261b m106828Y2() {
        return (C39261b) this.f86848H.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: Z2 */
    public final C37930a m106829Z2() {
        return (C37930a) this.f86846F.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: a3 */
    public final WishCampaignViewModel$ViewModel m106830a3() {
        return (WishCampaignViewModel$ViewModel) this.f86847G.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: b3 */
    public final void m106831b3() {
        C38125h.m112238c(this).mo91586Y(this);
    }

    /* renamed from: c3 */
    private final void m106832c3() {
        getWindow().setStatusBarColor(0);
        C32343x.m95429Z0(this);
        ViewCompat.m3550F0(m106829Z2().mo3946b(), new C39045a(this));
        m106846p3(this, (C40036a) null, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: d3 */
    public static final WindowInsetsCompat m106833d3(WishCampaignDetailsActivity wishCampaignDetailsActivity, View view, WindowInsetsCompat windowInsetsCompat) {
        C41536l.m120489i(wishCampaignDetailsActivity, "this$0");
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
            AppBarLayout appBarLayout = wishCampaignDetailsActivity.m106829Z2().f91032e;
            C41536l.m120488h(appBarLayout, "binding.appBarLayout");
            appBarLayout.setPadding(appBarLayout.getPaddingLeft(), f.f3466b, appBarLayout.getPaddingRight(), appBarLayout.getPaddingBottom());
            LoadingView loadingView = wishCampaignDetailsActivity.m106829Z2().f91042o;
            C41536l.m120488h(loadingView, "binding.skeletonLoading");
            loadingView.setPadding(loadingView.getPaddingLeft(), f.f3466b, loadingView.getPaddingRight(), loadingView.getPaddingBottom());
            return WindowInsetsCompat.f3676b;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    /* access modifiers changed from: private */
    /* renamed from: e3 */
    public final void m106834e3(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C35907j(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C35908k(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C35909l(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: f3 */
    public final void m106835f3(C31128a aVar) {
        C31132b.m92648j(aVar, (int[]) null, new C35910m(this), 1, (Object) null);
        C31132b.m92646h(aVar, (int[]) null, new C35911n(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C35912o(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: g3 */
    public static final void m106836g3(WishCampaignDetailsActivity wishCampaignDetailsActivity, boolean z) {
        View view = wishCampaignDetailsActivity.m106829Z2().f91040m.f91064e;
        C41536l.m120488h(view, "binding.preloginBackgrou…r.backgroundsClickCatcher");
        C32343x.m95483r1(view, z, false, 2, (Object) null);
        wishCampaignDetailsActivity.m106829Z2().f91040m.f91066g.setLoading(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: h3 */
    public final void m106837h3(C40040e eVar) {
        C38125h.m112238c(this).mo91611j0(this, eVar.mo93906a());
    }

    /* renamed from: i3 */
    private final void m106838i3(C40038c cVar) {
        boolean z;
        LayerView layerView = m106829Z2().f91048u;
        C41536l.m120488h(layerView, "binding.wishCardLayer");
        if (cVar != null) {
            z = true;
        } else {
            z = false;
        }
        C32343x.m95483r1(layerView, z, false, 2, (Object) null);
        if (cVar != null) {
            AppCompatImageView appCompatImageView = m106829Z2().f91047t;
            C41536l.m120488h(appCompatImageView, "binding.wishCardBackground");
            C18368l.m62746A(appCompatImageView, cVar.mo93895a(), (C43075l) null, 2, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j3 */
    public final void m106839j3(C40039d dVar) {
        m106840k3(dVar.mo93902d());
        m106838i3(dVar.mo93900b());
        m106842l3(dVar.mo93901c());
    }

    /* renamed from: k3 */
    private final void m106840k3(C40041f fVar) {
        Image.Url url;
        m106829Z2().f91046s.f91058i.setText(fVar.mo93911b());
        CropImageView cropImageView = m106829Z2().f91045r;
        C41536l.m120488h(cropImageView, "binding.wishCampaignHeaderBackground");
        String a = fVar.mo93910a();
        if (a != null) {
            url = new Image.Url(a, (Image.Placeholder) null, (Image.Placeholder) null, (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 126, (DefaultConstructorMarker) null);
        } else {
            url = null;
        }
        C18368l.m62746A(cropImageView, url, (C43075l) null, 2, (Object) null);
    }

    /* renamed from: l1 */
    private final void m106841l1() {
        C40213b pw = m106830a3().mo88211pw();
        pw.mo88214u1().mo4819k(this, new C35913p(new C35898b(this)));
        pw.mo88212r1().mo4819k(this, new C35913p(new C35899c(this)));
        C37224b.m109963b(pw.mo88213tg(), this, new C35900d(this));
        C37224b.m109963b(pw.mo88209nd(), this, new C35901e(this));
        pw.mo88208lc().mo4819k(this, new C35913p(new C35902f(this)));
        pw.mo88205bh().mo4819k(this, new C35913p(new C35903g(this)));
    }

    /* renamed from: l3 */
    private final void m106842l3(C40040e eVar) {
        BannerCard bannerCard = m106829Z2().f91033f;
        C41536l.m120488h(bannerCard, "binding.depositBanner");
        C32343x.m95483r1(bannerCard, eVar != null, false, 2, (Object) null);
    }

    /* renamed from: m3 */
    private final void m106843m3() {
        Drawable background = m106829Z2().f91046s.mo3946b().getBackground();
        if (background != null) {
            background.setAlpha(229);
        }
        m106829Z2().f91040m.f91065f.setItemAnimator((RecyclerView.C1742m) null);
        m106829Z2().f91049v.setTitle(C32343x.m95388F("wishes.page.card.title", new Object[0]));
        m106829Z2().f91050w.setText(C32343x.m95388F("wishes.page.card.name", new Object[0]));
        m106829Z2().f91051x.setText(C32343x.m95388F("wishes.page.card.class", new Object[0]));
        m106829Z2().f91039l.setButtonText(C32343x.m95388F("wishes.page.card.order.button", new Object[0]));
        m106829Z2().f91033f.setInfoText(C32343x.m95388F("wishes.page.deposit.banner.text", new Object[0]));
        m106829Z2().f91033f.setShowMoreText(C32343x.m95388F("wishes.page.deposit.banner.button", new Object[0]));
        m106829Z2().f91033f.setBannerImage(new Image.Resource(C37115b.deposit_illustration, (Boolean) null, 2, (DefaultConstructorMarker) null));
        C37933d dVar = m106829Z2().f91040m;
        dVar.f91070k.setTitle(C32343x.m95388F("wishes.page.prelogin.illustrations.title", new Object[0]));
        dVar.f91069j.setText(C32343x.m95388F("wishes.page.prelogin.illustrations.description", new Object[0]));
        dVar.f91066g.setButtonText(C32343x.m95388F("wishes.page.prelogin.illustrations.button", new Object[0]));
        dVar.f91065f.setAdapter(m106828Y2());
    }

    /* access modifiers changed from: private */
    /* renamed from: n3 */
    public final void m106844n3(List list) {
        LayerView c = m106829Z2().f91040m.mo3946b();
        C41536l.m120488h(c, "binding.preloginBackgroundsLayer.root");
        C32343x.m95483r1(c, !list.isEmpty(), false, 2, (Object) null);
        m106828Y2().mo6029i(list);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* renamed from: o3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m106845o3(y91.C40036a r7) {
        /*
            r6 = this;
            p91.a r0 = r6.m106829Z2()
            androidx.core.widget.NestedScrollView r0 = r0.f91038k
            r1 = -1
            boolean r0 = r0.canScrollVertically(r1)
            p91.a r1 = r6.m106829Z2()
            ge.bog.designsystem.components.toolbar.ToolbarView r1 = r1.f91044q
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x0026
            boolean r4 = g91.C32343x.m95476p0(r6)
            y91.a r5 = y91.C40036a.DARK
            if (r7 != r5) goto L_0x001f
            r5 = r3
            goto L_0x0020
        L_0x001f:
            r5 = r2
        L_0x0020:
            r4 = r4 ^ r5
            if (r4 == 0) goto L_0x0024
            goto L_0x0026
        L_0x0024:
            r4 = r2
            goto L_0x0027
        L_0x0026:
            r4 = r3
        L_0x0027:
            r1.mo37106h0(r0, r4)
            if (r0 != 0) goto L_0x0037
            y91.a r0 = y91.C40036a.LOADING
            if (r7 != r0) goto L_0x0031
            goto L_0x0037
        L_0x0031:
            y91.a r0 = y91.C40036a.DARK
            if (r7 == r0) goto L_0x003b
            r2 = r3
            goto L_0x003b
        L_0x0037:
            boolean r2 = g91.C32343x.m95476p0(r6)
        L_0x003b:
            g91.C32343x.m95444e1(r6, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.wishcampaign.presentation.activity.WishCampaignDetailsActivity.m106845o3(y91.a):void");
    }

    /* renamed from: p3 */
    static /* synthetic */ void m106846p3(WishCampaignDetailsActivity wishCampaignDetailsActivity, C40036a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = C40036a.LOADING;
        }
        wishCampaignDetailsActivity.m106845o3(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        m106832c3();
        super.mo70996D2(bundle, m106829Z2());
        m106843m3();
        m106841l1();
        m106823T2();
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return C32343x.m95388F("wishes.page.header", new Object[0]);
    }
}
