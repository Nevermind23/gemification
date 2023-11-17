package p341ge.bog.designsystem.components.packagecard;

import af1.C40303i;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p352ak.C9897d5;
import p601sg.C17778c;
import p601sg.C17779d;
import p601sg.C17780e;
import p601sg.C17787l;
import p642vh.C18350c;
import p642vh.C18355e0;
import p642vh.C18375n;
import p684yi.C18924f;
import ue1.C43064a;

/* renamed from: ge.bog.designsystem.components.packagecard.SoloCardView */
public final class SoloCardView extends LayerView {

    /* renamed from: q */
    static final /* synthetic */ C40303i[] f39947q;

    /* renamed from: d */
    private final C9897d5 f39948d;

    /* renamed from: e */
    private final C18355e0 f39949e;

    /* renamed from: f */
    private final C18355e0 f39950f;

    /* renamed from: g */
    private final C18375n f39951g;

    /* renamed from: h */
    private final C18355e0 f39952h;

    /* renamed from: i */
    private final C18355e0 f39953i;

    /* renamed from: j */
    private final C18375n f39954j;

    /* renamed from: k */
    private final C18355e0 f39955k;

    /* renamed from: l */
    private final C18355e0 f39956l;

    /* renamed from: m */
    private final C18375n f39957m;

    /* renamed from: n */
    private final C18355e0 f39958n;

    /* renamed from: o */
    private final C18350c f39959o;

    /* renamed from: p */
    private C13418a f39960p;

    /* renamed from: ge.bog.designsystem.components.packagecard.SoloCardView$a */
    public interface C13418a {
        /* renamed from: h */
        void mo36342h();
    }

