package p364bi;

import af1.C40303i;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.TextAppearanceSpan;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.C0767a;
import androidx.core.widget.C1314o;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.github.mikephil.charting.utils.Utils;
import he1.C41238w;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import p341ge.bog.designsystem.components.drilldown.DrilldownView;
import p341ge.bog.designsystem.components.drilldown.chart.DrilldownChart;
import p352ak.C9918g2;
import p378ci.C10446a;
import p393di.C12130a;
import p393di.C12131b;
import p561pi.C17365a;
import p561pi.C17367b;
import p601sg.C17777b;
import p601sg.C17779d;
import p601sg.C17786k;
import p615tg.C17961b;
import p642vh.C18355e0;
import p642vh.C18361h0;
import p642vh.C18368l;
import ue1.C43064a;

/* renamed from: bi.a */
public abstract class C10289a {

    /* renamed from: a */
    private final DrilldownChart f28525a;

    /* renamed from: b */
    private int f28526b;

    /* renamed from: c */
    private int f28527c;

    /* renamed from: d */
    private float f28528d;

    /* renamed from: e */
    private Integer f28529e;

    /* renamed from: f */
    private final C17367b f28530f;

    /* renamed from: bi.a$c */
    public static class C10296c extends C10289a {

        /* renamed from: j */
        static final /* synthetic */ C40303i[] f28548j = {C41520a0.m120439e(new C41539o(C10296c.class, "title", "getTitle()Ljava/lang/CharSequence;", 0))};

        /* renamed from: g */
        private final int f28549g;

        /* renamed from: h */
        private final C18361h0 f28550h = new C18361h0(C10297a.f28552d);

        /* renamed from: i */
        private C12131b f28551i;

        /* renamed from: bi.a$c$a */
        static final class C10297a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C10297a f28552d = new C10297a();

            C10297a() {
                super(0);
            }

