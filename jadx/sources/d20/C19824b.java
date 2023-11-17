package d20;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import g20.C20639w;
import he1.C41238w;
import i20.C25104d;
import i20.C25105e;
import iu0.C36546y;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import k30.C25627a;
import k30.C25628b;
import k81.C36892b0;
import k81.C36893c;
import k81.C36898e0;
import k81.C36899f;
import k81.C36905h0;
import k81.C36911k0;
import k81.C36912l;
import k81.C36915o;
import k81.C36916p;
import k81.C36917q;
import k81.C36921t;
import k81.C36924w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.becomesolo.presentation.BecomeSoloDescriptionActivity;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo;
import p341ge.bog.mobilebank.cleanarch.offersandapplications.presentation.activity.OffersAndApplicationsActivity;
import p341ge.bog.mobilebank.cleanarch.presentation.productconfirmation.activity.ProductConfirmationActivity;
import p341ge.bog.mobilebank.cleanarch.presentation.productconfirmation.model.PendingProductConfirmationData;
import p341ge.bog.mobilebank.p975ui.activities.MainActivity;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p366bk.C10324m;
import p380ck.C10464h;
import p813kw.C25783a;
import p867qq.C27852a;
import q31.C38125h;
import ue1.C43064a;
import ue1.C43075l;
import x00.C29615f;

/* renamed from: d20.b */
public final class C19824b extends C29615f {

    /* renamed from: A */
    private static final int f54205A = C19825a.OFFER.ordinal();

    /* renamed from: B */
    private static final int f54206B = C19825a.CREDIT_INFO.ordinal();

    /* renamed from: C */
    private static final int f54207C = C19825a.DEPOSIT_OFFER.ordinal();

    /* renamed from: D */
    private static final int f54208D = C19825a.REMITTANCE.ordinal();

    /* renamed from: E */
    private static final int f54209E = C19825a.BECOME_SOLO.ordinal();

    /* renamed from: F */
    private static final int f54210F = C19825a.REFERALS.ordinal();

    /* renamed from: G */
    private static final int f54211G = C19825a.TRANSFER_LOTTERY.ordinal();

