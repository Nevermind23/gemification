package p341ge.bog.designsystem.components.interactiveamount;

import af1.C40303i;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.C1314o;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41551a;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import p341ge.bog.designsystem.components.common.Color;
import p352ak.C10026u3;
import p561pi.C17365a;
import p561pi.C17367b;
import p601sg.C17777b;
import p601sg.C17786k;
import p601sg.C17787l;
import p615tg.C17961b;
import p617ti.C17966a;
import p617ti.C17967b;
import p642vh.C18365j0;
import p642vh.C18379r;
import ue1.C43075l;

/* renamed from: ge.bog.designsystem.components.interactiveamount.InteractiveAmountView */
public final class InteractiveAmountView extends LinearLayout {

    /* renamed from: k */
    static final /* synthetic */ C40303i[] f39664k;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C10026u3 f39665d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f39666e;

    /* renamed from: f */
    private C17365a f39667f;

    /* renamed from: g */
    private final C41555e f39668g;

    /* renamed from: h */
    private final C18365j0 f39669h;

    /* renamed from: i */
    private final C18379r f39670i;

    /* renamed from: j */
    private final C41555e f39671j;

    /* renamed from: ge.bog.designsystem.components.interactiveamount.InteractiveAmountView$a */
    public enum C13353a {
        BLACK(r3, r4, r5, new Color.Attribute(r9)),
        WHITE(C17786k.TextH1White500Left, C17786k.TextH1White200Left, new Color.Attribute(C17777b.f49590A), new Color.Attribute(C17777b.color_white_tr_300)),
        INVERTED(C17786k.TextH1InvertComponents400Left, C17786k.TextH1InvertComponents200Left, new Color.Attribute(r8), new Color.Attribute(r9));
        

        /* renamed from: d */
        private final int f39676d;

        /* renamed from: e */
        private final int f39677e;

        /* renamed from: f */
        private final Color f39678f;

        /* renamed from: g */
        private final Color f39679g;

        private C13353a(int i, int i2, Color color, Color color2) {
            this.f39676d = i;
            this.f39677e = i2;
            this.f39678f = color;
            this.f39679g = color2;
        }

        /* renamed from: b */
        public final Color mo35978b() {
            return this.f39678f;
        }

        /* renamed from: c */
        public final Color mo35979c() {
            return this.f39679g;
        }

        /* renamed from: e */
        public final int mo35980e() {
            return this.f39676d;
        }

        /* renamed from: f */
        public final int mo35981f() {
            return this.f39677e;
        }
    }

    /* renamed from: ge.bog.designsystem.components.interactiveamount.InteractiveAmountView$b */
    public static final class C13354b extends C41553c {

        /* renamed from: a */
        final /* synthetic */ InteractiveAmountView f39680a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13354b(Object obj, InteractiveAmountView interactiveAmountView) {
            super(obj);
            this.f39680a = interactiveAmountView;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            List list = (List) obj2;
            if (!C41536l.m120484d((List) obj, list) && list != null) {
                if (this.f39680a.f39666e >= list.size()) {
                    this.f39680a.f39666e = 0;
                }
                InteractiveAmountView interactiveAmountView = this.f39680a;
                interactiveAmountView.setText((C17966a) list.get(interactiveAmountView.f39666e));
            }
        }
    }

    /* renamed from: ge.bog.designsystem.components.interactiveamount.InteractiveAmountView$c */
    public static final class C13355c extends C41553c {

        /* renamed from: a */
        final /* synthetic */ InteractiveAmountView f39681a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13355c(Object obj, InteractiveAmountView interactiveAmountView) {
            super(obj);
            this.f39681a = interactiveAmountView;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            C13353a aVar = (C13353a) obj2;
            C13353a aVar2 = (C13353a) obj;
            C1314o.m4575q(this.f39681a.f39665d.f27619e, aVar.mo35980e());
            this.f39681a.setChevronTint(aVar.mo35978b());
        }
    }

