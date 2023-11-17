package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: com.google.android.material.internal.g */
final class C5079g {

    /* renamed from: n */
    static final int f16231n = 1;

    /* renamed from: a */
    private CharSequence f16232a;

    /* renamed from: b */
    private final TextPaint f16233b;

    /* renamed from: c */
    private final int f16234c;

    /* renamed from: d */
    private int f16235d = 0;

    /* renamed from: e */
    private int f16236e;

    /* renamed from: f */
    private Layout.Alignment f16237f;

    /* renamed from: g */
    private int f16238g;

    /* renamed from: h */
    private float f16239h;

    /* renamed from: i */
    private float f16240i;

    /* renamed from: j */
    private int f16241j;

    /* renamed from: k */
    private boolean f16242k;

    /* renamed from: l */
    private boolean f16243l;

    /* renamed from: m */
    private TextUtils.TruncateAt f16244m;

    /* renamed from: com.google.android.material.internal.g$a */
    static class C5080a extends Exception {
    }

    private C5079g(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f16232a = charSequence;
        this.f16233b = textPaint;
        this.f16234c = i;
        this.f16236e = charSequence.length();
        this.f16237f = Layout.Alignment.ALIGN_NORMAL;
        this.f16238g = Integer.MAX_VALUE;
        this.f16239h = Utils.FLOAT_EPSILON;
        this.f16240i = 1.0f;
        this.f16241j = f16231n;
        this.f16242k = true;
        this.f16244m = null;
    }

    /* renamed from: b */
    public static C5079g m19863b(CharSequence charSequence, TextPaint textPaint, int i) {
        return new C5079g(charSequence, textPaint, i);
    }

    /* renamed from: a */
    public StaticLayout mo16509a() {
        TextDirectionHeuristic textDirectionHeuristic;
        if (this.f16232a == null) {
            this.f16232a = "";
        }
        int max = Math.max(0, this.f16234c);
        CharSequence charSequence = this.f16232a;
        if (this.f16238g == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f16233b, (float) max, this.f16244m);
        }
        int min = Math.min(charSequence.length(), this.f16236e);
        this.f16236e = min;
        if (this.f16243l && this.f16238g == 1) {
            this.f16237f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, this.f16235d, min, this.f16233b, max);
        obtain.setAlignment(this.f16237f);
        obtain.setIncludePad(this.f16242k);
        if (this.f16243l) {
            textDirectionHeuristic = TextDirectionHeuristics.RTL;
        } else {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        }
        obtain.setTextDirection(textDirectionHeuristic);
        TextUtils.TruncateAt truncateAt = this.f16244m;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f16238g);
        float f = this.f16239h;
        if (!(f == Utils.FLOAT_EPSILON && this.f16240i == 1.0f)) {
            obtain.setLineSpacing(f, this.f16240i);
        }
        if (this.f16238g > 1) {
            obtain.setHyphenationFrequency(this.f16241j);
        }
        return obtain.build();
    }

    /* renamed from: c */
    public C5079g mo16510c(Layout.Alignment alignment) {
        this.f16237f = alignment;
        return this;
    }

    /* renamed from: d */
    public C5079g mo16511d(TextUtils.TruncateAt truncateAt) {
        this.f16244m = truncateAt;
        return this;
    }

    /* renamed from: e */
    public C5079g mo16512e(int i) {
        this.f16241j = i;
        return this;
    }

    /* renamed from: f */
    public C5079g mo16513f(boolean z) {
        this.f16242k = z;
        return this;
    }

    /* renamed from: g */
    public C5079g mo16514g(boolean z) {
        this.f16243l = z;
        return this;
    }

    /* renamed from: h */
    public C5079g mo16515h(float f, float f2) {
        this.f16239h = f;
        this.f16240i = f2;
        return this;
    }

    /* renamed from: i */
    public C5079g mo16516i(int i) {
        this.f16238g = i;
        return this;
    }

    /* renamed from: j */
    public C5079g mo16517j(C5081h hVar) {
        return this;
    }
}
