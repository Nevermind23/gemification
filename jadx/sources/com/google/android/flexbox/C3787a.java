package com.google.android.flexbox;

import android.view.View;
import java.util.List;

/* renamed from: com.google.android.flexbox.a */
interface C3787a {
    /* renamed from: b */
    void mo11458b(View view, int i, int i2, C3788b bVar);

    /* renamed from: c */
    int mo11459c(int i, int i2, int i3);

    /* renamed from: d */
    View mo11461d(int i);

    /* renamed from: e */
    int mo11462e(int i, int i2, int i3);

    /* renamed from: f */
    int mo11463f(View view);

    /* renamed from: g */
    void mo11464g(C3788b bVar);

    int getAlignContent();

    int getAlignItems();

    int getFlexDirection();

    int getFlexItemCount();

    List getFlexLinesInternal();

    int getFlexWrap();

    int getLargestMainSize();

    int getMaxLine();

    int getPaddingBottom();

    int getPaddingEnd();

    int getPaddingLeft();

    int getPaddingRight();

    int getPaddingStart();

    int getPaddingTop();

    int getSumOfCrossSize();

    /* renamed from: h */
    View mo11482h(int i);

    /* renamed from: i */
    void mo11483i(int i, View view);

    /* renamed from: j */
    int mo11484j(View view, int i, int i2);

    /* renamed from: k */
    boolean mo11485k();

    void setFlexLines(List list);
}
