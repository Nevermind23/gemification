package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import androidx.core.content.res.C0820l;
import java.util.List;

public class Preference implements Comparable<Preference> {

    /* renamed from: A */
    private boolean f4731A;

    /* renamed from: B */
    private int f4732B;

    /* renamed from: C */
    private int f4733C;

    /* renamed from: D */
    private List f4734D;

    /* renamed from: E */
    private C1666b f4735E;

    /* renamed from: F */
    private final View.OnClickListener f4736F;

    /* renamed from: d */
    private final Context f4737d;

    /* renamed from: e */
    private int f4738e;

    /* renamed from: f */
    private int f4739f;

    /* renamed from: g */
    private CharSequence f4740g;

    /* renamed from: h */
    private CharSequence f4741h;

    /* renamed from: i */
    private int f4742i;

    /* renamed from: j */
    private String f4743j;

    /* renamed from: k */
    private Intent f4744k;

    /* renamed from: l */
    private String f4745l;

    /* renamed from: m */
    private boolean f4746m;

    /* renamed from: n */
    private boolean f4747n;

    /* renamed from: o */
    private boolean f4748o;

    /* renamed from: p */
    private String f4749p;

    /* renamed from: q */
    private Object f4750q;

    /* renamed from: r */
    private boolean f4751r;

    /* renamed from: s */
    private boolean f4752s;

    /* renamed from: t */
    private boolean f4753t;

    /* renamed from: u */
    private boolean f4754u;

    /* renamed from: v */
    private boolean f4755v;

    /* renamed from: w */
    private boolean f4756w;

    /* renamed from: x */
    private boolean f4757x;

    /* renamed from: y */
    private boolean f4758y;

    /* renamed from: z */
    private boolean f4759z;

    public static class BaseSavedState extends AbsSavedState {
        public static final Parcelable.Creator<BaseSavedState> CREATOR = new C1664a();

        /* renamed from: androidx.preference.Preference$BaseSavedState$a */
        class C1664a implements Parcelable.Creator {
            C1664a() {
            }

            /* renamed from: a */
            public BaseSavedState createFromParcel(Parcel parcel) {
                return new BaseSavedState(parcel);
            }

            /* renamed from: b */
            public BaseSavedState[] newArray(int i) {
                return new BaseSavedState[i];
            }
        }

        public BaseSavedState(Parcel parcel) {
            super(parcel);
        }
    }

    /* renamed from: androidx.preference.Preference$a */
    class C1665a implements View.OnClickListener {
        C1665a() {
        }

        public void onClick(View view) {
            Preference.this.mo5013D(view);
        }
    }

    /* renamed from: androidx.preference.Preference$b */
    public interface C1666b {
        /* renamed from: a */
        CharSequence mo5028a(Preference preference);
    }

    public Preference(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f4738e = Integer.MAX_VALUE;
        this.f4739f = 0;
        this.f4746m = true;
        this.f4747n = true;
        this.f4748o = true;
        this.f4751r = true;
        this.f4752s = true;
        this.f4753t = true;
        this.f4754u = true;
        this.f4755v = true;
        this.f4757x = true;
        this.f4731A = true;
        int i3 = C1679e.preference;
        this.f4732B = i3;
        this.f4736F = new C1665a();
        this.f4737d = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1681g.f4819I, i, i2);
        this.f4742i = C0820l.m3071n(obtainStyledAttributes, C1681g.f4873g0, C1681g.f4821J, 0);
        this.f4743j = C0820l.m3072o(obtainStyledAttributes, C1681g.f4879j0, C1681g.f4833P);
        this.f4740g = C0820l.m3073p(obtainStyledAttributes, C1681g.f4895r0, C1681g.f4829N);
        this.f4741h = C0820l.m3073p(obtainStyledAttributes, C1681g.f4893q0, C1681g.f4835Q);
        this.f4738e = C0820l.m3061d(obtainStyledAttributes, C1681g.f4883l0, C1681g.f4837R, Integer.MAX_VALUE);
        this.f4745l = C0820l.m3072o(obtainStyledAttributes, C1681g.f4871f0, C1681g.f4847W);
        this.f4732B = C0820l.m3071n(obtainStyledAttributes, C1681g.f4881k0, C1681g.f4827M, i3);
        this.f4733C = C0820l.m3071n(obtainStyledAttributes, C1681g.f4897s0, C1681g.f4839S, 0);
        this.f4746m = C0820l.m3059b(obtainStyledAttributes, C1681g.f4868e0, C1681g.f4825L, true);
        this.f4747n = C0820l.m3059b(obtainStyledAttributes, C1681g.f4887n0, C1681g.f4831O, true);
        this.f4748o = C0820l.m3059b(obtainStyledAttributes, C1681g.f4885m0, C1681g.f4823K, true);
        this.f4749p = C0820l.m3072o(obtainStyledAttributes, C1681g.f4862c0, C1681g.f4841T);
        int i4 = C1681g.f4853Z;
        this.f4754u = C0820l.m3059b(obtainStyledAttributes, i4, i4, this.f4747n);
        int i5 = C1681g.f4856a0;
        this.f4755v = C0820l.m3059b(obtainStyledAttributes, i5, i5, this.f4747n);
        int i6 = C1681g.f4859b0;
        if (obtainStyledAttributes.hasValue(i6)) {
            this.f4750q = mo5020A(obtainStyledAttributes, i6);
        } else {
            int i7 = C1681g.f4843U;
            if (obtainStyledAttributes.hasValue(i7)) {
                this.f4750q = mo5020A(obtainStyledAttributes, i7);
            }
        }
        this.f4731A = C0820l.m3059b(obtainStyledAttributes, C1681g.f4889o0, C1681g.f4845V, true);
        int i8 = C1681g.f4891p0;
        boolean hasValue = obtainStyledAttributes.hasValue(i8);
        this.f4756w = hasValue;
        if (hasValue) {
            this.f4757x = C0820l.m3059b(obtainStyledAttributes, i8, C1681g.f4849X, true);
        }
        this.f4758y = C0820l.m3059b(obtainStyledAttributes, C1681g.f4875h0, C1681g.f4851Y, false);
        int i9 = C1681g.f4877i0;
        this.f4753t = C0820l.m3059b(obtainStyledAttributes, i9, i9, true);
        int i12 = C1681g.f4865d0;
        this.f4759z = C0820l.m3059b(obtainStyledAttributes, i12, i12, false);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public Object mo5020A(TypedArray typedArray, int i) {
        return null;
    }