    static {
        Class<InteractiveAmountView> cls = InteractiveAmountView.class;
        f39664k = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "data", "getData()Ljava/util/List;", 0)), C41520a0.m120439e(new C41539o(cls, "chevronVisible", "getChevronVisible()Z", 0)), C41520a0.m120439e(new C41539o(cls, "chevronTint", "getChevronTint()Lge/bog/designsystem/components/common/Color;", 0)), C41520a0.m120439e(new C41539o(cls, "amountType", "getAmountType()Lge/bog/designsystem/components/interactiveamount/InteractiveAmountView$AmountType;", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InteractiveAmountView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final void m50270b(InteractiveAmountView interactiveAmountView, View view) {
        C41536l.m120489i(interactiveAmountView, "this$0");
        List<C17966a> data = interactiveAmountView.getData();
        if (data != null) {
            int size = (interactiveAmountView.f39666e + 1) % data.size();
            interactiveAmountView.f39666e = size;
            interactiveAmountView.setText(data.get(size));
        }
    }

    private final Color getChevronTint() {
        return this.f39670i.getValue(this, f39664k[2]);
    }

    /* access modifiers changed from: private */
    public final void setChevronTint(Color color) {
        this.f39670i.setValue(this, f39664k[2], color);
    }

    /* access modifiers changed from: private */
    public final void setText(C17966a aVar) {
        AppCompatTextView appCompatTextView = this.f39665d.f27619e;
        C17365a aVar2 = this.f39667f;
        String valueOf = String.valueOf(aVar.mo45638c());
        String a = C17961b.f51154a.mo45631a(aVar.mo45639d());
        appCompatTextView.setText(C17365a.C17366a.m60762a(aVar2, valueOf, (String) null, " " + a, 2, (Object) null));
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        Color color;
        int i;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C41536l.m120488h(drawableState, "drawableState");
        if (C41333m.m119793r(drawableState, 16842919)) {
            i = getAmountType().mo35981f();
            color = getAmountType().mo35979c();
        } else {
            i = getAmountType().mo35980e();
            color = getAmountType().mo35978b();
        }
        C1314o.m4575q(this.f39665d.f27619e, i);
        setChevronTint(color);
    }

    public final C13353a getAmountType() {
        return (C13353a) this.f39671j.getValue(this, f39664k[3]);
    }

    public final boolean getChevronVisible() {
        return this.f39669h.getValue(this, f39664k[1]).booleanValue();
    }

    public final List<C17966a> getData() {
        return (List) this.f39668g.getValue(this, f39664k[0]);
    }

    public final void setAmountType(C13353a aVar) {
        C41536l.m120489i(aVar, "<set-?>");
        this.f39671j.setValue(this, f39664k[3], aVar);
    }

    public final void setChevronVisible(boolean z) {
        this.f39669h.mo46151c(this, f39664k[1], z);
    }

    public final void setData(List<C17966a> list) {
        this.f39668g.setValue(this, f39664k[0], list);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InteractiveAmountView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InteractiveAmountView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        C10026u3 c = C10026u3.m36774c(LayoutInflater.from(context), this);
        C41536l.m120488h(c, "inflate(LayoutInflater.from(context), this)");
        this.f39665d = c;
        C17367b bVar = new C17367b((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
        bVar.mo44810m("###,##0.00");
        this.f39667f = bVar;
        C41551a aVar = C41551a.f97718a;
        this.f39668g = new C13354b((Object) null, this);
        AppCompatImageView appCompatImageView = c.f27620f;
        C41536l.m120488h(appCompatImageView, "binding.chevron");
        this.f39669h = new C18365j0(appCompatImageView, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        AppCompatImageView appCompatImageView2 = c.f27620f;
        C41536l.m120488h(appCompatImageView2, "binding.chevron");
        this.f39670i = new C18379r(appCompatImageView2);
        C13353a aVar2 = C13353a.BLACK;
        this.f39671j = new C13355c(aVar2, this);
        setOrientation(0);
        setGravity(17);
        setClickable(true);
        setFocusable(true);
        int[] iArr = C17787l.f50027M6;
        C41536l.m120488h(iArr, "InteractiveAmountView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        int i2 = obtainStyledAttributes.getInt(C17787l.f50042N6, 0);
        if (i2 != 0) {
            if (i2 == 1) {
                aVar2 = C13353a.WHITE;
            } else if (i2 == 2) {
                aVar2 = C13353a.INVERTED;
            } else {
                throw new IllegalStateException("Unknown text color");
            }
        }
        setAmountType(aVar2);
        setChevronVisible(obtainStyledAttributes.getBoolean(C17787l.f50057O6, true));
        obtainStyledAttributes.recycle();
        setOnClickListener(new C17967b(this));
    }
}
