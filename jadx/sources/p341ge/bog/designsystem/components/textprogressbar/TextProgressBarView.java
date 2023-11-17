package p341ge.bog.designsystem.components.textprogressbar;

import af1.C40303i;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0767a;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import java.util.Arrays;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41524c0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p352ak.C9890c6;
import p422fj.C12918a;
import p422fj.C12920b;
import p601sg.C17778c;
import p601sg.C17787l;
import p642vh.C18365j0;
import ue1.C43075l;

/* renamed from: ge.bog.designsystem.components.textprogressbar.TextProgressBarView */
public final class TextProgressBarView extends ConstraintLayout {

    /* renamed from: n */
    static final /* synthetic */ C40303i[] f40423n;

    /* renamed from: d */
    private final C9890c6 f40424d;

    /* renamed from: e */
    private final C18365j0 f40425e;

    /* renamed from: f */
    private final C18365j0 f40426f;

    /* renamed from: g */
    private final C18365j0 f40427g;

    /* renamed from: h */
    private final C18365j0 f40428h;

    /* renamed from: i */
    private final C18365j0 f40429i;

    /* renamed from: j */
    private C12918a f40430j;

    /* renamed from: k */
    private C12920b f40431k;

    /* renamed from: l */
    private C12920b f40432l;

    /* renamed from: m */
    private C13541a f40433m;

    /* renamed from: ge.bog.designsystem.components.textprogressbar.TextProgressBarView$a */
    public enum C13541a {
        BLACK(C17778c.color_black_tr_400, C17778c.color_black_tr_150),
        WHITE(C17778c.f49625e0, C17778c.color_white_tr_150),
        CLEAR(C17778c.f49637v, C17778c.f49635t);
        

        /* renamed from: d */
        private final int f40456d;

        /* renamed from: e */
        private final int f40457e;

        private C13541a(int i, int i2) {
            this.f40456d = i;
            this.f40457e = i2;
        }

        /* renamed from: b */
        public final int mo36936b() {
            return this.f40457e;
        }

        /* renamed from: c */
        public final int mo36937c() {
            return this.f40456d;
        }
    }

