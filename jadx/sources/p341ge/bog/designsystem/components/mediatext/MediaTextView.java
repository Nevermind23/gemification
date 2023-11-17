package p341ge.bog.designsystem.components.mediatext;

import af1.C40303i;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bumptech.glide.C2394j;
import he1.C41238w;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41551a;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import p035c4.C2247a;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p352ak.C10061z3;
import p601sg.C17777b;
import p601sg.C17779d;
import p601sg.C17780e;
import p601sg.C17786k;
import p601sg.C17787l;
import p642vh.C18355e0;
import p642vh.C18368l;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.designsystem.components.mediatext.MediaTextView */
public final class MediaTextView extends FrameLayout {

    /* renamed from: i */
    static final /* synthetic */ C40303i[] f39802i;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C10061z3 f39803d;

    /* renamed from: e */
    private final C18355e0 f39804e;

    /* renamed from: f */
    private final C18355e0 f39805f;

    /* renamed from: g */
    private final C41555e f39806g;

    /* renamed from: h */
    private final C41555e f39807h;

    /* renamed from: ge.bog.designsystem.components.mediatext.MediaTextView$a */
    public enum C13383a {
        THUMBNAIL(r4, r4, r5, (int) null, r19, 0, (int) null, C17780e.f49662k1),
        CARD(C17779d.media_text_card_icon_width, C17779d.media_text_card_icon_height, ImageView.ScaleType.FIT_XY, (int) null, r19, 0, (int) null, C17780e.thumbnail_card),
        OVAL_ICON(r5, r5, ImageView.ScaleType.CENTER_INSIDE, Integer.valueOf(C17779d.media_text_oval_icon_layer_radius), C17786k.LayerRadiusCircleShadow0, C17777b.f49600q, Integer.valueOf(C17777b.f49603w), C17780e.f49668q1);
        

        /* renamed from: l */
        public static final C13384a f39808l = null;

        /* renamed from: d */
        private final int f39813d;

        /* renamed from: e */
        private final int f39814e;

        /* renamed from: f */
        private final ImageView.ScaleType f39815f;

        /* renamed from: g */
        private final Integer f39816g;

        /* renamed from: h */
        private final int f39817h;

        /* renamed from: i */
        private final int f39818i;

        /* renamed from: j */
        private final Integer f39819j;

        /* renamed from: k */
        private final int f39820k;

        /* renamed from: ge.bog.designsystem.components.mediatext.MediaTextView$a$a */
        public static final class C13384a {
            private C13384a() {
            }

            public /* synthetic */ C13384a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C13383a mo36168a(int i) {
                return C13383a.values()[i];
            }
        }

        static {
            f39808l = new C13384a((DefaultConstructorMarker) null);
        }

        private C13383a(int i, int i2, ImageView.ScaleType scaleType, Integer num, int i3, int i4, Integer num2, int i5) {
            this.f39813d = i;
            this.f39814e = i2;
            this.f39815f = scaleType;
            this.f39816g = num;
            this.f39817h = i3;
            this.f39818i = i4;
            this.f39819j = num2;
            this.f39820k = i5;
        }

        /* renamed from: b */
        public final int mo36160b() {
            return this.f39814e;
        }

        /* renamed from: c */
        public final ImageView.ScaleType mo36161c() {
            return this.f39815f;
        }

        /* renamed from: e */
        public final int mo36162e() {
            return this.f39813d;
        }

        /* renamed from: f */
        public final int mo36163f() {
            return this.f39818i;
        }

        /* renamed from: g */
        public final Integer mo36164g() {
            return this.f39816g;
        }

        /* renamed from: h */
        public final int mo36165h() {
            return this.f39817h;
        }

        /* renamed from: l */
        public final int mo36166l() {
            return this.f39820k;
        }

        /* renamed from: n */
        public final Integer mo36167n() {
            return this.f39819j;
        }
    }

    /* renamed from: ge.bog.designsystem.components.mediatext.MediaTextView$b */
    static final class C13385b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MediaTextView f39821d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13385b(MediaTextView mediaTextView) {
            super(1);
            this.f39821d = mediaTextView;
        }

