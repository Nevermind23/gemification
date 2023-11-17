package p341ge.bog.designsystem.components.thumbnailgrouptext;

import af1.C40303i;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bumptech.glide.C2379b;
import com.bumptech.glide.C2394j;
import com.bumptech.glide.C2396k;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.common.Image;
import p352ak.C9922g6;
import p601sg.C17777b;
import p601sg.C17778c;
import p601sg.C17779d;
import p601sg.C17787l;
import p642vh.C18351c0;
import p642vh.C18355e0;
import p642vh.C18380s;
import ue1.C43064a;

/* renamed from: ge.bog.designsystem.components.thumbnailgrouptext.ThumbnailGroupTextView */
public final class ThumbnailGroupTextView extends FrameLayout {

    /* renamed from: r */
    static final /* synthetic */ C40303i[] f40480r;

    /* renamed from: d */
    private final C9922g6 f40481d;

    /* renamed from: e */
    private Image f40482e;

    /* renamed from: f */
    private final C18355e0 f40483f;

    /* renamed from: g */
    private final C18355e0 f40484g;

    /* renamed from: h */
    private final C18355e0 f40485h;

    /* renamed from: i */
    private final C18355e0 f40486i;

    /* renamed from: j */
    private final C18355e0 f40487j;

    /* renamed from: k */
    private final C18355e0 f40488k;

    /* renamed from: l */
    private C13551a f40489l;

    /* renamed from: m */
    private final C18355e0 f40490m;

    /* renamed from: n */
    private final C18355e0 f40491n;

    /* renamed from: o */
    private C13551a f40492o;

    /* renamed from: p */
    private final C18351c0 f40493p;

    /* renamed from: q */
    private final C18351c0 f40494q;

    /* renamed from: ge.bog.designsystem.components.thumbnailgrouptext.ThumbnailGroupTextView$a */
    public enum C13551a {
        NEUTRAL(new Color.Attribute(C17777b.f49597m)),
        POSITIVE(new Color.Resource(C17778c.f49617S)),
        NEGATIVE(new Color.Resource(C17778c.f49605C));
        

        /* renamed from: e */
        public static final C13552a f40495e = null;

        /* renamed from: d */
        private final Color f40500d;

        /* renamed from: ge.bog.designsystem.components.thumbnailgrouptext.ThumbnailGroupTextView$a$a */
        public static final class C13552a {
            private C13552a() {
            }

