package p341ge.bog.designsystem.components.dynamicthumbnailcard;

import af1.C40303i;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.PathInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.C1259w;
import androidx.core.widget.C1314o;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41551a;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p352ak.C9903e3;
import p407ei.C12472a;
import p407ei.C12473b;
import p407ei.C12474c;
import p601sg.C17777b;
import p601sg.C17778c;
import p601sg.C17779d;
import p601sg.C17780e;
import p601sg.C17786k;
import p601sg.C17787l;
import p642vh.C18351c0;
import p642vh.C18354e;
import p642vh.C18355e0;
import p642vh.C18365j0;
import p642vh.C18368l;
import p642vh.C18375n;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.designsystem.components.dynamicthumbnailcard.DynamicThumbnailCardView */
public final class DynamicThumbnailCardView extends LayerView {

    /* renamed from: u */
    public static final C13324b f39456u = new C13324b((DefaultConstructorMarker) null);

    /* renamed from: v */
    static final /* synthetic */ C40303i[] f39457v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public static final PathInterpolator f39458w = new PathInterpolator(0.6f, 0.01f, Utils.FLOAT_EPSILON, 1.0f);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C9903e3 f39459d;

    /* renamed from: e */
    private final C18375n f39460e;

    /* renamed from: f */
    private final C18355e0 f39461f;

    /* renamed from: g */
    private final C18355e0 f39462g;

    /* renamed from: h */
    private final C18354e f39463h;

    /* renamed from: i */
    private final C18351c0 f39464i;

    /* renamed from: j */
    private C13325c f39465j;

    /* renamed from: k */
    private final C18365j0 f39466k;

    /* renamed from: l */
    private final C41555e f39467l;

    /* renamed from: m */
    private final C41555e f39468m;

    /* renamed from: n */
    private C13323a f39469n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C12474c f39470o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C12474c f39471p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final Handler f39472q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final int f39473r;

    /* renamed from: s */
    private final C13328e f39474s;

    /* renamed from: t */
    private final C1259w f39475t;

    /* renamed from: ge.bog.designsystem.components.dynamicthumbnailcard.DynamicThumbnailCardView$a */
    public interface C13323a {
        /* renamed from: a */
        void mo35715a();
    }

    /* renamed from: ge.bog.designsystem.components.dynamicthumbnailcard.DynamicThumbnailCardView$b */
    public static final class C13324b {
        private C13324b() {
        }

        public /* synthetic */ C13324b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.designsystem.components.dynamicthumbnailcard.DynamicThumbnailCardView$c */
    public enum C13325c {
        REGULAR(C17786k.TextH1, 1),
        SMALL(C17786k.f49832p1, 2);
        

        /* renamed from: f */
        public static final C13326a f39476f = null;

        /* renamed from: d */
        private final int f39480d;

        /* renamed from: e */
        private final int f39481e;

        /* renamed from: ge.bog.designsystem.components.dynamicthumbnailcard.DynamicThumbnailCardView$c$a */
        public static final class C13326a {
            private C13326a() {
            }

            public /* synthetic */ C13326a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C13325c mo35718a(int i) {
                C13325c cVar;
                C13325c[] values = C13325c.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        cVar = null;
                        break;
                    }
                    cVar = values[i2];
                    if (cVar.ordinal() == i) {
                        break;
                    }
                    i2++;
                }
                if (cVar != null) {
                    return cVar;
                }
                throw new IllegalArgumentException("Unknown title size".toString());
            }
        }

        static {
            f39476f = new C13326a((DefaultConstructorMarker) null);
        }

        private C13325c(int i, int i2) {
            this.f39480d = i;
            this.f39481e = i2;
        }

        /* renamed from: b */
        public final int mo35716b() {
            return this.f39480d;
        }

