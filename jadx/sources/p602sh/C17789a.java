package p602sh;

import af1.C40303i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bumptech.glide.C2379b;
import com.bumptech.glide.C2394j;
import com.bumptech.glide.C2396k;
import he1.C41238w;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41551a;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p352ak.C9886c2;
import p352ak.C9894d2;
import p601sg.C17780e;
import p601sg.C17786k;
import p642vh.C18350c;
import p642vh.C18353d0;
import p642vh.C18355e0;
import p642vh.C18368l;
import p642vh.C18380s;
import ue1.C43064a;

/* renamed from: sh.a */
public abstract class C17789a {

    /* renamed from: c */
    static final /* synthetic */ C40303i[] f50641c = {C41520a0.m120439e(new C41539o(C17789a.class, "drawableType", "getDrawableType()Lge/bog/designsystem/components/categorycard/CategoryCardType$DrawableType;", 0))};

    /* renamed from: a */
    private final C6201a f50642a;

    /* renamed from: b */
    private final C41555e f50643b;

    /* renamed from: sh.a$a */
    public enum C17790a {
        ICON(0),
        IMAGE(1),
        IMAGE_OVAL(2),
        IMAGE_LARGE(3);
        

        /* renamed from: e */
        public static final C17791a f50644e = null;

        /* renamed from: d */
        private final int f50650d;

        /* renamed from: sh.a$a$a */
        public static final class C17791a {
            private C17791a() {
            }

            public /* synthetic */ C17791a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C17790a mo45382a(int i) {
                boolean z;
                for (C17790a aVar : C17790a.values()) {
                    if (aVar.mo45381b() == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        return aVar;
                    }
                }
                return null;
            }
        }

        static {
            f50644e = new C17791a((DefaultConstructorMarker) null);
        }

        private C17790a(int i) {
            this.f50650d = i;
        }

        /* renamed from: b */
        public final int mo45381b() {
            return this.f50650d;
        }
    }

    /* renamed from: sh.a$b */
    public static class C17792b extends C17789a {

        /* renamed from: n */
        static final /* synthetic */ C40303i[] f50651n;

        /* renamed from: d */
        private final C9886c2 f50652d;

        /* renamed from: e */
        private final C18355e0 f50653e;

        /* renamed from: f */
        private final C18353d0 f50654f;

        /* renamed from: g */
        private final C18350c f50655g;

        /* renamed from: h */
        private LayerView f50656h;

        /* renamed from: i */
        private ImageView f50657i;

        /* renamed from: j */
        private boolean f50658j;

        /* renamed from: k */
        private Color f50659k;

        /* renamed from: l */
        private Image f50660l;

        /* renamed from: m */
        private Color f50661m;

