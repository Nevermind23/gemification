package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Collection;

public interface DateSelector<S> extends Parcelable {
    /* renamed from: B1 */
    void mo16169B1(long j);

    /* renamed from: K0 */
    String mo16170K0(Context context);

    /* renamed from: M0 */
    Collection mo16171M0();

    /* renamed from: O0 */
    void mo16172O0(Object obj);

    /* renamed from: a1 */
    View mo16173a1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, C5037q qVar);

    /* renamed from: e0 */
    int mo16174e0();

    /* renamed from: k1 */
    boolean mo16175k1();

    /* renamed from: o0 */
    int mo16176o0(Context context);

    /* renamed from: p1 */
    Collection mo16177p1();

    /* renamed from: s1 */
    Object mo16178s1();
}