        /* renamed from: a */
        public final C2394j invoke(C2394j jVar) {
            C41536l.m120489i(jVar, "$this$setImage");
            C2247a c0 = jVar.mo7220c0(this.f39821d.getType().mo36166l());
            C41536l.m120488h(c0, "placeholder(type.placeHolder)");
            return (C2394j) c0;
        }
    }

    /* renamed from: ge.bog.designsystem.components.mediatext.MediaTextView$c */
    public static final class C13386c extends C41553c {

        /* renamed from: a */
        final /* synthetic */ MediaTextView f39822a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13386c(Object obj, MediaTextView mediaTextView) {
            super(obj);
            this.f39822a = mediaTextView;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            Image image = (Image) obj2;
            if (!C41536l.m120484d((Image) obj, image)) {
                ImageView imageView = this.f39822a.f39803d.f27813e;
                C41536l.m120488h(imageView, "binding.icon");
                C18368l.m62777z(imageView, image, new C13385b(this.f39822a));
            }
        }
    }

    /* renamed from: ge.bog.designsystem.components.mediatext.MediaTextView$d */
    public static final class C13387d extends C41553c {

        /* renamed from: a */
        final /* synthetic */ MediaTextView f39823a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13387d(Object obj, MediaTextView mediaTextView) {
            super(obj);
            this.f39823a = mediaTextView;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            C13383a aVar = (C13383a) obj2;
            if (((C13383a) obj) != aVar) {
                this.f39823a.setMediaTextType(aVar);
            }
        }
    }

    static {
        Class<MediaTextView> cls = MediaTextView.class;
        f39802i = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "title", "getTitle()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "text", "getText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "image", "getImage()Lge/bog/designsystem/components/common/Image;", 0)), C41520a0.m120439e(new C41539o(cls, "type", "getType()Lge/bog/designsystem/components/mediatext/MediaTextView$MediaTextType;", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MediaTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* access modifiers changed from: private */
    public final void setMediaTextType(C13383a aVar) {
        int i;
        C41238w wVar;
        Integer g = aVar.mo36164g();
        if (g != null) {
            i = getContext().getResources().getDimensionPixelSize(g.intValue());
        } else {
            i = -2;
        }
        this.f39803d.f27814f.setLayoutParams(new LinearLayout.LayoutParams(i, i));
        this.f39803d.f27814f.setLayerStyle(aVar.mo36165h());
        LayerView layerView = this.f39803d.f27814f;
        Context context = getContext();
        C41536l.m120488h(context, "context");
        layerView.setBackgroundColor(C18368l.m62755d(context, aVar.mo36163f()));
        ImageView imageView = this.f39803d.f27813e;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(getContext().getResources().getDimensionPixelSize(aVar.mo36162e()), getContext().getResources().getDimensionPixelSize(aVar.mo36160b()));
        layoutParams.gravity = 17;
        imageView.setLayoutParams(layoutParams);
        this.f39803d.f27813e.setScaleType(aVar.mo36161c());
        Integer n = aVar.mo36167n();
        if (n != null) {
            n.intValue();
            ImageView imageView2 = this.f39803d.f27813e;
            Context context2 = getContext();
            C41536l.m120488h(context2, "context");
            imageView2.setColorFilter(C18368l.m62755d(context2, aVar.mo36167n().intValue()));
            wVar = C41238w.f97225a;
        } else {
            wVar = null;
        }
        if (wVar == null) {
            this.f39803d.f27813e.clearColorFilter();
        }
    }

    public final Image getImage() {
        return (Image) this.f39806g.getValue(this, f39802i[2]);
    }

    public final CharSequence getText() {
        return this.f39805f.getValue(this, f39802i[1]);
    }

    public final CharSequence getTitle() {
        return this.f39804e.getValue(this, f39802i[0]);
    }

    public final C13383a getType() {
        return (C13383a) this.f39807h.getValue(this, f39802i[3]);
    }

    public final void setImage(Image image) {
        this.f39806g.setValue(this, f39802i[2], image);
    }

    public final void setText(CharSequence charSequence) {
        this.f39805f.setValue(this, f39802i[1], charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        this.f39804e.setValue(this, f39802i[0], charSequence);
    }

    public final void setType(C13383a aVar) {
        C41536l.m120489i(aVar, "<set-?>");
        this.f39807h.setValue(this, f39802i[3], aVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MediaTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        C41536l.m120489i(context2, "context");
        C10061z3 d = C10061z3.m36904d(LayoutInflater.from(context), this, true);
        C41536l.m120488h(d, "inflate(LayoutInflater.from(context), this, true)");
        this.f39803d = d;
        TextView textView = d.f27816h;
        C41536l.m120488h(textView, "binding.title");
        this.f39804e = new C18355e0(textView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        TextView textView2 = d.f27815g;
        C41536l.m120488h(textView2, "binding.text");
        this.f39805f = new C18355e0(textView2, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        C41551a aVar = C41551a.f97718a;
        this.f39806g = new C13386c((Object) null, this);
        this.f39807h = new C13387d(C13383a.THUMBNAIL, this);
        int[] iArr = C17787l.f50255b8;
        C41536l.m120488h(iArr, "MediaTextView");
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        String string = obtainStyledAttributes.getString(C17787l.f50319f8);
        String str = "";
        setTitle(string == null ? str : string);
        String string2 = obtainStyledAttributes.getString(C17787l.f50303e8);
        setText(string2 != null ? string2 : str);
        int resourceId = obtainStyledAttributes.getResourceId(C17787l.f50271c8, 0);
        if (resourceId != 0) {
            setImage(new Image.Resource(resourceId, (Boolean) null, 2, (DefaultConstructorMarker) null));
        }
        setType(C13383a.f39808l.mo36168a(obtainStyledAttributes.getInt(C17787l.f50287d8, 0)));
        obtainStyledAttributes.recycle();
    }
}
