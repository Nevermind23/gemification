package p341ge.bog.designsystem.components.productheader;

import af1.C40303i;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.C0767a;
import androidx.core.widget.C1314o;
import com.bumptech.glide.C2394j;
import com.bumptech.glide.load.engine.GlideException;
import com.github.mikephil.charting.utils.Utils;
import he1.C41238w;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41551a;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import p035c4.C2247a;
import p035c4.C2255g;
import p050d4.C5825i;
import p166m3.C7079a;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.common.CropImageView;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.infobadge.InfoBadgeView;
import p341ge.bog.designsystem.components.interactiveamount.InteractiveAmountView;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.textbadge.TextBadgeView;
import p352ak.C9904e4;
import p394dj.C12132a;
import p394dj.C12133b;
import p394dj.C12134c;
import p394dj.C12135d;
import p394dj.C12136e;
import p394dj.C12138g;
import p394dj.C12139h;
import p601sg.C17777b;
import p601sg.C17778c;
import p601sg.C17779d;
import p601sg.C17783h;
import p601sg.C17786k;
import p601sg.C17787l;
import p617ti.C17966a;
import p642vh.C18355e0;
import p642vh.C18368l;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.designsystem.components.productheader.NewProductHeaderView */
public final class NewProductHeaderView extends LayerView {

    /* renamed from: q */
    static final /* synthetic */ C40303i[] f40196q;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C9904e4 f40197d;

    /* renamed from: e */
    private final C18355e0 f40198e;

    /* renamed from: f */
    private final C41555e f40199f;

    /* renamed from: g */
    private final C41555e f40200g;

    /* renamed from: h */
    private Drawable f40201h;

    /* renamed from: i */
    private final C41555e f40202i;

    /* renamed from: j */
    private final C41555e f40203j;

    /* renamed from: k */
    private Drawable f40204k;

    /* renamed from: l */
    private final C41555e f40205l;

    /* renamed from: m */
    private final C41555e f40206m;

    /* renamed from: n */
    private final C41555e f40207n;

    /* renamed from: o */
    private final C41555e f40208o;

    /* renamed from: p */
    private final C41555e f40209p;

    /* renamed from: ge.bog.designsystem.components.productheader.NewProductHeaderView$a */
    public enum C13482a {
        BLACK(C17786k.TextBody2Black200Left, InteractiveAmountView.C13353a.BLACK, InfoBadgeView.C13346b.INTERACTIVE_CURRENCY_BADGE_BLACK_AMOUNT_LARGE, new Color.Attribute(C17777b.color_black_tr_200), new Color.Attribute(C17777b.color_black_tr_400), new Color.Attribute(C17777b.color_black_tr_25)),
        WHITE(r13, r14, r15, r1, new Color.Attribute(r4), new Color.Attribute(C17777b.color_white_tr_50)),
        COLOR(r8, r9, r10, new Color.Attribute(C17777b.f49599p), new Color.Attribute(C17777b.f49601r), new Color.Attribute(C17777b.f49600q)),
        COLOR_LOAN(r8, r9, r10, new Color.Attribute(r2), new Color.Attribute(r4), new Color.Resource(C17778c.color_negative_solid_400));
        

        /* renamed from: d */
        private final int f40215d;

        /* renamed from: e */
        private final InteractiveAmountView.C13353a f40216e;

        /* renamed from: f */
        private final InfoBadgeView.C13346b f40217f;

        /* renamed from: g */
        private final Color f40218g;

        /* renamed from: h */
        private final Color f40219h;

        /* renamed from: i */
        private final Color f40220i;

        private C13482a(int i, InteractiveAmountView.C13353a aVar, InfoBadgeView.C13346b bVar, Color color, Color color2, Color color3) {
            this.f40215d = i;
            this.f40216e = aVar;
            this.f40217f = bVar;
            this.f40218g = color;
            this.f40219h = color2;
            this.f40220i = color3;
        }

        /* renamed from: b */
        public final InteractiveAmountView.C13353a mo36627b() {
            return this.f40216e;
        }

        /* renamed from: c */
        public final InfoBadgeView.C13346b mo36628c() {
            return this.f40217f;
        }

        /* renamed from: e */
        public final Color mo36629e() {
            return this.f40220i;
        }

        /* renamed from: f */
        public final Color mo36630f() {
            return this.f40219h;
        }

        /* renamed from: g */
        public final Color mo36631g() {
            return this.f40218g;
        }

        /* renamed from: h */
        public final int mo36632h() {
            return this.f40215d;
        }
    }

