package p341ge.bog.designsystem.components.strength;

import af1.C40303i;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import he1.C41224m;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.progressbadge.ProgressBadgeView;
import p352ak.C9937i5;
import p408ej.C12476a;
import p520mj.C16714a;
import p520mj.C16716b;
import p601sg.C17787l;
import p642vh.C18355e0;
import p642vh.C18365j0;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.designsystem.components.strength.StrengthView */
public final class StrengthView extends LinearLayout {

    /* renamed from: j */
    static final /* synthetic */ C40303i[] f40375j;

    /* renamed from: d */
    private final C9937i5 f40376d;

    /* renamed from: e */
    private final C16714a f40377e;

    /* renamed from: f */
    private final C18355e0 f40378f;

    /* renamed from: g */
    private final C18355e0 f40379g;

    /* renamed from: h */
    private C16716b f40380h;

    /* renamed from: i */
    private final C18365j0 f40381i;

    /* renamed from: ge.bog.designsystem.components.strength.StrengthView$a */
    public /* synthetic */ class C13523a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40382a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                mj.b[] r0 = p520mj.C16716b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                mj.b r1 = p520mj.C16716b.UNVERIFIED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                mj.b r1 = p520mj.C16716b.WEAK     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                mj.b r1 = p520mj.C16716b.AVERAGE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                mj.b r1 = p520mj.C16716b.STRONG     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f40382a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.designsystem.components.strength.StrengthView.C13523a.<clinit>():void");
        }
    }

    static {
        Class<StrengthView> cls = StrengthView.class;
        f40375j = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "title", "getTitle()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "infoText", "getInfoText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "isProgressVisible", "isProgressVisible()Z", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StrengthView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* renamed from: a */
    private final void m50728a(C16716b bVar) {
        int i = C13523a.f40382a[bVar.ordinal()];
        if (i == 1) {
            ProgressBadgeView progressBadgeView = this.f40376d.f27117e;
            C12476a aVar = C12476a.NEUTRAL;
            progressBadgeView.setType(aVar);
            this.f40376d.f27119g.setType(aVar);
            this.f40376d.f27123k.setType(aVar);
        } else if (i == 2) {
            this.f40376d.f27117e.setType(C12476a.NEGATIVE);
            ProgressBadgeView progressBadgeView2 = this.f40376d.f27119g;
            C12476a aVar2 = C12476a.NEUTRAL;
            progressBadgeView2.setType(aVar2);
            this.f40376d.f27123k.setType(aVar2);
        } else if (i == 3) {
            ProgressBadgeView progressBadgeView3 = this.f40376d.f27117e;
            C12476a aVar3 = C12476a.PENDING;
            progressBadgeView3.setType(aVar3);
            this.f40376d.f27119g.setType(aVar3);
            this.f40376d.f27123k.setType(C12476a.NEUTRAL);
        } else if (i == 4) {
            ProgressBadgeView progressBadgeView4 = this.f40376d.f27117e;
            C12476a aVar4 = C12476a.POSITIVE;
            progressBadgeView4.setType(aVar4);
            this.f40376d.f27119g.setType(aVar4);
            this.f40376d.f27123k.setType(aVar4);
        }
    }

    public final CharSequence getInfoText() {
        return this.f40379g.getValue(this, f40375j[1]);
    }

    public final C16716b getProgressType() {
        return this.f40380h;
    }

    public final CharSequence getTitle() {
        return this.f40378f.getValue(this, f40375j[0]);
    }

    public final void setInfoText(CharSequence charSequence) {
        this.f40379g.setValue(this, f40375j[1], charSequence);
    }

    public final void setProgressType(C16716b bVar) {
        C41536l.m120489i(bVar, C11755a.C11756a.f34100b);
        this.f40380h = bVar;
        m50728a(bVar);
    }

    public final void setProgressVisible(boolean z) {
        this.f40381i.mo46151c(this, f40375j[2], z);
    }

    public final void setStatusList(List<? extends C41224m> list) {
        C41536l.m120489i(list, "list");
        this.f40377e.mo43834h(list);
    }

    public final void setTitle(CharSequence charSequence) {
        this.f40378f.setValue(this, f40375j[0], charSequence);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StrengthView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StrengthView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        C41536l.m120489i(context2, "context");
        C9937i5 c = C9937i5.m36449c(LayoutInflater.from(context), this);
        C41536l.m120488h(c, "inflate(LayoutInflater.from(context), this)");
        this.f40376d = c;
        C16714a aVar = new C16714a();
        this.f40377e = aVar;
        AppCompatTextView appCompatTextView = c.f27122j;
        C41536l.m120488h(appCompatTextView, "binding.strengthTitleText");
        this.f40378f = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        AppCompatTextView appCompatTextView2 = c.f27121i;
        C41536l.m120488h(appCompatTextView2, "binding.strengthInfoText");
        this.f40379g = new C18355e0(appCompatTextView2, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        this.f40380h = C16716b.UNVERIFIED;
        LinearLayout linearLayout = c.f27118f;
        C41536l.m120488h(linearLayout, "binding.progressLayout");
        this.f40381i = new C18365j0(linearLayout, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        setOrientation(1);
        c.f27120h.setAdapter(aVar);
        int[] iArr = C17787l.f50062Ob;
        C41536l.m120488h(iArr, "StrengthView");
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        setTitle(obtainStyledAttributes.getString(C17787l.f50122Sb));
        setInfoText(obtainStyledAttributes.getString(C17787l.f50077Pb));
        setProgressVisible(obtainStyledAttributes.getBoolean(C17787l.f50107Rb, true));
        C16716b a = C16716b.f46957e.mo43837a(obtainStyledAttributes.getInt(C17787l.f50092Qb, 1));
        if (a != null) {
            setProgressType(a);
        }
        obtainStyledAttributes.recycle();
    }
}
