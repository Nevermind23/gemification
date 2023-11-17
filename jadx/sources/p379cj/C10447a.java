package p379cj;

import af1.C40303i;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.C0767a;
import com.bumptech.glide.C2379b;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41551a;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.Amount;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView;
import p352ak.C10027u4;
import p352ak.C10034v4;
import p561pi.C17365a;
import p561pi.C17367b;
import p601sg.C17779d;
import p601sg.C17780e;
import p615tg.C17961b;
import p642vh.C18355e0;
import p642vh.C18365j0;
import p642vh.C18368l;
import p642vh.C18376o;
import p642vh.C18378q;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: cj.a */
public abstract class C10447a {

    /* renamed from: d */
    static final /* synthetic */ C40303i[] f29748d = {C41520a0.m120439e(new C41539o(C10447a.class, "drawableType", "getDrawableType()Lge/bog/designsystem/components/productgroup/ProductGroupType$DrawableType;", 0))};

    /* renamed from: a */
    private final C6201a f29749a;

    /* renamed from: b */
    private C17365a f29750b;

    /* renamed from: c */
    private final C41555e f29751c;

    /* renamed from: cj.a$a */
    public enum C10448a {
        ICON(0),
        IMAGE(1),
        SMALL_ICON(2),
        SMALL_IMAGE(3);
        

        /* renamed from: e */
        public static final C10449a f29752e = null;

        /* renamed from: d */
        private final int f29758d;

        /* renamed from: cj.a$a$a */
        public static final class C10449a {
            private C10449a() {
            }