    /* renamed from: ge.bog.designsystem.components.productheader.NewProductHeaderView$b */
    public enum C13483b {
        NORMAL(r1, r2),
        LARGE(r1, r2);
        

        /* renamed from: d */
        private final int f40224d;

        /* renamed from: e */
        private final int f40225e;

        private C13483b(int i, int i2) {
            this.f40224d = i;
            this.f40225e = i2;
        }

        /* renamed from: b */
        public final int mo36633b() {
            return this.f40225e;
        }

        /* renamed from: c */
        public final int mo36634c() {
            return this.f40224d;
        }
    }

    /* renamed from: ge.bog.designsystem.components.productheader.NewProductHeaderView$c */
    public /* synthetic */ class C13484c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40226a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                dj.h[] r0 = p394dj.C12139h.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                dj.h r1 = p394dj.C12139h.POSITIVE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                dj.h r1 = p394dj.C12139h.NEGATIVE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                dj.h r1 = p394dj.C12139h.NEUTRAL     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                dj.h r1 = p394dj.C12139h.PENDING     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f40226a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.designsystem.components.productheader.NewProductHeaderView.C13484c.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.designsystem.components.productheader.NewProductHeaderView$d */
    static final class C13485d extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C13485d f40227d = new C13485d();

        C13485d() {
            super(1);
        }