    static {
        Class<SoloCardView> cls = SoloCardView.class;
        f39947q = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "headerTitle", "getHeaderTitle()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "headerDesc", "getHeaderDesc()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "headerIcon", "getHeaderIcon()Lge/bog/designsystem/components/common/Image;", 0)), C41520a0.m120439e(new C41539o(cls, "topTitle", "getTopTitle()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "topDesc", "getTopDesc()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "topIcon", "getTopIcon()Lge/bog/designsystem/components/common/Image;", 0)), C41520a0.m120439e(new C41539o(cls, "bottomTitle", "getBottomTitle()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "bottomDesc", "getBottomDesc()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "bottomIcon", "getBottomIcon()Lge/bog/designsystem/components/common/Image;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonText", "getButtonText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "backgroundColor", "getBackgroundColor()Lge/bog/designsystem/components/common/Color;", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SoloCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final void m50408b(SoloCardView soloCardView, View view) {
        C41536l.m120489i(soloCardView, "this$0");
        C13418a aVar = soloCardView.f39960p;
        if (aVar != null) {
            aVar.mo36342h();
        }
    }

    public final Color getBackgroundColor() {
        return this.f39959o.getValue(this, f39947q[10]);
    }

    public final CharSequence getBottomDesc() {
        return this.f39956l.getValue(this, f39947q[7]);
    }

    public final Image getBottomIcon() {
        return this.f39957m.getValue(this, f39947q[8]);
    }

    public final CharSequence getBottomTitle() {
        return this.f39955k.getValue(this, f39947q[6]);
    }

    public final CharSequence getButtonText() {
        return this.f39958n.getValue(this, f39947q[9]);
    }

    public final CharSequence getHeaderDesc() {
        return this.f39950f.getValue(this, f39947q[1]);
    }

    public final Image getHeaderIcon() {
        return this.f39951g.getValue(this, f39947q[2]);
    }

    public final CharSequence getHeaderTitle() {
        return this.f39949e.getValue(this, f39947q[0]);
    }

    public final CharSequence getTopDesc() {
        return this.f39953i.getValue(this, f39947q[4]);
    }

    public final Image getTopIcon() {
        return this.f39954j.getValue(this, f39947q[5]);
    }

    public final CharSequence getTopTitle() {
        return this.f39952h.getValue(this, f39947q[3]);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(C43429k.m124585d(View.MeasureSpec.getSize(i2), getResources().getDimensionPixelSize(C17779d.solo_card_min_height)), 1073741824));
    }

    public final void setBackgroundColor(Color color) {
        this.f39959o.setValue(this, f39947q[10], color);
    }

    public final void setBottomDesc(CharSequence charSequence) {
        this.f39956l.setValue(this, f39947q[7], charSequence);
    }

    public final void setBottomIcon(Image image) {
        this.f39957m.setValue(this, f39947q[8], image);
    }

    public final void setBottomTitle(CharSequence charSequence) {
        this.f39955k.setValue(this, f39947q[6], charSequence);
    }

    public final void setButtonText(CharSequence charSequence) {
        this.f39958n.setValue(this, f39947q[9], charSequence);
    }

    public final void setHeaderDesc(CharSequence charSequence) {
        this.f39950f.setValue(this, f39947q[1], charSequence);
    }

    public final void setHeaderIcon(Image image) {
        this.f39951g.setValue(this, f39947q[2], image);
    }

    public final void setHeaderTitle(CharSequence charSequence) {
        this.f39949e.setValue(this, f39947q[0], charSequence);
    }

    public final void setOnButtonClickListener(C13418a aVar) {
        C41536l.m120489i(aVar, "listener");
        this.f39960p = aVar;
    }

    public final void setTopDesc(CharSequence charSequence) {
        this.f39953i.setValue(this, f39947q[4], charSequence);
    }

    public final void setTopIcon(Image image) {
        this.f39954j.setValue(this, f39947q[5], image);
    }

    public final void setTopTitle(CharSequence charSequence) {
        this.f39952h.setValue(this, f39947q[3], charSequence);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SoloCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SoloCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        C41536l.m120489i(context2, "context");
        C9897d5 d = C9897d5.m36302d(LayoutInflater.from(context), this, true);
        C41536l.m120488h(d, "inflate(LayoutInflater.from(context), this, true)");
        this.f39948d = d;
        AppCompatTextView appCompatTextView = d.f26910o;
        C41536l.m120488h(appCompatTextView, "binding.headerTitle");
        this.f39949e = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        AppCompatTextView appCompatTextView2 = d.f26907l;
        C41536l.m120488h(appCompatTextView2, "binding.headerDesc");
        this.f39950f = new C18355e0(appCompatTextView2, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        AppCompatImageView appCompatImageView = d.f26908m;
        C41536l.m120488h(appCompatImageView, "binding.headerIcon");
        this.f39951g = new C18375n(appCompatImageView);
        AppCompatTextView appCompatTextView3 = d.f26914s;
        C41536l.m120488h(appCompatTextView3, "binding.topTitle");
        this.f39952h = new C18355e0(appCompatTextView3, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        AppCompatTextView appCompatTextView4 = d.f26911p;
        C41536l.m120488h(appCompatTextView4, "binding.topDesc");
        this.f39953i = new C18355e0(appCompatTextView4, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        AppCompatImageView appCompatImageView2 = d.f26912q;
        C41536l.m120488h(appCompatImageView2, "binding.topIcon");
        this.f39954j = new C18375n(appCompatImageView2);
        AppCompatTextView appCompatTextView5 = d.f26904i;
        C41536l.m120488h(appCompatTextView5, "binding.bottomTitle");
        this.f39955k = new C18355e0(appCompatTextView5, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        AppCompatTextView appCompatTextView6 = d.f26901f;
        C41536l.m120488h(appCompatTextView6, "binding.bottomDesc");
        this.f39956l = new C18355e0(appCompatTextView6, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        AppCompatImageView appCompatImageView3 = d.f26902g;
        C41536l.m120488h(appCompatImageView3, "binding.bottomIcon");
        this.f39957m = new C18375n(appCompatImageView3);
        AppCompatTextView appCompatTextView7 = d.f26906k;
        C41536l.m120488h(appCompatTextView7, "binding.buttonText");
        this.f39958n = new C18355e0(appCompatTextView7, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        LayerView layerView = d.f26900e;
        C41536l.m120488h(layerView, "binding.background");
        this.f39959o = new C18350c(layerView);
        int[] iArr = C17787l.f50166Va;
        C41536l.m120488h(iArr, "SoloCardView");
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        String string = obtainStyledAttributes.getString(C17787l.f50290db);
        String str = "";
        setHeaderTitle(string == null ? str : string);
        String string2 = obtainStyledAttributes.getString(C17787l.f50258bb);
        setHeaderDesc(string2 == null ? str : string2);
        int i2 = C17787l.f50274cb;
        int i3 = C17780e.f49662k1;
        setHeaderIcon(new Image.Resource(obtainStyledAttributes.getResourceId(i2, i3), (Boolean) null, 2, (DefaultConstructorMarker) null));
        String string3 = obtainStyledAttributes.getString(C17787l.f50338gb);
        setTopTitle(string3 == null ? str : string3);
        String string4 = obtainStyledAttributes.getString(C17787l.f50306eb);
        setTopDesc(string4 == null ? str : string4);
        setTopIcon(new Image.Resource(obtainStyledAttributes.getResourceId(C17787l.f50322fb, i3), (Boolean) null, 2, (DefaultConstructorMarker) null));
        String string5 = obtainStyledAttributes.getString(C17787l.f50226Za);
        setBottomTitle(string5 == null ? str : string5);
        String string6 = obtainStyledAttributes.getString(C17787l.f50196Xa);
        setBottomDesc(string6 == null ? str : string6);
        setBottomIcon(new Image.Resource(obtainStyledAttributes.getResourceId(C17787l.f50211Ya, i3), (Boolean) null, 2, (DefaultConstructorMarker) null));
        String string7 = obtainStyledAttributes.getString(C17787l.f50242ab);
        setButtonText(string7 != null ? string7 : str);
        setBackgroundColor(new Color.Resource(obtainStyledAttributes.getResourceId(C17787l.f50181Wa, C17778c.f49627i)));
        obtainStyledAttributes.recycle();
        d.f26905j.setOnClickListener(new C18924f(this));
    }
}
