package p341ge.bog.designsystem.components.packagecard;

import af1.C40303i;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0767a;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41551a;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.notificationbadgetext.NotificationBadgeTextView;
import p341ge.bog.designsystem.components.textbadge.TextBadgeView;
import p352ak.C10057z;
import p352ak.C9944j4;
import p601sg.C17778c;
import p601sg.C17779d;
import p601sg.C17787l;
import p642vh.C18368l;
import p684yi.C18919a;
import p684yi.C18920b;
import p684yi.C18921c;
import p684yi.C18922d;
import p684yi.C18923e;
import ue1.C43064a;

/* renamed from: ge.bog.designsystem.components.packagecard.PackageCardView */
public final class PackageCardView extends ConstraintLayout {

    /* renamed from: k */
    static final /* synthetic */ C40303i[] f39923k;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C9944j4 f39924d;

    /* renamed from: e */
    private final int f39925e;

    /* renamed from: f */
    private C13411a f39926f;

    /* renamed from: g */
    private Integer f39927g;

    /* renamed from: h */
    private final C41555e f39928h;

    /* renamed from: i */
    private final C41555e f39929i;

    /* renamed from: j */
    private final C41555e f39930j;

    /* renamed from: ge.bog.designsystem.components.packagecard.PackageCardView$a */
    public enum C13411a {
        WHITE(r5, C17778c.f49624d0, r5, C17778c.color_white_tr_150),
        BLACK(r13, C17778c.color_black_tr_200, r13, C17778c.color_black_tr_150),
        INVERT(r6, C17778c.f49636u, r6, C17778c.f49635t);
        

        /* renamed from: d */
        private final int f39935d;

        /* renamed from: e */
        private final int f39936e;

        /* renamed from: f */
        private final int f39937f;

        /* renamed from: g */
        private final int f39938g;

        private C13411a(int i, int i2, int i3, int i4) {
            this.f39935d = i;
            this.f39936e = i2;
            this.f39937f = i3;
            this.f39938g = i4;
        }

        /* renamed from: b */
        public final int mo36311b() {
            return this.f39938g;
        }

        /* renamed from: c */
        public final int mo36312c() {
            return this.f39937f;
        }

        /* renamed from: e */
        public final int mo36313e() {
            return this.f39936e;
        }

        /* renamed from: f */
        public final int mo36314f() {
            return this.f39935d;
        }
    }

    /* renamed from: ge.bog.designsystem.components.packagecard.PackageCardView$c */
    static final class C13413c implements View.OnClickListener {

        /* renamed from: d */
        final /* synthetic */ C18922d f39941d;

        C13413c(C18922d dVar) {
            this.f39941d = dVar;
        }

        public final void onClick(View view) {
            C43064a a;
            C18922d dVar = this.f39941d;
            if (dVar != null && (a = dVar.mo46960a()) != null) {
                a.invoke();
            }
        }
    }

    /* renamed from: ge.bog.designsystem.components.packagecard.PackageCardView$d */
    static final class C13414d implements View.OnClickListener {

        /* renamed from: d */
        final /* synthetic */ C18922d f39942d;

        C13414d(C18922d dVar) {
            this.f39942d = dVar;
        }

        public final void onClick(View view) {
            C43064a c;
            C18922d dVar = this.f39942d;
            if (dVar != null && (c = dVar.mo46962c()) != null) {
                c.invoke();
            }
        }
    }

    /* renamed from: ge.bog.designsystem.components.packagecard.PackageCardView$e */
    public static final class C13415e extends C41553c {