        static {
            Class<C17792b> cls = C17792b.class;
            f50651n = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "text", "getText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "textColorStateList", "getTextColorStateList()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "backgroundColor", "getBackgroundColor()Lge/bog/designsystem/components/common/Color;", 0))};
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17792b(C9886c2 c2Var) {
            super(c2Var, (DefaultConstructorMarker) null);
            C41536l.m120489i(c2Var, "binding");
            this.f50652d = c2Var;
            AppCompatTextView appCompatTextView = c2Var.f26841f;
            C41536l.m120488h(appCompatTextView, "binding.cardText");
            this.f50653e = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            AppCompatTextView appCompatTextView2 = c2Var.f26841f;
            C41536l.m120488h(appCompatTextView2, "binding.cardText");
            this.f50654f = new C18353d0(appCompatTextView2);
            FrameLayout frameLayout = c2Var.f26840e;
            C41536l.m120488h(frameLayout, "binding.background");
            this.f50655g = new C18350c(frameLayout);
            LayerView layerView = c2Var.f26843h;
            C41536l.m120488h(layerView, "binding.imageContainer");
            this.f50656h = layerView;
            AppCompatImageView appCompatImageView = c2Var.f26842g;
            C41536l.m120488h(appCompatImageView, "binding.image");
            this.f50657i = appCompatImageView;
        }

        /* renamed from: c */
        public Color mo45360c() {
            return this.f50655g.getValue(this, f50651n[2]);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public ImageView mo45361d() {
            return this.f50657i;
        }

        /* renamed from: g */
        public boolean mo45364g() {
            return this.f50658j;
        }

        /* renamed from: h */
        public Image mo45365h() {
            return this.f50660l;
        }

        /* renamed from: i */
        public Color mo45366i() {
            return this.f50661m;
        }

        /* access modifiers changed from: protected */
        /* renamed from: j */
        public LayerView mo45367j() {
            return this.f50656h;
        }

        /* renamed from: k */
        public Color mo45368k() {
            return this.f50659k;
        }

        /* renamed from: l */
        public CharSequence mo45369l() {
            return this.f50653e.getValue(this, f50651n[0]);
        }

        /* renamed from: m */
        public ColorStateList mo45370m() {
            return this.f50654f.getValue(this, f50651n[1]);
        }

        /* renamed from: o */
        public void mo45372o(Color color) {
            this.f50655g.setValue(this, f50651n[2], color);
        }

        /* renamed from: q */
        public void mo45374q(boolean z) {
            if (this.f50658j != z) {
                AppCompatTextView appCompatTextView = this.f50652d.f26844i;
                C41536l.m120488h(appCompatTextView, "binding.placeHolderTextView");
                C18368l.m62751F(appCompatTextView, z, false, 2, (Object) null);
            }
            this.f50658j = z;
        }

        /* renamed from: t */
        public void mo45375t(Image image) {
            this.f50660l = image;
            mo45371n(image);
        }

        /* renamed from: u */
        public void mo45376u(Color color) {
            if (mo45363f() == C17790a.ICON) {
                this.f50661m = color;
            } else if (color != null) {
                throw new UnsupportedOperationException("Background color can be set only for Icon");
            }
            if (color == null) {
                color = new Color.Resource(17170445);
            }
            this.f50652d.f26843h.setBackgroundColor(color.mo35260a(mo45362e()));
        }

        /* renamed from: v */
        public void mo45377v(Color color) {
            this.f50659k = color;
            mo45378w(mo45363f());
        }

        /* renamed from: x */
        public void mo45379x(CharSequence charSequence) {
            this.f50653e.setValue(this, f50651n[0], charSequence);
        }

        /* renamed from: y */
        public void mo45380y(ColorStateList colorStateList) {
            C41536l.m120489i(colorStateList, "<set-?>");
            this.f50654f.setValue(this, f50651n[1], colorStateList);
        }
    }

    /* renamed from: sh.a$c */
    public static class C17793c extends C17789a {

        /* renamed from: n */
        static final /* synthetic */ C40303i[] f50662n;

        /* renamed from: d */
        private final C9894d2 f50663d;

        /* renamed from: e */
        private final C18355e0 f50664e;

        /* renamed from: f */
        private final C18353d0 f50665f;

        /* renamed from: g */
        private final C18350c f50666g;

        /* renamed from: h */
        private LayerView f50667h;

        /* renamed from: i */
        private ImageView f50668i;

        /* renamed from: j */
        private boolean f50669j;

        /* renamed from: k */
        private Color f50670k;

        /* renamed from: l */
        private Image f50671l;

        /* renamed from: m */
        private Color f50672m;

        static {
            Class<C17793c> cls = C17793c.class;
            f50662n = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "text", "getText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "textColorStateList", "getTextColorStateList()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "backgroundColor", "getBackgroundColor()Lge/bog/designsystem/components/common/Color;", 0))};
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17793c(C9894d2 d2Var) {
            super(d2Var, (DefaultConstructorMarker) null);
            C41536l.m120489i(d2Var, "binding");
            this.f50663d = d2Var;
            AppCompatTextView appCompatTextView = d2Var.f26883f;
            C41536l.m120488h(appCompatTextView, "binding.cardText");
            this.f50664e = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            AppCompatTextView appCompatTextView2 = d2Var.f26883f;
            C41536l.m120488h(appCompatTextView2, "binding.cardText");
            this.f50665f = new C18353d0(appCompatTextView2);
            FrameLayout frameLayout = d2Var.f26882e;
            C41536l.m120488h(frameLayout, "binding.background");
            this.f50666g = new C18350c(frameLayout);
            LayerView layerView = d2Var.f26885h;
            C41536l.m120488h(layerView, "binding.imageContainer");
            this.f50667h = layerView;
            AppCompatImageView appCompatImageView = d2Var.f26884g;
            C41536l.m120488h(appCompatImageView, "binding.image");
            this.f50668i = appCompatImageView;
        }

        /* renamed from: c */
        public Color mo45360c() {
            return this.f50666g.getValue(this, f50662n[2]);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public ImageView mo45361d() {
            return this.f50668i;
        }

        /* renamed from: g */
        public boolean mo45364g() {
            return this.f50669j;
        }

        /* renamed from: h */
        public Image mo45365h() {
            return this.f50671l;
        }

        /* renamed from: i */
        public Color mo45366i() {
            return this.f50672m;
        }

        /* access modifiers changed from: protected */
        /* renamed from: j */
        public LayerView mo45367j() {
            return this.f50667h;
        }

        /* renamed from: k */
        public Color mo45368k() {
            return this.f50670k;
        }

        /* renamed from: l */
        public CharSequence mo45369l() {
            return this.f50664e.getValue(this, f50662n[0]);
        }

        /* renamed from: m */
        public ColorStateList mo45370m() {
            return this.f50665f.getValue(this, f50662n[1]);
        }

        /* renamed from: o */
        public void mo45372o(Color color) {
            this.f50666g.setValue(this, f50662n[2], color);
        }

        /* renamed from: q */
        public void mo45374q(boolean z) {
            int i;
            if (this.f50669j != z) {
                AppCompatTextView appCompatTextView = this.f50663d.f26883f;
                if (z) {
                    i = 2;
                } else {
                    i = 0;
                }
                appCompatTextView.setMinLines(i);
            }
            this.f50669j = z;
        }

        /* renamed from: t */
        public void mo45375t(Image image) {
            this.f50671l = image;
            mo45371n(image);
        }

        /* renamed from: u */
        public void mo45376u(Color color) {
            if (mo45363f() == C17790a.ICON) {
                this.f50672m = color;
            } else if (color != null) {
                throw new UnsupportedOperationException("Background color can be set only for Icon");
            }
            if (color == null) {
                color = new Color.Resource(17170445);
            }
            this.f50663d.f26885h.setBackgroundColor(color.mo35260a(mo45362e()));
        }

        /* renamed from: v */
        public void mo45377v(Color color) {
            this.f50670k = color;
            mo45378w(mo45363f());
        }

        /* renamed from: x */
        public void mo45379x(CharSequence charSequence) {
            this.f50664e.setValue(this, f50662n[0], charSequence);
        }

        /* renamed from: y */
        public void mo45380y(ColorStateList colorStateList) {
            C41536l.m120489i(colorStateList, "<set-?>");
            this.f50665f.setValue(this, f50662n[1], colorStateList);
        }
    }

    /* renamed from: sh.a$d */
    public /* synthetic */ class C17794d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f50673a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                sh.a$a[] r0 = p602sh.C17789a.C17790a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                sh.a$a r1 = p602sh.C17789a.C17790a.IMAGE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                sh.a$a r1 = p602sh.C17789a.C17790a.IMAGE_LARGE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                sh.a$a r1 = p602sh.C17789a.C17790a.ICON     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                sh.a$a r1 = p602sh.C17789a.C17790a.IMAGE_OVAL     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f50673a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p602sh.C17789a.C17794d.<clinit>():void");
        }
    }

    /* renamed from: sh.a$e */
    public static final class C17795e extends C41553c {

        /* renamed from: a */
        final /* synthetic */ C17789a f50674a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17795e(Object obj, C17789a aVar) {
            super(obj);
            this.f50674a = aVar;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            C17790a aVar = (C17790a) obj2;
            if (((C17790a) obj) != aVar && aVar != null) {
                this.f50674a.m61467s(aVar);
                this.f50674a.mo45378w(aVar);
                this.f50674a.m61466r(aVar);
            }
        }
    }

    public /* synthetic */ C17789a(C6201a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public final void m61466r(C17790a aVar) {
        int i;
        int i2 = C17794d.f50673a[aVar.ordinal()];
        if (i2 == 3 || i2 == 4) {
            i = C17786k.LayerRadiusCircleShadow0;
        } else {
            i = C17786k.f49831n;
        }
        mo45367j().setLayerStyle(i);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00f9  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m61467s(p602sh.C17789a.C17790a r8) {
        /*
            r7 = this;
            android.content.Context r0 = r7.mo45362e()
            android.content.res.Resources r0 = r0.getResources()
            int r1 = p601sg.C17779d.category_card_view_image_container_height
            int r0 = r0.getDimensionPixelSize(r1)
            int[] r1 = p602sh.C17789a.C17794d.f50673a
            int r8 = r8.ordinal()
            r8 = r1[r8]
            r1 = 1
            if (r8 == r1) goto L_0x00a3
            r1 = 2
            if (r8 == r1) goto L_0x007a
            r1 = 3
            if (r8 == r1) goto L_0x0051
            r1 = 4
            if (r8 == r1) goto L_0x0027
            r8 = 0
            r1 = r8
            r2 = r1
            goto L_0x00ce
        L_0x0027:
            android.content.Context r8 = r7.mo45362e()
            android.content.res.Resources r8 = r8.getResources()
            int r1 = p601sg.C17779d.category_card_view_image_type_oval_size
            int r8 = r8.getDimensionPixelSize(r1)
            android.content.Context r2 = r7.mo45362e()
            android.content.res.Resources r2 = r2.getResources()
            int r1 = r2.getDimensionPixelSize(r1)
            android.content.Context r2 = r7.mo45362e()
            android.content.res.Resources r2 = r2.getResources()
            int r3 = p601sg.C17779d.category_card_view_image_container_width
            int r2 = r2.getDimensionPixelSize(r3)
            goto L_0x00cb
        L_0x0051:
            android.content.Context r8 = r7.mo45362e()
            android.content.res.Resources r8 = r8.getResources()
            int r1 = p601sg.C17779d.category_card_view_image_type_icon_size
            int r8 = r8.getDimensionPixelSize(r1)
            android.content.Context r2 = r7.mo45362e()
            android.content.res.Resources r2 = r2.getResources()
            int r1 = r2.getDimensionPixelSize(r1)
            android.content.Context r2 = r7.mo45362e()
            android.content.res.Resources r2 = r2.getResources()
            int r3 = p601sg.C17779d.category_card_view_image_container_width
            int r2 = r2.getDimensionPixelSize(r3)
            goto L_0x00cb
        L_0x007a:
            android.content.Context r8 = r7.mo45362e()
            android.content.res.Resources r8 = r8.getResources()
            int r1 = p601sg.C17779d.category_card_view_image_type_large_image_height
            int r8 = r8.getDimensionPixelSize(r1)
            android.content.Context r1 = r7.mo45362e()
            android.content.res.Resources r1 = r1.getResources()
            int r2 = p601sg.C17779d.category_card_view_image_type_large_image_width
            int r1 = r1.getDimensionPixelSize(r2)
            android.content.Context r3 = r7.mo45362e()
            android.content.res.Resources r3 = r3.getResources()
            int r2 = r3.getDimensionPixelSize(r2)
            goto L_0x00cb
        L_0x00a3:
            android.content.Context r8 = r7.mo45362e()
            android.content.res.Resources r8 = r8.getResources()
            int r1 = p601sg.C17779d.category_card_view_image_type_image_height
            int r8 = r8.getDimensionPixelSize(r1)
            android.content.Context r1 = r7.mo45362e()
            android.content.res.Resources r1 = r1.getResources()
            int r2 = p601sg.C17779d.category_card_view_image_type_image_width
            int r1 = r1.getDimensionPixelSize(r2)
            android.content.Context r3 = r7.mo45362e()
            android.content.res.Resources r3 = r3.getResources()
            int r2 = r3.getDimensionPixelSize(r2)
        L_0x00cb:
            r6 = r2
            r2 = r8
            r8 = r6
        L_0x00ce:
            ge.bog.designsystem.components.layersandshadows.LayerView r3 = r7.mo45367j()
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            java.lang.String r5 = "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"
            if (r4 == 0) goto L_0x00f9
            r4.width = r8
            r4.height = r0
            r3.setLayoutParams(r4)
            android.widget.ImageView r8 = r7.mo45361d()
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            if (r0 == 0) goto L_0x00f3
            r0.width = r1
            r0.height = r2
            r8.setLayoutParams(r0)
            return
        L_0x00f3:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            r8.<init>(r5)
            throw r8
        L_0x00f9:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            r8.<init>(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p602sh.C17789a.m61467s(sh.a$a):void");
    }

    /* renamed from: c */
    public abstract Color mo45360c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract ImageView mo45361d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final Context mo45362e() {
        Context context = this.f50642a.mo3946b().getContext();
        C41536l.m120488h(context, "binding.root.context");
        return context;
    }

    /* renamed from: f */
    public final C17790a mo45363f() {
        return (C17790a) this.f50643b.getValue(this, f50641c[0]);
    }

    /* renamed from: g */
    public abstract boolean mo45364g();

    /* renamed from: h */
    public abstract Image mo45365h();

    /* renamed from: i */
    public abstract Color mo45366i();

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract LayerView mo45367j();

    /* renamed from: k */
    public abstract Color mo45368k();

    /* renamed from: l */
    public abstract CharSequence mo45369l();

    /* renamed from: m */
    public abstract ColorStateList mo45370m();

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo45371n(Image image) {
        Object obj;
        int i;
        int i2;
        C2396k t = C2379b.m9210t(mo45362e());
        if (image != null) {
            obj = C18380s.m62796a(image, mo45362e());
        } else {
            obj = null;
        }
        C2394j x = t.mo7756x(obj);
        C17790a f = mo45363f();
        if (f == null) {
            i = -1;
        } else {
            i = C17794d.f50673a[f.ordinal()];
        }
        if (i == 1) {
            i2 = C17780e.f49666o1;
        } else if (i != 2) {
            i2 = C17780e.f49668q1;
        } else {
            i2 = C17780e.f49661j1;
        }
        ((C2394j) x.mo7220c0(i2)).mo7718L0(mo45361d());
    }

    /* renamed from: o */
    public abstract void mo45372o(Color color);

    /* renamed from: p */
    public final void mo45373p(C17790a aVar) {
        this.f50643b.setValue(this, f50641c[0], aVar);
    }

    /* renamed from: q */
    public abstract void mo45374q(boolean z);

    /* renamed from: t */
    public abstract void mo45375t(Image image);

    /* renamed from: u */
    public abstract void mo45376u(Color color);

    /* renamed from: v */
    public abstract void mo45377v(Color color);

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo45378w(C17790a aVar) {
        int i;
        C41238w wVar;
        if (aVar == null) {
            i = -1;
        } else {
            i = C17794d.f50673a[aVar.ordinal()];
        }
        if (i == 3) {
            try {
                Color k = mo45368k();
                if (k != null) {
                    mo45361d().setColorFilter(k.mo35260a(mo45362e()));
                    wVar = C41238w.f97225a;
                } else {
                    wVar = null;
                }
                if (wVar == null) {
                    mo45361d().setColorFilter((ColorFilter) null);
                }
            } catch (Exception unused) {
                mo45361d().setColorFilter((ColorFilter) null);
            }
        } else {
            mo45361d().setColorFilter((ColorFilter) null);
        }
    }

    /* renamed from: x */
    public abstract void mo45379x(CharSequence charSequence);

    /* renamed from: y */
    public abstract void mo45380y(ColorStateList colorStateList);

    private C17789a(C6201a aVar) {
        this.f50642a = aVar;
        C41551a aVar2 = C41551a.f97718a;
        this.f50643b = new C17795e((Object) null, this);
    }
}
