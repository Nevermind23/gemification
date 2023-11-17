package p692zc;

import android.graphics.Typeface;
import android.widget.TextView;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: zc.c */
public final class C18999c {

    /* renamed from: i */
    public static final C19000a f53042i = new C19000a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private Typeface f53043a;

    /* renamed from: b */
    private Typeface f53044b;

    /* renamed from: c */
    private Typeface f53045c;

    /* renamed from: d */
    private Typeface f53046d;

    /* renamed from: e */
    private int f53047e = 16;

    /* renamed from: f */
    private int f53048f = 18;

    /* renamed from: g */
    private int f53049g = 13;

    /* renamed from: h */
    private int f53050h = 12;

    /* renamed from: zc.c$a */
    public static final class C19000a {
        private C19000a() {
        }

        public /* synthetic */ C19000a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo47073a() {
        return this.f53050h;
    }

    /* renamed from: b */
    public final int mo47074b() {
        return this.f53048f;
    }

    /* renamed from: c */
    public final int mo47075c() {
        return this.f53049g;
    }

    /* renamed from: d */
    public final int mo47076d() {
        return this.f53047e;
    }

    /* renamed from: e */
    public final void mo47077e(Typeface typeface) {
        this.f53046d = typeface;
    }

    /* renamed from: f */
    public final void mo47078f(int i) {
        this.f53050h = i;
    }

    /* renamed from: g */
    public final void mo47079g(TextView textView, int i) {
        C41536l.m120489i(textView, "textView");
        if (i == -1) {
            textView.setTypeface(this.f53043a);
            textView.setTextSize((float) this.f53047e);
        } else if (i == 0) {
            textView.setTypeface(this.f53044b);
            textView.setTextSize((float) this.f53048f);
        } else if (i == 1) {
            textView.setTypeface(this.f53045c);
            textView.setTextSize((float) this.f53049g);
        } else if (i == 2) {
            textView.setTypeface(this.f53046d);
            textView.setTextSize((float) this.f53050h);
        }
    }

    /* renamed from: h */
    public final void mo47080h(Typeface typeface) {
        this.f53044b = typeface;
    }

    /* renamed from: i */
    public final void mo47081i(int i) {
        this.f53048f = i;
    }

    /* renamed from: j */
    public final void mo47082j(Typeface typeface) {
        this.f53045c = typeface;
    }

    /* renamed from: k */
    public final void mo47083k(int i) {
        this.f53049g = i;
    }

    /* renamed from: l */
    public final void mo47084l(Typeface typeface) {
        this.f53043a = typeface;
    }

    /* renamed from: m */
    public final void mo47085m(int i) {
        this.f53047e = i;
    }
}
