package t51;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import androidx.core.content.C0767a;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1533o;
import he1.C41233s;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o51.C37644a;
import p341ge.bog.designsystem.components.chips.Chip;
import p341ge.bog.designsystem.components.chips.ChipGroup;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.mobilebank.statements.presentation.landing.C34723a;
import p366bk.C10318g;
import r51.C38286b;

/* renamed from: t51.f */
public final class C38660f extends C34723a {

    /* renamed from: R */
    public static final C38661a f92525R = new C38661a((DefaultConstructorMarker) null);

    /* renamed from: K */
    private C37644a f92526K;

    /* renamed from: L */
    private C38661a.C38662a f92527L = C38661a.C38662a.NONE;

    /* renamed from: M */
    private CalendarView.OnDateChangeListener f92528M = new C38658e(this);

    /* renamed from: N */
    private long f92529N;

    /* renamed from: O */
    private Integer f92530O = 1;

    /* renamed from: P */
    private long f92531P = C38286b.f91793a.mo91840c();

    /* renamed from: Q */
    private boolean f92532Q = true;

    /* renamed from: t51.f$a */
    public static final class C38661a {

        /* renamed from: t51.f$a$a */
        private enum C38662a {
            ONE_M(1),
            THREE_M(3),
            SIX_M(6),
            ONE_Y(12),
            NONE(-1);
            

            /* renamed from: d */
            private final int f92539d;

            private C38662a(int i) {
                this.f92539d = i;
            }

            /* renamed from: b */
            public final int mo92308b() {
                return this.f92539d;
            }
        }

        private C38661a() {
        }

        public /* synthetic */ C38661a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final String m113322b(long j) {
            String format = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault()).format(new Date(j));
            C41536l.m120488h(format, "SimpleDateFormat(\"dd.MM.…etDefault()).format(date)");
            return format;
        }

