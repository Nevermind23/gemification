package o51;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.LinearLayout;
import n51.C37356b;
import n51.C37357c;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.chips.Chip;
import p341ge.bog.designsystem.components.chips.ChipGroup;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;

/* renamed from: o51.a */
public final class C37644a implements C6201a {

    /* renamed from: d */
    private final LinearLayout f90404d;

    /* renamed from: e */
    public final Button f90405e;

    /* renamed from: f */
    public final CalendarView f90406f;

    /* renamed from: g */
    public final Chip f90407g;

    /* renamed from: h */
    public final Chip f90408h;

    /* renamed from: i */
    public final Chip f90409i;

    /* renamed from: j */
    public final Chip f90410j;

    /* renamed from: k */
    public final ChipGroup f90411k;

    /* renamed from: l */
    public final LayerView f90412l;

    /* renamed from: m */
    public final TwoLineTextItem f90413m;

    /* renamed from: n */
    public final LayerView f90414n;

    /* renamed from: o */
    public final TwoLineTextItem f90415o;

    private C37644a(LinearLayout linearLayout, Button button, CalendarView calendarView, Chip chip, Chip chip2, Chip chip3, Chip chip4, ChipGroup chipGroup, LayerView layerView, TwoLineTextItem twoLineTextItem, LayerView layerView2, TwoLineTextItem twoLineTextItem2) {
        this.f90404d = linearLayout;
        this.f90405e = button;
        this.f90406f = calendarView;
        this.f90407g = chip;
        this.f90408h = chip2;
        this.f90409i = chip3;
        this.f90410j = chip4;
        this.f90411k = chipGroup;
        this.f90412l = layerView;
        this.f90413m = twoLineTextItem;
        this.f90414n = layerView2;
        this.f90415o = twoLineTextItem2;
    }

    /* renamed from: a */
    public static C37644a m110668a(View view) {
        int i = C37356b.f89823e;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C37356b.calendar;
            CalendarView calendarView = (CalendarView) C6202b.m24689a(view, i);
            if (calendarView != null) {
                i = C37356b.chip_1m;
                Chip chip = (Chip) C6202b.m24689a(view, i);
                if (chip != null) {
                    i = C37356b.chip_1y;
                    Chip chip2 = (Chip) C6202b.m24689a(view, i);
                    if (chip2 != null) {
                        i = C37356b.chip_3m;
                        Chip chip3 = (Chip) C6202b.m24689a(view, i);
                        if (chip3 != null) {
                            i = C37356b.chip_6m;
                            Chip chip4 = (Chip) C6202b.m24689a(view, i);
                            if (chip4 != null) {
                                i = C37356b.f89840y;
                                ChipGroup chipGroup = (ChipGroup) C6202b.m24689a(view, i);
                                if (chipGroup != null) {
                                    i = C37356b.f89818M;
                                    LayerView layerView = (LayerView) C6202b.m24689a(view, i);
                                    if (layerView != null) {
                                        i = C37356b.end_text;
                                        TwoLineTextItem twoLineTextItem = (TwoLineTextItem) C6202b.m24689a(view, i);
                                        if (twoLineTextItem != null) {
                                            i = C37356b.f89839w0;
                                            LayerView layerView2 = (LayerView) C6202b.m24689a(view, i);
                                            if (layerView2 != null) {
                                                i = C37356b.start_text;
                                                TwoLineTextItem twoLineTextItem2 = (TwoLineTextItem) C6202b.m24689a(view, i);
                                                if (twoLineTextItem2 != null) {
                                                    return new C37644a((LinearLayout) view, button, calendarView, chip, chip2, chip3, chip4, chipGroup, layerView, twoLineTextItem, layerView2, twoLineTextItem2);
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

    /* renamed from: d */
    public static C37644a m110669d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37357c.action_sheet_date_range, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m110668a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f90404d;
    }
}
