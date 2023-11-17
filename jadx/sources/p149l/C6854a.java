package p149l;

import android.os.Bundle;

/* renamed from: l.a */
public final class C6854a {

    /* renamed from: a */
    public final Integer f20527a;

    /* renamed from: b */
    public final Integer f20528b;

    /* renamed from: c */
    public final Integer f20529c;

    /* renamed from: d */
    public final Integer f20530d;

    /* renamed from: l.a$a */
    public static final class C6855a {

        /* renamed from: a */
        private Integer f20531a;

        /* renamed from: b */
        private Integer f20532b;

        /* renamed from: c */
        private Integer f20533c;

        /* renamed from: d */
        private Integer f20534d;

        /* renamed from: a */
        public C6854a mo20928a() {
            return new C6854a(this.f20531a, this.f20532b, this.f20533c, this.f20534d);
        }

        /* renamed from: b */
        public C6855a mo20929b(int i) {
            this.f20531a = Integer.valueOf(i | -16777216);
            return this;
        }
    }

    C6854a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f20527a = num;
        this.f20528b = num2;
        this.f20529c = num3;
        this.f20530d = num4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Bundle mo20927a() {
        Bundle bundle = new Bundle();
        Integer num = this.f20527a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f20528b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f20529c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f20530d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