        /* renamed from: c */
        public final int mo35717c() {
            return this.f39481e;
        }
    }

    /* renamed from: ge.bog.designsystem.components.dynamicthumbnailcard.DynamicThumbnailCardView$d */
    public static final class C13327d extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: d */
        final /* synthetic */ DynamicThumbnailCardView f39482d;

        C13327d(DynamicThumbnailCardView dynamicThumbnailCardView) {
            this.f39482d = dynamicThumbnailCardView;
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            this.f39482d.performClick();
            return true;
        }
    }

    /* renamed from: ge.bog.designsystem.components.dynamicthumbnailcard.DynamicThumbnailCardView$e */
    public static final class C13328e implements Runnable {

        /* renamed from: d */
        final /* synthetic */ DynamicThumbnailCardView f39483d;

        C13328e(DynamicThumbnailCardView dynamicThumbnailCardView) {
            this.f39483d = dynamicThumbnailCardView;
        }

        public void run() {
            this.f39483d.f39459d.f26936h.mo5258E1(this.f39483d.f39473r, 0, DynamicThumbnailCardView.f39458w, 2000);
            this.f39483d.f39459d.f26935g.mo5258E1(-this.f39483d.f39473r, 0, DynamicThumbnailCardView.f39458w, 2000);
            this.f39483d.f39472q.postDelayed(this, 2000);
        }
    }

    /* renamed from: ge.bog.designsystem.components.dynamicthumbnailcard.DynamicThumbnailCardView$f */
    public static final class C13329f extends C41553c {

        /* renamed from: a */
        final /* synthetic */ DynamicThumbnailCardView f39484a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13329f(Object obj, DynamicThumbnailCardView dynamicThumbnailCardView) {
            super(obj);
            this.f39484a = dynamicThumbnailCardView;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            List list = (List) obj2;
            List list2 = (List) obj;
            DynamicThumbnailCardView dynamicThumbnailCardView = this.f39484a;
            dynamicThumbnailCardView.m50160o(list, dynamicThumbnailCardView.f39470o);
            NoUIScrollRecyclerView noUIScrollRecyclerView = this.f39484a.f39459d.f26935g;
            C41536l.m120488h(noUIScrollRecyclerView, "binding.imagesBottom");
            C18368l.m62751F(noUIScrollRecyclerView, !list.isEmpty(), false, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.designsystem.components.dynamicthumbnailcard.DynamicThumbnailCardView$g */
    public static final class C13330g extends C41553c {

        /* renamed from: a */
        final /* synthetic */ DynamicThumbnailCardView f39485a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13330g(Object obj, DynamicThumbnailCardView dynamicThumbnailCardView) {
            super(obj);
            this.f39485a = dynamicThumbnailCardView;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            List list = (List) obj2;
            List list2 = (List) obj;
            DynamicThumbnailCardView dynamicThumbnailCardView = this.f39485a;
            dynamicThumbnailCardView.m50160o(list, dynamicThumbnailCardView.f39471p);
            NoUIScrollRecyclerView noUIScrollRecyclerView = this.f39485a.f39459d.f26936h;
            C41536l.m120488h(noUIScrollRecyclerView, "binding.imagesTop");
            C18368l.m62751F(noUIScrollRecyclerView, !list.isEmpty(), false, 2, (Object) null);
        }
    }

    static {
        Class<DynamicThumbnailCardView> cls = DynamicThumbnailCardView.class;
        f39457v = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "logo", "getLogo()Lge/bog/designsystem/components/common/Image;", 0)), C41520a0.m120439e(new C41539o(cls, "title", "getTitle()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "description", "getDescription()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "bottomText", "getBottomText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "titleColor", "getTitleColor()Lge/bog/designsystem/components/common/Color;", 0)), C41520a0.m120439e(new C41539o(cls, "interactive", "getInteractive()Z", 0)), C41520a0.m120439e(new C41539o(cls, "imagesBottom", "getImagesBottom()Ljava/util/List;", 0)), C41520a0.m120439e(new C41539o(cls, "imagesTop", "getImagesTop()Ljava/util/List;", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DynamicThumbnailCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final void m50150c(DynamicThumbnailCardView dynamicThumbnailCardView, View view) {
        C41536l.m120489i(dynamicThumbnailCardView, "this$0");
        C13323a aVar = dynamicThumbnailCardView.f39469n;
        if (aVar != null) {
            aVar.mo35715a();
        }
    }

    /* renamed from: k */
    private final void m50158k(RecyclerView recyclerView, C12474c cVar, boolean z) {
        recyclerView.setAdapter(cVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, z));
        recyclerView.setOnTouchListener(new C12473b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final boolean m50159l(DynamicThumbnailCardView dynamicThumbnailCardView, View view, MotionEvent motionEvent) {
        C41536l.m120489i(dynamicThumbnailCardView, "this$0");
        dynamicThumbnailCardView.f39475t.mo3731a(motionEvent);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final void m50160o(List list, C12474c cVar) {
        cVar.mo33087h(list);
    }

    public final CharSequence getBottomText() {
        return this.f39463h.getValue(this, f39457v[3]);
    }

    public final CharSequence getDescription() {
        return this.f39462g.getValue(this, f39457v[2]);
    }

    public final List<Image> getImagesBottom() {
        return (List) this.f39467l.getValue(this, f39457v[6]);
    }

    public final List<Image> getImagesTop() {
        return (List) this.f39468m.getValue(this, f39457v[7]);
    }

    public final boolean getInteractive() {
        return this.f39466k.getValue(this, f39457v[5]).booleanValue();
    }

    public final Image getLogo() {
        return this.f39460e.getValue(this, f39457v[0]);
    }

    public final CharSequence getTitle() {
        return this.f39461f.getValue(this, f39457v[1]);
    }

    public final Color getTitleColor() {
        return this.f39464i.getValue(this, f39457v[4]);
    }

    public final C13325c getTitleSize() {
        return this.f39465j;
    }

    /* renamed from: m */
    public final void mo35701m() {
        mo35702n();
        this.f39472q.postDelayed(this.f39474s, 200);
    }

    /* renamed from: n */
    public final void mo35702n() {
        this.f39472q.removeCallbacksAndMessages((Object) null);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo35702n();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(C43429k.m124590i(View.MeasureSpec.getSize(i), getResources().getDimensionPixelSize(C17779d.dynamic_thumbnail_card_image_min_width), getResources().getDimensionPixelSize(C17779d.dynamic_thumbnail_card_image_max_width)), 1073741824), i2);
    }

    public final void setBottomText(CharSequence charSequence) {
        this.f39463h.setValue(this, f39457v[3], charSequence);
    }

    public final void setDescription(CharSequence charSequence) {
        this.f39462g.setValue(this, f39457v[2], charSequence);
    }

    public final void setImagesBottom(List<? extends Image> list) {
        C41536l.m120489i(list, "<set-?>");
        this.f39467l.setValue(this, f39457v[6], list);
    }

    public final void setImagesTop(List<? extends Image> list) {
        C41536l.m120489i(list, "<set-?>");
        this.f39468m.setValue(this, f39457v[7], list);
    }

    public final void setInteractive(boolean z) {
        this.f39466k.mo46151c(this, f39457v[5], z);
    }

    public final void setLogo(Image image) {
        this.f39460e.setValue(this, f39457v[0], image);
    }

    public final void setOnBottomTextClickListener(C13323a aVar) {
        C41536l.m120489i(aVar, "listener");
        this.f39469n = aVar;
    }

    public final void setTitle(CharSequence charSequence) {
        this.f39461f.setValue(this, f39457v[1], charSequence);
    }

    public final void setTitleColor(Color color) {
        C41536l.m120489i(color, "<set-?>");
        this.f39464i.setValue(this, f39457v[4], color);
    }

    public final void setTitleSize(C13325c cVar) {
        C41536l.m120489i(cVar, C11755a.C11756a.f34100b);
        this.f39465j = cVar;
        C1314o.m4575q(this.f39459d.f26939k, cVar.mo35716b());
        this.f39459d.f26939k.setMaxLines(cVar.mo35717c());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DynamicThumbnailCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DynamicThumbnailCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        C41536l.m120489i(context2, "context");
        C9903e3 c = C9903e3.m36325c(LayoutInflater.from(context), this);
        C41536l.m120488h(c, "inflate(LayoutInflater.from(context), this)");
        this.f39459d = c;
        AppCompatImageView appCompatImageView = c.f26934f;
        C41536l.m120488h(appCompatImageView, "binding.imageMain");
        this.f39460e = new C18375n(appCompatImageView);
        TextView textView = c.f26939k;
        C41536l.m120488h(textView, "binding.textTitle");
        this.f39461f = new C18355e0(textView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        TextView textView2 = c.f26938j;
        C41536l.m120488h(textView2, "binding.textDescription");
        this.f39462g = new C18355e0(textView2, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        Button button = c.f26933e;
        C41536l.m120488h(button, "binding.buttonBottom");
        this.f39463h = new C18354e(button);
        TextView textView3 = c.f26939k;
        C41536l.m120488h(textView3, "binding.textTitle");
        this.f39464i = new C18351c0(textView3);
        C13325c cVar = C13325c.REGULAR;
        this.f39465j = cVar;
        LinearLayout linearLayout = c.f26937i;
        C41536l.m120488h(linearLayout, "binding.interactiveLayer");
        this.f39466k = new C18365j0(linearLayout, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        C41551a aVar = C41551a.f97718a;
        this.f39467l = new C13329f(C41341q.m119907j(), this);
        this.f39468m = new C13330g(C41341q.m119907j(), this);
        this.f39472q = new Handler(Looper.getMainLooper());
        this.f39473r = getResources().getDimensionPixelSize(C17779d.dynamic_thumbnail_card_scroll_dx);
        this.f39474s = new C13328e(this);
        this.f39475t = new C1259w(context2, new C13327d(this));
        setLayerStyle(C17786k.LayerRadius12Shadow0);
        setBackgroundColor(C18368l.m62755d(context2, C17777b.f49596k));
        int[] iArr = C17787l.f50615y4;
        C41536l.m120488h(iArr, "DynamicThumbnailCardView");
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        setLogo(new Image.Resource(obtainStyledAttributes.getResourceId(C17787l.f49875C4, C17780e.f49665n1), (Boolean) null, 2, (DefaultConstructorMarker) null));
        String string = obtainStyledAttributes.getString(C17787l.f49890D4);
        String str = "";
        setTitle(string == null ? str : string);
        setTitleColor(new Color.Resource(obtainStyledAttributes.getResourceId(C17787l.f49905E4, C17778c.f49626g)));
        setTitleSize(C13325c.f39476f.mo35718a(obtainStyledAttributes.getInt(C17787l.f49920F4, cVar.ordinal())));
        String string2 = obtainStyledAttributes.getString(C17787l.f49845A4);
        setDescription(string2 == null ? str : string2);
        String string3 = obtainStyledAttributes.getString(C17787l.f50630z4);
        setBottomText(string3 != null ? string3 : str);
        setInteractive(obtainStyledAttributes.getBoolean(C17787l.f49860B4, false));
        obtainStyledAttributes.recycle();
        c.f26933e.setOnClickListener(new C12472a(this));
        C12474c cVar2 = new C12474c();
        this.f39470o = cVar2;
        C12474c cVar3 = new C12474c();
        this.f39471p = cVar3;
        NoUIScrollRecyclerView noUIScrollRecyclerView = c.f26935g;
        C41536l.m120488h(noUIScrollRecyclerView, "binding.imagesBottom");
        m50158k(noUIScrollRecyclerView, cVar2, true);
        NoUIScrollRecyclerView noUIScrollRecyclerView2 = c.f26936h;
        C41536l.m120488h(noUIScrollRecyclerView2, "binding.imagesTop");
        m50158k(noUIScrollRecyclerView2, cVar3, false);
        int i2 = C17780e.f49662k1;
        setImagesBottom(C41339p.m119900e(new Image.Resource(i2, (Boolean) null, 2, (DefaultConstructorMarker) null)));
        setImagesTop(C41339p.m119900e(new Image.Resource(i2, (Boolean) null, 2, (DefaultConstructorMarker) null)));
    }
}
