package p341ge.bog.designsystem.components.accountselector;

import af1.C40303i;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.core.content.C0767a;
import androidx.core.view.ViewCompat;
import androidx.core.widget.C1314o;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C2379b;
import com.github.mikephil.charting.utils.Utils;
import he1.C41238w;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41551a;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import p045d.C5769a;
import p060e1.C5936i0;
import p060e1.C5946j0;
import p060e1.C5958l0;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.common.CropImageView;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.infobadge.InfoBadgeView;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.multipledots.HideableAmountView;
import p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView;
import p352ak.C10002r0;
import p490kh.C16423a;
import p601sg.C17778c;
import p601sg.C17779d;
import p601sg.C17780e;
import p601sg.C17786k;
import p601sg.C17787l;
import p601sg.C17788m;
import p615tg.C17961b;
import p615tg.C17962c;
import p642vh.C18355e0;
import p642vh.C18368l;
import p654wg.C18592a;
import p654wg.C18593b;
import p654wg.C18594c;
import p668xg.C18758b;
import p668xg.C18761c;
import p668xg.C18762d;
import p682yg.C18915a;
import p682yg.C18916b;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.designsystem.components.accountselector.AccountSelectorItemView */
public final class AccountSelectorItemView extends LayerView {

    /* renamed from: m */
    public static final C13141b f38684m = new C13141b((DefaultConstructorMarker) null);

    /* renamed from: n */
    static final /* synthetic */ C40303i[] f38685n;

    /* renamed from: d */
    private C13140a f38686d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C10002r0 f38687e;

    /* renamed from: f */
    private final C5936i0 f38688f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C18758b f38689g;

    /* renamed from: h */
    private C18915a f38690h;

    /* renamed from: i */
    private final C41555e f38691i;

    /* renamed from: j */
    private final C18355e0 f38692j;

    /* renamed from: k */
    private final C41555e f38693k;

    /* renamed from: l */
    private final C41555e f38694l;

    /* renamed from: ge.bog.designsystem.components.accountselector.AccountSelectorItemView$b */
    public static final class C13141b {
        private C13141b() {
        }

        public /* synthetic */ C13141b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.designsystem.components.accountselector.AccountSelectorItemView$c */
    public static final class C13142c extends RecyclerView.C1746o {

        /* renamed from: a */
        final /* synthetic */ AccountSelectorItemView f38702a;

        C13142c(AccountSelectorItemView accountSelectorItemView) {
            this.f38702a = accountSelectorItemView;
        }

        /* renamed from: e */
        public void mo5615e(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1726b0 b0Var) {
            C41536l.m120489i(rect, "outRect");
            C41536l.m120489i(view, "view");
            C41536l.m120489i(recyclerView, "parent");
            C41536l.m120489i(b0Var, "state");
            super.mo5615e(rect, view, recyclerView, b0Var);
            rect.right = (int) this.f38702a.getResources().getDimension(C17779d.f49645S1);
        }
    }

    /* renamed from: ge.bog.designsystem.components.accountselector.AccountSelectorItemView$d */
    public static final class C13143d extends C41553c {

        /* renamed from: a */
        final /* synthetic */ AccountSelectorItemView f38703a;

        /* renamed from: b */
        final /* synthetic */ Context f38704b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13143d(Object obj, AccountSelectorItemView accountSelectorItemView, Context context) {
            super(obj);
            this.f38703a = accountSelectorItemView;
            this.f38704b = context;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            Integer num = (Integer) obj2;
            if (!C41536l.m120484d((Integer) obj, num) && num != null) {
                this.f38703a.f38687e.f27452o.setButtonIconTint(C5769a.m23209a(this.f38704b, num.intValue()));
            }
        }
    }

    /* renamed from: ge.bog.designsystem.components.accountselector.AccountSelectorItemView$e */
    public static final class C13144e extends C41553c {

