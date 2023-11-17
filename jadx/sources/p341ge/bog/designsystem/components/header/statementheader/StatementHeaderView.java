package p341ge.bog.designsystem.components.header.statementheader;

import af1.C40303i;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bumptech.glide.C2394j;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p035c4.C2247a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.infobadge.InfoBadgeView;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.pagestate.PageState;
import p352ak.C9905e5;
import p449hi.C15516b;
import p449hi.C15518c;
import p449hi.C15519d;
import p449hi.C15521e;
import p463ii.C15655a;
import p463ii.C15656b;
import p561pi.C17367b;
import p601sg.C17777b;
import p601sg.C17779d;
import p601sg.C17786k;
import p601sg.C17787l;
import p642vh.C18334a0;
import p642vh.C18355e0;
import p642vh.C18360h;
import p642vh.C18365j0;
import p642vh.C18368l;
import p642vh.C18374m;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.designsystem.components.header.statementheader.StatementHeaderView */
public final class StatementHeaderView extends LayerView {

    /* renamed from: p */
    public static final C13336a f39533p = new C13336a((DefaultConstructorMarker) null);

    /* renamed from: q */
    static final /* synthetic */ C40303i[] f39534q;

    /* renamed from: d */
    private final C17367b f39535d;

    /* renamed from: e */
    private final C9905e5 f39536e;

    /* renamed from: f */
    private final C18355e0 f39537f;

    /* renamed from: g */
    private final C18360h f39538g;

    /* renamed from: h */
    private final C18355e0 f39539h;

    /* renamed from: i */
    private final C18355e0 f39540i;

    /* renamed from: j */
    private final C18365j0 f39541j;

    /* renamed from: k */
    private final C18365j0 f39542k;

    /* renamed from: l */
    private final C18374m f39543l;

    /* renamed from: m */
    private List f39544m;

    /* renamed from: n */
    private C15516b f39545n;

    /* renamed from: o */
    private int f39546o;

    /* renamed from: ge.bog.designsystem.components.header.statementheader.StatementHeaderView$a */
    public static final class C13336a {
        private C13336a() {
        }

        public /* synthetic */ C13336a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.designsystem.components.header.statementheader.StatementHeaderView$d */
    static final class C13339d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C13337b f39561d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13339d(C13337b bVar) {
            super(1);
            this.f39561d = bVar;
        }

        /* renamed from: a */
        public final C2394j invoke(C2394j jVar) {
            C41536l.m120489i(jVar, "$this$setImage");
            if (!this.f39561d.mo35805c()) {
                return jVar;
            }
            C2247a d = jVar.mo7222d();
            C41536l.m120488h(d, "circleCrop()");
            return (C2394j) d;
        }
    }