            public final Object invoke() {
                return "'title' is not supported by PercentChart type";
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C10296c(p352ak.C9926h2 r9, int r10, int r11) {
            /*
                r8 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.C41536l.m120489i(r9, r0)
                ge.bog.designsystem.components.drilldown.chart.DrilldownChart r2 = r9.f27055e
                java.lang.String r9 = "binding.chart"
                kotlin.jvm.internal.C41536l.m120488h(r2, r9)
                int r4 = p601sg.C17779d.drilldown_small_size
                int r5 = p601sg.C17779d.drilldown_amount_border_size
                r7 = 0
                r1 = r8
                r3 = r4
                r6 = r10
                r1.<init>(r2, r3, r4, r5, r6, r7)
                r8.f28549g = r11
                vh.h0 r9 = new vh.h0
                bi.a$c$a r10 = p364bi.C10289a.C10296c.C10297a.f28552d
                r9.<init>(r10)
                r8.f28550h = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p364bi.C10289a.C10296c.<init>(ak.h2, int, int):void");
        }

        /* renamed from: m */
        private final C41238w m37532m() {
            C12131b c = mo26893c();
            if (c == null) {
                return null;
            }
            double d = Utils.DOUBLE_EPSILON;
            for (C12131b a : c.mo32336e()) {
                d += a.mo32332a().mo32328b();
            }
            int b = (int) ((d * ((double) 100)) / c.mo32332a().mo32328b());
            SpannableString spannableString = new SpannableString(b + "%");
            spannableString.setSpan(new TextAppearanceSpan(mo26892b(), this.f28549g), 0, spannableString.length(), 33);
            DrilldownChart a2 = mo26891a();
            a2.setCenterText(spannableString);
            a2.invalidate();
            return C41238w.f97225a;
        }

        /* renamed from: c */
        public C12131b mo26893c() {
            return this.f28551i;
        }

        /* renamed from: g */
        public CharSequence mo26897g() {
            return (CharSequence) this.f28550h.getValue(this, f28548j[0]);
        }

        /* renamed from: i */
        public void mo26899i(C12131b bVar) {
            this.f28551i = bVar;
            if (bVar != null) {
                mo26891a().mo35678b(bVar.mo32336e(), bVar.mo32332a().mo32328b());
                m37532m();
            }
        }

        /* renamed from: k */
        public void mo26901k(CharSequence charSequence) {
            this.f28550h.setValue(this, f28548j[0], charSequence);
        }
    }

    /* renamed from: bi.a$d */
    public static class C10298d extends C10289a {

        /* renamed from: j */
        static final /* synthetic */ C40303i[] f28553j;

        /* renamed from: g */
        private final C18355e0 f28554g;

        /* renamed from: h */
        private final C18355e0 f28555h;

        /* renamed from: i */
        private C12131b f28556i;

        static {
            Class<C10298d> cls = C10298d.class;
            f28553j = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "title", "getTitle()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "textText", "getTextText()Ljava/lang/CharSequence;", 0))};
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C10298d(p352ak.C9910f2 r16, int r17) {
            /*
                r15 = this;
                r7 = r15
                r8 = r16
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.C41536l.m120489i(r8, r0)
                ge.bog.designsystem.components.drilldown.chart.DrilldownChart r1 = r8.f26979f
                java.lang.String r0 = "binding.chart"
                kotlin.jvm.internal.C41536l.m120488h(r1, r0)
                int r3 = p601sg.C17779d.drilldown_small_size
                int r4 = p601sg.C17779d.drilldown_small_border_size
                r6 = 0
                r0 = r15
                r2 = r3
                r5 = r17
                r0.<init>(r1, r2, r3, r4, r5, r6)
                vh.e0 r0 = new vh.e0
                androidx.appcompat.widget.AppCompatTextView r10 = r8.f26980g
                java.lang.String r1 = "binding.title"
                kotlin.jvm.internal.C41536l.m120488h(r10, r1)
                r11 = 0
                r12 = 0
                r13 = 6
                r14 = 0
                r9 = r0
                r9.<init>(r10, r11, r12, r13, r14)
                r7.f28554g = r0
                vh.e0 r0 = new vh.e0
                androidx.appcompat.widget.AppCompatTextView r2 = r8.f26978e
                java.lang.String r1 = "binding.amount"
                kotlin.jvm.internal.C41536l.m120488h(r2, r1)
                r3 = 0
                r4 = 0
                r5 = 6
                r1 = r0
                r1.<init>(r2, r3, r4, r5, r6)
                r7.f28555h = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p364bi.C10289a.C10298d.<init>(ak.f2, int):void");
        }

        /* renamed from: m */
        private final void m37537m(CharSequence charSequence) {
            this.f28555h.setValue(this, f28553j[1], charSequence);
        }

        /* renamed from: c */
        public C12131b mo26893c() {
            return this.f28556i;
        }

        /* renamed from: g */
        public CharSequence mo26897g() {
            return this.f28554g.getValue(this, f28553j[0]);
        }

        /* renamed from: i */
        public void mo26899i(C12131b bVar) {
            this.f28556i = bVar;
            C12131b c = mo26893c();
            if (c != null) {
                mo26891a().mo35678b(c.mo32336e(), c.mo32332a().mo32328b());
                if (c.mo32338f() != null) {
                    mo26901k(c.mo32338f());
                }
                m37537m(C17365a.C17366a.m60762a(mo26894d(), String.valueOf(c.mo32332a().mo32328b()), (String) null, C17961b.f51154a.mo45631a(c.mo32332a().mo32327a()), 2, (Object) null));
            }
        }

        /* renamed from: k */
        public void mo26901k(CharSequence charSequence) {
            this.f28554g.setValue(this, f28553j[0], charSequence);
        }
    }

    public /* synthetic */ C10289a(DrilldownChart drilldownChart, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(drilldownChart, i, i2, i3, i4);
    }

    /* renamed from: l */
    private final void m37504l() {
        this.f28525a.setRotationEnabled(false);
        this.f28525a.setDrawRoundedSlices(true);
        this.f28525a.setDrawHoleEnabled(true);
        this.f28525a.setHighlightPerTapEnabled(false);
        this.f28525a.setTransparentCircleColor(-1);
        this.f28525a.setTransparentCircleAlpha(110);
        DrilldownChart drilldownChart = this.f28525a;
        drilldownChart.setRenderer(new C10446a(drilldownChart, drilldownChart.getAnimator(), this.f28525a.getViewPortHandler()));
        this.f28525a.setHoleRadius(this.f28528d);
        this.f28525a.setHoleColor(C18368l.m62755d(mo26892b(), C17777b.color_invert_background_popup));
        Integer num = this.f28529e;
        if (num != null) {
            this.f28525a.setBorderBackgroundColor(num.intValue());
        }
        this.f28525a.setUsePercentValues(true);
        this.f28525a.setDrawCenterText(true);
        this.f28525a.setDrawEntryLabels(false);
        this.f28525a.getLegend().setEnabled(false);
        this.f28525a.getDescription().setEnabled(false);
        this.f28525a.invalidate();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final DrilldownChart mo26891a() {
        return this.f28525a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Context mo26892b() {
        Context context = this.f28525a.getContext();
        C41536l.m120488h(context, "chart.context");
        return context;
    }

    /* renamed from: c */
    public abstract C12131b mo26893c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C17367b mo26894d() {
        return this.f28530f;
    }

    /* renamed from: e */
    public final int mo26895e() {
        return this.f28526b;
    }

    /* renamed from: f */
    public final DrilldownView.C13322a mo26896f() {
        return null;
    }

    /* renamed from: g */
    public abstract CharSequence mo26897g();

    /* renamed from: h */
    public final int mo26898h() {
        return this.f28527c;
    }

    /* renamed from: i */
    public abstract void mo26899i(C12131b bVar);

    /* renamed from: j */
    public final void mo26900j(DrilldownView.C13322a aVar) {
    }

    /* renamed from: k */
    public abstract void mo26901k(CharSequence charSequence);

    private C10289a(DrilldownChart drilldownChart, int i, int i2, int i3, int i4) {
        this.f28525a = drilldownChart;
        this.f28526b = -1;
        this.f28527c = -1;
        this.f28528d = 50.0f;
        C17367b bVar = new C17367b((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
        bVar.mo44810m("###,##0.00");
        this.f28530f = bVar;
        if (i2 != 0) {
            this.f28526b = mo26892b().getResources().getDimensionPixelSize(i2);
        }
        if (i != 0) {
            this.f28527c = mo26892b().getResources().getDimensionPixelSize(i);
        }
        if (i4 != 0) {
            this.f28529e = Integer.valueOf(C0767a.m2893c(mo26892b(), i4));
        }
        if (i3 != 0) {
            this.f28528d = 100.0f - ((float) ((mo26892b().getResources().getDimensionPixelSize(i3) * 100) / (Math.min(this.f28526b, this.f28527c) / 2)));
        }
        m37504l();
    }

    /* renamed from: bi.a$a */
    public static class C10290a extends C10289a {

        /* renamed from: l */
        static final /* synthetic */ C40303i[] f28531l;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public final C9918g2 f28532g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public final int f28533h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public final int f28534i;

        /* renamed from: j */
        private final C18355e0 f28535j;

        /* renamed from: k */
        private final C41555e f28536k;

        /* renamed from: bi.a$a$a */
        public static final class C10291a extends C41553c {

            /* renamed from: a */
            final /* synthetic */ C10290a f28537a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C10291a(Object obj, C10290a aVar) {
                super(obj);
                this.f28537a = aVar;
            }

            /* access modifiers changed from: protected */
            public void afterChange(C40303i iVar, Object obj, Object obj2) {
                C41536l.m120489i(iVar, "property");
                C12131b bVar = (C12131b) obj2;
                C12131b bVar2 = (C12131b) obj;
                if (bVar != null) {
                    this.f28537a.mo26891a().mo35678b(bVar.mo32336e(), bVar.mo32332a().mo32328b());
                    String f = bVar.mo32338f();
                    if (f != null) {
                        this.f28537a.mo26901k(f);
                    }
                    String c = bVar.mo32334c();
                    if (c != null) {
                        this.f28537a.f28532g.f27020e.setText(c);
                    }
                    C1314o.m4575q(this.f28537a.f28532g.f27022g, this.f28537a.f28533h);
                    C1314o.m4575q(this.f28537a.f28532g.f27020e, this.f28537a.f28534i);
                }
            }
        }

        static {
            Class<C10290a> cls = C10290a.class;
            f28531l = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "title", "getTitle()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "data", "getData()Lge/bog/designsystem/components/drilldown/model/DrilldownData;", 0))};
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C10290a(C9918g2 g2Var, int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this(g2Var, (i5 & 2) != 0 ? 0 : i, (i5 & 4) != 0 ? C17779d.drilldown_normal_border_size : i2, (i5 & 8) != 0 ? C17786k.TextH4InvertComponents200Left : i3, (i5 & 16) != 0 ? C17786k.TextH3InvertComponents400Left : i4);
        }

        /* renamed from: c */
        public C12131b mo26893c() {
            return (C12131b) this.f28536k.getValue(this, f28531l[1]);
        }

        /* renamed from: g */
        public CharSequence mo26897g() {
            return this.f28535j.getValue(this, f28531l[0]);
        }

        /* renamed from: i */
        public void mo26899i(C12131b bVar) {
            this.f28536k.setValue(this, f28531l[1], bVar);
        }

        /* renamed from: k */
        public void mo26901k(CharSequence charSequence) {
            this.f28535j.setValue(this, f28531l[0], charSequence);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C10290a(p352ak.C9918g2 r8, int r9, int r10, int r11, int r12) {
            /*
                r7 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.C41536l.m120489i(r8, r0)
                ge.bog.designsystem.components.drilldown.chart.DrilldownChart r1 = r8.f27021f
                java.lang.String r0 = "binding.chart"
                kotlin.jvm.internal.C41536l.m120488h(r1, r0)
                int r3 = p601sg.C17779d.drilldown_normal_size
                r6 = 0
                r0 = r7
                r2 = r3
                r4 = r10
                r5 = r9
                r0.<init>(r1, r2, r3, r4, r5, r6)
                r7.f28532g = r8
                r7.f28533h = r11
                r7.f28534i = r12
                vh.e0 r6 = new vh.e0
                androidx.appcompat.widget.AppCompatTextView r1 = r8.f27022g
                java.lang.String r0 = "binding.title"
                kotlin.jvm.internal.C41536l.m120488h(r1, r0)
                r2 = 0
                r3 = 0
                r4 = 6
                r5 = 0
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                r7.f28535j = r6
                kotlin.properties.a r0 = kotlin.properties.C41551a.f97718a
                bi.a$a$a r0 = new bi.a$a$a
                r1 = 0
                r0.<init>(r1, r7)
                r7.f28536k = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p364bi.C10289a.C10290a.<init>(ak.g2, int, int, int, int):void");
        }
    }

    /* renamed from: bi.a$b */
    public static class C10292b extends C10289a {

        /* renamed from: m */
        static final /* synthetic */ C40303i[] f28538m;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public final C9918g2 f28539g;

        /* renamed from: h */
        private final int f28540h;

        /* renamed from: i */
        private final int f28541i;

        /* renamed from: j */
        private final C18355e0 f28542j;

        /* renamed from: k */
        private final C41555e f28543k;

        /* renamed from: l */
        private final C41555e f28544l;

        /* renamed from: bi.a$b$a */
        public static final class C10293a implements OnChartValueSelectedListener {

            /* renamed from: a */
            final /* synthetic */ C10292b f28545a;

            C10293a(C10292b bVar) {
                this.f28545a = bVar;
            }

            public void onNothingSelected() {
                C10292b.m37527q(this.f28545a, (C12131b) null, 1, (Object) null);
            }

            public void onValueSelected(Entry entry, Highlight highlight) {
                List e;
                Object obj;
                C12131b c = this.f28545a.mo26893c();
                if (c != null && (e = c.mo32336e()) != null) {
                    Iterator it = e.iterator();
                    while (true) {
                        obj = null;
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        String d = ((C12131b) next).mo32335d();
                        if (entry != null) {
                            obj = entry.getData();
                        }
                        if (C41536l.m120484d(d, obj)) {
                            obj = next;
                            break;
                        }
                    }
                    C12131b bVar = (C12131b) obj;
                    if (bVar != null) {
                        C10292b bVar2 = this.f28545a;
                        bVar2.mo26896f();
                        if (!bVar.mo32336e().isEmpty()) {
                            bVar2.mo26899i(bVar);
                        } else {
                            bVar2.m37526p(bVar);
                        }
                    }
                }
            }
        }

        /* renamed from: bi.a$b$b */
        public static final class C10294b extends C41553c {

            /* renamed from: a */
            final /* synthetic */ C10292b f28546a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C10294b(Object obj, C10292b bVar) {
                super(obj);
                this.f28546a = bVar;
            }

            /* access modifiers changed from: protected */
            public void afterChange(C40303i iVar, Object obj, Object obj2) {
                String str;
                C41536l.m120489i(iVar, "property");
                C12130a aVar = (C12130a) obj2;
                C12130a aVar2 = (C12130a) obj;
                AppCompatTextView appCompatTextView = this.f28546a.f28539g.f27020e;
                C17367b d = this.f28546a.mo26894d();
                String str2 = null;
                if (aVar != null) {
                    str = Double.valueOf(aVar.mo32328b()).toString();
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                C17961b bVar = C17961b.f51154a;
                if (aVar != null) {
                    str2 = aVar.mo32327a();
                }
                appCompatTextView.setText(C17365a.C17366a.m60762a(d, str, (String) null, bVar.mo45631a(str2), 2, (Object) null));
            }
        }

        /* renamed from: bi.a$b$c */
        public static final class C10295c extends C41553c {

            /* renamed from: a */
            final /* synthetic */ C10292b f28547a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C10295c(Object obj, C10292b bVar) {
                super(obj);
                this.f28547a = bVar;
            }

            /* access modifiers changed from: protected */
            public void afterChange(C40303i iVar, Object obj, Object obj2) {
                C41536l.m120489i(iVar, "property");
                C12131b bVar = (C12131b) obj2;
                C12131b bVar2 = (C12131b) obj;
                C10292b.m37527q(this.f28547a, (C12131b) null, 1, (Object) null);
                if (bVar != null) {
                    this.f28547a.mo26891a().mo35678b(bVar.mo32336e(), bVar.mo32332a().mo32328b());
                }
            }
        }

        static {
            Class<C10292b> cls = C10292b.class;
            f28538m = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "title", "getTitle()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "amount", "getAmount()Lge/bog/designsystem/components/drilldown/model/DrilldownAmount;", 0)), C41520a0.m120439e(new C41539o(cls, "data", "getData()Lge/bog/designsystem/components/drilldown/model/DrilldownData;", 0))};
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C10292b(C9918g2 g2Var, int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this(g2Var, (i5 & 2) != 0 ? 0 : i, (i5 & 4) != 0 ? C17779d.drilldown_normal_border_size : i2, (i5 & 8) != 0 ? C17786k.TextH4InvertComponents200Left : i3, (i5 & 16) != 0 ? C17786k.TextH4InvertComponents200Left : i4);
        }

        /* renamed from: o */
        private final void m37525o(C12130a aVar) {
            this.f28543k.setValue(this, f28538m[1], aVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: p */
        public final void m37526p(C12131b bVar) {
            if (bVar != null) {
                mo26901k(bVar.mo32338f());
                m37525o(bVar.mo32332a());
            }
        }

        /* renamed from: q */
        static /* synthetic */ void m37527q(C10292b bVar, C12131b bVar2, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    bVar2 = bVar.mo26893c();
                }
                bVar.m37526p(bVar2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setTitleAndAmount");
        }

        /* renamed from: c */
        public C12131b mo26893c() {
            return (C12131b) this.f28544l.getValue(this, f28538m[2]);
        }

        /* renamed from: g */
        public CharSequence mo26897g() {
            return this.f28542j.getValue(this, f28538m[0]);
        }

        /* renamed from: i */
        public void mo26899i(C12131b bVar) {
            this.f28544l.setValue(this, f28538m[2], bVar);
        }

        /* renamed from: k */
        public void mo26901k(CharSequence charSequence) {
            this.f28542j.setValue(this, f28538m[0], charSequence);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C10292b(p352ak.C9918g2 r18, int r19, int r20, int r21, int r22) {
            /*
                r17 = this;
                r7 = r17
                r8 = r18
                r9 = r21
                r10 = r22
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.C41536l.m120489i(r8, r0)
                ge.bog.designsystem.components.drilldown.chart.DrilldownChart r1 = r8.f27021f
                java.lang.String r0 = "binding.chart"
                kotlin.jvm.internal.C41536l.m120488h(r1, r0)
                int r3 = p601sg.C17779d.drilldown_normal_size
                r6 = 0
                r0 = r17
                r2 = r3
                r4 = r20
                r5 = r19
                r0.<init>(r1, r2, r3, r4, r5, r6)
                r7.f28539g = r8
                r7.f28540h = r9
                r7.f28541i = r10
                vh.e0 r0 = new vh.e0
                androidx.appcompat.widget.AppCompatTextView r12 = r8.f27022g
                java.lang.String r1 = "binding.title"
                kotlin.jvm.internal.C41536l.m120488h(r12, r1)
                r13 = 0
                r14 = 0
                r15 = 6
                r16 = 0
                r11 = r0
                r11.<init>(r12, r13, r14, r15, r16)
                r7.f28542j = r0
                kotlin.properties.a r0 = kotlin.properties.C41551a.f97718a
                bi.a$b$b r0 = new bi.a$b$b
                r1 = 0
                r0.<init>(r1, r7)
                r7.f28543k = r0
                bi.a$b$c r0 = new bi.a$b$c
                r0.<init>(r1, r7)
                r7.f28544l = r0
                android.content.Context r0 = r17.mo26892b()
                android.content.res.Resources r0 = r0.getResources()
                int r1 = p601sg.C17779d.drilldown_normal_selected_border_size
                int r0 = r0.getDimensionPixelSize(r1)
                android.content.Context r1 = r17.mo26892b()
                android.content.res.Resources r1 = r1.getResources()
                r2 = r20
                int r1 = r1.getDimensionPixelSize(r2)
                ge.bog.designsystem.components.drilldown.chart.DrilldownChart r2 = r17.mo26891a()
                int r0 = r0 - r1
                int r0 = r0 / 2
                int r0 = p642vh.C18368l.m62764m(r0)
                float r0 = (float) r0
                r2.setSelectionShift(r0)
                ge.bog.designsystem.components.drilldown.chart.DrilldownChart r0 = r17.mo26891a()
                r1 = 1
                r0.setHighlightPerTapEnabled(r1)
                androidx.appcompat.widget.AppCompatTextView r0 = r8.f27022g
                androidx.core.widget.C1314o.m4575q(r0, r9)
                androidx.appcompat.widget.AppCompatTextView r0 = r8.f27020e
                androidx.core.widget.C1314o.m4575q(r0, r10)
                ge.bog.designsystem.components.drilldown.chart.DrilldownChart r0 = r17.mo26891a()
                bi.a$b$a r1 = new bi.a$b$a
                r1.<init>(r7)
                r0.setOnChartValueSelectedListener(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p364bi.C10289a.C10292b.<init>(ak.g2, int, int, int, int):void");
        }
    }
}