    /* renamed from: B */
    public void mo5048B(Preference preference, boolean z) {
        if (this.f4752s == z) {
            this.f4752s = !z;
            mo5073x(mo5021I());
            mo5017w();
        }
    }

    /* renamed from: C */
    public void mo5049C() {
        if (mo5071u() && mo5072v()) {
            mo5015y();
            mo5066o();
            if (this.f4744k != null) {
                mo5057c().startActivity(this.f4744k);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo5013D(View view) {
        mo5049C();
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public boolean mo5050E(boolean z) {
        if (!mo5054J()) {
            return false;
        }
        if (z == mo5062h(!z)) {
            return true;
        }
        mo5065n();
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public boolean mo5051F(int i) {
        if (!mo5054J()) {
            return false;
        }
        if (i == mo5063j(~i)) {
            return true;
        }
        mo5065n();
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public boolean mo5052G(String str) {
        if (!mo5054J()) {
            return false;
        }
        if (TextUtils.equals(str, mo5064l((String) null))) {
            return true;
        }
        mo5065n();
        throw null;
    }

    /* renamed from: H */
    public final void mo5053H(C1666b bVar) {
        this.f4735E = bVar;
        mo5017w();
    }

    /* renamed from: I */
    public boolean mo5021I() {
        return !mo5071u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public boolean mo5054J() {
        return false;
    }

    /* renamed from: a */
    public boolean mo5055a(Object obj) {
        return true;
    }

    /* renamed from: b */
    public int compareTo(Preference preference) {
        int i = this.f4738e;
        int i2 = preference.f4738e;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.f4740g;
        CharSequence charSequence2 = preference.f4740g;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.f4740g.toString());
    }

    /* renamed from: c */
    public Context mo5057c() {
        return this.f4737d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public StringBuilder mo5059e() {
        StringBuilder sb = new StringBuilder();
        CharSequence s = mo5068s();
        if (!TextUtils.isEmpty(s)) {
            sb.append(s);
            sb.append(' ');
        }
        CharSequence q = mo5036q();
        if (!TextUtils.isEmpty(q)) {
            sb.append(q);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb;
    }

    /* renamed from: f */
    public String mo5060f() {
        return this.f4745l;
    }

    /* renamed from: g */
    public Intent mo5061g() {
        return this.f4744k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo5062h(boolean z) {
        if (!mo5054J()) {
            return z;
        }
        mo5065n();
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int mo5063j(int i) {
        if (!mo5054J()) {
            return i;
        }
        mo5065n();
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public String mo5064l(String str) {
        if (!mo5054J()) {
            return str;
        }
        mo5065n();
        throw null;
    }

    /* renamed from: n */
    public C1675a mo5065n() {
        return null;
    }

    /* renamed from: o */
    public C1676b mo5066o() {
        return null;
    }

    /* renamed from: q */
    public CharSequence mo5036q() {
        if (mo5067r() != null) {
            return mo5067r().mo5028a(this);
        }
        return this.f4741h;
    }

    /* renamed from: r */
    public final C1666b mo5067r() {
        return this.f4735E;
    }

    /* renamed from: s */
    public CharSequence mo5068s() {
        return this.f4740g;
    }

    /* renamed from: t */
    public boolean mo5069t() {
        return !TextUtils.isEmpty(this.f4743j);
    }

    public String toString() {
        return mo5059e().toString();
    }

    /* renamed from: u */
    public boolean mo5071u() {
        return this.f4746m && this.f4751r && this.f4752s;
    }

    /* renamed from: v */
    public boolean mo5072v() {
        return this.f4747n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo5017w() {
    }

    /* renamed from: x */
    public void mo5073x(boolean z) {
        List list = this.f4734D;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((Preference) list.get(i)).mo5074z(this, z);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo5015y() {
    }

    /* renamed from: z */
    public void mo5074z(Preference preference, boolean z) {
        if (this.f4751r == z) {
            this.f4751r = !z;
            mo5073x(mo5021I());
            mo5017w();
        }
    }

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0820l.m3058a(context, C1677c.preferenceStyle, 16842894));
    }
}