            public /* synthetic */ C13552a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C13551a mo36994a(int i) {
                C13551a aVar;
                boolean z;
                C13551a[] values = C13551a.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        aVar = null;
                        break;
                    }
                    aVar = values[i2];
                    if (aVar.ordinal() == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        break;
                    }
                    i2++;
                }
                if (aVar == null) {
                    return C13551a.NEUTRAL;
                }
                return aVar;
            }
        }

        static {
            f40495e = new C13552a((DefaultConstructorMarker) null);
        }

        private C13551a(Color color) {
            this.f40500d = color;
        }

        /* renamed from: b */
        public final Color mo36993b() {
            return this.f40500d;
        }
    }

    static {
        Class<ThumbnailGroupTextView> cls = ThumbnailGroupTextView.class;
        f40480r = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "topLeftTitle", "getTopLeftTitle()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "topLeftText", "getTopLeftText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "topRightTitle", "getTopRightTitle()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "topRightText", "getTopRightText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "bottomLeftTitle", "getBottomLeftTitle()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "bottomLeftText", "getBottomLeftText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "bottomRightTitle", "getBottomRightTitle()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "bottomRightText", "getBottomRightText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "bottomLeftTextColorDelegate", "getBottomLeftTextColorDelegate()Lge/bog/designsystem/components/common/Color;", 0)), C41520a0.m120439e(new C41539o(cls, "bottomRightTextColorDelegate", "getBottomRightTextColorDelegate()Lge/bog/designsystem/components/common/Color;", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ThumbnailGroupTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    private final Color getBottomLeftTextColorDelegate() {
        return this.f40493p.getValue(this, f40480r[8]);
    }

    private final Color getBottomRightTextColorDelegate() {
        return this.f40494q.getValue(this, f40480r[9]);
    }

    private final void setBottomLeftTextColorDelegate(Color color) {
        this.f40493p.setValue(this, f40480r[8], color);
    }

    private final void setBottomRightTextColorDelegate(Color color) {
        this.f40494q.setValue(this, f40480r[9], color);
    }

    public final CharSequence getBottomLeftText() {
        return this.f40488k.getValue(this, f40480r[5]);
    }

    public final C13551a getBottomLeftTextColor() {
        return this.f40489l;
    }

    public final CharSequence getBottomLeftTitle() {
        return this.f40487j.getValue(this, f40480r[4]);
    }

    public final CharSequence getBottomRightText() {
        return this.f40491n.getValue(this, f40480r[7]);
    }

    public final C13551a getBottomRightTextColor() {
        return this.f40492o;
    }

    public final CharSequence getBottomRightTitle() {
        return this.f40490m.getValue(this, f40480r[6]);
    }

    public final Image getIcon() {
        return this.f40482e;
    }

    public final CharSequence getTopLeftText() {
        return this.f40484g.getValue(this, f40480r[1]);
    }

    public final CharSequence getTopLeftTitle() {
        return this.f40483f.getValue(this, f40480r[0]);
    }

    public final CharSequence getTopRightText() {
        return this.f40486i.getValue(this, f40480r[3]);
    }

    public final CharSequence getTopRightTitle() {
        return this.f40485h.getValue(this, f40480r[2]);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(C17779d.thumbnail_group_text_height), 1073741824));
    }

    public final void setBottomLeftText(CharSequence charSequence) {
        this.f40488k.setValue(this, f40480r[5], charSequence);
    }

    public final void setBottomLeftTextColor(C13551a aVar) {
        C41536l.m120489i(aVar, C11755a.C11756a.f34100b);
        this.f40489l = aVar;
        setBottomLeftTextColorDelegate(aVar.mo36993b());
    }

    public final void setBottomLeftTitle(CharSequence charSequence) {
        this.f40487j.setValue(this, f40480r[4], charSequence);
    }

    public final void setBottomRightText(CharSequence charSequence) {
        this.f40491n.setValue(this, f40480r[7], charSequence);
    }

    public final void setBottomRightTextColor(C13551a aVar) {
        C41536l.m120489i(aVar, C11755a.C11756a.f34100b);
        this.f40492o = aVar;
        setBottomRightTextColorDelegate(aVar.mo36993b());
    }

    public final void setBottomRightTitle(CharSequence charSequence) {
        this.f40490m.setValue(this, f40480r[6], charSequence);
    }

    public final void setIcon(Image image) {
        Object obj;
        this.f40482e = image;
        C2396k t = C2379b.m9210t(getContext());
        if (image != null) {
            Context context = getContext();
            C41536l.m120488h(context, "context");
            obj = C18380s.m62796a(image, context);
        } else {
            obj = null;
        }
        ((C2394j) t.mo7756x(obj).mo7222d()).mo7718L0(this.f40481d.f27042i);
    }

    public final void setTopLeftText(CharSequence charSequence) {
        this.f40484g.setValue(this, f40480r[1], charSequence);
    }

    public final void setTopLeftTitle(CharSequence charSequence) {
        this.f40483f.setValue(this, f40480r[0], charSequence);
    }

    public final void setTopRightText(CharSequence charSequence) {
        this.f40486i.setValue(this, f40480r[3], charSequence);
    }

    public final void setTopRightTitle(CharSequence charSequence) {
        this.f40485h.setValue(this, f40480r[2], charSequence);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ThumbnailGroupTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThumbnailGroupTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        C41536l.m120489i(context2, "context");
        C9922g6 d = C9922g6.m36395d(LayoutInflater.from(context), this, true);
        C41536l.m120488h(d, "inflate(LayoutInflater.from(context), this, true)");
        this.f40481d = d;
        TextView textView = d.f27045l;
        C41536l.m120488h(textView, "binding.topLeftTitle");
        this.f40483f = new C18355e0(textView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        TextView textView2 = d.f27044k;
        C41536l.m120488h(textView2, "binding.topLeftText");
        this.f40484g = new C18355e0(textView2, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        TextView textView3 = d.f27047n;
        C41536l.m120488h(textView3, "binding.topRightTitle");
        this.f40485h = new C18355e0(textView3, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        TextView textView4 = d.f27046m;
        C41536l.m120488h(textView4, "binding.topRightText");
        this.f40486i = new C18355e0(textView4, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        TextView textView5 = d.f27039f;
        C41536l.m120488h(textView5, "binding.bottomLeftTitle");
        this.f40487j = new C18355e0(textView5, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        TextView textView6 = d.f27038e;
        C41536l.m120488h(textView6, "binding.bottomLeftText");
        this.f40488k = new C18355e0(textView6, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        C13551a aVar = C13551a.NEUTRAL;
        this.f40489l = aVar;
        TextView textView7 = d.f27041h;
        C41536l.m120488h(textView7, "binding.bottomRightTitle");
        this.f40490m = new C18355e0(textView7, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        TextView textView8 = d.f27040g;
        C41536l.m120488h(textView8, "binding.bottomRightText");
        this.f40491n = new C18355e0(textView8, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        this.f40492o = aVar;
        TextView textView9 = d.f27038e;
        C41536l.m120488h(textView9, "binding.bottomLeftText");
        this.f40493p = new C18351c0(textView9);
        TextView textView10 = d.f27040g;
        C41536l.m120488h(textView10, "binding.bottomRightText");
        this.f40494q = new C18351c0(textView10);
        int[] iArr = C17787l.f50213Yc;
        C41536l.m120488h(iArr, "ThumbnailGroupTextView");
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        int i2 = C17787l.f50324fd;
        if (obtainStyledAttributes.getResourceId(i2, 0) != 0) {
            setIcon(new Image.Resource(obtainStyledAttributes.getResourceId(i2, 0), (Boolean) null, 2, (DefaultConstructorMarker) null));
        }
        String string = obtainStyledAttributes.getString(C17787l.f50356hd);
        String str = "";
        setTopLeftTitle(string == null ? str : string);
        String string2 = obtainStyledAttributes.getString(C17787l.f50340gd);
        setTopLeftText(string2 == null ? str : string2);
        String string3 = obtainStyledAttributes.getString(C17787l.f50388jd);
        setTopRightTitle(string3 == null ? str : string3);
        String string4 = obtainStyledAttributes.getString(C17787l.f50372id);
        setTopRightText(string4 == null ? str : string4);
        String string5 = obtainStyledAttributes.getString(C17787l.f50260bd);
        setBottomLeftTitle(string5 == null ? str : string5);
        String string6 = obtainStyledAttributes.getString(C17787l.f50228Zc);
        setBottomLeftText(string6 == null ? str : string6);
        C13551a.C13552a aVar2 = C13551a.f40495e;
        setBottomLeftTextColor(aVar2.mo36994a(obtainStyledAttributes.getInt(C17787l.f50244ad, aVar.ordinal())));
        String string7 = obtainStyledAttributes.getString(C17787l.f50308ed);
        setBottomRightTitle(string7 == null ? str : string7);
        String string8 = obtainStyledAttributes.getString(C17787l.f50276cd);
        setBottomRightText(string8 != null ? string8 : str);
        setBottomRightTextColor(aVar2.mo36994a(obtainStyledAttributes.getInt(C17787l.f50292dd, aVar.ordinal())));
        obtainStyledAttributes.recycle();
    }
}
