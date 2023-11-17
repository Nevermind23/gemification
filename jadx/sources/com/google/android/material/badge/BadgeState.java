package com.google.android.material.badge;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.material.internal.C5088l;
import java.util.Locale;
import p009a8.C0074d;
import p009a8.C0079i;
import p009a8.C0080j;
import p009a8.C0081k;
import p009a8.C0082l;
import p106h8.C6477a;
import p184n8.C7343c;
import p184n8.C7344d;

public final class BadgeState {

    /* renamed from: a */
    private final State f15516a;

    /* renamed from: b */
    private final State f15517b;

    /* renamed from: c */
    final float f15518c;

    /* renamed from: d */
    final float f15519d;

    /* renamed from: e */
    final float f15520e;

    BadgeState(Context context, int i, int i2, int i3, State state) {
        int i4;
        CharSequence charSequence;
        int i5;
        int i6;
        boolean z;
        int i7;
        int i8;
        int i9;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Locale locale;
        State state2 = new State();
        this.f15517b = state2;
        state = state == null ? new State() : state;
        if (i != 0) {
            int unused = state.f15521d = i;
        }
        TypedArray b = m18744b(context, state.f15521d, i2, i3);
        Resources resources = context.getResources();
        this.f15518c = (float) b.getDimensionPixelSize(C0082l.f449H, resources.getDimensionPixelSize(C0074d.f180K));
        this.f15520e = (float) b.getDimensionPixelSize(C0082l.f469J, resources.getDimensionPixelSize(C0074d.f179J));
        this.f15519d = (float) b.getDimensionPixelSize(C0082l.f479K, resources.getDimensionPixelSize(C0074d.f182M));
        if (state.f15524g == -2) {
            i4 = C11051p3.f31759c;
        } else {
            i4 = state.f15524g;
        }
        int unused2 = state2.f15524g = i4;
        if (state.f15528k == null) {
            charSequence = context.getString(C0080j.f336i);
        } else {
            charSequence = state.f15528k;
        }
        CharSequence unused3 = state2.f15528k = charSequence;
        if (state.f15529l == 0) {
            i5 = C0079i.f314a;
        } else {
            i5 = state.f15529l;
        }
        int unused4 = state2.f15529l = i5;
        if (state.f15530m == 0) {
            i6 = C0080j.f338n;
        } else {
            i6 = state.f15530m;
        }
        int unused5 = state2.f15530m = i6;
        int i17 = 0;
        if (state.f15532o == null || state.f15532o.booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        Boolean unused6 = state2.f15532o = Boolean.valueOf(z);
        if (state.f15526i == -2) {
            i7 = b.getInt(C0082l.f509N, 4);
        } else {
            i7 = state.f15526i;
        }
        int unused7 = state2.f15526i = i7;
        if (state.f15525h != -2) {
            int unused8 = state2.f15525h = state.f15525h;
        } else {
            int i18 = C0082l.f519O;
            if (b.hasValue(i18)) {
                int unused9 = state2.f15525h = b.getInt(i18, 0);
            } else {
                int unused10 = state2.f15525h = -1;
            }
        }
        if (state.f15522e == null) {
            i8 = m18745v(context, b, C0082l.f429F);
        } else {
            i8 = state.f15522e.intValue();
        }
        Integer unused11 = state2.f15522e = Integer.valueOf(i8);
        if (state.f15523f != null) {
            Integer unused12 = state2.f15523f = state.f15523f;
        } else {
            int i19 = C0082l.f459I;
            if (b.hasValue(i19)) {
                Integer unused13 = state2.f15523f = Integer.valueOf(m18745v(context, b, i19));
            } else {
                Integer unused14 = state2.f15523f = Integer.valueOf(new C7344d(context, C0081k.f358f).mo21720i().getDefaultColor());
            }
        }
        if (state.f15531n == null) {
            i9 = b.getInt(C0082l.f439G, 8388661);
        } else {
            i9 = state.f15531n.intValue();
        }
        Integer unused15 = state2.f15531n = Integer.valueOf(i9);
        if (state.f15533p == null) {
            i12 = b.getDimensionPixelOffset(C0082l.f489L, 0);
        } else {
            i12 = state.f15533p.intValue();
        }
        Integer unused16 = state2.f15533p = Integer.valueOf(i12);
        if (state.f15534q == null) {
            i13 = b.getDimensionPixelOffset(C0082l.f529P, 0);
        } else {
            i13 = state.f15534q.intValue();
        }
        Integer unused17 = state2.f15534q = Integer.valueOf(i13);
        if (state.f15535r == null) {
            i14 = b.getDimensionPixelOffset(C0082l.f499M, state2.f15533p.intValue());
        } else {
            i14 = state.f15535r.intValue();
        }
        Integer unused18 = state2.f15535r = Integer.valueOf(i14);
        if (state.f15536s == null) {
            i15 = b.getDimensionPixelOffset(C0082l.f539Q, state2.f15534q.intValue());
        } else {
            i15 = state.f15536s.intValue();
        }
        Integer unused19 = state2.f15536s = Integer.valueOf(i15);
        if (state.f15537t == null) {
            i16 = 0;
        } else {
            i16 = state.f15537t.intValue();
        }
        Integer unused20 = state2.f15537t = Integer.valueOf(i16);
        Integer unused21 = state2.f15538u = Integer.valueOf(state.f15538u != null ? state.f15538u.intValue() : i17);
        b.recycle();
        if (state.f15527j == null) {
            if (Build.VERSION.SDK_INT >= 24) {
                locale = Locale.getDefault(Locale.Category.FORMAT);
            } else {
                locale = Locale.getDefault();
            }
            Locale unused22 = state2.f15527j = locale;
        } else {
            Locale unused23 = state2.f15527j = state.f15527j;
        }
        this.f15516a = state;
    }

    /* renamed from: b */
    private TypedArray m18744b(Context context, int i, int i2, int i3) {
        AttributeSet attributeSet;
        int i4;
        int i5;
        if (i != 0) {
            AttributeSet e = C6477a.m25601e(context, i, "badge");
            i4 = e.getStyleAttribute();
            attributeSet = e;
        } else {
            attributeSet = null;
            i4 = 0;
        }
        if (i4 == 0) {
            i5 = i3;
        } else {
            i5 = i4;
        }
        return C5088l.m19898i(context, attributeSet, C0082l.f419E, i2, i5, new int[0]);
    }

    /* renamed from: v */
    private static int m18745v(Context context, TypedArray typedArray, int i) {
        return C7343c.m28003a(context, typedArray, i).getDefaultColor();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo15474A(int i) {
        int unused = this.f15516a.f15525h = i;
        int unused2 = this.f15517b.f15525h = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo15475B(int i) {
        Integer unused = this.f15516a.f15536s = Integer.valueOf(i);
        Integer unused2 = this.f15517b.f15536s = Integer.valueOf(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo15476C(int i) {
        Integer unused = this.f15516a.f15534q = Integer.valueOf(i);
        Integer unused2 = this.f15517b.f15534q = Integer.valueOf(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo15477D(boolean z) {
        Boolean unused = this.f15516a.f15532o = Boolean.valueOf(z);
        Boolean unused2 = this.f15517b.f15532o = Boolean.valueOf(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo15478a() {
        mo15474A(-1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo15479c() {
        return this.f15517b.f15537t.intValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo15480d() {
        return this.f15517b.f15538u.intValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo15481e() {
        return this.f15517b.f15524g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo15482f() {
        return this.f15517b.f15522e.intValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo15483g() {
        return this.f15517b.f15531n.intValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo15484h() {
        return this.f15517b.f15523f.intValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo15485i() {
        return this.f15517b.f15530m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public CharSequence mo15486j() {
        return this.f15517b.f15528k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo15487k() {
        return this.f15517b.f15529l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public int mo15488l() {
        return this.f15517b.f15535r.intValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public int mo15489m() {
        return this.f15517b.f15533p.intValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public int mo15490n() {
        return this.f15517b.f15526i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public int mo15491o() {
        return this.f15517b.f15525h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public Locale mo15492p() {
        return this.f15517b.f15527j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public State mo15493q() {
        return this.f15516a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public int mo15494r() {
        return this.f15517b.f15536s.intValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public int mo15495s() {
        return this.f15517b.f15534q.intValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean mo15496t() {
        return this.f15517b.f15525h != -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public boolean mo15497u() {
        return this.f15517b.f15532o.booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo15498w(int i) {
        int unused = this.f15516a.f15524g = i;
        int unused2 = this.f15517b.f15524g = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo15499x(int i) {
        Integer unused = this.f15516a.f15522e = Integer.valueOf(i);
        Integer unused2 = this.f15517b.f15522e = Integer.valueOf(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo15500y(int i) {
        Integer unused = this.f15516a.f15523f = Integer.valueOf(i);
        Integer unused2 = this.f15517b.f15523f = Integer.valueOf(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo15501z(int i) {
        int unused = this.f15516a.f15526i = i;
        int unused2 = this.f15517b.f15526i = i;
    }

    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new C4932a();
        /* access modifiers changed from: private */

        /* renamed from: d */
        public int f15521d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public Integer f15522e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public Integer f15523f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f15524g = C11051p3.f31759c;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public int f15525h = -2;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public int f15526i = -2;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public Locale f15527j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public CharSequence f15528k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public int f15529l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public int f15530m;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public Integer f15531n;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public Boolean f15532o = Boolean.TRUE;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public Integer f15533p;
        /* access modifiers changed from: private */

        /* renamed from: q */
        public Integer f15534q;
        /* access modifiers changed from: private */

        /* renamed from: r */
        public Integer f15535r;
        /* access modifiers changed from: private */

        /* renamed from: s */
        public Integer f15536s;
        /* access modifiers changed from: private */

        /* renamed from: t */
        public Integer f15537t;
        /* access modifiers changed from: private */

        /* renamed from: u */
        public Integer f15538u;

        /* renamed from: com.google.android.material.badge.BadgeState$State$a */
        class C4932a implements Parcelable.Creator {
            C4932a() {
            }

            /* renamed from: a */
            public State createFromParcel(Parcel parcel) {
                return new State(parcel);
            }

            /* renamed from: b */
            public State[] newArray(int i) {
                return new State[i];
            }
        }

        public State() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            String str;
            parcel.writeInt(this.f15521d);
            parcel.writeSerializable(this.f15522e);
            parcel.writeSerializable(this.f15523f);
            parcel.writeInt(this.f15524g);
            parcel.writeInt(this.f15525h);
            parcel.writeInt(this.f15526i);
            CharSequence charSequence = this.f15528k;
            if (charSequence == null) {
                str = null;
            } else {
                str = charSequence.toString();
            }
            parcel.writeString(str);
            parcel.writeInt(this.f15529l);
            parcel.writeSerializable(this.f15531n);
            parcel.writeSerializable(this.f15533p);
            parcel.writeSerializable(this.f15534q);
            parcel.writeSerializable(this.f15535r);
            parcel.writeSerializable(this.f15536s);
            parcel.writeSerializable(this.f15537t);
            parcel.writeSerializable(this.f15538u);
            parcel.writeSerializable(this.f15532o);
            parcel.writeSerializable(this.f15527j);
        }

        State(Parcel parcel) {
            this.f15521d = parcel.readInt();
            this.f15522e = (Integer) parcel.readSerializable();
            this.f15523f = (Integer) parcel.readSerializable();
            this.f15524g = parcel.readInt();
            this.f15525h = parcel.readInt();
            this.f15526i = parcel.readInt();
            this.f15528k = parcel.readString();
            this.f15529l = parcel.readInt();
            this.f15531n = (Integer) parcel.readSerializable();
            this.f15533p = (Integer) parcel.readSerializable();
            this.f15534q = (Integer) parcel.readSerializable();
            this.f15535r = (Integer) parcel.readSerializable();
            this.f15536s = (Integer) parcel.readSerializable();
            this.f15537t = (Integer) parcel.readSerializable();
            this.f15538u = (Integer) parcel.readSerializable();
            this.f15532o = (Boolean) parcel.readSerializable();
            this.f15527j = (Locale) parcel.readSerializable();
        }
    }
}