    /* renamed from: ge.bog.designsystem.components.textprogressbar.TextProgressBarView$b */
    public /* synthetic */ class C13542b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40458a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                fj.b[] r0 = p422fj.C12920b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                fj.b r1 = p422fj.C12920b.POSITIVE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                fj.b r1 = p422fj.C12920b.NEGATIVE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                fj.b r1 = p422fj.C12920b.PENDING     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                fj.b r1 = p422fj.C12920b.PRIMARY     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f40458a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.designsystem.components.textprogressbar.TextProgressBarView.C13542b.<clinit>():void");
        }
    }

    static {
        Class<TextProgressBarView> cls = TextProgressBarView.class;
        f40423n = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "leftTextVisible", "getLeftTextVisible()Z", 0)), C41520a0.m120439e(new C41539o(cls, "rightTextVisible", "getRightTextVisible()Z", 0)), C41520a0.m120439e(new C41539o(cls, "progressTextVisible", "getProgressTextVisible()Z", 0)), C41520a0.m120439e(new C41539o(cls, "isBudgetVisible", "isBudgetVisible()Z", 0)), C41520a0.m120439e(new C41539o(cls, "isBudgetLimitVisible", "isBudgetLimitVisible()Z", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TextProgressBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    private final boolean getLeftTextVisible() {
        return this.f40425e.getValue(this, f40423n[0]).booleanValue();
    }

    private final boolean getProgressTextVisible() {
        return this.f40427g.getValue(this, f40423n[2]).booleanValue();
    }

    private final boolean getRightTextVisible() {
        return this.f40426f.getValue(this, f40423n[1]).booleanValue();
    }

    private final void setBudgetLimitVisible(boolean z) {
        this.f40429i.mo46151c(this, f40423n[4], z);
    }

    private final void setBudgetVisible(boolean z) {
        this.f40428h.mo46151c(this, f40423n[3], z);
    }

    private final void setLeftTextVisible(boolean z) {
        this.f40425e.mo46151c(this, f40423n[0], z);
    }

    private final void setProgressTextVisible(boolean z) {
        this.f40427g.mo46151c(this, f40423n[2], z);
    }

    private final void setRightTextVisible(boolean z) {
        this.f40426f.mo46151c(this, f40423n[1], z);
    }

    public final C13541a getColorTheme() {
        return this.f40433m;
    }

    public final C12918a getProgressBarThicknessType() {
        return this.f40430j;
    }

    public final C12920b getProgressBarTypeFull() {
        return this.f40431k;
    }

    public final C12920b getProgressBarTypeNotFull() {
        return this.f40432l;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0193  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setBudget(p341ge.bog.designsystem.components.textprogressbar.TextProgressBarView.ProgressModel r11) {
        /*
            r10 = this;
            java.lang.String r0 = "model"
            kotlin.jvm.internal.C41536l.m120489i(r11, r0)
            boolean r0 = r11 instanceof p341ge.bog.designsystem.components.textprogressbar.TextProgressBarView.ProgressModel.Progress
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x019a
            ge.bog.designsystem.components.textprogressbar.TextProgressBarView$ProgressModel$Progress r11 = (p341ge.bog.designsystem.components.textprogressbar.TextProgressBarView.ProgressModel.Progress) r11
            float r0 = r11.mo36901b()
            float r3 = r11.mo36908h()
            float r0 = r0 / r3
            r3 = 100
            float r3 = (float) r3
            float r0 = r0 * r3
            boolean r3 = r11.mo36902d()
            r4 = 4
            java.lang.String r5 = "%,.2f %s"
            java.lang.String r6 = "format(format, *args)"
            r7 = 2
            if (r3 == 0) goto L_0x005d
            ak.c6 r3 = r10.f40424d
            androidx.appcompat.widget.AppCompatTextView r3 = r3.f26869e
            r3.setVisibility(r4)
            ak.c6 r3 = r10.f40424d
            androidx.appcompat.widget.AppCompatTextView r3 = r3.f26872h
            kotlin.jvm.internal.c0 r8 = kotlin.jvm.internal.C41524c0.f97701a
            java.lang.Object[] r8 = new java.lang.Object[r7]
            float r9 = r11.mo36908h()
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            r8[r1] = r9
            java.lang.String r9 = r11.mo36900a()
            r8[r2] = r9
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r7)
            java.lang.String r5 = java.lang.String.format(r5, r8)
            kotlin.jvm.internal.C41536l.m120488h(r5, r6)
            r3.setText(r5)
            ak.c6 r3 = r10.f40424d
            androidx.appcompat.widget.AppCompatTextView r3 = r3.f26872h
            int r5 = p601sg.C17786k.TextCaption2InvertComponents400Left
            androidx.core.widget.C1314o.m4575q(r3, r5)
            goto L_0x00b9
        L_0x005d:
            ak.c6 r3 = r10.f40424d
            androidx.appcompat.widget.AppCompatTextView r3 = r3.f26869e
            r3.setVisibility(r1)
            ak.c6 r3 = r10.f40424d
            androidx.appcompat.widget.AppCompatTextView r3 = r3.f26869e
            kotlin.jvm.internal.c0 r8 = kotlin.jvm.internal.C41524c0.f97701a
            java.lang.Object[] r8 = new java.lang.Object[r7]
            float r9 = r11.mo36901b()
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            r8[r1] = r9
            java.lang.String r9 = r11.mo36900a()
            r8[r2] = r9
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r7)
            java.lang.String r5 = java.lang.String.format(r5, r8)
            kotlin.jvm.internal.C41536l.m120488h(r5, r6)
            r3.setText(r5)
            ak.c6 r3 = r10.f40424d
            androidx.appcompat.widget.AppCompatTextView r3 = r3.f26872h
            java.lang.Object[] r5 = new java.lang.Object[r7]
            float r8 = r11.mo36908h()
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            r5[r1] = r8
            java.lang.String r8 = r11.mo36900a()
            r5[r2] = r8
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r7)
            java.lang.String r8 = "/ %,.2f %s"
            java.lang.String r5 = java.lang.String.format(r8, r5)
            kotlin.jvm.internal.C41536l.m120488h(r5, r6)
            r3.setText(r5)
            ak.c6 r3 = r10.f40424d
            androidx.appcompat.widget.AppCompatTextView r3 = r3.f26872h
            int r5 = p601sg.C17786k.f49839z0
            androidx.core.widget.C1314o.m4575q(r3, r5)
        L_0x00b9:
            fj.b r3 = r11.mo36906f()
            if (r3 == 0) goto L_0x00c2
            r10.setProgressBarTypeFull(r3)
        L_0x00c2:
            fj.b r3 = r11.mo36907g()
            if (r3 == 0) goto L_0x00cb
            r10.setProgressBarTypeNotFull(r3)
        L_0x00cb:
            float r3 = r11.mo36908h()
            float r5 = r11.mo36901b()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x00d9
            r3 = r2
            goto L_0x00da
        L_0x00d9:
            r3 = r1
        L_0x00da:
            if (r3 == 0) goto L_0x00e6
            ak.c6 r3 = r10.f40424d
            ge.bog.designsystem.components.progressbar.ProgressBarView r3 = r3.f26871g
            fj.b r5 = r10.f40431k
            r3.setType(r5)
            goto L_0x00ef
        L_0x00e6:
            ak.c6 r3 = r10.f40424d
            ge.bog.designsystem.components.progressbar.ProgressBarView r3 = r3.f26871g
            fj.b r5 = r10.f40432l
            r3.setType(r5)
        L_0x00ef:
            ak.c6 r3 = r10.f40424d
            ge.bog.designsystem.components.progressbar.ProgressBarView r3 = r3.f26871g
            r3.setProgress(r0)
            ak.c6 r3 = r10.f40424d
            androidx.appcompat.widget.AppCompatTextView r3 = r3.f26873i
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.Float r8 = java.lang.Float.valueOf(r0)
            r5[r1] = r8
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r2)
            java.lang.String r8 = "%,.2f %%"
            java.lang.String r5 = java.lang.String.format(r8, r5)
            kotlin.jvm.internal.C41536l.m120488h(r5, r6)
            r3.setText(r5)
            double r5 = (double) r0
            r8 = 4636737291354636288(0x4059000000000000, double:100.0)
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x0122
            ak.c6 r0 = r10.f40424d
            ge.bog.designsystem.components.progressbar.ProgressBarView r0 = r0.f26871g
            fj.b r3 = r10.f40431k
            r0.setType(r3)
        L_0x0122:
            java.lang.String r0 = r11.mo36904e()
            if (r0 == 0) goto L_0x0131
            boolean r0 = cf1.C40439w.m117118v(r0)
            if (r0 == 0) goto L_0x012f
            goto L_0x0131
        L_0x012f:
            r0 = r1
            goto L_0x0132
        L_0x0131:
            r0 = r2
        L_0x0132:
            if (r0 != 0) goto L_0x0163
            java.lang.String r0 = r11.mo36910i()
            if (r0 == 0) goto L_0x0143
            boolean r0 = cf1.C40439w.m117118v(r0)
            if (r0 == 0) goto L_0x0141
            goto L_0x0143
        L_0x0141:
            r0 = r1
            goto L_0x0144
        L_0x0143:
            r0 = r2
        L_0x0144:
            if (r0 != 0) goto L_0x0163
            r10.setLeftTextVisible(r2)
            r10.setRightTextVisible(r2)
            ak.c6 r0 = r10.f40424d
            androidx.appcompat.widget.AppCompatTextView r0 = r0.f26870f
            java.lang.String r1 = r11.mo36904e()
            r0.setText(r1)
            ak.c6 r0 = r10.f40424d
            androidx.appcompat.widget.AppCompatTextView r0 = r0.f26874j
            java.lang.String r11 = r11.mo36910i()
            r0.setText(r11)
            goto L_0x0169
        L_0x0163:
            r10.setLeftTextVisible(r1)
            r10.setRightTextVisible(r1)
        L_0x0169:
            ak.c6 r11 = r10.f40424d
            androidx.appcompat.widget.AppCompatTextView r0 = r11.f26873i
            ge.bog.designsystem.components.progressbar.ProgressBarView r11 = r11.f26871g
            fj.b r11 = r11.getType()
            int[] r1 = p341ge.bog.designsystem.components.textprogressbar.TextProgressBarView.C13542b.f40458a
            int r11 = r11.ordinal()
            r11 = r1[r11]
            if (r11 == r2) goto L_0x0193
            if (r11 == r7) goto L_0x0190
            r1 = 3
            if (r11 == r1) goto L_0x018d
            if (r11 != r4) goto L_0x0187
            int r11 = p601sg.C17786k.f49839z0
            goto L_0x0195
        L_0x0187:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        L_0x018d:
            int r11 = p601sg.C17786k.TextCaption1Pending500Left
            goto L_0x0195
        L_0x0190:
            int r11 = p601sg.C17786k.f49836u0
            goto L_0x0195
        L_0x0193:
            int r11 = p601sg.C17786k.f49820C0
        L_0x0195:
            androidx.core.widget.C1314o.m4575q(r0, r11)
            goto L_0x0229
        L_0x019a:
            boolean r0 = r11 instanceof p341ge.bog.designsystem.components.textprogressbar.TextProgressBarView.ProgressModel.TransactionProgress
            if (r0 == 0) goto L_0x0229
            ak.c6 r0 = r10.f40424d
            r10.setLeftTextVisible(r2)
            androidx.appcompat.widget.AppCompatTextView r3 = r0.f26870f
            ge.bog.designsystem.components.textprogressbar.TextProgressBarView$ProgressModel$TransactionProgress r11 = (p341ge.bog.designsystem.components.textprogressbar.TextProgressBarView.ProgressModel.TransactionProgress) r11
            java.lang.String r4 = r11.mo36918b()
            r3.setText(r4)
            r10.setRightTextVisible(r2)
            androidx.appcompat.widget.AppCompatTextView r3 = r0.f26874j
            java.lang.String r4 = r11.mo36927i()
            r3.setText(r4)
            androidx.appcompat.widget.AppCompatTextView r3 = r0.f26873i
            java.lang.String r4 = r11.mo36921e()
            r3.setText(r4)
            android.content.Context r4 = r3.getContext()
            int r5 = r11.mo36917a()
            int r4 = androidx.core.content.C0767a.m2893c(r4, r5)
            r3.setTextColor(r4)
            r10.setBudgetLimitVisible(r1)
            r10.setBudgetVisible(r2)
            androidx.appcompat.widget.AppCompatTextView r1 = r0.f26869e
            java.lang.String r2 = r11.mo36929k()
            r1.setText(r2)
            android.content.Context r2 = r1.getContext()
            int r3 = r11.mo36925h()
            int r2 = androidx.core.content.C0767a.m2893c(r2, r3)
            r1.setTextColor(r2)
            androidx.appcompat.widget.AppCompatTextView r1 = r0.f26870f
            android.content.Context r2 = r10.getContext()
            int r3 = r11.mo36919d()
            int r2 = androidx.core.content.C0767a.m2893c(r2, r3)
            r1.setTextColor(r2)
            androidx.appcompat.widget.AppCompatTextView r1 = r0.f26874j
            android.content.Context r2 = r10.getContext()
            int r3 = r11.mo36928j()
            int r2 = androidx.core.content.C0767a.m2893c(r2, r3)
            r1.setTextColor(r2)
            fj.b r1 = r11.mo36923f()
            r10.setProgressBarTypeNotFull(r1)
            fj.b r1 = r11.mo36923f()
            r10.setProgressBarTypeFull(r1)
            ge.bog.designsystem.components.progressbar.ProgressBarView r0 = r0.f26871g
            float r11 = r11.mo36924g()
            r0.setProgress(r11)
        L_0x0229:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.designsystem.components.textprogressbar.TextProgressBarView.setBudget(ge.bog.designsystem.components.textprogressbar.TextProgressBarView$ProgressModel):void");
    }

    public final void setColorTheme(C13541a aVar) {
        C41536l.m120489i(aVar, C11755a.C11756a.f34100b);
        this.f40433m = aVar;
        int c = C0767a.m2893c(getContext(), aVar.mo36937c());
        this.f40424d.f26869e.setTextColor(c);
        this.f40424d.f26872h.setTextColor(C0767a.m2893c(getContext(), aVar.mo36936b()));
        this.f40424d.f26870f.setTextColor(c);
        this.f40424d.f26874j.setTextColor(c);
    }

    public final void setProgressBarThicknessType(C12918a aVar) {
        C41536l.m120489i(aVar, C11755a.C11756a.f34100b);
        this.f40430j = aVar;
        this.f40424d.f26871g.setProgressBarThicknessType(aVar);
    }

    public final void setProgressBarTypeFull(C12920b bVar) {
        C41536l.m120489i(bVar, C11755a.C11756a.f34100b);
        this.f40431k = bVar;
        this.f40424d.f26871g.setProgressBarTypeFull(bVar);
    }

    public final void setProgressBarTypeNotFull(C12920b bVar) {
        C41536l.m120489i(bVar, C11755a.C11756a.f34100b);
        this.f40432l = bVar;
        this.f40424d.f26871g.setProgressBarTypeNotFull(bVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextProgressBarView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextProgressBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C12920b bVar;
        C12920b bVar2;
        Context context2 = context;
        C41536l.m120489i(context2, "context");
        C9890c6 d = C9890c6.m36275d(LayoutInflater.from(context), this, true);
        C41536l.m120488h(d, "inflate(\n            Lay…     this, true\n        )");
        this.f40424d = d;
        AppCompatTextView appCompatTextView = d.f26870f;
        C41536l.m120488h(appCompatTextView, "binding.leftBottomText");
        this.f40425e = new C18365j0(appCompatTextView, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        AppCompatTextView appCompatTextView2 = d.f26874j;
        C41536l.m120488h(appCompatTextView2, "binding.rightBottomText");
        this.f40426f = new C18365j0(appCompatTextView2, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        AppCompatTextView appCompatTextView3 = d.f26873i;
        C41536l.m120488h(appCompatTextView3, "binding.progressText");
        this.f40427g = new C18365j0(appCompatTextView3, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        AppCompatTextView appCompatTextView4 = d.f26869e;
        C41536l.m120488h(appCompatTextView4, "binding.currentProgressText");
        this.f40428h = new C18365j0(appCompatTextView4, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        AppCompatTextView appCompatTextView5 = d.f26872h;
        C41536l.m120488h(appCompatTextView5, "binding.progressLimitText");
        this.f40429i = new C18365j0(appCompatTextView5, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        this.f40430j = C12918a.THIN;
        this.f40431k = C12920b.NEGATIVE;
        this.f40432l = C12920b.POSITIVE;
        this.f40433m = C13541a.BLACK;
        AppCompatTextView appCompatTextView6 = d.f26873i;
        C41524c0 c0Var = C41524c0.f97701a;
        String format = String.format("%,.2f %%", Arrays.copyOf(new Object[]{Float.valueOf(d.f26871g.getProgress())}, 1));
        C41536l.m120488h(format, "format(format, *args)");
        appCompatTextView6.setText(format);
        int[] iArr = C17787l.f49988Jc;
        C41536l.m120488h(iArr, "TextProgressBarView");
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        C12918a a = C12918a.f38142f.mo33672a(obtainStyledAttributes.getInt(C17787l.f50033Mc, 1));
        C41536l.m120486f(a);
        setProgressBarThicknessType(a);
        int i2 = obtainStyledAttributes.getInt(C17787l.f50003Kc, 2);
        int i3 = obtainStyledAttributes.getInt(C17787l.f50018Lc, 1);
        C12920b[] values = C12920b.values();
        int length = values.length;
        int i4 = 0;
        while (true) {
            bVar = null;
            if (i4 >= length) {
                bVar2 = null;
                break;
            }
            bVar2 = values[i4];
            if (bVar2.mo33673c() == i2) {
                break;
            }
            i4++;
        }
        if (bVar2 != null) {
            setProgressBarTypeFull(bVar2);
        }
        C12920b[] values2 = C12920b.values();
        int length2 = values2.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length2) {
                break;
            }
            C12920b bVar3 = values2[i5];
            if (bVar3.mo33673c() == i3) {
                bVar = bVar3;
                break;
            }
            i5++;
        }
        if (bVar != null) {
            setProgressBarTypeNotFull(bVar);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: ge.bog.designsystem.components.textprogressbar.TextProgressBarView$ProgressModel */
    public static abstract class ProgressModel implements Parcelable {

        /* renamed from: ge.bog.designsystem.components.textprogressbar.TextProgressBarView$ProgressModel$Progress */
        public static final class Progress extends ProgressModel {
            public static final Parcelable.Creator<Progress> CREATOR = new C13539a();

            /* renamed from: d */
            private final float f40434d;

            /* renamed from: e */
            private final float f40435e;

            /* renamed from: f */
            private final String f40436f;

            /* renamed from: g */
            private final String f40437g;

            /* renamed from: h */
            private final String f40438h;

            /* renamed from: i */
            private final boolean f40439i;

            /* renamed from: j */
            private final C12920b f40440j;

            /* renamed from: k */
            private final C12920b f40441k;

            /* renamed from: ge.bog.designsystem.components.textprogressbar.TextProgressBarView$ProgressModel$Progress$a */
            public static final class C13539a implements Parcelable.Creator {
                /* renamed from: a */
                public final Progress createFromParcel(Parcel parcel) {
                    C41536l.m120489i(parcel, "parcel");
                    return new Progress(parcel.readFloat(), parcel.readFloat(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : C12920b.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : C12920b.valueOf(parcel.readString()));
                }

                /* renamed from: b */
                public final Progress[] newArray(int i) {
                    return new Progress[i];
                }
            }

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public /* synthetic */ Progress(float r12, float r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, boolean r17, p422fj.C12920b r18, p422fj.C12920b r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
                /*
                    r11 = this;
                    r0 = r20
                    r1 = r0 & 32
                    if (r1 == 0) goto L_0x0009
                    r1 = 0
                    r8 = r1
                    goto L_0x000b
                L_0x0009:
                    r8 = r17
                L_0x000b:
                    r1 = r0 & 64
                    r2 = 0
                    if (r1 == 0) goto L_0x0012
                    r9 = r2
                    goto L_0x0014
                L_0x0012:
                    r9 = r18
                L_0x0014:
                    r0 = r0 & 128(0x80, float:1.794E-43)
                    if (r0 == 0) goto L_0x001a
                    r10 = r2
                    goto L_0x001c
                L_0x001a:
                    r10 = r19
                L_0x001c:
                    r2 = r11
                    r3 = r12
                    r4 = r13
                    r5 = r14
                    r6 = r15
                    r7 = r16
                    r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.designsystem.components.textprogressbar.TextProgressBarView.ProgressModel.Progress.<init>(float, float, java.lang.String, java.lang.String, java.lang.String, boolean, fj.b, fj.b, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }

            /* renamed from: a */
            public final String mo36900a() {
                return this.f40436f;
            }

            /* renamed from: b */
            public final float mo36901b() {
                return this.f40434d;
            }

            /* renamed from: d */
            public final boolean mo36902d() {
                return this.f40439i;
            }

            public int describeContents() {
                return 0;
            }

            /* renamed from: e */
            public final String mo36904e() {
                return this.f40437g;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Progress)) {
                    return false;
                }
                Progress progress = (Progress) obj;
                return Float.compare(this.f40434d, progress.f40434d) == 0 && Float.compare(this.f40435e, progress.f40435e) == 0 && C41536l.m120484d(this.f40436f, progress.f40436f) && C41536l.m120484d(this.f40437g, progress.f40437g) && C41536l.m120484d(this.f40438h, progress.f40438h) && this.f40439i == progress.f40439i && this.f40440j == progress.f40440j && this.f40441k == progress.f40441k;
            }

            /* renamed from: f */
            public final C12920b mo36906f() {
                return this.f40440j;
            }

            /* renamed from: g */
            public final C12920b mo36907g() {
                return this.f40441k;
            }

            /* renamed from: h */
            public final float mo36908h() {
                return this.f40435e;
            }

            public int hashCode() {
                int floatToIntBits = ((((Float.floatToIntBits(this.f40434d) * 31) + Float.floatToIntBits(this.f40435e)) * 31) + this.f40436f.hashCode()) * 31;
                String str = this.f40437g;
                int i = 0;
                int hashCode = (floatToIntBits + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f40438h;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                boolean z = this.f40439i;
                if (z) {
                    z = true;
                }
                int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
                C12920b bVar = this.f40440j;
                int hashCode3 = (i2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
                C12920b bVar2 = this.f40441k;
                if (bVar2 != null) {
                    i = bVar2.hashCode();
                }
                return hashCode3 + i;
            }

            /* renamed from: i */
            public final String mo36910i() {
                return this.f40438h;
            }

            public String toString() {
                float f = this.f40434d;
                float f2 = this.f40435e;
                String str = this.f40436f;
                String str2 = this.f40437g;
                String str3 = this.f40438h;
                boolean z = this.f40439i;
                C12920b bVar = this.f40440j;
                C12920b bVar2 = this.f40441k;
                return "Progress(currentProgress=" + f + ", progressLimit=" + f2 + ", ccy=" + str + ", leftText=" + str2 + ", rightText=" + str3 + ", hideCurrentProgressText=" + z + ", progressBarTypeFull=" + bVar + ", progressBarTypeNotFull=" + bVar2 + ")";
            }

            public void writeToParcel(Parcel parcel, int i) {
                C41536l.m120489i(parcel, "out");
                parcel.writeFloat(this.f40434d);
                parcel.writeFloat(this.f40435e);
                parcel.writeString(this.f40436f);
                parcel.writeString(this.f40437g);
                parcel.writeString(this.f40438h);
                parcel.writeInt(this.f40439i ? 1 : 0);
                C12920b bVar = this.f40440j;
                if (bVar == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(bVar.name());
                }
                C12920b bVar2 = this.f40441k;
                if (bVar2 == null) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(1);
                parcel.writeString(bVar2.name());
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Progress(float f, float f2, String str, String str2, String str3, boolean z, C12920b bVar, C12920b bVar2) {
                super((DefaultConstructorMarker) null);
                C41536l.m120489i(str, "ccy");
                this.f40434d = f;
                this.f40435e = f2;
                this.f40436f = str;
                this.f40437g = str2;
                this.f40438h = str3;
                this.f40439i = z;
                this.f40440j = bVar;
                this.f40441k = bVar2;
            }
        }

        private ProgressModel() {
        }

        public /* synthetic */ ProgressModel(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: ge.bog.designsystem.components.textprogressbar.TextProgressBarView$ProgressModel$TransactionProgress */
        public static final class TransactionProgress extends ProgressModel {
            public static final Parcelable.Creator<TransactionProgress> CREATOR = new C13540a();

            /* renamed from: d */
            private final String f40442d;

            /* renamed from: e */
            private final String f40443e;

            /* renamed from: f */
            private final float f40444f;

            /* renamed from: g */
            private final String f40445g;

            /* renamed from: h */
            private final String f40446h;

            /* renamed from: i */
            private final C12920b f40447i;

            /* renamed from: j */
            private final int f40448j;

            /* renamed from: k */
            private final int f40449k;

            /* renamed from: l */
            private final int f40450l;

            /* renamed from: m */
            private final int f40451m;

            /* renamed from: ge.bog.designsystem.components.textprogressbar.TextProgressBarView$ProgressModel$TransactionProgress$a */
            public static final class C13540a implements Parcelable.Creator {
                /* renamed from: a */
                public final TransactionProgress createFromParcel(Parcel parcel) {
                    C41536l.m120489i(parcel, "parcel");
                    return new TransactionProgress(parcel.readString(), parcel.readString(), parcel.readFloat(), parcel.readString(), parcel.readString(), C12920b.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                }

                /* renamed from: b */
                public final TransactionProgress[] newArray(int i) {
                    return new TransactionProgress[i];
                }
            }

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public /* synthetic */ TransactionProgress(java.lang.String r14, java.lang.String r15, float r16, java.lang.String r17, java.lang.String r18, p422fj.C12920b r19, int r20, int r21, int r22, int r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
                /*
                    r13 = this;
                    r0 = r24
                    r1 = r0 & 32
                    if (r1 == 0) goto L_0x000a
                    fj.b r1 = p422fj.C12920b.PRIMARY
                    r8 = r1
                    goto L_0x000c
                L_0x000a:
                    r8 = r19
                L_0x000c:
                    r1 = r0 & 64
                    if (r1 == 0) goto L_0x0014
                    int r1 = p601sg.C17778c.f49635t
                    r9 = r1
                    goto L_0x0016
                L_0x0014:
                    r9 = r20
                L_0x0016:
                    r1 = r0 & 128(0x80, float:1.794E-43)
                    if (r1 == 0) goto L_0x001e
                    int r1 = p601sg.C17778c.f49637v
                    r10 = r1
                    goto L_0x0020
                L_0x001e:
                    r10 = r21
                L_0x0020:
                    r1 = r0 & 256(0x100, float:3.59E-43)
                    if (r1 == 0) goto L_0x0028
                    int r1 = p601sg.C17778c.f49635t
                    r11 = r1
                    goto L_0x002a
                L_0x0028:
                    r11 = r22
                L_0x002a:
                    r0 = r0 & 512(0x200, float:7.175E-43)
                    if (r0 == 0) goto L_0x0032
                    int r0 = p601sg.C17778c.f49637v
                    r12 = r0
                    goto L_0x0034
                L_0x0032:
                    r12 = r23
                L_0x0034:
                    r2 = r13
                    r3 = r14
                    r4 = r15
                    r5 = r16
                    r6 = r17
                    r7 = r18
                    r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.designsystem.components.textprogressbar.TextProgressBarView.ProgressModel.TransactionProgress.<init>(java.lang.String, java.lang.String, float, java.lang.String, java.lang.String, fj.b, int, int, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }

            /* renamed from: a */
            public final int mo36917a() {
                return this.f40448j;
            }

            /* renamed from: b */
            public final String mo36918b() {
                return this.f40445g;
            }

            /* renamed from: d */
            public final int mo36919d() {
                return this.f40449k;
            }

            public int describeContents() {
                return 0;
            }

            /* renamed from: e */
            public final String mo36921e() {
                return this.f40442d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TransactionProgress)) {
                    return false;
                }
                TransactionProgress transactionProgress = (TransactionProgress) obj;
                return C41536l.m120484d(this.f40442d, transactionProgress.f40442d) && C41536l.m120484d(this.f40443e, transactionProgress.f40443e) && Float.compare(this.f40444f, transactionProgress.f40444f) == 0 && C41536l.m120484d(this.f40445g, transactionProgress.f40445g) && C41536l.m120484d(this.f40446h, transactionProgress.f40446h) && this.f40447i == transactionProgress.f40447i && this.f40448j == transactionProgress.f40448j && this.f40449k == transactionProgress.f40449k && this.f40450l == transactionProgress.f40450l && this.f40451m == transactionProgress.f40451m;
            }

            /* renamed from: f */
            public final C12920b mo36923f() {
                return this.f40447i;
            }

            /* renamed from: g */
            public final float mo36924g() {
                return this.f40444f;
            }

            /* renamed from: h */
            public final int mo36925h() {
                return this.f40450l;
            }

            public int hashCode() {
                int hashCode = ((((((this.f40442d.hashCode() * 31) + this.f40443e.hashCode()) * 31) + Float.floatToIntBits(this.f40444f)) * 31) + this.f40445g.hashCode()) * 31;
                String str = this.f40446h;
                return ((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f40447i.hashCode()) * 31) + this.f40448j) * 31) + this.f40449k) * 31) + this.f40450l) * 31) + this.f40451m;
            }

            /* renamed from: i */
            public final String mo36927i() {
                return this.f40446h;
            }

            /* renamed from: j */
            public final int mo36928j() {
                return this.f40451m;
            }

            /* renamed from: k */
            public final String mo36929k() {
                return this.f40443e;
            }

            public String toString() {
                String str = this.f40442d;
                String str2 = this.f40443e;
                float f = this.f40444f;
                String str3 = this.f40445g;
                String str4 = this.f40446h;
                C12920b bVar = this.f40447i;
                int i = this.f40448j;
                int i2 = this.f40449k;
                int i3 = this.f40450l;
                int i4 = this.f40451m;
                return "TransactionProgress(leftUpperText=" + str + ", rightUpperText=" + str2 + ", progressPercentage=" + f + ", leftBottomText=" + str3 + ", rightBottomText=" + str4 + ", progressBarType=" + bVar + ", leftAmountTextColor=" + i + ", leftBottomTextColor=" + i2 + ", rightAmountTextColor=" + i3 + ", rightBottomTextColor=" + i4 + ")";
            }

            public void writeToParcel(Parcel parcel, int i) {
                C41536l.m120489i(parcel, "out");
                parcel.writeString(this.f40442d);
                parcel.writeString(this.f40443e);
                parcel.writeFloat(this.f40444f);
                parcel.writeString(this.f40445g);
                parcel.writeString(this.f40446h);
                parcel.writeString(this.f40447i.name());
                parcel.writeInt(this.f40448j);
                parcel.writeInt(this.f40449k);
                parcel.writeInt(this.f40450l);
                parcel.writeInt(this.f40451m);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public TransactionProgress(String str, String str2, float f, String str3, String str4, C12920b bVar, int i, int i2, int i3, int i4) {
                super((DefaultConstructorMarker) null);
                C41536l.m120489i(str, "leftUpperText");
                C41536l.m120489i(str2, "rightUpperText");
                C41536l.m120489i(str3, "leftBottomText");
                C41536l.m120489i(bVar, "progressBarType");
                this.f40442d = str;
                this.f40443e = str2;
                this.f40444f = f;
                this.f40445g = str3;
                this.f40446h = str4;
                this.f40447i = bVar;
                this.f40448j = i;
                this.f40449k = i2;
                this.f40450l = i3;
                this.f40451m = i4;
            }
        }
    }
}
