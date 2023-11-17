package p341ge.bog.mobilebank.giftcards.presentation.success;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import g91.C32319m;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import java.math.BigDecimal;
import java.util.Map;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lj0.C26039b;
import lj0.C26041d;
import m41.C37224b;
import nj0.C26516a;
import nj0.C26517b;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import p341ge.bog.designsystem.components.pagestate.PageState;
import p341ge.bog.mobilebank.giftcards.presentation.success.C24374a;
import q31.C38122f;
import q31.C38125h;
import th0.C28418p;
import ue1.C43064a;
import ue1.C43075l;
import vh0.C29075a;
import vh0.C29076b;
import vh0.C29078d;
import xh0.C29790g;

/* renamed from: ge.bog.mobilebank.giftcards.presentation.success.GiftCardsSuccessFragment */
public final class GiftCardsSuccessFragment extends C24377b {

    /* renamed from: i */
    public static final C24363a f62931i = new C24363a((DefaultConstructorMarker) null);

    /* renamed from: g */
    private C28418p f62932g;

    /* renamed from: h */
    private final C41217g f62933h;

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.success.GiftCardsSuccessFragment$a */
    public static final class C24363a {
        private C24363a() {
        }

        public /* synthetic */ C24363a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.success.GiftCardsSuccessFragment$b */
    public /* synthetic */ class C24364b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f62934a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                xh0.g[] r0 = xh0.C29790g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                xh0.g r1 = xh0.C29790g.VALID_DAYS     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                xh0.g r1 = xh0.C29790g.EXP_DATE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                xh0.g r1 = xh0.C29790g.UNLIMITED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f62934a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.giftcards.presentation.success.GiftCardsSuccessFragment.C24364b.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.success.GiftCardsSuccessFragment$c */
    static final class C24365c implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f62935a;

