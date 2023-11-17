package g60;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.content.C0767a;
import com.alexandrius.accordionswipelayout.library.SwipeLayout;
import f60.C20442d;
import he1.C41217g;
import iu0.C36546y;
import java.util.ArrayList;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.model.payment.PaymentProviderConfiguration;
import p341ge.bog.mobilebank.model.template.TemplateBasketItem;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10318g;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p380ck.C10463g;
import r90.C27954d;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: g60.p */
public final class C20760p extends C20742c {

    /* renamed from: k */
    public static final C20761a f55966k = new C20761a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private C43075l f55967d;

    /* renamed from: e */
    private C43075l f55968e;

    /* renamed from: f */
    private C43075l f55969f;

    /* renamed from: g */
    private C43075l f55970g;

    /* renamed from: h */
    private C43075l f55971h;

    /* renamed from: i */
    private C20442d f55972i;

    /* renamed from: j */
    private final C41217g f55973j;

    /* renamed from: g60.p$a */
    public static final class C20761a {
        private C20761a() {
        }

        public /* synthetic */ C20761a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        private final void m67217b(Context context, SwipeLayout swipeLayout) {
            Context context2 = context;
            SwipeLayout swipeLayout2 = swipeLayout;
            SwipeLayout.C2363g gVar = new SwipeLayout.C2363g("AUTOMATIC_SERVICES_ID", context2.getString(C10328q.template_swipe_menu_automatic_services), Integer.valueOf(C10320i.ic_swipe_automatic), Integer.valueOf(C0767a.m2893c(context2, C10318g.swipe_menu_item_1)), Integer.valueOf(C0767a.m2893c(context2, C10318g.swipe_menu_item_text_color)), Integer.valueOf(C0767a.m2893c(context2, C10318g.swipe_menu_item_icon_tint_color)), (Float) null);
            ArrayList arrayList = new ArrayList();
            String string = context2.getString(C10328q.template_swipe_menu_edit);
            Integer valueOf = Integer.valueOf(C10320i.edit_new);
            Integer valueOf2 = Integer.valueOf(C0767a.m2893c(context2, C10318g.swipe_menu_contact_edit_background));
            int i = C10318g.swipe_menu_contact_edit_text_color;
            arrayList.add(new SwipeLayout.C2363g("EDIT_ID", string, valueOf, valueOf2, Integer.valueOf(C0767a.m2893c(context2, i)), Integer.valueOf(C0767a.m2893c(context2, i)), (Float) null));
            String string2 = context2.getString(C10328q.template_swipe_menu_delete);
            Integer valueOf3 = Integer.valueOf(C10320i.delete_new);
            Integer valueOf4 = Integer.valueOf(C0767a.m2893c(context2, C10318g.swipe_menu_contact_delete_background));
            int i2 = C10318g.f28650u2;
            arrayList.add(new SwipeLayout.C2363g("DELETE_ID", string2, valueOf3, valueOf4, Integer.valueOf(C0767a.m2893c(context2, i2)), Integer.valueOf(C0767a.m2893c(context2, i2)), (Float) null));
            swipeLayout2.setLeftSwipeItem(gVar);
            swipeLayout2.setRightSwipeItems(arrayList);
        }

        /* renamed from: a */
        public final C20760p mo49308a(ViewGroup viewGroup) {
            C41536l.m120489i(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.item_template_provider_template_swipable, viewGroup, false);
            Context context = viewGroup.getContext();
            C41536l.m120488h(context, "parent.context");
            C41536l.m120487g(inflate, "null cannot be cast to non-null type com.alexandrius.accordionswipelayout.library.SwipeLayout");
            m67217b(context, (SwipeLayout) inflate);
            return new C20760p(inflate);
        }
    }

    /* renamed from: g60.p$b */
    static final class C20762b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C20760p f55974d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20762b(C20760p pVar) {
            super(0);
            this.f55974d = pVar;
        }

