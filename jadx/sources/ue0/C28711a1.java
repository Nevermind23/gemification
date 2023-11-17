package ue0;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.github.mikephil.charting.charts.LineChart;
import ie0.C25187g;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.chips.Chip;
import p341ge.bog.designsystem.components.chips.ChipGroup;

/* renamed from: ue0.a1 */
public final class C28711a1 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f73118d;

    /* renamed from: e */
    public final LinearLayout f73119e;

    /* renamed from: f */
    public final LineChart f73120f;

    /* renamed from: g */
    public final FrameLayout f73121g;

    /* renamed from: h */
    public final Chip f73122h;

    /* renamed from: i */
    public final Chip f73123i;

    /* renamed from: j */
    public final Chip f73124j;

    /* renamed from: k */
    public final ChipGroup f73125k;

    /* renamed from: l */
    public final Chip f73126l;

    /* renamed from: m */
    public final Chip f73127m;

    /* renamed from: n */
    public final Chip f73128n;

    /* renamed from: o */
    public final Chip f73129o;

    /* renamed from: p */
    public final Chip f73130p;

    /* renamed from: q */
    public final Chip f73131q;

    private C28711a1(LinearLayout linearLayout, LinearLayout linearLayout2, LineChart lineChart, FrameLayout frameLayout, Chip chip, Chip chip2, Chip chip3, ChipGroup chipGroup, Chip chip4, Chip chip5, Chip chip6, Chip chip7, Chip chip8, Chip chip9) {
        this.f73118d = linearLayout;
        this.f73119e = linearLayout2;
        this.f73120f = lineChart;
        this.f73121g = frameLayout;
        this.f73122h = chip;
        this.f73123i = chip2;
        this.f73124j = chip3;
        this.f73125k = chipGroup;
        this.f73126l = chip4;
        this.f73127m = chip5;
        this.f73128n = chip6;
        this.f73129o = chip7;
        this.f73130p = chip8;
        this.f73131q = chip9;
    }

    /* renamed from: a */
    public static C28711a1 m87961a(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = C25187g.chartView;
        LineChart lineChart = (LineChart) C6202b.m24689a(view, i);
        if (lineChart != null) {
            i = C25187g.loaderView;
            FrameLayout frameLayout = (FrameLayout) C6202b.m24689a(view, i);
            if (frameLayout != null) {
                i = C25187g.range3MonthChip;
                Chip chip = (Chip) C6202b.m24689a(view, i);
                if (chip != null) {
                    i = C25187g.rangeAllHistoryChip;
                    Chip chip2 = (Chip) C6202b.m24689a(view, i);
                    if (chip2 != null) {
                        i = C25187g.rangeFiveYearChip;
                        Chip chip3 = (Chip) C6202b.m24689a(view, i);
                        if (chip3 != null) {
                            i = C25187g.rangeGroup;
                            ChipGroup chipGroup = (ChipGroup) C6202b.m24689a(view, i);
                            if (chipGroup != null) {
                                i = C25187g.rangeOneDayChip;
                                Chip chip4 = (Chip) C6202b.m24689a(view, i);
                                if (chip4 != null) {
                                    i = C25187g.rangeOneMonthChip;
                                    Chip chip5 = (Chip) C6202b.m24689a(view, i);
                                    if (chip5 != null) {
                                        i = C25187g.rangeOneWeekChip;
                                        Chip chip6 = (Chip) C6202b.m24689a(view, i);
                                        if (chip6 != null) {
                                            i = C25187g.rangeOneYearChip;
                                            Chip chip7 = (Chip) C6202b.m24689a(view, i);
                                            if (chip7 != null) {
                                                i = C25187g.rangeSixMonthChip;
                                                Chip chip8 = (Chip) C6202b.m24689a(view, i);
                                                if (chip8 != null) {
                                                    i = C25187g.rangeTwoYearChip;
                                                    Chip chip9 = (Chip) C6202b.m24689a(view, i);
                                                    if (chip9 != null) {
                                                        return new C28711a1(linearLayout, linearLayout, lineChart, frameLayout, chip, chip2, chip3, chipGroup, chip4, chip5, chip6, chip7, chip8, chip9);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f73118d;
    }
}