        /* renamed from: a */
        public final void mo36635a(C13482a aVar) {
            C41536l.m120489i(aVar, "it");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo36635a((C13482a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.designsystem.components.productheader.NewProductHeaderView$e */
    static final class C13486e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ NewProductHeaderView f40228d;

        /* renamed from: e */
        final /* synthetic */ Image f40229e;

        /* renamed from: f */
        final /* synthetic */ C43075l f40230f;

        /* renamed from: g */
        final /* synthetic */ C13482a f40231g;

        /* renamed from: ge.bog.designsystem.components.productheader.NewProductHeaderView$e$a */
        public static final class C13487a implements C2255g {

            /* renamed from: d */
            final /* synthetic */ NewProductHeaderView f40232d;

            /* renamed from: e */
            final /* synthetic */ Image f40233e;

            /* renamed from: f */
            final /* synthetic */ C43075l f40234f;

            /* renamed from: g */
            final /* synthetic */ C13482a f40235g;

            C13487a(NewProductHeaderView newProductHeaderView, Image image, C43075l lVar, C13482a aVar) {
                this.f40232d = newProductHeaderView;
                this.f40233e = image;
                this.f40234f = lVar;
                this.f40235g = aVar;
            }

            /* renamed from: a */
            public boolean onResourceReady(Drawable drawable, Object obj, C5825i iVar, C7079a aVar, boolean z) {
                this.f40232d.setHeaderType(this.f40235g);
                return false;
            }

            public boolean onLoadFailed(GlideException glideException, Object obj, C5825i iVar, boolean z) {
                Image.Url url;
                NewProductHeaderView newProductHeaderView = this.f40232d;
                Image image = this.f40233e;
                if (image instanceof Image.Url) {
                    url = (Image.Url) image;
                } else {
                    url = null;
                }
                newProductHeaderView.setErrorImage(url);
                this.f40234f.invoke(this.f40232d.getHeaderType());
                return false;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13486e(NewProductHeaderView newProductHeaderView, Image image, C43075l lVar, C13482a aVar) {
            super(1);
            this.f40228d = newProductHeaderView;
            this.f40229e = image;
            this.f40230f = lVar;
            this.f40231g = aVar;
        }

        /* renamed from: a */
        public final C2394j invoke(C2394j jVar) {
            C41536l.m120489i(jVar, "$this$setImage");
            C2394j N0 = jVar.mo7719N0(new C13487a(this.f40228d, this.f40229e, this.f40230f, this.f40231g));
            C41536l.m120488h(N0, "@JvmOverloads\n    fun se…       })\n        }\n    }");
            return N0;
        }
    }

    /* renamed from: ge.bog.designsystem.components.productheader.NewProductHeaderView$f */
    static final class C13488f extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C13488f f40236d = new C13488f();

        C13488f() {
            super(1);
        }

        /* renamed from: a */
        public final C2394j invoke(C2394j jVar) {
            C41536l.m120489i(jVar, "$this$setImage");
            C2247a d = jVar.mo7222d();
            C41536l.m120488h(d, "circleCrop()");
            return (C2394j) d;
        }
    }

    /* renamed from: ge.bog.designsystem.components.productheader.NewProductHeaderView$g */
    public static final class C13489g extends C41553c {

        /* renamed from: a */
        final /* synthetic */ NewProductHeaderView f40237a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13489g(Object obj, NewProductHeaderView newProductHeaderView) {
            super(obj);
            this.f40237a = newProductHeaderView;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            int i;
            C41536l.m120489i(iVar, "property");
            C13482a aVar = (C13482a) obj2;
            C13482a aVar2 = (C13482a) obj;
            C1314o.m4575q(this.f40237a.f40197d.f26952p, aVar.mo36632h());
            this.f40237a.f40197d.f26946j.setAmountType(aVar.mo36627b());
            AppCompatImageView appCompatImageView = this.f40237a.f40197d.f26942f;
            if (aVar == C13482a.COLOR || aVar == C13482a.COLOR_LOAN) {
                i = 0;
            } else {
                i = 8;
            }
            appCompatImageView.setVisibility(i);
        }
    }

    /* renamed from: ge.bog.designsystem.components.productheader.NewProductHeaderView$h */
    public static final class C13490h extends C41553c {

        /* renamed from: a */
        final /* synthetic */ NewProductHeaderView f40238a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13490h(Object obj, NewProductHeaderView newProductHeaderView) {
            super(obj);
            this.f40238a = newProductHeaderView;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            C13483b bVar = (C13483b) obj2;
            C13483b bVar2 = (C13483b) obj;
            this.f40238a.f40197d.f26951o.setLayoutParams(new FrameLayout.LayoutParams(this.f40238a.getResources().getDimensionPixelSize(bVar.mo36634c()), this.f40238a.getResources().getDimensionPixelSize(bVar.mo36633b())));
        }
    }

    /* renamed from: ge.bog.designsystem.components.productheader.NewProductHeaderView$i */
    public static final class C13491i extends C41553c {

        /* renamed from: a */
        final /* synthetic */ NewProductHeaderView f40239a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13491i(Object obj, NewProductHeaderView newProductHeaderView) {
            super(obj);
            this.f40239a = newProductHeaderView;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            Image.Url url;
            C41536l.m120489i(iVar, "property");
            String str = (String) obj2;
            String str2 = (String) obj;
            NewProductHeaderView newProductHeaderView = this.f40239a;
            if (C40439w.m117118v(str)) {
                url = null;
            } else {
                url = new Image.Url(str, (Image.Placeholder) null, (Image.Placeholder) null, (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 126, (DefaultConstructorMarker) null);
            }
            newProductHeaderView.setThumbnailImage(url);
        }
    }

    /* renamed from: ge.bog.designsystem.components.productheader.NewProductHeaderView$j */
    public static final class C13492j extends C41553c {

        /* renamed from: a */
        final /* synthetic */ NewProductHeaderView f40240a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13492j(Object obj, NewProductHeaderView newProductHeaderView) {
            super(obj);
            this.f40240a = newProductHeaderView;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            Drawable drawable = (Drawable) obj2;
            Drawable drawable2 = (Drawable) obj;
            NewProductHeaderView newProductHeaderView = this.f40240a;
            Image.Drawable drawable3 = null;
            if (drawable != null) {
                drawable3 = new Image.Drawable(drawable, (Boolean) null, 2, (DefaultConstructorMarker) null);
            }
            newProductHeaderView.setThumbnailImage(drawable3);
        }
    }

    /* renamed from: ge.bog.designsystem.components.productheader.NewProductHeaderView$k */
    public static final class C13493k extends C41553c {

        /* renamed from: a */
        final /* synthetic */ NewProductHeaderView f40241a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13493k(Object obj, NewProductHeaderView newProductHeaderView) {
            super(obj);
            this.f40241a = newProductHeaderView;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            Image.Url url;
            C41536l.m120489i(iVar, "property");
            String str = (String) obj2;
            String str2 = (String) obj;
            NewProductHeaderView newProductHeaderView = this.f40241a;
            if (C40439w.m117118v(str)) {
                url = null;
            } else {
                url = new Image.Url(str, (Image.Placeholder) null, (Image.Placeholder) null, (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 126, (DefaultConstructorMarker) null);
            }
            newProductHeaderView.setCircularImage(url);
        }
    }

    /* renamed from: ge.bog.designsystem.components.productheader.NewProductHeaderView$l */
    public static final class C13494l extends C41553c {

        /* renamed from: a */
        final /* synthetic */ NewProductHeaderView f40242a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13494l(Object obj, NewProductHeaderView newProductHeaderView) {
            super(obj);
            this.f40242a = newProductHeaderView;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            Drawable drawable = (Drawable) obj2;
            Drawable drawable2 = (Drawable) obj;
            NewProductHeaderView newProductHeaderView = this.f40242a;
            Image.Drawable drawable3 = null;
            if (drawable != null) {
                drawable3 = new Image.Drawable(drawable, (Boolean) null, 2, (DefaultConstructorMarker) null);
            }
            newProductHeaderView.setCircularImage(drawable3);
        }
    }

    /* renamed from: ge.bog.designsystem.components.productheader.NewProductHeaderView$m */
    public static final class C13495m extends C41553c {

        /* renamed from: a */
        final /* synthetic */ NewProductHeaderView f40243a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13495m(Object obj, NewProductHeaderView newProductHeaderView) {
            super(obj);
            this.f40243a = newProductHeaderView;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            Image.Url url;
            C41536l.m120489i(iVar, "property");
            String str = (String) obj2;
            String str2 = (String) obj;
            NewProductHeaderView newProductHeaderView = this.f40243a;
            if (C40439w.m117118v(str)) {
                url = null;
            } else {
                url = new Image.Url(str, (Image.Placeholder) null, (Image.Placeholder) null, (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 126, (DefaultConstructorMarker) null);
            }
            NewProductHeaderView.m50610o(newProductHeaderView, url, (C43075l) null, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.designsystem.components.productheader.NewProductHeaderView$n */
    public static final class C13496n extends C41553c {

        /* renamed from: a */
        final /* synthetic */ NewProductHeaderView f40244a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13496n(Object obj, NewProductHeaderView newProductHeaderView) {
            super(obj);
            this.f40244a = newProductHeaderView;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            Image.Drawable drawable;
            C41536l.m120489i(iVar, "property");
            Drawable drawable2 = (Drawable) obj2;
            Drawable drawable3 = (Drawable) obj;
            NewProductHeaderView newProductHeaderView = this.f40244a;
            if (drawable2 != null) {
                drawable = new Image.Drawable(drawable2, (Boolean) null, 2, (DefaultConstructorMarker) null);
            } else {
                drawable = null;
            }
            NewProductHeaderView.m50610o(newProductHeaderView, drawable, (C43075l) null, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.designsystem.components.productheader.NewProductHeaderView$o */
    public static final class C13497o extends C41553c {

        /* renamed from: a */
        final /* synthetic */ NewProductHeaderView f40245a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13497o(Object obj, NewProductHeaderView newProductHeaderView) {
            super(obj);
            this.f40245a = newProductHeaderView;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            boolean z;
            C41536l.m120489i(iVar, "property");
            C12132a aVar = (C12132a) obj2;
            if (!C41536l.m120484d((C12132a) obj, aVar) && aVar != null) {
                this.f40245a.f40197d.f26952p.setText(aVar.mo32343c());
                this.f40245a.f40197d.f26946j.setData(aVar.mo32347f());
                this.f40245a.f40197d.f26946j.setChevronVisible(aVar.mo32342b());
                AppCompatImageView appCompatImageView = this.f40245a.f40197d.f26950n;
                C41536l.m120488h(appCompatImageView, "binding.star");
                C18368l.m62751F(appCompatImageView, aVar.mo32348g(), false, 2, (Object) null);
                this.f40245a.f40197d.f26943g.removeAllViews();
                List a = aVar.mo32341a();
                if (a == null || a.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    this.f40245a.f40197d.f26943g.setVisibility(0);
                    for (C17966a aVar2 : aVar.mo32341a()) {
                        this.f40245a.f40197d.f26943g.addView(this.f40245a.m50604h(aVar2.mo45636a(), aVar2.mo45637b()));
                    }
                } else if (aVar.mo32345e() != null) {
                    this.f40245a.f40197d.f26943g.setVisibility(0);
                    this.f40245a.f40197d.f26943g.addView(this.f40245a.m50605i(aVar.mo32345e(), aVar.mo32345e().mo32364e()));
                } else {
                    this.f40245a.f40197d.f26943g.setVisibility(8);
                }
                if (aVar.mo32344d() != null) {
                    this.f40245a.f40197d.f26948l.setVisibility(0);
                    this.f40245a.f40197d.f26948l.setBudget(aVar.mo32344d());
                    return;
                }
                this.f40245a.f40197d.f26948l.setVisibility(8);
            }
        }
    }

    static {
        Class<NewProductHeaderView> cls = NewProductHeaderView.class;
        f40196q = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "title", "getTitle()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "headerType", "getHeaderType()Lge/bog/designsystem/components/productheader/NewProductHeaderView$HeaderType;", 0)), C41520a0.m120439e(new C41539o(cls, "thumbnailImageSize", "getThumbnailImageSize()Lge/bog/designsystem/components/productheader/NewProductHeaderView$ThumbnailImageSize;", 0)), C41520a0.m120439e(new C41539o(cls, "thumbnailImageUrl", "getThumbnailImageUrl()Ljava/lang/String;", 0)), C41520a0.m120439e(new C41539o(cls, "thumbnailImageDrawable", "getThumbnailImageDrawable()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120439e(new C41539o(cls, "circularImageUrl", "getCircularImageUrl()Ljava/lang/String;", 0)), C41520a0.m120439e(new C41539o(cls, "circularImageDrawable", "getCircularImageDrawable()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120439e(new C41539o(cls, "backgroundImageUrl", "getBackgroundImageUrl()Ljava/lang/String;", 0)), C41520a0.m120439e(new C41539o(cls, "backgroundImageDrawable", "getBackgroundImageDrawable()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120439e(new C41539o(cls, "data", "getData()Lge/bog/designsystem/components/productheader/NewProductHeaderData;", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NewProductHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    public static /* synthetic */ void getBackgroundImageDrawable$annotations() {
    }

    public static /* synthetic */ void getBackgroundImageUrl$annotations() {
    }

    public static /* synthetic */ void getCircularImageDrawable$annotations() {
    }

    public static /* synthetic */ void getCircularImagePlaceHolder$annotations() {
    }

    public static /* synthetic */ void getCircularImageUrl$annotations() {
    }

    public static /* synthetic */ void getThumbnailImageDrawable$annotations() {
    }

    public static /* synthetic */ void getThumbnailImagePlaceHolder$annotations() {
    }

    public static /* synthetic */ void getThumbnailImageSize$annotations() {
    }

    public static /* synthetic */ void getThumbnailImageUrl$annotations() {
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final InfoBadgeView m50604h(double d, String str) {
        boolean z;
        Context context = getContext();
        C41536l.m120488h(context, "context");
        InfoBadgeView infoBadgeView = new InfoBadgeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        infoBadgeView.setType(getHeaderType().mo36628c());
        InfoBadgeView.m50233e(infoBadgeView, (String) null, String.valueOf(d), str, 1, (Object) null);
        if (d == Utils.DOUBLE_EPSILON) {
            z = true;
        } else {
            z = false;
        }
        infoBadgeView.setEnabled(!z);
        return infoBadgeView;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final TextBadgeView m50605i(C12138g gVar, C12139h hVar) {
        TextBadgeView textBadgeView;
        int i;
        if (gVar.mo32366f()) {
            View inflate = LayoutInflater.from(getContext()).inflate(C17783h.item_new_product_header_icon_badge, this.f40197d.f26943g, false);
            C41536l.m120487g(inflate, "null cannot be cast to non-null type ge.bog.designsystem.components.textbadge.TextBadgeView");
            TextBadgeView textBadgeView2 = (TextBadgeView) inflate;
            textBadgeView2.setBadgeText(gVar.mo32363d());
            textBadgeView2.setOnClickListener(new C12133b(gVar));
            return textBadgeView2;
        } else if (gVar.mo32367g()) {
            View inflate2 = LayoutInflater.from(getContext()).inflate(C17783h.item_new_product_header_single_line_text_badge, this.f40197d.f26943g, false);
            C41536l.m120487g(inflate2, "null cannot be cast to non-null type ge.bog.designsystem.components.textbadge.TextBadgeView");
            TextBadgeView textBadgeView3 = (TextBadgeView) inflate2;
            textBadgeView3.setBadgeText(gVar.mo32363d());
            textBadgeView3.setBackgroundColor(C0767a.m2893c(textBadgeView3.getContext(), C17778c.color_positive_tr_5));
            textBadgeView3.setOnClickListener(new C12134c(gVar));
            return textBadgeView3;
        } else {
            if (gVar.mo32362c() != null) {
                View inflate3 = LayoutInflater.from(getContext()).inflate(C17783h.item_new_product_header_double_text_badge, this.f40197d.f26943g, false);
                C41536l.m120487g(inflate3, "null cannot be cast to non-null type ge.bog.designsystem.components.textbadge.TextBadgeView");
                textBadgeView = (TextBadgeView) inflate3;
                textBadgeView.setBadgeSecondText(gVar.mo32362c());
                Color f = getHeaderType().mo36630f();
                Context context = textBadgeView.getContext();
                C41536l.m120488h(context, "context");
                textBadgeView.setBadgeSecondTextColor(f.mo35260a(context));
            } else {
                View inflate4 = LayoutInflater.from(getContext()).inflate(C17783h.item_new_product_header_caption_text_badge, this.f40197d.f26943g, false);
                C41536l.m120487g(inflate4, "null cannot be cast to non-null type ge.bog.designsystem.components.textbadge.TextBadgeView");
                textBadgeView = (TextBadgeView) inflate4;
            }
            textBadgeView.setBadgeText(gVar.mo32363d());
            textBadgeView.setBadgeCaption(gVar.mo32360a());
            Color g = getHeaderType().mo36631g();
            Context context2 = getContext();
            C41536l.m120488h(context2, "context");
            textBadgeView.setBadgeTextColor(g.mo35260a(context2));
            Color f2 = getHeaderType().mo36630f();
            Context context3 = getContext();
            C41536l.m120488h(context3, "context");
            textBadgeView.setBadgeCaptionTextColor(f2.mo35260a(context3));
            Color e = getHeaderType().mo36629e();
            Context context4 = getContext();
            C41536l.m120488h(context4, "context");
            textBadgeView.setBackgroundColor(e.mo35260a(context4));
            textBadgeView.setOnClickListener(new C12135d(gVar));
            if (hVar == null) {
                i = -1;
            } else {
                i = C13484c.f40226a[hVar.ordinal()];
            }
            if (i == 1) {
                textBadgeView.setBackgroundColor(C0767a.m2893c(getContext(), C17778c.color_positive_tr_5));
                textBadgeView.setBadgeCaptionTextColor(C0767a.m2893c(this.f40197d.f26943g.getContext(), C17778c.f49617S));
            } else if (i == 2) {
                textBadgeView.setBackgroundColor(C0767a.m2893c(getContext(), C17778c.f49608F));
                textBadgeView.setBadgeCaptionTextColor(C0767a.m2893c(this.f40197d.f26943g.getContext(), C17778c.f49605C));
            } else if (i != 3) {
                if (i == 4) {
                    textBadgeView.setBadgeTextColor(C0767a.m2893c(getContext(), C17778c.f49636u));
                    Context context5 = getContext();
                    int i2 = C17778c.f49637v;
                    textBadgeView.setBadgeSecondTextColor(C0767a.m2893c(context5, i2));
                    textBadgeView.setBadgeCaptionTextColor(C0767a.m2893c(getContext(), i2));
                    textBadgeView.setBackgroundColor(C0767a.m2893c(getContext(), C17778c.f49611L));
                }
            } else if (gVar.mo32361b() != null) {
                textBadgeView.setBackgroundTint(C17778c.selector_text_badge_background_color);
            }
            textBadgeView.setAlignBadgeStart(true);
            return textBadgeView;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final void m50606j(C12138g gVar, View view) {
        C41536l.m120489i(gVar, "$data");
        C43064a b = gVar.mo32361b();
        if (b != null) {
            b.invoke();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final void m50607k(C12138g gVar, View view) {
        C41536l.m120489i(gVar, "$data");
        C43064a b = gVar.mo32361b();
        if (b != null) {
            b.invoke();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final void m50608l(C12138g gVar, View view) {
        C41536l.m120489i(gVar, "$data");
        C43064a b = gVar.mo32361b();
        if (b != null) {
            b.invoke();
        }
    }

    /* renamed from: m */
    private final void m50609m(Image.Url url) {
        Image.Placeholder placeholder;
        C13482a aVar;
        if (url != null) {
            placeholder = url.mo35409i();
        } else {
            placeholder = null;
        }
        if (placeholder != null) {
            Boolean b = url.mo35409i().mo35370b();
            if (C41536l.m120484d(b, Boolean.TRUE)) {
                aVar = C13482a.BLACK;
            } else if (C41536l.m120484d(b, Boolean.FALSE)) {
                aVar = C13482a.WHITE;
            } else {
                aVar = C13482a.COLOR;
            }
            setHeaderType(aVar);
        }
    }

    /* renamed from: o */
    public static /* synthetic */ void m50610o(NewProductHeaderView newProductHeaderView, Image image, C43075l lVar, int i, Object obj) {
        if ((i & 2) != 0) {
            lVar = C13485d.f40227d;
        }
        newProductHeaderView.mo36609n(image, lVar);
    }

    /* access modifiers changed from: private */
    public final void setErrorImage(Image.Url url) {
        Boolean bool;
        C13482a aVar;
        Image.Placeholder e;
        if (url == null || (e = url.mo35403e()) == null) {
            bool = null;
        } else {
            bool = e.mo35370b();
        }
        if (C41536l.m120484d(bool, Boolean.TRUE)) {
            aVar = C13482a.BLACK;
        } else if (C41536l.m120484d(bool, Boolean.FALSE)) {
            aVar = C13482a.WHITE;
        } else {
            aVar = C13482a.COLOR;
        }
        setHeaderType(aVar);
    }

    public final Drawable getBackgroundImageDrawable() {
        return (Drawable) this.f40208o.getValue(this, f40196q[8]);
    }

    public final String getBackgroundImageUrl() {
        return (String) this.f40207n.getValue(this, f40196q[7]);
    }

    public final boolean getChevronVisible() {
        return this.f40197d.f26946j.getChevronVisible();
    }

    public final Drawable getCircularImageDrawable() {
        return (Drawable) this.f40206m.getValue(this, f40196q[6]);
    }

    public final Drawable getCircularImagePlaceHolder() {
        return this.f40204k;
    }

    public final String getCircularImageUrl() {
        return (String) this.f40205l.getValue(this, f40196q[5]);
    }

    public final C12132a getData() {
        return (C12132a) this.f40209p.getValue(this, f40196q[9]);
    }

    public final C13482a getHeaderType() {
        return (C13482a) this.f40199f.getValue(this, f40196q[1]);
    }

    public final Drawable getThumbnailImageDrawable() {
        return (Drawable) this.f40203j.getValue(this, f40196q[4]);
    }

    public final Drawable getThumbnailImagePlaceHolder() {
        return this.f40201h;
    }

    public final C13483b getThumbnailImageSize() {
        return (C13483b) this.f40200g.getValue(this, f40196q[2]);
    }

    public final String getThumbnailImageUrl() {
        return (String) this.f40202i.getValue(this, f40196q[3]);
    }

    public final CharSequence getTitle() {
        return this.f40198e.getValue(this, f40196q[0]);
    }

    /* renamed from: n */
    public final void mo36609n(Image image, C43075l lVar) {
        Image.Url url;
        C41536l.m120489i(lVar, "onLoadFailed");
        C13482a headerType = getHeaderType();
        if (image instanceof Image.Url) {
            url = (Image.Url) image;
        } else {
            url = null;
        }
        m50609m(url);
        CropImageView cropImageView = this.f40197d.f26941e;
        C41536l.m120488h(cropImageView, "binding.backgroundImage");
        C18368l.m62777z(cropImageView, image, new C13486e(this, image, lVar, headerType));
    }

    public final void setBackgroundImage(Image image) {
        m50610o(this, image, (C43075l) null, 2, (Object) null);
    }

    public final void setBackgroundImageDrawable(Drawable drawable) {
        this.f40208o.setValue(this, f40196q[8], drawable);
    }

    public final void setBackgroundImageUrl(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.f40207n.setValue(this, f40196q[7], str);
    }

    public final void setChevronVisible(boolean z) {
        this.f40197d.f26946j.setChevronVisible(z);
    }

    public final void setCircularImage(Image image) {
        boolean z;
        AppCompatImageView appCompatImageView = this.f40197d.f26944h;
        C41536l.m120488h(appCompatImageView, "binding.circularImage");
        C18368l.m62777z(appCompatImageView, C12136e.m44507b(image, this.f40204k), C13488f.f40236d);
        AppCompatImageView appCompatImageView2 = this.f40197d.f26944h;
        C41536l.m120488h(appCompatImageView2, "binding.circularImage");
        if (image != null) {
            z = true;
        } else {
            z = false;
        }
        C18368l.m62751F(appCompatImageView2, z, false, 2, (Object) null);
        AppCompatImageView appCompatImageView3 = this.f40197d.f26951o;
        C41536l.m120488h(appCompatImageView3, "binding.thumbnailImage");
        C18368l.m62766o(appCompatImageView3, false, 1, (Object) null);
    }

    public final void setCircularImageDrawable(Drawable drawable) {
        this.f40206m.setValue(this, f40196q[6], drawable);
    }

    public final void setCircularImagePlaceHolder(Drawable drawable) {
        this.f40204k = drawable;
    }

    public final void setCircularImageUrl(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.f40205l.setValue(this, f40196q[5], str);
    }

    public final void setData(C12132a aVar) {
        this.f40209p.setValue(this, f40196q[9], aVar);
    }

    public final void setHeaderType(C13482a aVar) {
        C41536l.m120489i(aVar, "<set-?>");
        this.f40199f.setValue(this, f40196q[1], aVar);
    }

    public final void setIncludeTopSpacing(boolean z) {
        int i;
        Resources resources = getContext().getResources();
        if (z) {
            i = C17779d.new_product_header_top_margin;
        } else {
            i = C17779d.spacing_24;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i);
        View view = this.f40197d.f26947k;
        C41536l.m120488h(view, "binding.placeHolder");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, dimensionPixelSize, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            view.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public final void setThumbnailImage(Image image) {
        boolean z;
        AppCompatImageView appCompatImageView = this.f40197d.f26951o;
        C41536l.m120488h(appCompatImageView, "binding.thumbnailImage");
        C18368l.m62746A(appCompatImageView, C12136e.m44507b(image, this.f40201h), (C43075l) null, 2, (Object) null);
        AppCompatImageView appCompatImageView2 = this.f40197d.f26951o;
        C41536l.m120488h(appCompatImageView2, "binding.thumbnailImage");
        if (image != null) {
            z = true;
        } else {
            z = false;
        }
        C18368l.m62751F(appCompatImageView2, z, false, 2, (Object) null);
        AppCompatImageView appCompatImageView3 = this.f40197d.f26944h;
        C41536l.m120488h(appCompatImageView3, "binding.circularImage");
        C18368l.m62766o(appCompatImageView3, false, 1, (Object) null);
    }

    public final void setThumbnailImageDrawable(Drawable drawable) {
        this.f40203j.setValue(this, f40196q[4], drawable);
    }

    public final void setThumbnailImagePlaceHolder(Drawable drawable) {
        this.f40201h = drawable;
    }

    public final void setThumbnailImageSize(C13483b bVar) {
        C41536l.m120489i(bVar, "<set-?>");
        this.f40200g.setValue(this, f40196q[2], bVar);
    }

    public final void setThumbnailImageUrl(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.f40202i.setValue(this, f40196q[3], str);
    }

    public final void setTitle(CharSequence charSequence) {
        this.f40198e.setValue(this, f40196q[0], charSequence);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NewProductHeaderView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewProductHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        C9904e4 d = C9904e4.m36328d(LayoutInflater.from(context), this, true);
        C41536l.m120488h(d, "inflate(LayoutInflater.from(context), this, true)");
        this.f40197d = d;
        AppCompatTextView appCompatTextView = d.f26952p;
        C41536l.m120488h(appCompatTextView, "binding.title");
        this.f40198e = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        C41551a aVar = C41551a.f97718a;
        C13482a aVar2 = C13482a.BLACK;
        this.f40199f = new C13489g(aVar2, this);
        C13483b bVar = C13483b.NORMAL;
        this.f40200g = new C13490h(bVar, this);
        String str = "";
        this.f40202i = new C13491i(str, this);
        this.f40203j = new C13492j((Object) null, this);
        this.f40205l = new C13493k(str, this);
        this.f40206m = new C13494l((Object) null, this);
        this.f40207n = new C13495m(str, this);
        this.f40208o = new C13496n((Object) null, this);
        this.f40209p = new C13497o((Object) null, this);
        setLayerStyle(C17786k.f49821D);
        setBackgroundColor(C18368l.m62755d(context, C17777b.f49596k));
        int[] iArr = C17787l.f49864B8;
        C41536l.m120488h(iArr, "NewProductHeaderView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        setIncludeTopSpacing(obtainStyledAttributes.getBoolean(C17787l.f49894D8, true));
        String string = obtainStyledAttributes.getString(C17787l.f49939G8);
        setTitle(string != null ? string : str);
        int i2 = obtainStyledAttributes.getInt(C17787l.f49909E8, 0);
        if (i2 == 0) {
            aVar2 = C13482a.WHITE;
        } else if (i2 != 1) {
            if (i2 == 2) {
                aVar2 = C13482a.COLOR;
            } else if (i2 == 3) {
                aVar2 = C13482a.COLOR_LOAN;
            } else {
                throw new IllegalStateException("Unknown Header type");
            }
        }
        setHeaderType(aVar2);
        int i3 = obtainStyledAttributes.getInt(C17787l.f49924F8, 0);
        if (i3 != 0) {
            if (i3 == 1) {
                bVar = C13483b.LARGE;
            } else {
                throw new IllegalStateException("Unknown Image Size");
            }
        }
        setThumbnailImageSize(bVar);
        setChevronVisible(obtainStyledAttributes.getBoolean(C17787l.f49879C8, true));
        obtainStyledAttributes.recycle();
    }
}