        /* renamed from: a */
        final /* synthetic */ AccountSelectorItemView f38705a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13144e(Object obj, AccountSelectorItemView accountSelectorItemView) {
            super(obj);
            this.f38705a = accountSelectorItemView;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            int i;
            C41536l.m120489i(iVar, "property");
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            ((Boolean) obj).booleanValue();
            this.f38705a.m49471k();
            LinearLayout linearLayout = this.f38705a.f38687e.f27443f;
            if (this.f38705a.mo34674p()) {
                i = 0;
            } else {
                i = 8;
            }
            linearLayout.setVisibility(i);
            Button button = this.f38705a.f38687e.f27452o;
            C41536l.m120488h(button, "binding.expandChevronImage");
            C16423a.m58541a(button, booleanValue, 200);
            C18916b unused = this.f38705a.getClass();
        }
    }

    /* renamed from: ge.bog.designsystem.components.accountselector.AccountSelectorItemView$f */
    public static final class C13145f extends C41553c {

        /* renamed from: a */
        final /* synthetic */ AccountSelectorItemView f38706a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13145f(Object obj, AccountSelectorItemView accountSelectorItemView) {
            super(obj);
            this.f38706a = accountSelectorItemView;
        }

        /* access modifiers changed from: protected */
        public boolean beforeChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            Currency currency = (Currency) obj2;
            Currency currency2 = (Currency) obj;
            C18758b e = this.f38706a.f38689g;
            if (currency == null) {
                return true;
            }
            return e.mo46533l(currency);
        }
    }

