package c10;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import android.widget.TextView;
import androidx.appcompat.app.C0214c;
import androidx.fragment.app.C1483c;
import androidx.fragment.app.C1505h;
import he1.C41224m;
import he1.C41232r;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41548x;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p366bk.C10315d;
import p366bk.C10322k;
import p366bk.C10324m;
import ue1.C43079p;

/* renamed from: c10.i */
public final class C19452i extends C1483c {

    /* renamed from: y */
    public static final C19453a f53683y = new C19453a((DefaultConstructorMarker) null);

    /* renamed from: t */
    private long f53684t = -1;

    /* renamed from: u */
    private long f53685u = -1;

    /* renamed from: v */
    private long f53686v = -1;

    /* renamed from: w */
    private String f53687w = "";

    /* renamed from: x */
    private C43079p f53688x;

    /* renamed from: c10.i$a */
    public static final class C19453a {
        private C19453a() {
        }

        public /* synthetic */ C19453a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C19452i mo47669a(long j, long j2, long j3, String str) {
            C41536l.m120489i(str, "title");
            C19452i iVar = new C19452i();
            Bundle bundle = new Bundle();
            bundle.putLong("MAX_DATE", j3);
            bundle.putLong("MIN_DATE", j2);
            bundle.putLong("CURRENT_DATE", j);
            bundle.putString("TITLE", str);
            iVar.setArguments(bundle);
            return iVar;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: E1 */
    public static final void m64956E1(NumberPicker numberPicker, NumberPicker numberPicker2, int i, int i2, C41548x xVar, C41548x xVar2, NumberPicker numberPicker3, int i3, int i4) {
        int i5;
        C41536l.m120489i(xVar, "$maxYear");
        C41536l.m120489i(xVar2, "$maxMonth");
        int value = numberPicker.getValue();
        int value2 = numberPicker2.getValue();
        if (value == i && value2 < i2) {
            numberPicker2.setValue(i2);
        } else if (value == xVar.f97715d && value2 > (i5 = xVar2.f97715d)) {
            numberPicker2.setValue(i5);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F1 */
    public static final void m64957F1(NumberPicker numberPicker, NumberPicker numberPicker2, C19452i iVar, View view) {
        C41536l.m120489i(iVar, "this$0");
        int value = numberPicker.getValue();
        int value2 = numberPicker2.getValue();
        C43079p pVar = iVar.f53688x;
        if (pVar != null) {
            pVar.invoke(Integer.valueOf(value2), Integer.valueOf(value));
        }
        iVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: G1 */
    public static final void m64958G1(C19452i iVar, View view) {
        C41536l.m120489i(iVar, "this$0");
        iVar.mo4577k1();
    }

    /* renamed from: H1 */
    public final void mo47668H1(C43079p pVar) {
        this.f53688x = pVar;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        C41536l.m120486f(arguments);
        this.f53684t = arguments.getLong("MIN_DATE");
        Bundle arguments2 = getArguments();
        C41536l.m120486f(arguments2);
        this.f53685u = arguments2.getLong("MAX_DATE");
        Bundle arguments3 = getArguments();
        C41536l.m120486f(arguments3);
        this.f53686v = arguments3.getLong("CURRENT_DATE");
        Bundle arguments4 = getArguments();
        C41536l.m120486f(arguments4);
        String string = arguments4.getString("TITLE", "");
        C41536l.m120488h(string, "arguments!!.getString(TITLE, \"\")");
        this.f53687w = string;
    }

    /* renamed from: q1 */
    public Dialog mo710q1(Bundle bundle) {
        C1505h activity = getActivity();
        C41536l.m120486f(activity);
        View inflate = activity.getLayoutInflater().inflate(C10324m.dialog_month_picker, (ViewGroup) null);
        NumberPicker numberPicker = (NumberPicker) inflate.findViewById(C10322k.month_picker);
        NumberPicker numberPicker2 = (NumberPicker) inflate.findViewById(C10322k.year_picker);
        C41232r b = C19446d.m64950b(this.f53684t);
        int intValue = ((Number) b.mo95688a()).intValue();
        int intValue2 = ((Number) b.mo95689b()).intValue();
        C41224m mVar = new C41224m(Integer.MAX_VALUE, 11);
        C41548x xVar = new C41548x();
        xVar.f97715d = ((Number) mVar.mo95675a()).intValue();
        C41548x xVar2 = new C41548x();
        xVar2.f97715d = ((Number) mVar.mo95676b()).intValue();
        long j = this.f53685u;
        if (j > 0) {
            C41232r b2 = C19446d.m64950b(j);
            int intValue3 = ((Number) b2.mo95688a()).intValue();
            int intValue4 = ((Number) b2.mo95689b()).intValue();
            xVar.f97715d = intValue3;
            xVar2.f97715d = intValue4;
        }
        C41232r b3 = C19446d.m64950b(this.f53686v);
        int intValue5 = ((Number) b3.mo95688a()).intValue();
        int intValue6 = ((Number) b3.mo95689b()).intValue();
        numberPicker2.setMinValue(intValue);
        numberPicker2.setMaxValue(xVar.f97715d);
        numberPicker2.setValue(intValue5);
        numberPicker2.setWrapSelectorWheel(false);
        numberPicker.setDisplayedValues(getResources().getStringArray(C10315d.f28604a));
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(11);
        numberPicker.setValue(intValue6);
        C19449f fVar = new C19449f(numberPicker2, numberPicker, intValue, intValue2, xVar, xVar2);
        numberPicker.setOnValueChangedListener(fVar);
        numberPicker2.setOnValueChangedListener(fVar);
        inflate.findViewById(C10322k.f28904vn).setOnClickListener(new C19450g(numberPicker, numberPicker2, this));
        inflate.findViewById(C10322k.f28722E5).setOnClickListener(new C19451h(this));
        ((TextView) inflate.findViewById(C10322k.dialog_title)).setText(this.f53687w);
        C1505h activity2 = getActivity();
        C41536l.m120486f(activity2);
        C0214c create = new C0214c.C0215a(activity2).setView(inflate).create();
        C41536l.m120488h(create, "Builder(activity!!)\n    …                .create()");
        return create;
    }
}