        /* renamed from: a */
        final /* synthetic */ PackageCardView f39943a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13415e(Object obj, PackageCardView packageCardView) {
            super(obj);
            this.f39943a = packageCardView;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0042  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0065  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0067  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x006a  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0074  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0079  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0099  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x009b  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x009e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void afterChange(af1.C40303i r8, java.lang.Object r9, java.lang.Object r10) {
            /*
                r7 = this;
                java.lang.String r0 = "property"
                kotlin.jvm.internal.C41536l.m120489i(r8, r0)
                yi.d r10 = (p684yi.C18922d) r10
                yi.d r9 = (p684yi.C18922d) r9
                boolean r8 = kotlin.jvm.internal.C41536l.m120484d(r9, r10)
                if (r8 != 0) goto L_0x00b3
                ge.bog.designsystem.components.packagecard.PackageCardView r8 = r7.f39943a
                ak.j4 r8 = r8.f39924d
                ge.bog.designsystem.components.buttons.Button r9 = r8.f27165t
                java.lang.String r0 = "primaryButton"
                kotlin.jvm.internal.C41536l.m120488h(r9, r0)
                r1 = 1
                r2 = 0
                if (r10 == 0) goto L_0x0033
                java.lang.String r3 = r10.mo46961b()
                if (r3 == 0) goto L_0x0033
                int r3 = r3.length()
                if (r3 <= 0) goto L_0x002e
                r3 = r1
                goto L_0x002f
            L_0x002e:
                r3 = r2
            L_0x002f:
                if (r3 != r1) goto L_0x0033
                r3 = r1
                goto L_0x0034
            L_0x0033:
                r3 = r2
            L_0x0034:
                r4 = 2
                r5 = 0
                p642vh.C18368l.m62751F(r9, r3, r2, r4, r5)
                ge.bog.designsystem.components.buttons.Button r9 = r8.f27165t
                if (r10 == 0) goto L_0x0042
                java.lang.String r3 = r10.mo46961b()
                goto L_0x0043
            L_0x0042:
                r3 = r5
            L_0x0043:
                r9.setButtonText(r3)
                ge.bog.designsystem.components.buttons.Button r9 = r8.f27165t
                ge.bog.designsystem.components.packagecard.PackageCardView$c r3 = new ge.bog.designsystem.components.packagecard.PackageCardView$c
                r3.<init>(r10)
                r9.setOnClickListener(r3)
                ge.bog.designsystem.components.buttons.Button r9 = r8.f27166u
                java.lang.String r3 = "secondaryButton"
                kotlin.jvm.internal.C41536l.m120488h(r9, r3)
                if (r10 == 0) goto L_0x006c
                java.lang.String r6 = r10.mo46963d()
                if (r6 == 0) goto L_0x006c
                int r6 = r6.length()
                if (r6 <= 0) goto L_0x0067
                r6 = r1
                goto L_0x0068
            L_0x0067:
                r6 = r2
            L_0x0068:
                if (r6 != r1) goto L_0x006c
                r6 = r1
                goto L_0x006d
            L_0x006c:
                r6 = r2
            L_0x006d:
                p642vh.C18368l.m62751F(r9, r6, r2, r4, r5)
                ge.bog.designsystem.components.buttons.Button r9 = r8.f27166u
                if (r10 == 0) goto L_0x0079
                java.lang.String r6 = r10.mo46963d()
                goto L_0x007a
            L_0x0079:
                r6 = r5
            L_0x007a:
                r9.setButtonText(r6)
                ge.bog.designsystem.components.buttons.Button r9 = r8.f27166u
                ge.bog.designsystem.components.packagecard.PackageCardView$d r6 = new ge.bog.designsystem.components.packagecard.PackageCardView$d
                r6.<init>(r10)
                r9.setOnClickListener(r6)
                android.widget.LinearLayout r9 = r8.f27153h
                java.lang.String r10 = "cardBottom"
                kotlin.jvm.internal.C41536l.m120488h(r9, r10)
                ge.bog.designsystem.components.buttons.Button r10 = r8.f27165t
                kotlin.jvm.internal.C41536l.m120488h(r10, r0)
                int r10 = r10.getVisibility()
                if (r10 != 0) goto L_0x009b
                r10 = r1
                goto L_0x009c
            L_0x009b:
                r10 = r2
            L_0x009c:
                if (r10 != 0) goto L_0x00b0
                ge.bog.designsystem.components.buttons.Button r8 = r8.f27166u
                kotlin.jvm.internal.C41536l.m120488h(r8, r3)
                int r8 = r8.getVisibility()
                if (r8 != 0) goto L_0x00ab
                r8 = r1
                goto L_0x00ac
            L_0x00ab:
                r8 = r2
            L_0x00ac:
                if (r8 == 0) goto L_0x00af
                goto L_0x00b0
            L_0x00af:
                r1 = r2
            L_0x00b0:
                p642vh.C18368l.m62751F(r9, r1, r2, r4, r5)
            L_0x00b3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.designsystem.components.packagecard.PackageCardView.C13415e.afterChange(af1.i, java.lang.Object, java.lang.Object):void");
        }
    }

    /* renamed from: ge.bog.designsystem.components.packagecard.PackageCardView$f */
    public static final class C13416f extends C41553c {

        /* renamed from: a */
        final /* synthetic */ PackageCardView f39944a;

        /* renamed from: b */
        final /* synthetic */ Context f39945b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13416f(Object obj, PackageCardView packageCardView, Context context) {
            super(obj);
            this.f39944a = packageCardView;
            this.f39945b = context;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            boolean z;
            String str;
            int i;
            Color b;
            C41536l.m120489i(iVar, "property");
            C18921c cVar = (C18921c) obj2;
            if (!C41536l.m120484d((C18921c) obj, cVar)) {
                C9944j4 h = this.f39944a.f39924d;
                LayerView layerView = h.f27163r;
                C41536l.m120488h(layerView, "limitInfoContainer");
                if (cVar != null) {
                    z = true;
                } else {
                    z = false;
                }
                String str2 = null;
                C18368l.m62751F(layerView, z, false, 2, (Object) null);
                TextView textView = h.f27164s;
                if (cVar != null) {
                    str = cVar.mo46956c();
                } else {
                    str = null;
                }
                textView.setText(str);
                TextView textView2 = h.f27162q;
                if (cVar != null) {
                    str2 = cVar.mo46954a();
                }
                textView2.setText(str2);
                LayerView layerView2 = h.f27163r;
                if (cVar == null || (b = cVar.mo46955b()) == null) {
                    i = C0767a.m2893c(this.f39945b, C17778c.f49623b0);
                } else {
                    i = b.mo35260a(this.f39945b);
                }
                layerView2.setBackgroundColor(i);
            }
        }
    }

    /* renamed from: ge.bog.designsystem.components.packagecard.PackageCardView$g */
    public static final class C13417g extends C41553c {

        /* renamed from: a */
        final /* synthetic */ PackageCardView f39946a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13417g(Object obj, PackageCardView packageCardView) {
            super(obj);
            this.f39946a = packageCardView;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            String str;
            String str2;
            String str3;
            String str4;
            boolean z;
            String str5;
            String str6;
            boolean z2;
            C41536l.m120489i(iVar, "property");
            C18919a aVar = (C18919a) obj2;
            if (!C41536l.m120484d((C18919a) obj, aVar)) {
                C9944j4 h = this.f39946a.f39924d;
                TextView textView = h.f27159n;
                if (aVar != null) {
                    str = aVar.mo46941e();
                } else {
                    str = null;
                }
                textView.setText(str);
                TextView textView2 = h.f27157l;
                if (aVar != null) {
                    str2 = aVar.mo46937a();
                } else {
                    str2 = null;
                }
                textView2.setText(str2);
                TextView textView3 = h.f27158m;
                if (aVar != null) {
                    str3 = aVar.mo46938b();
                } else {
                    str3 = null;
                }
                textView3.setText(str3);
                TextView textView4 = h.f27158m;
                C41536l.m120488h(textView4, "headerAmountDescription");
                if (aVar != null) {
                    str4 = aVar.mo46938b();
                } else {
                    str4 = null;
                }
                if (str4 == null || str4.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                C18368l.m62751F(textView4, !z, false, 2, (Object) null);
                TextBadgeView textBadgeView = h.f27151f;
                if (aVar != null) {
                    str5 = aVar.mo46940d();
                } else {
                    str5 = null;
                }
                textBadgeView.setBadgeText(str5);
                if (!(aVar == null || aVar.mo46939c() == null)) {
                    h.f27151f.setBackgroundTintColor(aVar.mo46939c());
                }
                TextBadgeView textBadgeView2 = h.f27151f;
                C41536l.m120488h(textBadgeView2, "badge");
                if (aVar != null) {
                    str6 = aVar.mo46940d();
                } else {
                    str6 = null;
                }
                if (str6 == null || str6.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C18368l.m62751F(textBadgeView2, !z2, false, 2, (Object) null);
            }
        }
    }

    static {
        Class<PackageCardView> cls = PackageCardView.class;
        f39923k = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "buttonData", "getButtonData()Lge/bog/designsystem/components/packagecard/PackageCardData$PackageCardButtonData;", 0)), C41520a0.m120439e(new C41539o(cls, "limitInfoData", "getLimitInfoData()Lge/bog/designsystem/components/packagecard/PackageCardData$LimitInfoData;", 0)), C41520a0.m120439e(new C41539o(cls, "headerData", "getHeaderData()Lge/bog/designsystem/components/packagecard/PackageCardData$HeaderData;", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PackageCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    public static /* synthetic */ void getForceWhiteTexts$annotations() {
    }

    private final int getSecondaryTextColor() {
        return C0767a.m2893c(getContext(), this.f39926f.mo36311b());
    }

    private final int getSecondaryTitleColor() {
        return C0767a.m2893c(getContext(), this.f39926f.mo36312c());
    }

    private final int getTextColor() {
        return C0767a.m2893c(getContext(), this.f39926f.mo36313e());
    }

    /* access modifiers changed from: private */
    public final int getTitleColor() {
        return C0767a.m2893c(getContext(), this.f39926f.mo36314f());
    }

    /* renamed from: j */
    private final C13412b m50398j(C18923e eVar) {
        Context context = getContext();
        C41536l.m120488h(context, "context");
        C13412b bVar = new C13412b(this, context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        bVar.mo36315h(eVar.mo46969c(), eVar.mo46968b(), eVar.mo46967a());
        int i = this.f39925e;
        bVar.setPadding(0, i, 0, i);
        return bVar;
    }

    /* renamed from: k */
    private final NotificationBadgeTextView m50399k(C18920b bVar) {
        int i;
        Context context = getContext();
        C41536l.m120488h(context, "context");
        NotificationBadgeTextView notificationBadgeTextView = new NotificationBadgeTextView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        notificationBadgeTextView.setText(bVar.mo46949e());
        notificationBadgeTextView.setIconProperties(new NotificationBadgeTextView.C13406a(bVar.mo46945a(), bVar.mo46948d(), (Integer) null, (Integer) null, bVar.mo46947c(), bVar.mo46946b(), 12, (DefaultConstructorMarker) null));
        if (bVar.mo46951f()) {
            i = getSecondaryTextColor();
        } else {
            i = getTitleColor();
        }
        notificationBadgeTextView.setTextColor(i);
        int i2 = this.f39925e;
        notificationBadgeTextView.setPadding(0, i2, 0, i2);
        return notificationBadgeTextView;
    }

    /* renamed from: l */
    private final void m50400l() {
        C9944j4 j4Var = this.f39924d;
        j4Var.f27157l.setTextColor(getTitleColor());
        j4Var.f27158m.setTextColor(getTextColor());
        j4Var.f27159n.setTextColor(getTitleColor());
        j4Var.f27164s.setTextColor(getSecondaryTitleColor());
        j4Var.f27162q.setTextColor(getSecondaryTitleColor());
    }

    public final Integer getBackgroundColor() {
        return this.f39927g;
    }

    public final C18922d getButtonData() {
        return (C18922d) this.f39928h.getValue(this, f39923k[0]);
    }

    public final boolean getForceWhiteTexts() {
        return this.f39926f == C13411a.WHITE;
    }

    public final C18919a getHeaderData() {
        return (C18919a) this.f39930j.getValue(this, f39923k[2]);
    }

    public final C18921c getLimitInfoData() {
        return (C18921c) this.f39929i.getValue(this, f39923k[1]);
    }

    public final void setBackgroundColor(Integer num) {
        this.f39927g = num;
        if (num != null) {
            num.intValue();
            this.f39924d.f27150e.setBackgroundColor(num.intValue());
        }
    }

    public final void setButtonData(C18922d dVar) {
        this.f39928h.setValue(this, f39923k[0], dVar);
    }

    public final void setForceWhiteTexts(boolean z) {
        C13411a aVar;
        if (z) {
            aVar = C13411a.WHITE;
        } else {
            aVar = C13411a.INVERT;
        }
        this.f39926f = aVar;
        m50400l();
    }

    public final void setHeaderData(C18919a aVar) {
        this.f39930j.setValue(this, f39923k[2], aVar);
    }

    public final void setInfoTextsData(List<C18920b> list) {
        boolean z;
        boolean z2;
        this.f39924d.f27160o.removeAllViews();
        View view = this.f39924d.f27156k;
        C41536l.m120488h(view, "binding.divider");
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        C18368l.m62751F(view, !z, false, 2, (Object) null);
        LinearLayout linearLayout = this.f39924d.f27160o;
        C41536l.m120488h(linearLayout, "binding.infoListContainer");
        if (list == null || list.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        C18368l.m62751F(linearLayout, true ^ z2, false, 2, (Object) null);
        if (list != null) {
            for (C18920b k : list) {
                this.f39924d.f27160o.addView(m50399k(k));
            }
        }
    }

    public final void setLimitInfoData(C18921c cVar) {
        this.f39929i.setValue(this, f39923k[1], cVar);
    }

    public final void setTheme(C13411a aVar) {
        C41536l.m120489i(aVar, "cardTheme");
        this.f39926f = aVar;
        m50400l();
    }

    public final void setTransactionsData(List<C18923e> list) {
        boolean z;
        boolean z2;
        this.f39924d.f27167v.removeAllViews();
        View view = this.f39924d.f27152g;
        C41536l.m120488h(view, "binding.bottomDivider");
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        C18368l.m62751F(view, !z, false, 2, (Object) null);
        LinearLayout linearLayout = this.f39924d.f27167v;
        C41536l.m120488h(linearLayout, "binding.transactionsListContainer");
        if (list == null || list.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        C18368l.m62751F(linearLayout, true ^ z2, false, 2, (Object) null);
        if (list != null) {
            for (C18923e j : list) {
                this.f39924d.f27167v.addView(m50398j(j));
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PackageCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PackageCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        C9944j4 c = C9944j4.m36473c(LayoutInflater.from(context), this);
        C41536l.m120488h(c, "inflate(\n        LayoutI…from(context), this\n    )");
        this.f39924d = c;
        this.f39925e = getResources().getDimensionPixelSize(C17779d.f49645S1);
        this.f39926f = C13411a.INVERT;
        C41551a aVar = C41551a.f97718a;
        this.f39928h = new C13415e((Object) null, this);
        this.f39929i = new C13416f((Object) null, this, context);
        this.f39930j = new C13417g((Object) null, this);
        int[] iArr = C17787l.f50480p9;
        C41536l.m120488h(iArr, "PackageCardView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        setBackgroundColor(Integer.valueOf(obtainStyledAttributes.getColor(C17787l.f50496q9, C0767a.m2893c(context, C17778c.f49633r))));
        setForceWhiteTexts(obtainStyledAttributes.getBoolean(C17787l.f50512r9, false));
        obtainStyledAttributes.recycle();
        m50400l();
    }

    /* renamed from: ge.bog.designsystem.components.packagecard.PackageCardView$b */
    public final class C13412b extends ConstraintLayout {

        /* renamed from: d */
        private C10057z f39939d;

        /* renamed from: e */
        final /* synthetic */ PackageCardView f39940e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13412b(PackageCardView packageCardView, Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            C41536l.m120489i(context, "context");
            this.f39940e = packageCardView;
            C10057z d = C10057z.m36890d(LayoutInflater.from(context), this, true);
            C41536l.m120488h(d, "inflate(LayoutInflater.from(context), this, true)");
            this.f39939d = d;
        }

        /* renamed from: h */
        public final void mo36315h(String str, String str2, String str3) {
            boolean z;
            this.f39939d.f27791h.setText(str);
            this.f39939d.f27789f.setText(str2);
            this.f39939d.f27790g.setText(str3);
            TextView textView = this.f39939d.f27790g;
            C41536l.m120488h(textView, "binding.transactionDescription");
            if (str3 == null || str3.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            C18368l.m62751F(textView, !z, false, 2, (Object) null);
            this.f39939d.f27791h.setTextColor(this.f39940e.getTitleColor());
            this.f39939d.f27789f.setTextColor(this.f39940e.getTitleColor());
            this.f39939d.f27790g.setTextColor(this.f39940e.getTitleColor());
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C13412b(PackageCardView packageCardView, Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(packageCardView, context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
        }
    }

    public final void setBackgroundColor(Color color) {
        C41536l.m120489i(color, "color");
        Context context = getContext();
        C41536l.m120488h(context, "context");
        setBackgroundColor(Integer.valueOf(color.mo35260a(context)));
    }
}