    static {
        Class<AccountSelectorItemView> cls = AccountSelectorItemView.class;
        f38685n = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "expandIconTint", "getExpandIconTint()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "chooseCurrencyText", "getChooseCurrencyText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "selectedCurrency", "getSelectedCurrency()Ljava/util/Currency;", 0)), C41520a0.m120439e(new C41539o(cls, "isExpanded", "isExpanded()Z", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AccountSelectorItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    private final C13142c getDecoration() {
        return new C13142c(this);
    }

    /* renamed from: h */
    private final void m49468h() {
        this.f38687e.f27444g.setOnClickListener(new C18593b(this));
        this.f38687e.f27452o.setOnClickListener(new C18594c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static final void m49469i(AccountSelectorItemView accountSelectorItemView, View view) {
        C41536l.m120489i(accountSelectorItemView, "this$0");
        accountSelectorItemView.m49474n();
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final void m49470j(AccountSelectorItemView accountSelectorItemView, View view) {
        C41536l.m120489i(accountSelectorItemView, "this$0");
        accountSelectorItemView.m49473m();
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final void m49471k() {
        ViewGroup viewGroup;
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null && ViewCompat.m3579V(viewGroup)) {
            C5958l0.m23912c(viewGroup);
            C5958l0.m23911b(viewGroup, this.f38688f);
        }
    }

    /* renamed from: l */
    private final InfoBadgeView m49472l(C18762d dVar) {
        String str;
        Context context = this.f38687e.mo3946b().getContext();
        C41536l.m120488h(context, "binding.root.context");
        InfoBadgeView infoBadgeView = new InfoBadgeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        infoBadgeView.setType(InfoBadgeView.C13346b.INTERACTIVE_CURRENCY_BADGE_LARGE);
        if (C41536l.m120484d(dVar.mo46543a(), BigDecimal.ZERO) || !dVar.mo46545c()) {
            str = null;
        } else {
            str = dVar.mo46543a().toString();
        }
        InfoBadgeView.m50233e(infoBadgeView, (String) null, str, dVar.mo46544b().getCurrencyCode(), 1, (Object) null);
        return infoBadgeView;
    }

    /* renamed from: m */
    private final void m49473m() {
        if (m49475o()) {
            setExpanded(!mo34674p());
        }
    }

    /* renamed from: n */
    private final void m49474n() {
        if (m49475o()) {
            setExpanded(!mo34674p());
        } else {
            m49476q();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.mo34684b();
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m49475o() {
        /*
            r3 = this;
            ge.bog.designsystem.components.accountselector.AccountSelectorItemView$a r0 = r3.f38686d
            r1 = 0
            if (r0 == 0) goto L_0x0010
            java.util.List r0 = r0.mo34684b()
            if (r0 == 0) goto L_0x0010
            int r0 = r0.size()
            goto L_0x0011
        L_0x0010:
            r0 = r1
        L_0x0011:
            r2 = 1
            if (r0 <= r2) goto L_0x0015
            r1 = r2
        L_0x0015:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.designsystem.components.accountselector.AccountSelectorItemView.m49475o():boolean");
    }

    /* renamed from: q */
    private final void m49476q() {
        List b;
        C18762d dVar;
        C18915a aVar;
        C13140a aVar2 = this.f38686d;
        if (aVar2 != null && (b = aVar2.mo34684b()) != null && (dVar = (C18762d) C41358y.m120009Y(b)) != null && (aVar = this.f38690h) != null) {
            aVar.mo42840a(0, new C18761c(dVar.mo46544b(), true, true));
        }
    }

    /* renamed from: r */
    private final void m49477r() {
        this.f38687e.f27452o.setVisibility(8);
        setExpanded(false);
    }

    /* renamed from: s */
    private final void m49478s() {
        this.f38687e.f27451n.setAdapter(this.f38689g);
        this.f38687e.f27451n.mo5351j(getDecoration());
        this.f38689g.mo46535n(new C18592a(this));
    }

    private final void setupBackgrounds(C13140a aVar) {
        int i;
        int i2;
        int i3;
        Image a = aVar.mo34683a();
        Image c = aVar.mo34685c();
        Boolean f = aVar.mo34689f();
        AppCompatImageView appCompatImageView = this.f38687e.f27442e;
        C41536l.m120488h(appCompatImageView, "binding.accountBackgroundImage");
        C18368l.m62746A(appCompatImageView, a, (C43075l) null, 2, (Object) null);
        CardView cardView = this.f38687e.f27455r;
        if (a != null) {
            i = 0;
        } else {
            i = 8;
        }
        cardView.setVisibility(i);
        setupFullBackground(c);
        AppCompatTextView appCompatTextView = this.f38687e.f27446i;
        Boolean bool = Boolean.TRUE;
        if (C41536l.m120484d(f, bool)) {
            i2 = C17786k.TextBody2White200Left;
        } else if (C41536l.m120484d(f, Boolean.FALSE)) {
            i2 = C17786k.TextBody2Black200Left;
        } else {
            i2 = C17786k.TextBody2InvertComponents200Left;
        }
        C1314o.m4575q(appCompatTextView, i2);
        AppCompatTextView appCompatTextView2 = this.f38687e.f27447j;
        if (C41536l.m120484d(f, bool)) {
            i3 = C17786k.TextH3White500Left;
        } else if (C41536l.m120484d(f, Boolean.FALSE)) {
            i3 = C17786k.TextH3Black400Left;
        } else {
            i3 = C17786k.TextH3InvertComponents400Left;
        }
        C1314o.m4575q(appCompatTextView2, i3);
    }

    private final void setupCurrencies(C13140a aVar) {
        this.f38687e.f27450m.removeAllViews();
        if (aVar.mo34684b().size() > 1) {
            setupForMultipleCurrencies(aVar);
        } else {
            m49477r();
        }
    }

    private final void setupForMultipleCurrencies(C13140a aVar) {
        this.f38687e.f27452o.setButtonIcon(C0767a.m2895e(getContext(), C17780e.f49648C));
        this.f38687e.f27452o.setVisibility(0);
        for (C18762d l : aVar.mo34684b()) {
            this.f38687e.f27450m.addView(m49472l(l));
        }
        C18758b bVar = this.f38689g;
        List<C18762d> b = aVar.mo34684b();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(b, 10));
        for (C18762d b2 : b) {
            arrayList.add(new C18761c(b2.mo46544b(), false, true));
        }
        bVar.mo46534m(arrayList);
    }

    private final void setupFullBackground(Image image) {
        CropImageView cropImageView = this.f38687e.f27453p;
        cropImageView.mo35305i(1.0f, Utils.FLOAT_EPSILON);
        if (image instanceof Image.Resource) {
            cropImageView.setImageResource(((Image.Resource) image).mo35391d());
            C41238w wVar = C41238w.f97225a;
        } else if (image instanceof Image.Drawable) {
            cropImageView.setImageDrawable(((Image.Drawable) image).mo35381d());
            C41238w wVar2 = C41238w.f97225a;
        } else if (image instanceof Image.Url) {
            C41536l.m120488h(C2379b.m9211u(cropImageView).mo7757y(((Image.Url) image).mo35411k()).mo7718L0(cropImageView), "with(this).load(background.url).into(this)");
        } else {
            cropImageView.setImageDrawable((Drawable) null);
            C41238w wVar3 = C41238w.f97225a;
        }
    }

    private final void setupTitleAndAmount(C13140a aVar) {
        this.f38687e.f27457t.setShowAmount(aVar.mo34686d().mo46545c());
        HideableAmountView hideableAmountView = this.f38687e.f27457t;
        String a = C17961b.f51154a.mo45631a(aVar.mo34686d().mo46544b().getCurrencyCode());
        if (a == null) {
            a = "";
        }
        hideableAmountView.setCurrencyText(" " + a);
        this.f38687e.f27446i.setText(aVar.mo34687e());
        AppCompatTextView appCompatTextView = this.f38687e.f27447j;
        C17962c cVar = C17962c.f51156a;
        BigDecimal a2 = aVar.mo34686d().mo46543a();
        String currencyCode = aVar.mo34686d().mo46544b().getCurrencyCode();
        C41536l.m120488h(currencyCode, "data.mainCurrencyInfo.currency.currencyCode");
        appCompatTextView.setText(cVar.mo45632a(a2, currencyCode));
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public static final void m49479t(AccountSelectorItemView accountSelectorItemView, int i, C18761c cVar) {
        C41536l.m120489i(accountSelectorItemView, "this$0");
        C41536l.m120489i(cVar, "info");
        C18915a aVar = accountSelectorItemView.f38690h;
        if (aVar != null) {
            aVar.mo42840a(i, cVar);
        }
        accountSelectorItemView.setSelectedCurrency(cVar.mo46538b());
    }

    public final CharSequence getChooseCurrencyText() {
        return this.f38692j.getValue(this, f38685n[1]);
    }

    public final Integer getExpandIconTint() {
        return (Integer) this.f38691i.getValue(this, f38685n[0]);
    }

    public final Currency getSelectedCurrency() {
        return (Currency) this.f38693k.getValue(this, f38685n[2]);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        super.onMeasure(i, i2);
        int size = this.f38687e.f27450m.getFlexLines().size();
        if (size == 0) {
            i6 = getResources().getDimensionPixelSize(C17779d.account_selector_header_no_line_height);
            Resources resources = getResources();
            int i7 = C17779d.account_selector_image_no_line_size;
            i5 = resources.getDimensionPixelSize(i7) + i6;
            i4 = getResources().getDimensionPixelSize(i7) + i6;
            i3 = getResources().getDimensionPixelSize(C17779d.account_selector_image_no_line_radius);
        } else if (size != 1) {
            i6 = getResources().getDimensionPixelSize(C17779d.account_selector_header_multiple_line_height);
            Resources resources2 = getResources();
            int i8 = C17779d.account_selector_image_multiple_line_size;
            i5 = resources2.getDimensionPixelSize(i8) + i6;
            i4 = getResources().getDimensionPixelSize(i8) + i6;
            i3 = getResources().getDimensionPixelSize(C17779d.account_selector_image_multiple_line_radius);
        } else {
            i6 = getResources().getDimensionPixelSize(C17779d.account_selector_header_single_line_height);
            Resources resources3 = getResources();
            int i9 = C17779d.account_selector_image_single_line_size;
            i5 = resources3.getDimensionPixelSize(i9) + i6;
            i4 = getResources().getDimensionPixelSize(i9) + i6;
            i3 = getResources().getDimensionPixelSize(C17779d.account_selector_image_single_line_radius);
        }
        this.f38687e.f27444g.getLayoutParams().height = i6;
        ViewGroup.LayoutParams layoutParams = this.f38687e.f27455r.getLayoutParams();
        layoutParams.height = i5;
        layoutParams.width = i4;
        this.f38687e.f27455r.setRadius((float) i3);
        super.onMeasure(i, i2);
    }

    /* renamed from: p */
    public final boolean mo34674p() {
        return ((Boolean) this.f38694l.getValue(this, f38685n[3])).booleanValue();
    }

    public void setActivated(boolean z) {
        super.setActivated(z);
        NotificationBadgeView notificationBadgeView = this.f38687e.f27448k;
        C41536l.m120488h(notificationBadgeView, "binding.activeBadge");
        C18368l.m62751F(notificationBadgeView, z, false, 2, (Object) null);
        this.f38687e.f27450m.setActivated(false);
    }

    public final void setChooseCurrencyText(CharSequence charSequence) {
        this.f38692j.setValue(this, f38685n[1], charSequence);
    }

    public final void setData(C13140a aVar) {
        C41536l.m120489i(aVar, "data");
        this.f38686d = aVar;
        setupTitleAndAmount(aVar);
        setupCurrencies(aVar);
        setupBackgrounds(aVar);
        AppCompatImageView appCompatImageView = this.f38687e.f27445h;
        C41536l.m120488h(appCompatImageView, "binding.accountSelectorPrimaryStarIcon");
        C18368l.m62751F(appCompatImageView, aVar.mo34690g(), false, 2, (Object) null);
    }

    public final void setExpandIconTint(Integer num) {
        this.f38691i.setValue(this, f38685n[0], num);
    }

    public final void setExpanded(boolean z) {
        this.f38694l.setValue(this, f38685n[3], Boolean.valueOf(z));
    }

    public final void setOnCurrencyItemSelectedListener(C18915a aVar) {
        C41536l.m120489i(aVar, "onCurrencyItemSelectedListener");
        this.f38690h = aVar;
    }

    public final void setOnExpandedListener(C18916b bVar) {
        C41536l.m120489i(bVar, "onExpandedListener");
    }

    public final void setSelectedCurrency(Currency currency) {
        this.f38693k.setValue(this, f38685n[2], currency);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AccountSelectorItemView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountSelectorItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        C10002r0 d = C10002r0.m36685d(LayoutInflater.from(context), this, true);
        C41536l.m120488h(d, "inflate(\n        LayoutI…ontext), this, true\n    )");
        this.f38687e = d;
        C5936i0 e = C5946j0.m23875c(context).mo19369e(C17788m.list_dropdown);
        C41536l.m120488h(e, "from(context).inflateTra…transition.list_dropdown)");
        this.f38688f = e;
        this.f38689g = new C18758b();
        C41551a aVar = C41551a.f97718a;
        this.f38691i = new C13143d((Object) null, this, context);
        TextView textView = d.f27449l;
        C41536l.m120488h(textView, "binding.chooseCurrencyText");
        this.f38692j = new C18355e0(textView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        this.f38693k = new C13145f((Object) null, this);
        this.f38694l = new C13144e(Boolean.FALSE, this);
        d.f27450m.setJustifyContent(0);
        m49468h();
        m49478s();
        C1314o.m4567i(d.f27447j, 1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C17787l.f50518s);
        C41536l.m120488h(obtainStyledAttributes, "context.obtainStyledAttr….AccountSelectorItemView)");
        String string = obtainStyledAttributes.getString(C17787l.f50534t);
        setChooseCurrencyText(string == null ? "" : string);
        setExpandIconTint(Integer.valueOf(obtainStyledAttributes.getResourceId(C17787l.f50550u, C17778c.f49637v)));
        obtainStyledAttributes.recycle();
        HideableAmountView hideableAmountView = d.f27457t;
        hideableAmountView.setInAnimation((Animation) null);
        hideableAmountView.setOutAnimation((Animation) null);
        hideableAmountView.setMeasureAllChildren(false);
    }

    /* renamed from: ge.bog.designsystem.components.accountselector.AccountSelectorItemView$a */
    public static final class C13140a {

        /* renamed from: a */
        private final String f38695a;

        /* renamed from: b */
        private final C18762d f38696b;

        /* renamed from: c */
        private final List f38697c;

        /* renamed from: d */
        private final boolean f38698d;

        /* renamed from: e */
        private final Image f38699e;

        /* renamed from: f */
        private final Image f38700f;

        /* renamed from: g */
        private final Boolean f38701g;

        public C13140a(String str, C18762d dVar, List list, boolean z, Image image, Image image2, Boolean bool) {
            C41536l.m120489i(str, "title");
            C41536l.m120489i(dVar, "mainCurrencyInfo");
            C41536l.m120489i(list, "currencies");
            this.f38695a = str;
            this.f38696b = dVar;
            this.f38697c = list;
            this.f38698d = z;
            this.f38699e = image;
            this.f38700f = image2;
            this.f38701g = bool;
        }

        /* renamed from: a */
        public final Image mo34683a() {
            return this.f38699e;
        }

        /* renamed from: b */
        public final List mo34684b() {
            return this.f38697c;
        }

        /* renamed from: c */
        public final Image mo34685c() {
            return this.f38700f;
        }

        /* renamed from: d */
        public final C18762d mo34686d() {
            return this.f38696b;
        }

        /* renamed from: e */
        public final String mo34687e() {
            return this.f38695a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13140a)) {
                return false;
            }
            C13140a aVar = (C13140a) obj;
            return C41536l.m120484d(this.f38695a, aVar.f38695a) && C41536l.m120484d(this.f38696b, aVar.f38696b) && C41536l.m120484d(this.f38697c, aVar.f38697c) && this.f38698d == aVar.f38698d && C41536l.m120484d(this.f38699e, aVar.f38699e) && C41536l.m120484d(this.f38700f, aVar.f38700f) && C41536l.m120484d(this.f38701g, aVar.f38701g);
        }

        /* renamed from: f */
        public final Boolean mo34689f() {
            return this.f38701g;
        }

        /* renamed from: g */
        public final boolean mo34690g() {
            return this.f38698d;
        }

        public int hashCode() {
            int hashCode = ((((this.f38695a.hashCode() * 31) + this.f38696b.hashCode()) * 31) + this.f38697c.hashCode()) * 31;
            boolean z = this.f38698d;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            Image image = this.f38699e;
            int i2 = 0;
            int hashCode2 = (i + (image == null ? 0 : image.hashCode())) * 31;
            Image image2 = this.f38700f;
            int hashCode3 = (hashCode2 + (image2 == null ? 0 : image2.hashCode())) * 31;
            Boolean bool = this.f38701g;
            if (bool != null) {
                i2 = bool.hashCode();
            }
            return hashCode3 + i2;
        }

        public String toString() {
            String str = this.f38695a;
            C18762d dVar = this.f38696b;
            List list = this.f38697c;
            boolean z = this.f38698d;
            Image image = this.f38699e;
            Image image2 = this.f38700f;
            Boolean bool = this.f38701g;
            return "AccountData(title=" + str + ", mainCurrencyInfo=" + dVar + ", currencies=" + list + ", isPrimary=" + z + ", background=" + image + ", fullBackground=" + image2 + ", isDark=" + bool + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C13140a(String str, C18762d dVar, List list, boolean z, Image image, Image image2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, dVar, list, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : image, (i & 32) != 0 ? null : image2, (i & 64) != 0 ? null : bool);
        }
    }
}