        /* renamed from: b */
        public final LinearLayout invoke() {
            return (LinearLayout) this.f55974d.itemView.findViewById(C10322k.amount_wrapper);
        }
    }

    /* renamed from: g60.p$c */
    static final class C20763c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C20760p f55975d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20763c(C20760p pVar) {
            super(0);
            this.f55975d = pVar;
        }

        /* renamed from: b */
        public final View invoke() {
            return this.f55975d.itemView.findViewById(C10322k.blur_view);
        }
    }

    /* renamed from: g60.p$d */
    static final class C20764d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C20760p f55976d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20764d(C20760p pVar) {
            super(0);
            this.f55976d = pVar;
        }

        /* renamed from: b */
        public final BogTextView invoke() {
            return (BogTextView) this.f55976d.itemView.findViewById(C10322k.error_tv);
        }
    }

    /* renamed from: g60.p$e */
    static final class C20765e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C20760p f55977d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20765e(C20760p pVar) {
            super(0);
            this.f55977d = pVar;
        }

        /* renamed from: b */
        public final BogTextView invoke() {
            return (BogTextView) this.f55977d.itemView.findViewById(C10322k.non_editable_tv);
        }
    }

    /* renamed from: g60.p$f */
    static final class C20766f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ View f55978d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20766f(View view) {
            super(0);
            this.f55978d = view;
        }

        /* renamed from: b */
        public final View invoke() {
            return this.f55978d.findViewById(C10322k.retry_get_debt);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20760p(View view) {
        super(view);
        C41536l.m120489i(view, "itemView");
        this.f55973j = C41219i.m119470b(new C20766f(view));
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public static final void m67192A(C20760p pVar, boolean z, String str) {
        C20442d dVar;
        C43075l lVar;
        C43075l lVar2;
        PaymentProviderConfiguration h;
        C43075l lVar3;
        C41536l.m120489i(pVar, "this$0");
        if (z && C41536l.m120484d(str, "AUTOMATIC_SERVICES_ID")) {
            C20442d dVar2 = pVar.f55972i;
            if (dVar2 != null && (h = C27954d.m86302h(dVar2.mo48956d().getServiceId())) != null && h.isDDAllowed && (lVar3 = pVar.f55971h) != null) {
                lVar3.invoke(dVar2);
            }
        } else if (z) {
        } else {
            if (C41536l.m120484d(str, "EDIT_ID")) {
                C20442d dVar3 = pVar.f55972i;
                if (dVar3 != null && (lVar2 = pVar.f55969f) != null) {
                    lVar2.invoke(dVar3);
                }
            } else if (C41536l.m120484d(str, "DELETE_ID") && (dVar = pVar.f55972i) != null && (lVar = pVar.f55968e) != null) {
                lVar.invoke(dVar);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public static final void m67193B(C20760p pVar, View view) {
        C43075l lVar;
        C41536l.m120489i(pVar, "this$0");
        C20442d dVar = pVar.f55972i;
        if (dVar != null && (lVar = pVar.f55970g) != null) {
            lVar.invoke(dVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public static final void m67194C(C20760p pVar, View view) {
        C43075l lVar;
        C41536l.m120489i(pVar, "this$0");
        C20442d dVar = pVar.f55972i;
        if (dVar != null && (lVar = pVar.f55967d) != null) {
            lVar.invoke(dVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public static final boolean m67195D(C20760p pVar, View view) {
        C41536l.m120489i(pVar, "this$0");
        pVar.m67203n().mo7588f(true);
        pVar.m67203n().mo7586B(1, true);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public static final void m67196E(SwipeLayout swipeLayout, boolean z) {
        String str;
        long j;
        C10463g F = C36546y.m108282F();
        if (z) {
            str = "right";
        } else {
            str = "left";
        }
        if (z) {
            j = 1;
        } else {
            j = -1;
        }
        F.mo27153t("transfers_templates", str, "swipe_template", Long.valueOf(j));
    }

    /* renamed from: m */
    private final View m67202m() {
        Object value = this.f55973j.getValue();
        C41536l.m120488h(value, "<get-retryGetDebt>(...)");
        return (View) value;
    }

    /* renamed from: n */
    private final SwipeLayout m67203n() {
        View findViewById = this.itemView.findViewById(C10322k.swipe_layout);
        C41536l.m120488h(findViewById, "itemView.findViewById(R.id.swipe_layout)");
        return (SwipeLayout) findViewById;
    }

    /* renamed from: o */
    private final TemplateBasketItem m67204o() {
        C20442d dVar = this.f55972i;
        if (dVar != null) {
            return dVar.mo48956d();
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02b5 A[ADDED_TO_REGION] */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m67205p() {
        /*
            r15 = this;
            android.view.View r0 = r15.itemView
            int r1 = p366bk.C10322k.template_basket_container
            android.view.View r0 = r0.findViewById(r1)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            g60.p$e r1 = new g60.p$e
            r1.<init>(r15)
            he1.g r1 = he1.C41219i.m119470b(r1)
            g60.p$b r2 = new g60.p$b
            r2.<init>(r15)
            he1.g r2 = he1.C41219i.m119470b(r2)
            android.view.View r3 = r15.itemView
            android.content.Context r3 = r3.getContext()
            int r4 = p366bk.C10318g.f28625J0
            int r3 = androidx.core.content.C0767a.m2893c(r3, r4)
            r0.setBackgroundColor(r3)
            ge.bog.mobilebank.model.template.TemplateBasketItem r3 = r15.m67204o()
            if (r3 != 0) goto L_0x0032
            return
        L_0x0032:
            ge.bog.mobilebank.model.template.TemplateBasketItem r3 = r15.m67204o()
            r5 = 0
            if (r3 == 0) goto L_0x003e
            java.lang.String r3 = r3.getServiceId()
            goto L_0x003f
        L_0x003e:
            r3 = r5
        L_0x003f:
            ge.bog.mobilebank.model.payment.PaymentProviderConfiguration r3 = r90.C27954d.m86302h(r3)
            com.alexandrius.accordionswipelayout.library.SwipeLayout r6 = r15.m67203n()
            if (r3 == 0) goto L_0x0050
            boolean r3 = r3.isDDAllowed
            if (r3 == 0) goto L_0x0050
            r3 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0052
        L_0x0050:
            r3 = 1056964608(0x3f000000, float:0.5)
        L_0x0052:
            r7 = 1
            r8 = 0
            r6.mo7585A(r7, r8, r3)
            android.view.View r3 = r15.itemView
            int r6 = p366bk.C10322k.flipper
            android.view.View r3 = r3.findViewById(r6)
            ge.bog.mobilebank.ui.views.widgets.FlipImageViewContainer r3 = (p341ge.bog.mobilebank.p975ui.views.widgets.FlipImageViewContainer) r3
            ge.bog.mobilebank.model.template.TemplateBasketItem r6 = r15.m67204o()
            if (r6 == 0) goto L_0x006d
            java.lang.String r6 = r6.getTemplateImage()
            if (r6 != 0) goto L_0x0079
        L_0x006d:
            ge.bog.mobilebank.model.template.TemplateBasketItem r6 = r15.m67204o()
            if (r6 == 0) goto L_0x0078
            java.lang.String r6 = r6.getLogo()
            goto L_0x0079
        L_0x0078:
            r6 = r5
        L_0x0079:
            java.lang.String r6 = g91.C32289b0.m95093e(r6)
            int r9 = p366bk.C10320i.f28688dc
            int r10 = p366bk.C10320i.ic_payment_template_default
            r3.setFrontImageUrl(r6, r9, r10)
            android.widget.LinearLayout r3 = m67207r(r2)
            g91.C32343x.m95401L0(r3)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r3 = m67206q(r1)
            g91.C32343x.m95407O0(r3)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r3 = m67206q(r1)
            f60.d r6 = r15.f55972i
            if (r6 == 0) goto L_0x009f
            java.lang.String r6 = r6.mo48955c()
            goto L_0x00a0
        L_0x009f:
            r6 = r5
        L_0x00a0:
            if (r6 == 0) goto L_0x00ab
            int r6 = r6.length()
            if (r6 != 0) goto L_0x00a9
            goto L_0x00ab
        L_0x00a9:
            r6 = r8
            goto L_0x00ac
        L_0x00ab:
            r6 = r7
        L_0x00ac:
            java.lang.String r9 = " ₾"
            if (r6 == 0) goto L_0x00b1
            goto L_0x00ce
        L_0x00b1:
            f60.d r6 = r15.f55972i
            if (r6 == 0) goto L_0x00ba
            java.lang.String r6 = r6.mo48955c()
            goto L_0x00bb
        L_0x00ba:
            r6 = r5
        L_0x00bb:
            java.lang.String r6 = g91.C32359z0.m95541L(r6)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r6)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
        L_0x00ce:
            r3.setText(r9)
            ge.bog.mobilebank.model.template.TemplateBasketItem r3 = r15.m67204o()
            kotlin.jvm.internal.C41536l.m120486f(r3)
            boolean r3 = r3.canGetDebt()
            if (r3 == 0) goto L_0x0134
            ge.bog.mobilebank.model.template.TemplateBasketItem r3 = r15.m67204o()
            kotlin.jvm.internal.C41536l.m120486f(r3)
            int r3 = r3.getDebtAmount()
            if (r3 <= 0) goto L_0x00ff
            ge.bog.mobilebank.ui.views.widgets.BogTextView r3 = m67206q(r1)
            android.view.View r6 = r15.itemView
            android.content.Context r6 = r6.getContext()
            int r9 = p366bk.C10318g.bog_error_red
            int r6 = androidx.core.content.C0767a.m2893c(r6, r9)
            r3.setTextColor(r6)
            goto L_0x0147
        L_0x00ff:
            ge.bog.mobilebank.model.template.TemplateBasketItem r3 = r15.m67204o()
            kotlin.jvm.internal.C41536l.m120486f(r3)
            int r3 = r3.getDebtAmount()
            if (r3 >= 0) goto L_0x0120
            ge.bog.mobilebank.ui.views.widgets.BogTextView r3 = m67206q(r1)
            android.view.View r6 = r15.itemView
            android.content.Context r6 = r6.getContext()
            int r9 = p366bk.C10318g.success_green
            int r6 = androidx.core.content.C0767a.m2893c(r6, r9)
            r3.setTextColor(r6)
            goto L_0x0147
        L_0x0120:
            ge.bog.mobilebank.ui.views.widgets.BogTextView r3 = m67206q(r1)
            android.view.View r6 = r15.itemView
            android.content.Context r6 = r6.getContext()
            int r9 = p366bk.C10318g.f28630R0
            int r6 = androidx.core.content.C0767a.m2893c(r6, r9)
            r3.setTextColor(r6)
            goto L_0x0147
        L_0x0134:
            ge.bog.mobilebank.ui.views.widgets.BogTextView r3 = m67206q(r1)
            android.view.View r6 = r15.itemView
            android.content.Context r6 = r6.getContext()
            int r9 = p366bk.C10318g.f28630R0
            int r6 = androidx.core.content.C0767a.m2893c(r6, r9)
            r3.setTextColor(r6)
        L_0x0147:
            android.view.View r3 = r15.itemView
            int r6 = p366bk.C10322k.template_item_title
            android.view.View r3 = r3.findViewById(r6)
            java.lang.String r6 = "itemView.findViewById(R.id.template_item_title)"
            kotlin.jvm.internal.C41536l.m120488h(r3, r6)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r3 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView) r3
            android.view.View r6 = r15.itemView
            int r9 = p366bk.C10322k.template_item_mid_desc
            android.view.View r6 = r6.findViewById(r9)
            java.lang.String r9 = "itemView.findViewById(R.id.template_item_mid_desc)"
            kotlin.jvm.internal.C41536l.m120488h(r6, r9)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r6 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView) r6
            android.view.View r9 = r15.itemView
            int r10 = p366bk.C10322k.template_item_bottom_desc
            android.view.View r9 = r9.findViewById(r10)
            java.lang.String r10 = "itemView.findViewById(R.…emplate_item_bottom_desc)"
            kotlin.jvm.internal.C41536l.m120488h(r9, r10)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r9 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView) r9
            f60.d r10 = r15.f55972i
            if (r10 == 0) goto L_0x017d
            java.lang.String r10 = r10.mo48960g()
            goto L_0x017e
        L_0x017d:
            r10 = r5
        L_0x017e:
            r3.setText(r10)
            f60.d r10 = r15.f55972i
            if (r10 == 0) goto L_0x018a
            java.lang.String r10 = r10.mo48959f()
            goto L_0x018b
        L_0x018a:
            r10 = r5
        L_0x018b:
            r6.setText(r10)
            f60.d r10 = r15.f55972i
            if (r10 == 0) goto L_0x0197
            java.lang.String r10 = r10.mo48957e()
            goto L_0x0198
        L_0x0197:
            r10 = r5
        L_0x0198:
            r9.setText(r10)
            g60.p$c r10 = new g60.p$c
            r10.<init>(r15)
            he1.g r10 = he1.C41219i.m119470b(r10)
            g60.p$d r11 = new g60.p$d
            r11.<init>(r15)
            he1.g r11 = he1.C41219i.m119470b(r11)
            ge.bog.mobilebank.model.template.TemplateBasketItem r12 = r15.m67204o()
            if (r12 == 0) goto L_0x01bb
            boolean r12 = r12.canGetDebt()
            if (r12 != r7) goto L_0x01bb
            r12 = r7
            goto L_0x01bc
        L_0x01bb:
            r12 = r8
        L_0x01bc:
            if (r12 == 0) goto L_0x0297
            ge.bog.mobilebank.model.template.TemplateBasketItem r12 = r15.m67204o()
            if (r12 == 0) goto L_0x01cc
            boolean r12 = r12.isCTParkItem()
            if (r12 != 0) goto L_0x01cc
            r12 = r7
            goto L_0x01cd
        L_0x01cc:
            r12 = r8
        L_0x01cd:
            if (r12 == 0) goto L_0x0297
            ge.bog.mobilebank.model.template.TemplateBasketItem r12 = r15.m67204o()
            if (r12 == 0) goto L_0x01e3
            ge.bog.mobilebank.eventbus.events.TemplateDebtEvent r12 = r12.getTemplateDebtEvent()
            if (r12 == 0) goto L_0x01e3
            int r5 = r12.getState()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
        L_0x01e3:
            if (r5 != 0) goto L_0x01e6
            goto L_0x0215
        L_0x01e6:
            int r12 = r5.intValue()
            r13 = 10
            if (r12 != r13) goto L_0x0215
            ge.bog.mobilebank.ui.views.widgets.BogTextView r0 = m67209t(r11)
            g91.C32343x.m95401L0(r0)
            android.view.View r0 = r15.m67202m()
            g91.C32343x.m95401L0(r0)
            android.view.View r0 = m67208s(r10)
            g91.C32343x.m95407O0(r0)
            g91.C32343x.m95401L0(r6)
            g91.C32343x.m95401L0(r9)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r0 = m67206q(r1)
            g91.C32343x.m95401L0(r0)
            r14 = r8
            r8 = r7
            r7 = r14
            goto L_0x02b3
        L_0x0215:
            if (r5 != 0) goto L_0x0218
            goto L_0x0244
        L_0x0218:
            int r12 = r5.intValue()
            r13 = 20
            if (r12 != r13) goto L_0x0244
            ge.bog.mobilebank.ui.views.widgets.BogTextView r0 = m67209t(r11)
            g91.C32343x.m95401L0(r0)
            android.view.View r0 = r15.m67202m()
            g91.C32343x.m95401L0(r0)
            android.view.View r0 = m67208s(r10)
            g91.C32343x.m95401L0(r0)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r0 = m67206q(r1)
            g91.C32343x.m95407O0(r0)
            g91.C32343x.m95407O0(r6)
            g91.C32343x.m95407O0(r9)
            goto L_0x02b2
        L_0x0244:
            if (r5 != 0) goto L_0x0247
            goto L_0x0251
        L_0x0247:
            int r12 = r5.intValue()
            r13 = 30
            if (r12 != r13) goto L_0x0251
        L_0x024f:
            r5 = r7
            goto L_0x025e
        L_0x0251:
            if (r5 != 0) goto L_0x0254
            goto L_0x025d
        L_0x0254:
            int r5 = r5.intValue()
            r12 = 40
            if (r5 != r12) goto L_0x025d
            goto L_0x024f
        L_0x025d:
            r5 = r8
        L_0x025e:
            if (r5 == 0) goto L_0x02b2
            android.widget.LinearLayout r2 = m67207r(r2)
            g91.C32343x.m95401L0(r2)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r1 = m67206q(r1)
            g91.C32343x.m95401L0(r1)
            g91.C32343x.m95401L0(r6)
            g91.C32343x.m95401L0(r9)
            android.view.View r1 = m67208s(r10)
            g91.C32343x.m95401L0(r1)
            android.view.View r1 = r15.m67202m()
            g91.C32343x.m95407O0(r1)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r1 = m67209t(r11)
            g91.C32343x.m95407O0(r1)
            android.view.View r1 = r15.itemView
            android.content.Context r1 = r1.getContext()
            int r1 = androidx.core.content.C0767a.m2893c(r1, r4)
            r0.setBackgroundColor(r1)
            goto L_0x02b3
        L_0x0297:
            android.view.View r0 = m67208s(r10)
            g91.C32343x.m95401L0(r0)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r0 = m67209t(r11)
            g91.C32343x.m95401L0(r0)
            android.view.View r0 = r15.m67202m()
            g91.C32343x.m95401L0(r0)
            g91.C32343x.m95407O0(r6)
            g91.C32343x.m95407O0(r9)
        L_0x02b2:
            r7 = r8
        L_0x02b3:
            if (r7 != 0) goto L_0x02c0
            if (r8 != 0) goto L_0x02c0
            g91.C32343x.m95403M0(r3)
            g91.C32343x.m95403M0(r6)
            g91.C32343x.m95403M0(r9)
        L_0x02c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g60.C20760p.m67205p():void");
    }

    /* renamed from: q */
    private static final BogTextView m67206q(C41217g gVar) {
        Object value = gVar.getValue();
        C41536l.m120488h(value, "initData$lambda$0(...)");
        return (BogTextView) value;
    }

    /* renamed from: r */
    private static final LinearLayout m67207r(C41217g gVar) {
        Object value = gVar.getValue();
        C41536l.m120488h(value, "initData$lambda$1(...)");
        return (LinearLayout) value;
    }

    /* renamed from: s */
    private static final View m67208s(C41217g gVar) {
        Object value = gVar.getValue();
        C41536l.m120488h(value, "initData$lambda$2(...)");
        return (View) value;
    }

    /* renamed from: t */
    private static final BogTextView m67209t(C41217g gVar) {
        Object value = gVar.getValue();
        C41536l.m120488h(value, "initData$lambda$3(...)");
        return (BogTextView) value;
    }

    /* renamed from: z */
    private final void m67210z() {
        m67202m().setOnClickListener(new C20755k(this));
        this.itemView.setOnClickListener(new C20756l(this));
        this.itemView.setOnLongClickListener(new C20757m(this));
        m67203n().setOnSwipedListener(new C20758n());
        m67203n().setOnSwipeItemClickListener(new C20759o(this));
    }

    /* renamed from: F */
    public final void mo49302F(C43075l lVar) {
        this.f55970g = lVar;
    }

    /* renamed from: u */
    public void onBind(C20442d dVar) {
        C41536l.m120489i(dVar, "data");
        this.f55972i = dVar;
        m67210z();
        m67205p();
    }

    /* renamed from: v */
    public final void mo49304v(C43075l lVar) {
        this.f55971h = lVar;
    }

    /* renamed from: w */
    public final void mo49305w(C43075l lVar) {
        this.f55968e = lVar;
    }

    /* renamed from: x */
    public final void mo49306x(C43075l lVar) {
        this.f55969f = lVar;
    }

    /* renamed from: y */
    public final void mo49307y(C43075l lVar) {
        this.f55967d = lVar;
    }
}