        C24365c(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f62935a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f62935a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f62935a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.success.GiftCardsSuccessFragment$d */
    static final class C24366d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GiftCardsSuccessFragment f62936d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24366d(GiftCardsSuccessFragment giftCardsSuccessFragment) {
            super(0);
            this.f62936d = giftCardsSuccessFragment;
        }

        public final void invoke() {
            this.f62936d.m78360r1().mo62085l();
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.success.GiftCardsSuccessFragment$e */
    static final class C24367e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28418p f62937d;

        /* renamed from: e */
        final /* synthetic */ GiftCardsSuccessFragment f62938e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24367e(C28418p pVar, GiftCardsSuccessFragment giftCardsSuccessFragment) {
            super(1);
            this.f62937d = pVar;
            this.f62938e = giftCardsSuccessFragment;
        }

        /* renamed from: a */
        public final void mo62079a(C29078d dVar) {
            boolean z;
            String str;
            String str2;
            long j;
            if (dVar.mo68945j() == C29076b.PURCHASE) {
                z = true;
            } else {
                z = false;
            }
            AppCompatImageView appCompatImageView = this.f62937d.f72166j;
            C41536l.m120488h(appCompatImageView, "giftCardStoreImageView");
            C29075a g = dVar.mo68941g();
            String str3 = null;
            if (g != null) {
                str = g.mo68931d();
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            C26041d.m81680a(appCompatImageView, new Image.Url(str, (Image.Placeholder) null, (Image.Placeholder) null, (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 126, (DefaultConstructorMarker) null), 50);
            this.f62937d.f72165i.setText(dVar.mo68954s());
            TwoLineTextItem twoLineTextItem = this.f62937d.f72164h;
            if (z) {
                String d = dVar.mo68937d();
                if (d != null) {
                    str3 = C32343x.m95406O(d, "GEL");
                }
            } else {
                BigDecimal m = dVar.mo68948m();
                if (m != null) {
                    str3 = C32343x.m95408P(m, "GEL");
                }
            }
            twoLineTextItem.setText(str3);
            this.f62937d.f72167k.setText(dVar.mo68949n());
            TwoLineTextItem twoLineTextItem2 = this.f62938e.m78358p1().f72168l;
            if (z) {
                GiftCardsSuccessFragment giftCardsSuccessFragment = this.f62938e;
                C41536l.m120488h(dVar, "purchaseModel");
                str2 = giftCardsSuccessFragment.m78359q1(dVar);
            } else {
                Long e = dVar.mo68938e();
                if (e != null) {
                    j = e.longValue();
                } else {
                    j = 0;
                }
                str2 = C32319m.m95295b(j);
            }
            twoLineTextItem2.setText(str2);
            GiftCardsSuccessFragment giftCardsSuccessFragment2 = this.f62938e;
            C41536l.m120488h(dVar, "purchaseModel");
            giftCardsSuccessFragment2.m78361s1(dVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62079a((C29078d) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.success.GiftCardsSuccessFragment$f */
    /* synthetic */ class C24368f extends C41535k implements C43075l {
        C24368f(Object obj) {
            super(1, obj, GiftCardsSuccessFragment.class, "handleSuccessEvents", "handleSuccessEvents(Lge/bog/mobilebank/giftcards/presentation/success/GiftCardsSuccessViewModel$SuccessEvent;)V", 0);
        }

        /* renamed from: b */
        public final void mo62080b(C24374a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((GiftCardsSuccessFragment) this.receiver).m78362t1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62080b((C24374a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.success.GiftCardsSuccessFragment$g */
    public static final class C24369g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f62939d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24369g(Fragment fragment) {
            super(0);
            this.f62939d = fragment;
        }

        public final Fragment invoke() {
            return this.f62939d;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.success.GiftCardsSuccessFragment$h */
    public static final class C24370h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f62940d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24370h(C43064a aVar) {
            super(0);
            this.f62940d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f62940d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.success.GiftCardsSuccessFragment$i */
    public static final class C24371i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f62941d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24371i(C41217g gVar) {
            super(0);
            this.f62941d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f62941d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.success.GiftCardsSuccessFragment$j */
    public static final class C24372j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f62942d;

        /* renamed from: e */
        final /* synthetic */ C41217g f62943e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24372j(C43064a aVar, C41217g gVar) {
            super(0);
            this.f62942d = aVar;
            this.f62943e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f62942d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f62943e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.success.GiftCardsSuccessFragment$k */
    public static final class C24373k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f62944d;

        /* renamed from: e */
        final /* synthetic */ C41217g f62945e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24373k(Fragment fragment, C41217g gVar) {
            super(0);
            this.f62944d = fragment;
            this.f62945e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f62945e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f62944d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public GiftCardsSuccessFragment() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C24370h(new C24369g(this)));
        this.f62933h = C1514j0.m5374c(this, C41520a0.m120436b(GiftCardsSuccessViewModel$ViewModel.class), new C24371i(a), new C24372j((C43064a) null, a), new C24373k(this, a));
    }

    /* renamed from: c3 */
    private final void m78350c3() {
        PackageManager packageManager;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(C32343x.m95388F("giftcard.application.summary.page.checkbox.link.url", new Object[0])));
        C1505h activity = getActivity();
        if (activity != null && (packageManager = activity.getPackageManager()) != null && intent.resolveActivity(packageManager) != null) {
            startActivity(intent);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p1 */
    public final C28418p m78358p1() {
        C28418p pVar = this.f62932g;
        C41536l.m120486f(pVar);
        return pVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: q1 */
    public final String m78359q1(C29078d dVar) {
        int i;
        C29790g i2 = dVar.mo68944i();
        if (i2 == null) {
            i = -1;
        } else {
            i = C24364b.f62934a[i2.ordinal()];
        }
        if (i == 1) {
            String c = dVar.mo68936c();
            String F = C32343x.m95388F("giftcard.application.summary.page.validity.day", new Object[0]);
            return c + " " + F;
        } else if (i == 2) {
            return C32319m.m95295b(dVar.mo68940f());
        } else {
            if (i != 3) {
                return "";
            }
            return C32343x.m95388F("giftcard.application.summary.page.validity.unlimited", new Object[0]);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r1 */
    public final GiftCardsSuccessViewModel$ViewModel m78360r1() {
        return (GiftCardsSuccessViewModel$ViewModel) this.f62933h.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public final void m78361s1(C29078d dVar) {
        String str;
        String str2;
        C28418p p1 = m78358p1();
        PageState pageState = p1.f72172p;
        if (dVar.mo68957u()) {
            str = C32343x.m95388F("giftcard.application.result.pending", new Object[0]);
        } else {
            str = C32343x.m95388F("giftcard.application.result.success", new Object[0]);
        }
        pageState.setTitleText(str);
        TextView textView = p1.f72171o;
        if (dVar.mo68957u()) {
            String b = C32319m.m95295b(dVar.mo68940f());
            C41536l.m120488h(b, "formatDate(purchaseModel.chosenDate)");
            str2 = C32343x.m95388F("giftcard.application.result.pending.description", b);
        } else {
            str2 = C32343x.m95388F("giftcard.application.result.success.description", new Object[0]);
        }
        textView.setText(str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: t1 */
    public final void m78362t1(C24374a aVar) {
        if (C41536l.m120484d(aVar, C24374a.C24376b.f62951a)) {
            m78350c3();
        } else if (C41536l.m120484d(aVar, C24374a.C24375a.f62950a)) {
            Context requireContext = requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            C38122f c = C38125h.m112238c(requireContext);
            Context requireContext2 = requireContext();
            C41536l.m120488h(requireContext2, "requireContext()");
            C38122f.C38123a.m112215k(c, requireContext2, (String) null, (Bundle) null, 6, (Object) null);
        }
    }

    /* renamed from: u1 */
    private final void m78363u1() {
        C28418p p1 = m78358p1();
        p1.f72175s.setOnClickListener(new C26516a(this));
        p1.f72177u.setOnClickListener(new C26517b(this));
        requireActivity().getOnBackPressedDispatcher().mo341b(new C26039b(new C24366d(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: v1 */
    public static final void m78364v1(GiftCardsSuccessFragment giftCardsSuccessFragment, View view) {
        C41536l.m120489i(giftCardsSuccessFragment, "this$0");
        giftCardsSuccessFragment.m78360r1().mo62084gw();
    }

    /* access modifiers changed from: private */
    /* renamed from: x1 */
    public static final void m78365x1(GiftCardsSuccessFragment giftCardsSuccessFragment, View view) {
        C41536l.m120489i(giftCardsSuccessFragment, "this$0");
        giftCardsSuccessFragment.m78360r1().mo62083fw();
    }

    /* renamed from: y1 */
    private final void m78366y1() {
        m78360r1().mo62081dw().mo4819k(getViewLifecycleOwner(), new C24365c(new C24367e(m78358p1(), this)));
        LiveData ew = m78360r1().mo62082ew();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(ew, viewLifecycleOwner, new C24368f(this));
    }

    /* renamed from: z1 */
    private final void m78367z1() {
        C28418p p1 = m78358p1();
        p1.f72175s.setButtonText(C32343x.m95388F("giftcard.application.result.redirect.button", new Object[0]));
        p1.f72163g.setTitle(C32343x.m95388F("giftcard.application.summary.page.details", new Object[0]));
        p1.f72167k.setTitle(C32343x.m95388F("giftcard.application.summary.page.company", new Object[0]));
        p1.f72165i.setTitle(C32343x.m95388F("giftcard.application.summary.page.recipient.number", new Object[0]));
        p1.f72164h.setTitle(C32343x.m95388F("giftcard.application.summary.page.balance", new Object[0]));
        p1.f72168l.setTitle(C32343x.m95388F("giftcard.application.summary.page.validity", new Object[0]));
        p1.f72178v.setText(C32343x.m95388F("giftcard.giver.details.conditions", new Object[0]));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f62932g = C28418p.m87194d(layoutInflater, viewGroup, false);
        ScrollView c = m78358p1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f62932g = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m78367z1();
        m78363u1();
        m78366y1();
    }
}
