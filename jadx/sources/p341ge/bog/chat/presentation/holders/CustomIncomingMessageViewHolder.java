package p341ge.bog.chat.presentation.holders;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.C0767a;
import androidx.core.view.C1152f3;
import androidx.recyclerview.widget.RecyclerView;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import androidx.viewpager2.widget.C1942e;
import androidx.viewpager2.widget.ViewPager2;
import he1.C41217g;
import he1.C41238w;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.chat.domain.model.components.AccountComponent;
import p341ge.bog.chat.domain.model.components.AccountListComponent;
import p341ge.bog.chat.domain.model.components.CalendarRangeComponent;
import p341ge.bog.chat.domain.model.components.Component;
import p341ge.bog.chat.domain.model.components.FAQComponent;
import p341ge.bog.chat.domain.model.components.FAQItem;
import p341ge.bog.chat.domain.model.components.FeedbackComponent;
import p341ge.bog.chat.domain.model.components.PreContractComponent;
import p341ge.bog.chat.domain.model.components.ProductOfferBody;
import p341ge.bog.chat.domain.model.components.ProductOfferComponent;
import p341ge.bog.chat.domain.model.components.ProductsSliderComponentsList;
import p341ge.bog.chat.presentation.actionsheet.AccountSelectorComponentData;
import p341ge.bog.chat.presentation.activity.C13027g0;
import p341ge.bog.chat.presentation.activity.C13032i0;
import p341ge.bog.chat.presentation.activity.C13034j0;
import p341ge.bog.chat.presentation.holders.ComponentUi;
import p341ge.bog.chatkit.messages.MessageHolders;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.smallsteps.SmallStepsView;
import p376cg.C10429h;
import p376cg.C10435n;
import p447hg.C15499c;
import p447hg.C15505g;
import p503lg.C16564d;
import p503lg.C16565e;
import p503lg.C16566f;
import p503lg.C16567g;
import p503lg.C16568h;
import p503lg.C16569i;
import p503lg.C16570j;
import p503lg.C16574l;
import p517mg.C16683b;
import p601sg.C17786k;
import p642vh.C18338b0;
import p642vh.C18368l;
import p653wf.C18584m;
import p653wf.C18585n;
import p653wf.C18586o;
import p653wf.C18587p;
import ue1.C43064a;
import ue1.C43075l;
import vg1.C43167a;

/* renamed from: ge.bog.chat.presentation.holders.CustomIncomingMessageViewHolder */
public class CustomIncomingMessageViewHolder extends MessageHolders.IncomingTextMessageViewHolder<C13034j0> implements C16574l {

    /* renamed from: k */
    public static final C13080a f38488k = new C13080a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C41217g f38489d;

    /* renamed from: e */
    private C13081b f38490e;

    /* renamed from: f */
    private C15505g f38491f;

    /* renamed from: g */
    private final View f38492g;

    /* renamed from: h */
    private boolean f38493h;

    /* renamed from: i */
    private boolean f38494i;

    /* renamed from: j */
    private boolean f38495j;

    /* renamed from: ge.bog.chat.presentation.holders.CustomIncomingMessageViewHolder$a */
    public static final class C13080a {
        private C13080a() {
        }

        public /* synthetic */ C13080a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.chat.presentation.holders.CustomIncomingMessageViewHolder$b */
    public interface C13081b {
        /* renamed from: a */
        void mo34340a(ComponentUi componentUi);
    }

    /* renamed from: ge.bog.chat.presentation.holders.CustomIncomingMessageViewHolder$c */
    public /* synthetic */ class C13082c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38496a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f38497b;

        static {
            int[] iArr = new int[C13032i0.values().length];
            iArr[C13032i0.TEXT.ordinal()] = 1;
            iArr[C13032i0.FILE_ATTACHMENT.ordinal()] = 2;
            iArr[C13032i0.TYPING.ordinal()] = 3;
            iArr[C13032i0.PARTICIPANT_LEFT.ordinal()] = 4;
            f38496a = iArr;
            int[] iArr2 = new int[C13027g0.values().length];
            iArr2[C13027g0.FIRST_MESSAGE.ordinal()] = 1;
            iArr2[C13027g0.NO_GROUP.ordinal()] = 2;
            f38497b = iArr2;
        }
    }

    /* renamed from: ge.bog.chat.presentation.holders.CustomIncomingMessageViewHolder$d */
    public static final class C13083d extends ViewPager2.C1928i {

        /* renamed from: a */
        final /* synthetic */ CustomIncomingMessageViewHolder f38498a;

        C13083d(CustomIncomingMessageViewHolder customIncomingMessageViewHolder) {
            this.f38498a = customIncomingMessageViewHolder;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static final void m49327b(View view, CustomIncomingMessageViewHolder customIncomingMessageViewHolder) {
            C41536l.m120489i(customIncomingMessageViewHolder, "this$0");
            view.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            if (customIncomingMessageViewHolder.m49305q().f29668H.getLayoutParams().height != view.getMeasuredHeight()) {
                ViewPager2 viewPager2 = customIncomingMessageViewHolder.m49305q().f29668H;
                C41536l.m120488h(viewPager2, "messageBinding.productsViewPager");
                ViewGroup.LayoutParams layoutParams = viewPager2.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = view.getMeasuredHeight();
                    viewPager2.setLayoutParams(layoutParams);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }

        public void onPageSelected(int i) {
            View view;
            super.onPageSelected(i);
            ViewPager2 viewPager2 = this.f38498a.m49305q().f29668H;
            C41536l.m120488h(viewPager2, "messageBinding.productsViewPager");
            RecyclerView.C1747p layoutManager = ((RecyclerView) C1152f3.m4214a(viewPager2, 0)).getLayoutManager();
            if (layoutManager != null) {
                view = layoutManager.mo5199O(i);
            } else {
                view = null;
            }
            if (view != null) {
                view.post(new C16569i(view, this.f38498a));
            }
        }
    }

    /* renamed from: ge.bog.chat.presentation.holders.CustomIncomingMessageViewHolder$e */
    static final class C13084e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ View f38499d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13084e(View view) {
            super(0);
            this.f38499d = view;
        }

        /* renamed from: b */
        public final C10429h invoke() {
            C10429h a = C10429h.m37882a(this.f38499d);
            C41536l.m120488h(a, "bind(itemView)");
            return a;
        }
    }