    /* renamed from: s */
    public static final C19827c f54212s = new C19827c((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: t */
    public static final int f54213t = C19825a.NBO.ordinal();

    /* renamed from: u */
    private static final int f54214u = C19825a.SOLO_CARD.ordinal();

    /* renamed from: v */
    private static final int f54215v = C19825a.STUDENT_CARD.ordinal();

    /* renamed from: w */
    private static final int f54216w = C19825a.DIGITAL_CARD.ordinal();

    /* renamed from: x */
    private static final int f54217x = C19825a.CONSUMER_LOAN.ordinal();

    /* renamed from: y */
    private static final int f54218y = C19825a.PENDING_PRODUCT.ordinal();

    /* renamed from: z */
    private static final int f54219z = C19825a.PLUS_CAMPAIGN.ordinal();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final PreferencesApiManager f54220f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final MainActivity f54221g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C43064a f54222h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C43075l f54223i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C43075l f54224j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final HashMap f54225k = new HashMap();

    /* renamed from: l */
    private List f54226l;

    /* renamed from: m */
    private int f54227m;

    /* renamed from: n */
    private List f54228n;

    /* renamed from: o */
    private int f54229o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public List f54230p;

    /* renamed from: q */
    private int f54231q;

    /* renamed from: r */
    private C19828d f54232r;

    /* renamed from: d20.b$a */
    private enum C19825a {
        NBO,
        SOLO_CARD,
        STUDENT_CARD,
        CONSUMER_LOAN,
        REMITTANCE,
        PENDING_PRODUCT,
        PLUS_CAMPAIGN,
        OFFER,
        CREDIT_INFO,
        DEPOSIT_OFFER,
        DIGITAL_CARD,
        BECOME_SOLO,
        REFERALS,
        TRANSFER_LOTTERY
    }

    /* renamed from: d20.b$b */
    public final class C19826b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C36917q f54248d;

        /* renamed from: e */
        private final ViewGroup f54249e;

        /* renamed from: f */
        final /* synthetic */ C19824b f54250f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19826b(C19824b bVar, C36917q qVar, ViewGroup viewGroup) {
            super(qVar.mo89824a(viewGroup.getContext(), viewGroup));
            C41536l.m120489i(qVar, "offerBanner");
            C41536l.m120489i(viewGroup, "parent");
            this.f54250f = bVar;
            this.f54248d = qVar;
            this.f54249e = viewGroup;
        }

        /* renamed from: h */
        public final C36917q mo48136h() {
            return this.f54248d;
        }
    }

    /* renamed from: d20.b$c */
    public static final class C19827c {
        private C19827c() {
        }

        public /* synthetic */ C19827c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo48137a() {
            return C19824b.f54213t;
        }
    }

    /* renamed from: d20.b$d */
    public interface C19828d {
    }

    /* renamed from: d20.b$e */
    static final class C19829e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19824b f54251d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19829e(C19824b bVar) {
            super(1);
            this.f54251d = bVar;
        }

        /* renamed from: a */
        public final void mo48138a(C25104d dVar) {
            C41536l.m120489i(dVar, "banner");
            this.f54251d.f54223i.invoke(dVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo48138a((C25104d) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: d20.b$f */
    static final class C19830f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19824b f54252d;

        /* renamed from: e */
        final /* synthetic */ int f54253e;

        /* renamed from: f */
        final /* synthetic */ int f54254f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19830f(C19824b bVar, int i, int i2) {
            super(1);
            this.f54252d = bVar;
            this.f54253e = i;
            this.f54254f = i2;
        }

        /* renamed from: a */
        public final void mo48139a(C25104d dVar) {
            C41536l.m120489i(dVar, "banner");
            String j = dVar.mo63571j();
            if (j != null) {
                this.f54252d.f54224j.invoke(j);
            }
            int itemCount = this.f54252d.getItemCount();
            List I = this.f54252d.f54230p;
            if (I != null) {
                C25104d dVar2 = (C25104d) I.remove(this.f54253e);
            }
            C19824b bVar = this.f54252d;
            C19827c cVar = C19824b.f54212s;
            boolean z = true;
            bVar.mo69521w(cVar.mo48137a(), this.f54253e, 1);
            List I2 = this.f54252d.f54230p;
            if (I2 == null || !I2.isEmpty()) {
                z = false;
            }
            if (z) {
                this.f54252d.mo69517s(cVar.mo48137a());
                this.f54252d.f54225k.remove(Integer.valueOf(this.f54254f));
                itemCount--;
            }
            if (itemCount == 0) {
                this.f54252d.f54222h.invoke();
            }
            this.f54252d.notifyDataSetChanged();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo48139a((C25104d) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: d20.b$g */
    static final class C19831g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19824b f54255d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19831g(C19824b bVar) {
            super(1);
            this.f54255d = bVar;
        }

        /* renamed from: a */
        public final void mo48140a(PendingProductConfirmationData pendingProductConfirmationData) {
            if (pendingProductConfirmationData != null) {
                ProductConfirmationActivity.f59088J.mo55144a(this.f54255d.f54221g, pendingProductConfirmationData);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo48140a((PendingProductConfirmationData) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: d20.b$h */
    static final class C19832h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19824b f54256d;

        /* renamed from: e */
        final /* synthetic */ String f54257e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19832h(C19824b bVar, String str) {
            super(1);
            this.f54256d = bVar;
            this.f54257e = str;
        }

        /* renamed from: a */
        public final void mo48141a(PendingProductConfirmationData pendingProductConfirmationData) {
            if (pendingProductConfirmationData != null) {
                C19824b bVar = this.f54256d;
                bVar.f54220f.hideOffer(pendingProductConfirmationData.mo55157e(), this.f54257e);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo48141a((PendingProductConfirmationData) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: d20.b$i */
    static final class C19833i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C19824b f54258d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19833i(C19824b bVar) {
            super(0);
            this.f54258d = bVar;
        }

        public final void invoke() {
            BecomeSoloDescriptionActivity.f56100I.mo49590a(this.f54258d.f54221g, BecomeSoloDescriptionActivity.C20837a.BANNER_CLICK);
            C36546y.m108282F().mo27152s("offers", "HOME_BECOME_SOLO_BANNER", "open_offer_banner_from_home");
            C27852a.m86058a("becone_solo_banner_redirect_to_terms_page;");
        }
    }

    /* renamed from: d20.b$j */
    static final class C19834j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C19824b f54259d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19834j(C19824b bVar) {
            super(0);
            this.f54259d = bVar;
        }

        public final void invoke() {
            this.f54259d.f54220f.setBecomeSoloBannerShow(C36546y.m108285N().mo89313K().getLoginInfo().mo90307d());
            C27852a.m86058a("become_solo_banner_closed;");
        }
    }

    /* renamed from: d20.b$k */
    static final class C19835k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C19824b f54260d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19835k(C19824b bVar) {
            super(0);
            this.f54260d = bVar;
        }

        public final void invoke() {
            this.f54260d.f54221g.startActivity(new Intent(this.f54260d.f54221g, OffersAndApplicationsActivity.class));
        }
    }

    /* renamed from: d20.b$l */
    static final class C19836l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C19824b f54261d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19836l(C19824b bVar) {
            super(0);
            this.f54261d = bVar;
        }

        public final void invoke() {
            this.f54261d.f54220f.setCreditInfoBannerShown(C36546y.m108285N().mo89313K().getLoginInfo().mo90307d());
        }
    }

    /* renamed from: d20.b$m */
    static final class C19837m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C19824b f54262d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19837m(C19824b bVar) {
            super(0);
            this.f54262d = bVar;
        }

        public final void invoke() {
            C38125h.m112238c(this.f54262d.f54221g).mo91597c0(this.f54262d.f54221g);
            C36546y.m108282F().mo27152s("offers", "HOME_DIGITAL_CARD_BANNER", "open_offer_banner_from_home");
        }
    }

    /* renamed from: d20.b$n */
    static final class C19838n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C19824b f54263d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19838n(C19824b bVar) {
            super(0);
            this.f54263d = bVar;
        }

        public final void invoke() {
            this.f54263d.f54220f.setDigitalCardBannerShown(C36546y.m108285N().mo89313K().getLoginInfo().mo90307d());
        }
    }

    /* renamed from: d20.b$o */
    public static final class C19839o implements Comparator {
        public final int compare(Object obj, Object obj2) {
            return C41506d.m120406e(((OfferInfo) obj).getOrderNo(), ((OfferInfo) obj2).getOrderNo());
        }
    }

    /* renamed from: d20.b$p */
    static final class C19840p extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C19824b f54264d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19840p(C19824b bVar) {
            super(0);
            this.f54264d = bVar;
        }

        public final void invoke() {
            C38125h.m112238c(this.f54264d.f54221g).mo91597c0(this.f54264d.f54221g);
        }
    }

    /* renamed from: d20.b$q */
    static final class C19841q extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C19824b f54265d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19841q(C19824b bVar) {
            super(0);
            this.f54265d = bVar;
        }

        public final void invoke() {
            C38125h.m112238c(this.f54265d.f54221g).mo91572R(this.f54265d.f54221g, "STUDENT");
            C36546y.m108282F().mo27152s("applications", "", "open_student_card_banner_from_home");
        }
    }

    /* renamed from: d20.b$r */
    static final class C19842r extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C19824b f54266d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19842r(C19824b bVar) {
            super(0);
            this.f54266d = bVar;
        }

        public final void invoke() {
            this.f54266d.f54220f.setStudentCardBannerShown(C36546y.m108285N().mo89313K().getLoginInfo().mo90307d());
            C36546y.m108282F().mo27152s("applications", "", "close_offer_banner_on_home");
        }
    }

    public C19824b(PreferencesApiManager preferencesApiManager, MainActivity mainActivity, C43064a aVar, C43075l lVar, C43075l lVar2) {
        C41536l.m120489i(preferencesApiManager, "mPreferencesApiManager");
        C41536l.m120489i(mainActivity, "activity");
        C41536l.m120489i(aVar, "onRemoveAll");
        C41536l.m120489i(lVar, "onNboBannerClick");
        C41536l.m120489i(lVar2, "onNboBannerRemove");
        this.f54220f = preferencesApiManager;
        this.f54221g = mainActivity;
        this.f54222h = aVar;
        this.f54223i = lVar;
        this.f54224j = lVar2;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0075  */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m65612O(d20.C19824b r5, int r6, int r7) {
        /*
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.C41536l.m120489i(r5, r0)
            int r0 = r5.getItemCount()
            int r6 = r5.getItemViewType(r6)
            int r1 = f54205A
            r2 = 0
            r3 = 1
            if (r6 != r1) goto L_0x003a
            java.util.List r4 = r5.f54226l
            if (r4 == 0) goto L_0x001d
            java.lang.Object r4 = r4.remove(r7)
            ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo r4 = (p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo) r4
        L_0x001d:
            r5.mo69521w(r1, r7, r3)
            java.util.List r7 = r5.f54226l
            if (r7 == 0) goto L_0x002b
            boolean r7 = r7.isEmpty()
            if (r7 != r3) goto L_0x002b
            r2 = r3
        L_0x002b:
            if (r2 == 0) goto L_0x0073
            r5.mo69517s(r1)
            java.util.HashMap r7 = r5.f54225k
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7.remove(r6)
            goto L_0x0071
        L_0x003a:
            int r1 = f54218y
            if (r6 != r1) goto L_0x0065
            java.util.List r4 = r5.f54228n
            if (r4 == 0) goto L_0x0048
            java.lang.Object r4 = r4.remove(r7)
            kw.a r4 = (p813kw.C25783a) r4
        L_0x0048:
            r5.mo69521w(r1, r7, r3)
            java.util.List r7 = r5.f54228n
            if (r7 == 0) goto L_0x0056
            boolean r7 = r7.isEmpty()
            if (r7 != r3) goto L_0x0056
            r2 = r3
        L_0x0056:
            if (r2 == 0) goto L_0x0073
            r5.mo69517s(r1)
            java.util.HashMap r7 = r5.f54225k
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7.remove(r6)
            goto L_0x0071
        L_0x0065:
            r5.mo69517s(r6)
            java.util.HashMap r7 = r5.f54225k
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7.remove(r6)
        L_0x0071:
            int r0 = r0 + -1
        L_0x0073:
            if (r0 != 0) goto L_0x007a
            ue1.a r6 = r5.f54222h
            r6.invoke()
        L_0x007a:
            r5.notifyDataSetChanged()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d20.C19824b.m65612O(d20.b, int, int):void");
    }

    /* renamed from: P */
    private final boolean m65613P() {
        if (this.f54220f.wasBecomeSoloBannerShown(C36546y.m108285N().mo89313K().getLoginInfo().mo90307d())) {
            return false;
        }
        C36893c cVar = new C36893c();
        cVar.mo89828h(new C19833i(this));
        cVar.mo89829i(new C19834j(this));
        HashMap hashMap = this.f54225k;
        int i = f54209E;
        hashMap.put(Integer.valueOf(i), cVar);
        C29615f.m89897A(this, i, 1, false, 4, (Object) null);
        return true;
    }

    /* renamed from: Q */
    private final void m65614Q() {
        C36899f fVar = new C36899f();
        fVar.mo89835f(new C19835k(this));
        fVar.mo89836g(new C19836l(this));
        HashMap hashMap = this.f54225k;
        int i = f54206B;
        hashMap.put(Integer.valueOf(i), fVar);
        C29615f.m89897A(this, i, 1, false, 4, (Object) null);
    }

    /* renamed from: R */
    private final boolean m65615R(C25628b bVar) {
        if (this.f54220f.isOfferHidden(bVar, C36546y.m108285N().mo89315M())) {
            return false;
        }
        HashMap hashMap = this.f54225k;
        int i = f54207C;
        hashMap.put(Integer.valueOf(i), new C36912l(bVar));
        C29615f.m89897A(this, i, 1, false, 4, (Object) null);
        return true;
    }

    /* renamed from: S */
    private final boolean m65616S() {
        if (this.f54220f.wasDigitalCardBannerShown(C36546y.m108285N().mo89313K().getLoginInfo().mo90307d())) {
            return false;
        }
        C36915o oVar = new C36915o();
        oVar.mo89857h(new C19837m(this));
        oVar.mo89858i(new C19838n(this));
        HashMap hashMap = this.f54225k;
        int i = f54216w;
        hashMap.put(Integer.valueOf(i), oVar);
        C29615f.m89897A(this, i, 1, false, 4, (Object) null);
        return true;
    }

    /* renamed from: V */
    private final boolean m65617V(List list) {
        String M = C36546y.m108285N().mo89315M();
        List t0 = C41358y.m120030t0(new ArrayList(list), new C19839o());
        ArrayList arrayList = new ArrayList();
        for (Object next : t0) {
            if (!this.f54220f.isOfferHidden((OfferInfo) next, M)) {
                arrayList.add(next);
            }
        }
        List B0 = C41358y.m119991B0(arrayList);
        this.f54226l = B0;
        if (B0 == null) {
            return false;
        }
        if (!B0.isEmpty()) {
            HashMap hashMap = this.f54225k;
            int i = f54205A;
            hashMap.put(Integer.valueOf(i), new C36892b0());
            C29615f.m89897A(this, i, B0.size(), false, 4, (Object) null);
            this.f54227m = B0.size();
        }
        return !B0.isEmpty();
    }

    /* renamed from: Z */
    private final void m65618Z() {
        boolean z;
        HashMap hashMap = this.f54225k;
        int i = f54208D;
        Integer valueOf = Integer.valueOf(i);
        if (this.f54220f.getThemeType() == 0) {
            z = true;
        } else {
            z = false;
        }
        hashMap.put(valueOf, new C36924w(z));
        C29615f.m89897A(this, i, 1, false, 4, (Object) null);
    }

    /* renamed from: a0 */
    private final boolean m65619a0(C25628b bVar) {
        if (this.f54220f.isOfferHidden(bVar, C36546y.m108285N().mo89315M())) {
            return false;
        }
        C36898e0 e0Var = new C36898e0(bVar);
        e0Var.mo89834h(new C19840p(this));
        HashMap hashMap = this.f54225k;
        int i = f54214u;
        hashMap.put(Integer.valueOf(i), e0Var);
        C29615f.m89897A(this, i, 1, false, 4, (Object) null);
        return true;
    }

    /* renamed from: c0 */
    private final boolean m65620c0() {
        if (this.f54220f.isOfferHidden("TRANSFERS_BANNER_HIDDEN", C36546y.m108285N().mo89315M())) {
            return false;
        }
        HashMap hashMap = this.f54225k;
        int i = f54211G;
        hashMap.put(Integer.valueOf(i), new C36911k0());
        C29615f.m89897A(this, i, 1, false, 4, (Object) null);
        return true;
    }

    /* renamed from: N */
    public final void mo48127N(int i) {
        List list;
        OfferInfo offerInfo;
        C25104d dVar;
        String n;
        int itemViewType = getItemViewType(i);
        if (itemViewType == f54213t) {
            List list2 = this.f54230p;
            String str = null;
            if (list2 != null) {
                dVar = (C25104d) list2.get(mo69515m(i));
            } else {
                dVar = null;
            }
            if (dVar != null) {
                str = dVar.mo63580s();
            }
            if (!(str == null || dVar.mo63581t() == null)) {
                C36546y.m108282F().mo27155v(dVar.mo63580s(), (String) null, (String) null, (Long) null, new ArrayList(dVar.mo63581t()));
            }
            if (dVar != null && (n = dVar.mo63575n()) != null) {
                C36546y.m108282F().mo27157x(n, C10464h.C10465a.FACEBOOK);
            }
        } else if (itemViewType == f54205A && (list = this.f54226l) != null && (offerInfo = (OfferInfo) C41358y.m120010Z(list, i)) != null && offerInfo.getOfferScheme() == OfferInfo.C20999b.BNPL) {
            C36546y.m108282F().mo27152s("event_name", "BNPL", "banner_impression");
            C36546y.m108282F().mo27137H("BNPL_home_banners_impression", "", "", (Bundle) null, C10464h.C10465a.FACEBOOK);
        }
    }

    /* renamed from: T */
    public final boolean mo48128T(C25105e eVar) {
        C41536l.m120489i(eVar, "bannerDataList");
        List a = eVar.mo63589a();
        if (a != null) {
            this.f54230p = C41358y.m119991B0(a);
        }
        List list = this.f54230p;
        if (list == null) {
            return false;
        }
        HashMap hashMap = this.f54225k;
        int i = f54213t;
        hashMap.put(Integer.valueOf(i), new C36916p());
        this.f54231q = list.size();
        C29615f.m89897A(this, i, list.size(), false, 4, (Object) null);
        notifyDataSetChanged();
        return !list.isEmpty();
    }

    /* renamed from: U */
    public final void mo48129U(C19828d dVar) {
        C41536l.m120489i(dVar, "listener");
        this.f54232r = dVar;
    }

    /* renamed from: W */
    public final boolean mo48130W(C25627a aVar) {
        C41536l.m120489i(aVar, "offerInfoModel");
        if (!aVar.mo64159b()) {
            HashMap hashMap = this.f54225k;
            int i = f54206B;
            hashMap.remove(Integer.valueOf(i));
            mo69517s(i);
            HashMap hashMap2 = this.f54225k;
            int i2 = f54205A;
            hashMap2.remove(Integer.valueOf(i2));
            mo69517s(i2);
            return false;
        } else if (aVar.mo64160c()) {
            boolean V = m65617V(aVar.mo64158a());
            HashMap hashMap3 = this.f54225k;
            int i3 = f54206B;
            hashMap3.remove(Integer.valueOf(i3));
            mo69517s(i3);
            return V;
        } else {
            HashMap hashMap4 = this.f54225k;
            int i4 = f54205A;
            hashMap4.remove(Integer.valueOf(i4));
            mo69517s(i4);
            if (this.f54220f.wasCreditInfoBannerShown(C36546y.m108285N().mo89313K().getLoginInfo().mo90307d())) {
                return false;
            }
            m65614Q();
            return true;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: k30.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: k30.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: k30.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: k30.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: X */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo48131X(java.util.List r10) {
        /*
            r9 = this;
            java.lang.String r0 = "data"
            kotlin.jvm.internal.C41536l.m120489i(r10, r0)
            java.util.Iterator r0 = r10.iterator()
        L_0x0009:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x001e
            java.lang.Object r1 = r0.next()
            r3 = r1
            k30.b r3 = (k30.C25628b) r3
            boolean r3 = r3.mo64170f()
            if (r3 == 0) goto L_0x0009
            goto L_0x001f
        L_0x001e:
            r1 = r2
        L_0x001f:
            k30.b r1 = (k30.C25628b) r1
            r0 = 0
            if (r1 == 0) goto L_0x0029
            boolean r1 = r9.m65619a0(r1)
            goto L_0x002a
        L_0x0029:
            r1 = r0
        L_0x002a:
            java.util.Iterator r3 = r10.iterator()
        L_0x002e:
            boolean r4 = r3.hasNext()
            r5 = 1
            if (r4 == 0) goto L_0x005a
            java.lang.Object r4 = r3.next()
            r6 = r4
            k30.b r6 = (k30.C25628b) r6
            boolean r6 = r6.mo64168e()
            if (r6 == 0) goto L_0x0056
            ge.bog.mobilebank.rest.manager.PreferencesApiManager r6 = r9.f54220f
            iu0.y r7 = iu0.C36546y.m108285N()
            java.lang.String r7 = r7.mo89315M()
            java.lang.String r8 = "REMITTANCE_BANNER_HIDDEN"
            boolean r6 = r6.isOfferHidden((java.lang.String) r8, (java.lang.String) r7)
            if (r6 != 0) goto L_0x0056
            r6 = r5
            goto L_0x0057
        L_0x0056:
            r6 = r0
        L_0x0057:
            if (r6 == 0) goto L_0x002e
            goto L_0x005b
        L_0x005a:
            r4 = r2
        L_0x005b:
            k30.b r4 = (k30.C25628b) r4
            if (r4 == 0) goto L_0x0063
            r9.m65618Z()
            r1 = r5
        L_0x0063:
            java.util.Iterator r3 = r10.iterator()
        L_0x0067:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x007b
            java.lang.Object r4 = r3.next()
            r6 = r4
            k30.b r6 = (k30.C25628b) r6
            boolean r6 = r6.mo64166c()
            if (r6 == 0) goto L_0x0067
            goto L_0x007c
        L_0x007b:
            r4 = r2
        L_0x007c:
            k30.b r4 = (k30.C25628b) r4
            if (r4 == 0) goto L_0x008c
            if (r1 != 0) goto L_0x008b
            boolean r1 = r9.m65615R(r4)
            if (r1 == 0) goto L_0x0089
            goto L_0x008b
        L_0x0089:
            r1 = r0
            goto L_0x008c
        L_0x008b:
            r1 = r5
        L_0x008c:
            java.util.Iterator r3 = r10.iterator()
        L_0x0090:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00a4
            java.lang.Object r4 = r3.next()
            r6 = r4
            k30.b r6 = (k30.C25628b) r6
            boolean r6 = r6.mo64167d()
            if (r6 == 0) goto L_0x0090
            goto L_0x00a5
        L_0x00a4:
            r4 = r2
        L_0x00a5:
            k30.b r4 = (k30.C25628b) r4
            if (r4 == 0) goto L_0x00b5
            if (r1 != 0) goto L_0x00b4
            boolean r1 = r9.m65616S()
            if (r1 == 0) goto L_0x00b2
            goto L_0x00b4
        L_0x00b2:
            r1 = r0
            goto L_0x00b5
        L_0x00b4:
            r1 = r5
        L_0x00b5:
            java.util.Iterator r3 = r10.iterator()
        L_0x00b9:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00cd
            java.lang.Object r4 = r3.next()
            r6 = r4
            k30.b r6 = (k30.C25628b) r6
            boolean r6 = r6.mo64165b()
            if (r6 == 0) goto L_0x00b9
            goto L_0x00ce
        L_0x00cd:
            r4 = r2
        L_0x00ce:
            k30.b r4 = (k30.C25628b) r4
            if (r4 == 0) goto L_0x00de
            if (r1 != 0) goto L_0x00dd
            boolean r1 = r9.m65613P()
            if (r1 == 0) goto L_0x00db
            goto L_0x00dd
        L_0x00db:
            r1 = r0
            goto L_0x00de
        L_0x00dd:
            r1 = r5
        L_0x00de:
            java.util.Iterator r10 = r10.iterator()
        L_0x00e2:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L_0x00f6
            java.lang.Object r3 = r10.next()
            r4 = r3
            k30.b r4 = (k30.C25628b) r4
            boolean r4 = r4.mo64171g()
            if (r4 == 0) goto L_0x00e2
            r2 = r3
        L_0x00f6:
            k30.b r2 = (k30.C25628b) r2
            if (r2 == 0) goto L_0x0104
            boolean r10 = r9.m65620c0()
            if (r10 != 0) goto L_0x0102
            if (r1 == 0) goto L_0x0103
        L_0x0102:
            r0 = r5
        L_0x0103:
            r1 = r0
        L_0x0104:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d20.C19824b.mo48131X(java.util.List):boolean");
    }

    /* renamed from: Y */
    public final boolean mo48132Y(List list) {
        C41536l.m120489i(list, "data");
        String M = C36546y.m108285N().mo89315M();
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (!this.f54220f.isOfferHidden(((C25783a) next).mo64412h(), M)) {
                arrayList.add(next);
            }
        }
        this.f54228n = C41358y.m119991B0(arrayList);
        if (!arrayList.isEmpty()) {
            HashMap hashMap = this.f54225k;
            int i = f54218y;
            hashMap.put(Integer.valueOf(i), new C36921t());
            C29615f.m89897A(this, i, arrayList.size(), false, 4, (Object) null);
            this.f54229o = arrayList.size();
        } else {
            C29615f.m89897A(this, f54218y, 0, false, 4, (Object) null);
            this.f54229o = 0;
        }
        return !arrayList.isEmpty();
    }

    /* renamed from: b0 */
    public final boolean mo48133b0(boolean z) {
        if (this.f54220f.wasStudentCardBannerShown(C36546y.m108285N().mo89313K().getLoginInfo().mo90307d()) || !z) {
            return false;
        }
        C36905h0 h0Var = new C36905h0();
        h0Var.mo89843h(new C19841q(this));
        h0Var.mo89844i(new C19842r(this));
        HashMap hashMap = this.f54225k;
        int i = f54215v;
        hashMap.put(Integer.valueOf(i), h0Var);
        C29615f.m89897A(this, i, 1, false, 4, (Object) null);
        return true;
    }

    /* renamed from: l */
    public List mo48134l() {
        int i;
        int i2;
        C29615f.C29617b[] bVarArr = new C29615f.C29617b[14];
        int i3 = f54205A;
        int i4 = 0;
        if (this.f54225k.containsKey(Integer.valueOf(i3))) {
            i = this.f54227m;
        } else {
            i = 0;
        }
        bVarArr[0] = new C29615f.C29617b(i3, i);
        int i5 = f54213t;
        if (this.f54225k.containsKey(Integer.valueOf(i5))) {
            i2 = this.f54231q;
        } else {
            i2 = 0;
        }
        bVarArr[1] = new C29615f.C29617b(i5, i2);
        int i6 = f54214u;
        bVarArr[2] = new C29615f.C29617b(i6, this.f54225k.containsKey(Integer.valueOf(i6)) ? 1 : 0);
        int i7 = f54215v;
        bVarArr[3] = new C29615f.C29617b(i7, this.f54225k.containsKey(Integer.valueOf(i7)) ? 1 : 0);
        int i8 = f54208D;
        bVarArr[4] = new C29615f.C29617b(i8, this.f54225k.containsKey(Integer.valueOf(i8)) ? 1 : 0);
        int i9 = f54217x;
        bVarArr[5] = new C29615f.C29617b(i9, this.f54225k.containsKey(Integer.valueOf(i9)) ? 1 : 0);
        int i12 = f54209E;
        bVarArr[6] = new C29615f.C29617b(i12, this.f54225k.containsKey(Integer.valueOf(i12)) ? 1 : 0);
        int i13 = f54218y;
        if (this.f54225k.containsKey(Integer.valueOf(i13))) {
            i4 = this.f54229o;
        }
        bVarArr[7] = new C29615f.C29617b(i13, i4);
        int i14 = f54219z;
        bVarArr[8] = new C29615f.C29617b(i14, this.f54225k.containsKey(Integer.valueOf(i14)) ? 1 : 0);
        int i15 = f54206B;
        bVarArr[9] = new C29615f.C29617b(i15, this.f54225k.containsKey(Integer.valueOf(i15)) ? 1 : 0);
        int i16 = f54207C;
        bVarArr[10] = new C29615f.C29617b(i16, this.f54225k.containsKey(Integer.valueOf(i16)) ? 1 : 0);
        int i17 = f54210F;
        bVarArr[11] = new C29615f.C29617b(i17, this.f54225k.containsKey(Integer.valueOf(i17)) ? 1 : 0);
        int i18 = f54216w;
        bVarArr[12] = new C29615f.C29617b(i18, this.f54225k.containsKey(Integer.valueOf(i18)) ? 1 : 0);
        int i19 = f54211G;
        bVarArr[13] = new C29615f.C29617b(i19, this.f54225k.containsKey(Integer.valueOf(i19)) ? 1 : 0);
        return C41341q.m119910m(bVarArr);
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        if (i == f54205A) {
            return new C19826b(this, new C36892b0(), viewGroup);
        }
        if (i == f54213t) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.banner_layout, viewGroup, false);
            C41536l.m120488h(inflate, "from(parent.context)\n   …er_layout, parent, false)");
            return new C20639w(inflate);
        }
        C36917q qVar = (C36917q) this.f54225k.get(Integer.valueOf(i));
        if (qVar != null) {
            return new C19826b(this, qVar, viewGroup);
        }
        throw new IllegalStateException("Illegal View type");
    }

    /* renamed from: p */
    public void mo48135p(RecyclerView.C1734f0 f0Var, int i, int i2) {
        C41536l.m120489i(f0Var, "holder");
        int itemViewType = getItemViewType(i);
        if (itemViewType == f54205A) {
            C36917q h = ((C19826b) f0Var).mo48136h();
            List list = this.f54226l;
            if (list != null && i2 >= 0 && i2 < list.size()) {
                C41536l.m120487g(h, "null cannot be cast to non-null type ge.bog.mobilebank.ui.adapters.offers.ShadowLimitsOfferBanner");
                ((C36892b0) h).mo89825k((OfferInfo) list.get(i2));
            }
        } else if (itemViewType == f54213t) {
            List list2 = this.f54230p;
            if (list2 != null) {
                C20639w wVar = (C20639w) f0Var;
                wVar.mo49181j((C25104d) list2.get(i2));
                wVar.mo49182m(new C19829e(this));
                wVar.mo49183n(new C19830f(this, i2, itemViewType));
            }
        } else if (itemViewType == f54218y) {
            C36917q h2 = ((C19826b) f0Var).mo48136h();
            String M = C36546y.m108285N().mo89315M();
            List list3 = this.f54228n;
            if (list3 != null) {
                C41536l.m120487g(h2, "null cannot be cast to non-null type ge.bog.mobilebank.ui.adapters.offers.PendingProductConfirmationBanner");
                C36921t tVar = (C36921t) h2;
                PendingProductConfirmationData.C22278a aVar = PendingProductConfirmationData.f59104m;
                C25783a aVar2 = (C25783a) C41358y.m120010Z(list3, i2);
                if (aVar2 != null) {
                    tVar.mo89863f(aVar.mo55162a(aVar2));
                    tVar.mo89864g(new C19831g(this));
                    tVar.mo89865h(new C19832h(this, M));
                }
            }
        }
        if (itemViewType != f54213t) {
            ((C19826b) f0Var).mo48136h().mo89860c(new C19823a(this, i, i2));
        }
    }
}
