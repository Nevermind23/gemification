package c10;

import android.widget.NumberPicker;
import kotlin.jvm.internal.C41548x;

/* renamed from: c10.f */
public final /* synthetic */ class C19449f implements NumberPicker.OnValueChangeListener {

    /* renamed from: a */
    public final /* synthetic */ NumberPicker f53673a;

    /* renamed from: b */
    public final /* synthetic */ NumberPicker f53674b;

    /* renamed from: c */
    public final /* synthetic */ int f53675c;

    /* renamed from: d */
    public final /* synthetic */ int f53676d;

    /* renamed from: e */
    public final /* synthetic */ C41548x f53677e;

    /* renamed from: f */
    public final /* synthetic */ C41548x f53678f;

    public /* synthetic */ C19449f(NumberPicker numberPicker, NumberPicker numberPicker2, int i, int i2, C41548x xVar, C41548x xVar2) {
        this.f53673a = numberPicker;
        this.f53674b = numberPicker2;
        this.f53675c = i;
        this.f53676d = i2;
        this.f53677e = xVar;
        this.f53678f = xVar2;
    }

    public final void onValueChange(NumberPicker numberPicker, int i, int i2) {
        C19452i.m64956E1(this.f53673a, this.f53674b, this.f53675c, this.f53676d, this.f53677e, this.f53678f, numberPicker, i, i2);
    }
}