    /* renamed from: ge.bog.chat.presentation.holders.CustomIncomingMessageViewHolder$f */
    static final class C13085f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ Input f38500d;

        /* renamed from: e */
        final /* synthetic */ CalendarRangeComponent f38501e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13085f(Input input, CalendarRangeComponent calendarRangeComponent) {
            super(1);
            this.f38500d = input;
            this.f38501e = calendarRangeComponent;
        }

        /* renamed from: a */
        public final void mo34417a(long j) {
            Input input = this.f38500d;
            String format = new SimpleDateFormat(this.f38501e.getDatePattern()).format(new Date(j));
            C41536l.m120488h(format, "SimpleDateFormat(calenda…Pattern).format(Date(it))");
            input.setInputText(format);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo34417a(((Number) obj).longValue());
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomIncomingMessageViewHolder(View view, Object obj) {
        super(view, obj);
        C41536l.m120489i(view, "itemView");
        this.f38489d = C41219i.m119470b(new C13084e(view));
        ProgressBar progressBar = m49305q().f29684q.f29654g;
        Context context = progressBar.getContext();
        int i = C18587p.chat_attachment_load_progress;
        progressBar.setIndeterminateDrawable(AnimatedVectorDrawableCompat.m7299b(context, i));
        ProgressBar progressBar2 = m49305q().f29685r.f29660f;
        progressBar2.setIndeterminateDrawable(AnimatedVectorDrawableCompat.m7299b(progressBar2.getContext(), i));
        FrameLayout frameLayout = m49305q().f29674g;
        C41536l.m120488h(frameLayout, "messageBinding.bubbleLayout");
        this.f38492g = frameLayout;
    }

    /* renamed from: A */
    private final void m49288A(ProductOfferComponent productOfferComponent) {
        int i;
        m49305q().f29662B.setBadgeText(productOfferComponent.getHeader().getStatus());
        m49305q().f29665E.setTitle(productOfferComponent.getHeader().getTitle());
        m49305q().f29665E.setText(productOfferComponent.getHeader().getType());
        AppCompatImageView appCompatImageView = m49305q().f29663C;
        C41536l.m120488h(appCompatImageView, "");
        ColorStateList colorStateList = null;
        C18368l.m62746A(appCompatImageView, new Image.Resource(C15499c.m56061d(productOfferComponent.getHeader().getProductType()), (Boolean) null, 2, (DefaultConstructorMarker) null), (C43075l) null, 2, (Object) null);
        if (productOfferComponent.getHeader().getProductType() == null) {
            Context context = m49305q().mo3946b().getContext();
            C41536l.m120488h(context, "messageBinding.root.context");
            colorStateList = ColorStateList.valueOf(C18368l.m62755d(context, C18584m.f52132c));
        }
        appCompatImageView.setImageTintList(colorStateList);
        Context context2 = m49305q().mo3946b().getContext();
        m49305q().f29664D.removeAllViews();
        for (ProductOfferBody productOfferBody : productOfferComponent.getBody()) {
            C10435n d = C10435n.m37904d(LayoutInflater.from(context2), m49305q().f29664D, false);
            C41536l.m120488h(d, "inflate(\n               …      false\n            )");
            d.f29722e.setText(productOfferBody.getTitle());
            d.f29723f.setText(productOfferBody.getValue());
            AppCompatTextView appCompatTextView = d.f29723f;
            if (C41536l.m120484d(productOfferBody.isColored(), Boolean.TRUE)) {
                i = C18585n.f52135l;
            } else {
                i = C18585n.f52134k;
            }
            appCompatTextView.setTextColor(C0767a.m2893c(context2, i));
            m49305q().f29664D.addView(d.mo3946b());
        }
    }

    /* renamed from: B */
    private final void m49289B(List list) {
        C16570j jVar = new C16570j();
        jVar.mo43713n(new C16564d(this));
        ViewPager2 viewPager2 = m49305q().f29668H;
        Context context = m49305q().mo3946b().getContext();
        C41536l.m120488h(context, "messageBinding.root.context");
        viewPager2.setPageTransformer(new C1942e(C43167a.m123815a(context, C18586o.f52136i)));
        m49305q().f29668H.setOffscreenPageLimit(2);
        m49305q().f29668H.setAdapter(jVar);
        m49305q().f29668H.mo6603h(new C13083d(this));
        C18338b0 b = C18338b0.C18340b.m62692b(C18338b0.f51787c, list.size(), C17786k.f49830h, false, false, 12, (Object) null);
        ViewPager2 viewPager22 = m49305q().f29668H;
        C41536l.m120488h(viewPager22, "messageBinding.productsViewPager");
        FrameLayout frameLayout = m49305q().f29667G;
        C41536l.m120488h(frameLayout, "messageBinding.productsSliderContainer");
        b.mo46116a(viewPager22, frameLayout);
        jVar.mo6029i(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public static final void m49290C(CustomIncomingMessageViewHolder customIncomingMessageViewHolder, String str) {
        C41536l.m120489i(customIncomingMessageViewHolder, "this$0");
        C41536l.m120489i(str, "it");
        C13081b bVar = customIncomingMessageViewHolder.f38490e;
        if (bVar != null) {
            bVar.mo34340a(new ComponentUi.C13079d(str));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public static final void m49291F(C13034j0 j0Var, CustomIncomingMessageViewHolder customIncomingMessageViewHolder, View view) {
        C41536l.m120489i(j0Var, "$message");
        C41536l.m120489i(customIncomingMessageViewHolder, "this$0");
        j0Var.mo34304s(false);
        customIncomingMessageViewHolder.m49305q().f29683p.setVisibility(8);
        C13081b bVar = customIncomingMessageViewHolder.f38490e;
        if (bVar != null) {
            bVar.mo34340a(new ComponentUi.C13078c("👍", "/feedback.like", true));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public static final void m49292G(C13034j0 j0Var, CustomIncomingMessageViewHolder customIncomingMessageViewHolder, View view) {
        C41536l.m120489i(j0Var, "$message");
        C41536l.m120489i(customIncomingMessageViewHolder, "this$0");
        j0Var.mo34304s(false);
        C13081b bVar = customIncomingMessageViewHolder.f38490e;
        if (bVar != null) {
            bVar.mo34340a(new ComponentUi.C13078c("👎", "/feedback.dislike", true));
        }
        customIncomingMessageViewHolder.m49305q().f29676i.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004a, code lost:
        if (r5 != null) goto L_0x004f;
     */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m49293H(p341ge.bog.chat.presentation.holders.CustomIncomingMessageViewHolder r4, p341ge.bog.chat.presentation.activity.C13034j0 r5, p341ge.bog.designsystem.components.chips.Chip r6, int r7) {
        /*
            java.lang.String r7 = "this$0"
            kotlin.jvm.internal.C41536l.m120489i(r4, r7)
            java.lang.String r7 = "$message"
            kotlin.jvm.internal.C41536l.m120489i(r5, r7)
            java.lang.String r7 = "chip"
            kotlin.jvm.internal.C41536l.m120489i(r6, r7)
            ge.bog.chat.presentation.holders.CustomIncomingMessageViewHolder$b r7 = r4.f38490e
            if (r7 == 0) goto L_0x0058
            java.lang.CharSequence r0 = r6.getChipTitle()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.util.List r5 = r5.mo34294i()
            if (r5 == 0) goto L_0x004d
            java.util.Iterator r5 = r5.iterator()
        L_0x0025:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0041
            java.lang.Object r1 = r5.next()
            r2 = r1
            ge.bog.chat.presentation.activity.f r2 = (p341ge.bog.chat.presentation.activity.C13017f) r2
            java.lang.String r2 = r2.mo34257b()
            java.lang.CharSequence r3 = r6.getChipTitle()
            boolean r2 = kotlin.jvm.internal.C41536l.m120484d(r2, r3)
            if (r2 == 0) goto L_0x0025
            goto L_0x0042
        L_0x0041:
            r1 = 0
        L_0x0042:
            ge.bog.chat.presentation.activity.f r1 = (p341ge.bog.chat.presentation.activity.C13017f) r1
            if (r1 == 0) goto L_0x004d
            java.lang.String r5 = r1.mo34256a()
            if (r5 == 0) goto L_0x004d
            goto L_0x004f
        L_0x004d:
            java.lang.String r5 = ""
        L_0x004f:
            ge.bog.chat.presentation.holders.ComponentUi$c r6 = new ge.bog.chat.presentation.holders.ComponentUi$c
            r1 = 0
            r6.<init>(r0, r5, r1)
            r7.mo34340a(r6)
        L_0x0058:
            cg.h r4 = r4.m49305q()
            ge.bog.designsystem.components.chips.ChipGroup r4 = r4.f29676i
            r5 = 8
            r4.setVisibility(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.chat.presentation.holders.CustomIncomingMessageViewHolder.m49293H(ge.bog.chat.presentation.holders.CustomIncomingMessageViewHolder, ge.bog.chat.presentation.activity.j0, ge.bog.designsystem.components.chips.Chip, int):void");
    }

    /* renamed from: J */
    private final void m49294J(Input input, CalendarRangeComponent calendarRangeComponent, boolean z) {
        input.setOnClickListener(new C16566f(this, z, calendarRangeComponent, input));
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public static final void m49295K(CustomIncomingMessageViewHolder customIncomingMessageViewHolder, boolean z, CalendarRangeComponent calendarRangeComponent, Input input, View view) {
        C41536l.m120489i(customIncomingMessageViewHolder, "this$0");
        C41536l.m120489i(calendarRangeComponent, "$calendarRange");
        C41536l.m120489i(input, "$selector");
        C13081b bVar = customIncomingMessageViewHolder.f38490e;
        if (bVar != null) {
            bVar.mo34340a(new ComponentUi.C13077b(z, calendarRangeComponent.getPayloadFormat(), calendarRangeComponent.getDatePattern(), new C13085f(input, calendarRangeComponent)));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public final C10429h m49305q() {
        return (C10429h) this.f38489d.getValue();
    }

    /* renamed from: r */
    private final void m49306r(List list) {
        m49305q().f29672e.setOnClickListener(new C16567g(this, list));
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public static final void m49307s(CustomIncomingMessageViewHolder customIncomingMessageViewHolder, List list, View view) {
        String str;
        String str2;
        Boolean bool;
        CustomIncomingMessageViewHolder customIncomingMessageViewHolder2 = customIncomingMessageViewHolder;
        List list2 = list;
        C41536l.m120489i(customIncomingMessageViewHolder2, "this$0");
        C41536l.m120489i(list2, "$accountsComponent");
        C13081b bVar = customIncomingMessageViewHolder2.f38490e;
        if (bVar != null) {
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list2, 10));
            int i = 0;
            for (Object next : list) {
                int i2 = i + 1;
                if (i < 0) {
                    C41341q.m119917t();
                }
                AccountComponent accountComponent = (AccountComponent) next;
                String title = accountComponent.getTitle();
                String payload = accountComponent.getPayload();
                if (payload == null) {
                    str = "";
                } else {
                    str = payload;
                }
                String currency = accountComponent.getCurrency();
                if (currency == null) {
                    str2 = "";
                } else {
                    str2 = currency;
                }
                BigDecimal availableAmount = accountComponent.getAvailableAmount();
                if (availableAmount == null) {
                    availableAmount = BigDecimal.valueOf(0);
                    C41536l.m120488h(availableAmount, "valueOf(this.toLong())");
                }
                BigDecimal bigDecimal = availableAmount;
                String image = accountComponent.getImage();
                String textColorIsDark = accountComponent.getTextColorIsDark();
                if (textColorIsDark != null) {
                    String upperCase = textColorIsDark.toUpperCase(Locale.ROOT);
                    C41536l.m120488h(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    bool = Boolean.valueOf(C41536l.m120484d(upperCase, "N"));
                } else {
                    bool = null;
                }
                AccountSelectorComponentData accountSelectorComponentData = r4;
                AccountSelectorComponentData accountSelectorComponentData2 = new AccountSelectorComponentData(i, title, str, str2, bigDecimal, image, bool, false, 128, (DefaultConstructorMarker) null);
                arrayList.add(accountSelectorComponentData);
                i = i2;
            }
            bVar.mo34340a(new ComponentUi.C13076a(arrayList));
        }
    }

    /* renamed from: t */
    private final void m49308t(CalendarRangeComponent calendarRangeComponent) {
        m49305q().f29669I.setHintText((CharSequence) calendarRangeComponent.getStartDateTitle());
        m49305q().f29679l.setHintText((CharSequence) calendarRangeComponent.getEndDateTitle());
        Input input = m49305q().f29669I;
        C41536l.m120488h(input, "messageBinding.startDate");
        m49294J(input, calendarRangeComponent, true);
        Input input2 = m49305q().f29679l;
        C41536l.m120488h(input2, "messageBinding.endDate");
        m49294J(input2, calendarRangeComponent, false);
    }

    /* renamed from: u */
    private final void m49309u(Component component) {
        if (component instanceof AccountListComponent) {
            m49306r(((AccountListComponent) component).getAccountsList());
        } else if (component instanceof CalendarRangeComponent) {
            m49308t((CalendarRangeComponent) component);
        } else if (component instanceof FeedbackComponent) {
            m49312x((FeedbackComponent) component);
        } else if (component instanceof PreContractComponent) {
            m49313y((PreContractComponent) component);
        } else if (component instanceof ProductOfferComponent) {
            m49288A((ProductOfferComponent) component);
        } else if (component instanceof ProductsSliderComponentsList) {
            m49289B(((ProductsSliderComponentsList) component).getProducts());
        } else if (component instanceof FAQComponent) {
            m49310v((FAQComponent) component);
        }
    }

    /* renamed from: v */
    private final void m49310v(FAQComponent fAQComponent) {
        m49305q().f29681n.setText(fAQComponent.getButtonTitle());
        m49305q().f29680m.setOnClickListener(new C16565e(this, fAQComponent));
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public static final void m49311w(CustomIncomingMessageViewHolder customIncomingMessageViewHolder, FAQComponent fAQComponent, View view) {
        C41536l.m120489i(customIncomingMessageViewHolder, "this$0");
        C41536l.m120489i(fAQComponent, "$faqComponent");
        C13081b bVar = customIncomingMessageViewHolder.f38490e;
        if (bVar != null) {
            String pageTitle = fAQComponent.getPageTitle();
            List<FAQItem> faqData = fAQComponent.getFaqData();
            ArrayList arrayList = new ArrayList(C41343r.m119925u(faqData, 10));
            for (FAQItem fAQItem : faqData) {
                arrayList.add(new ComponentUi.FAQItemUI(fAQItem.getQuestion(), fAQItem.getAnswer(), false, 4, (DefaultConstructorMarker) null));
            }
            bVar.mo34340a(new ComponentUi.FAQComponentUi(pageTitle, arrayList));
        }
    }

    /* renamed from: x */
    private final void m49312x(FeedbackComponent feedbackComponent) {
        m49305q().f29682o.setIconVisible(false);
        m49305q().f29682o.setTitle(feedbackComponent.getMessage());
    }

    /* renamed from: y */
    private final void m49313y(PreContractComponent preContractComponent) {
        SmallStepsView smallStepsView = m49305q().f29693z;
        smallStepsView.setTitle(preContractComponent.getPreContractSummary());
        smallStepsView.setOnClickListener(new C16568h(this, preContractComponent));
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public static final void m49314z(CustomIncomingMessageViewHolder customIncomingMessageViewHolder, PreContractComponent preContractComponent, View view) {
        C41536l.m120489i(customIncomingMessageViewHolder, "this$0");
        C41536l.m120489i(preContractComponent, "$preContract");
        C13081b bVar = customIncomingMessageViewHolder.f38490e;
        if (bVar != null) {
            bVar.mo34340a(ComponentUi.PreContractComponentUi.f38474h.mo34378a(preContractComponent));
        }
    }

    /* renamed from: D */
    public boolean mo34404D() {
        return this.f38493h;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x03df, code lost:
        if (p517mg.C16683b.m59024a(r1) == false) goto L_0x03e3;
     */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBind(p341ge.bog.chat.presentation.activity.C13034j0 r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            java.lang.String r2 = "message"
            kotlin.jvm.internal.C41536l.m120489i(r1, r2)
            super.onBind(r19)
            android.view.View r2 = r0.itemView
            android.content.Context r2 = r2.getContext()
            ge.bog.chat.presentation.activity.g0 r3 = r19.mo34298m()
            if (r3 != 0) goto L_0x001a
            ge.bog.chat.presentation.activity.g0 r3 = p341ge.bog.chat.presentation.activity.C13027g0.NO_GROUP
        L_0x001a:
            android.view.ViewGroup r4 = r0.bubble
            android.graphics.drawable.Drawable r4 = r4.getBackground()
            int r5 = p341ge.bog.chat.presentation.activity.C13037k0.m49204c(r3, r1)
            r4.setLevel(r5)
            android.view.ViewGroup r4 = r0.bubble
            r5 = 0
            r4.setVisibility(r5)
            android.widget.TextView r4 = r0.text
            r6 = 8
            r4.setVisibility(r6)
            cg.h r4 = r18.m49305q()
            ge.bog.chat.presentation.view.TypingAnimationView r4 = r4.f29670J
            r4.setVisibility(r6)
            cg.h r4 = r18.m49305q()
            cg.f r4 = r4.f29684q
            android.widget.LinearLayout r4 = r4.mo3946b()
            r4.setVisibility(r6)
            cg.h r4 = r18.m49305q()
            cg.g r4 = r4.f29685r
            android.widget.FrameLayout r4 = r4.mo3946b()
            r4.setVisibility(r6)
            cg.h r4 = r18.m49305q()
            ge.bog.designsystem.components.chips.ChipGroup r4 = r4.f29676i
            r4.setVisibility(r6)
            cg.h r4 = r18.m49305q()
            ge.bog.designsystem.components.chips.ChipGroup r4 = r4.f29676i
            r4.mo35190t()
            pg.a r4 = r18.getImageLoader()
            java.lang.String r7 = "getImageLoader()"
            kotlin.jvm.internal.C41536l.m120488h(r4, r7)
            cg.h r7 = r18.m49305q()
            cg.g r7 = r7.f29685r
            ge.bog.chatkit.utils.RoundedImageView r7 = r7.f29659e
            java.lang.String r8 = "messageBinding.imageAtta…ut.messageImageAttachment"
            kotlin.jvm.internal.C41536l.m120488h(r7, r8)
            p341ge.bog.chat.presentation.activity.C13052o0.m49235a(r4, r7)
            cg.h r4 = r18.m49305q()
            android.widget.LinearLayout r4 = r4.f29683p
            r4.setVisibility(r6)
            cg.h r4 = r18.m49305q()
            ge.bog.designsystem.components.layersandshadows.LayerView r4 = r4.f29688u
            r4.setVisibility(r6)
            cg.h r4 = r18.m49305q()
            ge.bog.designsystem.components.accountpicker.AccountPickerView r4 = r4.f29672e
            java.lang.String r7 = "messageBinding.accountSelector"
            kotlin.jvm.internal.C41536l.m120488h(r4, r7)
            ge.bog.chat.domain.model.components.Component r7 = r19.mo34295j()
            boolean r7 = r7 instanceof p341ge.bog.chat.domain.model.components.AccountListComponent
            if (r7 == 0) goto L_0x00a9
            r7 = r5
            goto L_0x00aa
        L_0x00a9:
            r7 = r6
        L_0x00aa:
            r4.setVisibility(r7)
            cg.h r4 = r18.m49305q()
            ge.bog.designsystem.components.smallsteps.SmallStepsView r4 = r4.f29693z
            java.lang.String r7 = "messageBinding.preContract"
            kotlin.jvm.internal.C41536l.m120488h(r4, r7)
            ge.bog.chat.domain.model.components.Component r7 = r19.mo34295j()
            boolean r7 = r7 instanceof p341ge.bog.chat.domain.model.components.PreContractComponent
            if (r7 == 0) goto L_0x00c2
            r7 = r5
            goto L_0x00c3
        L_0x00c2:
            r7 = r6
        L_0x00c3:
            r4.setVisibility(r7)
            cg.h r4 = r18.m49305q()
            ge.bog.designsystem.components.layersandshadows.LayerView r4 = r4.f29661A
            java.lang.String r7 = "messageBinding.product"
            kotlin.jvm.internal.C41536l.m120488h(r4, r7)
            ge.bog.chat.domain.model.components.Component r7 = r19.mo34295j()
            boolean r7 = r7 instanceof p341ge.bog.chat.domain.model.components.ProductOfferComponent
            if (r7 == 0) goto L_0x00db
            r7 = r5
            goto L_0x00dc
        L_0x00db:
            r7 = r6
        L_0x00dc:
            r4.setVisibility(r7)
            cg.h r4 = r18.m49305q()
            ge.bog.designsystem.components.inlinefeedback2.InlineFeedback2 r4 = r4.f29682o
            java.lang.String r7 = "messageBinding.feedback"
            kotlin.jvm.internal.C41536l.m120488h(r4, r7)
            ge.bog.chat.domain.model.components.Component r7 = r19.mo34295j()
            boolean r7 = r7 instanceof p341ge.bog.chat.domain.model.components.FeedbackComponent
            if (r7 == 0) goto L_0x00f4
            r7 = r5
            goto L_0x00f5
        L_0x00f4:
            r7 = r6
        L_0x00f5:
            r4.setVisibility(r7)
            cg.h r4 = r18.m49305q()
            android.widget.LinearLayout r4 = r4.f29675h
            java.lang.String r7 = "messageBinding.calendarRange"
            kotlin.jvm.internal.C41536l.m120488h(r4, r7)
            ge.bog.chat.domain.model.components.Component r7 = r19.mo34295j()
            boolean r7 = r7 instanceof p341ge.bog.chat.domain.model.components.CalendarRangeComponent
            if (r7 == 0) goto L_0x010d
            r7 = r5
            goto L_0x010e
        L_0x010d:
            r7 = r6
        L_0x010e:
            r4.setVisibility(r7)
            cg.h r4 = r18.m49305q()
            android.widget.LinearLayout r4 = r4.f29666F
            java.lang.String r7 = "messageBinding.productsSlider"
            kotlin.jvm.internal.C41536l.m120488h(r4, r7)
            ge.bog.chat.domain.model.components.Component r7 = r19.mo34295j()
            boolean r7 = r7 instanceof p341ge.bog.chat.domain.model.components.ProductsSliderComponentsList
            if (r7 == 0) goto L_0x0126
            r7 = r5
            goto L_0x0127
        L_0x0126:
            r7 = r6
        L_0x0127:
            r4.setVisibility(r7)
            cg.h r4 = r18.m49305q()
            ge.bog.designsystem.components.layersandshadows.LayerView r4 = r4.f29680m
            java.lang.String r7 = "messageBinding.faqLayout"
            kotlin.jvm.internal.C41536l.m120488h(r4, r7)
            ge.bog.chat.domain.model.components.Component r7 = r19.mo34295j()
            boolean r7 = r7 instanceof p341ge.bog.chat.domain.model.components.FAQComponent
            if (r7 == 0) goto L_0x013f
            r7 = r5
            goto L_0x0140
        L_0x013f:
            r7 = r6
        L_0x0140:
            r4.setVisibility(r7)
            ge.bog.chat.presentation.activity.i0 r4 = r19.mo34300o()
            int[] r7 = p341ge.bog.chat.presentation.holders.CustomIncomingMessageViewHolder.C13082c.f38496a
            int r4 = r4.ordinal()
            r4 = r7[r4]
            r7 = 2
            r8 = 1
            if (r4 == r8) goto L_0x0267
            r9 = 3
            if (r4 == r7) goto L_0x0195
            if (r4 == r9) goto L_0x018a
            r3 = 4
            if (r4 == r3) goto L_0x015d
            goto L_0x0360
        L_0x015d:
            int r3 = p653wf.C18590s.chatbot_connecting_operator
            java.lang.String r3 = r2.getString(r3)
            java.lang.String r4 = "ctx.getString(R.string.c…tbot_connecting_operator)"
            kotlin.jvm.internal.C41536l.m120488h(r3, r4)
            android.widget.TextView r4 = r0.text
            hg.g r9 = r0.f38491f
            if (r9 == 0) goto L_0x0177
            java.lang.String r10 = "text.chatbot.redirection.in.progress"
            java.lang.String r9 = r9.mo34343a(r10, r3)
            if (r9 == 0) goto L_0x0177
            r3 = r9
        L_0x0177:
            r4.setText(r3)
            android.widget.TextView r3 = r0.text
            r3.setVisibility(r5)
            cg.h r3 = r18.m49305q()
            ge.bog.designsystem.components.layersandshadows.LayerView r3 = r3.f29688u
            r3.setVisibility(r5)
            goto L_0x0360
        L_0x018a:
            cg.h r3 = r18.m49305q()
            ge.bog.chat.presentation.view.TypingAnimationView r3 = r3.f29670J
            r3.setVisibility(r5)
            goto L_0x0360
        L_0x0195:
            fg.a r4 = r19.mo34290f()
            if (r4 == 0) goto L_0x01a3
            boolean r4 = p341ge.bog.chat.presentation.activity.C13037k0.m49202a(r4)
            if (r4 != r8) goto L_0x01a3
            r4 = r8
            goto L_0x01a4
        L_0x01a3:
            r4 = r5
        L_0x01a4:
            r10 = 0
            if (r4 == 0) goto L_0x01f2
            android.view.ViewGroup r4 = r0.bubble
            r4.setVisibility(r6)
            cg.h r4 = r18.m49305q()
            cg.g r4 = r4.f29685r
            android.widget.FrameLayout r4 = r4.mo3946b()
            r4.setVisibility(r5)
            int[] r3 = r3.mo34281b()
            cg.h r4 = r18.m49305q()
            cg.g r4 = r4.f29685r
            ge.bog.chatkit.utils.RoundedImageView r4 = r4.f29659e
            r11 = r3[r5]
            r12 = r3[r8]
            r13 = r3[r7]
            r3 = r3[r9]
            r4.mo34576e(r11, r12, r13, r3)
            pg.a r3 = r18.getImageLoader()
            cg.h r4 = r18.m49305q()
            cg.g r4 = r4.f29685r
            ge.bog.chatkit.utils.RoundedImageView r4 = r4.f29659e
            ge.bog.chat.presentation.activity.n0$a r9 = new ge.bog.chat.presentation.activity.n0$a
            fg.a r11 = r19.mo34290f()
            cg.h r12 = r18.m49305q()
            cg.g r12 = r12.f29685r
            android.widget.ProgressBar r12 = r12.f29660f
            r9.<init>(r11, r12)
            r3.mo34322a(r4, r10, r9)
            goto L_0x0360
        L_0x01f2:
            cg.h r3 = r18.m49305q()
            cg.f r3 = r3.f29684q
            android.widget.LinearLayout r3 = r3.mo3946b()
            r3.setVisibility(r5)
            cg.h r3 = r18.m49305q()
            cg.f r3 = r3.f29684q
            androidx.appcompat.widget.AppCompatTextView r3 = r3.f29655h
            fg.a r4 = r19.mo34290f()
            if (r4 == 0) goto L_0x0212
            java.lang.String r4 = r4.mo33555b()
            goto L_0x0213
        L_0x0212:
            r4 = r10
        L_0x0213:
            r3.setText(r4)
            fg.a r3 = r19.mo34290f()
            if (r3 == 0) goto L_0x0220
            java.lang.Long r10 = r3.mo33556c()
        L_0x0220:
            if (r10 == 0) goto L_0x025a
            cg.h r3 = r18.m49305q()
            cg.f r3 = r3.f29684q
            androidx.appcompat.widget.AppCompatTextView r3 = r3.f29656i
            int r4 = p653wf.C18590s.chat_message_attachment_file_size
            java.lang.Object[] r9 = new java.lang.Object[r8]
            hg.e r10 = p447hg.C15502e.f44008a
            fg.a r11 = r19.mo34290f()
            java.lang.Long r11 = r11.mo33556c()
            long r11 = r11.longValue()
            java.math.BigDecimal r10 = r10.mo42604b(r11)
            java.lang.String r10 = r10.toPlainString()
            r9[r5] = r10
            java.lang.String r4 = r2.getString(r4, r9)
            r3.setText(r4)
            cg.h r3 = r18.m49305q()
            cg.f r3 = r3.f29684q
            androidx.appcompat.widget.AppCompatTextView r3 = r3.f29656i
            r3.setVisibility(r5)
            goto L_0x0360
        L_0x025a:
            cg.h r3 = r18.m49305q()
            cg.f r3 = r3.f29684q
            androidx.appcompat.widget.AppCompatTextView r3 = r3.f29656i
            r3.setVisibility(r6)
            goto L_0x0360
        L_0x0267:
            ge.bog.chat.presentation.activity.d r3 = r19.mo34292h()
            if (r3 != 0) goto L_0x0340
            boolean r3 = r19.mo34297l()
            if (r3 == 0) goto L_0x0298
            cg.h r3 = r18.m49305q()
            android.widget.LinearLayout r3 = r3.f29683p
            r3.setVisibility(r5)
            cg.h r3 = r18.m49305q()
            ge.bog.designsystem.components.layersandshadows.LayerView r3 = r3.f29686s
            lg.a r4 = new lg.a
            r4.<init>(r1, r0)
            r3.setOnClickListener(r4)
            cg.h r3 = r18.m49305q()
            ge.bog.designsystem.components.layersandshadows.LayerView r3 = r3.f29677j
            lg.b r4 = new lg.b
            r4.<init>(r1, r0)
            r3.setOnClickListener(r4)
        L_0x0298:
            android.widget.TextView r3 = r0.text
            r3.setVisibility(r5)
            cg.h r3 = r18.m49305q()
            android.widget.FrameLayout r3 = r3.f29673f
            java.lang.String r4 = "messageBinding.bubble"
            kotlin.jvm.internal.C41536l.m120488h(r3, r4)
            java.lang.String r4 = r19.mo34285b()
            if (r4 == 0) goto L_0x02b7
            int r4 = r4.length()
            if (r4 != 0) goto L_0x02b5
            goto L_0x02b7
        L_0x02b5:
            r4 = r5
            goto L_0x02b8
        L_0x02b7:
            r4 = r8
        L_0x02b8:
            r4 = r4 ^ r8
            if (r4 == 0) goto L_0x02bd
            r4 = r5
            goto L_0x02be
        L_0x02bd:
            r4 = r6
        L_0x02be:
            r3.setVisibility(r4)
            ge.bog.chat.domain.model.components.Component r3 = r19.mo34295j()
            if (r3 == 0) goto L_0x02ca
            r0.m49309u(r3)
        L_0x02ca:
            java.util.List r3 = r19.mo34294i()
            if (r3 == 0) goto L_0x0360
            cg.h r4 = r18.m49305q()
            ge.bog.designsystem.components.chips.ChipGroup r4 = r4.f29676i
            r4.setVisibility(r5)
            java.util.Iterator r3 = r3.iterator()
        L_0x02dd:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0331
            java.lang.Object r4 = r3.next()
            ge.bog.chat.presentation.activity.f r4 = (p341ge.bog.chat.presentation.activity.C13017f) r4
            cg.h r9 = r18.m49305q()
            ge.bog.designsystem.components.chips.ChipGroup r9 = r9.f29676i
            ge.bog.designsystem.components.chips.Chip r15 = new ge.bog.designsystem.components.chips.Chip
            android.view.View r10 = r0.itemView
            android.content.Context r11 = r10.getContext()
            java.lang.String r10 = "itemView.context"
            kotlin.jvm.internal.C41536l.m120488h(r11, r10)
            r12 = 0
            r13 = 0
            r14 = 6
            r16 = 0
            r10 = r15
            r17 = r15
            r15 = r16
            r10.<init>(r11, r12, r13, r14, r15)
            ak.k2 r10 = r17.getBinding()
            ge.bog.designsystem.components.layersandshadows.LayerView r10 = r10.f27191e
            cg.h r11 = r18.m49305q()
            androidx.constraintlayout.widget.ConstraintLayout r11 = r11.mo3946b()
            android.content.Context r11 = r11.getContext()
            int r12 = p653wf.C18587p.chat_chips_border
            android.graphics.drawable.Drawable r11 = androidx.core.content.C0767a.m2895e(r11, r12)
            r10.setBackground(r11)
            java.lang.String r4 = r4.mo34257b()
            r10 = r17
            r10.setChipTitle(r4)
            r9.mo35183o(r10)
            goto L_0x02dd
        L_0x0331:
            cg.h r3 = r18.m49305q()
            ge.bog.designsystem.components.chips.ChipGroup r3 = r3.f29676i
            lg.c r4 = new lg.c
            r4.<init>(r0, r1)
            r3.setOnChipActivatedChangedListener(r4)
            goto L_0x0360
        L_0x0340:
            cg.h r3 = r18.m49305q()
            cg.f r3 = r3.f29684q
            android.widget.LinearLayout r3 = r3.mo3946b()
            r3.setVisibility(r5)
            cg.h r3 = r18.m49305q()
            cg.f r3 = r3.f29684q
            androidx.appcompat.widget.AppCompatTextView r3 = r3.f29655h
            ge.bog.chat.presentation.activity.d r4 = r19.mo34292h()
            java.lang.String r4 = r4.mo34243c()
            r3.setText(r4)
        L_0x0360:
            cg.h r3 = r18.m49305q()
            androidx.constraintlayout.widget.Group r3 = r3.f29687t
            ge.bog.chat.presentation.activity.g0 r4 = r19.mo34298m()
            if (r4 != 0) goto L_0x036e
            r4 = -1
            goto L_0x0376
        L_0x036e:
            int[] r9 = p341ge.bog.chat.presentation.holders.CustomIncomingMessageViewHolder.C13082c.f38497b
            int r4 = r4.ordinal()
            r4 = r9[r4]
        L_0x0376:
            if (r4 == r8) goto L_0x037b
            if (r4 == r7) goto L_0x037b
            goto L_0x037c
        L_0x037b:
            r6 = r5
        L_0x037c:
            r3.setVisibility(r6)
            cg.h r3 = r18.m49305q()
            androidx.appcompat.widget.AppCompatTextView r3 = r3.f29692y
            qg.c r4 = r19.mo34287d()
            java.lang.String r4 = r4.getName()
            r3.setText(r4)
            int r3 = p653wf.C18590s.chat_message_status_sent
            java.lang.String r3 = r2.getString(r3)
            java.lang.String r4 = "HH:mm"
            java.util.Date r6 = r19.mo34296k()
            java.lang.CharSequence r4 = android.text.format.DateFormat.format(r4, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            java.lang.String r3 = " "
            r6.append(r3)
            r6.append(r4)
            java.lang.String r3 = r6.toString()
            int r4 = p653wf.C18585n.chat_incoming_bubble_color
            cg.h r6 = r18.m49305q()
            androidx.appcompat.widget.AppCompatTextView r6 = r6.f29689v
            r6.setText(r3)
            android.view.ViewGroup r3 = r0.bubble
            android.graphics.drawable.Drawable r3 = r3.getBackground()
            android.content.res.ColorStateList r2 = androidx.core.content.C0767a.m2894d(r2, r4)
            androidx.core.graphics.drawable.C0836a.m3153o(r3, r2)
            ge.bog.chat.presentation.activity.i0 r1 = r19.mo34300o()
            ge.bog.chat.presentation.activity.i0 r2 = p341ge.bog.chat.presentation.activity.C13032i0.TEXT
            if (r1 != r2) goto L_0x03e2
            android.widget.TextView r1 = r0.text
            java.lang.String r2 = "text"
            kotlin.jvm.internal.C41536l.m120488h(r1, r2)
            boolean r1 = p517mg.C16683b.m59024a(r1)
            if (r1 != 0) goto L_0x03e2
            goto L_0x03e3
        L_0x03e2:
            r8 = r5
        L_0x03e3:
            r0.mo34407L(r8)
            boolean r1 = r18.mo34404D()
            if (r1 != 0) goto L_0x03ef
            r0.mo34409a(r5)
        L_0x03ef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.chat.presentation.holders.CustomIncomingMessageViewHolder.onBind(ge.bog.chat.presentation.activity.j0):void");
    }

    /* renamed from: I */
    public final void mo34406I(C13081b bVar) {
        this.f38490e = bVar;
    }

    /* renamed from: L */
    public void mo34407L(boolean z) {
        this.f38494i = z;
    }

    /* renamed from: M */
    public final void mo34408M(C15505g gVar) {
        this.f38491f = gVar;
    }

    /* renamed from: a */
    public void mo34409a(boolean z) {
        if (z) {
            this.bubble.setActivated(true);
            AppCompatTextView appCompatTextView = m49305q().f29689v;
            C41536l.m120488h(appCompatTextView, "messageBinding.messageStatus");
            C16683b.m59025b(appCompatTextView, 0);
        } else {
            this.bubble.setActivated(false);
            AppCompatTextView appCompatTextView2 = m49305q().f29689v;
            C41536l.m120488h(appCompatTextView2, "messageBinding.messageStatus");
            C16683b.m59025b(appCompatTextView2, 8);
        }
        this.f38495j = z;
    }

    /* renamed from: b */
    public boolean mo34410b() {
        return this.f38495j;
    }

    /* renamed from: c */
    public void mo34411c(boolean z) {
        this.f38493h = z;
    }

    /* renamed from: d */
    public boolean mo34412d() {
        return this.f38494i;
    }

    /* renamed from: f */
    public View mo34413f() {
        return this.f38492g;
    }
}