    static {
        Class<StatementHeaderView> cls = StatementHeaderView.class;
        f39534q = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "title", "getTitle()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "date", "getDate()Ljava/util/Date;", 0)), C41520a0.m120439e(new C41539o(cls, NotificationMessage.NOTIF_KEY_SUB_TITLE, "getSubtitle()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "text", "getText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "isInfoBadgeVisible", "isInfoBadgeVisible()Z", 0)), C41520a0.m120439e(new C41539o(cls, "isTextVisible", "isTextVisible()Z", 0)), C41520a0.m120439e(new C41539o(cls, "amount", "getAmount()Ljava/lang/CharSequence;", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StatementHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* renamed from: c */
    public static /* synthetic */ void m50190c(StatementHeaderView statementHeaderView, int i, String str, Integer num, C43064a aVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            num = null;
        }
        statementHeaderView.mo35783b(i, str, num, aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final void m50191e(C43064a aVar, View view) {
        C41536l.m120489i(aVar, "$onTextButtonClicked");
        aVar.invoke();
    }

    /* renamed from: g */
    private final void m50192g(int i) {
        C9905e5 e5Var = this.f39536e;
        e5Var.f26963n.setVisibility(i);
        e5Var.f26961l.setVisibility(i);
    }

    private final CharSequence getAmount() {
        return this.f39543l.getValue(this, f39534q[6]);
    }

    private final void setAmount(CharSequence charSequence) {
        this.f39543l.setValue(this, f39534q[6], charSequence);
    }

    private final void setButtonRecyclerVisibility(int i) {
        if (this.f39546o != i) {
            this.f39536e.f26954e.setVisibility(i);
        }
        this.f39546o = i;
    }

    private final void setImageAndTextsVisibility(int i) {
        C9905e5 e5Var = this.f39536e;
        e5Var.f26958i.setVisibility(i);
        e5Var.f26966q.setVisibility(i);
        e5Var.f26962m.setVisibility(i);
        e5Var.f26964o.setVisibility(i);
    }

    /* renamed from: b */
    public final void mo35783b(int i, String str, Integer num, C43064a aVar) {
        int i2;
        C41536l.m120489i(str, "title");
        setButtonRecyclerVisibility(0);
        if (this.f39544m.size() != 3) {
            this.f39536e.f26954e.setAdapter(this.f39545n);
            this.f39544m.add(new C15518c(i, str, aVar, num));
            this.f39545n.mo42630h(this.f39544m);
            ViewGroup.LayoutParams layoutParams = this.f39536e.f26954e.getLayoutParams();
            if (this.f39544m.size() == 1) {
                i2 = -1;
            } else {
                i2 = -2;
            }
            layoutParams.width = i2;
            invalidate();
        }
    }

    /* renamed from: d */
    public final void mo35784d(String str, C43064a aVar) {
        C41536l.m120489i(aVar, "onTextButtonClicked");
        Button button = this.f39536e.f26965p;
        button.setVisibility(0);
        if (str == null) {
            str = "";
        }
        button.setButtonText(str);
        button.setOnClickListener(new C15656b(aVar));
    }

    /* renamed from: f */
    public final void mo35785f() {
        this.f39544m.clear();
        this.f39545n.mo42630h(this.f39544m);
        setButtonRecyclerVisibility(8);
        invalidate();
    }

    public final C9905e5 getBinding() {
        return this.f39536e;
    }

    public final Date getDate() {
        return this.f39538g.getValue(this, f39534q[1]);
    }

    public final InfoBadgeView getInfoBadgeView() {
        InfoBadgeView infoBadgeView = this.f39536e.f26959j;
        C41536l.m120488h(infoBadgeView, "binding.infoBadge");
        return infoBadgeView;
    }

    public final PageState getStatementHeaderPageState() {
        PageState pageState = this.f39536e.f26960k;
        C41536l.m120488h(pageState, "binding.statementHeaderPageState");
        return pageState;
    }

    public final CharSequence getSubtitle() {
        return this.f39539h.getValue(this, f39534q[2]);
    }

    public final CharSequence getText() {
        return this.f39540i.getValue(this, f39534q[3]);
    }

    public final CharSequence getTitle() {
        return this.f39537f.getValue(this, f39534q[0]);
    }

    public final void setDate(Date date) {
        this.f39538g.setValue(this, f39534q[1], date);
    }

    public final void setImage(C13337b bVar) {
        boolean z;
        GradientDrawable gradientDrawable;
        int i;
        FrameLayout frameLayout = this.f39536e.f26958i;
        C41536l.m120488h(frameLayout, "binding.imageLayer");
        if (bVar != null) {
            z = true;
        } else {
            z = false;
        }
        C18368l.m62751F(frameLayout, z, false, 2, (Object) null);
        if (bVar != null) {
            int c = C0767a.m2893c(getContext(), 17170445);
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(C17779d.statement_header_image_border_size);
            Drawable background = this.f39536e.f26958i.getBackground();
            if (background instanceof GradientDrawable) {
                gradientDrawable = (GradientDrawable) background;
            } else {
                gradientDrawable = null;
            }
            if (gradientDrawable != null) {
                gradientDrawable.mutate();
                Color a = bVar.mo35803a();
                if (a != null) {
                    Context context = getContext();
                    C41536l.m120488h(context, "context");
                    i = a.mo35260a(context);
                } else {
                    i = c;
                }
                gradientDrawable.setColor(i);
                Color b = bVar.mo35804b();
                if (b != null) {
                    Context context2 = getContext();
                    C41536l.m120488h(context2, "context");
                    c = b.mo35260a(context2);
                }
                gradientDrawable.setStroke(dimensionPixelSize, c);
                C18334a0 e = bVar.mo35807e();
                Context context3 = getContext();
                C41536l.m120488h(context3, "context");
                gradientDrawable.setCornerRadius((float) e.mo46105a(context3));
            }
            ImageView imageView = this.f39536e.f26957h;
            C41536l.m120488h(imageView, "setImage$lambda$4");
            C18368l.m62777z(imageView, bVar.mo35808f(), new C13339d(bVar));
            if (bVar.mo35810h() != null) {
                Color h = bVar.mo35810h();
                C41536l.m120486f(h);
                Context context4 = imageView.getContext();
                C41536l.m120488h(context4, "context");
                imageView.setColorFilter(h.mo35260a(context4));
            } else {
                imageView.setColorFilter((ColorFilter) null);
            }
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams != null) {
                C18334a0 g = bVar.mo35809g();
                Context context5 = imageView.getContext();
                C41536l.m120488h(context5, "context");
                layoutParams.width = g.mo46105a(context5);
                C18334a0 g2 = bVar.mo35809g();
                Context context6 = imageView.getContext();
                C41536l.m120488h(context6, "context");
                layoutParams.height = g2.mo46105a(context6);
                imageView.setLayoutParams(layoutParams);
                FrameLayout frameLayout2 = this.f39536e.f26958i;
                C41536l.m120488h(frameLayout2, "binding.imageLayer");
                ViewGroup.LayoutParams layoutParams2 = frameLayout2.getLayoutParams();
                if (layoutParams2 != null) {
                    C18334a0 d = bVar.mo35806d();
                    Context context7 = getContext();
                    C41536l.m120488h(context7, "context");
                    layoutParams2.width = d.mo46105a(context7);
                    C18334a0 d2 = bVar.mo35806d();
                    Context context8 = getContext();
                    C41536l.m120488h(context8, "context");
                    layoutParams2.height = d2.mo46105a(context8);
                    frameLayout2.setLayoutParams(layoutParams2);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }

    public final void setIncludeTopSpacing(boolean z) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(C17779d.statement_header_top_padding);
        ConstraintLayout constraintLayout = this.f39536e.f26955f;
        C41536l.m120488h(constraintLayout, "binding.container");
        if (z) {
            dimensionPixelSize += getResources().getDimensionPixelSize(C17779d.statement_header_top_spacing);
        }
        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), dimensionPixelSize, constraintLayout.getPaddingRight(), constraintLayout.getPaddingBottom());
    }

    public final void setInfoBadgeVisible(boolean z) {
        this.f39541j.mo46151c(this, f39534q[4], z);
    }

    public final void setStatementCategory(C15655a aVar) {
        m50192g(8);
    }

    public final void setStatementHeaderPageStateVisibility(boolean z) {
        C9905e5 e5Var = this.f39536e;
        if (z) {
            e5Var.f26960k.setVisibility(0);
            setImageAndTextsVisibility(8);
            return;
        }
        e5Var.f26960k.setVisibility(8);
        setImageAndTextsVisibility(0);
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.f39539h.setValue(this, f39534q[2], charSequence);
    }

    public final void setText(CharSequence charSequence) {
        this.f39540i.setValue(this, f39534q[3], charSequence);
    }

    public final void setTextVisible(boolean z) {
        this.f39542k.mo46151c(this, f39534q[5], z);
    }

    public final void setTitle(CharSequence charSequence) {
        this.f39537f.setValue(this, f39534q[0], charSequence);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StatementHeaderView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* renamed from: ge.bog.designsystem.components.header.statementheader.StatementHeaderView$c */
    public static final class C13338c extends C13337b {

        /* renamed from: g */
        private final Image f39553g;

        /* renamed from: h */
        private final Color f39554h;

        /* renamed from: i */
        private final Color f39555i;

        /* renamed from: j */
        private final Color f39556j;

        /* renamed from: k */
        private final C18334a0 f39557k;

        /* renamed from: l */
        private final boolean f39558l;

        /* renamed from: m */
        private final C18334a0 f39559m;

        /* renamed from: n */
        private final C18334a0 f39560n;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ C13338c(p341ge.bog.designsystem.components.common.Image r6, p341ge.bog.designsystem.components.common.Color r7, p341ge.bog.designsystem.components.common.Color r8, p341ge.bog.designsystem.components.common.Color r9, p642vh.C18334a0 r10, boolean r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
            /*
                r5 = this;
                r0 = r12 & 2
                r1 = 0
                if (r0 == 0) goto L_0x0007
                r0 = r1
                goto L_0x0008
            L_0x0007:
                r0 = r7
            L_0x0008:
                r2 = r12 & 4
                if (r2 == 0) goto L_0x000d
                goto L_0x000e
            L_0x000d:
                r1 = r8
            L_0x000e:
                r2 = r12 & 8
                if (r2 == 0) goto L_0x001b
                ge.bog.designsystem.components.common.Color$Resource r2 = new ge.bog.designsystem.components.common.Color$Resource
                r3 = 17170445(0x106000d, float:2.461195E-38)
                r2.<init>(r3)
                goto L_0x001c
            L_0x001b:
                r2 = r9
            L_0x001c:
                r3 = r12 & 16
                if (r3 == 0) goto L_0x0027
                vh.a0$b r3 = new vh.a0$b
                r4 = 0
                r3.<init>(r4)
                goto L_0x0028
            L_0x0027:
                r3 = r10
            L_0x0028:
                r4 = r12 & 32
                if (r4 == 0) goto L_0x002e
                r4 = 1
                goto L_0x002f
            L_0x002e:
                r4 = r11
            L_0x002f:
                r7 = r5
                r8 = r6
                r9 = r0
                r10 = r1
                r11 = r2
                r12 = r3
                r13 = r4
                r7.<init>(r8, r9, r10, r11, r12, r13)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.designsystem.components.header.statementheader.StatementHeaderView.C13338c.<init>(ge.bog.designsystem.components.common.Image, ge.bog.designsystem.components.common.Color, ge.bog.designsystem.components.common.Color, ge.bog.designsystem.components.common.Color, vh.a0, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        /* renamed from: a */
        public Color mo35803a() {
            return this.f39556j;
        }

        /* renamed from: b */
        public Color mo35804b() {
            return this.f39555i;
        }

        /* renamed from: c */
        public boolean mo35805c() {
            return this.f39558l;
        }

        /* renamed from: d */
        public C18334a0 mo35806d() {
            return this.f39559m;
        }

        /* renamed from: e */
        public C18334a0 mo35807e() {
            return this.f39557k;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13338c)) {
                return false;
            }
            C13338c cVar = (C13338c) obj;
            return C41536l.m120484d(mo35808f(), cVar.mo35808f()) && C41536l.m120484d(mo35810h(), cVar.mo35810h()) && C41536l.m120484d(mo35804b(), cVar.mo35804b()) && C41536l.m120484d(mo35803a(), cVar.mo35803a()) && C41536l.m120484d(mo35807e(), cVar.mo35807e()) && mo35805c() == cVar.mo35805c();
        }

        /* renamed from: f */
        public Image mo35808f() {
            return this.f39553g;
        }

        /* renamed from: g */
        public C18334a0 mo35809g() {
            return this.f39560n;
        }

        /* renamed from: h */
        public Color mo35810h() {
            return this.f39554h;
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((mo35808f().hashCode() * 31) + (mo35810h() == null ? 0 : mo35810h().hashCode())) * 31;
            if (mo35804b() != null) {
                i = mo35804b().hashCode();
            }
            int hashCode2 = (((((hashCode + i) * 31) + mo35803a().hashCode()) * 31) + mo35807e().hashCode()) * 31;
            boolean c = mo35805c();
            if (c) {
                c = true;
            }
            return hashCode2 + (c ? 1 : 0);
        }

        public String toString() {
            Image f = mo35808f();
            Color h = mo35810h();
            Color b = mo35804b();
            Color a = mo35803a();
            C18334a0 e = mo35807e();
            boolean c = mo35805c();
            return "StatementHeaderThumbnail(image=" + f + ", tint=" + h + ", borderColor=" + b + ", backgroundColor=" + a + ", cornerRadius=" + e + ", circleCrop=" + c + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13338c(Image image, Color color, Color color2, Color color3, C18334a0 a0Var, boolean z) {
            super((Image) null, (Color) null, (Color) null, (Color) null, (C18334a0) null, false, 63, (DefaultConstructorMarker) null);
            Color color4 = color3;
            C18334a0 a0Var2 = a0Var;
            C41536l.m120489i(image, "image");
            C41536l.m120489i(color4, "backgroundColor");
            C41536l.m120489i(a0Var2, "cornerRadius");
            this.f39553g = image;
            this.f39554h = color;
            this.f39555i = color2;
            this.f39556j = color4;
            this.f39557k = a0Var2;
            this.f39558l = z;
            int i = C17779d.statement_header_thumbnail_size;
            this.f39559m = new C18334a0.C18335a(i);
            this.f39560n = new C18334a0.C18335a(i);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StatementHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        C41536l.m120489i(context2, "context");
        C17367b bVar = new C17367b((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
        bVar.mo44810m("###,##0.00");
        this.f39535d = bVar;
        C9905e5 c = C9905e5.m36332c(LayoutInflater.from(context), this);
        C41536l.m120488h(c, "inflate(\n        LayoutI…from(context), this\n    )");
        this.f39536e = c;
        AppCompatTextView appCompatTextView = c.f26966q;
        C41536l.m120488h(appCompatTextView, "binding.titleText");
        this.f39537f = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        AppCompatTextView appCompatTextView2 = c.f26962m;
        C41536l.m120488h(appCompatTextView2, "binding.subtitle");
        this.f39538g = new C18360h(appCompatTextView2, "dd MMMM yyyy", C18368l.m62759h(this));
        AppCompatTextView appCompatTextView3 = c.f26962m;
        C41536l.m120488h(appCompatTextView3, "binding.subtitle");
        this.f39539h = new C18355e0(appCompatTextView3, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        AppCompatTextView appCompatTextView4 = c.f26964o;
        C41536l.m120488h(appCompatTextView4, "binding.text");
        this.f39540i = new C18355e0(appCompatTextView4, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        InfoBadgeView infoBadgeView = c.f26959j;
        C41536l.m120488h(infoBadgeView, "binding.infoBadge");
        this.f39541j = new C18365j0(infoBadgeView, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        AppCompatTextView appCompatTextView5 = c.f26964o;
        C41536l.m120488h(appCompatTextView5, "binding.text");
        this.f39542k = new C18365j0(appCompatTextView5, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        AppCompatTextView appCompatTextView6 = c.f26964o;
        C41536l.m120488h(appCompatTextView6, "binding.text");
        this.f39543l = new C18374m(appCompatTextView6, bVar);
        this.f39544m = new ArrayList();
        this.f39545n = new C15516b();
        this.f39546o = 8;
        int[] iArr = C17787l.f50450nb;
        C41536l.m120488h(iArr, "StatementHeaderView");
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        setIncludeTopSpacing(obtainStyledAttributes.getBoolean(C17787l.f50466ob, true));
        setTextVisible(obtainStyledAttributes.getBoolean(C17787l.f50482pb, true));
        obtainStyledAttributes.recycle();
        setLayerStyle(C17786k.LayerRadiusBottom12Shadow30);
        setBackgroundColor(C18368l.m62755d(context2, C17777b.f49596k));
        C15516b bVar2 = new C15516b();
        this.f39545n = bVar2;
        bVar2.mo42631i(3);
        c.f26954e.setLayoutManager(new LinearLayoutManager(context2, 0, false));
        c.f26954e.mo5351j(new C15519d(context2, C15521e.StatementHeader));
    }

    /* renamed from: ge.bog.designsystem.components.header.statementheader.StatementHeaderView$b */
    public static abstract class C13337b {

        /* renamed from: a */
        private final Image f39547a;

        /* renamed from: b */
        private final Color f39548b;

        /* renamed from: c */
        private final Color f39549c;

        /* renamed from: d */
        private final Color f39550d;

        /* renamed from: e */
        private final C18334a0 f39551e;

        /* renamed from: f */
        private final boolean f39552f;

        public C13337b(Image image, Color color, Color color2, Color color3, C18334a0 a0Var, boolean z) {
            C41536l.m120489i(a0Var, "cornerRadius");
            this.f39547a = image;
            this.f39548b = color;
            this.f39549c = color2;
            this.f39550d = color3;
            this.f39551e = a0Var;
            this.f39552f = z;
        }

        /* renamed from: a */
        public abstract Color mo35803a();

        /* renamed from: b */
        public abstract Color mo35804b();

        /* renamed from: c */
        public abstract boolean mo35805c();

        /* renamed from: d */
        public abstract C18334a0 mo35806d();

        /* renamed from: e */
        public abstract C18334a0 mo35807e();

        /* renamed from: f */
        public abstract Image mo35808f();

        /* renamed from: g */
        public abstract C18334a0 mo35809g();

        /* renamed from: h */
        public abstract Color mo35810h();

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ C13337b(p341ge.bog.designsystem.components.common.Image r5, p341ge.bog.designsystem.components.common.Color r6, p341ge.bog.designsystem.components.common.Color r7, p341ge.bog.designsystem.components.common.Color r8, p642vh.C18334a0 r9, boolean r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
            /*
                r4 = this;
                r12 = r11 & 1
                r0 = 0
                if (r12 == 0) goto L_0x0007
                r12 = r0
                goto L_0x0008
            L_0x0007:
                r12 = r5
            L_0x0008:
                r5 = r11 & 2
                if (r5 == 0) goto L_0x000e
                r1 = r0
                goto L_0x000f
            L_0x000e:
                r1 = r6
            L_0x000f:
                r5 = r11 & 4
                if (r5 == 0) goto L_0x0015
                r2 = r0
                goto L_0x0016
            L_0x0015:
                r2 = r7
            L_0x0016:
                r5 = r11 & 8
                if (r5 == 0) goto L_0x001b
                goto L_0x001c
            L_0x001b:
                r0 = r8
            L_0x001c:
                r5 = r11 & 16
                r6 = 0
                if (r5 == 0) goto L_0x0026
                vh.a0$b r9 = new vh.a0$b
                r9.<init>(r6)
            L_0x0026:
                r3 = r9
                r5 = r11 & 32
                if (r5 == 0) goto L_0x002d
                r11 = r6
                goto L_0x002e
            L_0x002d:
                r11 = r10
            L_0x002e:
                r5 = r4
                r6 = r12
                r7 = r1
                r8 = r2
                r9 = r0
                r10 = r3
                r5.<init>(r6, r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.designsystem.components.header.statementheader.StatementHeaderView.C13337b.<init>(ge.bog.designsystem.components.common.Image, ge.bog.designsystem.components.common.Color, ge.bog.designsystem.components.common.Color, ge.bog.designsystem.components.common.Color, vh.a0, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