            public /* synthetic */ C10449a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C10448a mo27126a(int i) {
                boolean z;
                for (C10448a aVar : C10448a.values()) {
                    if (aVar.mo27125b() == i) {
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
            f29752e = new C10449a((DefaultConstructorMarker) null);
        }

        private C10448a(int i) {
            this.f29758d = i;
        }

        /* renamed from: b */
        public final int mo27125b() {
            return this.f29758d;
        }
    }

    /* renamed from: cj.a$b */
    public static class C10450b extends C10447a {

        /* renamed from: l */
        static final /* synthetic */ C40303i[] f29759l;

        /* renamed from: e */
        private final C10027u4 f29760e;

        /* renamed from: f */
        private final C18355e0 f29761f;

        /* renamed from: g */
        private final C18355e0 f29762g;

        /* renamed from: h */
        private final C18376o f29763h;

        /* renamed from: i */
        private final C18378q f29764i;

        /* renamed from: j */
        private final C41555e f29765j = new C10452b("", this);

        /* renamed from: k */
        private final C18365j0 f29766k;

        /* renamed from: cj.a$b$a */
        public /* synthetic */ class C10451a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f29767a;

            /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            static {
                /*
                    cj.a$a[] r0 = p379cj.C10447a.C10448a.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    cj.a$a r1 = p379cj.C10447a.C10448a.ICON     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    cj.a$a r1 = p379cj.C10447a.C10448a.IMAGE     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    cj.a$a r1 = p379cj.C10447a.C10448a.SMALL_ICON     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    cj.a$a r1 = p379cj.C10447a.C10448a.SMALL_IMAGE     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    f29767a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p379cj.C10447a.C10450b.C10451a.<clinit>():void");
            }
        }

        /* renamed from: cj.a$b$b */
        public static final class C10452b extends C41553c {

            /* renamed from: a */
            final /* synthetic */ C10450b f29768a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C10452b(Object obj, C10450b bVar) {
                super(obj);
                this.f29768a = bVar;
            }

            /* access modifiers changed from: protected */
            public void afterChange(C40303i iVar, Object obj, Object obj2) {
                C41536l.m120489i(iVar, "property");
                String str = (String) obj2;
                if (!C41536l.m120484d((String) obj, str)) {
                    C2379b.m9211u(this.f29768a.mo27127q().f27624g).mo7757y(str).mo7718L0(this.f29768a.mo27127q().f27624g);
                }
            }
        }

        static {
            Class<C10450b> cls = C10450b.class;
            f29759l = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "title", "getTitle()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "amount", "getAmount()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "icon", "getIcon()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120439e(new C41539o(cls, "iconTint", "getIconTint()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "imageUrl", "getImageUrl()Ljava/lang/String;", 0)), C41520a0.m120439e(new C41539o(cls, "isBadgeVisible", "isBadgeVisible()Z", 0))};
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10450b(C10027u4 u4Var) {
            super(u4Var, (DefaultConstructorMarker) null);
            C41536l.m120489i(u4Var, "binding");
            this.f29760e = u4Var;
            AppCompatTextView appCompatTextView = u4Var.f27626i;
            C41536l.m120488h(appCompatTextView, "binding.title");
            this.f29761f = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            AppCompatTextView appCompatTextView2 = u4Var.f27622e;
            C41536l.m120488h(appCompatTextView2, "binding.amount");
            this.f29762g = new C18355e0(appCompatTextView2, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            AppCompatImageView appCompatImageView = u4Var.f27624g;
            C41536l.m120488h(appCompatImageView, "binding.image");
            this.f29763h = new C18376o(appCompatImageView);
            AppCompatImageView appCompatImageView2 = u4Var.f27624g;
            C41536l.m120488h(appCompatImageView2, "binding.image");
            this.f29764i = new C18378q(appCompatImageView2);
            C41551a aVar = C41551a.f97718a;
            NotificationBadgeView notificationBadgeView = u4Var.f27623f;
            C41536l.m120488h(notificationBadgeView, "binding.badge");
            this.f29766k = new C18365j0(notificationBadgeView, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        }

        /* renamed from: c */
        public Drawable mo27111c() {
            return this.f29763h.getValue(this, f29759l[2]);
        }

        /* renamed from: d */
        public Integer mo27112d() {
            return this.f29764i.getValue(this, f29759l[3]);
        }

        /* renamed from: e */
        public String mo27113e() {
            return (String) this.f29765j.getValue(this, f29759l[4]);
        }

        /* renamed from: f */
        public CharSequence mo27114f() {
            return this.f29761f.getValue(this, f29759l[0]);
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public void mo27116h(CharSequence charSequence) {
            this.f29762g.setValue(this, f29759l[1], charSequence);
        }

        /* renamed from: i */
        public void mo27117i(boolean z) {
            this.f29766k.mo46151c(this, f29759l[5], z);
        }

        /* renamed from: k */
        public void mo27119k(Drawable drawable) {
            this.f29763h.setValue(this, f29759l[2], drawable);
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0119  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0122  */
        /* renamed from: l */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo27120l(p379cj.C10447a.C10448a r9) {
            /*
                r8 = this;
                java.lang.String r0 = "drawableType"
                kotlin.jvm.internal.C41536l.m120489i(r9, r0)
                int[] r0 = p379cj.C10447a.C10450b.C10451a.f29767a
                int r9 = r9.ordinal()
                r9 = r0[r9]
                r0 = 1
                if (r9 == r0) goto L_0x00c9
                r1 = 2
                r2 = -2
                r3 = 0
                if (r9 == r1) goto L_0x0088
                r1 = 3
                if (r9 == r1) goto L_0x005f
                r1 = 4
                if (r9 == r1) goto L_0x001f
                r9 = r3
                r2 = r9
                goto L_0x00f4
            L_0x001f:
                android.content.Context r9 = r8.mo27109a()
                android.content.res.Resources r9 = r9.getResources()
                int r1 = p601sg.C17779d.square_image_small
                int r9 = r9.getDimensionPixelSize(r1)
                android.content.Context r1 = r8.mo27109a()
                android.content.res.Resources r1 = r1.getResources()
                int r4 = p601sg.C17779d.f49645S1
                int r1 = r1.getDimensionPixelSize(r4)
                android.graphics.drawable.Drawable r4 = r8.mo27111c()
                if (r4 != 0) goto L_0x00c7
                java.lang.String r4 = r8.mo27113e()
                if (r4 == 0) goto L_0x004f
                int r4 = r4.length()
                if (r4 != 0) goto L_0x004e
                goto L_0x004f
            L_0x004e:
                r0 = r3
            L_0x004f:
                if (r0 == 0) goto L_0x00c7
                android.content.Context r0 = r8.mo27109a()
                int r3 = p601sg.C17780e.thumbnail_32_9
                android.graphics.drawable.Drawable r0 = androidx.core.content.C0767a.m2895e(r0, r3)
                r8.mo27119k(r0)
                goto L_0x00c7
            L_0x005f:
                android.content.Context r9 = r8.mo27109a()
                android.content.res.Resources r9 = r9.getResources()
                int r0 = p601sg.C17779d.square_icon_small
                int r2 = r9.getDimensionPixelSize(r0)
                android.content.Context r9 = r8.mo27109a()
                android.content.res.Resources r9 = r9.getResources()
                int r3 = r9.getDimensionPixelSize(r0)
                android.content.Context r9 = r8.mo27109a()
                android.content.res.Resources r9 = r9.getResources()
                int r0 = p601sg.C17779d.f49642K1
                int r9 = r9.getDimensionPixelSize(r0)
                goto L_0x00f1
            L_0x0088:
                android.content.Context r9 = r8.mo27109a()
                android.content.res.Resources r9 = r9.getResources()
                int r1 = p601sg.C17779d.square_image_height
                int r9 = r9.getDimensionPixelSize(r1)
                android.content.Context r1 = r8.mo27109a()
                android.content.res.Resources r1 = r1.getResources()
                int r4 = p601sg.C17779d.f49644Q1
                int r1 = r1.getDimensionPixelSize(r4)
                android.graphics.drawable.Drawable r4 = r8.mo27111c()
                if (r4 != 0) goto L_0x00c7
                java.lang.String r4 = r8.mo27113e()
                if (r4 == 0) goto L_0x00b8
                int r4 = r4.length()
                if (r4 != 0) goto L_0x00b7
                goto L_0x00b8
            L_0x00b7:
                r0 = r3
            L_0x00b8:
                if (r0 == 0) goto L_0x00c7
                android.content.Context r0 = r8.mo27109a()
                int r3 = p601sg.C17780e.f49661j1
                android.graphics.drawable.Drawable r0 = androidx.core.content.C0767a.m2895e(r0, r3)
                r8.mo27119k(r0)
            L_0x00c7:
                r3 = r1
                goto L_0x00f4
            L_0x00c9:
                android.content.Context r9 = r8.mo27109a()
                android.content.res.Resources r9 = r9.getResources()
                int r0 = p601sg.C17779d.square_icon_size
                int r2 = r9.getDimensionPixelSize(r0)
                android.content.Context r9 = r8.mo27109a()
                android.content.res.Resources r9 = r9.getResources()
                int r3 = r9.getDimensionPixelSize(r0)
                android.content.Context r9 = r8.mo27109a()
                android.content.res.Resources r9 = r9.getResources()
                int r0 = p601sg.C17779d.spacing_12
                int r9 = r9.getDimensionPixelSize(r0)
            L_0x00f1:
                r7 = r3
                r3 = r9
                r9 = r7
            L_0x00f4:
                ak.u4 r0 = r8.f29760e
                androidx.appcompat.widget.AppCompatImageView r0 = r0.f27624g
                java.lang.String r1 = "binding.image"
                kotlin.jvm.internal.C41536l.m120488h(r0, r1)
                int r4 = r0.getPaddingLeft()
                int r5 = r0.getPaddingTop()
                int r6 = r0.getPaddingRight()
                r0.setPadding(r4, r5, r6, r3)
                ak.u4 r0 = r8.f29760e
                androidx.appcompat.widget.AppCompatImageView r0 = r0.f27624g
                kotlin.jvm.internal.C41536l.m120488h(r0, r1)
                android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
                if (r1 == 0) goto L_0x0122
                r1.width = r2
                int r9 = r9 + r3
                r1.height = r9
                r0.setLayoutParams(r1)
                return
            L_0x0122:
                java.lang.NullPointerException r9 = new java.lang.NullPointerException
                java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"
                r9.<init>(r0)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: p379cj.C10447a.C10450b.mo27120l(cj.a$a):void");
        }

        /* renamed from: m */
        public void mo27121m(Integer num) {
            this.f29764i.setValue(this, f29759l[3], num);
        }

        /* renamed from: n */
        public void mo27122n(String str) {
            this.f29765j.setValue(this, f29759l[4], str);
        }

        /* renamed from: o */
        public void mo27123o(String str, Integer num, Integer num2) {
            C41536l.m120489i(str, "text");
            throw new IllegalStateException("Info badge is not available in ProductGroupType.Square");
        }

        /* renamed from: p */
        public void mo27124p(CharSequence charSequence) {
            this.f29761f.setValue(this, f29759l[0], charSequence);
        }

        /* renamed from: q */
        public final C10027u4 mo27127q() {
            return this.f29760e;
        }
    }

    /* renamed from: cj.a$c */
    public static class C10453c extends C10447a {

        /* renamed from: l */
        static final /* synthetic */ C40303i[] f29769l;

        /* renamed from: e */
        private final C10034v4 f29770e;

        /* renamed from: f */
        private final C18355e0 f29771f;

        /* renamed from: g */
        private final C18355e0 f29772g;

        /* renamed from: h */
        private final C18376o f29773h;

        /* renamed from: i */
        private final C18378q f29774i;

        /* renamed from: j */
        private final C41555e f29775j = new C10455b("", this);

        /* renamed from: k */
        private final C18365j0 f29776k;

        /* renamed from: cj.a$c$a */
        public /* synthetic */ class C10454a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f29777a;

            /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            static {
                /*
                    cj.a$a[] r0 = p379cj.C10447a.C10448a.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    cj.a$a r1 = p379cj.C10447a.C10448a.ICON     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    cj.a$a r1 = p379cj.C10447a.C10448a.IMAGE     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    cj.a$a r1 = p379cj.C10447a.C10448a.SMALL_ICON     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    cj.a$a r1 = p379cj.C10447a.C10448a.SMALL_IMAGE     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    f29777a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p379cj.C10447a.C10453c.C10454a.<clinit>():void");
            }
        }

        /* renamed from: cj.a$c$b */
        public static final class C10455b extends C41553c {

            /* renamed from: a */
            final /* synthetic */ C10453c f29778a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C10455b(Object obj, C10453c cVar) {
                super(obj);
                this.f29778a = cVar;
            }

            /* access modifiers changed from: protected */
            public void afterChange(C40303i iVar, Object obj, Object obj2) {
                C41536l.m120489i(iVar, "property");
                String str = (String) obj2;
                if (!C41536l.m120484d((String) obj, str)) {
                    C2379b.m9211u(this.f29778a.mo27128q().f27670g).mo7757y(str).mo7718L0(this.f29778a.mo27128q().f27670g);
                }
            }
        }

        static {
            Class<C10453c> cls = C10453c.class;
            f29769l = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "title", "getTitle()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "amount", "getAmount()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "icon", "getIcon()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120439e(new C41539o(cls, "iconTint", "getIconTint()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "imageUrl", "getImageUrl()Ljava/lang/String;", 0)), C41520a0.m120439e(new C41539o(cls, "isBadgeVisible", "isBadgeVisible()Z", 0))};
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10453c(C10034v4 v4Var) {
            super(v4Var, (DefaultConstructorMarker) null);
            C41536l.m120489i(v4Var, "binding");
            this.f29770e = v4Var;
            AppCompatTextView appCompatTextView = v4Var.f27673j;
            C41536l.m120488h(appCompatTextView, "binding.title");
            this.f29771f = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            AppCompatTextView appCompatTextView2 = v4Var.f27668e;
            C41536l.m120488h(appCompatTextView2, "binding.amount");
            this.f29772g = new C18355e0(appCompatTextView2, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            AppCompatImageView appCompatImageView = v4Var.f27670g;
            C41536l.m120488h(appCompatImageView, "binding.image");
            this.f29773h = new C18376o(appCompatImageView);
            AppCompatImageView appCompatImageView2 = v4Var.f27670g;
            C41536l.m120488h(appCompatImageView2, "binding.image");
            this.f29774i = new C18378q(appCompatImageView2);
            C41551a aVar = C41551a.f97718a;
            NotificationBadgeView notificationBadgeView = v4Var.f27669f;
            C41536l.m120488h(notificationBadgeView, "binding.badge");
            this.f29776k = new C18365j0(notificationBadgeView, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        }

        /* renamed from: c */
        public Drawable mo27111c() {
            return this.f29773h.getValue(this, f29769l[2]);
        }

        /* renamed from: d */
        public Integer mo27112d() {
            return this.f29774i.getValue(this, f29769l[3]);
        }

        /* renamed from: e */
        public String mo27113e() {
            return (String) this.f29775j.getValue(this, f29769l[4]);
        }

        /* renamed from: f */
        public CharSequence mo27114f() {
            return this.f29771f.getValue(this, f29769l[0]);
        }

        /* renamed from: g */
        public void mo27115g(Amount amount) {
            C41536l.m120489i(amount, "amount");
            AppCompatTextView appCompatTextView = this.f29770e.f27668e;
            C41536l.m120488h(appCompatTextView, "binding.amount");
            C18368l.m62751F(appCompatTextView, true, false, 2, (Object) null);
            LayerView layerView = this.f29770e.f27672i;
            C41536l.m120488h(layerView, "binding.infoWrapper");
            C18368l.m62751F(layerView, false, false, 2, (Object) null);
            C10447a.super.mo27115g(amount);
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public void mo27116h(CharSequence charSequence) {
            this.f29772g.setValue(this, f29769l[1], charSequence);
        }

        /* renamed from: i */
        public void mo27117i(boolean z) {
            this.f29776k.mo46151c(this, f29769l[5], z);
        }

        /* renamed from: k */
        public void mo27119k(Drawable drawable) {
            this.f29773h.setValue(this, f29769l[2], drawable);
        }

        /* access modifiers changed from: protected */
        /* renamed from: l */
        public void mo27120l(C10448a aVar) {
            int i;
            int i2;
            C41536l.m120489i(aVar, "drawableType");
            int i3 = C10454a.f29777a[aVar.ordinal()];
            boolean z = true;
            if (i3 != 1) {
                i2 = 0;
                if (i3 == 2) {
                    i = mo27109a().getResources().getDimensionPixelSize(C17779d.image_height);
                    if (mo27111c() == null) {
                        String e = mo27113e();
                        if (!(e == null || e.length() == 0)) {
                            z = false;
                        }
                        if (z) {
                            mo27119k(C0767a.m2895e(mo27109a(), C17780e.f49661j1));
                        }
                    }
                    i2 = -2;
                } else if (i3 == 3) {
                    throw new UnsupportedOperationException("Wide type does not supports small icon");
                } else if (i3 != 4) {
                    i = 0;
                } else {
                    throw new UnsupportedOperationException("Wide type does not supports small image");
                }
            } else {
                Resources resources = mo27109a().getResources();
                int i4 = C17779d.icon_size;
                i2 = resources.getDimensionPixelSize(i4);
                i = mo27109a().getResources().getDimensionPixelSize(i4);
            }
            AppCompatImageView appCompatImageView = this.f29770e.f27670g;
            C41536l.m120488h(appCompatImageView, "binding.image");
            ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = i2;
                layoutParams.height = i;
                appCompatImageView.setLayoutParams(layoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }

        /* renamed from: m */
        public void mo27121m(Integer num) {
            this.f29774i.setValue(this, f29769l[3], num);
        }

        /* renamed from: n */
        public void mo27122n(String str) {
            this.f29775j.setValue(this, f29769l[4], str);
        }

        /* renamed from: o */
        public void mo27123o(String str, Integer num, Integer num2) {
            C41536l.m120489i(str, "text");
            AppCompatTextView appCompatTextView = this.f29770e.f27668e;
            C41536l.m120488h(appCompatTextView, "binding.amount");
            C18368l.m62751F(appCompatTextView, false, false, 2, (Object) null);
            this.f29770e.f27671h.setText(str);
            if (num2 != null) {
                this.f29770e.f27672i.setBackgroundColor(num2.intValue());
            }
            if (num != null) {
                this.f29770e.f27671h.setTextColor(num.intValue());
            }
            LayerView layerView = this.f29770e.f27672i;
            C41536l.m120488h(layerView, "binding.infoWrapper");
            C18368l.m62751F(layerView, true, false, 2, (Object) null);
        }

        /* renamed from: p */
        public void mo27124p(CharSequence charSequence) {
            this.f29771f.setValue(this, f29769l[0], charSequence);
        }

        /* renamed from: q */
        public final C10034v4 mo27128q() {
            return this.f29770e;
        }
    }

    /* renamed from: cj.a$d */
    public static final class C10456d extends C41553c {

        /* renamed from: a */
        final /* synthetic */ C10447a f29779a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10456d(Object obj, C10447a aVar) {
            super(obj);
            this.f29779a = aVar;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            C10448a aVar = (C10448a) obj2;
            if (((C10448a) obj) != aVar && aVar != null) {
                this.f29779a.mo27120l(aVar);
            }
        }
    }

    public /* synthetic */ C10447a(C6201a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Context mo27109a() {
        Context context = this.f29749a.mo3946b().getContext();
        C41536l.m120488h(context, "binding.root.context");
        return context;
    }

    /* renamed from: b */
    public final C10448a mo27110b() {
        return (C10448a) this.f29751c.getValue(this, f29748d[0]);
    }

    /* renamed from: c */
    public abstract Drawable mo27111c();

    /* renamed from: d */
    public abstract Integer mo27112d();

    /* renamed from: e */
    public abstract String mo27113e();

    /* renamed from: f */
    public abstract CharSequence mo27114f();

    /* renamed from: g */
    public void mo27115g(Amount amount) {
        C41536l.m120489i(amount, "amount");
        C17365a aVar = this.f29750b;
        String bigDecimal = amount.mo34590d().toString();
        C41536l.m120488h(bigDecimal, "amount.amount.toString()");
        mo27116h(C17365a.C17366a.m60762a(aVar, bigDecimal, (String) null, C17961b.f51154a.mo45631a(amount.mo34592e()), 2, (Object) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo27116h(CharSequence charSequence);

    /* renamed from: i */
    public abstract void mo27117i(boolean z);

    /* renamed from: j */
    public final void mo27118j(C10448a aVar) {
        this.f29751c.setValue(this, f29748d[0], aVar);
    }

    /* renamed from: k */
    public abstract void mo27119k(Drawable drawable);

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract void mo27120l(C10448a aVar);

    /* renamed from: m */
    public abstract void mo27121m(Integer num);

    /* renamed from: n */
    public abstract void mo27122n(String str);

    /* renamed from: o */
    public abstract void mo27123o(String str, Integer num, Integer num2);

    /* renamed from: p */
    public abstract void mo27124p(CharSequence charSequence);

    private C10447a(C6201a aVar) {
        this.f29749a = aVar;
        C17367b bVar = new C17367b((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
        bVar.mo44810m("###,##0.00");
        this.f29750b = bVar;
        C41551a aVar2 = C41551a.f97718a;
        this.f29751c = new C10456d((Object) null, this);
    }
}