        /* renamed from: c */
        public final C38660f mo92307c(Long l, Long l2, Integer num) {
            C38660f fVar = new C38660f();
            fVar.setArguments(C0908e.m3336b(C41233s.m119492a("PARAM_KEY_START_DATE", l), C41233s.m119492a("PARAM_KEY_END_DATE", l2), C41233s.m119492a("PARAM_KEY_MONTHS", num)));
            return fVar;
        }
    }

    /* renamed from: t51.f$b */
    public /* synthetic */ class C38663b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f92540a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                t51.f$a$a[] r0 = t51.C38660f.C38661a.C38662a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                t51.f$a$a r1 = t51.C38660f.C38661a.C38662a.ONE_M     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                t51.f$a$a r1 = t51.C38660f.C38661a.C38662a.THREE_M     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                t51.f$a$a r1 = t51.C38660f.C38661a.C38662a.SIX_M     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                t51.f$a$a r1 = t51.C38660f.C38661a.C38662a.ONE_Y     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f92540a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: t51.C38660f.C38663b.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public static final void m113305j2(C38660f fVar, CalendarView calendarView, int i, int i2, int i3) {
        C41536l.m120489i(fVar, "this$0");
        C41536l.m120489i(calendarView, "<anonymous parameter 0>");
        Calendar b = C38286b.f91793a.mo91839b();
        b.set(i, i2, i3);
        long timeInMillis = b.getTimeInMillis();
        if (fVar.f92532Q) {
            fVar.m113314s2(timeInMillis);
        } else {
            fVar.m113311p2(timeInMillis);
        }
        fVar.f92530O = null;
        fVar.m113310o2();
    }

    /* renamed from: k2 */
    private final void m113306k2(Integer num) {
        int chipCount = m113308m2().f90411k.getChipCount();
        for (int i = 0; i < chipCount; i++) {
            if (num == null || num.intValue() != i) {
                m113308m2().f90411k.mo35185q(i, false);
            }
        }
    }

    /* renamed from: l2 */
    static /* synthetic */ void m113307l2(C38660f fVar, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        fVar.m113306k2(num);
    }

    /* renamed from: m2 */
    private final C37644a m113308m2() {
        C37644a aVar = this.f92526K;
        C41536l.m120486f(aVar);
        return aVar;
    }

    /* renamed from: n2 */
    private final long m113309n2(C38661a.C38662a aVar) {
        int i = C38663b.f92540a[aVar.ordinal()];
        if (i == 1) {
            return C38286b.f91793a.mo91843f(C38661a.C38662a.ONE_M.mo92308b());
        }
        if (i == 2) {
            return C38286b.f91793a.mo91843f(C38661a.C38662a.THREE_M.mo92308b());
        }
        if (i == 3) {
            return C38286b.f91793a.mo91843f(C38661a.C38662a.SIX_M.mo92308b());
        }
        if (i != 4) {
            return 0;
        }
        return C38286b.f91793a.mo91843f(C38661a.C38662a.ONE_Y.mo92308b());
    }

    /* renamed from: o2 */
    private final void m113310o2() {
        Integer num = null;
        if (this.f92531P == C38286b.f91793a.mo91840c()) {
            long j = this.f92529N;
            C38661a.C38662a aVar = C38661a.C38662a.ONE_M;
            if (j != m113309n2(aVar)) {
                aVar = C38661a.C38662a.THREE_M;
                if (j != m113309n2(aVar)) {
                    aVar = C38661a.C38662a.SIX_M;
                    if (j != m113309n2(aVar)) {
                        aVar = C38661a.C38662a.ONE_Y;
                        if (j != m113309n2(aVar)) {
                            aVar = C38661a.C38662a.NONE;
                        }
                    }
                }
            }
            if (aVar != C38661a.C38662a.NONE) {
                Integer valueOf = Integer.valueOf(aVar.ordinal());
                ChipGroup chipGroup = m113308m2().f90411k;
                C41536l.m120488h(chipGroup, "binding.chips");
                ChipGroup.m49760n(chipGroup, aVar.ordinal(), false, 2, (Object) null);
                num = valueOf;
            }
            m113306k2(num);
            return;
        }
        m113307l2(this, (Integer) null, 1, (Object) null);
    }

    /* renamed from: p2 */
    private final void m113311p2(long j) {
        this.f92531P = j;
        m113308m2().f90413m.setText(f92525R.m113322b(j));
        if (!this.f92532Q && m113308m2().f90406f.getDate() != j) {
            m113308m2().f90406f.setDate(j);
        }
    }

    /* renamed from: q2 */
    private final void m113312q2(boolean z) {
        this.f92532Q = z;
        m113313r2();
        if (z) {
            m113308m2().f90406f.setMinDate(C38286b.f91793a.mo91844g());
            m113308m2().f90406f.setMaxDate(this.f92531P);
            return;
        }
        m113308m2().f90406f.setMinDate(this.f92529N);
        m113308m2().f90406f.setMaxDate(C38286b.f91793a.mo91841d());
    }

    /* renamed from: r2 */
    private final void m113313r2() {
        long j;
        LayerView layerView = m113308m2().f90414n;
        C41536l.m120488h(layerView, "binding.start");
        LayerView layerView2 = m113308m2().f90412l;
        C41536l.m120488h(layerView2, "binding.end");
        if (!this.f92532Q) {
            layerView = m113308m2().f90412l;
            C41536l.m120488h(layerView, "binding.end");
            layerView2 = m113308m2().f90414n;
            C41536l.m120488h(layerView2, "binding.start");
        }
        layerView.setBackground(new ColorDrawable(C0767a.m2893c(requireContext(), C10318g.f28629P0)));
        layerView2.setBackground(new ColorDrawable(C0767a.m2893c(requireContext(), C10318g.f28631S0)));
        CalendarView calendarView = m113308m2().f90406f;
        if (this.f92532Q) {
            j = this.f92529N;
        } else {
            j = this.f92531P;
        }
        calendarView.setDate(j);
    }

    /* renamed from: s2 */
    private final void m113314s2(long j) {
        this.f92529N = j;
        m113308m2().f90415o.setText(f92525R.m113322b(j));
        if (this.f92532Q && m113308m2().f90406f.getDate() != j) {
            m113308m2().f90406f.setDate(j);
        }
    }

    /* renamed from: t2 */
    private final void m113315t2() {
        long j;
        long j2;
        Integer num;
        C37644a m2 = m113308m2();
        m113312q2(true);
        CalendarView calendarView = m2.f90406f;
        C38286b bVar = C38286b.f91793a;
        calendarView.setMinDate(bVar.mo91844g());
        m2.f90406f.setMaxDate(bVar.mo91841d());
        Bundle arguments = getArguments();
        if (arguments != null) {
            j = arguments.getLong("PARAM_KEY_START_DATE");
        } else {
            j = this.f92529N;
        }
        m113314s2(j);
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            j2 = arguments2.getLong("PARAM_KEY_END_DATE");
        } else {
            j2 = this.f92531P;
        }
        m113311p2(j2);
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            num = Integer.valueOf(arguments3.getInt("PARAM_KEY_MONTHS"));
        } else {
            num = 1;
        }
        this.f92530O = num;
        if (num != null && num.intValue() == 1) {
            ChipGroup chipGroup = m2.f90411k;
            C41536l.m120488h(chipGroup, "chips");
            ChipGroup.m49760n(chipGroup, 0, false, 2, (Object) null);
        } else if (num != null && num.intValue() == 3) {
            ChipGroup chipGroup2 = m2.f90411k;
            C41536l.m120488h(chipGroup2, "chips");
            ChipGroup.m49760n(chipGroup2, 1, false, 2, (Object) null);
        } else if (num != null && num.intValue() == 6) {
            ChipGroup chipGroup3 = m2.f90411k;
            C41536l.m120488h(chipGroup3, "chips");
            ChipGroup.m49760n(chipGroup3, 2, false, 2, (Object) null);
        } else if (num != null && num.intValue() == 12) {
            ChipGroup chipGroup4 = m2.f90411k;
            C41536l.m120488h(chipGroup4, "chips");
            ChipGroup.m49760n(chipGroup4, 3, false, 2, (Object) null);
        }
        m2.f90406f.setDate(this.f92529N);
        m2.f90406f.setOnDateChangeListener(this.f92528M);
        m2.f90411k.setOnChipActivatedChangedListener(new C38650a(this));
        m2.f90414n.setOnClickListener(new C38652b(this));
        m2.f90412l.setOnClickListener(new C38654c(this));
        m2.f90405e.setOnClickListener(new C38656d(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: u2 */
    public static final void m113316u2(C38660f fVar, Chip chip, int i) {
        C41536l.m120489i(fVar, "this$0");
        C41536l.m120489i(chip, "ch");
        C38661a.C38662a aVar = (C38661a.C38662a) C41333m.m119774A(C38661a.C38662a.values(), i);
        if (aVar == null) {
            aVar = C38661a.C38662a.NONE;
        }
        fVar.f92527L = aVar;
        if (aVar != C38661a.C38662a.NONE) {
            fVar.m113311p2(C38286b.f91793a.mo91840c());
            fVar.m113314s2(fVar.m113309n2(fVar.f92527L));
            fVar.f92530O = Integer.valueOf(fVar.f92527L.mo92308b());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v2 */
    public static final void m113317v2(C38660f fVar, View view) {
        C41536l.m120489i(fVar, "this$0");
        fVar.m113312q2(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: w2 */
    public static final void m113318w2(C38660f fVar, View view) {
        C41536l.m120489i(fVar, "this$0");
        fVar.m113312q2(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: x2 */
    public static final void m113319x2(C38660f fVar, View view) {
        C41536l.m120489i(fVar, "this$0");
        C1533o.m5445b(fVar, "REQUEST_DATES", C0908e.m3336b(C41233s.m119492a("PARAM_KEY_START_DATE", Long.valueOf(fVar.f92529N)), C41233s.m119492a("PARAM_KEY_END_DATE", Long.valueOf(fVar.f92531P)), C41233s.m119492a("PARAM_KEY_MONTHS", fVar.f92530O)));
        fVar.mo4577k1();
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f92526K = C37644a.m110669d(layoutInflater, viewGroup, true);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f92526K = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m113315t2();
    }
}
